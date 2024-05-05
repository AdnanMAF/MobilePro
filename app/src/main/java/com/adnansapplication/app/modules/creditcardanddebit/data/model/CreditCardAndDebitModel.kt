package com.adnansapplication.app.modules.creditcardanddebit.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CreditCardAndDebitModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreditCardAnd: String? =
      MyApp.getInstance().resources.getString(R.string.msg_credit_card_and)

)
