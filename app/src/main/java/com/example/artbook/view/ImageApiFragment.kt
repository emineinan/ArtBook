package com.example.artbook.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.artbook.R
import com.example.artbook.databinding.FragmentArtBinding
import com.example.artbook.databinding.FragmentImageApiBinding

class ImageApiFragment : Fragment(R.layout.fragment_image_api) {

    private var _binding: FragmentImageApiBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentImageApiBinding.inflate(inflater, container, false)
        return binding.root
    }
}