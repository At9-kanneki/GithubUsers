package com.kanneki.githubusers.ui.main

import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.kanneki.githubusers.R
import com.kanneki.githubusers.module.UserModule

class MainRecyclerViewAdapter (list: ArrayList<UserModule> = arrayListOf()):
    BaseQuickAdapter<UserModule, BaseViewHolder>(R.layout.recyclerview_main_cell, list){


    override fun convert(helper: BaseViewHolder, item: UserModule) {

        helper.setText(R.id.name, item.login)
        helper.setGone(R.id.isAdmin, item.site_admin)

        Glide.with(helper.itemView)
            .load(item.avatar_url)
            .apply(RequestOptions.bitmapTransform(CircleCrop()))
            .into(helper.getView(R.id.userIcon))
    }
}