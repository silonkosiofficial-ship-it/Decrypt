package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class ZY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f33606a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.YY f33607b;

    final com.google.android.gms.internal.ads.YY a() {
        return this.f33607b;
    }

    final void b(com.google.android.gms.internal.ads.YY yy) {
        this.f33607b = yy;
    }

    public final void c(boolean z6) {
        this.f33606a.set(true);
    }

    public final boolean d() {
        return this.f33606a.get();
    }
}
