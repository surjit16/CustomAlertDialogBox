package com.example.surjit.customalertdialogbox;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder alertDialog;

    private String[] stringArray = new String[]{"Surjit Singh", "Abhishek", "Jatinder", "Shiva", "Rama"};

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alertDialogBoxSimple(View view) {

        alertDialog = new AlertDialog.Builder(this);

        alertDialog.setCancelable(false); // if you want to restrict user to dont exit without pressing any one button

        // By default this method has value true

        alertDialog.setTitle("Demo");

        alertDialog.setMessage("This is default alert dialog box");

        alertDialog.setIcon(R.drawable.ic_launcher_background);

        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked No Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked Yes Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        alertDialog.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked Neutral Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        alertDialog.show();
    }


    public void alertDialogBoxSelectItems(View view) {

        alertDialog = new AlertDialog.Builder(this);

        alertDialog.setTitle("Demo");

        alertDialog.setItems(stringArray, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Select : " + stringArray[i], Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked No Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked Yes Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        alertDialog.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked Neutral Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        alertDialog.show();
    }

    public void alertDialogBoxMultiChoiceItems(View view) {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        alertDialog.setTitle("Demo");

        alertDialog.setMultiChoiceItems(stringArray, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                toast = Toast.makeText(MainActivity.this, stringArray[i] + " : " + b, Toast.LENGTH_LONG);
                toast.show();
            }
        });

        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked No Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked Yes Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        alertDialog.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked Neutral Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        alertDialog.show();
    }

    public void alertDialogBoxSingleChoiceItems(View view) {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        alertDialog.setTitle("Demo");

        alertDialog.setSingleChoiceItems(stringArray, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, stringArray[i] + " is selected", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked No Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked Yes Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        alertDialog.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked Neutral Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        alertDialog.show();
    }


    public void customAlertDialogBoxEditTextOnly(View view) {

        alertDialog = new AlertDialog.Builder(this);

        View view1 = getLayoutInflater().inflate(R.layout.custom_alert_dialog_edit_text, null);
        alertDialog.setView(view1);

        alertDialog.setTitle("Custom View");

        alertDialog.show();
    }

    public void customAlertDialogBoxEditTextButton(View view) {

        alertDialog = new AlertDialog.Builder(this);

        View view1 = getLayoutInflater().inflate(R.layout.custom_alert_dialog_edit_text, null);
        alertDialog.setView(view1);

        alertDialog.setTitle("Custom View");

        alertDialog.setNegativeButton("Quit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked Quit Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        alertDialog.setPositiveButton("Create", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked Create Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        alertDialog.show();
    }
}
