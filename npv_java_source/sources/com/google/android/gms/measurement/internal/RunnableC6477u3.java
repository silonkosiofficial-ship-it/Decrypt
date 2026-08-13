package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6477u3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.Y5 f42648C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42649D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42650E;

    RunnableC6477u3(com.google.android.gms.measurement.internal.X2 x6, com.google.android.gms.measurement.internal.Y5 y6, com.google.android.gms.measurement.internal.M5 m6) {
        this.f42648C = y6;
        this.f42649D = m6;
        this.f42650E = x6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42650E.f42198C.z0();
        if (this.f42648C.e() == null) {
            this.f42650E.f42198C.H(this.f42648C.f42230D, this.f42649D);
        } else {
            this.f42650E.f42198C.z(this.f42648C, this.f42649D);
        }
    }
}
