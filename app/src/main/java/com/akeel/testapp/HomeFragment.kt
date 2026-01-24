package com.akeel.testapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class HomeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnProfile = view.findViewById<Button>(R.id.btnProfile)

        btnProfile.setOnClickListener {

            // create profile fragment object
            val profileFragment = ProfileFragment()

            // pass data using bundle
            val bundle = Bundle()
            bundle.putString("username", "Akeel shafi kana")
            profileFragment.arguments = bundle

            // navigate using fragment manager
            parentFragmentManager.beginTransaction()
                .replace(R.id.activityFrameLayout, profileFragment)
                .addToBackStack(null)
                .commit()


        }

    }
}