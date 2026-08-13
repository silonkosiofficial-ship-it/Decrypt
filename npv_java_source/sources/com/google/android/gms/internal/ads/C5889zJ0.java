package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5889zJ0 extends com.google.android.gms.internal.ads.BJ0 implements java.lang.Comparable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f40283G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final boolean f40284H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final boolean f40285I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final boolean f40286J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final int f40287K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final int f40288L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final int f40289M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final int f40290N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f40291O;

    public C5889zJ0(int i6, com.google.android.gms.internal.ads.C2728Pm c2728Pm, int i10, com.google.android.gms.internal.ads.C4570nJ0 c4570nJ0, int i11, java.lang.String str) {
        int iM;
        super(i6, c2728Pm, i10);
        int i12 = 0;
        this.f40284H = com.google.android.gms.internal.ads.BB0.a(i11, false);
        int i13 = this.f25941F.f26564e;
        int i14 = c4570nJ0.f35457w;
        this.f40285I = 1 == (i13 & 1);
        this.f40286J = (i13 & 2) != 0;
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0P = c4570nJ0.f35455u.isEmpty() ? com.google.android.gms.internal.ads.AbstractC3398ci0.P("") : c4570nJ0.f35455u;
        int i15 = 0;
        while (true) {
            if (i15 >= abstractC3398ci0P.size()) {
                i15 = Integer.MAX_VALUE;
                iM = 0;
                break;
            } else {
                iM = com.google.android.gms.internal.ads.GJ0.m(this.f25941F, (java.lang.String) abstractC3398ci0P.get(i15), false);
                if (iM > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f40287K = i15;
        this.f40288L = iM;
        int iL = com.google.android.gms.internal.ads.GJ0.l(this.f25941F.f26565f, c4570nJ0.f35456v);
        this.f40289M = iL;
        this.f40291O = (this.f25941F.f26565f & 1088) != 0;
        int iM2 = com.google.android.gms.internal.ads.GJ0.m(this.f25941F, str, com.google.android.gms.internal.ads.GJ0.p(str) == null);
        this.f40290N = iM2;
        boolean z6 = iM > 0 || (c4570nJ0.f35455u.isEmpty() && iL > 0) || this.f40285I || (this.f40286J && iM2 > 0);
        if (com.google.android.gms.internal.ads.BB0.a(i11, c4570nJ0.f37577O) && z6) {
            i12 = 1;
        }
        this.f40283G = i12;
    }

    @Override // com.google.android.gms.internal.ads.BJ0
    public final int e() {
        return this.f40283G;
    }

    @Override // com.google.android.gms.internal.ads.BJ0
    public final /* bridge */ /* synthetic */ boolean g(com.google.android.gms.internal.ads.BJ0 bj0) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.google.android.gms.internal.ads.C5889zJ0 c5889zJ0) {
        com.google.android.gms.internal.ads.AbstractC2794Rh0 abstractC2794Rh0B = com.google.android.gms.internal.ads.AbstractC2794Rh0.i().d(this.f40284H, c5889zJ0.f40284H).c(java.lang.Integer.valueOf(this.f40287K), java.lang.Integer.valueOf(c5889zJ0.f40287K), com.google.android.gms.internal.ads.AbstractC2648Ni0.c().a()).b(this.f40288L, c5889zJ0.f40288L).b(this.f40289M, c5889zJ0.f40289M).d(this.f40285I, c5889zJ0.f40285I).c(java.lang.Boolean.valueOf(this.f40286J), java.lang.Boolean.valueOf(c5889zJ0.f40286J), this.f40288L == 0 ? com.google.android.gms.internal.ads.AbstractC2648Ni0.c() : com.google.android.gms.internal.ads.AbstractC2648Ni0.c().a()).b(this.f40290N, c5889zJ0.f40290N);
        if (this.f40289M == 0) {
            abstractC2794Rh0B = abstractC2794Rh0B.e(this.f40291O, c5889zJ0.f40291O);
        }
        return abstractC2794Rh0B.a();
    }
}
