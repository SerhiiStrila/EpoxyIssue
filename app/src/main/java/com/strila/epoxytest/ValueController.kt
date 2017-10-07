package com.strila.epoxytest

import com.airbnb.epoxy.EpoxyController

/**
 * Created by Serhii Strila on 10/8/17
 */

class ValueController : EpoxyController() {

    private var items: List<Data>? = null

    fun setItems(items: List<Data>) {
        this.items = items
        requestModelBuild()
    }

    override fun buildModels() {
        items?.forEach {
            valueViewModel {
                id(it.id)
                value(it.value)
                if (it.error != null) error(it.error)
            }
        }
    }
}