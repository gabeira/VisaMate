package mobi.visamate.view

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import mobi.visamate.R
import moe.feng.common.stepperview.VerticalStepperItemView

/**
 * Created by gabriel on 8/2/18.
 * PointsCalculatorFragment
 * https://www.homeaffairs.gov.au/visas/supporting/Pages/skilled/The-points-table.aspx
 */
class PointsCalculatorFragment : Fragment() {

    private val mSteppers = arrayOfNulls<VerticalStepperItemView>(8)
    private var mNextBtn0: Button? = null
    private var mNextBtn1: Button? = null
    private var mPrevBtn1: Button? = null
    private var mNextBtn2: Button? = null
    private var mPrevBtn2: Button? = null
    private var mNextBtn3: Button? = null
    private var mPrevBtn3: Button? = null
    private var mNextBtn4: Button? = null
    private var mPrevBtn4: Button? = null
    private var mNextBtn5: Button? = null
    private var mPrevBtn5: Button? = null
    private var mNextBtn6: Button? = null
    private var mPrevBtn6: Button? = null
    private var mNextBtn7: Button? = null
    private var mPrevBtn7: Button? = null

    private var mActivatedColorRes = R.color.material_blue_500
    private var mDoneIconRes = R.drawable.ic_done_white_16dp

    override fun onCreateView(inflater: LayoutInflater, parent: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_points, parent, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        mSteppers[0] = view.findViewById(R.id.stepper_0)
        mSteppers[1] = view.findViewById(R.id.stepper_1)
        mSteppers[2] = view.findViewById(R.id.stepper_2)
        mSteppers[3] = view.findViewById(R.id.stepper_3)
        mSteppers[4] = view.findViewById(R.id.stepper_4)
        mSteppers[5] = view.findViewById(R.id.stepper_5)
        mSteppers[6] = view.findViewById(R.id.stepper_6)
        mSteppers[7] = view.findViewById(R.id.stepper_7)

        VerticalStepperItemView.bindSteppers(*mSteppers)

        mNextBtn0 = view.findViewById(R.id.button_next_0)
        mNextBtn0!!.setOnClickListener { mSteppers[0]?.nextStep() }

        view.findViewById<View>(R.id.button_test_error).setOnClickListener {
            if (mSteppers[0]?.getErrorText() != null) {
                mSteppers[0]?.setErrorText(null)
            } else {
                mSteppers[0]?.setErrorText("Test error!")
            }
        }

        mPrevBtn1 = view.findViewById(R.id.button_prev_1)
        mPrevBtn1!!.setOnClickListener { mSteppers[1]?.prevStep() }

        mNextBtn1 = view.findViewById(R.id.button_next_1)
        mNextBtn1!!.setOnClickListener { mSteppers[1]?.nextStep() }


        mPrevBtn2 = view.findViewById(R.id.button_prev_2)
        mPrevBtn2!!.setOnClickListener { mSteppers[2]?.prevStep() }

        mNextBtn2 = view.findViewById(R.id.button_next_2)
        mNextBtn2!!.setOnClickListener { mSteppers[2]?.nextStep() }


        mPrevBtn3 = view.findViewById(R.id.button_prev_3)
        mPrevBtn3!!.setOnClickListener { mSteppers[3]?.prevStep() }

        mNextBtn3 = view.findViewById(R.id.button_next_3)
        mNextBtn3!!.setOnClickListener { mSteppers[3]?.nextStep() }


        mPrevBtn4 = view.findViewById(R.id.button_prev_4)
        mPrevBtn4!!.setOnClickListener { mSteppers[4]?.prevStep() }

        mNextBtn4 = view.findViewById(R.id.button_next_4)
        mNextBtn4!!.setOnClickListener { mSteppers[4]?.nextStep() }


        mPrevBtn5 = view.findViewById(R.id.button_prev_5)
        mPrevBtn5!!.setOnClickListener { mSteppers[5]?.prevStep() }

        mNextBtn5 = view.findViewById(R.id.button_next_5)
        mNextBtn5!!.setOnClickListener { mSteppers[5]?.nextStep() }


        mPrevBtn6 = view.findViewById(R.id.button_prev_6)
        mPrevBtn6!!.setOnClickListener { mSteppers[6]?.prevStep() }

        mNextBtn6 = view.findViewById(R.id.button_next_6)
        mNextBtn6!!.setOnClickListener { mSteppers[6]?.nextStep() }


        mPrevBtn7 = view.findViewById(R.id.button_prev_7)
        mPrevBtn7!!.setOnClickListener { mSteppers[7]?.prevStep() }

        mNextBtn7 = view.findViewById(R.id.button_next_7)
        mNextBtn7!!.setOnClickListener { view -> Snackbar.make(view, "Finish! Total Points 70", Snackbar.LENGTH_LONG).show() }

//        view.findViewById<View>(R.id.btn_change_point_color).setOnClickListener {
//            if (mActivatedColorRes == R.color.material_blue_500) {
//                //                    mActivatedColorRes = R.color.material_deep_purple_500;
//            } else {
//                mActivatedColorRes = R.color.material_blue_500
//            }
//            for (stepper in mSteppers) {
//                stepper?.setActivatedColorResource(mActivatedColorRes)
//            }
//        }
//        view.findViewById<View>(R.id.btn_change_done_icon).setOnClickListener {
//            if (mDoneIconRes == R.drawable.ic_done_white_16dp) {
//                //                    mDoneIconRes = R.drawable.ic_save_white_16dp;
//            } else {
//                mDoneIconRes = R.drawable.ic_done_white_16dp
//            }
//            for (stepper in mSteppers) {
//                stepper?.setDoneIconResource(mDoneIconRes)
//            }
//        }
    }

}
