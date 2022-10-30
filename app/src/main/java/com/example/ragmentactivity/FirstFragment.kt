package com.example.ragmentactivity

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_N
class FirstFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("Fragment1", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val nxtBtn=view.findViewById<Button>(R.id.btn)
        Log.d("Fragment1", "onCreateView")
        nxtBtn.setOnClickListener{
            val fragment=SecondFragment()
            val trans=fragmentManager?.beginTransaction()
            trans?.replace(R.id.my_navigation,fragment)?.commit()
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        Log.d("Fragment1", "onAttach")
    }

    override fun onStart() {
        super.onStart()

        Log.d("Fragment1", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("Fragment1", "onResume")
    }

    override fun onStop() {
        Log.d("Fragment1", "onStop")

        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("Fragment1", "onDestroyView")

        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d("Fragment1", "onDestroy")

        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("Fragment1", "onDetach")

        super.onDetach()
    }
}
