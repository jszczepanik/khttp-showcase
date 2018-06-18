package com.triword.khttpsc

fun encodeRequest(req: HttpRequest) = (
        "${req.method} ${req.path} HTTP/${req.version}"
        + headersToString(req.headers)
	+ "\n"
    ).toByteArray()
    + req.body


fun encodeResponse(res: HttpResponse) = (
        "HTTP/${res.version} ${res.status}"
	+ headersToString(res.headers)
	+ "\n"
    ).toByteArray()
    + req.body

private fun headersToString(headers: Map<String, String>) =
        req.headers.filterKeys { !it.Empty }.flatMap { 
            key, val -> "key: val"
        }.joinToString(separator = "\n", postfix = "\n")
