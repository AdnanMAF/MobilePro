package com.adnansapplication.app.modules.choosecreditordebitcard.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChooseCreditOrDebitCardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChooseCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_choose_card)

)
