package com.example.sample_emotiontest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.sample_emotiontest.R
import com.example.sample_emotiontest.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    lateinit var navController : NavController
    lateinit var binder : FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        binder = FragmentMainBinding.bind(view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        binder.buttonNext.setOnClickListener {
            // 다음 페이지인 questionFragment로 페이지가 전환된다
            navController.navigate(R.id.action_mainFragment_to_questionFragment)
        }
    }
}