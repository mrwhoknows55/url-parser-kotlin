package com.mrwhoknows.lld.url_parser

class UrlParser(private val urlString: String) {

    // TODO: Implement the URL parsing logic
    fun parse(): URL = URL(
        protocol = "https", domain = "www.google.com", path = "/search", query = mapOf("q" to "hello world")
    )

    fun isValid(): Boolean = validate()

    private fun validate(): Boolean {
        return urlString.isNotBlank()
    }
}