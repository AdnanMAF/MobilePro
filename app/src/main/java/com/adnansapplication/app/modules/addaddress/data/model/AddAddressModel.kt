package com.adnansapplication.app.modules.addaddress.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddAddressModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryorregi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_country_or_region)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFirstName: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLastName: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStreetAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_street_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStreetAddressOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_street_address_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStateProvince: String? =
      MyApp.getInstance().resources.getString(R.string.msg_state_province_region)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_zip_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhoneNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etOldPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldPasswordOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldPasswordTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldPasswordThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldPasswordFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldPasswordFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldPasswordSixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldPasswordSevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldPasswordEightValue: String? = null
)
