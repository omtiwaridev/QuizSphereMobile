package com.op.quizsphere

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform