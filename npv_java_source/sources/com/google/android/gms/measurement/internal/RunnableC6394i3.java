package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6394i3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6362e f42430C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42431D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42432E;

    RunnableC6394i3(com.google.android.gms.measurement.internal.X2 x6, com.google.android.gms.measurement.internal.C6362e c6362e, com.google.android.gms.measurement.internal.M5 m6) {
        this.f42430C = c6362e;
        this.f42431D = m6;
        this.f42432E = x6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42432E.f42198C.z0();
        if (this.f42430C.f42361E.e() == null) {
            this.f42432E.f42198C.u(this.f42430C, this.f42431D);
        } else {
            this.f42432E.f42198C.X(this.f42430C, this.f42431D);
        }
    }
}
