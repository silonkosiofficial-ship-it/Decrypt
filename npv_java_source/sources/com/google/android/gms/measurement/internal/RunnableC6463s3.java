package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6463s3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.E f42622C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42623D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42624E;

    RunnableC6463s3(com.google.android.gms.measurement.internal.X2 x6, com.google.android.gms.measurement.internal.E e6, java.lang.String str) {
        this.f42622C = e6;
        this.f42623D = str;
        this.f42624E = x6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42624E.f42198C.z0();
        this.f42624E.f42198C.w(this.f42622C, this.f42623D);
    }
}
