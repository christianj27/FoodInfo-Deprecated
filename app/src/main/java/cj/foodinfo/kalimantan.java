package cj.foodinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class kalimantan extends AppCompatActivity {
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalimantan);
        this.setTitle("Kalimantan");
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                if(menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);
                drawerLayout.closeDrawers();
                switch (menuItem.getItemId()){
                    case R.id.navigation1:
                        Intent intent = new Intent(kalimantan.this, Main.class);
                        startActivity(intent);
                        finish();
                        return true;
                    case R.id.navigation3:
                        Intent jaw = new Intent(kalimantan.this, sumatera.class);
                        startActivity(jaw);
                        finish();
                        return true;
                    case R.id.navigation4:
                        Intent kal = new Intent(kalimantan.this, jawa.class);
                        startActivity(kal);
                        finish();
                        return true;
                    case R.id.navigation5:
                        Toast.makeText(getApplicationContext(),"Kalimantan Telah Dipilih",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.navigation6:
                        Intent sul = new Intent(kalimantan.this, sulawesi.class);
                        startActivity(sul);
                        finish();
                        return true;
                    case R.id.navigation7:
                        Intent pap = new Intent(kalimantan.this, papua.class);
                        startActivity(pap);
                        finish();
                        return true;
                    case R.id.navigation2:
                        Intent ten = new Intent(kalimantan.this, tentang.class);
                        startActivity(ten);
                        finish();
                        return true;
                    default:
                        Toast.makeText(getApplicationContext(),"Kesalahan Terjadi ",Toast.LENGTH_SHORT).show();
                        return true;
                }
            }
        });
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openDrawer, R.string.closeDrawer){
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }
    public void satu2(View v) {
        Intent intent = new Intent(kalimantan.this, kal1.class);
        startActivity(intent);
        finish();
    }
    public void dua2(View v) {
        Intent intent = new Intent(kalimantan.this, kal2.class);
        startActivity(intent);
        finish();
    }
    public void tiga2(View v) {
        Intent intent = new Intent(kalimantan.this,kal3.class);
        startActivity(intent);
        finish();
    }
    public void empat2(View v) {
        Intent intent = new Intent(kalimantan.this, kal4.class);
        startActivity(intent);
        finish();
    }
    public void lima2(View v) {
        Intent intent = new Intent(kalimantan.this, kal5.class);
        startActivity(intent);
        finish();
    }
    public void enam2(View v) {
        Intent intent = new Intent(kalimantan.this, kal6.class);
        startActivity(intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(kalimantan.this, Main.class);
        startActivity(intent);
        finish();
    }

}
