package com.adnansapplication.app.modules.offerscreen.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OfferScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.lbl_offer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfferOne: String? = MyApp.getInstance().resources.getString(R.string.msg_use_megsl_cupon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfferTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_super_flash_sale_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHours: String? = MyApp.getInstance().resources.getString(R.string.lbl_08)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFive: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMinutes: String? = MyApp.getInstance().resources.getString(R.string.lbl_34)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSix: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSecounds: String? = MyApp.getInstance().resources.getString(R.string.lbl_52)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfferThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_90_off_super_mega)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_special_birthday)

)
