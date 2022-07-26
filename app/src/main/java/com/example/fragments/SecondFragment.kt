package com.example.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class SecondFragment:Fragment (R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstName = requireActivity().findViewById<EditText>(R.id.etFirstName2)
        val lastName = requireActivity().findViewById<EditText>(R.id.etTLastName2)
        val email = requireActivity().findViewById<EditText>(R.id.etEmail2)
        val clearButton = requireActivity().findViewById<Button>(R.id.btnClear)

        clearButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(android.R.id.content, FirstFragment()).commit()
        }


    }
}