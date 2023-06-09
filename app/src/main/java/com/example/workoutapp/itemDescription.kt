package com.example.workoutapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.workoutapp.databinding.FragmentItemDescriptionBinding

class itemDescription : Fragment() {

    private var _binding : FragmentItemDescriptionBinding? = null
    private val binding get() = _binding!!


    private val viewModel: ItemsViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentItemDescriptionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.chosenItem.observe(viewLifecycleOwner){

            binding.ditImage.setImageResource(it.photo)
            binding.ditTitle.text = it.title
            binding.ditDescription.text = it.description
            binding.ditRepeats.text = it.repeats.toString()
            binding.ditWeight.text = it.weight.toString()

        }


    }
    //TODO: Change from _binding to liveData
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
