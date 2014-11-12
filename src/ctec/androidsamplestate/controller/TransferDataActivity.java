package ctec.androidsamplestate.controller;

import ctec.sampleandroidstateproject.model.AndroidAppState;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TransferDataActivity extends Activity
{
	private AndroidAppState appState;
	private TextView comboText;
	private Button homeButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transfer_data);
		
		appState = (AndroidAppState) getApplication();
		comboText = (TextView) findViewById(R.id.combinedTextView);
		homeButton = (Button) findViewById(R.id.homeButton);
		
		comboText.setText(appState.getName() + " is " + appState.getAge() + " and says " + appState.getPhrase() + " about " + appState.getStuff());
		
		setupListeners();
	
		
	}
	
	private void setupListeners()
	{
		homeButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Intent returnIntent = new Intent();
				setResult(RESULT_OK, returnIntent);
				finish();
			}
		});
	}
}
