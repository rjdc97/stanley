package edu.itesm.stanley

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_kubrick.*


class KubrickFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kubrick, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        movies.setOnClickListener {
            Log.i("kubrick","Nav component")
            view?.findNavController()?.navigate(R.id.action_kubrickFragment_to_moviesFragment)
           // Navigation.createNavigateOnClickListener( R.id.action_kubrickFragment_to_moviesFragment)
        }

        actors.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_kubrickFragment_to_actorskFragment)
           // Navigation.createNavigateOnClickListener( R.id.action_kubrickFragment_to_actorskFragment,null)
        }
    }


}