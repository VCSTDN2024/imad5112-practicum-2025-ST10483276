package com.example.st10483276

import android.content.Intent
import android.media.Rating
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.text.DecimalFormat

private fun Detailed_view.displayDetailedview() {
    TODO("Not yet implemented")
}

class Detailed_view : AppCompatActivity() {

    private lateinit var SongTitle: ArrayList<String>
    private lateinit var ArtistName: ArrayList<String>
    private lateinit var Rating: ArrayList<android.R.integer>
    private lateinit var Comments: ArrayList<String>
    private lateinit var TV_displayTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view)

        SongTitle = intent.getStringArrayListExtra("SongTitle") ?: arrayListOf()
        ArtistName = intent.getStringArrayListExtra("ArtistName") ?: arrayListOf()
        Rating = (intent.getStringArrayListExtra("Rating") ?: arrayListOf()) as ArrayList<android.R.integer>
        Comments = intent.getStringArrayListExtra("Comments") ?: arrayListOf()
        TV_displayTextView = findViewById(R.id.TV_displayTextView)

        val DisplaySongs: Button = findViewById(R.id.Display_TextView)
        val Calculateaverage: Button = findViewById(R.id.Average_TextView)
        val backButton: Button = findViewById(R.id.backButton)

        DisplaySongs.setOnClickListener {
            displayDetailedview()
        }

        backButton.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

        private val displayDetailedview() {
            val stringBuilder = StringBuilder()
            if (SongTitle.isNotEmpty()) {
                for (i in SongTitle.indices) {
                    stringBuilder.append("SongTitle: ${SongTitle[i]}\n")
                    stringBuilder.append("ArtistName: ${ArtistName[i]}\n ")
                    stringBuilder.append("Rating: ${Rating[i]}\n")
                    stringBuilder.append("Comments: ${Comments[i]}\n\n")
                }
                TV_displayTextView.text = stringBuilder.toString()
            }else{
                TV_displayTextView.text = "The list is empty" //error message
            }
        }

        private fun Average_TextView(ratings: List<Int>) {
            val averageRating = if (ratings.isNotEmpty()) {

                ratings.sum().toFloat() / ratings.size
            } else {
                0.0f // The deafult value is 00
            }
            val decimalFormat = DecimalFormat("#.##")
            val formattedAverage = decimalFormat.format(averageRating)
            TV_displayTextView.append("\n\nAverage Rating: $formattedAverage")
        }
    }
}