package ssc.chauhan.toastlibrary

import android.view.Gravity
import android.widget.Toast

object Toaster {


    fun <T> showOnBottom(message: T?) {
        message?.let { Toast.makeText(ToastInject.appContext, "$it", Toast.LENGTH_SHORT).show() }
    }

    fun <T> showOnCenter(message: T?) {
        message?.let { msg ->
            val toast = Toast.makeText(ToastInject.appContext, "$msg", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()

        }
    }

    fun <T> showOnTop(message: T?) {
        message?.let { msg ->
            val toast = Toast.makeText(ToastInject.appContext, "$msg", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP, 0, 0)
            toast.show()
        }
    }

    fun <T> showWithGravity(message: T?, gravity: Int = Gravity.BOTTOM) {
        message?.let { msg ->
            val toast = Toast.makeText(ToastInject.appContext, "$msg", Toast.LENGTH_SHORT)
            toast.setGravity(gravity, 0, 0)
            toast.show()
        }
    }


}


