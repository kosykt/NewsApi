package com.example.newsapi.utils

import androidx.navigation.NavController
import androidx.navigation.NavDirections

fun NavController.saveNavigate(direction: NavDirections) {
    currentDestination?.getAction(direction.actionId)?.run {
        navigate(direction)
    }
}