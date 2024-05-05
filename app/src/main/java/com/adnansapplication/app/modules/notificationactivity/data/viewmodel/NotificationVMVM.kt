package com.adnansapplication.app.modules.notificationactivity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adnansapplication.app.modules.notificationactivity.`data`.model.ListarleftOneRowModel
import com.adnansapplication.app.modules.notificationactivity.`data`.model.NotificationModelModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificationVMVM : ViewModel(), KoinComponent {
  val notificationModelModel: MutableLiveData<NotificationModelModel> =
      MutableLiveData(NotificationModelModel())

  var navArguments: Bundle? = null

  val listarrowleftOneList: MutableLiveData<MutableList<ListarleftOneRowModel>> =
      MutableLiveData(mutableListOf())
}
