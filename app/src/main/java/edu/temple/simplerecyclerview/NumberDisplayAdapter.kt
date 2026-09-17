package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NumberDisplayAdapter(private val numbers: IntArray) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()
{
    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NumberViewHolder {
        return NumberViewHolder (
            TextView(parent.context).apply{
                setPadding(10, 10, 10, 10)
                textSize = 32.toFloat()
            }
        )
    }

    override fun onBindViewHolder(
        holder: NumberViewHolder,
        position: Int
    ){
        holder.textView.text = numbers[position].toString()
    }

    override fun getItemCount() = numbers.size




}