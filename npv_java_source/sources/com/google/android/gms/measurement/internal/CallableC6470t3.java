package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC6470t3 implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ android.os.Bundle f42633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42634c;

    CallableC6470t3(com.google.android.gms.measurement.internal.X2 x6, com.google.android.gms.measurement.internal.M5 m6, android.os.Bundle bundle) {
        this.f42632a = m6;
        this.f42633b = bundle;
        this.f42634c = x6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() {
        this.f42634c.f42198C.z0();
        com.google.android.gms.measurement.internal.H5 h6 = this.f42634c.f42198C;
        com.google.android.gms.measurement.internal.M5 m6 = this.f42632a;
        android.os.Bundle bundle = this.f42633b;
        h6.l().n();
        if (!com.google.android.gms.internal.measurement.C6066l7.a() || !h6.i0().F(m6.f42031C, com.google.android.gms.measurement.internal.G.f41827I0) || m6.f42031C == null) {
            return new java.util.ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    h6.j().G().a("Uri sources and timestamps do not match");
                } else {
                    for (int i6 = 0; i6 < intArray.length; i6++) {
                        com.google.android.gms.measurement.internal.C6404k c6404kL0 = h6.l0();
                        java.lang.String str = m6.f42031C;
                        int i10 = intArray[i6];
                        long j6 = longArray[i6];
                        Q3.AbstractC1477p.f(str);
                        c6404kL0.n();
                        c6404kL0.u();
                        try {
                            int iDelete = c6404kL0.B().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new java.lang.String[]{str, java.lang.String.valueOf(i10), java.lang.String.valueOf(j6)});
                            c6404kL0.j().K().d("Pruned " + iDelete + " trigger URIs. appId, source, timestamp", str, java.lang.Integer.valueOf(i10), java.lang.Long.valueOf(j6));
                        } catch (android.database.sqlite.SQLiteException e6) {
                            c6404kL0.j().G().c("Error pruning trigger URIs. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
                        }
                    }
                }
            }
        }
        return h6.l0().X0(m6.f42031C);
    }
}
