package com.adnansapplication.app.modules.favoriteproduct.`data`.model

import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FavoriteProductModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFavoriteProduc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_favorite_product)

)
