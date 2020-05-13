package com.kanneki.githubusers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.GridLayoutManager
import com.kanneki.githubusers.helper.FakeData
import com.kanneki.githubusers.ui.main.MainRecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mAdapter: MainRecyclerViewAdapter = MainRecyclerViewAdapter(FakeData.mainList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        recyclerview.apply {
            adapter = mAdapter
            layoutManager = GridLayoutManager(this@MainActivity, 1)
        }

        val headerView = LayoutInflater.from(this).inflate(R.layout.recyclerview_main_heard, recyclerview, false)
        mAdapter.addHeaderView(headerView)
    }
}
