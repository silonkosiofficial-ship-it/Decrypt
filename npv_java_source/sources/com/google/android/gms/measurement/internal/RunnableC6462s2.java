package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6462s2 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.InterfaceC6469t2 f42616C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f42617D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Throwable f42618E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final byte[] f42619F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.lang.String f42620G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.util.Map f42621H;

    private RunnableC6462s2(java.lang.String str, com.google.android.gms.measurement.internal.InterfaceC6469t2 interfaceC6469t2, int i6, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
        Q3.AbstractC1477p.l(interfaceC6469t2);
        this.f42616C = interfaceC6469t2;
        this.f42617D = i6;
        this.f42618E = th;
        this.f42619F = bArr;
        this.f42620G = str;
        this.f42621H = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42616C.a(this.f42620G, this.f42617D, this.f42618E, this.f42619F, this.f42621H);
    }
}
