package com.testdemo.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.testdemo.Model.Post

import com.testdemo.databinding.EachRowBinding

class PostAdapter(private var postList: List<Post>)
    : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    private lateinit var binding: EachRowBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        binding = EachRowBinding.inflate(LayoutInflater.from(parent.context),
        parent,false)
        return PostViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        binding.txtName.text=postList[position].body.info?.seed
    }

    override fun getItemCount(): Int = postList.size

    class PostViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
    }
    fun setData(postList: List<Post>) {
        this.postList=postList
        notifyDataSetChanged()
    }
}