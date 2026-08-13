package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6373f3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42381C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42382D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42383E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ long f42384F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42385G;

    RunnableC6373f3(com.google.android.gms.measurement.internal.X2 x6, java.lang.String str, java.lang.String str2, java.lang.String str3, long j6) {
        this.f42381C = str;
        this.f42382D = str2;
        this.f42383E = str3;
        this.f42384F = j6;
        this.f42385G = x6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f42381C;
        if (str == null) {
            this.f42385G.f42198C.G(this.f42382D, null);
        } else {
            this.f42385G.f42198C.G(this.f42382D, new com.google.android.gms.measurement.internal.C6499x4(this.f42383E, str, this.f42384F));
        }
    }
}
