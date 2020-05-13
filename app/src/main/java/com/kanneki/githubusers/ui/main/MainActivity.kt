package com.kanneki.githubusers.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.kanneki.githubusers.R
import com.kanneki.githubusers.helper.Constant
import com.kanneki.githubusers.helper.FakeData
import com.kanneki.githubusers.module.UserModule
import com.kanneki.githubusers.ui.detail.DetailActivity
import kotlinx.android.synthetic.main.activity_recyclerview.*

class MainActivity : AppCompatActivity() {

    private val mAdapter: MainRecyclerViewAdapter = MainRecyclerViewAdapter()
    private val viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)
        initView()
    }

    override fun onStart() {
        super.onStart()
        viewModel.getAll()
    }

    private fun initView() {
        recyclerview.apply {
            adapter = mAdapter
            layoutManager = GridLayoutManager(this@MainActivity, 1)
        }

        val headerView = LayoutInflater.from(this).inflate(R.layout.recyclerview_main_heard, recyclerview, false)
        mAdapter.addHeaderView(headerView)

        mAdapter.setOnItemClickListener { adapter, _, position ->
            val item = adapter.getItem(position) as? UserModule

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(Constant.extraNameKey, item?.login)
            startActivity(intent)
        }

        viewModel.getDataList.observe(this, Observer { data ->
            mAdapter.setNewData(data)
        })
    }
}
