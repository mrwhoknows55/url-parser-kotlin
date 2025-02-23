package com.mrwhoknows.lld.url_parser

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val url1 = "https://www.google.com/search?q=hello+world"
    val parsedUrl = UrlParser(url1)
    println("Parsed URL: ${parsedUrl.parse()}")
    println("URL is valid: ${parsedUrl.isValid()}")
    println("Formatted URL: ${parsedUrl.parse().formattedUrl}")
}