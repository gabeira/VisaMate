package mobi.visamate.model

/**
 * Created by gabriel on 8/2/18.
 */
class School(val id: String, val content: String, val details: String) {

    override fun toString(): String {
        return content
    }
}