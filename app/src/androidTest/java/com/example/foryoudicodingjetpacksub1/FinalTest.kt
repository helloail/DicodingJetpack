package com.example.foryoudicodingjetpacksub1

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.example.foryoudicodingjetpacksub1.data.DataInit
import com.example.foryoudicodingjetpacksub1.view.main.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class FinalTest {


    private val datas = DataInit().data


    @Rule
    @JvmField
    var activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testListTvShow() {

        onView(withText("Tv Show")).perform(click())
        onView(withId(R.id.recyclerViewTvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.recyclerViewTvShow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(datas.size))


    }

    @Test
    fun testListMovie() {

        onView(withId(R.id.recyclerViewMovie)).check(matches(isDisplayed()))
        onView(withId(R.id.recyclerViewMovie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(datas.size))


    }


    @Test
    fun testDetailMovie() {

        onView(withId(R.id.recyclerViewMovie)).check(matches(isDisplayed()))

        onView(withId(R.id.recyclerViewMovie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click())
        )

        onView(withId(R.id.titlevideo)).check(matches(isDisplayed()))
        onView(withId(R.id.ratingbar)).check(matches(isDisplayed()))
        onView(withId(R.id.reviews)).check(matches(isDisplayed()))
        onView(withId(R.id.titledesc)).check(matches(isDisplayed()))
        onView(withId(R.id.RuningTime)).check(matches(isDisplayed()))
        onView(withId(R.id.ReleaseDate)).check(matches(isDisplayed()))
        onView(withId(R.id.director)).check(matches(isDisplayed()))
        onView(withId(R.id.writer)).check(matches(isDisplayed()))
        onView(withId(R.id.discription)).check(matches(isDisplayed()))

    }

    @Test
    fun testDetailTvShow() {


        onView(withText("Tv Show")).perform(click())
        onView(withId(R.id.recyclerViewTvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.recyclerViewTvShow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(datas.size))

        onView(withId(R.id.recyclerViewTvShow)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click())
        )

        onView(withId(R.id.titlevideo)).check(matches(isDisplayed()))
        onView(withId(R.id.ratingbar)).check(matches(isDisplayed()))
        onView(withId(R.id.reviews)).check(matches(isDisplayed()))
        onView(withId(R.id.titledesc)).check(matches(isDisplayed()))
        onView(withId(R.id.RuningTime)).check(matches(isDisplayed()))
        onView(withId(R.id.ReleaseDate)).check(matches(isDisplayed()))
        onView(withId(R.id.director)).check(matches(isDisplayed()))
        onView(withId(R.id.writer)).check(matches(isDisplayed()))
        onView(withId(R.id.discription)).check(matches(isDisplayed()))

    }
}