package com.example.sample_emotiontest.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.sample_emotiontest.R
import com.example.sample_emotiontest.databinding.FragmentResultBinding


class ResultFragment : Fragment() {
    lateinit var binder : FragmentResultBinding
    lateinit var navController : NavController
    var optionIndex = -1
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_result, container, false)
        binder = FragmentResultBinding.bind(view)
        optionIndex = arguments?.getInt("index")?: -1
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        setResult(optionIndex)

        binder.btnHome.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }
    @SuppressLint("SetTextI18n")
    fun setResult(option : Int){
        when(option){
            1 -> {
                binder.textTitle.text = "1"
                binder.textResult.text = "1's contents"
            }
            2 -> {
                binder.textTitle.text = "2"
                binder.textResult.text = "2's contents"
            }
            3 -> {
                binder.textTitle.text = "3"
                binder.textResult.text = "3's contents"
            }
            4 ->{
                binder.textTitle.text = "4"
                binder.textResult.text = "4's contents"
            }
        }
    }
}