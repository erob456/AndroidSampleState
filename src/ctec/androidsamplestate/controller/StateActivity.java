package ctec.androidsamplestate.controller;

import ctec.sampleandroidstateproject.model.AndroidAppState;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StateActivity extends Activity
{
	
	private EditText ageField, nameField, phraseField, stuffField;
	private Button changeButton;
	private AndroidAppState appState;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_state);
		
		ageField = (EditText) findViewById(R.id.ageEditText);
		nameField = (EditText) findViewById(R.id.nameEditText);
		phraseField = (EditText) findViewById(R.id.phraseEditText);
		stuffField = (EditText) findViewById(R.id.stuffEditText);
		changeButton = (Button) findViewById(R.id.swapButton);
		
		appState = (AndroidAppState) getApplication();
				
		setupListeners();
	}
	
	private void setupListeners()
	{
		changeButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				appState.setName(nameField.getText().toString());
				appState.setAge(ageField.getText().toString());
				appState.setPhrase(phraseField.getText().toString());
				appState.setStuff(stuffField.getText().toString());
				
				
				Intent otherScreenIntent = new Intent(currentView.getContext(), TransferDataActivity.class);
				startActivityForResult(otherScreenIntent, 0);
			}
		});
	}
}
