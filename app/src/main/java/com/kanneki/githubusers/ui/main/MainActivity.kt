package com.kanneki.githubusers.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.GridLayoutManager
import com.kanneki.githubusers.R
import com.kanneki.githubusers.helper.FakeData
import com.kanneki.githubusers.ui.detail.DetailActivity
import kotlinx.android.synthetic.main.activity_recyclerview.*

class MainActivity : AppCompatActivity() {

    private val mAdapter: MainRecyclerViewAdapter = MainRecyclerViewAdapter(FakeData.mainList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)
        initView()
    }

    private fun initView() {
        recyclerview.apply {
            adapter = mAdapter
            layoutManager = GridLayoutManager(this@MainActivity, 1)
        }

        val headerView = LayoutInflater.from(this).inflate(R.layout.recyclerview_main_heard, recyclerview, false)
        mAdapter.addHeaderView(headerView)

        mAdapter.setOnItemClickListener { adapter, view, position ->

            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }
}
