package com.example.newsapi.ui.breakingnewsfragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.model.BreakingNewsDomainModel
import com.example.newsapi.databinding.ItemNewsBinding
import com.example.newsapi.utils.imageloader.AppImageLoader

class BreakingNewsAdapter(
    private val isFavourite: (BreakingNewsDomainModel) -> Boolean,
    private val favoriteClickHandler: (BreakingNewsDomainModel) -> Boolean,
    private val appImageLoader: AppImageLoader,
    private val shareHandler: (String, String) -> Unit,
    private val openBrowserHandler: (String) -> Unit,
) : ListAdapter<BreakingNewsDomainModel, BreakingNewsAdapter.BreakingNewsViewHolder>(
    BreakingNewsCallback
) {

    inner class BreakingNewsViewHolder(private val vb: ItemNewsBinding) :
        RecyclerView.ViewHolder(vb.root) {

        fun show(model: BreakingNewsDomainModel) {
            vb.itemNewsTitle.text = model.title
            vb.itemNewsDescription.text = model.description
            vb.itemNewsSourceName.text = model.sourceName
            vb.itemNewsPublishedAt.text = model.publishedAt.substring(1).substringBefore('T')
            appImageLoader.loadInto(model.urlToImage, vb.itemNewsImageView)
            vb.itemNewsFavoriteCheck.isChecked = isFavourite(model)
            vb.itemNewsFavoriteCheck.setOnClickListener {
                vb.itemNewsFavoriteCheck.isChecked = favoriteClickHandler(model)
            }
            vb.itemNewsShareBtn.setOnClickListener {
                shareHandler(model.title, model.url)
            }
            vb.itemNewsOpenInBrowser.setOnClickListener {
                openBrowserHandler(model.url)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BreakingNewsViewHolder {
        return BreakingNewsViewHolder(
            ItemNewsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BreakingNewsViewHolder, position: Int) {
        holder.show(currentList[position])
    }

    companion object BreakingNewsCallback : DiffUtil.ItemCallback<BreakingNewsDomainModel>() {
        override fun areItemsTheSame(
            oldItem: BreakingNewsDomainModel,
            newItem: BreakingNewsDomainModel
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: BreakingNewsDomainModel,
            newItem: BreakingNewsDomainModel
        ): Boolean {
            return oldItem == newItem
        }
    }
}