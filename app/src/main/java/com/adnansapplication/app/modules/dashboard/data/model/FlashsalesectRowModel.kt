package com.adnansapplication.app.modules.dashboard.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FlashsalesectRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFSNikeAirM: String? = MyApp.getInstance().resources.getString(R.string.msg_fs_nike_air_max)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_534_33)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfferOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_24_off)

)
