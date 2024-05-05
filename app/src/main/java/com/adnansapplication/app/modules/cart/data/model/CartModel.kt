package com.adnansapplication.app.modules.cart.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItems: String? = MyApp.getInstance().resources.getString(R.string.lbl_items_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_598_86)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShipping: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_40_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImportcharges: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_import_charges)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_128_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_766_86)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etCoponcodefielValue: String? = null
)
