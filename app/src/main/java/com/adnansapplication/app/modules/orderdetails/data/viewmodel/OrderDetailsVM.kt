package com.adnansapplication.app.modules.orderdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adnansapplication.app.modules.orderdetails.`data`.model.ListnikeairzoompRowModel
import com.adnansapplication.app.modules.orderdetails.`data`.model.ListshippingdetailRowModel
import com.adnansapplication.app.modules.orderdetails.`data`.model.OrderDetailsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OrderDetailsVM : ViewModel(), KoinComponent {
  val orderDetailsModel: MutableLiveData<OrderDetailsModel> = MutableLiveData(OrderDetailsModel())

  var navArguments: Bundle? = null

  val listnikeairzoompList: MutableLiveData<MutableList<ListnikeairzoompRowModel>> =
      MutableLiveData(mutableListOf())

  val listshippingdetailList: MutableLiveData<MutableList<ListshippingdetailRowModel>> =
      MutableLiveData(mutableListOf())
}
