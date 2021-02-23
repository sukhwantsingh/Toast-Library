package ssc.chauhan.toastlibrary

import android.view.Gravity
import android.widget.Toast

object Toaster {


    fun <T> showOnBottom(message: T?) {
        message?.let { Toast.makeText(ToastInject.appContext, "$it", Toast.LENGTH_SHORT).show() }
    }

    fun <T> showOnCenter(message: T?) {
        message?.let { msg ->
            val toast = Toast(ToastInject.appContext).also {
                it.setGravity(Gravity.CENTER, 0, 0)
                it.setText("$msg")
                it.duration = Toast.LENGTH_SHORT

            }
            toast.show()

        }
    }

    fun <T> showOnTop(message: T?) {
        message?.let { msg ->
            val toast = Toast(ToastInject.appContext).also {
                it.setGravity(Gravity.TOP, 0, 0)
                it.setText("$msg")
                it.duration = Toast.LENGTH_SHORT
                it.show()
            }
        }
    }

    fun <T> showWithGravity(message: T?, gravity: Int = Gravity.BOTTOM) {
        message?.let { msg ->
            val toast = Toast(ToastInject.appContext).also {
                it.setGravity(gravity, 0, 0)
                it.setText("$msg")
                it.duration = Toast.LENGTH_SHORT
            }
            toast.show()
        }
    }


}


