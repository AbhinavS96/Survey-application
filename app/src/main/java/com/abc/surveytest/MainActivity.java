package com.abc.surveytest;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.EditText;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;


public class MainActivity extends AppCompatActivity {

    DBhandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DBhandler(this, null, null, 1);
        permission();

        NumberPicker numberPicker = (NumberPicker) findViewById(R.id.sunlight);
        final String values[] = {"0-Not risky", "1-Slightly risky", "2-Moderately risky", "3-Very risky", "4-Severely risky", "5-Extremely risky" };
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(values);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.fertiliser);
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(values);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker)findViewById(R.id.pesticide);
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(values);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.animal);
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(values);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.tool);
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(values);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.others);
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(values);
        numberPicker.setWrapSelectorWheel(true);

        final String Rvalues[] = {"0-Not used", "1-Very easy", "2-Easy", "3-Moderate", "4-Somewhat difficult", "5-Difficult", "Very difficult" };
        numberPicker = (NumberPicker) findViewById(R.id.hoe);
        numberPicker.setMaxValue(6);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(Rvalues);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.pickaxe);
        numberPicker.setMaxValue(6);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(Rvalues);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.shovel);
        numberPicker.setMaxValue(6);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(Rvalues);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.crowbar);
        numberPicker.setMaxValue(6);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(Rvalues);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.machette);
        numberPicker.setMaxValue(6);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(Rvalues);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.otherJob);
        numberPicker.setMaxValue(6);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(Rvalues);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.material);
        numberPicker.setMaxValue(6);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(Rvalues);
        numberPicker.setWrapSelectorWheel(true);

        final String msdValues[] = {"0-Not pain", "1-Slight discomfort", "2-Severe discomfort", "3-Somewhat pain", "4-Somewhat hard pain", "5-Severe pain" };
        numberPicker = (NumberPicker) findViewById(R.id.neck);
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(msdValues);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.shoulder);
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(msdValues);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.elbow);
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(msdValues);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.wrist);
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(msdValues);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.uBack);
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(msdValues);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.lBack);
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(msdValues);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.hips);
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(msdValues);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.knee);
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(msdValues);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker = (NumberPicker) findViewById(R.id.ankle);
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);
        numberPicker.setDisplayedValues(msdValues);
        numberPicker.setWrapSelectorWheel(true);
    }

    private void permission()
    {
        if (PackageManager.PERMISSION_GRANTED != ContextCompat.checkSelfPermission(this, WRITE_EXTERNAL_STORAGE)) {
            int code = 10;
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, code);
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, code);
            }
        }
    }

    public void msdYes(View view)
    {
        enableFunction((RadioGroup) findViewById(R.id.msdNeck), true);
        enableFunction((RadioGroup) findViewById(R.id.msdShoulder), true);
        enableFunction((RadioGroup) findViewById(R.id.msdElbow), true);
        enableFunction((RadioGroup) findViewById(R.id.msdWrist), true);
        enableFunction((RadioGroup) findViewById(R.id.msdUback), true);
        enableFunction((RadioGroup) findViewById(R.id.msdLback), true);
        enableFunction((RadioGroup) findViewById(R.id.msdHip), true);
        enableFunction((RadioGroup) findViewById(R.id.msdKnee), true);
        enableFunction((RadioGroup) findViewById(R.id.msdAnkle), true);

        enableNumber((NumberPicker) findViewById(R.id.neck), true);
        enableNumber((NumberPicker) findViewById(R.id.shoulder), true);
        enableNumber((NumberPicker) findViewById(R.id.elbow), true);
        enableNumber((NumberPicker) findViewById(R.id.wrist), true);
        enableNumber((NumberPicker) findViewById(R.id.uBack), true);
        enableNumber((NumberPicker) findViewById(R.id.lBack), true);
        enableNumber((NumberPicker) findViewById(R.id.hips), true);
        enableNumber((NumberPicker) findViewById(R.id.knee), true);
        enableNumber((NumberPicker) findViewById(R.id.ankle), true);
    }
    public void msdNo(View view)
    {
        enableFunction((RadioGroup) findViewById(R.id.msdNeck), false);
        enableFunction((RadioGroup) findViewById(R.id.msdShoulder), false);
        enableFunction((RadioGroup) findViewById(R.id.msdElbow), false);
        enableFunction((RadioGroup) findViewById(R.id.msdWrist), false);
        enableFunction((RadioGroup) findViewById(R.id.msdUback), false);
        enableFunction((RadioGroup) findViewById(R.id.msdLback), false);
        enableFunction((RadioGroup) findViewById(R.id.msdHip), false);
        enableFunction((RadioGroup) findViewById(R.id.msdKnee), false);
        enableFunction((RadioGroup) findViewById(R.id.msdAnkle), false);

        enableNumber((NumberPicker) findViewById(R.id.neck), false);
        enableNumber((NumberPicker) findViewById(R.id.shoulder), false);
        enableNumber((NumberPicker) findViewById(R.id.elbow), false);
        enableNumber((NumberPicker) findViewById(R.id.wrist), false);
        enableNumber((NumberPicker) findViewById(R.id.uBack), false);
        enableNumber((NumberPicker) findViewById(R.id.lBack), false);
        enableNumber((NumberPicker) findViewById(R.id.hips), false);
        enableNumber((NumberPicker) findViewById(R.id.knee), false);
        enableNumber((NumberPicker) findViewById(R.id.ankle), false);
    }

    public void injuryYes(View view)
    {
        enableFunction((RadioGroup) findViewById(R.id.whatActivity), true);
        enableFunction((RadioGroup) findViewById(R.id.injuryReport), true);
        enableFunction((RadioGroup) findViewById(R.id.seePhysician), true);
        enableFunction((RadioGroup) findViewById(R.id.loseHalf), true);
        enableFunction((RadioGroup) findViewById(R.id.limitedTime), true);
        enableFunction((RadioGroup) findViewById(R.id.limitedArea), true);
        enableFunction((RadioGroup) findViewById(R.id.treatmentApplied), true);
        enableFunction((RadioGroup) findViewById(R.id.worseSymptoms), true);
        enableFunction((RadioGroup) findViewById(R.id.whatSymptoms), true);
        enableFunction((RadioGroup) findViewById(R.id.workAlter), true);
        enableFunction((RadioGroup) findViewById(R.id.whatAlter), true);
        enableFunction((RadioGroup) findViewById(R.id.jobChange), true);
    }
    public void injuryNo(View view)
    {
        enableFunction((RadioGroup) findViewById(R.id.whatActivity), false);
        enableFunction((RadioGroup) findViewById(R.id.injuryReport), false);
        enableFunction((RadioGroup) findViewById(R.id.seePhysician), false);
        enableFunction((RadioGroup) findViewById(R.id.loseHalf), false);
        enableFunction((RadioGroup) findViewById(R.id.limitedTime), false);
        enableFunction((RadioGroup) findViewById(R.id.limitedArea), false);
        enableFunction((RadioGroup) findViewById(R.id.treatmentApplied), false);
        enableFunction((RadioGroup) findViewById(R.id.worseSymptoms), false);
        enableFunction((RadioGroup) findViewById(R.id.whatSymptoms), false);
        enableFunction((RadioGroup) findViewById(R.id.workAlter), false);
        enableFunction((RadioGroup) findViewById(R.id.whatAlter), false);
        enableFunction((RadioGroup) findViewById(R.id.jobChange), false);
    }

    public void workAlterYes(View view)
    {
        enableFunction((RadioGroup) findViewById(R.id.whatAlter), true);
    }
    public void workAlterNo(View view)
    {
        enableFunction((RadioGroup) findViewById(R.id.whatAlter), false);
    }

    public void symptomYes(View view)
    {
        enableFunction((RadioGroup) findViewById(R.id.whatSymptoms), true);
    }
    public void symptomNo(View view)
    {
        enableFunction((RadioGroup) findViewById(R.id.whatSymptoms), false);
    }

    private void enableFunction(RadioGroup radioGroup, boolean enabled)
    {
        radioGroup.clearCheck();
        for (int i = 0; i < radioGroup.getChildCount(); i++) {
            radioGroup.getChildAt(i).setEnabled(enabled);
        }
    }
    private void enableNumber(NumberPicker numberPicker, boolean enabled)
    {
        numberPicker.setValue(0);
        numberPicker.setEnabled(enabled);
    }

    public void onClickSave(View view)
    {
        //VIEW VARIABLES*********************************************************************************
        EditText editText;
        RadioButton radioButton;
        NumberPicker numberPicker;
        CheckBox checkBox;
        //VIEW VARIABLES END*****************************************************************************

        //SECTION: A********************************************************************************
        editText = (EditText) findViewById(R.id.name);
        String name = editText.getText().toString();
        editText.setText("", TextView.BufferType.EDITABLE);

        editText = (EditText) findViewById(R.id.weight);
        String weight = editText.getText().toString();
        editText.setText("", TextView.BufferType.EDITABLE);

        editText = (EditText) findViewById(R.id.height);
        String height = editText.getText().toString();
        editText.setText("", TextView.BufferType.EDITABLE);

        editText = (EditText) findViewById(R.id.age);
        String age = editText.getText().toString();
        editText.setText("", TextView.BufferType.EDITABLE);

        String literate;
        radioButton = (RadioButton) findViewById(R.id.literateYes);
        if(radioButton.isChecked())
            literate = "1";
        else
        {
            literate = "0";
            radioButton = (RadioButton) findViewById(R.id.literateNo);
        }
        radioButton.setChecked(false);

        String education = ((EditText) findViewById(R.id.education)).getText().toString();
        ((EditText) findViewById(R.id.education)).setText("", TextView.BufferType.EDITABLE);

        editText = (EditText) findViewById(R.id.members);
        String members = editText.getText().toString();
        editText.setText("", TextView.BufferType.EDITABLE);
        //END OF SECTION: A*************************************************************************

        //SECTION: B********************************************************************************
        editText = (EditText) findViewById(R.id.working);
        String working = editText.getText().toString();
        editText.setText("", TextView.BufferType.EDITABLE);

        editText = (EditText) findViewById(R.id.experience);
        String experience = editText.getText().toString();
        editText.setText("", TextView.BufferType.EDITABLE);

        editText = (EditText) findViewById(R.id.hours);
        String hours = editText.getText().toString();
        editText.setText("", TextView.BufferType.EDITABLE);

        editText = (EditText) findViewById(R.id.days);
        String days = editText.getText().toString();
        editText.setText("", TextView.BufferType.EDITABLE);

        //END OF SECTION: B*************************************************************************

        //SECTION: C********************************************************************************
        radioButton = (RadioButton) findViewById(R.id.two);
        String standWalk = "0";
        if(radioButton.isChecked())
        {
            standWalk = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.twoToFour);
        if(radioButton.isChecked())
        {
            standWalk = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.fourToSix);
        if(radioButton.isChecked())
        {
            standWalk = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.six);
        if(radioButton.isChecked())
        {
            standWalk = "4";
            radioButton.setChecked(false);
        }

        radioButton = (RadioButton) findViewById(R.id.walk);
        String transport = "0";
        if(radioButton.isChecked())
        {
            transport = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.other);
        if(radioButton.isChecked())
        {
            transport = "2";
            radioButton.setChecked(false);
        }

        radioButton = (RadioButton) findViewById(R.id.twoKm);
        String distance = "0";
        if(radioButton.isChecked())
        {
            distance = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.twoToFourKm);
        if(radioButton.isChecked())
        {
            distance = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.fourToSixKm);
        if(radioButton.isChecked())
        {
            distance = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.sixKm);
        if(radioButton.isChecked())
        {
            distance = "4";
            radioButton.setChecked(false);
        }

        radioButton = (RadioButton) findViewById(R.id.sandy);
        String soil = "0";
        if(radioButton.isChecked())
        {
            soil = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.clay);
        if(radioButton.isChecked())
        {
            soil = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.laterite);
        if(radioButton.isChecked())
        {
            soil = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.alluvial);
        if(radioButton.isChecked())
        {
            soil = "4";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.otherSoil);
        if(radioButton.isChecked())
        {
            soil = "5";
            radioButton.setChecked(false);
        }

        String[] factors = new String[6];
        numberPicker = (NumberPicker) findViewById(R.id.sunlight);
        factors[0] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.fertiliser);
        factors[1] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.pesticide);
        factors[2] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.animal);
        factors[3] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.tool);
        factors[4] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.others);
        factors[5] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        radioButton = (RadioButton) findViewById(R.id.Never);
        String mentallyExhausted = "0";
        if(radioButton.isChecked())
        {
            mentallyExhausted = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.Occasionally);
        if(radioButton.isChecked())
        {
            mentallyExhausted = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.Often);
        if(radioButton.isChecked())
        {
            mentallyExhausted = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.Always);
        if(radioButton.isChecked())
        {
            mentallyExhausted = "4";
            radioButton.setChecked(false);
        }

        radioButton = (RadioButton) findViewById(R.id.never);
        String physicallyExhausted = "0";
        if(radioButton.isChecked())
        {
            physicallyExhausted = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.occasionally);
        if(radioButton.isChecked())
        {
            physicallyExhausted = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.often);
        if(radioButton.isChecked())
        {
            physicallyExhausted = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.always);
        if(radioButton.isChecked())
        {
            physicallyExhausted = "4";
            radioButton.setChecked(false);
        }
        //END OF SECTION: C*************************************************************************

        //SECTION: D********************************************************************************
        String repeat = "0";
        radioButton = (RadioButton) findViewById(R.id.repeatYes);
        if(radioButton.isChecked())
        {
            repeat = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.repeatNo);
        if(radioButton.isChecked())
        {
            repeat = "0";
            radioButton.setChecked(false);
        }

        String repeatHours = "0";
        radioButton = (RadioButton) findViewById(R.id.repeatTwo);
        if(radioButton.isChecked())
        {
            repeatHours = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.repeatTwoToFour);
        if(radioButton.isChecked())
        {
            repeatHours = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.repeatFour);
        if(radioButton.isChecked())
        {
            repeatHours = "3";
            radioButton.setChecked(false);
        }

        String rest = "0";
        radioButton = (RadioButton) findViewById(R.id.min30);
        if(radioButton.isChecked())
        {
            rest = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.min30to60);
        if(radioButton.isChecked())
        {
            rest = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.min60to90);
        if(radioButton.isChecked())
        {
            rest = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.min90);
        if(radioButton.isChecked())
        {
            rest = "4";
            radioButton.setChecked(false);
        }

        String[] activity = new String[7];
        numberPicker = (NumberPicker) findViewById(R.id.hoe);
        activity[0] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.pickaxe);
        activity[1] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.shovel);
        activity[2] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.crowbar);
        activity[3] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.machette);
        activity[4] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.otherJob);
        activity[5] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.material);
        activity[6] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);
        //END OF SECTION: D*************************************************************************

        //SECTION: E********************************************************************************
        String breakfast ="0";
        radioButton = (RadioButton) findViewById(R.id.breakfastYes);
        if(radioButton.isChecked())
        {
            breakfast = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.breakfastNo);
        if(radioButton.isChecked())
        {
            breakfast = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.breakfastSometimes);
        if(radioButton.isChecked())
        {
            breakfast = "3";
            radioButton.setChecked(false);
        }

        String lunch ="0";
        radioButton = (RadioButton) findViewById(R.id.lunchYes);
        if(radioButton.isChecked())
        {
            lunch = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.lunchNo);
        if(radioButton.isChecked())
        {
            lunch = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.lunchSometimes);
        if(radioButton.isChecked())
        {
            lunch = "3";
            radioButton.setChecked(false);
        }

        String tobacco ="0";
        radioButton = (RadioButton) findViewById(R.id.tobaccoNo);
        if(radioButton.isChecked())
        {
            tobacco = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.betel);
        if(radioButton.isChecked())
        {
            tobacco = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.pan);
        if(radioButton.isChecked())
        {
            tobacco = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.snuff);
        if(radioButton.isChecked())
        {
            tobacco = "4";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.cigarette);
        if(radioButton.isChecked())
        {
            tobacco = "5";
            radioButton.setChecked(false);
        }
        //END OF SECTION: E*************************************************************************

        //SECTION: F********************************************************************************
        String previous = "0";
        radioButton = (RadioButton) findViewById(R.id.BP);
        if(radioButton.isChecked())
        {
            previous = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.diabetes);
        if(radioButton.isChecked())
        {
            previous = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.migraine);
        if(radioButton.isChecked())
        {
            previous = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.arthritis);
        if(radioButton.isChecked())
        {
            previous = "4";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.spondylitis);
        if(radioButton.isChecked())
        {
            previous = "5";
            radioButton.setChecked(false);
        }

        String msdYes = "0";
        radioButton = (RadioButton) findViewById(R.id.msdYes);
        if(radioButton.isChecked())
        {
            msdYes="1";
            radioButton.setChecked(false);
        }
        else
            ((RadioButton) findViewById(R.id.msdno)).setChecked(false);

        String msdNeck = "0";
        radioButton = (RadioButton) findViewById(R.id.msdNeck1);
        if(radioButton.isChecked())
        {
            msdNeck = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdNeck2);
        if(radioButton.isChecked())
        {
            msdNeck = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdNeck3);
        if(radioButton.isChecked())
        {
            msdNeck = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdNeck4);
        if(radioButton.isChecked())
        {
            msdNeck = "4";
            radioButton.setChecked(false);
        }

        String msdShoulder = "0";
        radioButton = (RadioButton) findViewById(R.id.msdShoulder1);
        if(radioButton.isChecked())
        {
            msdShoulder = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdShoulder2);
        if(radioButton.isChecked())
        {
            msdShoulder = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdShoulder3);
        if(radioButton.isChecked())
        {
            msdShoulder = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdShoulder4);
        if(radioButton.isChecked())
        {
            msdShoulder = "4";
            radioButton.setChecked(false);
        }

        String msdElbow = "0";
        radioButton = (RadioButton) findViewById(R.id.msdElbow1);
        if(radioButton.isChecked())
        {
            msdElbow = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdElbow2);
        if(radioButton.isChecked())
        {
            msdElbow = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdElbow3);
        if(radioButton.isChecked())
        {
            msdElbow = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdElbow4);
        if(radioButton.isChecked())
        {
            msdElbow = "4";
            radioButton.setChecked(false);
        }

        String msdWrist = "0";
        radioButton = (RadioButton) findViewById(R.id.msdWrist1);
        if(radioButton.isChecked())
        {
            msdWrist = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdWrist2);
        if(radioButton.isChecked())
        {
            msdWrist = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdWrist3);
        if(radioButton.isChecked())
        {
            msdWrist = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdWrist4);
        if(radioButton.isChecked())
        {
            msdWrist = "4";
            radioButton.setChecked(false);
        }

        String uBack = "0";
        radioButton = (RadioButton) findViewById(R.id.msdUback1);
        if(radioButton.isChecked())
        {
            uBack = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdUback2);
        if(radioButton.isChecked())
        {
            uBack = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdUback3);
        if(radioButton.isChecked())
        {
            uBack = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdUback4);
        if(radioButton.isChecked())
        {
            uBack = "4";
            radioButton.setChecked(false);
        }

        String lBack = "0";
        radioButton = (RadioButton) findViewById(R.id.msdLback1);
        if(radioButton.isChecked())
        {
            lBack = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdLback2);
        if(radioButton.isChecked())
        {
            lBack = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdLback3);
        if(radioButton.isChecked())
        {
            lBack = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdLback4);
        if(radioButton.isChecked())
        {
            lBack = "4";
            radioButton.setChecked(false);
        }

        String hip = "0";
        radioButton = (RadioButton) findViewById(R.id.msdHip1);
        if(radioButton.isChecked())
        {
            hip = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdHip2);
        if(radioButton.isChecked())
        {
            hip = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdHip3);
        if(radioButton.isChecked())
        {
            hip = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdHip4);
        if(radioButton.isChecked())
        {
            hip = "4";
            radioButton.setChecked(false);
        }

        String knee = "0";
        radioButton = (RadioButton) findViewById(R.id.msdKnee1);
        if(radioButton.isChecked())
        {
            knee = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdKnee2);
        if(radioButton.isChecked())
        {
            knee = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdKnee3);
        if(radioButton.isChecked())
        {
            knee = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdKnee4);
        if(radioButton.isChecked())
        {
            knee = "4";
            radioButton.setChecked(false);
        }

        String ankle = "0";
        radioButton = (RadioButton) findViewById(R.id.msdAnkle1);
        if(radioButton.isChecked())
        {
            ankle = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdAnkle2);
        if(radioButton.isChecked())
        {
            ankle = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdAnkle3);
        if(radioButton.isChecked())
        {
            ankle = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.msdAnkle4);
        if(radioButton.isChecked())
        {
            ankle = "4";
            radioButton.setChecked(false);
        }

        String[] rating = {"0", "0", "0", "0", "0", "0", "0", "0", "0"};
        numberPicker = (NumberPicker) findViewById(R.id.neck);
        rating[0] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.shoulder);
        rating[1] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.elbow);
        rating[2] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.wrist);
        rating[3] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.uBack);
        rating[4] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.lBack);
        rating[5] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.hips);
        rating[6] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.knee);
        rating[7] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        numberPicker = (NumberPicker) findViewById(R.id.ankle);
        rating[8] = Integer.toString(numberPicker.getValue());
        numberPicker.setValue(0);

        this.msdYes(view);
        //END OF SECTION: F*************************************************************************

        //SECTION: G********************************************************************************
        String injury = "0";
        radioButton = (RadioButton) findViewById(R.id.injuryYes);
        if(radioButton.isChecked())
        {
            injury = "1";
            radioButton.setChecked(false);
        }
        else
            ((RadioButton) findViewById(R.id.injuryNo)).setChecked(false);

        String Activity = "-1";
        radioButton = (RadioButton) findViewById(R.id.repeat);
        if(radioButton.isChecked())
        {
            Activity = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.bend);
        if(radioButton.isChecked())
        {
            Activity = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.lift);
        if(radioButton.isChecked())
        {
            Activity = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.slip);
        if(radioButton.isChecked())
        {
            Activity = "4";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.position);
        if(radioButton.isChecked())
        {
            Activity = "5";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.cramp);
        if(radioButton.isChecked())
        {
            Activity = "6";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.move);
        if(radioButton.isChecked())
        {
            Activity = "7";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.fatigue);
        if(radioButton.isChecked())
        {
            Activity = "8";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.injuryOther);
        if(radioButton.isChecked())
        {
            Activity = "9";
            radioButton.setChecked(false);
        }

        String report = "-1";
        radioButton = (RadioButton) findViewById(R.id.reportYes);
        if(radioButton.isChecked())
        {
            report = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.reportNo);
        if(radioButton.isChecked())
        {
            report = "0";
            radioButton.setChecked(false);
        }

        String physician = "-1";
        radioButton = (RadioButton) findViewById(R.id.physicianYes);
        if(radioButton.isChecked())
        {
            physician = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.physicianNo);
        if(radioButton.isChecked())
        {
            physician = "0";
            radioButton.setChecked(false);
        }

        String lose = "-1";
        radioButton = (RadioButton) findViewById(R.id.loseYes);
        if(radioButton.isChecked())
        {
            lose = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.loseNo);
        if(radioButton.isChecked())
        {
            lose = "0";
            radioButton.setChecked(false);
        }

        String time = "-1";
        radioButton = (RadioButton) findViewById(R.id.timeYes);
        if(radioButton.isChecked())
        {
            time = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.timeNo);
        if(radioButton.isChecked())
        {
            time = "0";
            radioButton.setChecked(false);
        }

        String area = "-1";
        radioButton = (RadioButton) findViewById(R.id.areaYes);
        if(radioButton.isChecked())
        {
            area = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.areaNo);
        if(radioButton.isChecked())
        {
            area = "0";
            radioButton.setChecked(false);
        }

        String treatment = "-1";
        radioButton = (RadioButton) findViewById(R.id.surgical);
        if(radioButton.isChecked())
        {
            treatment = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.medical);
        if(radioButton.isChecked())
        {
            treatment = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.personal);
        if(radioButton.isChecked())
        {
            treatment = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.rest);
        if(radioButton.isChecked())
        {
            treatment = "4";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.exercises);
        if(radioButton.isChecked())
        {
            treatment = "5";
            radioButton.setChecked(false);
        }

        String symptom = "-1";
        radioButton = (RadioButton) findViewById(R.id.symptomYes);
        if(radioButton.isChecked())
        {
            symptom = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.symptomNo);
        if(radioButton.isChecked())
        {
            symptom = "0";
            radioButton.setChecked(false);
        }

        String sActivity = "0";
        radioButton = (RadioButton) findViewById(R.id.Bend);
        if(radioButton.isChecked())
        {
            sActivity = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.Reach);
        if(radioButton.isChecked())
        {
            sActivity = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.Transfer);
        if(radioButton.isChecked())
        {
            sActivity = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.Position);
        if(radioButton.isChecked())
        {
            sActivity = "4";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.Repeat);
        if(radioButton.isChecked())
        {
            sActivity = "5";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.Overhead);
        if(radioButton.isChecked())
        {
            sActivity = "6";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.Cramp);
        if(radioButton.isChecked())
        {
            sActivity = "7";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.Lift);
        if(radioButton.isChecked())
        {
            sActivity = "8";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.Squat);
        if(radioButton.isChecked())
        {
            sActivity = "9";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.walk);
        if(radioButton.isChecked())
        {
            sActivity = "10";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.InjuryOther);
        if(radioButton.isChecked())
        {
            sActivity = "11";
            radioButton.setChecked(false);
        }
        if(injury.equals("0"))
            sActivity = "-1";

        String alter = "-1";
        radioButton = (RadioButton) findViewById(R.id.WorkHabitYes);
        if(radioButton.isChecked())
        {
            alter = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.WorkHabitNo);
        if(radioButton.isChecked())
        {
            alter = "0";
            radioButton.setChecked(false);
        }

        String aActivity = "0";
        radioButton = (RadioButton) findViewById(R.id.avoid);
        if(radioButton.isChecked())
        {
            aActivity = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.Position);
        if(radioButton.isChecked())
        {
            aActivity = "2";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.schedule);
        if(radioButton.isChecked())
        {
            aActivity = "3";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.time);
        if(radioButton.isChecked())
        {
            aActivity = "4";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.personnel);
        if(radioButton.isChecked())
        {
            aActivity = "5";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.stop);
        if(radioButton.isChecked())
        {
            aActivity = "6";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.breaks);
        if(radioButton.isChecked())
        {
            aActivity = "7";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.mechanics);
        if(radioButton.isChecked())
        {
            aActivity = "8";
            radioButton.setChecked(false);
        }
        if(injury.equals("0"))
            aActivity = "-1";

        String quit = "-1";
        radioButton = (RadioButton) findViewById(R.id.changeYes);
        if(radioButton.isChecked())
        {
            quit = "1";
            radioButton.setChecked(false);
        }
        radioButton = (RadioButton) findViewById(R.id.changeNo);
        if(radioButton.isChecked())
        {
            quit = "0";
            radioButton.setChecked(false);
        }
        this.injuryYes(view);
        //END OF SECTION: G*************************************************************************

        //SET DATA**********************************************************************************
        surveyEntry entry = new surveyEntry();

        entry.setName(name);
        entry.setWeight(weight);
        entry.setHeight(height);
        entry.setAge(age);
        entry.setLiterate(literate);
        entry.setEducation(education);
        entry.setMembers(members);

        entry.setWorking(working);
        entry.setExperience(experience);
        entry.setWorkPerDay(hours);
        entry.setDaysPerweek(days);

        entry.setStandWalk(standWalk);
        entry.setTransport(transport);
        entry.setDistance(distance);
        entry.setSoil(soil);
        entry.setFactors(factors);
        entry.setMentallyExhausted(mentallyExhausted);
        entry.setPhysicallyExhausted(physicallyExhausted);

        entry.setRepeat(repeat);
        entry.setDuration(repeatHours);
        entry.setRest(rest);
        entry.setActivity(activity);

        entry.setBreakfast(breakfast);
        entry.setLunch(lunch);
        entry.setTobacco(tobacco);

        entry.setPrevious(previous);
        entry.setMsdYes(msdYes);
        entry.setNeck(msdNeck);
        entry.setShoulder(msdShoulder);
        entry.setElbow(msdElbow);
        entry.setWrist(msdWrist);
        entry.setuBack(uBack);
        entry.setlBack(lBack);
        entry.setHips(hip);
        entry.setKnee(knee);
        entry.setAnkle(ankle);
        entry.setRating(rating);

        entry.setInjury(injury);
        entry.setactivity(Activity);
        entry.setReported(report);
        entry.setPhysician(physician);
        entry.setLose(lose);
        entry.setTime(time);
        entry.setArea(area);
        entry.setTreatement(treatment);
        entry.setSymptoms(symptom);
        entry.setsActivity(sActivity);
        entry.setAlter(alter);
        entry.setaActivity(aActivity);
        entry.setQuit(quit);


        db.add(entry);
        Toast.makeText(getApplicationContext(),"Looks Good",Toast.LENGTH_LONG).show();
    }

}
