package apps.myapp.eze.ezenglish2.grammar.lesson3;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import apps.myapp.eze.ezenglish2.grammar.popup.lesson3.FanboysPopUp;

public class GrammarLessonIIIMainActivity extends AppCompatActivity implements GrammarLessonIIIFirstLesson.OnFragmentInteractionListener,
        GrammarLessonIIISecondLesson.OnFragmentInteractionListener,GrammarLessonIIIThirdLesson.OnFragmentInteractionListener,
        GrammarLessonIIIWithOverBy.OnFragmentInteractionListener,GrammarLessonIIIBeDoHave.OnFragmentInteractionListener,
        GrammarLessonIIIWillWouldShouldShall.OnFragmentInteractionListener, GrammarLessonIIICanCouldMayMightMust.OnFragmentInteractionListener{

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_grammar_lesson_iiimain);

        Toolbar toolbar = (Toolbar) findViewById(apps.myapp.eze.ezenglish2.R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(apps.myapp.eze.ezenglish2.R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(apps.myapp.eze.ezenglish2.R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(apps.myapp.eze.ezenglish2.R.menu.menu_grammar_lesson_iiimain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static Fragment newInstance(int sectionNumber) {
            Fragment fragment=null;

            switch (sectionNumber){
                case 1: fragment = new GrammarLessonIIIFirstLesson();
                    break;
                case 2: fragment = new GrammarLessonIIISecondLesson();
                    break;
                case 3: fragment = new GrammarLessonIIIThirdLesson();
                    break;
                case 4: fragment = new GrammarLessonIIIWithOverBy();
                    break;
                case 5: fragment = new GrammarLessonIIIBeDoHave();
                    break;
                case 6: fragment = new GrammarLessonIIIWillWouldShouldShall();
                    break;
                case 7: fragment = new GrammarLessonIIICanCouldMayMightMust();
                    break;
            }
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(apps.myapp.eze.ezenglish2.R.layout.fragment_grammar_lesson_iii_main, container, false);
            TextView textView = (TextView) rootView.findViewById(apps.myapp.eze.ezenglish2.R.id.section_label);
            textView.setText(getString(apps.myapp.eze.ezenglish2.R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 7;
        }
    }
    public void fanboysPopUp(View view){
        Intent i = new Intent(this,FanboysPopUp.class);
        startActivity(i);
    }
}
