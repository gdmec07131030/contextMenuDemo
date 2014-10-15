package com.example.contextmenudemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
	public boolean onContextItemSelected(MenuItem item) {
		tv1.setText("��ѡ����"+item.getTitle());
		switch(item.getItemId()){
		case 1:tv2.setText("��ѡ���˵�һ��");break;
		case 2:tv2.setText("��ѡ���˵ڶ���");break;
		case 3:tv2.setText("��ѡ���˵�����");break;
		case 4:tv2.setText("��ѡ���˵�����");break;
		}
		return super.onContextItemSelected(item);
	}


	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		menu.add(0,1,0,"���ǵ�һ���˵�");
		menu.add(0,2,1,"���ǵڶ����˵�");
		menu.add(0,3,2,"���ǵ������˵�");
		menu.add(0,4,3,"���ǵ��ĸ��˵�");
		super.onCreateContextMenu(menu, v, menuInfo);
		
	}


	TextView tv1,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView) findViewById(R.id.textView1);
        tv2=(TextView) findViewById(R.id.textView2);
        tv3=(TextView) findViewById(R.id.textView3);
        registerForContextMenu(tv3);
        tv3.setText("�˵���ť");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
