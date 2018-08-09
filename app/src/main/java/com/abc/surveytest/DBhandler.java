package com.abc.surveytest;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Admin on 24-Nov-17.
 */

public class DBhandler extends SQLiteOpenHelper {

    private static final int database_version = 1;
    private static final String database_name = "Surveydata.db";
    public static final String table_name = "WRHDtable";
    public static final String _id = "Sl_NO";

    public static final String name = "NAME";
    public static final String weight = "WEIGHT";
    public static final String height = "HEIGHT";
    public static final String age = "AGE";
    public static final String literate = "LITERATE";
    public static final String education = "EDUCATION";
    public static final String members = "MEMBERS_IN_FAMILY";

    public static final String working = "TOTAL_EXPERIENCE";
    public static final String experience = "CURRENT_EXPERIENCE";
    public static final String workPerDay = "WORK_PER_DAY";
    public static final String daysPerWeek = "DAYS_PER_WEEK";

    public static final String standWalk = "STAND_OR_WALK";
    public static final String transport = "TRANSPORT";
    public static final String distance = "DISTANCE";
    public static final String soil = "SOIL";
    public static final String sunlight =  "SUNLIGHT";
    public static final String fertiliser = "FERTILISERS";
    public static final String pesticide = "PESTICIDES";
    public static final String animal = "ANIMALS";
    public static final String tool = "TOOLS";
    public static final String others = "OTHER_SOIL";
    public static final String mentallyExhausted = "MENTALLY_EXHAUSTED";
    public static final String physicallyExhausted = "PHYSICALLY_EXHAUSTED";

    public static final String repeat = "REPETITIVE_ACTIVITY";
    public static final String repeatHours = "REPETITIVE_HOURS";
    public static final String rest = "REST";
    public static final String hoe = "HAND_HOE";
    public static final String pickaxe = "PICKAXE";
    public static final String shovel = "SHOVEL";
    public static final String crowbar = "CROWBAR";
    public static final String machette = "MACHETTE";
    public static final String other = "OTHER_TOOL";
    public static final String material = "MANUAL_MATERIAL_HANDLING";

    public static final String breakfast = "BREAKFAST";
    public static final String lunch = "LUNCH";
    public static final String tobacco = "TOBACCO";

    public static final String previous = "PREVIOUS_PROBLEMS";
    public static final String msdYes = "MSD_YES_NO";
    public static final String msdNeck = "MSD_NECK";
    public static final String msdShoulder = "MSD_SHOULDER";
    public static final String msdElbow = "MSD_ELBOW";
    public static final String msdWrist = "MSD_WRIST";
    public static final String msdUback = "MSD_UPPER_BACK";
    public static final String msdLback = "MSD_LOWER_BACK";
    public static final String msdHip = "MSD_HIPS";
    public static final String msdKnee = "MSD_KNEE";
    public static final String msdAnkle = "MSD_ANKLE";
    public static final String ratingNeck = "RATING_NECK";
    public static final String ratingShoulder = "RATING_SHOULDER";
    public static final String ratingElbow = "RATING_ELBOW";
    public static final String ratingWrist = "RATING_WRIST";
    public static final String ratingUback = "RATING_UPPER_BACK";
    public static final String ratingLback = "RATING_LOWER_BACK";
    public static final String ratingHip = "RATING_HIPS";
    public static final String ratingKnee = "RATING_KNEE";
    public static final String ratingAnkle = "RATING_ANKLE";

    public static final String injury = "INJURY";
    public static final String activity = "ACTIVITY";
    public static final String reported = "REPORTED";
    public static final String physician = "CONSULTED_PHYSICIAN";
    public static final String lose = "LOSE_HALF_DAY";
    public static final String time = "LIMITED_WORK";
    public static final String area = "LIMITED_AREA";
    public static final String treatment = "TREATMENT";
    public static final String symptoms = "WORSENED_SYMPTOMS";
    public static final String sActivity = "CAUSE_OF_RECURRENCE";
    public static final String alter = "ALTER_WORK_HABITS";
    public static final String aActivity = "CHANGED_HABITS";
    public static final String quit = "JOB_CHANGE";



