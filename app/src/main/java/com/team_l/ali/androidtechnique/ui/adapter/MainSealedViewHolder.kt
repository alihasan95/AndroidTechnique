package com.team_l.ali.androidtechnique.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import com.team_l.ali.androidtechnique.data.model.ImgClass
import com.team_l.ali.androidtechnique.data.model.TextClass
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.view_img_post.*
import kotlinx.android.synthetic.main.view_img_post.view.*

/**
 * Created by ali on 4/30/2018.
 */
sealed class MainSealedViewHolder(view: View?) : RecyclerView.ViewHolder(view)

class TextPost(override val containerView: View?) : MainSealedViewHolder(containerView), LayoutContainer {

    fun bind(obj: TextClass) {
        txtText.text = obj.text
    }
}

class ImagePost(override val containerView: View?) : MainSealedViewHolder(containerView), LayoutContainer {

    fun bind(obj: ImgClass) {
        txtText.text = obj.text
        img.setImageResource(obj.imgRes)
    }
}
