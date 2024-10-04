package com.example.a4m_1hw.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.a4m_1hw.R
import com.example.a4m_1hw.databinding.FragmentRegistrationBinding
import com.example.a4m_1hw.ui.activity.User


class RegistrationFragment : Fragment() {

    private lateinit var binding: FragmentRegistrationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }

    private fun setupListener() {
        binding.buttonSend.setOnClickListener {
            findNavController().navigate(
                RegistrationFragmentDirections.actionRegistrationFragmentToInfoFragment(
                    User(binding.etName.text.toString(),binding.etEmail.text.toString(),binding.etPassword.text.toString().toInt())
                )
            )
        }
    }
}