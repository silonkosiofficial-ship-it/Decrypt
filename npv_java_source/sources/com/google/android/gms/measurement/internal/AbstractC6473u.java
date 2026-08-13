package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6473u {
    private static java.util.Set a(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        java.util.HashSet hashSet = new java.util.HashSet();
        android.database.Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            java.util.Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    static void b(com.google.android.gms.measurement.internal.C6428n2 c6428n2, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (c6428n2 == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        java.io.File file = new java.io.File(com.google.android.gms.internal.measurement.AbstractC6050k0.a().o(sQLiteDatabase.getPath()));
        if (!file.setReadable(false, false)) {
            c6428n2.L().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c6428n2.L().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c6428n2.L().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c6428n2.L().a("Failed to turn on database write permission for owner");
    }

    static void c(com.google.android.gms.measurement.internal.C6428n2 c6428n2, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        if (c6428n2 == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        if (!d(c6428n2, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            java.util.Set setA = a(sQLiteDatabase, str);
            for (java.lang.String str4 : str3.split(",")) {
                if (!setA.remove(str4)) {
                    throw new android.database.sqlite.SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i6 = 0; i6 < strArr.length; i6 += 2) {
                    if (!setA.remove(strArr[i6])) {
                        sQLiteDatabase.execSQL(strArr[i6 + 1]);
                    }
                }
            }
            if (setA.isEmpty()) {
                return;
            }
            c6428n2.L().c("Table has extra columns. table, columns", str, android.text.TextUtils.join(", ", setA));
        } catch (android.database.sqlite.SQLiteException e6) {
            c6428n2.G().b("Failed to verify columns on table that was just created", str);
            throw e6;
        }
    }

    private static boolean d(com.google.android.gms.measurement.internal.C6428n2 c6428n2, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        if (c6428n2 == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        android.database.Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new java.lang.String[]{"name"}, "name=?", new java.lang.String[]{str}, null, null, null);
                boolean zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
                return zMoveToFirst;
            } catch (android.database.sqlite.SQLiteException e6) {
                c6428n2.L().c("Error querying for table", str, e6);
                if (cursorQuery == null) {
                    return false;
                }
                cursorQuery.close();
                return false;
            }
        } catch (java.lang.Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}
