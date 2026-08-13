package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6367e4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f42372C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42373D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42374E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42375F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42376G;

    RunnableC6367e4(com.google.android.gms.measurement.internal.F3 f6, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f42372C = atomicReference;
        this.f42374E = str2;
        this.f42375F = str3;
        this.f42376G = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42376G.f42679a.J().S(this.f42372C, null, this.f42374E, this.f42375F);
    }
}
