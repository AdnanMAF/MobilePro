package com.adnansapplication.app.modules.addpayment.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddPaymentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreditCardOr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_credit_card_or_debit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaypal: String? = MyApp.getInstance().resources.getString(R.string.lbl_paypal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBankTransfer: String? = MyApp.getInstance().resources.getString(R.string.lbl_bank_transfer)

)
