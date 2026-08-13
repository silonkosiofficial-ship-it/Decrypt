package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6393i2 extends com.google.android.gms.internal.measurement.AbstractC6095p0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6372f2 f42429C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6393i2(com.google.android.gms.measurement.internal.C6372f2 c6372f2, android.content.Context context, java.lang.String str) {
        super(context, str, null, 1);
        this.f42429C = c6372f2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
            throw e6;
        } catch (android.database.sqlite.SQLiteException unused) {
            this.f42429C.j().G().a("Opening the local database failed, dropping and recreating it");
            if (!this.f42429C.a().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f42429C.j().G().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (android.database.sqlite.SQLiteException e10) {
                this.f42429C.j().G().b("Failed to open local database. Events will bypass local storage", e10);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        com.google.android.gms.measurement.internal.AbstractC6473u.b(this.f42429C.j(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i6, int i10) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42429C.j(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i6, int i10) {
    }
}
