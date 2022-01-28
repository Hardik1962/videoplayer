package com.example.demoapicall.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demoapicall.R
import com.example.demoapicall.adapter.ItemRowHomeList
import com.example.demoapicall.model.MediaModel
import com.example.demoapicall.util.VerticalSpacingItemDecorator
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.*
import kotlin.collections.ArrayList


class HomeFragment : Fragment() {

    val homeList = ArrayList<MediaModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        val layoutManager = LinearLayoutManager(context)
        rcyList.layoutManager = layoutManager
        val itemDecorator = VerticalSpacingItemDecorator(10)
        rcyList.addItemDecoration(itemDecorator)
        rcyList.setMediaObjects(homeList)
        val adapter = ItemRowHomeList(homeList, requireContext())
        rcyList.adapter = adapter

        setData()
    }

    fun setData() {
        var mediaModel = MediaModel(
            "https://upload.wikimedia.org/wikipedia/commons/e/e0/Userimage.png",
            "https://s3.ca-central-1.amazonaws.com/codingwithmitch/media/VideoPlayerRecyclerView/REST+API+Retrofit+MVVM+Course+Summary.mp4",
            "",
            "Hardik",
            "27jul2020",
            "Video play wait some time"
        )

        homeList.add(mediaModel)

        mediaModel = MediaModel(
            "https://upload.wikimedia.org/wikipedia/commons/e/e0/Userimage.png",
            "",
            "https://s3.ca-central-1.amazonaws.com/codingwithmitch/media/VideoPlayerRecyclerView/Sending+Data+to+a+New+Activity+with+Intent+Extras.png",
            "Hardik",
            "27jul2020",
            "Image"
        )
        homeList.add(mediaModel)



        mediaModel = MediaModel(
            "https://upload.wikimedia.org/wikipedia/commons/e/e0/Userimage.png",
            "https://s3.ca-central-1.amazonaws.com/codingwithmitch/media/VideoPlayerRecyclerView/SwipingViewPager+Tutorial.mp4",
            "",
            "Hardik",
            "27jul2020",
            "Video play wait some time"
        )
        homeList.add(mediaModel)

        mediaModel = MediaModel(
            "https://upload.wikimedia.org/wikipedia/commons/e/e0/Userimage.png",
            "",
            "https://s3.ca-central-1.amazonaws.com/codingwithmitch/media/VideoPlayerRecyclerView/Sending+Data+to+a+New+Activity+with+Intent+Extras.png",
            "Hardik",
            "27jul2020",
            "Image"
        )
        homeList.add(mediaModel)
    }


    override fun onDestroy() {
        if (rcyList != null) {
            rcyList.releasePlayer()
            super.onDestroy()
        }
    }

}