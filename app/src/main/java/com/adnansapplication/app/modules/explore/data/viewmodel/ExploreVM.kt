package com.adnansapplication.app.modules.explore.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adnansapplication.app.modules.explore.`data`.model.ExploreModel
import com.adnansapplication.app.modules.explore.`data`.model.GridbagRowModel
import com.adnansapplication.app.modules.explore.`data`.model.GridvectorOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ExploreVM : ViewModel(), KoinComponent {
  val exploreModel: MutableLiveData<ExploreModel> = MutableLiveData(ExploreModel())

  var navArguments: Bundle? = null

  val gridbagList: MutableLiveData<MutableList<GridbagRowModel>> = MutableLiveData(mutableListOf())

  val gridvectorOneList: MutableLiveData<MutableList<GridvectorOneRowModel>> =
      MutableLiveData(mutableListOf())
}
