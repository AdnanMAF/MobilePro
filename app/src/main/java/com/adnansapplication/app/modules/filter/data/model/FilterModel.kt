package com.adnansapplication.app.modules.filter.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FilterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFilterSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceRange: String? = MyApp.getInstance().resources.getString(R.string.lbl_price_range)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_245)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_344)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCondition: String? = MyApp.getInstance().resources.getString(R.string.lbl_condition)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsedSelected: String? = MyApp.getInstance().resources.getString(R.string.lbl_used)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotSpecifiedS: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_not_specified)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuyingFormat: String? = MyApp.getInstance().resources.getString(R.string.lbl_buying_format)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAcceptsOffers: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_accepts_offers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemLocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_item_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNorthAmericaS: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_north_america)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShowOnly: String? = MyApp.getInstance().resources.getString(R.string.lbl_show_only)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNewValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etAllListingsValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etAuctionValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etUSOnlyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEuropeValue: String? = null
)
