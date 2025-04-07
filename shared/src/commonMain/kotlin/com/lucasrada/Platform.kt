package com.lucasrada

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform