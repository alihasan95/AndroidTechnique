package com.team_l.ali.androidtechnique.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.team_l.ali.androidtechnique.R
import com.team_l.ali.androidtechnique.data.model.ImgClass
import com.team_l.ali.androidtechnique.data.model.MainView
import com.team_l.ali.androidtechnique.data.model.TextClass
import com.team_l.ali.androidtechnique.ui.adapter.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this)
        val list = mutableListOf(TextClass(resources.getString(R.string.short_text)),
                ImgClass("hello world !",R.drawable.google_wants))
        main_recycler_view.layoutManager = layoutManager
        main_recycler_view.adapter = MainAdapter(list)




    }
}
