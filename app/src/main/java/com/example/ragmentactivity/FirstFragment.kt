package com.example.ragmentactivity
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
class FirstFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)

        Log.d("Fragment1", "Автор: Сергей Есенин")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("Fragment1", "Месяц рожу полощет в луже,")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val nxtBtn=view.findViewById<Button>(R.id.btn)
        Log.d("Fragment1", "С неба светит лиловый сатин.")
        nxtBtn.setOnClickListener{
            val fragment=SecondFragment()
            val trans=fragmentManager?.beginTransaction()
            trans?.replace(R.id.my_navigation,fragment)?.commit()
        }

        return view
    }



    override fun onStart() {
        super.onStart()

        Log.d("Fragment1", "Я стою никому не нужен,")
    }

    override fun onResume() {
        super.onResume()

        Log.d("Fragment1", "Одинокий и пьяный, один.")
    }

    override fun onStop() {
        Log.d("Fragment1", "А хорошего в жизни мало,")

        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("Fragment1", "Разве можно за это ругать,")

        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d("Fragment1", "Коль на этой на пьяной планете")

        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("Fragment1", "Родила меня бедная мать.")

        super.onDetach()
    }
}
