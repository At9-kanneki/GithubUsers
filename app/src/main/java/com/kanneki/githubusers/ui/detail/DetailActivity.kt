package com.kanneki.githubusers.ui.detail

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import com.kanneki.githubusers.R
import com.kanneki.githubusers.helper.FakeData
import com.kanneki.githubusers.module.UserDetailModule
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initView()
        setView(FakeData.detailData)
    }

    private fun initView() {
        toolbarT.setNavigationIcon(R.drawable.ic_clear_black_24dp)
        toolbarT.setNavigationOnClickListener {
            finish()
        }
    }


    private fun setView(data: UserDetailModule? = null) {
        detailUserName.text = data?.name ?: ""
        nameText.text = data?.login ?: ""
        locationText.text = data?.location ?: ""
        linkText.text = data?.blog ?: ""
        isAdmin.visibility = if (data?.site_admin == true) {
            View.VISIBLE
        } else {
            View.GONE
        }

        Glide.with(this)
            .load(data?.avatar_url)
            .apply(RequestOptions.bitmapTransform(CircleCrop()))
            .into(detailUserIcon)
    }
}