package com.adnansapplication.app.modules.lailyfafebrinacard.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LailyfaFebrinaCardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLailyfaFebrina: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lailyfa_febrina)
  ,
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
  var txtLailyfaFebrinaOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lailyfa_febrina)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDebitcardexpi: String? = MyApp.getInstance().resources.getString(R.string.lbl_06_24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpirationDate: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_expiration_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSecurityCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_security_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardHolderOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_holder2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etCardNumberOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etExpirationDateOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etZipcodeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etCardholdernamValue: String? = null
)
