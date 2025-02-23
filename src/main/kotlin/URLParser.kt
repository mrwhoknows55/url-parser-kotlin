package com.mrwhoknows.lld.url_parser

class UrlParser(private val urlString: String) {

    fun parse(): URL = TODO("Implement the URL parsing logic")

    fun isValid(): Boolean = validate()

    private fun validate(): Boolean = booleanArrayOf(
        isUrlNotEmpty(), hasValidProtocol()
    ).all { it }


    private fun hasValidProtocol(): Boolean = urlString.substringBefore("://") in VALID_PROTOCOLS

    private fun isUrlNotEmpty(): Boolean = urlString.isNotBlank()

    companion object {
        val VALID_PROTOCOLS = listOf("http", "https")
    }
}