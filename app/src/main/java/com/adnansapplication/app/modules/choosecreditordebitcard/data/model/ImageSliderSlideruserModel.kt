package com.adnansapplication.app.modules.choosecreditordebitcard.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSlideruserModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_6326_9124)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCARDHOLDER: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_holder)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCARDSAVE: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_save)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDominicOvo: String? = MyApp.getInstance().resources.getString(R.string.lbl_dominic_ovo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDebitcardexpi: String? = MyApp.getInstance().resources.getString(R.string.lbl_06_24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageUser: String? = ""

)
