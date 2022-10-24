package ch.plebsapps.composeprofilecardlayout

data class UserProfile constructor(val name:String, val status: Boolean, val drawableId: Int)

val userProfileList = arrayListOf(

    UserProfile(name = "Anna Knapp", status = false, R.drawable.images3),
    UserProfile(name = "Steffi Doe", status = true, R.drawable.images2),
    UserProfile(name = "John Hello", status = false, R.drawable.images4),
    UserProfile(name = "Anna Knapp", status = false, R.drawable.images3),
    UserProfile(name = "Steffi Doe", status = true, R.drawable.images2),
    UserProfile(name = "John Hello", status = false, R.drawable.images4),
    UserProfile(name = "Anna Knapp", status = false, R.drawable.images3),
    UserProfile(name = "Steffi Doe", status = true, R.drawable.images2),
    UserProfile(name = "John Hello", status = false, R.drawable.images4),
    UserProfile(name = "Anna Knapp", status = false, R.drawable.images3),
    UserProfile(name = "Steffi Doe", status = true, R.drawable.images2),
    UserProfile(name = "John Hello", status = false, R.drawable.images4),
    UserProfile(name = "Anna Knapp", status = false, R.drawable.images3),
    UserProfile(name = "Steffi Doe", status = true, R.drawable.images2),
    UserProfile(name = "John Hello", status = false, R.drawable.images4),
    UserProfile(name = "Anna Knapp", status = false, R.drawable.images3),
    UserProfile(name = "Steffi Doe", status = true, R.drawable.images2),
    UserProfile(name = "John Hello", status = false, R.drawable.images4),
    UserProfile(name = "Anna Knapp", status = false, R.drawable.images3),
    UserProfile(name = "Steffi Doe", status = true, R.drawable.images2),
    UserProfile(name = "John Hello", status = false, R.drawable.images4),
    UserProfile(name = "Anna Knapp", status = false, R.drawable.images3),
    UserProfile(name = "Steffi Doe", status = true, R.drawable.images2),
    UserProfile(name = "John Hello", status = false, R.drawable.images4),
)