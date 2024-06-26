package com.adnansapplication.app.modules.favoriteproduct.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adnansapplication.app.modules.favoriteproduct.`data`.model.FavoriteProductModel
import com.adnansapplication.app.modules.favoriteproduct.`data`.model.GridnikeairmaxreRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FavoriteProductVM : ViewModel(), KoinComponent {
  val favoriteProductModel: MutableLiveData<FavoriteProductModel> =
      MutableLiveData(FavoriteProductModel())

  var navArguments: Bundle? = null

  val gridnikeairmaxreList: MutableLiveData<MutableList<GridnikeairmaxreRowModel>> =
      MutableLiveData(mutableListOf())
}
