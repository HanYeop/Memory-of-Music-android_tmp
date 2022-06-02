package com.hanyeop.mom.view.main.album_list

import androidx.navigation.fragment.findNavController
import com.hanyeop.mom.R
import com.hanyeop.mom.base.BaseFragmentMain
import com.hanyeop.mom.databinding.FragmentAlbumListBinding
import com.hanyeop.mom.view.main.MainFragmentDirections

class AlbumListFragment : BaseFragmentMain<FragmentAlbumListBinding>(R.layout.fragment_album_list) {

    override fun init() {
        binding.button.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToMusicSearchFragment())
        }
    }
}