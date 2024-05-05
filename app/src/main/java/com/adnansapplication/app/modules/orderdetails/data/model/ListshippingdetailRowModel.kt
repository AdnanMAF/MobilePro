package com.adnansapplication.app.modules.orderdetails.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListshippingdetailRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingDetail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shipping_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateShipping: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonth: String? = MyApp.getInstance().resources.getString(R.string.msg_january_16_2020)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPOSReggular: String? = MyApp.getInstance().resources.getString(R.string.lbl_pos_reggular)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoResi: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_resi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResinumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_000192848573)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_2727_new_owerri)

)
