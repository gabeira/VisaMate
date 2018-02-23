package mobi.visamate.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import mobi.visamate.model.Contributor
import mobi.visamate.repository.ContributorsRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by gabriel on 22/2/18.
 * Implementation of View Model for Contributors
 * https://developer.android.com/topic/libraries/architecture/viewmodel.html
 */
class ContributorsViewModel : ViewModel() {

    var observableContributorsList: MutableLiveData<List<Contributor>> = MutableLiveData()

    init {
        loadContributors()
    }

    fun getContributorsObserver(): LiveData<List<Contributor>> {
        return observableContributorsList
    }

    fun loadContributors() {
        ContributorsRepository().getContributors(object : Callback<List<Contributor>> {
            override fun onResponse(call: Call<List<Contributor>>, response: Response<List<Contributor>>) {
                observableContributorsList.value = response.body()
            }

            override fun onFailure(call: Call<List<Contributor>>, t: Throwable) {
                Log.e("Error", "Err " + t.localizedMessage)
                //TODO Implement error handling for Contributors request
            }
        })
    }
}