    public DBhandler(final Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "/storage/emulated/0/" + database_name, factory, database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String query = "CREATE TABLE "+ table_name + " ( " +
                _id + " INTEGER PRIMARY KEY AUTOINCREMENT, " +

                name + " TEXT, " +
                weight + " INTEGER, " +
                height + " INTEGER, " +
                age + " INTEGER, " +
                literate + " INTEGER, " +
                education + " INTEGER, " +
                members + " INTEGER, " +

                working + " INTEGER, " +
                experience + " INTEGER, " +
                workPerDay + " INTEGER, " +
                daysPerWeek + " INTEGER, " +

                standWalk + " INTEGER, " +
                transport + " INTEGER, " +
                distance + " INTEGER, " +
                soil + " INTEGER, " +
                sunlight + " INTEGER, " +
                fertiliser + " INTEGER, " +
                pesticide + " INTEGER, " +
                animal + " INTEGER, " +
                tool + " INTEGER, " +
                others + " INTEGER, " +
                mentallyExhausted + " INTEGER, " +
                physicallyExhausted + " INTEGER, " +

                repeat + " INTEGER, " +
                repeatHours + " INTEGER, " +
                rest + " INTEGER, " +
                hoe + " INTEGER, " +
                pickaxe + " INTEGER, " +
                shovel + " INTEGER, " +
                crowbar + " INTEGER, " +
                machette + " INTEGER, " +
                other + " INTEGER, " +
                material + " INTEGER, " +

                breakfast + " INTEGER, " +
                lunch + " INTEGER, " +
                tobacco + " INTEGER, " +

                previous + " INTEGER, " +
                msdYes + " INTEGER, " +
                msdNeck + " INTEGER, " +
                msdShoulder + " INTEGER, " +
                msdElbow + " INTEGER, " +
                msdWrist + " INTEGER, " +
                msdUback + " INTEGER, " +
                msdLback + " INTEGER, " +
                msdHip + " INTEGER, " +
                msdKnee + " INTEGER, " +
                msdAnkle + " INTEGER, " +
                ratingNeck + " INTEGER, " +
                ratingShoulder + " INTEGER, " +
                ratingElbow + " INTEGER, " +
                ratingWrist + " INTEGER, " +
                ratingUback + " INTEGER, " +
                ratingLback + " INTEGER, " +
                ratingHip + " INTEGER, " +
                ratingKnee + " INTEGER, " +
                ratingAnkle + " INTEGER, " +

                injury + " INTEGER, " +
                activity + " INTEGER, " +
                reported + " INTEGER, " +
                physician + " INTEGER, " +
                lose + " INTEGER, " +
                time + " INTEGER, " +
                area + " INTEGER, " +
                treatment + " INTEGER, " +
                symptoms + " INTEGER, " +
                sActivity + " INTEGER, " +
                alter + " INTEGER, " +
                aActivity + " INTEGER, " +
                quit + " INTEGER " +

                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + table_name);
        onCreate(db);
    }

    public void add(surveyEntry entry)
    {
        ContentValues values = new ContentValues();
        values.put(name, entry.getName());
        values.put(weight, entry.getWeight());
        values.put(height, entry.getHeight());
        values.put(age,entry.getAge());
        values.put(literate, entry.getLiterate());
        values.put(education, entry.getEducation());
        values.put(members, entry.getMembers());

        values.put(working, entry.getWorking());
        values.put(experience, entry.getExperience());
        values.put(workPerDay, entry.getWorkPerDay());
        values.put(daysPerWeek, entry.getDaysPerweek());

        values.put(standWalk,entry.getStandWalk());
        values.put(transport,entry.getTransport());
        values.put(distance,entry.getDistance());
        values.put(soil,entry.getSoil());
        values.put(sunlight,entry.getFactors()[0]);
        values.put(fertiliser,entry.getFactors()[1]);
        values.put(pesticide,entry.getFactors()[2]);
        values.put(animal,entry.getFactors()[3]);
        values.put(tool,entry.getFactors()[4]);
        values.put(others,entry.getFactors()[5]);
        values.put(mentallyExhausted, entry.getMentallyExhausted());
        values.put(physicallyExhausted, entry.getPhysicallyExhausted());

        values.put(repeat, entry.getRepeat());
        values.put(repeatHours, entry.getDuration());
        values.put(rest, entry.getRest());
        values.put(hoe, entry.getActivity()[0]);
        values.put(pickaxe, entry.getActivity()[1]);
        values.put(shovel, entry.getActivity()[2]);
        values.put(crowbar, entry.getActivity()[3]);
        values.put(machette, entry.getActivity()[4]);
        values.put(other, entry.getActivity()[5]);
        values.put(material, entry.getActivity()[6]);

        values.put(breakfast, entry.getBreakfast());
        values.put(lunch, entry.getLunch());
        values.put(tobacco, entry.getTobacco());

        values.put(previous, entry.getPrevious());
        values.put(msdYes, entry.getMsdYes());
        values.put(msdNeck, entry.getNeck());
        values.put(msdShoulder, entry.getShoulder());
        values.put(msdElbow, entry.getElbow());
        values.put(msdWrist, entry.getWrist());
        values.put(msdUback, entry.getuBack());
        values.put(msdLback, entry.getlBack());
        values.put(msdHip, entry.getHips());
        values.put(msdKnee, entry.getKnee());
        values.put(msdAnkle, entry.getAnkle());
        values.put(ratingNeck, entry.getRating()[0]);
        values.put(ratingShoulder, entry.getRating()[1]);
        values.put(ratingElbow, entry.getRating()[2]);
        values.put(ratingWrist, entry.getRating()[3]);
        values.put(ratingUback, entry.getRating()[4]);
        values.put(ratingLback, entry.getRating()[5]);
        values.put(ratingHip, entry.getRating()[6]);
        values.put(ratingKnee, entry.getRating()[7]);
        values.put(ratingAnkle, entry.getRating()[8]);

        values.put(injury, entry.getInjury());
        values.put(activity, entry.getactivity());
        values.put(reported, entry.getReported());
        values.put(physician, entry.getPhysician());
        values.put(lose, entry.getLose());
        values.put(time, entry.getTime());
        values.put(area, entry.getArea());
        values.put(treatment, entry.getTreatement());
        values.put(symptoms, entry.getSymptoms());
        values.put(sActivity, entry.getsActivity());
        values.put(alter, entry.getAlter());
        values.put(aActivity, entry.getaActivity());
        values.put(quit, entry.getQuit());

        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(table_name, null, values);
        db.close();
    }
}
