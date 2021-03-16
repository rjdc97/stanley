package edu.itesm.stanley

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_actor.*
import kotlinx.android.synthetic.main.fragment_movie.*


class ActorFragment : Fragment() {

    private val args by navArgs<ActorFragmentArgs>()


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_actor, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        fotoA.setImageResource(args.actor.picture)
        nombre.text = args.actor.nombre
        pelicula.text = args.actor.pelicula
        descripcion.text = args.actor.descripcion
    }
}