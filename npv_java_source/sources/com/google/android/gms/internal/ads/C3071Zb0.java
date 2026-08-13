package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3071Zb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2673Oc0 f33612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f33613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.EnumC2450Ib0 f33614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f33615d = "Ad overlay";

    public C3071Zb0(android.view.View view, com.google.android.gms.internal.ads.EnumC2450Ib0 enumC2450Ib0, java.lang.String str) {
        this.f33612a = new com.google.android.gms.internal.ads.C2673Oc0(view);
        this.f33613b = view.getClass().getCanonicalName();
        this.f33614c = enumC2450Ib0;
    }

    public final com.google.android.gms.internal.ads.EnumC2450Ib0 a() {
        return this.f33614c;
    }

    public final com.google.android.gms.internal.ads.C2673Oc0 b() {
        return this.f33612a;
    }

    public final java.lang.String c() {
        return this.f33615d;
    }

    public final java.lang.String d() {
        return this.f33613b;
    }
}
