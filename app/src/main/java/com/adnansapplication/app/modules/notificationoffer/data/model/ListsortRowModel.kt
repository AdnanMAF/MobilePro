package com.adnansapplication.app.modules.notificationoffer.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListsortRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTheBestTitle: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_the_best_title)
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
