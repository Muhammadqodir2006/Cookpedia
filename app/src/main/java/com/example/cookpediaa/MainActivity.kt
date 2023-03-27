package com.example.cookpediaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cookpediaa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var recycler:RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recycler = binding.foodrecycler

        recycler.layoutManager = GridLayoutManager(applicationContext, 2)
        recycler.adapter = FoodRecyclerAdapter(getFood())




    }

    private fun getFood(): ArrayList<Food> {
        val foodList = ArrayList<Food>()
        foodList.add(Food("Fri", "https://img.freepik.com/free-photo/chicken-wings-barbecue-sweetly-sour-sauce-picnic-summer-menu-tasty-food-top-view-flat-lay_2829-6471.jpg", 12231))
        foodList.add(Food("Burger", "https://www.foodandwine.com/thmb/pwFie7NRkq4SXMDJU6QKnUKlaoI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Ultimate-Veggie-Burgers-FT-Recipe-0821-5d7532c53a924a7298d2175cf1d4219f.jpg", 22231))
        foodList.add(Food("Soup", "https://hips.hearstapps.com/hmg-prod/images/best-soup-recipes-1660232265.jpeg", 22231))
        foodList.add(Food("Fri", "https://img.freepik.com/free-photo/chicken-wings-barbecue-sweetly-sour-sauce-picnic-summer-menu-tasty-food-top-view-flat-lay_2829-6471.jpg", 12231))
        foodList.add(Food("Burger", "https://www.foodandwine.com/thmb/pwFie7NRkq4SXMDJU6QKnUKlaoI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Ultimate-Veggie-Burgers-FT-Recipe-0821-5d7532c53a924a7298d2175cf1d4219f.jpg", 22231))
        foodList.add(Food("Soup", "https://hips.hearstapps.com/hmg-prod/images/best-soup-recipes-1660232265.jpeg", 22231))
        foodList.add(Food("Fri", "https://img.freepik.com/free-photo/chicken-wings-barbecue-sweetly-sour-sauce-picnic-summer-menu-tasty-food-top-view-flat-lay_2829-6471.jpg", 12231))
        foodList.add(Food("Burger", "https://www.foodandwine.com/thmb/pwFie7NRkq4SXMDJU6QKnUKlaoI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Ultimate-Veggie-Burgers-FT-Recipe-0821-5d7532c53a924a7298d2175cf1d4219f.jpg", 22231))
        foodList.add(Food("Soup", "https://hips.hearstapps.com/hmg-prod/images/best-soup-recipes-1660232265.jpeg", 22231))
        foodList.add(Food("Fri", "https://img.freepik.com/free-photo/chicken-wings-barbecue-sweetly-sour-sauce-picnic-summer-menu-tasty-food-top-view-flat-lay_2829-6471.jpg", 12231))
        foodList.add(Food("Burger", "https://www.foodandwine.com/thmb/pwFie7NRkq4SXMDJU6QKnUKlaoI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Ultimate-Veggie-Burgers-FT-Recipe-0821-5d7532c53a924a7298d2175cf1d4219f.jpg", 22231))
        foodList.add(Food("Soup", "https://hips.hearstapps.com/hmg-prod/images/best-soup-recipes-1660232265.jpeg", 22231))
        foodList.add(Food("Fri", "https://img.freepik.com/free-photo/chicken-wings-barbecue-sweetly-sour-sauce-picnic-summer-menu-tasty-food-top-view-flat-lay_2829-6471.jpg", 12231))
        foodList.add(Food("Burger", "https://www.foodandwine.com/thmb/pwFie7NRkq4SXMDJU6QKnUKlaoI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Ultimate-Veggie-Burgers-FT-Recipe-0821-5d7532c53a924a7298d2175cf1d4219f.jpg", 22231))
        foodList.add(Food("Soup", "https://hips.hearstapps.com/hmg-prod/images/best-soup-recipes-1660232265.jpeg", 22231))
        foodList.add(Food("Fri", "https://img.freepik.com/free-photo/chicken-wings-barbecue-sweetly-sour-sauce-picnic-summer-menu-tasty-food-top-view-flat-lay_2829-6471.jpg", 12231))
        foodList.add(Food("Burger", "https://www.foodandwine.com/thmb/pwFie7NRkq4SXMDJU6QKnUKlaoI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Ultimate-Veggie-Burgers-FT-Recipe-0821-5d7532c53a924a7298d2175cf1d4219f.jpg", 22231))
        foodList.add(Food("Soup", "https://hips.hearstapps.com/hmg-prod/images/best-soup-recipes-1660232265.jpeg", 22231))
        foodList.add(Food("Fri", "https://img.freepik.com/free-photo/chicken-wings-barbecue-sweetly-sour-sauce-picnic-summer-menu-tasty-food-top-view-flat-lay_2829-6471.jpg", 12231))
        foodList.add(Food("Burger", "https://www.foodandwine.com/thmb/pwFie7NRkq4SXMDJU6QKnUKlaoI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Ultimate-Veggie-Burgers-FT-Recipe-0821-5d7532c53a924a7298d2175cf1d4219f.jpg", 22231))
        foodList.add(Food("Soup", "https://hips.hearstapps.com/hmg-prod/images/best-soup-recipes-1660232265.jpeg", 22231))
        foodList.add(Food("Fri", "https://img.freepik.com/free-photo/chicken-wings-barbecue-sweetly-sour-sauce-picnic-summer-menu-tasty-food-top-view-flat-lay_2829-6471.jpg", 12231))
        foodList.add(Food("Burger", "https://www.foodandwine.com/thmb/pwFie7NRkq4SXMDJU6QKnUKlaoI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Ultimate-Veggie-Burgers-FT-Recipe-0821-5d7532c53a924a7298d2175cf1d4219f.jpg", 22231))
        foodList.add(Food("Soup", "https://hips.hearstapps.com/hmg-prod/images/best-soup-recipes-1660232265.jpeg", 22231))
        foodList.add(Food("Fri", "https://img.freepik.com/free-photo/chicken-wings-barbecue-sweetly-sour-sauce-picnic-summer-menu-tasty-food-top-view-flat-lay_2829-6471.jpg", 12231))
        foodList.add(Food("Burger", "https://www.foodandwine.com/thmb/pwFie7NRkq4SXMDJU6QKnUKlaoI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Ultimate-Veggie-Burgers-FT-Recipe-0821-5d7532c53a924a7298d2175cf1d4219f.jpg", 22231))
        foodList.add(Food("Soup", "https://hips.hearstapps.com/hmg-prod/images/best-soup-recipes-1660232265.jpeg", 22231))
        foodList.add(Food("Fri", "https://img.freepik.com/free-photo/chicken-wings-barbecue-sweetly-sour-sauce-picnic-summer-menu-tasty-food-top-view-flat-lay_2829-6471.jpg", 12231))
        foodList.add(Food("Burger", "https://www.foodandwine.com/thmb/pwFie7NRkq4SXMDJU6QKnUKlaoI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Ultimate-Veggie-Burgers-FT-Recipe-0821-5d7532c53a924a7298d2175cf1d4219f.jpg", 22231))
        foodList.add(Food("Soup", "https://hips.hearstapps.com/hmg-prod/images/best-soup-recipes-1660232265.jpeg", 22231))
        foodList.add(Food("Fri", "https://img.freepik.com/free-photo/chicken-wings-barbecue-sweetly-sour-sauce-picnic-summer-menu-tasty-food-top-view-flat-lay_2829-6471.jpg", 12231))
        foodList.add(Food("Burger", "https://www.foodandwine.com/thmb/pwFie7NRkq4SXMDJU6QKnUKlaoI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Ultimate-Veggie-Burgers-FT-Recipe-0821-5d7532c53a924a7298d2175cf1d4219f.jpg", 22231))
        foodList.add(Food("Soup", "https://hips.hearstapps.com/hmg-prod/images/best-soup-recipes-1660232265.jpeg", 22231))
        foodList.add(Food("Fri", "https://img.freepik.com/free-photo/chicken-wings-barbecue-sweetly-sour-sauce-picnic-summer-menu-tasty-food-top-view-flat-lay_2829-6471.jpg", 12231))
        foodList.add(Food("Burger", "https://www.foodandwine.com/thmb/pwFie7NRkq4SXMDJU6QKnUKlaoI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Ultimate-Veggie-Burgers-FT-Recipe-0821-5d7532c53a924a7298d2175cf1d4219f.jpg", 22231))
        foodList.add(Food("Soup", "https://hips.hearstapps.com/hmg-prod/images/best-soup-recipes-1660232265.jpeg", 22231))
        return foodList

    }
}