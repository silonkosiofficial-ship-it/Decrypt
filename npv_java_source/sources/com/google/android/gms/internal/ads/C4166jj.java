package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4166jj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36720a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36721b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f36722c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f36723d = new java.util.concurrent.atomic.AtomicBoolean(false);

    public final synchronized float a() {
        return this.f36722c;
    }

    public final synchronized void b(boolean z6, float f6) {
        this.f36721b = z6;
        this.f36722c = f6;
    }

    public final synchronized void c(boolean z6) {
        this.f36720a = z6;
        this.f36723d.set(true);
    }

    public final synchronized boolean d() {
        return this.f36721b;
    }

    public final synchronized boolean e(boolean z6) {
        if (!this.f36723d.get()) {
            return z6;
        }
        return this.f36720a;
    }
}
