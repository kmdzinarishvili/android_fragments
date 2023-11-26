package com.example.navigation.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.navigation.R

class HomeFragment: Fragment(R.layout.home_fragment) {
    private lateinit var button: Button;
    private lateinit var editText: EditText;
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button = view.findViewById(R.id.button);
        editText = view.findViewById(R.id.editTextNumber)
        button.setOnClickListener{
            val bundle = Bundle();
            bundle.putString("amount", editText.text.toString())
            findNavController()
                .navigate(R.id.dashboardFragment,
                    bundle,
                    NavOptions.Builder()
                        .setPopUpTo(R.id.homeFragment, true)
                        .build()
                )
        }

    }
}