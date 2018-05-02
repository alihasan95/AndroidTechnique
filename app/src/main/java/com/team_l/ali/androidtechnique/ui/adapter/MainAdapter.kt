package com.team_l.ali.androidtechnique.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.team_l.ali.androidtechnique.R
import com.team_l.ali.androidtechnique.data.model.ImgClass
import com.team_l.ali.androidtechnique.data.model.MainView
import com.team_l.ali.androidtechnique.data.model.TextClass

/**
 * Created by ali on 4/30/2018.
 */
class MainAdapter(private val list: MutableList<MainView>) : RecyclerView.Adapter<MainSealedViewHolder>() {

    companion object {
        const val TEXT_POST = 0
        const val IMG_POST = 1
    }

    override fun getItemViewType(position: Int): Int {
        return when (list[position]) {
            is TextClass -> TEXT_POST
            else -> IMG_POST
        }
    }

    override fun onBindViewHolder(holder: MainSealedViewHolder, position: Int) {
         when(holder) {
             is TextPost -> holder.bind(list[position] as TextClass)
             is ImagePost -> holder.bind(list[position] as ImgClass)
         }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainSealedViewHolder{
        return when(viewType) {
            TEXT_POST -> TextPost(LayoutInflater.from(parent.context).inflate(R.layout.view_text_post, parent, false))
            else -> ImagePost(LayoutInflater.from(parent.context).inflate(R.layout.view_img_post, parent, false))

        }
    }

    override fun getItemCount(): Int = list.count()


}