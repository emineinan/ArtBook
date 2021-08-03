package com.example.artbook.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.artbook.R
import com.example.artbook.databinding.FragmentArtBinding
import com.example.artbook.databinding.FragmentArtDetailsBinding

class ArtDetailsFragment: Fragment(R.layout.fragment_art_details) {

    private var _binding: FragmentArtDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentArtDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }
}