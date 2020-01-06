package com.example.sonarqubekotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WordAdapter : RecyclerView.Adapter<WordAdapter.WordViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val mView = LayoutInflater.from(parent.context).inflate(R.layout.item_words, parent, false)
        return WordViewHolder(mView)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        // Bind view for list
    }

    class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }


}
