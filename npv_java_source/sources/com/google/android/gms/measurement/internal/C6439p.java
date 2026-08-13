package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6439p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f42577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f42578b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6404k f42579c;

    public C6439p(com.google.android.gms.measurement.internal.C6404k c6404k, java.lang.String str) {
        this.f42579c = c6404k;
        Q3.AbstractC1477p.f(str);
        this.f42577a = str;
    }

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f42579c.B().query("raw_events", new java.lang.String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new java.lang.String[]{this.f42577a, java.lang.String.valueOf(this.f42578b)}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    java.util.List listEmptyList = java.util.Collections.emptyList();
                    cursorQuery.close();
                    return listEmptyList;
                }
                do {
                    long j6 = cursorQuery.getLong(0);
                    long j10 = cursorQuery.getLong(3);
                    boolean z6 = cursorQuery.getLong(5) == 1;
                    byte[] blob = cursorQuery.getBlob(4);
                    if (j6 > this.f42578b) {
                        this.f42578b = j6;
                    }
                    try {
                        com.google.android.gms.internal.measurement.C6061l2.a aVar = (com.google.android.gms.internal.measurement.C6061l2.a) com.google.android.gms.measurement.internal.Z5.G(com.google.android.gms.internal.measurement.C6061l2.R(), blob);
                        java.lang.String string = cursorQuery.getString(1);
                        if (string == null) {
                            string = "";
                        }
                        aVar.E(string).G(cursorQuery.getLong(2));
                        arrayList.add(new com.google.android.gms.measurement.internal.C6425n(j6, j10, z6, (com.google.android.gms.internal.measurement.C6061l2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q())));
                    } catch (java.io.IOException e6) {
                        this.f42579c.j().G().c("Data loss. Failed to merge raw event. appId", com.google.android.gms.measurement.internal.C6428n2.v(this.f42577a), e6);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (android.database.sqlite.SQLiteException e10) {
                this.f42579c.j().G().c("Data loss. Error querying raw events batch. appId", com.google.android.gms.measurement.internal.C6428n2.v(this.f42577a), e10);
                if (0 != 0) {
                }
                return arrayList;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}
