package com.koocan.report

import java.text.SimpleDateFormat
import java.util.*


/**
 * 广告浏览数据
 */
class AdExhibitionEvent(var userGroupId: String?) {
    var date: String? = null
    var ads: List<AdBaseEvent>? = null


    init {

        date = SimpleDateFormat("yyyy-MM-dd").format(Date())

        ads = ArrayList()

    }


}
