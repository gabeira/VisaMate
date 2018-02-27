package mobi.visamate.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import mobi.visamate.R
import mobi.visamate.view.utility.GlideApp

/**
 * Created by gabriel on 8/2/18.
 */
class DisclaimerFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_disclaimer, container, false)
//        rootView.section_label.text = getString(R.string.section_format, arguments?.getInt(ARG_SECTION_NUMBER))

        val imageTop = rootView.findViewById<ImageView>(R.id.imageTop)

        GlideApp.with(this)
                .load("https://www.cdn.border.gov.au/style%20library/img/internet-logo.png")
                .centerInside()
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(imageTop)

        return rootView
    }

    companion object {

        fun newInstance() = DisclaimerFragment()
    }
}