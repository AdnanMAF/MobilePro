package com.adnansapplication.app.modules.changepassword.ui

import android.view.View
import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityChangePasswordBinding
import com.adnansapplication.app.modules.changepassword.`data`.model.ListoldpasswordRowModel
import com.adnansapplication.app.modules.changepassword.`data`.viewmodel.ChangePasswordVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChangePasswordActivity :
    BaseActivity<ActivityChangePasswordBinding>(R.layout.activity_change_password) {
  private val viewModel: ChangePasswordVM by viewModels<ChangePasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listoldpasswordAdapter =
    ListoldpasswordAdapter(viewModel.listoldpasswordList.value?:mutableListOf())
    binding.recyclerListoldpassword.adapter = listoldpasswordAdapter
    listoldpasswordAdapter.setOnItemClickListener(
    object : ListoldpasswordAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListoldpasswordRowModel) {
        onClickRecyclerListoldpassword(view, position, item)
      }
    }
    )
    viewModel.listoldpasswordList.observe(this) {
      listoldpasswordAdapter.updateData(it)
    }
    binding.changePasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListoldpassword(
    view: View,
    position: Int,
    item: ListoldpasswordRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHANGE_PASSWORD_ACTIVITY"

  }
}
