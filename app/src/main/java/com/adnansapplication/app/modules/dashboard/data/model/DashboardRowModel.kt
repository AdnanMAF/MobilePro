package com.adnansapplication.app.modules.dashboard.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeAirMaxRe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_270)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOneSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_534_33)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfferSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_24_off)

)
