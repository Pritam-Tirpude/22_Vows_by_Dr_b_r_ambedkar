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
public class HindiTab extends  Fragment{

    ArrayAdapter<String> mHindiVowsAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.hindi_tab, container, false);

        String[] vowsList = {"1. मैं ब्रह्मा, विष्णु और महेश में कोई विश्वास नहीं करूँगा और न ही मैं उनकी पूजा करूँगा.",
                "2. मैं राम और कृष्ण, जो भगवान के अवतार माने जाते हैं, में कोई आस्था नहीं रखूँगा और न ही मैं उनकी पूजा करूँगा.",
                "3. मैं गौरी, गणपति और हिन्दुओं के अन्य देवी-देवताओं में आस्था नहीं रखूँगा और न ही मैं उनकी पूजा करूँगा.",
                "4. मैं भगवान के अवतार में विश्वास नहीं करता हूँ.",
                "5. मैं यह नहीं मानता और न कभी मानूंगा कि भगवान बुद्ध विष्णु के अवतार थे. मैं इसे पागलपन और झूठा प्रचार-प्रसार मानता हूँ.",
                "6. मैं श्रद्धा (श्राद्ध) में भाग नहीं लूँगा और न ही पिंड-दान दूँगा.",
                "7. मैं बुद्ध के सिद्धांतों और उपदेशों का उल्लंघन करने वाले तरीके से कार्य नहीं करूँगा.",
                "8. मैं ब्राह्मणों द्वारा निष्पादित होने वाले किसी भी समारोह को स्वीकार नहीं करूँगा.",
                "9. मैं मनुष्य की समानता में विश्वास करता हूँ.",
                "10. मैं समानता स्थापित करने का प्रयास करूँगा.",
                "11. मैं बुद्ध के आष्टांगिक मार्ग का अनुशरण करूँगा.",
                "12. मैं बुद्ध द्वारा निर्धारित परमितों का पालन करूँगा.",
                "13. मैं सभी जीवित प्राणियों के प्रति दया और प्यार भरी दयालुता रखूँगा तथा उनकी रक्षा करूँगा.",
                "14. मैं चोरी नहीं करूँगा.",
                "15. मैं झूठ नहीं बोलूँगा.",
                "16. मैं कामुक पापों को नहीं करूँगा.",
                "17. मैं शराब, ड्रग्स जैसे मादक पदार्थों का सेवन नहीं करूँगा.",
                "18. मैं महान आष्टांगिक मार्ग के पालन का प्रयास करूँगा एवं सहानुभूति और प्यार भरी दयालुता का दैनिक जीवन में अभ्यास करूँगा.",
                "19. मैं हिंदू धर्म का त्याग करता हूँ जो मानवता के लिए हानिकारक है और उन्नति और मानवता के विकास में बाधक है क्योंकि यह असमानता पर आधारित है, और स्व-धर्मं के रूप में बौद्ध धर्म को अपनाता हूँ.",
                "20. मैं दृढ़ता के साथ यह विश्वास करता हूँ की बुद्ध का धम्म ही सच्चा धर्म है.",
                "21. मुझे विश्वास है कि मैं फिर से जन्म ले रहा हूँ (इस धर्म परिवर्तन के द्वारा).",
                "22. मैं गंभीरता एवं दृढ़ता के साथ घोषित करता हूँ कि मैं इसके (धर्म परिवर्तन के) बाद अपने जीवन का बुद्ध के सिद्धांतों व शिक्षाओं एवं उनके धम्म के अनुसार मार्गदर्शन करूँगा."};

        List<String> list_vows = new ArrayList<>(Arrays.asList(vowsList));

        mHindiVowsAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.vows_list,R.id.vows_list_textview,list_vows);

        ListView listView = (ListView) rootView.findViewById(R.id.listView_vows);
        listView.setAdapter(mHindiVowsAdapter);

        return rootView;
    }
}
