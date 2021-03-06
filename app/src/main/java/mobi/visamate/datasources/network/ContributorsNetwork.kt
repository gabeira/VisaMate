package mobi.visamate.datasources.mock

import mobi.visamate.datasources.network.ContributorsRetrofitInterface
import mobi.visamate.model.Contributor
import retrofit2.Callback
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by gabriel on 21/2/18.
 */
class ContributorsNetwork {

    companion object {

        private var gsonConverterFactory: Converter.Factory = GsonConverterFactory.create()

        fun getContributorsFromNetwork(callback: Callback<List<Contributor>>) {

            val retrofit = Retrofit.Builder()
                    .baseUrl("https://api.github.com/repos/gabeira/VisaMate/")
                    .addConverterFactory(gsonConverterFactory)
                    .build()

            val service = retrofit.create(ContributorsRetrofitInterface::class.java)
            val call = service.requestContributors()

            call.enqueue(callback)
        }
    }
}