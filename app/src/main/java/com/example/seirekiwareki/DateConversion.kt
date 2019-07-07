/*
西暦和暦変換クラス
 */
package com.example.seirekiwareki
import java.text.SimpleDateFormat
import java.util.*

class DateConversion{

    fun seirekiToWareki(seirekiDate: String) : String {

        var era : String? = null

        val df = SimpleDateFormat("yyyy/MM/dd")
        val date = df.parse(seirekiDate)
        val cal = Calendar.getInstance()
        cal.time = date

        // 年、月、日を取得する。
        var year = cal.get(Calendar.YEAR)
        var month = cal.get(Calendar.MONTH)
        var day = cal.get(Calendar.DAY_OF_MONTH)

        run loop@{
            GENGOU_DATA.forEach {
                val calStartDate = Calendar.getInstance()
                calStartDate.time = it["startDate"] as Date

                // 日付が startDate より大きかったら終わり
                if (cal.compareTo(calStartDate) > 0) {
                    era = it["kanji"] as String
                    year = year - calStartDate.get(Calendar.YEAR) + 1
                    return@loop
                }
            }
        }

        return if (era == null) {
            "非対応です。"
        } else {
            "${era}${year}年${month}月${day}日"
        }
    }
}
