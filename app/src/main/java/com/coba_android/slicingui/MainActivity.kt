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

        val items1 = ItemsMenu(R.drawable.ic_baseline_add_shopping_cart_24, "Cart")

        menuList.add(items1)

        val items2 = ItemsMenu(R.drawable.ic_baseline_location_on_24, "Location")

        menuList.add(items2)

        val items3 = ItemsMenu(R.drawable.ic_baseline_mail_outline_24, "Inbox")

        menuList.add(items3)

        val items4 = ItemsMenu(R.drawable.ic_baseline_settings_24, "Setting")

        menuList.add(items4)

        val items5 = ItemsMenu(R.drawable.ic_baseline_star_outline_24, "Favorite")

        menuList.add(items5)

        val items6 = ItemsMenu(R.drawable.ic_baseline_logout_24, "Logout")

        menuList.add(items6)
    }
}