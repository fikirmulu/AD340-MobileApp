package us.fikirm.sp2021

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso


class MovieDetailsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        // to display the clicked movie title text:
        //val b = this.intent.extras

        val message = intent.extras?.getStringArray("details")

        //val image = findViewById<ImageView>(R.id.movie_image)
        val pic = findViewById<ImageView>(R.id.Image)

        val titleView = findViewById<TextView>(R.id.title)
        val yearView= findViewById<TextView>(R.id.year)
        val directorView = findViewById<TextView>(R.id.Director)
        val descriptionView = findViewById<TextView>(R.id.Description)


        titleView.text = message?.get(0)
        yearView.text = message?.get(1)
        directorView.text = "Director: " + message?.get(2)
        Picasso.get().load(message?.get(3)).into(pic)
        descriptionView.text = message?.get(4)


    }
}
