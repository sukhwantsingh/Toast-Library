package ssc.chauhan.toastlibrary

import android.view.Gravity
import android.widget.Toast

object Toaster {


    fun <T> showOnBottom(message: T?) {
        message?.let { Toast.makeText(ToastInject.appContext, "$it", Toast.LENGTH_SHORT).show() }
    }

    fun <T> showOnCenter(message: T?) {
        message?.let { msg ->
            val toast = Toast(ToastInject.appContext).also { it ->
                it.setGravity(Gravity.CENTER, 0, 0)
                it.setText("$msg")
                it.duration = Toast.LENGTH_SHORT
                it.show()
            }

        }
    }

 fun <T> showOnTop(message: T?) {
        message?.let { msg ->
            val toast = Toast(ToastInject.appContext).also { it ->
                it.setGravity(Gravity.TOP, 0, 0)
                it.setText("$msg")
                it.duration = Toast.LENGTH_SHORT
                it.show()
            }
        }
    }


}


