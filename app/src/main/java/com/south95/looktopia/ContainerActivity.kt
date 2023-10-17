package com.south95.looktopia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class ContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        setSupportActionBar(findViewById(R.id.toolbar))
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
            Toast.makeText(this, "help", Toast.LENGTH_SHORT).show()
            true
        }

        R.id.about -> {
            Toast.makeText(this, "about", Toast.LENGTH_SHORT).show()
            true
        }

        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }
}