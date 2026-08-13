package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4033iT extends com.google.android.gms.internal.ads.AbstractC4597ne0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f36291C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f36292D;

    public C4033iT(android.content.Context context, com.google.android.gms.internal.ads.Yk0 yk0) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25619l8)).intValue(), com.google.android.gms.internal.ads.AbstractC4927qe0.f38294a);
        this.f36291C = context;
        this.f36292D = yk0;
    }

    static final void D(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new java.lang.String[]{str, java.lang.Integer.toString(0)});
    }

    private static void H(android.database.sqlite.SQLiteDatabase sQLiteDatabase, p224w3.v vVar) {
        java.lang.String str;
        sQLiteDatabase.beginTransaction();
        try {
            android.database.Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new java.lang.String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            java.lang.String[] strArr = new java.lang.String[count];
            int i6 = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("timestamp");
                int columnIndex2 = cursorQuery.getColumnIndex("url");
                if (columnIndex2 != -1) {
                    long j6 = cursorQuery.getLong(columnIndex);
                    java.lang.String string = cursorQuery.getString(columnIndex2);
                    if (string == null) {
                        str = "";
                    } else {
                        android.net.Uri uri = android.net.Uri.parse(string);
                        long jA = p174r3.v.c().a() - j6;
                        java.lang.String encodedQuery = uri.getEncodedQuery();
                        android.net.Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                        builderClearQuery.appendQueryParameter("bd", java.lang.Long.toString(jA));
                        str = java.lang.String.valueOf(builderClearQuery.build()) + "&" + encodedQuery;
                    }
                    strArr[i6] = str;
                }
                i6++;
            }
            cursorQuery.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new java.lang.String[]{java.lang.Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (int i10 = 0; i10 < count; i10++) {
                vVar.o(strArr[i10]);
            }
        } catch (java.lang.Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    static /* synthetic */ java.lang.Void f(p224w3.v vVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        H(sQLiteDatabase, vVar);
        return null;
    }

    static /* synthetic */ void r(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, p224w3.v vVar) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("event_state", (java.lang.Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new java.lang.String[]{str});
        H(sQLiteDatabase, vVar);
    }

    final /* synthetic */ java.lang.Void a(com.google.android.gms.internal.ads.C4251kT c4251kT, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("timestamp", java.lang.Long.valueOf(c4251kT.f36970a));
        contentValues.put("gws_query_id", c4251kT.f36971b);
        contentValues.put("url", c4251kT.f36972c);
        contentValues.put("event_state", java.lang.Integer.valueOf(c4251kT.f36973d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        p174r3.v.t();
        p214v3.U uA = p214v3.E0.a(this.f36291C);
        if (uA != null) {
            try {
                uA.zze(X3.b.c2(this.f36291C));
            } catch (android.os.RemoteException e6) {
                p214v3.AbstractC7265q0.l("Failed to schedule offline ping sender.", e6);
            }
        }
        return null;
    }

    public final void g(final java.lang.String str) {
        o(new com.google.android.gms.internal.ads.Y80(this) { // from class: com.google.android.gms.internal.ads.gT
            @Override // com.google.android.gms.internal.ads.Y80
            public final java.lang.Object b(java.lang.Object obj) {
                com.google.android.gms.internal.ads.C4033iT.D((android.database.sqlite.SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void i(final com.google.android.gms.internal.ads.C4251kT c4251kT) {
        o(new com.google.android.gms.internal.ads.Y80() { // from class: com.google.android.gms.internal.ads.cT
            @Override // com.google.android.gms.internal.ads.Y80
            public final java.lang.Object b(java.lang.Object obj) {
                this.f34498a.a(c4251kT, (android.database.sqlite.SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final void o(com.google.android.gms.internal.ads.Y80 y80) {
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(this.f36292D.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.eT
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f34992a.getWritableDatabase();
            }
        }), new com.google.android.gms.internal.ads.C3923hT(this, y80), this.f36292D);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i6, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i6, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    final void s(final android.database.sqlite.SQLiteDatabase sQLiteDatabase, final p224w3.v vVar, final java.lang.String str) {
        this.f36292D.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.fT
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.C4033iT.r(sQLiteDatabase, str, vVar);
            }
        });
    }

    public final void y(final p224w3.v vVar, final java.lang.String str) {
        o(new com.google.android.gms.internal.ads.Y80() { // from class: com.google.android.gms.internal.ads.dT
            @Override // com.google.android.gms.internal.ads.Y80
            public final java.lang.Object b(java.lang.Object obj) {
                this.f34727a.s((android.database.sqlite.SQLiteDatabase) obj, vVar, str);
                return null;
            }
        });
    }
}
