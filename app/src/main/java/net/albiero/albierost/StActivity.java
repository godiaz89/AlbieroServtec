package net.albiero.albierost;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import Fragments.ClientFragment;
import Fragments.IndexFragment;
import Fragments.MapFragment;
import Fragments.NewsFagment;
import Fragments.OTFragments;

public class StActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final String[] menus={"Inicio","Servicios", "cliente","Mapa","Novedades","Share","Salir"};

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ListView navlist = (ListView) findViewById(R.id.list);
        NavPanelListAdapter adapter = new NavPanelListAdapter(this,menus);
        navlist.setAdapter(adapter);

        IndexFragment indexf = new IndexFragment();
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter, R.anim.pop_exit)
                .replace(R.id.content_st,indexf)
                .addToBackStack(null)
                .commit();


        navlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String selectedMenu = menus[i];

                switch (selectedMenu) {

                    case "Inicio":
                        IndexFragment indexf = new IndexFragment();
                        getSupportFragmentManager().beginTransaction()
                                .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter, R.anim.pop_exit)
                                .replace(R.id.content_st,indexf)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case "Servicios":
                        OTFragments otfrag = new OTFragments();
                        getSupportFragmentManager().beginTransaction()
                                .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter, R.anim.pop_exit)
                                .replace(R.id.content_st,otfrag)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case "clientes":
                        ClientFragment clifrag = new ClientFragment();
                        getSupportFragmentManager().beginTransaction()
                                .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter, R.anim.pop_exit)
                                .replace(R.id.content_st,clifrag)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case "Mapa":
                        MapFragment mapfrag = new MapFragment();
                        getSupportFragmentManager().beginTransaction()
                                .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter, R.anim.pop_exit)
                                .replace(R.id.content_st,mapfrag)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case "Novedades":
                        NewsFagment newfrag = new NewsFagment();
                        getSupportFragmentManager().beginTransaction()
                                .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter, R.anim.pop_exit)
                                .replace(R.id.content_st,newfrag)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case "Share":
                        IndexFragment sharefrag = new IndexFragment();
                        getSupportFragmentManager().beginTransaction()
                                .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter, R.anim.pop_exit)
                                .replace(R.id.content_st,sharefrag)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case "Salir":
                        IndexFragment exitfrag = new IndexFragment();
                        getSupportFragmentManager().beginTransaction()
                                .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter, R.anim.pop_exit)
                                .replace(R.id.content_st,exitfrag)
                                .addToBackStack(null)
                                .commit();
                        break;

                    default:
                        break;



                }

                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);


            }
        });




    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.st, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_inicio) {
            IndexFragment indexfrag = new IndexFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter,R.anim.pop_exit)
                    .replace(R.id.content_st,indexfrag)
                    .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_pendientes) {
            OTFragments otfrag = new OTFragments();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter,R.anim.pop_exit)
                    .replace(R.id.content_st,otfrag)
                    .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_clientes) {
            ClientFragment clifrag = new ClientFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter,R.anim.pop_exit)
                    .replace(R.id.content_st,clifrag)
                    .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_mapa) {
            MapFragment mapfrag = new MapFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter,R.anim.pop_exit)
                    .replace(R.id.content_st,mapfrag)
                    .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_novedades) {
            NewsFagment newsfrag = new NewsFagment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter,R.anim.pop_exit)
                    .replace(R.id.content_st,newsfrag)
                    .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_sesion) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
