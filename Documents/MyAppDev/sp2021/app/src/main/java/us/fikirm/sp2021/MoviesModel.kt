package us.fikirm.sp2021

class MoviesModel(title: String?, year: String?, images: String?) {
    private var title: String
    private var year: String
    init {
        this.title = title!!
        this.year = year!!
    }
    fun getTitle(): String? {
        return title
    }
    fun setTitle(name: String?) {
        title = name!!
    }
    fun getYear(): String? {
        return year
    }
    fun setYear(year: String?) {
        this.year = year!!
    }




}
