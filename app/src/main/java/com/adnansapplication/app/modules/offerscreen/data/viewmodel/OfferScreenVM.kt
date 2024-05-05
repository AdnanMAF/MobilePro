package com.adnansapplication.app.modules.offerscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adnansapplication.app.modules.offerscreen.`data`.model.OfferScreenModel
import org.koin.core.KoinComponent

class OfferScreenVM : ViewModel(), KoinComponent {
  val offerScreenModel: MutableLiveData<OfferScreenModel> = MutableLiveData(OfferScreenModel())

  var navArguments: Bundle? = null
}
