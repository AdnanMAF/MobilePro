package com.adnansapplication.app.modules.notificationfeed.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adnansapplication.app.modules.notificationfeed.`data`.model.ListnewproductRowModel
import com.adnansapplication.app.modules.notificationfeed.`data`.model.NotificationFeedModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificationFeedVM : ViewModel(), KoinComponent {
  val notificationFeedModel: MutableLiveData<NotificationFeedModel> =
      MutableLiveData(NotificationFeedModel())

  var navArguments: Bundle? = null

  val listnewproductList: MutableLiveData<MutableList<ListnewproductRowModel>> =
      MutableLiveData(mutableListOf())
}
