package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3887h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f36006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.M6 f36007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.C4215k7 f36008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36009d;

    private C3887h7(com.google.android.gms.internal.ads.C4215k7 c4215k7) {
        this.f36009d = false;
        this.f36006a = null;
        this.f36007b = null;
        this.f36008c = c4215k7;
    }

    private C3887h7(java.lang.Object obj, com.google.android.gms.internal.ads.M6 m6) {
        this.f36009d = false;
        this.f36006a = obj;
        this.f36007b = m6;
        this.f36008c = null;
    }

    public static com.google.android.gms.internal.ads.C3887h7 a(com.google.android.gms.internal.ads.C4215k7 c4215k7) {
        return new com.google.android.gms.internal.ads.C3887h7(c4215k7);
    }

    public static com.google.android.gms.internal.ads.C3887h7 b(java.lang.Object obj, com.google.android.gms.internal.ads.M6 m6) {
        return new com.google.android.gms.internal.ads.C3887h7(obj, m6);
    }

    public final boolean c() {
        return this.f36008c == null;
    }
}
