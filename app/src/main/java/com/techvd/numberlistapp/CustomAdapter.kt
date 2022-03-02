package com.techvd.numberlistapp

import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var arraylist: ArrayList<Data>) : BaseAdapter() {
    override fun getCount() = arraylist.size

    override fun getItem(position: Int) = arraylist[position]
    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val context = parent?.context
        val inflater: LayoutInflater =
            context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView: View = inflater.inflate(R.layout.item_list, parent, false)
        val item = arraylist[position]
        val numberTextview = rowView.findViewById<TextView>(R.id.number_text_view)
        numberTextview.text = item.number

        val audioImage = rowView.findViewById<ImageView>(R.id.audio_image_view)
        audioImage.setOnClickListener {
            val mediaPlayer =
                MediaPlayer.create(
                    context,
                    context.resources.getIdentifier(item.audioImage, "raw", context.packageName)
                )
            mediaPlayer.start()
        }
        return rowView
    }
}