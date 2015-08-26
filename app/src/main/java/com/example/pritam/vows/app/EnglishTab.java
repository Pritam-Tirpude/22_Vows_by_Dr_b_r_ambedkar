package com.example.pritam.vows.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Pritam on 8/26/2015.
 */
public class EnglishTab extends Fragment {

    ArrayAdapter<String> mEnglishVowsAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.english_tab, container, false);

        String[] vowsList = {"1. I shall have no faith in Brahma, Vishnu and Mahesh nor shall I worship them.",
                             "2. I shall have no faith in Rama and Krishna who are believed to be incarnation of God nor shall I worship them.",
                             "3. I shall have no faith in ‘Gauri’, Ganapati and other gods and goddesses of Hindus nor shall I worship them.",
                             "4. I do not believe in the incarnation of God.",
                             "5. I do not and shall not believe that Lord Buddha was the incarnation of Vishnu. I believe this to be sheer madness and false propaganda.",
                             "6. I shall not perform ‘Shraddha’ nor shall I give ‘pind-dan’.",
                             "7. I shall not act in a manner violating the principles and teachings of the Buddha.",
                             "8. I shall not allow any ceremonies to be performed by Brahmins.",
                             "9. I shall believe in the equality of man.",
                             "10. I shall endeavour to establish equality.",
                             "11. I shall follow the ‘noble eightfold path’ of the Buddha.",
                             "12. I shall follow the ‘paramitas’ prescribed by the Buddha.",
                             "13. I shall have compassion and loving kindness for all living beings and protect them.",
                             "14. I shall not steal.",
                             "15. I shall not tell lies.",
                             "16. I shall not commit carnal sins.",
                             "17. I shall not take intoxicants like liquor, drugs etc.",
                             "18. I shall endeavour to follow the noble eightfold path and practise compassion and loving kindness in every day life.",
                             "19. I renounce Hinduism which is harmful for humanity and impedes the advancement and development of humanity because it is based on inequality, and adopt Buddhism as my religion.",
                             "20. I firmly believe the Dhamma of the Buddha is the only true religion.",
                             "21. I believe that I am having a re-birth.",
                             "22. I solemnly declare and affirm that I shall hereafter lead my life according to the principles and teachings of the Buddha and his Dhamma."};

        List<String> list_vows = new ArrayList<>(Arrays.asList(vowsList));

        mEnglishVowsAdapter = new ArrayAdapter<String>(
                getActivity(), R.layout.vows_list, R.id.vows_list_textview, list_vows);

        ListView listView = (ListView) rootView.findViewById(R.id.listView_vows);
        listView.setAdapter(mEnglishVowsAdapter);

        return rootView;
    }
}
