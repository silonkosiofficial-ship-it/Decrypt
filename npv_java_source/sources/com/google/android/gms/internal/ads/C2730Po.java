package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Po, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2730Po extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2730Po> CREATOR = new com.google.android.gms.internal.ads.C2767Qo();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final android.os.Bundle f30793C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p224w3.a f30794D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final android.content.pm.ApplicationInfo f30795E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.String f30796F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final java.util.List f30797G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final android.content.pm.PackageInfo f30798H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final java.lang.String f30799I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final java.lang.String f30800J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public com.google.android.gms.internal.ads.C4108j80 f30801K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public java.lang.String f30802L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f30803M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final boolean f30804N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final android.os.Bundle f30805O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final android.os.Bundle f30806P;

    public C2730Po(android.os.Bundle bundle, p224w3.a aVar, android.content.pm.ApplicationInfo applicationInfo, java.lang.String str, java.util.List list, android.content.pm.PackageInfo packageInfo, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.C4108j80 c4108j80, java.lang.String str4, boolean z6, boolean z10, android.os.Bundle bundle2, android.os.Bundle bundle3) {
        this.f30793C = bundle;
        this.f30794D = aVar;
        this.f30796F = str;
        this.f30795E = applicationInfo;
        this.f30797G = list;
        this.f30798H = packageInfo;
        this.f30799I = str2;
        this.f30800J = str3;
        this.f30801K = c4108j80;
        this.f30802L = str4;
        this.f30803M = z6;
        this.f30804N = z10;
        this.f30805O = bundle2;
        this.f30806P = bundle3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        android.os.Bundle bundle = this.f30793C;
        int iA = R3.c.a(parcel);
        R3.c.e(parcel, 1, bundle, false);
        R3.c.p(parcel, 2, this.f30794D, i6, false);
        R3.c.p(parcel, 3, this.f30795E, i6, false);
        R3.c.q(parcel, 4, this.f30796F, false);
        R3.c.s(parcel, 5, this.f30797G, false);
        R3.c.p(parcel, 6, this.f30798H, i6, false);
        R3.c.q(parcel, 7, this.f30799I, false);
        R3.c.q(parcel, 9, this.f30800J, false);
        R3.c.p(parcel, 10, this.f30801K, i6, false);
        R3.c.q(parcel, 11, this.f30802L, false);
        R3.c.c(parcel, 12, this.f30803M);
        R3.c.c(parcel, 13, this.f30804N);
        R3.c.e(parcel, 14, this.f30805O, false);
        R3.c.e(parcel, 15, this.f30806P, false);
        R3.c.b(parcel, iA);
    }
}
