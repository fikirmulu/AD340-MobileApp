package us.fikirm.sp2021

import android.support.annotation.NonNull
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


//internal class MoviesAdapter(private val showMovie: (pos: Int) -> Unit) :
    //RecyclerView.Adapter<MoviesAdapter.ViewHolder>()

internal class MoviesAdapter(private val movies: Array<Array<String>>, private val listener: OnItemClickListener): RecyclerView.Adapter<MoviesAdapter.ViewHolder>(){
    internal inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        var titleText: TextView = itemView.findViewById(R.id.title)
        var yearText: TextView = itemView.findViewById(R.id.year)
        //var director: TextView = itemView.findViewById(R.id.director)
        //val movieimage: ImageView = itemView.findViewById(R.id.movie_image)
        //val description: TextView = itemView.findViewById(R.id.description)

        init {
            itemView.setOnClickListener(this)
            //val pos: Int = adapterPosition
            //showMovie(pos)

        }

        /*override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }*/

        override fun onClick(v: View?) {
            var bindingAdapterPosition =0
            val position = bindingAdapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.MovieDetails(position)
            }
        }
    }

    interface OnItemClickListener {
        //fun onItemClick(position: Int)
        fun MovieDetails(position: Int)
    }
    //@NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
           val contactView = inflater.inflate(R.layout.text_row_item,
                parent,
                false)

        return ViewHolder(contactView)
    }
    override fun onBindViewHolder(holder: MoviesAdapter.ViewHolder, position: Int) {
        val movie = movies[position]

        /*holder.title.text = movie[0]
        holder.year.text = movie[1]
        holder.director.text = movie[2]
        Picasso.get().load(movie[3]).into(holder.movieimage)


        holder.itemView.isClickable = true
        holder.itemView.isFocusableInTouchMode = true*/

        val titleText = holder.titleText
        val yearText = holder.yearText
        //val dirText = viewHolder.dirText
        titleText.text = movie[0]
        yearText.text = movie[1]

    }

    override fun getItemCount(): Int {
        return movies.size
    }



}
