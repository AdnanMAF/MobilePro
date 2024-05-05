package com.adnansapplication.app.modules.shipto.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ShipToModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtShipTo: String? = MyApp.getInstance().resources.getString(R.string.lbl_ship_to)

)
