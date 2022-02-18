package com.lyksa.listmaker.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lyksa.listmaker.databinding.ListSelectionViewHolderBinding

class ListSelectionRecyclerViewAdapter : RecyclerView.Adapter<ListSelectionViewHolder>() {

    val titles = arrayOf("title1", "title2", "title3")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        val binding = ListSelectionViewHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  ListSelectionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        holder.binding.itemNumber.text = (position + 1).toString()
        holder.binding.itemString.text = titles[position]
    }

    override fun getItemCount(): Int {
        return titles.size
    }

}
