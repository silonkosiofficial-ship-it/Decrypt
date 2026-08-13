package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2990Wu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p224w3.a f32823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f32824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.ref.WeakReference f32826d;

    /* synthetic */ C2990Wu(com.google.android.gms.internal.ads.C2882Tu c2882Tu, com.google.android.gms.internal.ads.AbstractC2918Uu abstractC2918Uu) {
        this.f32823a = c2882Tu.f32031a;
        this.f32824b = c2882Tu.f32032b;
        this.f32826d = c2882Tu.f32034d;
        this.f32825c = c2882Tu.f32033c;
    }

    final long a() {
        return this.f32825c;
    }

    final android.content.Context b() {
        return this.f32824b;
    }

    public final p174r3.k c() {
        return new p174r3.k(this.f32824b, this.f32823a);
    }

    final com.google.android.gms.internal.ads.C2972Wg d() {
        return new com.google.android.gms.internal.ads.C2972Wg(this.f32824b);
    }

    final p224w3.a e() {
        return this.f32823a;
    }

    final java.lang.String f() {
        return p174r3.v.t().H(this.f32824b, this.f32823a.f56217C);
    }

    final java.lang.ref.WeakReference g() {
        return this.f32826d;
    }
}
