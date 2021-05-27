package us.fikirm.sp2021


    import android.support.annotation.NonNull
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.ImageView
    import android.widget.TextView
    import androidx.recyclerview.widget.RecyclerView
    import com.squareup.picasso.Picasso

internal class MoviesAdapter(private val movies: Array<Array<String>>, private val listener: OnItemClickLister): RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

        // Provide a direct reference to each of the views within a data item
        // Used to cache the views within the item layout for fast access
        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
            // Your holder should contain and initialize a member variable
            // for any view that will be set as you render a row


            val title: TextView = itemView.findViewById(R.id.title)
            val year: TextView = itemView.findViewById(R.id.year)
            var director: TextView = itemView.findViewById(R.id.Director)
            val MovieImage: ImageView = itemView.findViewById(R.id.movie_image)
            val description: TextView = itemView.findViewById(R.id.description)

            init {
                itemView.setOnClickListener(this)
                val pos: Int = adapterPosition
                showMovie(pos)

            }

            override fun onClick(v: View?) {
                var bindingAdapterPosition = 0
                val position = bindingAdapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    listener.displayDetails(position)
                }
            }
        }

    private fun showMovie(pos: Int) {

    }


    interface OnItemClickLister {
            fun displayDetails(position: Int)
        }


    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesAdapter.ViewHolder {
            val context = parent.context
            val inflater = LayoutInflater.from(context)
            // Inflate the custom layout
            val contactView = inflater.inflate(R.layout.text_row_item, parent, false)
            // Return a new holder instance
            return ViewHolder(contactView)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            // Get the data model based on position

            val movie = movies[position]
            // Set item views based on your views and data model


            //val titleText = holder.titleText
            //val yearText = holder.yearText
            //val imageView = holder.MovieImage
            //val dirText = viewHolder.dirText
            //titleText.text = movie[0]
            //yearText.text = movie[1]

            holder.title.text = movie[0]
            holder.year.text = movie[1]
            holder.director.text = movie[2]
            Picasso.get().load(movie[3]).into(holder.MovieImage)


            holder.itemView.isClickable = true
            holder.itemView.isFocusableInTouchMode = true

        }

        override fun getItemCount(): Int {
            return movies.size
        }

    }

/*private fun AdapterView.OnItemClickListener.onItemClick(position: Int) {
        DisplayMoviesActivity.onItemClick(position)
}*/

