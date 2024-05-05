package com.adnansapplication.app.modules.sortby.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SortByModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSortBy: String? = MyApp.getInstance().resources.getString(R.string.lbl_sort_by)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBestMatch: String? = MyApp.getInstance().resources.getString(R.string.lbl_best_match)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeendingso: String? =
      MyApp.getInstance().resources.getString(R.string.msg_time_ending_soonest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimenewlylis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_time_newly_listed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceShippin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_price_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceShippinOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_price_shipping2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistanceneare: String? =
      MyApp.getInstance().resources.getString(R.string.msg_distance_nearest)

)
