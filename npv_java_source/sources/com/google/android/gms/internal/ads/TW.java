package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class TW implements p174r3.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.CC f31954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.XC f31955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.OG f31956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.GG f31957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4306ky f31958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicBoolean f31959f = new java.util.concurrent.atomic.AtomicBoolean(false);

    TW(com.google.android.gms.internal.ads.CC cc, com.google.android.gms.internal.ads.XC xc, com.google.android.gms.internal.ads.OG og, com.google.android.gms.internal.ads.GG gg, com.google.android.gms.internal.ads.C4306ky c4306ky) {
        this.f31954a = cc;
        this.f31955b = xc;
        this.f31956c = og;
        this.f31957d = gg;
        this.f31958e = c4306ky;
    }

    @Override // p174r3.g
    public final synchronized void a(android.view.View view) {
        if (this.f31959f.compareAndSet(false, true)) {
            this.f31958e.t();
            this.f31957d.q1(view);
        }
    }

    @Override // p174r3.g
    public final void b() {
        if (this.f31959f.get()) {
            this.f31954a.e0();
        }
    }

    @Override // p174r3.g
    public final void c() {
        if (this.f31959f.get()) {
            this.f31955b.a();
            this.f31956c.a();
        }
    }
}
