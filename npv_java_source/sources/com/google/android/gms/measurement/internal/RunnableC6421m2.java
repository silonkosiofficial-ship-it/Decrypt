package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6421m2 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ int f42518C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42519D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ java.lang.Object f42520E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ java.lang.Object f42521F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ java.lang.Object f42522G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6428n2 f42523H;

    RunnableC6421m2(com.google.android.gms.measurement.internal.C6428n2 c6428n2, int i6, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f42518C = i6;
        this.f42519D = str;
        this.f42520E = obj;
        this.f42521F = obj2;
        this.f42522G = obj3;
        this.f42523H = c6428n2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.C6428n2 c6428n2;
        char c6;
        com.google.android.gms.measurement.internal.C6511z2 c6511z2F = this.f42523H.f42679a.F();
        if (!c6511z2F.s()) {
            this.f42523H.y(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f42523H.f42540c == 0) {
            if (this.f42523H.d().Y()) {
                c6428n2 = this.f42523H;
                c6 = 'C';
            } else {
                c6428n2 = this.f42523H;
                c6 = 'c';
            }
            c6428n2.f42540c = c6;
        }
        if (this.f42523H.f42541d < 0) {
            this.f42523H.f42541d = 106000L;
        }
        java.lang.String strSubstring = "2" + "01VDIWEA?".charAt(this.f42518C) + this.f42523H.f42540c + this.f42523H.f42541d + ":" + com.google.android.gms.measurement.internal.C6428n2.x(true, this.f42519D, this.f42520E, this.f42521F, this.f42522G);
        if (strSubstring.length() > 1024) {
            strSubstring = this.f42519D.substring(0, 1024);
        }
        com.google.android.gms.measurement.internal.D2 d6 = c6511z2F.f42727f;
        if (d6 != null) {
            d6.b(strSubstring, 1L);
        }
    }
}
