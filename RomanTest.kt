

import org.junit.Test
import kotlin.test.assertEquals

/***********************************************************************
 * Name:            Sean Michael Rising
 * Date:            5/19/2021
 * Assignment:      TDD-Roman Numerals
 * Class Number:    282
 * Description:     Make a file to convert a base 10 number to roman numeral system
 ***********************************************************************/

class RomanTest {
    private var testRoman = linkedMapOf<Int, String>(
        1 to "I",
        2  to  "II",
        3  to  "III",
        4  to  "IV",
        5  to  "V",
        6  to  "VI",
        7  to  "VII",
        8  to  "VIII",
        9  to  "IX",
        10  to  "X",
        11  to  "XI",
        12  to  "XII",
        13  to  "XIII",
        14  to  "XIV",
        15  to  "XV",
        16  to  "XVI",
        17  to  "XVII",
        18  to  "XVIII",
        19  to  "XIX",
        20  to  "XX",
        21  to  "XXI",
        22  to  "XXII",
        23  to  "XXIII",
        24  to  "XXIV",
        25  to  "XXV",
        26  to  "XXVI",
        27  to  "XXVII",
        28  to  "XXVIII",
        29  to  "XXIX",
        30  to  "XXX",
        31  to  "XXXI",
        32  to  "XXXII",
        33  to  "XXXIII",
        34  to  "XXXIV",
        35  to  "XXXV",
        36  to  "XXXVI",
        37  to  "XXXVII",
        38  to  "XXXVIII",
        39  to  "XXXIX",
        40  to  "XL",
        41  to  "XLI",
        42  to  "XLII",
        43  to  "XLIII",
        44  to  "XLIV",
        45  to  "XLV",
        46  to  "XLVI",
        47  to  "XLVII",
        48  to  "XLVIII",
        49  to  "XLIX",
        50  to  "L",
        51  to  "LI",
        52  to  "LII",
        53  to  "LIII",
        54  to  "LIV",
        55  to  "LV",
        56  to  "LVI",
        57  to  "LVII",
        58  to  "LVIII",
        59  to  "LIX",
        60  to  "LX",
        61  to  "LXI",
        62  to  "LXII",
        63  to  "LXIII",
        64  to  "LXIV",
        66  to  "LXVI",
        67  to  "LXVII",
        68  to  "LXVIII",
        69  to  "LXIX",
        70  to  "LXX",
        71  to  "LXXI",
        72  to  "LXXII",
        73  to  "LXXIII",
        74  to  "LXXIV",
        75  to  "LXXV",
        76  to  "LXXVI",
        77  to  "LXXVII",
        78  to  "LXXVIII",
        79  to  "LXXIX",
        80  to  "LXXX",
        81  to  "LXXXI",
        82  to  "LXXXII",
        83  to  "LXXXIII",
        84  to  "LXXXIV",
        85  to  "LXXXV",
        86  to  "LXXXVI",
        87  to  "LXXXVII",
        88  to  "LXXXVIII",
        89  to  "LXXXIX",
        90  to  "XC",
        91  to  "XCI",
        92  to  "XCII",
        93  to  "XCIII",
        94  to  "XCIV",
        95  to  "XCV",
        96  to  "XCVI",
        97  to  "XCVII",
        98  to  "XCVIII",
        99  to  "XCIX",
        100  to  "C"
    )
    @Test
    fun testRoman() {
        for((num, word) in testRoman){
            assertEquals(word, num.toRoman(), "Testing: $num")
        }
    }
}