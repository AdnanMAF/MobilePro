package com.adnansapplication.app.modules.superflashsale.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SuperFlashSaleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSuperFlashSal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_super_flash_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.msg_super_flash_sale_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClock: String? = MyApp.getInstance().resources.getString(R.string.lbl_08)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMinutes: String? = MyApp.getInstance().resources.getString(R.string.lbl_34)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSecounds: String? = MyApp.getInstance().resources.getString(R.string.lbl_52)

)
