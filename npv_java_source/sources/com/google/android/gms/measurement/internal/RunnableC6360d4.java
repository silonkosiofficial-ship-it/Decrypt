package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6360d4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f42342C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42343D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42344E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42345F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ boolean f42346G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42347H;

    RunnableC6360d4(com.google.android.gms.measurement.internal.F3 f6, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6) {
        this.f42342C = atomicReference;
        this.f42344E = str2;
        this.f42345F = str3;
        this.f42346G = z6;
        this.f42347H = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42347H.f42679a.J().T(this.f42342C, null, this.f42344E, this.f42345F, this.f42346G);
    }
}
