package com.example.actionstest


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.anything
import org.hamcrest.Matchers.`is`
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class HomeUITest {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun homeUITest() {
        val materialButton = onView(
            allOf(
                withId(R.id.helloclick), withText("Hello World!"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton.perform(click())

        val floatingActionButton = onView(
            allOf(
                withId(R.id.fab), withContentDescription("FAB"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        floatingActionButton.perform(click())

        val materialRadioButton = onView(
            allOf(
                withId(R.id.student), withText("Student"),
                childAtPosition(
                    allOf(
                        withId(R.id.tablegroup),
                        childAtPosition(
                            withClassName(`is`("android.widget.LinearLayout")),
                            2
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialRadioButton.perform(click())

        val appCompatEditText = onView(
            allOf(
                withId(R.id.userID),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        appCompatEditText.perform(replaceText("1223434"), closeSoftKeyboard())

        val appCompatEditText2 = onView(
            allOf(
                withId(R.id.username),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    4
                ),
                isDisplayed()
            )
        )
        appCompatEditText2.perform(replaceText("sai"), closeSoftKeyboard())

        val appCompatEditText3 = onView(
            allOf(
                withId(R.id.usermail),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    5
                ),
                isDisplayed()
            )
        )
        appCompatEditText3.perform(replaceText("sai@gmail.com"), closeSoftKeyboard())

        val appCompatEditText4 = onView(
            allOf(
                withId(R.id.userphone),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    6
                ),
                isDisplayed()
            )
        )
        appCompatEditText4.perform(replaceText("4756478564"), closeSoftKeyboard())

        /*val appCompatSpinner = onView(
            allOf(
                withId(R.id.dept),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    7
                ),
                isDisplayed()
            )
        )
        appCompatSpinner.perform(click())

        val PopupBackgroundView = null
        val materialTextView = onData(anything())
            .inAdapterView(
                childAtPosition(
                    withClassName(`is`("android.widget.PopupWindow$PopupBackgroundView")),
                    0
                )
            )
            .atPosition(2)
        materialTextView.perform(click())*/

        val materialCheckBox = onView(
            allOf(
                withId(R.id.telugu), withText("Telugu"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.LinearLayout")),
                        9
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialCheckBox.perform(click())

        val materialCheckBox2 = onView(
            allOf(
                withId(R.id.english), withText("English"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.LinearLayout")),
                        9
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialCheckBox2.perform(click())

        val materialRadioButton2 = onView(
            allOf(
                withId(R.id.male), withText("Male"),
                childAtPosition(
                    allOf(
                        withId(R.id.gendergroup),
                        childAtPosition(
                            withClassName(`is`("android.widget.LinearLayout")),
                            10
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialRadioButton2.perform(click())

        val materialCheckBox3 = onView(
            allOf(
                withId(R.id.hindi), withText("Hindi"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.LinearLayout")),
                        9
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialCheckBox3.perform(click())

        val materialCheckBox4 = onView(
            allOf(
                withId(R.id.hindi), withText("Hindi"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.LinearLayout")),
                        9
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialCheckBox4.perform(click())

        val materialButton2 = onView(
            allOf(
                withText("Submit"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    11
                ),
                isDisplayed()
            )
        )
        materialButton2.perform(click())
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
