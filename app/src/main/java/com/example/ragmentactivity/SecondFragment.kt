package com.example.ragmentactivity

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class SecondFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("Fragment1", "onCreate2")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val bckBtn=view.findViewById<Button>(R.id.bckbtn)
        Log.d("Fragment1", "onCreateView2")
        bckBtn.setOnClickListener{
            val fragment=FirstFragment()
            val trans=fragmentManager?.beginTransaction()
            trans?.replace(R.id.my_navigation,fragment)?.commit()
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        Log.d("Fragment1", "onAttach2")
    }

    override fun onStart() {
        super.onStart()

        Log.d("Fragment1", "onStart2")
    }

    override fun onResume() {
        super.onResume()

        Log.d("Fragment1", "onResume2")
    }

    override fun onStop() {
        Log.d("Fragment1", "onStop2")

        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("Fragment1", "onDestroyView2")

        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d("Fragment1", "onDestroy2")

        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("Fragment1", "onDetach2")

        super.onDetach()
    }
}