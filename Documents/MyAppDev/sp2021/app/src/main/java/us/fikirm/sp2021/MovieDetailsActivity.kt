package us.fikirm.sp2021

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MovieDetailsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        // to display the clicked movie title text:
        //val b = this.intent.extras
        val message = intent.extras?.getStringArray("details")

        //started working on a default image, but didn't complete that
        val image = findViewById<ImageView>(R.id.movie_image)

        val title = findViewById<TextView>(R.id.title)
        val year= findViewById<TextView>(R.id.year)
        val director = findViewById<TextView>(R.id.Director)
        val description = findViewById<TextView>(R.id.description)

        //  val movie = movies[position]
        //  title.text = movie[0]
        //  year.text = movie[1]
        //   actor.text = movie[2]
        //  Picasso.get().load(movie[3]).into(movieimage)
        //  description.text = movie[4]

    }
}
