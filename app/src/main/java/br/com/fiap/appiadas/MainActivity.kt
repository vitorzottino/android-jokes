package br.com.fiap.appiadas

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.fiap.appiadas.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btTellJoker.setOnClickListener {
            showJoke()

        }
    }

    private fun showJoke(){
        val jokes = resources.getStringArray(R.array.jokers)
        val jokeIndex = Random.nextInt(jokes.size)
        binding.tvJoker.text = jokes[jokeIndex]
        playSound()
    }

    private fun playSound(){
        val mediaPlayer = MediaPlayer.create(this, R.raw.badumtss)
        mediaPlayer.start()
    }
}