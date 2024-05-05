package com.adnansapplication.app.modules.notificationfeed.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListnewproductRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewProduct: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeAirZoomP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_pegasus2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_june_3_2015_5_06)

)
