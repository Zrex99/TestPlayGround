package com.zoportfolio.kotlintestproject.retrofitTest

import com.google.gson.annotations.SerializedName

class AssetDataResponse {

    @SerializedName("id")
    var assetId: String? = null
    @SerializedName("class")
    var assetClass: String? = null
    @SerializedName("exchange")
    var assetExchange: String? = null
    @SerializedName("symbol")
    var assetSymbol: String? = null
    @SerializedName("status")
    var assetStatus: String? = null
    @SerializedName("tradable")
    var assetTradable: Boolean? = null
    @SerializedName("marginable")
    var assetMarginable: Boolean? = null
    @SerializedName("shortable")
    var assetShortable: Boolean? = null
    @SerializedName("easy_to_borrow")
    var assetEasyToBorrow: Boolean? = null

}