package com.marlystudio.taskmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.transition.MaterialElevationScale
import com.marlystudio.taskmaster.fragment.CalendarFragment
import com.marlystudio.taskmaster.fragment.HomeFragment
import com.marlystudio.taskmaster.fragment.NotificationFragment
import com.marlystudio.taskmaster.fragment.ProfileFragment

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.navigation_view)
        bottomNavigationView.selectedItemId = R.id.task_page

        replaceFragment(HomeFragment())
        initBottomSelectedClick()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main_frame, HomeFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }


    private fun replaceFragment(fragment: Fragment) {
        fragment.enterTransition = createTransition()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_frame, fragment)
            .commit()
    }

    private fun createTransition(): MaterialElevationScale? {
        val fadeThrough = MaterialElevationScale(true)
        // MaterialFadeThrough fadeThrough = new MaterialFadeThrough();
        fadeThrough.addTarget(R.id.fragment_home)
        fadeThrough.addTarget(R.id.fragment_notification)
        fadeThrough.addTarget(R.id.fragment_profile)
        fadeThrough.addTarget(R.id.fragment_calendar)
        return fadeThrough
    }

    private fun initBottomSelectedClick() {
        //initialisation avec le home fragment...
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.task_page -> {
                    // Respond to navigation item 1 click
                    replaceFragment(HomeFragment())
                    true
                }

                R.id.calendrier_page -> {
                    // Respond to navigation item 2 click
                    replaceFragment(CalendarFragment())
                    true
                }

                R.id.notification_page -> {
                    // Respond to navigation item 2 click
                    replaceFragment(NotificationFragment())
                    true
                }

                R.id.profil_page -> {
                    // Respond to navigation item 2 click
                    replaceFragment(ProfileFragment())
                    true
                }

                else -> {
                    replaceFragment(HomeFragment())
                    false
                }
            }
        }

    }


}