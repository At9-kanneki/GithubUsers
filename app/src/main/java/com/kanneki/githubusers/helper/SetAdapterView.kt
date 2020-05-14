package com.kanneki.githubusers.helper

import android.view.LayoutInflater
import android.view.View
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.kanneki.githubusers.R
import com.kanneki.githubusers.provider.ApplicationContextProvider
import kotlinx.android.synthetic.main.recyclerview_empty.view.*

class SetAdapterView {

    companion object {
        val TYPE_ERROR = 0
        val TYPE_EMPTY = 1
        val TYPE_LOAD = 2

        fun <T> showErrorView(adapter: BaseQuickAdapter<T, BaseViewHolder>) {
            SetAdapterView().setAdapterView(
                adapter,
                ApplicationContextProvider.getContext().getString(R.string.recyclerview_error),
                TYPE_ERROR
            )
        }

        fun <T> showEmptyView(adapter: BaseQuickAdapter<T, BaseViewHolder>) {
            SetAdapterView().setAdapterView(
                adapter,
                ApplicationContextProvider.getContext().getString(R.string.recyclerview_empty),
                TYPE_EMPTY
            )
        }

        fun <T> showLoadView(adapter: BaseQuickAdapter<T, BaseViewHolder>) {
            SetAdapterView().setAdapterView(adapter, "", TYPE_LOAD)
        }
    }

    private fun<T> setAdapterView(
        adapter: BaseQuickAdapter<T, BaseViewHolder>,
        msg: String,
        type: Int
    ){

        val emptyView = LayoutInflater.from(
            ApplicationContextProvider.getContext()
        ).inflate(R.layout.recyclerview_empty, null)

        when(type) {
            TYPE_ERROR -> {
                emptyView.progressBar.visibility = View.GONE
                emptyView.recyclerviewText.visibility = View.VISIBLE
                emptyView.recyclerviewText.text = msg
            }
            TYPE_EMPTY -> {
                emptyView.progressBar.visibility = View.GONE
                emptyView.recyclerviewText.visibility = View.VISIBLE
                emptyView.recyclerviewText.text = msg
            }
            TYPE_LOAD -> {
                emptyView.progressBar.visibility = View.VISIBLE
                emptyView.recyclerviewText.visibility = View.GONE
            }
        } // end when

        // 數據清空才會顯示空布局
        adapter.data.clear()
        adapter.setEmptyView(emptyView)
        adapter.notifyDataSetChanged()
    }
}