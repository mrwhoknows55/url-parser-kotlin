import com.mrwhoknows.lld.url_parser.UrlParser
import kotlin.test.Test

class UrlParserTest {

    @Test
    fun validationFailsForEmptyUrlString() {
        assert(
            UrlParser("").isValid().not()
        )
    }

    @Test
    fun validationSuccessWhenSimpleUrlIsValid() {
        val urlParser = UrlParser("https://www.google.com/search?q=hello+world")
        assert(urlParser.isValid())
    }
}