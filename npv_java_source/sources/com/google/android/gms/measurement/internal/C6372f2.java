package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6372f2 extends com.google.android.gms.measurement.internal.AbstractC6504y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6393i2 f42379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42380d;

    C6372f2(com.google.android.gms.measurement.internal.S2 s6) {
        super(s6);
        this.f42379c = new com.google.android.gms.measurement.internal.C6393i2(this, a(), "google_app_measurement_local.db");
    }

    private static long B(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        android.database.Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new java.lang.String[]{"rowid"}, "type=?", new java.lang.String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j6 = cursorQuery.getLong(0);
            cursorQuery.close();
            return j6;
        } catch (java.lang.Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fb A[PHI: r6 r9
  0x00fb: PHI (r6v3 int) = (r6v1 int), (r6v4 int) binds: [B:73:0x0116, B:66:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x00fb: PHI (r9v7 android.database.sqlite.SQLiteDatabase) = (r9v6 android.database.sqlite.SQLiteDatabase), (r9v8 android.database.sqlite.SQLiteDatabase) binds: [B:73:0x0116, B:66:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0121  */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    private final boolean D(int i6, byte[] bArr) throws java.lang.Throwable {
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseK;
        ?? RawQuery;
        long j6;
        n();
        ?? r6 = 0;
        if (this.f42380d) {
            return false;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("type", java.lang.Integer.valueOf(i6));
        contentValues.put("entry", bArr);
        int i10 = 0;
        int i11 = 5;
        for (int i12 = 5; i10 < i12; i12 = 5) {
            ?? r10 = 0;
             = 0;
            r10 = 0;
            ?? r11 = 0;
            r10 = 0;
            android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseK = K();
                try {
                    if (sQLiteDatabaseK == null) {
                        this.f42380d = true;
                        if (sQLiteDatabaseK != null) {
                            sQLiteDatabaseK.close();
                        }
                        return r6;
                    }
                    sQLiteDatabaseK.beginTransaction();
                    RawQuery = sQLiteDatabaseK.rawQuery("select count(1) from messages", null);
                    if (RawQuery != 0) {
                        try {
                            if (RawQuery.moveToFirst()) {
                                j6 = RawQuery.getLong(r6);
                            } else {
                                j6 = 0;
                            }
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException unused) {
                            r11 = RawQuery;
                            android.os.SystemClock.sleep(i11);
                            i11 += 20;
                            if (r11 != 0) {
                                r11.close();
                            }
                            if (sQLiteDatabaseK != null) {
                                sQLiteDatabaseK.close();
                            }
                            i10++;
                            r6 = 0;
                        } catch (android.database.sqlite.SQLiteFullException e6) {
                            e = e6;
                            r10 = RawQuery;
                            try {
                                j().G().b("Error writing entry; local database full", e);
                                this.f42380d = true;
                                if (r10 != 0) {
                                    r10.close();
                                }
                                if (sQLiteDatabaseK != null) {
                                    sQLiteDatabaseK.close();
                                }
                                i10++;
                                r6 = 0;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                if (r10 != 0) {
                                    r10.close();
                                }
                                if (sQLiteDatabaseK != null) {
                                    sQLiteDatabaseK.close();
                                }
                                throw th;
                            }
                        } catch (android.database.sqlite.SQLiteException e10) {
                            e = e10;
                            sQLiteDatabase = sQLiteDatabaseK;
                            RawQuery = RawQuery;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    sQLiteDatabaseK = sQLiteDatabase;
                                    r10 = RawQuery;
                                    if (r10 != 0) {
                                        r10.close();
                                    }
                                    if (sQLiteDatabaseK != null) {
                                        sQLiteDatabaseK.close();
                                    }
                                    throw th;
                                }
                            }
                            j().G().b("Error writing entry to local database", e);
                            this.f42380d = true;
                            if (RawQuery != 0) {
                                RawQuery.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i10++;
                            r6 = 0;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            r10 = RawQuery;
                            if (r10 != 0) {
                                r10.close();
                            }
                            if (sQLiteDatabaseK != null) {
                                sQLiteDatabaseK.close();
                            }
                            throw th;
                        }
                    } else {
                        j6 = 0;
                    }
                    if (j6 >= 100000) {
                        j().G().a("Data loss, local db full");
                        long j10 = 100001 - j6;
                        long jDelete = sQLiteDatabaseK.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new java.lang.String[]{java.lang.Long.toString(j10)});
                        if (jDelete != j10) {
                            j().G().d("Different delete count than expected in local db. expected, received, difference", java.lang.Long.valueOf(j10), java.lang.Long.valueOf(jDelete), java.lang.Long.valueOf(j10 - jDelete));
                        }
                    }
                    sQLiteDatabaseK.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabaseK.setTransactionSuccessful();
                    sQLiteDatabaseK.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    sQLiteDatabaseK.close();
                    return true;
                } catch (android.database.sqlite.SQLiteDatabaseLockedException unused2) {
                } catch (android.database.sqlite.SQLiteFullException e11) {
                    e = e11;
                } catch (android.database.sqlite.SQLiteException e12) {
                    e = e12;
                    RawQuery = 0;
                }
            } catch (android.database.sqlite.SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseK = null;
            } catch (android.database.sqlite.SQLiteFullException e13) {
                e = e13;
                sQLiteDatabaseK = null;
            } catch (android.database.sqlite.SQLiteException e14) {
                e = e14;
                RawQuery = 0;
            } catch (java.lang.Throwable th4) {
                th = th4;
                sQLiteDatabaseK = null;
                if (r10 != 0) {
                    r10.close();
                }
                if (sQLiteDatabaseK != null) {
                    sQLiteDatabaseK.close();
                }
                throw th;
            }
        }
        j().K().a("Failed to write entry to local database");
        return false;
    }

    private final android.database.sqlite.SQLiteDatabase K() {
        if (this.f42380d) {
            return null;
        }
        android.database.sqlite.SQLiteDatabase writableDatabase = this.f42379c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f42380d = true;
        return null;
    }

    private final boolean L() {
        return a().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6504y2
    protected final boolean A() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01a4 A[Catch: all -> 0x01a8, TryCatch #3 {all -> 0x01a8, blocks: (B:109:0x019e, B:111:0x01a4, B:114:0x01ac, B:129:0x01d7, B:121:0x01c4), top: B:146:0x019e }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:124:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d0 A[PHI: r8 r15
  0x01d0: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v4 int) binds: [B:117:0x01be, B:132:0x01e9, B:125:0x01ce] A[DONT_GENERATE, DONT_INLINE]
  0x01d0: PHI (r15v6 android.database.sqlite.SQLiteDatabase) = 
  (r15v4 android.database.sqlite.SQLiteDatabase)
  (r15v5 android.database.sqlite.SQLiteDatabase)
  (r15v7 android.database.sqlite.SQLiteDatabase)
 binds: [B:117:0x01be, B:132:0x01e9, B:125:0x01ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:146:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x01ec A[SYNTHETIC] */
    public final java.util.List C(int i6) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        android.database.Cursor cursorQuery;
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseK;
        java.lang.String str;
        java.lang.String[] strArr;
        R3.d dVar;
        com.google.android.gms.measurement.internal.C6442p2 c6442p2G;
        java.lang.String str2;
        n();
        android.database.Cursor cursor = null;
        if (this.f42380d) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!L()) {
            return arrayList;
        }
        int i10 = 5;
        int i11 = 0;
        for (int i12 = 5; i11 < i12; i12 = 5) {
            try {
                sQLiteDatabaseK = K();
                if (sQLiteDatabaseK == null) {
                    try {
                        this.f42380d = true;
                        if (sQLiteDatabaseK != null) {
                            sQLiteDatabaseK.close();
                        }
                        return null;
                    } catch (android.database.sqlite.SQLiteFullException e6) {
                        e = e6;
                        cursorQuery = null;
                        j().G().b("Error reading entries from local database", e);
                        this.f42380d = true;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (sQLiteDatabaseK != null) {
                            sQLiteDatabaseK.close();
                        }
                        i11++;
                    } catch (android.database.sqlite.SQLiteException e10) {
                        e = e10;
                        cursorQuery = null;
                        if (sQLiteDatabaseK != null) {
                            try {
                                if (sQLiteDatabaseK.inTransaction()) {
                                    sQLiteDatabaseK.endTransaction();
                                }
                            } catch (java.lang.Throwable th) {
                                th = th;
                                cursor = cursorQuery;
                                sQLiteDatabase = sQLiteDatabaseK;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        j().G().b("Error reading entries from local database", e);
                        this.f42380d = true;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (sQLiteDatabaseK != null) {
                            sQLiteDatabaseK.close();
                        }
                        i11++;
                    }
                } else {
                    try {
                        try {
                            sQLiteDatabaseK.beginTransaction();
                            long jB = B(sQLiteDatabaseK);
                            long j6 = -1;
                            if (jB != -1) {
                                str = "rowid<?";
                                strArr = new java.lang.String[]{java.lang.String.valueOf(jB)};
                            } else {
                                str = null;
                                strArr = null;
                            }
                            sQLiteDatabase = sQLiteDatabaseK;
                            try {
                                cursorQuery = sQLiteDatabaseK.query("messages", new java.lang.String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", java.lang.Integer.toString(100));
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        j6 = cursorQuery.getLong(0);
                                        int i13 = cursorQuery.getInt(1);
                                        byte[] blob = cursorQuery.getBlob(2);
                                        if (i13 == 0) {
                                            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain.unmarshall(blob, 0, blob.length);
                                                    parcelObtain.setDataPosition(0);
                                                    dVar = (com.google.android.gms.measurement.internal.E) com.google.android.gms.measurement.internal.E.CREATOR.createFromParcel(parcelObtain);
                                                    parcelObtain.recycle();
                                                    if (dVar != null) {
                                                        arrayList.add(dVar);
                                                    }
                                                } catch (R3.b.a unused) {
                                                    j().G().a("Failed to load event from local database");
                                                    parcelObtain.recycle();
                                                }
                                            } catch (java.lang.Throwable th2) {
                                                parcelObtain.recycle();
                                                throw th2;
                                            }
                                        } else if (i13 == 1) {
                                            android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain2.unmarshall(blob, 0, blob.length);
                                                    parcelObtain2.setDataPosition(0);
                                                    dVar = (com.google.android.gms.measurement.internal.Y5) com.google.android.gms.measurement.internal.Y5.CREATOR.createFromParcel(parcelObtain2);
                                                    parcelObtain2.recycle();
                                                } catch (java.lang.Throwable th3) {
                                                    parcelObtain2.recycle();
                                                    throw th3;
                                                }
                                            } catch (R3.b.a unused2) {
                                                j().G().a("Failed to load user property from local database");
                                                parcelObtain2.recycle();
                                                dVar = null;
                                            }
                                            if (dVar != null) {
                                                arrayList.add(dVar);
                                            }
                                        } else if (i13 == 2) {
                                            android.os.Parcel parcelObtain3 = android.os.Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain3.unmarshall(blob, 0, blob.length);
                                                    parcelObtain3.setDataPosition(0);
                                                    dVar = (com.google.android.gms.measurement.internal.C6362e) com.google.android.gms.measurement.internal.C6362e.CREATOR.createFromParcel(parcelObtain3);
                                                    parcelObtain3.recycle();
                                                } catch (R3.b.a unused3) {
                                                    j().G().a("Failed to load conditional user property from local database");
                                                    parcelObtain3.recycle();
                                                    dVar = null;
                                                }
                                                if (dVar != null) {
                                                    arrayList.add(dVar);
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                parcelObtain3.recycle();
                                                throw th4;
                                            }
                                        } else {
                                            if (i13 == 3) {
                                                c6442p2G = j().L();
                                                str2 = "Skipping app launch break";
                                            } else {
                                                c6442p2G = j().G();
                                                str2 = "Unknown record type in local database";
                                            }
                                            c6442p2G.a(str2);
                                        }
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException unused4) {
                                        sQLiteDatabaseK = sQLiteDatabase;
                                        android.os.SystemClock.sleep(i10);
                                        i10 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseK != null) {
                                            sQLiteDatabaseK.close();
                                        }
                                        i11++;
                                    } catch (android.database.sqlite.SQLiteFullException e11) {
                                        e = e11;
                                        sQLiteDatabaseK = sQLiteDatabase;
                                        j().G().b("Error reading entries from local database", e);
                                        this.f42380d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseK != null) {
                                            sQLiteDatabaseK.close();
                                        }
                                        i11++;
                                    } catch (android.database.sqlite.SQLiteException e12) {
                                        e = e12;
                                        sQLiteDatabaseK = sQLiteDatabase;
                                        if (sQLiteDatabaseK != null) {
                                            if (sQLiteDatabaseK.inTransaction()) {
                                                sQLiteDatabaseK.endTransaction();
                                            }
                                        }
                                        j().G().b("Error reading entries from local database", e);
                                        this.f42380d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseK != null) {
                                            sQLiteDatabaseK.close();
                                        }
                                        i11++;
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                        cursor = cursorQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                }
                                if (sQLiteDatabase.delete("messages", "rowid <= ?", new java.lang.String[]{java.lang.Long.toString(j6)}) < arrayList.size()) {
                                    j().G().a("Fewer entries removed from local database than expected");
                                }
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                                cursorQuery.close();
                                sQLiteDatabase.close();
                                return arrayList;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException unused5) {
                                cursorQuery = null;
                                sQLiteDatabaseK = sQLiteDatabase;
                                android.os.SystemClock.sleep(i10);
                                i10 += 20;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (sQLiteDatabaseK != null) {
                                    sQLiteDatabaseK.close();
                                }
                                i11++;
                            } catch (android.database.sqlite.SQLiteFullException e13) {
                                e = e13;
                                cursorQuery = null;
                            } catch (android.database.sqlite.SQLiteException e14) {
                                e = e14;
                                cursorQuery = null;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                            }
                        } catch (android.database.sqlite.SQLiteFullException e15) {
                            e = e15;
                            cursorQuery = null;
                            j().G().b("Error reading entries from local database", e);
                            this.f42380d = true;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (sQLiteDatabaseK != null) {
                                sQLiteDatabaseK.close();
                            }
                            i11++;
                        } catch (android.database.sqlite.SQLiteException e16) {
                            e = e16;
                            cursorQuery = null;
                            if (sQLiteDatabaseK != null) {
                                if (sQLiteDatabaseK.inTransaction()) {
                                    sQLiteDatabaseK.endTransaction();
                                }
                            }
                            j().G().b("Error reading entries from local database", e);
                            this.f42380d = true;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (sQLiteDatabaseK != null) {
                                sQLiteDatabaseK.close();
                            }
                            i11++;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException unused6) {
                        sQLiteDatabase = sQLiteDatabaseK;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        sQLiteDatabase = sQLiteDatabaseK;
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
            } catch (android.database.sqlite.SQLiteDatabaseLockedException unused7) {
                cursorQuery = null;
                sQLiteDatabaseK = null;
            } catch (android.database.sqlite.SQLiteFullException e17) {
                e = e17;
                cursorQuery = null;
                sQLiteDatabaseK = null;
            } catch (android.database.sqlite.SQLiteException e18) {
                e = e18;
                cursorQuery = null;
                sQLiteDatabaseK = null;
            } catch (java.lang.Throwable th8) {
                th = th8;
                sQLiteDatabase = null;
            }
        }
        j().L().a("Failed to read events from database in reasonable time");
        return null;
    }

    public final boolean E(com.google.android.gms.measurement.internal.C6362e c6362e) {
        i();
        byte[] bArrQ0 = com.google.android.gms.measurement.internal.d6.q0(c6362e);
        if (bArrQ0.length <= 131072) {
            return D(2, bArrQ0);
        }
        j().I().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean F(com.google.android.gms.measurement.internal.E e6) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        e6.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return D(0, bArrMarshall);
        }
        j().I().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean G(com.google.android.gms.measurement.internal.Y5 y6) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        y6.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return D(1, bArrMarshall);
        }
        j().I().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final void H() {
        int iDelete;
        n();
        try {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseK = K();
            if (sQLiteDatabaseK == null || (iDelete = sQLiteDatabaseK.delete("messages", null, null)) <= 0) {
                return;
            }
            j().K().b("Reset local analytics data. records", java.lang.Integer.valueOf(iDelete));
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().b("Error resetting local analytics data. error", e6);
        }
    }

    public final boolean I() {
        return D(3, new byte[0]);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006d A[PHI: r4
  0x006d: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:32:0x0064, B:35:0x006b, B:38:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean J() {
        n();
        if (this.f42380d || !L()) {
            return false;
        }
        int i6 = 5;
        for (int i10 = 0; i10 < 5; i10++) {
            android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    android.database.sqlite.SQLiteDatabase sQLiteDatabaseK = K();
                    if (sQLiteDatabaseK == null) {
                        this.f42380d = true;
                        if (sQLiteDatabaseK != null) {
                            sQLiteDatabaseK.close();
                        }
                        return false;
                    }
                    sQLiteDatabaseK.beginTransaction();
                    sQLiteDatabaseK.delete("messages", "type == ?", new java.lang.String[]{java.lang.Integer.toString(3)});
                    sQLiteDatabaseK.setTransactionSuccessful();
                    sQLiteDatabaseK.endTransaction();
                    sQLiteDatabaseK.close();
                    return true;
                } catch (android.database.sqlite.SQLiteFullException e6) {
                    j().G().b("Error deleting app launch break from local database", e6);
                    this.f42380d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (android.database.sqlite.SQLiteDatabaseLockedException unused) {
                android.os.SystemClock.sleep(i6);
                i6 += 20;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            } catch (android.database.sqlite.SQLiteException e10) {
                if (0 != 0) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (java.lang.Throwable th) {
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
                j().G().b("Error deleting app launch break from local database", e10);
                this.f42380d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        j().L().a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ android.content.Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ V3.f b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6376g d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6494x e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6348c f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6386h2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.d6 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6428n2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.P2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6501y o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6379g2 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6372f2 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.F3 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6492w4 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.F4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6445p5 u() {
        return super.u();
    }
}
