package com.adnansapplication.app.modules.reviewproduct.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ReviewProductModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_review2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJamesLawson: String? = MyApp.getInstance().resources.getString(R.string.lbl_james_lawson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_air_max_are_always)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.msg_december_10_2016)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLauraOctavian: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_laura_octavian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThisisreally: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_is_really_amazing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateOne: String? = MyApp.getInstance().resources.getString(R.string.msg_december_10_2016)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJhonsonBridge: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jhonson_bridge)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_air_max_are_always2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_december_10_2016)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLauraOctavianOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_laura_octavian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThisisreallyOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_is_really_amazing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateThree: String? = MyApp.getInstance().resources.getString(R.string.msg_december_10_2016)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJhonsonBridgeOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jhonson_bridge)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_air_max_are_always2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateFour: String? = MyApp.getInstance().resources.getString(R.string.msg_december_10_2016)

)
