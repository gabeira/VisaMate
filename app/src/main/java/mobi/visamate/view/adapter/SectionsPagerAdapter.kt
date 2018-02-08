package mobi.visamate.view.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import mobi.visamate.view.DisclaimerFragment
import mobi.visamate.view.StudyFragment
import mobi.visamate.view.PointsCalculatorFragment
import mobi.visamate.view.VisitFragment

/**
 * Created by gabriel on 8/2/18.
 * SectionsPagerAdapter to select which Fragment to show
 */
class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        return when (position) {
            0 -> DisclaimerFragment.newInstance()
            1 -> VisitFragment.newInstance("", "")
            2 -> StudyFragment.newInstance(1)
            3 -> PointsCalculatorFragment()
            else -> DisclaimerFragment.newInstance()
        }
    }

    override fun getCount(): Int {
        // Show 4 total tabbed pages.
        return 4
    }
}