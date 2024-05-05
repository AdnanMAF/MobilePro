package com.adnansapplication.app.modules.changepassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adnansapplication.app.modules.changepassword.`data`.model.ChangePasswordModel
import com.adnansapplication.app.modules.changepassword.`data`.model.ListoldpasswordRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChangePasswordVM : ViewModel(), KoinComponent {
  val changePasswordModel: MutableLiveData<ChangePasswordModel> =
      MutableLiveData(ChangePasswordModel())

  var navArguments: Bundle? = null

  val listoldpasswordList: MutableLiveData<MutableList<ListoldpasswordRowModel>> =
      MutableLiveData(mutableListOf())
}
