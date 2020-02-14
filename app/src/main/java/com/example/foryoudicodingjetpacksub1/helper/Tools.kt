package com.example.foryoudicodingjetpacksub1.helper

import android.app.Activity
import android.content.Context
import android.os.Build
import android.util.TypedValue
import android.view.WindowManager
import androidx.annotation.ColorRes

class Tools {
    companion object {

        fun dpToPx(c: Context?, dp: Int): Int {
            val r = c?.resources
            return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp.toFloat(), r?.displayMetrics))
        }

        fun displayrating(rating: Float): Float {
            return rating / 2
        }

        fun setSystemBarColor(act: Activity, @ColorRes color: Int) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                val window = act.window
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                window.statusBarColor = act.resources.getColor(color)
            }
        }
    }
}