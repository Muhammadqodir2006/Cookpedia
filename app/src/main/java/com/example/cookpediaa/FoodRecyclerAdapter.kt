package com.example.cookpediaa

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.google.android.material.imageview.ShapeableImageView
import java.util.*
import kotlin.collections.ArrayList

class FoodRecyclerAdapter(val foodList: ArrayList<Food>, val context: Context) :
    RecyclerView.Adapter<FoodRecyclerAdapter.MyViewHolder>(), ItemTouchHelperAdapter {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ShapeableImageView>(R.id.image)
        val nomi = itemView.findViewById<TextView>(R.id.nomi)
        val soni = itemView.findViewById<TextView>(R.id.soni)
        val main = itemView.findViewById<View>(R.id.main)
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
        holder.image.load(food.image) {
            placeholder(R.drawable.ic_launcher_foreground)
            error(R.drawable.ic_launcher_background)
        }
        holder.nomi.text = food.name
        holder.soni.text = "${food.count}  recipes"

        holder.main.startAnimation(AnimationUtils.loadAnimation(context, R.anim.food_item_anim))
    }

    override fun onItemMove(fromPosition: Int, toPosition: Int) {
        if (fromPosition < toPosition) {
            for (i in fromPosition until toPosition) {
                Collections.swap(foodList, i, i + 1)
            }
        } else {
            for (i in fromPosition downTo toPosition + 1) {
                Collections.swap(foodList, i, i - 1)
            }
        }
        notifyItemMoved(fromPosition, toPosition)
    }

    override fun onItemDismiss(position: Int) {
        foodList.removeAt(position)
        notifyItemRemoved(position)
    }
}