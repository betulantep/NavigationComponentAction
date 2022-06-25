package com.betulantep.navigationcomponentaction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.betulantep.navigationcomponentaction.databinding.FragmentSayfaBBinding
import com.betulantep.navigationcomponentaction.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {
    private lateinit var binding : FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.buttonXSayfaYGit.setOnClickListener {
            Navigation.findNavController(it).navigate(SayfaXFragmentDirections.sayfaYGit())
        }

        return binding.root
    }
}