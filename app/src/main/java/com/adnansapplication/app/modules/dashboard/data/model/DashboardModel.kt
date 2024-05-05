package com.adnansapplication.app.modules.dashboard.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchProduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_search_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMoreCategoryL: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_more_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtManShirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shirt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfficeBag: String? = MyApp.getInstance().resources.getString(R.string.lbl_office_bag)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDress: String? = MyApp.getInstance().resources.getString(R.string.lbl_dress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWomanBag: String? = MyApp.getInstance().resources.getString(R.string.lbl_woman_bag)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtManShoes: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shoes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFlashSale: String? = MyApp.getInstance().resources.getString(R.string.lbl_flash_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeMoreLink: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMegaSale: String? = MyApp.getInstance().resources.getString(R.string.lbl_mega_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeMoreLinkOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)

)
