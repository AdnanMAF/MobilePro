package com.adnansapplication.app.modules.notificationoffer.ui

import android.view.View
import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityNotificationOfferBinding
import com.adnansapplication.app.modules.notificationoffer.`data`.model.ListsortRowModel
import com.adnansapplication.app.modules.notificationoffer.`data`.viewmodel.NotificationOfferVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationOfferActivity :
    BaseActivity<ActivityNotificationOfferBinding>(R.layout.activity_notification_offer) {
  private val viewModel: NotificationOfferVM by viewModels<NotificationOfferVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsortAdapter = ListsortAdapter(viewModel.listsortList.value?:mutableListOf())
    binding.recyclerListsort.adapter = listsortAdapter
    listsortAdapter.setOnItemClickListener(
    object : ListsortAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsortRowModel) {
        onClickRecyclerListsort(view, position, item)
      }
    }
    )
    viewModel.listsortList.observe(this) {
      listsortAdapter.updateData(it)
    }
    binding.notificationOfferVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListsort(
    view: View,
    position: Int,
    item: ListsortRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_OFFER_ACTIVITY"

  }
}
