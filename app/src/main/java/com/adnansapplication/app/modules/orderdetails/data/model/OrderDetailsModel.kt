package com.adnansapplication.app.modules.orderdetails.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OrderDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPacking: String? = MyApp.getInstance().resources.getString(R.string.lbl_packing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShipping: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArriving: String? = MyApp.getInstance().resources.getString(R.string.lbl_arriving)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProduct: String? = MyApp.getInstance().resources.getString(R.string.lbl_product)

)
