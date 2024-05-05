package com.adnansapplication.app.modules.superflashsale.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adnansapplication.app.modules.superflashsale.`data`.model.GridproducticonRowModel
import com.adnansapplication.app.modules.superflashsale.`data`.model.SuperFlashSaleModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SuperFlashSaleVM : ViewModel(), KoinComponent {
  val superFlashSaleModel: MutableLiveData<SuperFlashSaleModel> =
      MutableLiveData(SuperFlashSaleModel())

  var navArguments: Bundle? = null

  val gridproducticonList: MutableLiveData<MutableList<GridproducticonRowModel>> =
      MutableLiveData(mutableListOf())
}
