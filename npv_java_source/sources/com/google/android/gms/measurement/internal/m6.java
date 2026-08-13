package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.C6061l2 f42532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Long f42533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.h6 f42535d;

    private m6(com.google.android.gms.measurement.internal.h6 h6Var) {
        this.f42535d = h6Var;
    }

    final com.google.android.gms.internal.measurement.C6061l2 a(java.lang.String str, com.google.android.gms.internal.measurement.C6061l2 c6061l2) {
        com.google.android.gms.measurement.internal.C6442p2 c6442p2I;
        java.lang.String str2;
        java.lang.Object obj;
        java.lang.String strT = c6061l2.T();
        java.util.List listU = c6061l2.U();
        this.f42535d.o();
        java.lang.Long l6 = (java.lang.Long) com.google.android.gms.measurement.internal.Z5.f0(c6061l2, "_eid");
        boolean z6 = l6 != null;
        if (z6 && strT.equals("_ep")) {
            Q3.AbstractC1477p.l(l6);
            this.f42535d.o();
            strT = (java.lang.String) com.google.android.gms.measurement.internal.Z5.f0(c6061l2, "_en");
            if (android.text.TextUtils.isEmpty(strT)) {
                this.f42535d.j().I().b("Extra parameter without an event name. eventId", l6);
                return null;
            }
            if (this.f42532a == null || this.f42533b == null || l6.longValue() != this.f42533b.longValue()) {
                android.util.Pair pairH = this.f42535d.q().H(str, l6);
                if (pairH == null || (obj = pairH.first) == null) {
                    this.f42535d.j().I().c("Extra parameter without existing main event. eventName, eventId", strT, l6);
                    return null;
                }
                this.f42532a = (com.google.android.gms.internal.measurement.C6061l2) obj;
                this.f42534c = ((java.lang.Long) pairH.second).longValue();
                this.f42535d.o();
                this.f42533b = (java.lang.Long) com.google.android.gms.measurement.internal.Z5.f0(this.f42532a, "_eid");
            }
            long j6 = this.f42534c - 1;
            this.f42534c = j6;
            if (j6 <= 0) {
                com.google.android.gms.measurement.internal.C6404k c6404kQ = this.f42535d.q();
                c6404kQ.n();
                c6404kQ.j().K().b("Clearing complex main event info. appId", str);
                try {
                    c6404kQ.B().execSQL("delete from main_event_params where app_id=?", new java.lang.String[]{str});
                } catch (android.database.sqlite.SQLiteException e6) {
                    c6404kQ.j().G().b("Error clearing complex main event", e6);
                }
            } else {
                this.f42535d.q().n0(str, l6, this.f42534c, this.f42532a);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.google.android.gms.internal.measurement.C6079n2 c6079n2 : this.f42532a.U()) {
                this.f42535d.o();
                if (com.google.android.gms.measurement.internal.Z5.F(c6061l2, c6079n2.V()) == null) {
                    arrayList.add(c6079n2);
                }
            }
            if (arrayList.isEmpty()) {
                c6442p2I = this.f42535d.j().I();
                str2 = "No unique parameters in main event. eventName";
                c6442p2I.b(str2, strT);
            } else {
                arrayList.addAll(listU);
                listU = arrayList;
            }
        } else if (z6) {
            this.f42533b = l6;
            this.f42532a = c6061l2;
            this.f42535d.o();
            long jLongValue = ((java.lang.Long) com.google.android.gms.measurement.internal.Z5.J(c6061l2, "_epc", 0L)).longValue();
            this.f42534c = jLongValue;
            if (jLongValue <= 0) {
                c6442p2I = this.f42535d.j().I();
                str2 = "Complex event with zero extra param count. eventName";
                c6442p2I.b(str2, strT);
            } else {
                this.f42535d.q().n0(str, (java.lang.Long) Q3.AbstractC1477p.l(l6), this.f42534c, c6061l2);
            }
        }
        return (com.google.android.gms.internal.measurement.C6061l2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) ((com.google.android.gms.internal.measurement.C6061l2.a) c6061l2.x()).E(strT).J().C(listU).q());
    }
}
