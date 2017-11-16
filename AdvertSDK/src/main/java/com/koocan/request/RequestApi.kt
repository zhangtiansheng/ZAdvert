package com.koocan.request

import retrofit2.http.*
import rx.Observable

/**
 * Created by Administrator on 2017/9/27.
 */

interface RequestApi {


    /**
     * 请求广告配置api接口
     *
     * @return
     */
    @Headers("Content-type:application/json;charset=utf-8")
    @POST("/get_config")
    fun getConfig(@Body json: String): Observable<String>


    /**
     * 广告浏览事件api接口
     *
     * @return
     */
    @Headers("Content-type:application/json;charset=utf-8")
    @POST("/send_report")
    fun sendReport(@Body json: String): Observable<String>


    /**
     *
     * @return
     */
    @Headers("Content-type:application/json;charset=utf-8")
    @GET("/promoCode")
    fun getPromoCode(@Query("code") id: String): Observable<String>

}
