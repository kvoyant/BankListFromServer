package com.tjeit.banklistfromserver.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.tjeit.banklistfromserver.R;
import com.tjeit.banklistfromserver.datas.Bank;

import java.util.List;

public class BankAdapter extends ArrayAdapter<Bank> {

    Context mContext;
    List<Bank> mList;
    LayoutInflater inf;

    public BankAdapter(Context context, List<Bank> list) {
        super(context, R.layout.bank_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        return row;
    }
}
