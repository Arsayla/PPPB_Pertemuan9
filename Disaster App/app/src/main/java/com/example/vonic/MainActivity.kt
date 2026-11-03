package com.example.vonic

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.vonic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterDisaster = DisasterAdapter(generateDummy()) { disaster ->
            Toast.makeText(
                this,
                "Kamu memilih ${disaster.nameDisaster}",
                Toast.LENGTH_SHORT
            ).show()
        }

        binding.rvDisaster.apply {
            adapter = adapterDisaster
            layoutManager = GridLayoutManager(this@MainActivity, 2)
        }
    }

    private fun generateDummy(): List<Disaster> {
        return listOf(
            Disaster(
                "Tsunami",
                "Natural",
                R.drawable.tsunami
            ),
            Disaster(
                "Volcanic Eruption",
                "Natural",
                R.drawable.volcano
            ),
            Disaster(
                "Earthquake",
                "Natural",
                R.drawable.earthquake
            ),
            Disaster(
                "Flood",
                "Natural",
                R.drawable.flood
            ),
            Disaster(
                "Fire",
                "Natural",
                R.drawable.
            ),
            Disaster(
                "Nuclear Accident",
                "Man-made",
                R.drawable.nuclear
            ),
            Disaster(
                "Terrorist Attack",
                "Man-made",
                R.drawable.terrorist
            ),
            Disaster(
                "War",
                "Man-made",
                R.drawable.war
            )
        )
    }
}