package com.three.listview_review

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val list_item = mutableListOf<String>()
//        list_item.add("A")
//        list_item.add("B")
//        list_item.add("C")

        val list_item2 = mutableListOf<ListViewModel>()
        list_item2.add(ListViewModel("제목", "내용"))
        list_item2.add(ListViewModel("책 제목", "요약"))
        list_item2.add(ListViewModel("영화 제목", "영화 줄거리"))

        val listView = findViewById<ListView>(R.id.mainListView)

        val listViewAdapter = ListViewAdapter(list_item2)

        listView.adapter = listViewAdapter

        // ListView 개별 요소 클릭 확인
        listView.setOnItemClickListener { parent, view, position, id ->
//            Toast.makeText(this, list_item[position], Toast.LENGTH_LONG).show()
        }
    }
}