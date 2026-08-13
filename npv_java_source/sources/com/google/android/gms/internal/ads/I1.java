package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f28367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.net.Uri f28368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4095j2 f28369c = new com.google.android.gms.internal.ads.C4095j2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f28370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3398ci0 f28371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4429m4 f28372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4873q6 f28373g;

    public I1() {
        com.google.android.gms.internal.ads.AbstractC3398ci0.O();
        this.f28370d = java.util.Collections.emptyList();
        this.f28371e = com.google.android.gms.internal.ads.AbstractC3398ci0.O();
        this.f28372f = new com.google.android.gms.internal.ads.C4429m4();
        this.f28373g = com.google.android.gms.internal.ads.C4873q6.f38184d;
    }

    public final com.google.android.gms.internal.ads.I1 a(java.lang.String str) {
        this.f28367a = str;
        return this;
    }

    public final com.google.android.gms.internal.ads.I1 b(android.net.Uri uri) {
        this.f28368b = uri;
        return this;
    }

    public final com.google.android.gms.internal.ads.Q7 c() {
        com.google.android.gms.internal.ads.C4651o5 c4651o5;
        android.net.Uri uri = this.f28368b;
        if (uri != null) {
            c4651o5 = new com.google.android.gms.internal.ads.C4651o5(uri, null, null, null, this.f28370d, null, this.f28371e, null, -9223372036854775807L, null);
        } else {
            c4651o5 = null;
        }
        java.lang.String str = this.f28367a;
        if (str == null) {
            str = "";
        }
        return new com.google.android.gms.internal.ads.Q7(str, new com.google.android.gms.internal.ads.C4207k3(this.f28369c, null), c4651o5, new com.google.android.gms.internal.ads.N4(this.f28372f, null), com.google.android.gms.internal.ads.Y9.f33290z, this.f28373g, null);
    }
}
