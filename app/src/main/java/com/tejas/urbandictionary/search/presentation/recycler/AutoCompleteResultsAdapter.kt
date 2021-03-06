package com.tejas.urbandictionary.search.presentation.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.tejas.urbandictionary.databinding.AutoCompleteResultItemBinding
import com.tejas.urbandictionary.search.domain.entity.AutoCompleteResult

class AutoCompleteResultsAdapter(
    private val onClick: (String) -> Unit
) : ListAdapter<AutoCompleteResult, AutoCompleteResultsViewHolder>(
    AutoCompleteResultsDiffCallback
) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AutoCompleteResultsViewHolder {
        val binding = AutoCompleteResultItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AutoCompleteResultsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AutoCompleteResultsViewHolder, position: Int) {
        holder.bind(getItem(position), onClick)
    }
}
