package com.example.habittrainer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HabitsAdapter(val habits: List<Habit>) : RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>() {
    class HabitViewHolder(val iv: View) : RecyclerView.ViewHolder(iv)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card,parent)

        return HabitViewHolder(view)
    }

    override fun getItemCount() = habits.size

    override fun onBindViewHolder(holder: HabitViewHolder, index: Int) {
        if (holder != null) {
            val habit = habits[index]
            holder.card.tv_title.text = habit.title
            holder.card.tv_description.text = habit.description
            holder.card.tv_icon.setImageBitmap(habit.image)
        }
    }


}