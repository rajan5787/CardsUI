package com.appsrox.cardsui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.dexafree.materialList.cards.BigImageCard;
import com.dexafree.materialList.controller.RecyclerItemClickListener;
import com.dexafree.materialList.model.CardItemView;
import com.dexafree.materialList.view.MaterialListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialListView mListView = (MaterialListView) findViewById(R.id.material_listview);


        mListView.addOnItemTouchListener(new RecyclerItemClickListener.OnItemClickListener() {

            @Override
            public void onItemClick(CardItemView view, int position) {
                Toast.makeText(getApplicationContext(), "Marked as ", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(CardItemView view, int position) {
            }
        });


        BigImageCard card = new BigImageCard(getApplicationContext());
        card.setTitle("Your title");
        card.setTitleColor(Color.parseColor("#FFFFFF"));
        card.setDescription("Your description Your description Your description Your description Your description Your description Your description Your description");
        card.setDrawable(R.drawable.emogi);

        mListView.add(card);
        mListView.add(card);
        mListView.add(card);
        mListView.add(card);
        mListView.add(card);
        mListView.add(card);
        mListView.add(card);
        mListView.add(card);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
