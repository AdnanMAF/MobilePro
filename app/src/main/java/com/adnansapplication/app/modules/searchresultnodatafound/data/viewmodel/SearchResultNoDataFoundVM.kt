package com.adnansapplication.app.modules.searchresultnodatafound.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adnansapplication.app.modules.searchresultnodatafound.`data`.model.SearchResultNoDataFoundModel
import com.adnansapplication.app.modules.searchresultnodatafound.`data`.model.SpinnerGroupFourModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchResultNoDataFoundVM : ViewModel(), KoinComponent {
  val searchResultNoDataFoundModel: MutableLiveData<SearchResultNoDataFoundModel> =
      MutableLiveData(SearchResultNoDataFoundModel())

  var navArguments: Bundle? = null

  val spinnerGroupFourList: MutableLiveData<MutableList<SpinnerGroupFourModel>> = MutableLiveData()
}
