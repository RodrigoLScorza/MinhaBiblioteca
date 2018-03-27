package br.com.fiap.minhabiblioteca

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.custom_toast.view.*

/**
 * Created by logonrm on 26/03/2018.
 */
class CustomToast() {

    fun showToast(context: Context, msg: String) {
        val inflaiter = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val customToastRoot = inflaiter.inflate(R.layout.custom_toast, null)
        val customToast = Toast(context)

        customToast.view = customToastRoot

        customToastRoot.textView1.text = msg

        customToast.setGravity(Gravity.CENTER or Gravity.BOTTOM,0,0)
        customToast.duration = Toast.LENGTH_LONG
        customToast.show()
    }

}