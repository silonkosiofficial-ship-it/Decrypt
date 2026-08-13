package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class S6 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.os.Handler f31553C;

    S6(com.google.android.gms.internal.ads.U6 u6, android.os.Handler handler) {
        this.f31553C = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f31553C.post(runnable);
    }
}
