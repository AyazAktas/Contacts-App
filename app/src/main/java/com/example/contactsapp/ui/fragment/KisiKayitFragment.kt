package com.example.contactsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.contactsapp.R
import com.example.contactsapp.databinding.FragmentKisiKayitBinding

class KisiKayitFragment : Fragment() {
    private lateinit var binding: FragmentKisiKayitBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentKisiKayitBinding.inflate(inflater, container, false)
        return binding.root
    }

}