package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4108j80 extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C4108j80> CREATOR = new com.google.android.gms.internal.ads.C4218k80();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.EnumC3780g80[] f36589C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final android.content.Context f36590D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f36591E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.EnumC3780g80 f36592F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f36593G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f36594H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f36595I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final java.lang.String f36596J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final int f36597K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final int f36598L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final int[] f36599M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final int[] f36600N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f36601O;

    public C4108j80(int i6, int i10, int i11, int i12, java.lang.String str, int i13, int i14) {
        com.google.android.gms.internal.ads.EnumC3780g80[] enumC3780g80ArrValues = com.google.android.gms.internal.ads.EnumC3780g80.values();
        this.f36589C = enumC3780g80ArrValues;
        int[] iArrA = com.google.android.gms.internal.ads.AbstractC3890h80.a();
        this.f36599M = iArrA;
        int[] iArrA2 = com.google.android.gms.internal.ads.AbstractC4000i80.a();
        this.f36600N = iArrA2;
        this.f36590D = null;
        this.f36591E = i6;
        this.f36592F = enumC3780g80ArrValues[i6];
        this.f36593G = i10;
        this.f36594H = i11;
        this.f36595I = i12;
        this.f36596J = str;
        this.f36597K = i13;
        this.f36601O = iArrA[i13];
        this.f36598L = i14;
        int i15 = iArrA2[i14];
    }

    private C4108j80(android.content.Context context, com.google.android.gms.internal.ads.EnumC3780g80 enumC3780g80, int i6, int i10, int i11, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f36589C = com.google.android.gms.internal.ads.EnumC3780g80.values();
        this.f36599M = com.google.android.gms.internal.ads.AbstractC3890h80.a();
        this.f36600N = com.google.android.gms.internal.ads.AbstractC4000i80.a();
        this.f36590D = context;
        this.f36591E = enumC3780g80.ordinal();
        this.f36592F = enumC3780g80;
        this.f36593G = i6;
        this.f36594H = i10;
        this.f36595I = i11;
        this.f36596J = str;
        int i12 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.f36601O = i12;
        this.f36597K = i12 - 1;
        "onAdClosed".equals(str3);
        this.f36598L = 0;
    }

    public static com.google.android.gms.internal.ads.C4108j80 e(com.google.android.gms.internal.ads.EnumC3780g80 enumC3780g80, android.content.Context context) {
        if (enumC3780g80 == com.google.android.gms.internal.ads.EnumC3780g80.Rewarded) {
            return new com.google.android.gms.internal.ads.C4108j80(context, enumC3780g80, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.i6)).intValue(), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.o6)).intValue(), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.q6)).intValue(), (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.s6), (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.k6), (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.m6));
        }
        if (enumC3780g80 == com.google.android.gms.internal.ads.EnumC3780g80.Interstitial) {
            return new com.google.android.gms.internal.ads.C4108j80(context, enumC3780g80, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.j6)).intValue(), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.p6)).intValue(), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.r6)).intValue(), (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.t6), (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.l6), (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.n6));
        }
        if (enumC3780g80 != com.google.android.gms.internal.ads.EnumC3780g80.AppOpen) {
            return null;
        }
        return new com.google.android.gms.internal.ads.C4108j80(context, enumC3780g80, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.w6)).intValue(), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.y6)).intValue(), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.z6)).intValue(), (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.u6), (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.v6), (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.x6));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f36591E;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.k(parcel, 2, this.f36593G);
        R3.c.k(parcel, 3, this.f36594H);
        R3.c.k(parcel, 4, this.f36595I);
        R3.c.q(parcel, 5, this.f36596J, false);
        R3.c.k(parcel, 6, this.f36597K);
        R3.c.k(parcel, 7, this.f36598L);
        R3.c.b(parcel, iA);
    }
}
