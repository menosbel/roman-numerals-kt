import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ArabicToRomanConverterTest {
    @ParameterizedTest
    @CsvSource(
        "1, I",
        "2, II",
        "4, IV",
        "5, V",
        "6, VI",
        "7, VII",
        "8, VIII",
        "9, IX",
        "10, X",
        "11, XI",
        "12, XII",
        "13, XIII",
        "14, XIV",
        "49, XLIX",
        "50, L",
        "51, LI",
        "99, XCIX",
        "100, C",
        "500, D",
        "1000, M",
    )
    fun `arabic number to roman number`(arabic: Int, roman: String) {
        assertThat(converter.convert(arabic)).isEqualTo(roman)
    }

    private val converter = ArabicToRomanConverter()
}
