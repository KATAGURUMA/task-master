package com.marlystudio.taskmaster.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.marlystudio.taskmaster.R
import com.marlystudio.taskmaster.adapter.ListAdapter

class HomeFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        saveInstanceState: Bundle?
    ): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_home, container, false)

        //Récupérer le Recycle View
        //val verticalRecyclerView= view?.findViewById<RecyclerView>(R.id.vertical_recycler_view)
        //verticalRecyclerView?.adapter = ListAdapter(R.layout.item_vertical_list)
        //verticalRecyclerView?.addItemDecoration(ListItemDecoration())

        recyclerView = view.findViewById<RecyclerView>(R.id.vertical_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = ListAdapter(R.layout.item_vertical_list)





        return view
    }
}