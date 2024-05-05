package com.adnansapplication.app.modules.successscreen.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SuccessScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThankyoufors: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_shopping)

)
