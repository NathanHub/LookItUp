package com.south95.looktopia

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.ChipGroup
import com.south95.looktopia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))

        chipGroupSelection()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    // Handle MenuItem option/s
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.help -> {
//            MaterialAlertDialogBuilder(this)
//                .setTitle(resources.getString(R.string.title))
//                .setMessage(resources.getString(R.string.supporting_text))
//                .setNeutralButton(resources.getString(R.string.cancel)) { dialog, which ->
//                    // Respond to neutral button press
//                }
//                .setNegativeButton(resources.getString(R.string.decline)) { dialog, which ->
//                    // Respond to negative button press
//                }
//                .setPositiveButton(resources.getString(R.string.accept)) { dialog, which ->
//                    // Respond to positive button press
//                }
//                .show()
            //Toast.makeText(this, "help", Toast.LENGTH_SHORT).show()
            // Create and show the AlertDialog when the menu item is selected
            val alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setTitle("Help")
            alertDialogBuilder.setMessage(R.string.help)
            alertDialogBuilder.setPositiveButton("OK") { dialog, which ->
                // Handle OK button click

            }
            alertDialogBuilder.setNegativeButton("Cancel") { dialog, which ->
                // Handle Cancel button click
            }

            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
            true
        }

        R.id.about -> {
            val alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setTitle("About")
            alertDialogBuilder.setMessage(R.string.about)
            alertDialogBuilder.setPositiveButton("OK") { dialog, which ->
                // Handle OK button click

            }
            alertDialogBuilder.setNegativeButton("Cancel") { dialog, which ->
                // Handle Cancel button click
            }

            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
            true
        }

        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }

    @Suppress("DEPRECATION")
    private fun chipGroupSelection() {

        // Initialize the counter for selected options
        var selectedOptionsCount = 0

        val chipGroup = findViewById<ChipGroup>(R.id.chip_header)
        val button = findViewById<Button>(R.id.btn_continue)

        chipGroup.setOnCheckedChangeListener { _, _ ->
            selectedOptionsCount = chipGroup.checkedChipIds.size

            if (selectedOptionsCount >= 3) {
                button.isEnabled = true
                button.setBackgroundColor(R.drawable.btn_enabled)
            } else {
                button.isEnabled = false
                button.setBackgroundColor(R.drawable.btn_disabled)
            }
        }

        button.setOnClickListener {
            if (selectedOptionsCount >= 3) {
                val intent = Intent(this, ContainerActivity::class.java)
                startActivity(intent)
            } else
                Toast.makeText(this, "Select at least 3 options", Toast.LENGTH_SHORT).show()
        }

    }
}