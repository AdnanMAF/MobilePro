package com.adnansapplication.app.modules.searchresult.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchResultModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeAirMax: String? = MyApp.getInstance().resources.getString(R.string.lbl_nike_air_max)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResultCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_145_result)

)
