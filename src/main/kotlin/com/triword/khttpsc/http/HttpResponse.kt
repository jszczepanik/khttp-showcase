package com.triword.khttpsc

data class HttpResponse(
    var status: Int,
    var version: String,
    var headers: Map<String, String>,
    var body: ByteArray
)
