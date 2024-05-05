package com.adnansapplication.app.modules.notificationactivity.ui

import android.view.View
import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityNotificationActivityBinding
import com.adnansapplication.app.modules.notificationactivity.`data`.model.ListarleftOneRowModel
import com.adnansapplication.app.modules.notificationactivity.`data`.viewmodel.NotificationVMVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationActivityActivity :
    BaseActivity<ActivityNotificationActivityBinding>(R.layout.activity_notification_activity) {
  private val viewModel: NotificationVMVM by viewModels<NotificationVMVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listarrowleftOneAdapter =
    ListarrowleftOneAdapter(viewModel.listarrowleftOneList.value?:mutableListOf())
    binding.recyclerListarrowleftOne.adapter = listarrowleftOneAdapter
    listarrowleftOneAdapter.setOnItemClickListener(
    object : ListarrowleftOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListarleftOneRowModel) {
        onClickRecyclerListarrowleftOne(view, position, item)
      }
    }
    )
    viewModel.listarrowleftOneList.observe(this) {
      listarrowleftOneAdapter.updateData(it)
    }
    binding.notificationVMVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListarrowleftOne(
    view: View,
    position: Int,
    item: ListarleftOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_ACTIVITY_ACTIVITY"

  }
}
