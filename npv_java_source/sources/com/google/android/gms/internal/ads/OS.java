package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OS {
    public static int a(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i6) {
        int i10 = 0;
        if (i6 == 2) {
            return 0;
        }
        android.database.Cursor cursorG = g(sQLiteDatabase, i6);
        if (cursorG.getCount() > 0) {
            cursorG.moveToNext();
            i10 = cursorG.getInt(cursorG.getColumnIndexOrThrow("value"));
        }
        cursorG.close();
        return i10;
    }

    public static long b(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i6) {
        long j6;
        android.database.Cursor cursorG = g(sQLiteDatabase, 2);
        if (cursorG.getCount() > 0) {
            cursorG.moveToNext();
            j6 = cursorG.getLong(cursorG.getColumnIndexOrThrow("value"));
        } else {
            j6 = 0;
        }
        cursorG.close();
        return j6;
    }

    public static void c(android.database.sqlite.SQLiteDatabase sQLiteDatabase, long j6, byte[] bArr) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("timestamp", java.lang.Long.valueOf(j6));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new java.lang.String[]{java.lang.String.valueOf(j6)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void d(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        h(sQLiteDatabase, "failed_requests", 0);
        h(sQLiteDatabase, "total_requests", 0);
        h(sQLiteDatabase, "completed_requests", 0);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", (java.lang.Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void e(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        i(sQLiteDatabase, "failed_requests", 0);
        i(sQLiteDatabase, "total_requests", 0);
        i(sQLiteDatabase, "completed_requests", 0);
    }

    public static void f(android.database.sqlite.SQLiteDatabase sQLiteDatabase, boolean z6, boolean z10) {
        java.lang.String str;
        if (z10) {
            sQLiteDatabase.execSQL(java.lang.String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
            if (z6) {
                return;
            } else {
                str = java.lang.String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests");
            }
        } else {
            str = java.lang.String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests");
        }
        sQLiteDatabase.execSQL(str);
    }

    private static android.database.Cursor g(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i6) {
        java.lang.String[] strArr = {"value"};
        java.lang.String[] strArr2 = new java.lang.String[1];
        if (i6 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i6 == 1) {
            strArr2[0] = "total_requests";
        } else if (i6 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    private static void h(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, int i6) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (java.lang.Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    private static void i(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, int i6) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("value", (java.lang.Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new java.lang.String[]{str});
    }
}
