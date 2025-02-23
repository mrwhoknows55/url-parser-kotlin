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

    @Test
    fun validationFailsWhenProtocolIsMissingOrIncorrect() {

        // Missing protocol
        assert(UrlParser("google.com").isValid().not())

        // Incorrect protocols
        assert(UrlParser("ftp://google.com").isValid().not())
        assert(UrlParser("ssh://hello-world.com").isValid().not())

        // Correct protocols
        assert(UrlParser("http://google.com").isValid())
        assert(UrlParser("https://google.com").isValid())
    }



}