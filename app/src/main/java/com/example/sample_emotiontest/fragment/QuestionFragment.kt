package com.example.sample_emotiontest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.sample_emotiontest.R
import com.example.sample_emotiontest.databinding.FragmentQuestionBinding

class QuestionFragment : Fragment() {
    lateinit var navController: NavController
    lateinit var binder : FragmentQuestionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_question, container, false)
        binder = FragmentQuestionBinding.bind(view)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binder.buttonNext.setOnClickListener {
            navController.navigate(R.id.action_questionFragment_to_selectionFragment)
        }
    }
}