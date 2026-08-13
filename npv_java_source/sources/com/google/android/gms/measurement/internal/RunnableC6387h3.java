package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6387h3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6362e f42419C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42420D;

    RunnableC6387h3(com.google.android.gms.measurement.internal.X2 x6, com.google.android.gms.measurement.internal.C6362e c6362e) {
        this.f42419C = c6362e;
        this.f42420D = x6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42420D.f42198C.z0();
        if (this.f42419C.f42361E.e() == null) {
            this.f42420D.f42198C.t(this.f42419C);
        } else {
            this.f42420D.f42198C.W(this.f42419C);
        }
    }
}
