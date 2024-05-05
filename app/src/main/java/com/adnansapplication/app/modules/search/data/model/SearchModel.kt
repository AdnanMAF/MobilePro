package com.adnansapplication.app.modules.search.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeAirMax: String? = MyApp.getInstance().resources.getString(R.string.lbl_nike_air_max)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_2703)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeAirVaporm: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_vapormax)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_2703)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeAirMaxTwentySeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_2704)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeAirVaporMOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_vapormax2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeAirMaxNinetySeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_97)

)
