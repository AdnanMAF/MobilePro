package com.adnansapplication.app.modules.notificationfeed.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationFeedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFeed: String? = MyApp.getInstance().resources.getString(R.string.lbl_feed)

)
