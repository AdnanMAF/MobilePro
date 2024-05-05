package com.adnansapplication.app.modules.shipto.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adnansapplication.app.modules.shipto.`data`.model.AddressRowModel
import com.adnansapplication.app.modules.shipto.`data`.model.ShipToModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ShipToVM : ViewModel(), KoinComponent {
  val shipToModel: MutableLiveData<ShipToModel> = MutableLiveData(ShipToModel())

  var navArguments: Bundle? = null

  val addressList: MutableLiveData<MutableList<AddressRowModel>> = MutableLiveData(mutableListOf())
}
