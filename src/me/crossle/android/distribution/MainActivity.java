package me.crossle.android.distribution;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import me.crossle.android.distribution.charting.PieChart;

public class MainActivity extends Activity {
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Resources res = getResources();

		setContentView(R.layout.main);
		final PieChart platformPie = (PieChart) this.findViewById(R.id.platform_pie);
		platformPie.addItem(getString(R.string.jelly_bean), 10.2f, res.getColor(R.color.seafoam));
		platformPie.addItem(getString(R.string.ice_cream_sandwich), 29.1f, res.getColor(R.color.chartreuse));
		platformPie.addItem(getString(R.string.honeycomb), 1.5f, res.getColor(R.color.emerald));
		platformPie.addItem(getString(R.string.gingerbread), 47.6f, res.getColor(R.color.bluegrass));
		platformPie.addItem(getString(R.string.froyo), 9.0f, res.getColor(R.color.turquoise));
		platformPie.addItem(getString(R.string.eclair), 2.6f, res.getColor(R.color.slate));

		final PieChart screenSizePie = (PieChart) this.findViewById(R.id.screen_size);
		screenSizePie.addItem(getString(R.string.small), 2.7f, res.getColor(R.color.seafoam));
		screenSizePie.addItem(getString(R.string.normal), 86.4f, res.getColor(R.color.chartreuse));
		screenSizePie.addItem(getString(R.string.large), 6.1f, res.getColor(R.color.emerald));
		screenSizePie.addItem(getString(R.string.xlarge), 4.6f, res.getColor(R.color.bluegrass));

		final PieChart screenDensityPie = (PieChart) this.findViewById(R.id.screen_density);
		screenDensityPie.addItem(getString(R.string.ldpi), 2.2f, res.getColor(R.color.seafoam));
		screenDensityPie.addItem(getString(R.string.mdpi), 18f, res.getColor(R.color.chartreuse));
		screenDensityPie.addItem(getString(R.string.hdpi), 51.1f, res.getColor(R.color.emerald));
		screenDensityPie.addItem(getString(R.string.xhdpi), 28.7f, res.getColor(R.color.bluegrass));

		final PieChart openglPie = (PieChart) this.findViewById(R.id.opengl_version);
		openglPie.addItem(getString(R.string.gl1), 9.2f, res.getColor(R.color.seafoam));
		openglPie.addItem(getString(R.string.gl2), 90.8f, res.getColor(R.color.chartreuse));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.home_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_about:
			startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(this.getString(R.string.dashboard))));
			break;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
}
