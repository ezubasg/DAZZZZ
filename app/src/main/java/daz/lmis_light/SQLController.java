package daz.lmis_light;

/**
 * Created by Devesh on 18/11/15.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class SQLController {

    private MyDbManager dbManager;
    private Context context;
    private SQLiteDatabase db;

    public SQLController(Context c) {
        context = c;
    }

    public SQLController open() throws SQLException {
        dbManager = new MyDbManager(context);
        db = dbManager.getWritableDatabase();
        return this;
    }

    public void close() {
<<<<<<< HEAD
        dbManager.close();
        //db.close();
=======
       // dbManager.close();
        db.close();
>>>>>>> bda9beb33f7dd1fb85da711f327ea52b21fada68
    }



    public void addData(String commodityName, String quantity) {
        ContentValues cv = new ContentValues();
        cv.put(MyDbManager.COMMODITY_NAME, commodityName);
        cv.put(MyDbManager.QUANTITY, quantity);
        db.insert(MyDbManager.TABLE_COMMODITY, null, cv);
<<<<<<< HEAD
        //close();
=======
        close();

>>>>>>> bda9beb33f7dd1fb85da711f327ea52b21fada68
    }

    public String databaseToString(){
        String dbString = "";
        SQLiteDatabase db1 = dbManager.getWritableDatabase();
        String query = "SELECT * FROM " + MyDbManager.TABLE_COMMODITY + " WHERE 1";
<<<<<<< HEAD
        Cursor c = db1.rawQuery(query, null);
        c.moveToFirst();
=======

        //Cursor points to a location in your results
        Cursor c = db1.rawQuery(query, null);
        //Move to the first row in your results
        c.moveToFirst();

        //Position after the last row means the end of the results
>>>>>>> bda9beb33f7dd1fb85da711f327ea52b21fada68
        while (!c.isAfterLast()) {
            if (c.getString(c.getColumnIndex("commodityName")) != null && c.getString(c.getColumnIndex("quantity")) != null) {
                dbString += c.getString(c.getColumnIndex("commodityName"));
                dbString += "\t:\t";
                dbString += c.getString(c.getColumnIndex("quantity"));
                dbString += "\n";
            }
<<<<<<< HEAD
=======


>>>>>>> bda9beb33f7dd1fb85da711f327ea52b21fada68
            c.moveToNext();
        }
        db1.close();
        return dbString;
    }

    public Cursor readData() {
        String[] allColumns = new String[] {MyDbManager.COMMODITY_NAME,
                MyDbManager.QUANTITY };
        Cursor c = db.query(MyDbManager.TABLE_COMMODITY, allColumns, null, null, null,
                null, null);
        if (c != null) {
            c.moveToFirst();
        }
<<<<<<< HEAD
        //close();
=======

        close();
>>>>>>> bda9beb33f7dd1fb85da711f327ea52b21fada68
        return c;
    }

    public void deleteData(String commodityName) {
        db.execSQL("DELETE FROM " + MyDbManager.TABLE_COMMODITY + " WHERE " + MyDbManager.COMMODITY_NAME +
                "=\"" + commodityName + "\";");
    }

}