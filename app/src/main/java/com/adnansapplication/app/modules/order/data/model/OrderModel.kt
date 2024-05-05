package com.adnansapplication.app.modules.order.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OrderModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrder: String? = MyApp.getInstance().resources.getString(R.string.lbl_order)

)
