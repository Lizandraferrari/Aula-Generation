package com.generation.room

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.room.adapter.UserAdapter
import com.generation.room.databinding.FragmentListBinding

class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val adapter = UserAdapter()

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.setHasFixedSize(true)

        mainViewModel.selectUser.observe(viewLifecycleOwner){
            if (it != null){
                adapter.setList(it)
            }
        }

        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.salvaai)
        }
        return binding.root
    }
}