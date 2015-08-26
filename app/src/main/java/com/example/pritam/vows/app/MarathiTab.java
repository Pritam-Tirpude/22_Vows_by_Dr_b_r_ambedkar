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
public class MarathiTab extends Fragment {
    ArrayAdapter<String> mMarathiAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.marathi_tab, container, false);

        String vowsList[] = {"1. मी ब्रह्मा, विष्णु, महेश यांना देव मानणार नाही किंवा त्यांची उपासना करणार नाही.",
                             "2. राम व कृष्ण यांना देव मानणार नाही किंवा त्यांची उपासना करणार नाही.",
                             "3. मी गौरी-गणपती इत्यादी हिंदू धर्मातील कोणत्याही देव-देवतेस मानणार नाही किंवा त्यांची उपासना करणार नाही.",
                             "4. देवाने अवतार घेतले, यावर माझा विश्वास नाही.",
                             "5. गौतम बुद्ध हा विष्णुचा अवतार होय, हा खोटा आणि खोडसळ प्रचार होय असे मी मानतो.",
                             "6. मी श्राद्धपक्ष करणार नाही; पिंडदान करणार नाही.",
                             "7. मी बौद्धधम्माच्या विरुद्ध विसंगत असे कोणतेही आचरण करणार नाही.",
                             "8. मी कोणतेही क्रियाकर्म ब्राह्मणाचे हातून करवून घेणार नाही.",
                             "9. सर्व मनुष्यमात्र समान आहेत असे मी मानतो.",
                             "10. मी समता स्थापन करण्याचा प्रयत्न करीन.",
                             "11. मी तथागत बुद्धाने सांगितलेल्या अष्टांग मार्गाचा अवलंब करीन.",
                             "12. तथागताने सांगितलेल्या दहा पारमिता मी पाळीन.",
                             "13. मी सर्व प्राणिमात्रावर दया करीन, त्यांचे लालन पालन करीन.",
                             "14. मी चोरी करणार नाही.",
                             "15. मी व्याभिचार करणार नाही.",
                             "16. मी खोटे बोलणार नाही.",
                             "17. मी दारू पिणार नाही.",
                             "18. ज्ञान (प्रज्ञा), शील, करुणा या बौद्धधम्माच्या तीन तत्वांची सांगड घालून मी माझे जीवन व्यतीत करीन.",
                             "19. माझ्या जुन्या, मनुष्यमात्राच्या उत्कर्षाला हानिकारक असणार्\u200Dया व मनुष्यमात्राला असमान व नीच मानणार्\u200Dया हिंदू धर्माचा मी त्याग करतो व बौद्धधम्माचा स्वीकार करतो.",
                             "20. तोच सद्धम्म आहे अशी माझी खात्री पटलेली आहे.",
                             "21. आज माझा नवा जन्म होत आहे असे मी मानतो.",
                             "22. इतःपर मी बुद्धांच्या शिकवणुकीप्रमाणे वागेन अशी प्रतिज्ञा करतो."};

        List<String> listVows = new ArrayList<>(Arrays.asList(vowsList));

        mMarathiAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.vows_list,
                R.id.vows_list_textview,
                listVows);

        ListView listView = (ListView) rootView.findViewById(R.id.listView_vows);
        listView.setAdapter(mMarathiAdapter)
        ;
        return rootView;
    }
}
