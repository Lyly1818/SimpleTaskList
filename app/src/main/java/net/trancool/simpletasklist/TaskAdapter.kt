package net.trancool.simpletasklist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter(
   private val context: Context,
   private   val taskList: List<Task>

) : RecyclerView.Adapter<TaskAdapter.ItemTaskViewHolder>() {

    class ItemTaskViewHolder(private val itemView: View): RecyclerView.ViewHolder(itemView) {

        val itemDisplay: TextView = itemView.findViewById(R.id.item_tv)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemTaskViewHolder {
//        TODO("Not yet implemented")
        val adapterLayout = LayoutInflater.from(parent.context) //pass the contxt the LayoutInflater
            .inflate(R.layout.item_view, parent, false)//access itemView attach to th parent ViewGroup
        return ItemTaskViewHolder(adapterLayout)//return the ViewHold with inflated view

    }

    override fun onBindViewHolder(holder: ItemTaskViewHolder, position: Int) {
//        TODO("Not yet implemented")
        val item = taskList[position]//get individual item based on  position
//        update the view with data provided by the viewholder
        holder.itemDisplay.text = context.resources.getString(item.taskResourceId)
    }

//    return the size of the dataset
    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
        return taskList.size
    }

}