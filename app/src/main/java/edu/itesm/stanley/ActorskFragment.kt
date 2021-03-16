package edu.itesm.stanley

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_actorsk.*


class ActorskFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_actorsk, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        actorsk_recycler.apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = ActorskAdapter(createData())
        }
    }

    fun createData(): ArrayList<Actor>{
        val actors = ArrayList<Actor>()
        actors.add(Actor(R.drawable.garylock,"Gary Lockwood", "2001: A Space Odyssey","Gary Lockwood was born in Van Nuys, California. He attended the University of California at Los Angeles on a football scholarship. He began his career as a movie stuntman, and a stand-in for Anthony Perkins, prior to his acting debut in 1959 in an uncredited bit role in Pueblo fantasma (1959)."))
        actors.add(Actor(R.drawable.jacknichol, "Jack Nicholson", "The Shining", "Jack Nicholson, an American actor, producer, director and screenwriter, is a three-time Academy Award winner and twelve-time nominee. "))
        actors.add(Actor(R.drawable.jamesearl, "James Earl Jones", "Dr. Strangelove", "Widely regarded as the one of greatest stage and screen actors both in his native USA and internationally, James Earl Jones was born on January 17, 1931 in Arkabutla, Mississippi."))
        actors.add(Actor(R.drawable.keirdullea, "Keir Dullea", "2001: A Space Odyssey", "Tall, slim, remote and boyishly handsome, one of Keir Dullea's most arresting features is his pale blue eyes, which featured in a number of watershed films of the 1960s."))
        actors.add(Actor(R.drawable.leonardross, "Leonard Rossiter", "2001: A Space Odyssey", "Leonard Rossiter was born on October 21st, 1926 in Liverpool. Unable to afford to go to university, he worked in an insurance office until he was 27, when he joined Preston repertory company and made his professional stage debut in \"The Gay Dog\"."))
        actors.add(Actor(R.drawable.malcommc, "Malcolm McDowell", " A Clockwork Orange", "Malcolm John Taylor was born on June 13, 1943 in Leeds, England, to working-class parents Edna (McDowell), a hotelier, and Charles Taylor, a publican. "))
        actors.add(Actor(R.drawable.matthewmod, "Matthew Modine", "Full Metal Jack", "The youngest of seven, Matthew was born in Loma Linda, Ca, to Dolores (Warner), a bookkeeper, and Mark Alexander Modine, a drive-in theater manager. "))
        actors.add(Actor(R.drawable.nicolekidman, "Nicole Kidman", "Eyes Wide Shut", "Elegant Nicole Kidman, known as one of Hollywood's top Australian imports, was actually born in Honolulu, Hawaii, while her Australian parents were there on educational visas."))
        actors.add(Actor(R.drawable.petersellers, "Peter Sellers", "Dr. Strangelove", "Often credited as the greatest comedian of all time, Peter Sellers was born Richard Henry Sellers to a well-off acting family in 1925 in Southsea, a suburb of Portsmouth. "))
        actors.add(Actor(R.drawable.ryanoneal, "Ryan O'Neal", "Barry Lyndon", "Ryan O'Neal was born on April 20, 1941 in Los Angeles, California, USA as Charles Samuel Eldridge Patrick Ryan O'Neal III."))
        actors.add(Actor(R.drawable.sterlinghay, "Sterling Hayden", "Dr. Strangelove", "Born to George & Frances Simonson Walter, and named Sterling Relyea Walter. Father died in 1925. Adopted by stepfather 'James Hayden' renamed Sterling Walter Hayden."))
        actors.add(Actor(R.drawable.scatmancroth, "Scatman Crothers", "The Shining", "Scatman Crothers was born Benjamin Sherman Crothers on May 23, 1910 in Terre Haute, Indiana. Songwriter (\"Dearest One\"), actor, composer, singer, comedian and guitarist who, after high school, appeared in nightclubs, hotels, films and on television."))
        actors.add(Actor(R.drawable.tomcruise, "Tom Cruise", "Eyes Wide Shut", "In 1976, if you had told fourteen-year-old Franciscan seminary student Thomas Cruise Mapother IV that one day in the not too distant future he would be Tom Cruise, one of the top 100 movie stars of all time, he would have probably grinned and told you that his ambition was to join the priesthood. ..."))

        return actors
    }
}