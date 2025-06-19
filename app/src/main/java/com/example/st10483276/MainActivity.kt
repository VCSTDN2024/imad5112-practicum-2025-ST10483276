package com.example.st10483276

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Rating
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import java.util.ArrayList
import java.util.Locale
import kotlin.jvm.java
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    private val SongTitle = mutableListOf<String>()
    private val ArtistName = mutableListOf<String>()
    private val Rating = mutableListOf<android.R.integer>()
    private val Comments = mutableListOf<android.R.integer>()

    private fun showaddmusicDialog() {
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val addButton: Button = findViewById(R.id.addButton)
        val nextButton: Button = findViewById(R.id.viewButton)
        val exitButton: Button = findViewById(R.id.exitButton)

        addButton.setOnClickListener {
            showaddmusicDialog()
        }

        nextButton.setOnClickListener {
            if (SongTitle.isNotEmpty()) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putStringArrayListExtra("Song Title", ArrayList(SongTitle))
                intent.putStringArrayListExtra("Artist Name", ArrayList(ArtistName))
                intent.putStringArrayListExtra("Rating", ArrayList(Rating.map { it.toString() })
                )
                intent.putStringArrayListExtra("Comments", ArrayList(Comments))
                startActivity(intent)
            } else {
                Toast.makeText(this, "Playlist is empty! Fill in the details first.", Toast.LENGTH_SHORT).show()
            }
        }

        exitButton.setOnClickListener {
            finishAffinity()
            exitProcess(0)
        }

        @SuppressLint("MissingInflatedId")
        fun showaddmusicDialog() {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Add New Song")
            val view = layoutInflater.inflate(R.layout.activity_add_music, null)
            val SongTitle_editText: EditText = view.findViewById(R.id.SongTitle_editText)
            val ArtistName_editText: EditText = view.findViewById(R.id.ArtistName_editText)
            val Rating_editText: EditText = view.findViewById(R.id.Rating_editText)
            val Comments_editText: EditText = view.findViewById(R.id.Comments_editText)

            builder.setView(view)

            builder.setPositiveButton("Add") { dialog, _ ->
                val songTitle = SongTitle_editText.text.toString().trim()
                val artistName = ArtistName_editText.text.toString().trim()
                val ratingStr = Rating_editText.text.toString().trim()
                val comments = Comments_editText.text.toString().trim()

                if (songTitle.isEmpty() || artistName.isEmpty() || ratingStr.isEmpty() || comments.isEmpty()) {
                    Toast.makeText(this, "All fields are required! please fill in any missed field", Toast.LENGTH_SHORT).show() //Reminder notification if the user tries to continue without filling in details
                    return@setPositiveButton
                }

                val rating = ratingStr.toIntOrNull()
                if (rating == null || rating <= 0) {
                    Toast.makeText(this, "Invalid number! Enter a number greater than zero.", Toast.LENGTH_SHORT).show() //error message
                    return@setPositiveButton
                }
                SongTitle.add(songTitle)
                ArtistName.add(artistName)
                Rating.add(rating)
                Comments.add(comments)

                Toast.makeText(this, "$songTitle added to the playlist.", Toast.LENGTH_SHORT)show() //Added content message
                dialog.dismiss()
            }

            builder.setNegativeButton("Cancel") { dialog, _ ->
                dialog.cancel()
            }
            builder.show()
        }
    }}