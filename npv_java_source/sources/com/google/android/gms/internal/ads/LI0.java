package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class LI0 implements com.google.android.gms.internal.ads.EI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.EI0 f29461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f29462b;

    public LI0(com.google.android.gms.internal.ads.EI0 ei0, long j6) {
        this.f29461a = ei0;
        this.f29462b = j6;
    }

    @Override // com.google.android.gms.internal.ads.EI0
    public final int a(long j6) {
        return this.f29461a.a(j6 - this.f29462b);
    }

    @Override // com.google.android.gms.internal.ads.EI0
    public final int b(com.google.android.gms.internal.ads.UA0 ua0, com.google.android.gms.internal.ads.C5518vz0 c5518vz0, int i6) {
        int iB = this.f29461a.b(ua0, c5518vz0, i6);
        if (iB != -4) {
            return iB;
        }
        c5518vz0.f39488f += this.f29462b;
        return -4;
    }

    public final com.google.android.gms.internal.ads.EI0 c() {
        return this.f29461a;
    }

    @Override // com.google.android.gms.internal.ads.EI0
    public final boolean d() {
        return this.f29461a.d();
    }

    @Override // com.google.android.gms.internal.ads.EI0
    public final void f() {
        this.f29461a.f();
    }
}
