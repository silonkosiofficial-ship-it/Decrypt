package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6451q4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ boolean f42599C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ android.net.Uri f42600D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42601E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42602F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6430n4 f42603G;

    RunnableC6451q4(com.google.android.gms.measurement.internal.C6430n4 c6430n4, boolean z6, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        this.f42599C = z6;
        this.f42600D = uri;
        this.f42601E = str;
        this.f42602F = str2;
        this.f42603G = c6430n4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.C6430n4.a(this.f42603G, this.f42599C, this.f42600D, this.f42601E, this.f42602F);
    }
}
