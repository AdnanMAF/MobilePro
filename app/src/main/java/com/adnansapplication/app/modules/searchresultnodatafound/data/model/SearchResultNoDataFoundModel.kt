package com.adnansapplication.app.modules.searchresultnodatafound.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchResultNoDataFoundModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtResultCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_result)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductNotFou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_product_not_found)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThankyoufors: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_shopping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchFormValue: String? = null
)
