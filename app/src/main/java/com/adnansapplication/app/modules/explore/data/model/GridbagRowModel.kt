package com.adnansapplication.app.modules.explore.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GridbagRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOfficeBag: String? = MyApp.getInstance().resources.getString(R.string.lbl_office_bag)

)
