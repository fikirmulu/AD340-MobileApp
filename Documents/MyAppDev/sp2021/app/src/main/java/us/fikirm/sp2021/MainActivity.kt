package us.fikirm.sp2021

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fun MoviesListActivity(view: View?) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        fun Traffic(view: View?) {
            val intent = Intent(this, TrafficActivity::class.java)
            startActivity(intent)
        }

        fun Map(view: View?) {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }
                /*val EnterName = findViewById(R.id.EnterName) as EditText
                val btnInfo= findViewById<Button>(R.id.btnInfo)
                btnInfo.setOnClickListener {
                    Toast.makeText(this,"Sent!",Toast.LENGTH_LONG).show()
                }*/

                val btnCities= findViewById<Button>(R.id.btnCities)
                btnCities.setOnClickListener {
                    Toast.makeText(this,"Beautiful Seattle",Toast.LENGTH_LONG).show()
                }
                val btnMovies= findViewById<Button>(R.id.btnMovies)
                btnMovies.setOnClickListener {
                    Toast.makeText(this,"Zombie Movies",Toast.LENGTH_SHORT).show()

                    val intent = Intent(this, MoviesListActivity::class.java)

                    startActivity(intent)

                }
                val btnMap= findViewById<Button>(R.id.btnMap)
                btnMap.setOnClickListener {
                    Toast.makeText(this,"Seattle Central",Toast.LENGTH_LONG).show()
                    val intent = Intent(this, MapActivity::class.java)

                    startActivity(intent)
                }
                val btnTraffic= findViewById<Button>(R.id.btnTraffic)
                btnTraffic.setOnClickListener {
                    Toast.makeText(this,"Stop!",Toast.LENGTH_LONG).show()

                    val intent = Intent(this, TrafficActivity::class.java)

                    startActivity(intent)
                }
            val btnMusic= findViewById<Button>(R.id.btnMusic)
            btnMusic.setOnClickListener {
                Toast.makeText(this,"country Music",Toast.LENGTH_LONG).show()
            }
            val btnFood= findViewById<Button>(R.id.btnFood)
            btnFood.setOnClickListener {
                Toast.makeText(this,"Chicken Stew",Toast.LENGTH_LONG).show()
            }
            }

    companion object {
       const val EXTRA_MESSAGE = "us.fikirm.sp2021.MESSAGE"
    }
}






