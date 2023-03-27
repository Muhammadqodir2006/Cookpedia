package com.example.cookpediaa

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.google.android.material.imageview.ShapeableImageView

class FoodRecyclerAdapter(val foodList:ArrayList<Food>):RecyclerView.Adapter<FoodRecyclerAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val image = itemView.findViewById<ShapeableImageView>(R.id.image)
        val nomi = itemView.findViewById<TextView>(R.id.nomi)
        val soni = itemView.findViewById<TextView>(R.id.soni)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)

        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val food = foodList[position]
        holder.image.load(food.image){
            placeholder(R.drawable.ic_launcher_foreground)
            error(R.drawable.ic_launcher_background)
        }
        holder.nomi.text = food.name
        holder.soni.text = "${holder.soni}  recipes"
    }
}