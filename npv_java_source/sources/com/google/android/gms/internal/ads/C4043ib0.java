package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ib0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4043ib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f36314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f36315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V3.f f36316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f36317d = ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25208A)).longValue() * 1000;

    public C4043ib0(java.lang.Object obj, V3.f fVar) {
        this.f36314a = obj;
        this.f36316c = fVar;
        this.f36315b = fVar.a();
    }

    public final long a() {
        return (this.f36317d + java.lang.Math.min(java.lang.Math.max(((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25711v)).longValue(), -900000L), 10000L)) - (this.f36316c.a() - this.f36315b);
    }

    public final java.lang.Object b() {
        return this.f36314a;
    }

    public final boolean c() {
        return this.f36316c.a() >= this.f36315b + this.f36317d;
    }
}
