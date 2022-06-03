package com.example.newsapi.utils.imageloader

import android.widget.ImageView
import coil.load
import com.example.newsapi.R

class CoilImageLoader : AppImageLoader {

    override fun loadInto(url: String, container: ImageView) {
        container.load(url) {
            target(
                onSuccess = { result ->
                    container.setImageDrawable(result)
                },
                onStart = {
                    container.setImageResource(R.drawable.ar_loading_animation)
                },
                onError = {
                    container.setImageResource(R.drawable.ic_error_place_holder)
                },
            )
        }
    }
}