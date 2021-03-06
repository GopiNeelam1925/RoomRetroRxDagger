package com.github.angads25.roomretrorxdagger.architecture.contract

import com.github.angads25.roomretrorxdagger.architecture.model.PropertyListing

interface PropertyContract {

    interface PropertyView {

        fun onError(t: Throwable)

        fun showProgress()

        fun hideProgress()

        fun showData(propertyListing: List<PropertyListing>)

        fun onRefresh()
    }

    interface PropertyPresenter {

        fun loadData()

        fun dumpData()
    }
}
