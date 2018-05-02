package com.team_l.ali.androidtechnique.data.model

/**
 * Created by ali on 4/30/2018.
 */
sealed class MainView

class TextClass(val text: String) : MainView()

class ImgClass(val text: String, val imgRes: Int) : MainView()