package com.example.payruptask.detail


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.payruptask.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val application = requireNotNull(activity).application
        val binding = FragmentDetailBinding.inflate(inflater)
        binding.lifecycleOwner = this

        val contact = DetailFragmentArgs.fromBundle(requireArguments()).selectedContact
        val viewModelFactory = DetailViewModelFactory(contact, application)
        binding.viewModel =
            ViewModelProvider(this, viewModelFactory).get(DetailViewModel::class.java)

        return binding.root
    }

}
