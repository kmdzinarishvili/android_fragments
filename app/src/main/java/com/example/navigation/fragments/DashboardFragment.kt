package com.example.navigation.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.navigation.R

class DashboardFragment: Fragment(R.layout.dashboard_fragment) {
    private lateinit var textView: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView)
        textView.text = arguments?.getString("amount") ?: "-1"
    }
}