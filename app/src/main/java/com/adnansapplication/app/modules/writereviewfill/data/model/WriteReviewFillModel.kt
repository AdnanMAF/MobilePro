package com.adnansapplication.app.modules.writereviewfill.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WriteReviewFillModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWriteReview: String? = MyApp.getInstance().resources.getString(R.string.lbl_write_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleasewriteOv: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_write_overall)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWriteYourRevi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_write_your_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddReview: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_review)

)
