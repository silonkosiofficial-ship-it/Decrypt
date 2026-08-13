package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class US {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4704od f32207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f32208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5899zS f32209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p224w3.a f32210d;

    public US(android.content.Context context, p224w3.a aVar, com.google.android.gms.internal.ads.C4704od c4704od, com.google.android.gms.internal.ads.C5899zS c5899zS) {
        this.f32208b = context;
        this.f32210d = aVar;
        this.f32207a = c4704od;
        this.f32209c = c5899zS;
    }

    final /* synthetic */ java.lang.Void a(boolean z6, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (z6) {
            this.f32208b.deleteDatabase("OfflineUpload.db");
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.database.Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new java.lang.String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(com.google.android.gms.internal.ads.C2416Hd.G0(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (com.google.android.gms.internal.ads.Vv0 e6) {
                    p224w3.p.d("Unable to deserialize proto from offline signals database:");
                    p224w3.p.d(e6.getMessage());
                }
            }
            cursorQuery.close();
            android.content.Context context = this.f32208b;
            com.google.android.gms.internal.ads.C2490Jd c2490JdS0 = com.google.android.gms.internal.ads.C2600Md.s0();
            c2490JdS0.F(context.getPackageName());
            c2490JdS0.H(android.os.Build.MODEL);
            c2490JdS0.z(com.google.android.gms.internal.ads.OS.a(sQLiteDatabase, 0));
            c2490JdS0.E(arrayList);
            c2490JdS0.B(com.google.android.gms.internal.ads.OS.a(sQLiteDatabase, 1));
            c2490JdS0.G(com.google.android.gms.internal.ads.OS.a(sQLiteDatabase, 3));
            c2490JdS0.C(p174r3.v.c().a());
            c2490JdS0.A(com.google.android.gms.internal.ads.OS.b(sQLiteDatabase, 2));
            final com.google.android.gms.internal.ads.C2600Md c2600Md = (com.google.android.gms.internal.ads.C2600Md) c2490JdS0.u();
            int size = arrayList.size();
            long jC0 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                com.google.android.gms.internal.ads.C2416Hd c2416Hd = (com.google.android.gms.internal.ads.C2416Hd) arrayList.get(i6);
                if (c2416Hd.D0() == com.google.android.gms.internal.ads.EnumC2932Ve.ENUM_TRUE && c2416Hd.C0() > jC0) {
                    jC0 = c2416Hd.C0();
                }
            }
            if (jC0 != 0) {
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("value", java.lang.Long.valueOf(jC0));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            this.f32207a.b(new com.google.android.gms.internal.ads.InterfaceC4594nd() { // from class: com.google.android.gms.internal.ads.SS
                @Override // com.google.android.gms.internal.ads.InterfaceC4594nd
                public final void a(com.google.android.gms.internal.ads.C3004Xe c3004Xe) {
                    c3004Xe.E(c2600Md);
                }
            });
            p224w3.a aVar = this.f32210d;
            com.google.android.gms.internal.ads.C3002Xd c3002XdH0 = com.google.android.gms.internal.ads.C3038Yd.h0();
            c3002XdH0.z(aVar.f56218D);
            c3002XdH0.B(this.f32210d.f56219E);
            c3002XdH0.A(true != this.f32210d.f56220F ? 2 : 0);
            final com.google.android.gms.internal.ads.C3038Yd c3038Yd = (com.google.android.gms.internal.ads.C3038Yd) c3002XdH0.u();
            this.f32207a.b(new com.google.android.gms.internal.ads.InterfaceC4594nd() { // from class: com.google.android.gms.internal.ads.TS
                @Override // com.google.android.gms.internal.ads.InterfaceC4594nd
                public final void a(com.google.android.gms.internal.ads.C3004Xe c3004Xe) {
                    com.google.android.gms.internal.ads.C2713Pe c2713Pe = (com.google.android.gms.internal.ads.C2713Pe) c3004Xe.I().H();
                    c2713Pe.A(c3038Yd);
                    c3004Xe.B(c2713Pe);
                }
            });
            this.f32207a.c(10004);
            com.google.android.gms.internal.ads.OS.e(sQLiteDatabase);
        }
        return null;
    }

    public final void b(final boolean z6) {
        try {
            this.f32209c.a(new com.google.android.gms.internal.ads.Y80() { // from class: com.google.android.gms.internal.ads.RS
                @Override // com.google.android.gms.internal.ads.Y80
                public final java.lang.Object b(java.lang.Object obj) {
                    this.f31268a.a(z6, (android.database.sqlite.SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (java.lang.Exception e6) {
            p224w3.p.d("Error in offline signals database startup: ".concat(java.lang.String.valueOf(e6.getMessage())));
        }
    }
}
