package com.adnansapplication.app.modules.notificationfeed.ui

import android.view.View
import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityNotificationFeedBinding
import com.adnansapplication.app.modules.notificationfeed.`data`.model.ListnewproductRowModel
import com.adnansapplication.app.modules.notificationfeed.`data`.viewmodel.NotificationFeedVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationFeedActivity :
    BaseActivity<ActivityNotificationFeedBinding>(R.layout.activity_notification_feed) {
  private val viewModel: NotificationFeedVM by viewModels<NotificationFeedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listnewproductAdapter =
    ListnewproductAdapter(viewModel.listnewproductList.value?:mutableListOf())
    binding.recyclerListnewproduct.adapter = listnewproductAdapter
    listnewproductAdapter.setOnItemClickListener(
    object : ListnewproductAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListnewproductRowModel) {
        onClickRecyclerListnewproduct(view, position, item)
      }
    }
    )
    viewModel.listnewproductList.observe(this) {
      listnewproductAdapter.updateData(it)
    }
    binding.notificationFeedVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListnewproduct(
    view: View,
    position: Int,
    item: ListnewproductRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_FEED_ACTIVITY"

  }
}
