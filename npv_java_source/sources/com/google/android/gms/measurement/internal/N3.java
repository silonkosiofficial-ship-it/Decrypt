package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class N3 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42064C;

    N3(com.google.android.gms.measurement.internal.F3 f6) {
        this.f42064C = f6;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f42064C.l().D(runnable);
    }
}
