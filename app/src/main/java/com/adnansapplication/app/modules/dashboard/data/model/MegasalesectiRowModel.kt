package com.adnansapplication.app.modules.dashboard.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MegasalesectiRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMSNikeAirM: String? = MyApp.getInstance().resources.getString(R.string.msg_ms_nike_air_max)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOneThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_534_33)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfferFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_24_off)

)
