package com.ravi.volleyexamples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	private Button btnJson, btnString, btnImage, btnPost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btnString = (Button) findViewById(R.id.btnStringRequest);
		btnJson = (Button) findViewById(R.id.btnJsonRequest);
		btnImage = (Button) findViewById(R.id.btnImageRequest);
		btnPost = (Button) findViewById(R.id.btnPost);

		// button click listeners
		btnString.setOnClickListener(this);
		btnJson.setOnClickListener(this);
		btnImage.setOnClickListener(this);
		btnPost.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnStringRequest:
			startActivity(new Intent(MainActivity.this,
					StringRequestActivity.class));
			break;
		case R.id.btnJsonRequest:
			startActivity(new Intent(MainActivity.this,
					JsonRequestActivity.class));
			break;
		case R.id.btnImageRequest:
			startActivity(new Intent(MainActivity.this,
					ImageRequestActivity.class));
			break;
			case R.id.btnPost:
				startActivity(new Intent(MainActivity.this,
						PostActivity.class));
				break;

			default:
			break;
		}
	}

}
