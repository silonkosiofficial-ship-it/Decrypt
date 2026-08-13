package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Et, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2329Et {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f27134a = new java.util.concurrent.atomic.AtomicBoolean(false);

    public C2329Et(java.lang.String str) {
    }

    public final void a() {
        this.f27134a.set(false);
    }

    public final void b() {
        this.f27134a.set(true);
    }

    public final void c() {
        this.f27134a.set(false);
    }

    public final boolean d() {
        return this.f27134a.get();
    }
}
