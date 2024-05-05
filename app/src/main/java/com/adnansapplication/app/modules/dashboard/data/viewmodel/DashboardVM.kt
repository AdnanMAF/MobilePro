package com.adnansapplication.app.modules.dashboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adnansapplication.app.modules.dashboard.`data`.model.DashboardModel
import com.adnansapplication.app.modules.dashboard.`data`.model.DashboardRowModel
import com.adnansapplication.app.modules.dashboard.`data`.model.FlashsalesectRowModel
import com.adnansapplication.app.modules.dashboard.`data`.model.MegasalesectiRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DashboardVM : ViewModel(), KoinComponent {
  val dashboardModel: MutableLiveData<DashboardModel> = MutableLiveData(DashboardModel())

  var navArguments: Bundle? = null

  val flashSaleSectList: MutableLiveData<MutableList<FlashsalesectRowModel>> =
      MutableLiveData(mutableListOf())

  val megaSaleSectiList: MutableLiveData<MutableList<MegasalesectiRowModel>> =
      MutableLiveData(mutableListOf())

  val dashboardList: MutableLiveData<MutableList<DashboardRowModel>> =
      MutableLiveData(mutableListOf())
}
