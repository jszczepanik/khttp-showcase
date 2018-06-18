package com.triword.khttpsc

data class HttpRequest(
    var method: HttpMethod,
    var path: String,
    var version: String,
    var headers: Map<String, String>,
    var body: ByteArray
)
