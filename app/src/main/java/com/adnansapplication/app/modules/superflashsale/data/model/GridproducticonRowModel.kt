package com.adnansapplication.app.modules.superflashsale.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GridproducticonRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeAirMaxRe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_270)
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
