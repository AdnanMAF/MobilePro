package com.adnansapplication.app.modules.notificationactivity.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListarleftOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionNik: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_nike)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_culpa_cillum_consectetur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_april_30_2014_1_01)

)
