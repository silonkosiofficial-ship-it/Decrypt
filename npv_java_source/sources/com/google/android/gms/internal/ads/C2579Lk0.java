package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2579Lk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f29554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3398ci0 f29555b;

    /* synthetic */ C2579Lk0(boolean z6, com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0, com.google.android.gms.internal.ads.AbstractC2615Mk0 abstractC2615Mk0) {
        this.f29554a = z6;
        this.f29555b = abstractC3398ci0;
    }

    public final P4.d a(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        return new com.google.android.gms.internal.ads.C5928zk0(this.f29555b, this.f29554a, executor, callable);
    }
}
