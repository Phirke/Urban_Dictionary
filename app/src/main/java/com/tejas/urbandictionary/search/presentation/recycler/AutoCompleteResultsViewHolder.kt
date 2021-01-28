package com.tejas.urbandictionary.search.presentation.recycler

import android.text.SpannableStringBuilder
import androidx.core.text.bold
import androidx.recyclerview.widget.RecyclerView
import com.tejas.urbandictionary.databinding.AutoCompleteResultItemBinding
import com.tejas.urbandictionary.search.domain.entity.AutoCompleteResult

class AutoCompleteResultsViewHolder(
    private val binding: AutoCompleteResultItemBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(autoCompleteResult: AutoCompleteResult, onClick: (String) -> Unit) {
        val result = SpannableStringBuilder()
            .bold { append(autoCompleteResult.term) }
            .append(" - ")
            .append(autoCompleteResult.preview)
        binding.tvAutocompleteResult.text = result
        binding.tvAutocompleteResult.setOnClickListener {
            onClick(autoCompleteResult.term)
        }
    }
}
