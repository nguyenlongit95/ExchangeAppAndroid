package com.example.exchangeapp;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class TyGiaAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<TyGia> tyGiaList;

    @Override
    public int getCount() {
        return this.tyGiaList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {
            holder =  new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);

            // TechcomBank init
            holder.txtTechcomBank1 = (TextView) convertView.findViewById(R.id.txtTechcomBank1);
            holder.txtTechcomBank2 = (TextView) convertView.findViewById(R.id.txtTechcomBank2);
            holder.txtTechcomBank3 = (TextView) convertView.findViewById(R.id.txtTechcomBank3);
            holder.txtTechcomBank4 = (TextView) convertView.findViewById(R.id.txtTechcomBank4);
            holder.txtTechcomBank5 = (TextView) convertView.findViewById(R.id.txtTechcomBank5);
            holder.txtTechcomBank6 = (TextView) convertView.findViewById(R.id.txtTechcomBank6);
            holder.txtTechcomBank7 = (TextView) convertView.findViewById(R.id.txtTechcomBank7);
            holder.txtTechcomBank8 = (TextView) convertView.findViewById(R.id.txtTechcomBank8);
            holder.txtTechcomBank9 = (TextView) convertView.findViewById(R.id.txtTechcomBank9);
            holder.txtTechcomBank10 = (TextView) convertView.findViewById(R.id.txtTechcomBank10);
            holder.txtTechcomBank11 = (TextView) convertView.findViewById(R.id.txtTechcomBank11);
            holder.txtTechcomBank12 = (TextView) convertView.findViewById(R.id.txtTechcomBank12);

            // VietcomBank
            holder.txtVietcomBank1 = (TextView) convertView.findViewById(R.id.txtVietcomBank1);
            holder.txtVietcomBank2 = (TextView) convertView.findViewById(R.id.txtVietcomBank2);
            holder.txtVietcomBank3 = (TextView) convertView.findViewById(R.id.txtVietcomBank3);
            holder.txtVietcomBank4 = (TextView) convertView.findViewById(R.id.txtVietcomBank4);
            holder.txtVietcomBank5 = (TextView) convertView.findViewById(R.id.txtVietcomBank5);
            holder.txtVietcomBank6 = (TextView) convertView.findViewById(R.id.txtVietcomBank6);
            holder.txtVietcomBank7 = (TextView) convertView.findViewById(R.id.txtVietcomBank7);
            holder.txtVietcomBank8 = (TextView) convertView.findViewById(R.id.txtVietcomBank8);
            holder.txtVietcomBank9 = (TextView) convertView.findViewById(R.id.txtVietcomBank9);
            holder.txtVietcomBank10 = (TextView) convertView.findViewById(R.id.txtVietcomBank10);
            holder.txtVietcomBank11 = (TextView) convertView.findViewById(R.id.txtVietcomBank11);
            holder.txtVietcomBank12 = (TextView) convertView.findViewById(R.id.txtVietcomBank12);

            // TPB
            holder.txtTPB1 = (TextView) convertView.findViewById(R.id.txtTPB1);
            holder.txtTPB2 = (TextView) convertView.findViewById(R.id.txtTPB2);
            holder.txtTPB3 = (TextView) convertView.findViewById(R.id.txtTPB3);
            holder.txtTPB4 = (TextView) convertView.findViewById(R.id.txtTPB4);
            holder.txtTPB5 = (TextView) convertView.findViewById(R.id.txtTPB5);
            holder.txtTPB6 = (TextView) convertView.findViewById(R.id.txtTPB6);
            holder.txtTPB7 = (TextView) convertView.findViewById(R.id.txtTPB7);
            holder.txtTPB8 = (TextView) convertView.findViewById(R.id.txtTPB8);
            holder.txtTPB9 = (TextView) convertView.findViewById(R.id.txtTPB9);
            holder.txtTPB10 = (TextView) convertView.findViewById(R.id.txtTPB10);
            holder.txtTPB11 = (TextView) convertView.findViewById(R.id.txtTPB11);
            holder.txtTPB12 = (TextView) convertView.findViewById(R.id.txtTPB12);

            // DongABank
            holder.txtDongA1 = (TextView) convertView.findViewById(R.id.txtDongA1);
            holder.txtDongA2 = (TextView) convertView.findViewById(R.id.txtDongA2);
            holder.txtDongA3 = (TextView) convertView.findViewById(R.id.txtDongA3);
            holder.txtDongA4 = (TextView) convertView.findViewById(R.id.txtDongA4);
            holder.txtDongA5 = (TextView) convertView.findViewById(R.id.txtDongA5);
            holder.txtDongA6 = (TextView) convertView.findViewById(R.id.txtDongA6);
            holder.txtDongA7 = (TextView) convertView.findViewById(R.id.txtDongA7);
            holder.txtDongA8 = (TextView) convertView.findViewById(R.id.txtDongA8);
            holder.txtDongA9 = (TextView) convertView.findViewById(R.id.txtDongA9);
            holder.txtDongA10 = (TextView) convertView.findViewById(R.id.txtDongA10);
            holder.txtDongA11 = (TextView) convertView.findViewById(R.id.txtDongA11);
            holder.txtDongA12 = (TextView) convertView.findViewById(R.id.txtDongA12);

            // VietinBank
            holder.txtVietinBank1 = (TextView) convertView.findViewById(R.id.txtVietinBank1);
            holder.txtVietinBank2 = (TextView) convertView.findViewById(R.id.txtVietinBank2);
            holder.txtVietinBank3 = (TextView) convertView.findViewById(R.id.txtVietinBank3);
            holder.txtVietinBank4 = (TextView) convertView.findViewById(R.id.txtVietinBank4);
            holder.txtVietinBank5 = (TextView) convertView.findViewById(R.id.txtVietinBank5);
            holder.txtVietinBank6 = (TextView) convertView.findViewById(R.id.txtVietinBank6);
            holder.txtVietinBank7 = (TextView) convertView.findViewById(R.id.txtVietinBank7);
            holder.txtVietinBank8 = (TextView) convertView.findViewById(R.id.txtVietinBank8);
            holder.txtVietinBank9 = (TextView) convertView.findViewById(R.id.txtVietinBank9);
            holder.txtVietinBank10 = (TextView) convertView.findViewById(R.id.txtVietinBank10);
            holder.txtVietinBank11 = (TextView) convertView.findViewById(R.id.txtVietinBank11);
            holder.txtVietinBank12 = (TextView) convertView.findViewById(R.id.txtVietinBank12);

            // SHB
            holder.txtSHB1 = (TextView) convertView.findViewById(R.id.txtSHB1);
            holder.txtSHB2 = (TextView) convertView.findViewById(R.id.txtSHB2);
            holder.txtSHB3 = (TextView) convertView.findViewById(R.id.txtSHB3);
            holder.txtSHB4 = (TextView) convertView.findViewById(R.id.txtSHB4);
            holder.txtSHB5 = (TextView) convertView.findViewById(R.id.txtSHB5);
            holder.txtSHB6 = (TextView) convertView.findViewById(R.id.txtSHB6);
            holder.txtSHB7 = (TextView) convertView.findViewById(R.id.txtSHB7);
            holder.txtSHB8 = (TextView) convertView.findViewById(R.id.txtSHB8);
            holder.txtSHB9 = (TextView) convertView.findViewById(R.id.txtSHB9);
            holder.txtSHB10 = (TextView) convertView.findViewById(R.id.txtSHB10);
            holder.txtSHB11 = (TextView) convertView.findViewById(R.id.txtSHB11);
            holder.txtSHB12 = (TextView) convertView.findViewById(R.id.txtSHB12);

            // SacomBank
            holder.txtSacomBank1 = (TextView) convertView.findViewById(R.id.txtSacomBank1);
            holder.txtSacomBank2 = (TextView) convertView.findViewById(R.id.txtSacomBank2);
            holder.txtSacomBank3 = (TextView) convertView.findViewById(R.id.txtSacomBank3);
            holder.txtSacomBank4 = (TextView) convertView.findViewById(R.id.txtSacomBank4);
            holder.txtSacomBank5 = (TextView) convertView.findViewById(R.id.txtSacomBank5);
            holder.txtSacomBank6 = (TextView) convertView.findViewById(R.id.txtSacomBank6);
            holder.txtSacomBank7 = (TextView) convertView.findViewById(R.id.txtSacomBank7);
            holder.txtSacomBank8 = (TextView) convertView.findViewById(R.id.txtSacomBank8);
            holder.txtSacomBank9 = (TextView) convertView.findViewById(R.id.txtSacomBank9);
            holder.txtSacomBank10 = (TextView) convertView.findViewById(R.id.txtSacomBank10);
            holder.txtSacomBank11 = (TextView) convertView.findViewById(R.id.txtSacomBank11);
            holder.txtSacomBank12 = (TextView) convertView.findViewById(R.id.txtSacomBank12);

            // BIDV
            holder.txtBIDV1 = (TextView) convertView.findViewById(R.id.txtBIDV1);
            holder.txtBIDV2 = (TextView) convertView.findViewById(R.id.txtBIDV2);
            holder.txtBIDV3 = (TextView) convertView.findViewById(R.id.txtBIDV3);
            holder.txtBIDV4 = (TextView) convertView.findViewById(R.id.txtBIDV4);
            holder.txtBIDV5 = (TextView) convertView.findViewById(R.id.txtBIDV5);
            holder.txtBIDV6 = (TextView) convertView.findViewById(R.id.txtBIDV6);
            holder.txtBIDV7 = (TextView) convertView.findViewById(R.id.txtBIDV7);
            holder.txtBIDV8 = (TextView) convertView.findViewById(R.id.txtBIDV8);
            holder.txtBIDV9 = (TextView) convertView.findViewById(R.id.txtBIDV9);
            holder.txtBIDV10 = (TextView) convertView.findViewById(R.id.txtBIDV10);
            holder.txtBIDV11 = (TextView) convertView.findViewById(R.id.txtBIDV11);
            holder.txtBIDV12 = (TextView) convertView.findViewById(R.id.txtBIDV12);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // Đọc dữ liệu và truyền vào biến trong mảng dựa theo tham số position đầu vào
        TyGia tygiaList = tyGiaList.get(position);



        return null;
    }

    public TyGiaAdapter(Context context, int layout, List<TyGia> tyGiaList ) {
        this.context = context;
        this.layout = layout;
        this.tyGiaList = tyGiaList;
    }

    private class ViewHolder {

        // TechcomBank Bank_id = 1
        TextView txtTechcomBank1, txtTechcomBank2, txtTechcomBank3, txtTechcomBank4, txtTechcomBank5,
                txtTechcomBank6, txtTechcomBank7, txtTechcomBank8, txtTechcomBank9, txtTechcomBank10,
                txtTechcomBank11, txtTechcomBank12;
        // VietcomBank Bank_id = 8
        TextView txtVietcomBank1, txtVietcomBank2, txtVietcomBank3,txtVietcomBank4, txtVietcomBank5,
                txtVietcomBank6, txtVietcomBank7, txtVietcomBank8, txtVietcomBank9, txtVietcomBank10,
                txtVietcomBank11, txtVietcomBank12;

        // TPB Bank_id = 4
        TextView txtTPB1, txtTPB2, txtTPB3, txtTPB4, txtTPB5, txtTPB6,
                txtTPB7, txtTPB8, txtTPB9, txtTPB10, txtTPB11, txtTPB12;

        // DongABank Bank_id = 9
        TextView txtDongA1, txtDongA2, txtDongA3, txtDongA4, txtDongA5, txtDongA6, txtDongA7, txtDongA8,
                txtDongA9, txtDongA10, txtDongA11, txtDongA12;

        // VietinBank Bank_id = 6
        TextView txtVietinBank1, txtVietinBank2, txtVietinBank3, txtVietinBank4, txtVietinBank5,
                txtVietinBank6, txtVietinBank7, txtVietinBank8, txtVietinBank9, txtVietinBank10,
                txtVietinBank11, txtVietinBank12;

        // SHB Bank_id = 3
        TextView txtSHB1, txtSHB2, txtSHB3, txtSHB4, txtSHB5, txtSHB6, txtSHB7, txtSHB8, txtSHB9,
                txtSHB10, txtSHB11, txtSHB12;

        // SacomBank Bank_id = 7
        TextView txtSacomBank1, txtSacomBank2, txtSacomBank3, txtSacomBank4, txtSacomBank5,
                txtSacomBank6, txtSacomBank7, txtSacomBank8, txtSacomBank9, txtSacomBank10, txtSacomBank11,
                txtSacomBank12;

        // BIDV Bank_id = 5
        TextView txtBIDV1, txtBIDV2, txtBIDV3, txtBIDV4, txtBIDV5, txtBIDV6, txtBIDV7, txtBIDV8,
                txtBIDV9, txtBIDV10, txtBIDV11, txtBIDV12;


    }
}
