package com.adnansapplication.app.modules.shipto.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddressRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPriscekila: String? = MyApp.getInstance().resources.getString(R.string.lbl_priscekila)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.msg_3711_spring_hill)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileNo: String? = MyApp.getInstance().resources.getString(R.string.lbl_99_1234567890)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEdit: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelete: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete)

)
