package com.example.onboardingscreens.Onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.onboardingscreens.R

class ThirdScreen : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_third_screen, container, false)



        view.findViewById<TextView>(R.id.finish).setOnClickListener{
           findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
            isFirstTime()


        }

        return view
    }

    private fun isFirstTime() {
        val sharedPreferences = requireActivity().getSharedPreferences("onBoarding",Context.MODE_PRIVATE)
        sharedPreferences.edit().putBoolean("Finished", true).apply()
    }



}