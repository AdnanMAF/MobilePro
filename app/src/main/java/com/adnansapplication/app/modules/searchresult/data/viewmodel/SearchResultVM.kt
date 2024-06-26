package com.adnansapplication.app.modules.searchresult.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adnansapplication.app.modules.searchresult.`data`.model.SearchResultModel
import com.adnansapplication.app.modules.searchresult.`data`.model.SearchResultRowModel
import com.adnansapplication.app.modules.searchresult.`data`.model.SpinnerGroupFiveModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchResultVM : ViewModel(), KoinComponent {
  val searchResultModel: MutableLiveData<SearchResultModel> = MutableLiveData(SearchResultModel())

  var navArguments: Bundle? = null

  val spinnerGroupFiveList: MutableLiveData<MutableList<SpinnerGroupFiveModel>> = MutableLiveData()

  val searchResultList: MutableLiveData<MutableList<SearchResultRowModel>> =
      MutableLiveData(mutableListOf())
}
