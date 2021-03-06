package mobi.visamate.repository

import mobi.visamate.datasources.mock.ContributorsNetwork
import mobi.visamate.model.Contributor
import retrofit2.Callback

/**
 * Created by gabriel on 22/2/18.
 * Repository Layer for Contributors
 * https://www.youtube.com/watch?v=FrteWKKVyzI&t=1910s
 */
class ContributorsRepository {

    /**
     * Method to get Contributors
     * Here you also can chose between Network or from a database for example.
     */
    fun getContributors(callback: Callback<List<Contributor>>) {
        ContributorsNetwork.getContributorsFromNetwork(callback)
    }
}