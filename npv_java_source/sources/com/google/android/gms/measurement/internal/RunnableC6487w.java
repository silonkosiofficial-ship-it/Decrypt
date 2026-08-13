package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6487w implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.InterfaceC6505y3 f42674C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.AbstractC6466t f42675D;

    RunnableC6487w(com.google.android.gms.measurement.internal.AbstractC6466t abstractC6466t, com.google.android.gms.measurement.internal.InterfaceC6505y3 interfaceC6505y3) {
        this.f42674C = interfaceC6505y3;
        this.f42675D = abstractC6466t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42674C.f();
        if (com.google.android.gms.measurement.internal.C6348c.a()) {
            this.f42674C.l().D(this);
            return;
        }
        boolean zE = this.f42675D.e();
        this.f42675D.f42631c = 0L;
        if (zE) {
            this.f42675D.d();
        }
    }
}
