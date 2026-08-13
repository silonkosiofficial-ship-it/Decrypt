package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5500vq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f39463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5280tq0 f39464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Class f39465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Cp0 f39466d;

    /* synthetic */ C5500vq0(java.util.Map map, java.util.List list, com.google.android.gms.internal.ads.C5280tq0 c5280tq0, com.google.android.gms.internal.ads.Cp0 cp0, java.lang.Class cls, com.google.android.gms.internal.ads.AbstractC5390uq0 abstractC5390uq0) {
        this.f39463a = map;
        this.f39464b = c5280tq0;
        this.f39465c = cls;
        this.f39466d = cp0;
    }

    public static com.google.android.gms.internal.ads.C5170sq0 b(java.lang.Class cls) {
        return new com.google.android.gms.internal.ads.C5170sq0(cls, null);
    }

    public final com.google.android.gms.internal.ads.Cp0 a() {
        return this.f39466d;
    }

    public final com.google.android.gms.internal.ads.C5280tq0 c() {
        return this.f39464b;
    }

    public final java.lang.Class d() {
        return this.f39465c;
    }

    public final java.util.Collection e() {
        return this.f39463a.values();
    }

    public final java.util.List f(byte[] bArr) {
        java.util.List list = (java.util.List) this.f39463a.get(com.google.android.gms.internal.ads.Lu0.b(bArr));
        return list != null ? list : java.util.Collections.emptyList();
    }

    public final boolean g() {
        return !this.f39466d.a().isEmpty();
    }
}
