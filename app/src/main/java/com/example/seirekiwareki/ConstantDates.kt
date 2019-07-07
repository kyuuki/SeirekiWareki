// 和暦日付
package com.example.seirekiwareki

import java.text.SimpleDateFormat

val df = SimpleDateFormat("yyyy-MM-dd")
val GENGOU_DATA = listOf(
    // 時代が新しいものを前に置く必要がある。
    mapOf("startDate" to df.parse("2019-05-01"), "kanji" to "令和"),
    mapOf("startDate" to df.parse("1989-01-07"), "kanji" to "平成"),
    mapOf("startDate" to df.parse("1926-12-25"), "kanji" to "昭和"),
    mapOf("startDate" to df.parse("1912-07-30"), "kanji" to "大正"),
    mapOf("startDate" to df.parse("1868-10-23"), "kanji" to "明治")
)
