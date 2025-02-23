package com.mrwhoknows.lld.url_parser


data class URL(
    val protocol: String,
    val domain: String,
    val path: String,
    val port: Int = -1,
    val subdomain: String = "",
    val query: Map<String, String> = emptyMap(),
    val pathSegments: List<String> = listOf(path),
    val fragment: String = "",
    val userName: String = "",
    val password: String = "",
) {
    val formattedUrl: String
        get() = formatUrl()

    private fun formatUrl(): String = buildString {
        append("")
    }
}

