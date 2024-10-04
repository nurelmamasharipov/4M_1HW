package com.example.a4m_1hw.ui.activity

import java.io.Serializable

data class User(
    val name: String = "",
    val email: String = "",
    val password: Int
) : Serializable
