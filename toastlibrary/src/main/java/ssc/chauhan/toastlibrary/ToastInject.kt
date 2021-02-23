package ssc.chauhan.toastlibrary

import android.content.Context
import java.lang.ref.WeakReference

class ToastInject {
    companion object {
        var appContext: Context? = null

        fun inject(ctx: Context) {
            appContext = WeakReference(ctx.applicationContext).get()
        }
    }

}

// Yeah sure, would be a pleasure to start it ASAP. I can comply with the requirements.