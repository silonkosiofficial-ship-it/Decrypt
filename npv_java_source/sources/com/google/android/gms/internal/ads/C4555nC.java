package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4555nC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f37538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f37539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.os.Bundle f37540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3668f70 f37541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3458dC f37542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3266bU f37543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f37544g;

    /* synthetic */ C4555nC(com.google.android.gms.internal.ads.C4335lC c4335lC, com.google.android.gms.internal.ads.AbstractC4445mC abstractC4445mC) {
        this.f37538a = c4335lC.f37116a;
        this.f37539b = c4335lC.f37117b;
        this.f37540c = c4335lC.f37118c;
        this.f37541d = c4335lC.f37119d;
        this.f37542e = c4335lC.f37120e;
        this.f37543f = c4335lC.f37121f;
        this.f37544g = c4335lC.f37122g;
    }

    final int a() {
        return this.f37544g;
    }

    final android.content.Context b(android.content.Context context) {
        return this.f37538a;
    }

    final android.os.Bundle c() {
        return this.f37540c;
    }

    final com.google.android.gms.internal.ads.C3458dC d() {
        return this.f37542e;
    }

    final com.google.android.gms.internal.ads.C4335lC e() {
        com.google.android.gms.internal.ads.C4335lC c4335lC = new com.google.android.gms.internal.ads.C4335lC();
        c4335lC.f(this.f37538a);
        c4335lC.k(this.f37539b);
        c4335lC.g(this.f37540c);
        c4335lC.h(this.f37542e);
        c4335lC.e(this.f37543f);
        return c4335lC;
    }

    final com.google.android.gms.internal.ads.C3266bU f(java.lang.String str) {
        com.google.android.gms.internal.ads.C3266bU c3266bU = this.f37543f;
        return c3266bU != null ? c3266bU : new com.google.android.gms.internal.ads.C3266bU(str);
    }

    final com.google.android.gms.internal.ads.C3668f70 g() {
        return this.f37541d;
    }

    final com.google.android.gms.internal.ads.C4546n70 h() {
        return this.f37539b;
    }
}
