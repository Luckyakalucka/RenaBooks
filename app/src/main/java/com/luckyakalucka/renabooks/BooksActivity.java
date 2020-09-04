package com.luckyakalucka.renabooks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class BooksActivity<tv1> extends AppCompatActivity {

    Button tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11, tv12, tv13, tv14, tv15, tv16, tv17, tv18, tv19, tv20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
    }


    public void onMyButtonClick(View view) {

        //
        //     if (view.getId() == R.id.tvX) {
        //     browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        //     startActivity(browserIntent);
        //  }

        Intent browserIntent;
        if (view.getId() == R.id.tv1) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://4book.org/uchebniki-ukraina/10-klass/ukrayinska-mova-10-klas-zabolotniy-2018-rus"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv3) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vshkole.com/10-klass/uchebniki/ukrayinska-literatura/lt-kovalenko-ni-bernadska-2018-riven-standartu"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv5) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vshkole.com/10-klass/uchebniki/matematika/mi-burda-tv-kolesnik-yui-malovanij-2018"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv7) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vshkole.com/10-klass/uchebniki/anglijska-mova/od-karpyuk-2018"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv8) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vshkole.com/10-klass/reshebniki/anglijska-mova/od-karpyuk-2018"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv9) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vshkole.com/10-klass/uchebniki/himiya/pp-popel-ls-kriklya-2018"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv10) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vshkole.com/10-klass/reshebniki/himiya/pp-popel-ls-kriklya-2018"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv11) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vshkole.com/10-klass/uchebniki/fizika/vg-baryahtar-so-dovgij-fya-bozhinova-2018-riven-standartu"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv12) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vshkole.com/10-klass/reshebniki/fizika/vg-baryahtar-so-dovgij-fya-bozhinova-2018-riven-standartu"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv4) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vshkole.com/10-klass/uchebniki/geografiya/gd-dovgan-og-stadnik-2018-riven-standartu"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv6) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vshkole.com/10-klass/uchebniki/mistetstvo/ov-gajdamaka-2018-riven-standartu-profilnij-riven"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv13) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vshkole.com/10-klass/uchebniki/istoriya-ukrayini/vs-vlasov-sv-kulchitskij-2018-profilnij-riven"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv14) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vshkole.com/10-klass/uchebniki/vsesvitnya-istoriya/ov-gisem-oo-martinyuk-2018-profilnij-riven"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv15) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vshkole.com/10-klass/uchebniki/nimetska-mova/si-sotnikova-gv-gogolyeva-2018-6-rik-navchannya"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv16) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vshkole.com/10-klass/reshebniki/nimetska-mova/si-sotnikova-gv-gogolyeva-2018-6-rik-navchannya"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv17) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vshkole.com/10-klass/uchebniki/gromadyanska-osvita/tv-bakka-lv-margolina-tv-meleschenko-2018"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv18) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://4book.org/uchebniki-ukraina/10-klass/zarubezhnaya-literatura-10-klass-nikolenko-2018"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv19) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://4book.org/uchebniki-ukraina/10-klass/russkiy-yazyk-i-literatura-10-klass-davidyuk-2018"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv20) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://4book.org/uchebniki-ukraina/10-klass/zahist-vitchizni-10-klas-gnatyuk-2018"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tv21) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://4book.org/uchebniki-ukraina/10-klass/zahist-vitchizni-10-klas-gudima-2018"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.home) {
            Intent intent = new Intent(BooksActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}