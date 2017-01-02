/*
MIT License

Copyright (c) 2016 Ashar Khan

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

package com.softminds.matrixcalculator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ExponentFragment extends ListFragment {

        @Override
        public void onActivityCreated(Bundle savedInstances) {
            super.onActivityCreated(savedInstances);
            ArrayList<Matrix> SquareList=new ArrayList<>();
            for(int i=0;i<((GlobalValues)getActivity().getApplication()).GetCompleteList().size();i++)
            {
                if(((GlobalValues)getActivity().getApplication()).GetCompleteList().get(i).is_squareMatrix())
                    SquareList.add(((GlobalValues)getActivity().getApplication()).GetCompleteList().get(i));
            }
            MatrixAdapter MatriXadapter = new MatrixAdapter(getActivity(),R.id.MainContent,SquareList);
            getListView().setDividerHeight(1);
            setListAdapter(MatriXadapter);

        }

    }