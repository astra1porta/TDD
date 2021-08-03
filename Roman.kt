/***********************************************************************
 * Name:            Sean Michael Rising
 * Date:            5/19/2021
 * Assignment:      TDD-Roman Numerals
 * Class Number:    282
 * Description:     Make a file to convert a base 10 number to roman numeral system
 ***********************************************************************/

fun Int.toRoman(): String {

    var result = ""
    var ones = this
    if(this >= 100){
        result = "C"
    }
    else if (this >= 10 ){
        if(this/10 % 5 > 0 && this/10 < 4) {
            result = "X".repeat(this/10 % 5)
        }else if(this/10 == 4){
            result = "XL"
        }else if(this/10 in 5..8) {
            result = "L" + "X".repeat(this / 10 % 5)
        }else if(this/10 == 9) {
            result = "XC"
        }

        ones -= (this / 10 ) * 10
    }

    if (ones == 9) {
        result += "IX"
    }else if (ones >= 6 && ones % 10 != 0) {
        result += "V" + "I".repeat(ones % 5)
    } else if (ones <= 3) {
        result += "I".repeat(ones % 5)
    } else if ((ones % 5 == 4) && ones <= 5) {
        result += "IV"
    } else if (ones % 5 == 0 && ones % 10 != 0) {
        result += "V"
    }



    return result
}