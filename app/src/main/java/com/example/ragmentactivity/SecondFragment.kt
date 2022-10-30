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
    override fun onAttach(context: Context) {
        super.onAttach(context)

        Log.d("Fragment2", "Боль не тонет в проклятом вине,")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("Fragment2", "Даже та, что любил, перестала")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val bckBtn=view.findViewById<Button>(R.id.bckbtn)
        Log.d("Fragment2", "Улыбаться при встрече мне.")
        bckBtn.setOnClickListener{
            val fragment=FirstFragment()
            val trans=fragmentManager?.beginTransaction()
            trans?.replace(R.id.my_navigation,fragment)?.commit()
        }

        return view
    }



    override fun onStart() {
        super.onStart()

        Log.d("Fragment2", "А за что? А за то, что пью я,")
    }

    override fun onResume() {
        super.onResume()

        Log.d("Fragment2", "Я стою никому не нужен,")
    }

    override fun onStop() {
        Log.d("Fragment2", "Одинокий и пьяный, один.")

        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("Fragment2", "Месяц рожу полощет в луже,")

        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d("Fragment2", "С неба светит лиловый сатин.")

        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("Fragment2", "Год публикации: 1924 г.")

        super.onDetach()
    }
}