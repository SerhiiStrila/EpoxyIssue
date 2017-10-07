package com.strila.epoxytest

import android.content.Context
import android.view.View
import android.widget.FrameLayout
import com.airbnb.epoxy.ModelView
import com.airbnb.epoxy.TextProp
import kotlinx.android.synthetic.main.item_input.view.*

/**
 * Created by Serhii Strila on 10/8/17
 */
@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT, saveViewState = true)
class ValueViewModel(context: Context?) : FrameLayout(context) {

    init {
        View.inflate(context, R.layout.item_input, this)
    }

    @TextProp
    fun setValue(value: CharSequence?) {
        edtValue.setText(value)
    }

    @TextProp
    fun setError(error: CharSequence?) {
        tinValue.error = error
    }

}