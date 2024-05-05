package com.adnansapplication.app.modules.productdetail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adnansapplication.app.modules.productdetail.`data`.model.ProductDetailModel
import com.adnansapplication.app.modules.productdetail.`data`.model.RecomendedRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProductDetailVM : ViewModel(), KoinComponent {
  val productDetailModel: MutableLiveData<ProductDetailModel> =
      MutableLiveData(ProductDetailModel())

  var navArguments: Bundle? = null

  val recomendedList: MutableLiveData<MutableList<RecomendedRowModel>> =
      MutableLiveData(mutableListOf())
}
