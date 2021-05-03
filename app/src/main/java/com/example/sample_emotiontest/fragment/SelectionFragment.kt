package com.example.sample_emotiontest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.sample_emotiontest.R
import com.example.sample_emotiontest.databinding.FragmentSelectionBinding


class SelectionFragment : Fragment() {
    lateinit var binder : FragmentSelectionBinding
    lateinit var navController : NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_selection, container, false)
        binder = FragmentSelectionBinding.bind(view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binder.option1.setOnClickListener {
            selectButton(1)
        }
        binder.option2.setOnClickListener {
            selectButton(2)
        }
        binder.option3.setOnClickListener {
            selectButton(3)
        }
        binder.option4.setOnClickListener {
            selectButton(4)
        }
        binder.btnBack.setOnClickListener {
            // 버튼 클릭 시 뒤로가기 기능
            navController.popBackStack()
        }
    }
    fun selectButton(index : Int){
        val bundle : Bundle = bundleOf("index" to index)
        navController.navigate(R.id.action_selectionFragment_to_resultFragment, bundle)
    }
}