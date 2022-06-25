package net.trancool.simpletasklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Create an instance of the datasource
        val taskList = TaskList().loadList() //store data
//        access the recyclerview
        val recyclerView : RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = TaskAdapter(this, taskList)
        recyclerView.setHasFixedSize(true)

    }
}