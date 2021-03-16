package edu.itesm.stanley

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class ActorskAdapter(private val actorsk : List<Actor>)
    : RecyclerView.Adapter<ActorskAdapter.ActorViewHolder>() {

    inner class ActorViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.nombre)
        var pelicula = renglon.findViewById<TextView>(R.id.pelicula)
        var descripcion = renglon.findViewById<TextView>(R.id.descripcion)
        var fotoA = renglon.findViewById<ImageView>(R.id.fotoA)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.actors_renglon,parent, false)
        return ActorViewHolder(renglon_vista)
    }

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        val actor= actorsk[position]
        holder.fotoA.setImageResource(actor.picture)
        holder.nombre.text = actor.nombre
        holder.pelicula.text = actor.pelicula
        holder.descripcion.text = actor.descripcion
        holder.itemView.setOnClickListener{
            val action = ActorskFragmentDirections.actionActorskFragmentToActorFragment(actor)
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return actorsk.size
    }
}