package us.fikirm.sp2021

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MoviesListActivity : AppCompatActivity(), MoviesAdapter.OnItemClickListener {

    lateinit var movies: Array<Array<String>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies_list)



            // Lookup the recyclerview in activity layout
            val MoviesList = findViewById<View>(R.id.button1) as RecyclerView


            // Initialize movies
            movies = MoviesModel().moviesL
            // Create adapter passing in the sample user data
            val adapter = MoviesAdapter(movies, this)
            // Attach the adapter to the recyclerview to populate items
            MoviesList.adapter = adapter
            // Set Layout manager to position the items
            MoviesList.layoutManager = LinearLayoutManager(this)
            // Thats all...?
            MoviesList.setHasFixedSize(true)


        }

        // function to show the MovieDetails Activity on button click
        //fun movieDetails(view: View) {
        override fun MovieDetails(position: Int) {

            val selection = movies[position]
            //val b = Bundle()

            val intent = Intent(this, MovieDetailsActivity::class.java)


            //b.putStringArray(EXTRA_MESSAGE, selection)
            intent.putExtra("details", selection)
            //intent.putExtra("us.fikirm.sp2021.MESSAGE")

            startActivity(intent)
            onPause()
        }

    }


