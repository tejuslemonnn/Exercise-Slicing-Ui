package com.coba_android.slicingui

import android.os.Bundle
import android.view.Window
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.coba_android.slicingui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Absolute Widget
        val circleBacground = ImageView(this)
        circleBacground.setImageResource(R.drawable.circle_white)
        circleBacground.imageAlpha = 127
        val params = RelativeLayout.LayoutParams(800, 400)
        params.rightMargin = 100
        params.topMargin = 300

        // Recycle Widget
        val horizontalLayoutManager = LinearLayoutManager(
            this@MainActivity,
            LinearLayoutManager.HORIZONTAL,
            false,
        )
        binding.recyclerView1.apply {
//            layoutManager = GridLayoutManager(applicationContext, 3)
            layoutManager = horizontalLayoutManager
            adapter = MenuAdapter(menuList)
        }
        binding.recyclerView2.apply {
//            layoutManager = GridLayoutManager(applicationContext, 3)
            layoutManager = LinearLayoutManager(
                this@MainActivity,
                LinearLayoutManager.HORIZONTAL,
                false,
            )
            adapter = MenuAdapter(menuList)
        }
    }

    override fun onStart() {
        showItemsMenu()
        super.onStart()
    }

    private fun showItemsMenu() {
        menuList.clear()
        for (i in 1..6) {
            val items = ItemsMenu(
                R.drawable.ic_launcher_foreground, "Android $i"
            )

            menuList.add(items)
        }
    }
}