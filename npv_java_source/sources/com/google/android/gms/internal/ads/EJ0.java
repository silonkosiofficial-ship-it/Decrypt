package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class EJ0 extends com.google.android.gms.internal.ads.BJ0 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f27010G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4570nJ0 f27011H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final boolean f27012I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final boolean f27013J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final boolean f27014K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final int f27015L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final int f27016M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final int f27017N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f27018O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final int f27019P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final int f27020Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final boolean f27021R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final int f27022S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final int f27023T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final boolean f27024U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final boolean f27025V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final int f27026W;

    /* JADX WARN: Code duplicated, block: B:108:0x015d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:76:0x0103  */
    public EJ0(int i6, com.google.android.gms.internal.ads.C2728Pm c2728Pm, int i10, com.google.android.gms.internal.ads.C4570nJ0 c4570nJ0, int i11, java.lang.String str, int i12, boolean z6) {
        boolean z10;
        boolean z11;
        int i13;
        int iM;
        int i14;
        byte b6;
        boolean z12;
        com.google.android.gms.internal.ads.D d6;
        int i15;
        int i16;
        int i17;
        super(i6, c2728Pm, i10);
        this.f27011H = c4570nJ0;
        int i18 = 1;
        int i19 = true != c4570nJ0.f37568F ? 16 : 24;
        if (z6) {
            com.google.android.gms.internal.ads.D d10 = this.f25941F;
            int i20 = d10.f26581v;
            float f6 = d10.f26583x;
            if (f6 == -1.0f || f6 <= 2.14748365E9f) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f27010G = z10;
        if (!z6 || (((i15 = (d6 = this.f25941F).f26581v) != -1 && i15 < 0) || ((i16 = d6.f26582w) != -1 && i16 < 0))) {
            z11 = false;
        } else {
            float f10 = d6.f26583x;
            if ((f10 == -1.0f || f10 >= 0.0f) && ((i17 = d6.f26569j) == -1 || i17 >= 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        this.f27012I = z11;
        this.f27013J = com.google.android.gms.internal.ads.BB0.a(i11, false);
        com.google.android.gms.internal.ads.D d11 = this.f25941F;
        float f11 = d11.f26583x;
        this.f27014K = f11 != -1.0f && f11 >= 10.0f;
        this.f27015L = d11.f26569j;
        this.f27016M = d11.a();
        int i21 = 0;
        while (true) {
            i13 = Integer.MAX_VALUE;
            if (i21 >= c4570nJ0.f35447m.size()) {
                iM = 0;
                i21 = Integer.MAX_VALUE;
                break;
            } else {
                iM = com.google.android.gms.internal.ads.GJ0.m(this.f25941F, (java.lang.String) c4570nJ0.f35447m.get(i21), false);
                if (iM > 0) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        this.f27018O = i21;
        this.f27019P = iM;
        this.f27020Q = com.google.android.gms.internal.ads.GJ0.l(this.f25941F.f26565f, 0);
        int i22 = this.f25941F.f26565f;
        this.f27021R = i22 == 0 || (i22 & 1) != 0;
        this.f27022S = com.google.android.gms.internal.ads.GJ0.m(this.f25941F, str, com.google.android.gms.internal.ads.GJ0.p(str) == null);
        for (int i23 = 0; i23 < c4570nJ0.f35446l.size(); i23++) {
            java.lang.String str2 = this.f25941F.f26574o;
            if (str2 != null && str2.equals(c4570nJ0.f35446l.get(i23))) {
                i13 = i23;
                break;
            }
        }
        this.f27017N = i13;
        this.f27024U = (i11 & 384) == 128;
        this.f27025V = (i11 & 64) == 64;
        com.google.android.gms.internal.ads.D d12 = this.f25941F;
        java.lang.String str3 = d12.f26574o;
        if (str3 == null) {
            i14 = 0;
        } else {
            i14 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    b6 = 0;
                    break;
                case "video/av01":
                    b6 = 1;
                    break;
                case "video/hevc":
                    b6 = 2;
                    break;
                case "video/avc":
                    b6 = 4;
                    break;
                case "video/x-vnd.on2.vp9":
                    b6 = 3;
                    break;
                default:
                    b6 = -1;
                    break;
            }
            if (b6 == 0) {
                i14 = 5;
            } else if (b6 != 1) {
                if (b6 == 2) {
                    i14 = 3;
                } else if (b6 == 3) {
                    i14 = 2;
                } else if (b6 != 4) {
                    i14 = 0;
                } else {
                    i14 = 1;
                }
            }
        }
        this.f27026W = i14;
        if ((d12.f26565f & 16384) != 0) {
            i18 = 0;
        } else {
            com.google.android.gms.internal.ads.C4570nJ0 c4570nJ1 = this.f27011H;
            if (!com.google.android.gms.internal.ads.BB0.a(i11, c4570nJ1.f37577O) || (!(z12 = this.f27010G) && !c4570nJ1.f37566D)) {
                i18 = 0;
            } else if (com.google.android.gms.internal.ads.BB0.a(i11, false) && this.f27012I && z12 && d12.f26569j != -1 && (i19 & i11) != 0) {
                i18 = 2;
            }
        }
        this.f27023T = i18;
    }

    public static /* synthetic */ int i(com.google.android.gms.internal.ads.EJ0 ej0, com.google.android.gms.internal.ads.EJ0 ej1) {
        com.google.android.gms.internal.ads.AbstractC2648Ni0 abstractC2648Ni0A = (ej0.f27010G && ej0.f27013J) ? com.google.android.gms.internal.ads.GJ0.f27782j : com.google.android.gms.internal.ads.GJ0.f27782j.a();
        com.google.android.gms.internal.ads.AbstractC2794Rh0 abstractC2794Rh0I = com.google.android.gms.internal.ads.AbstractC2794Rh0.i();
        boolean z6 = ej0.f27011H.f35460z;
        return abstractC2794Rh0I.c(java.lang.Integer.valueOf(ej0.f27016M), java.lang.Integer.valueOf(ej1.f27016M), abstractC2648Ni0A).c(java.lang.Integer.valueOf(ej0.f27015L), java.lang.Integer.valueOf(ej1.f27015L), abstractC2648Ni0A).a();
    }

    public static /* synthetic */ int m(com.google.android.gms.internal.ads.EJ0 ej0, com.google.android.gms.internal.ads.EJ0 ej1) {
        com.google.android.gms.internal.ads.AbstractC2794Rh0 abstractC2794Rh0D = com.google.android.gms.internal.ads.AbstractC2794Rh0.i().d(ej0.f27013J, ej1.f27013J).c(java.lang.Integer.valueOf(ej0.f27018O), java.lang.Integer.valueOf(ej1.f27018O), com.google.android.gms.internal.ads.AbstractC2648Ni0.c().a()).b(ej0.f27019P, ej1.f27019P).b(ej0.f27020Q, ej1.f27020Q).d(ej0.f27021R, ej1.f27021R).b(ej0.f27022S, ej1.f27022S).d(ej0.f27014K, ej1.f27014K).d(ej0.f27010G, ej1.f27010G).d(ej0.f27012I, ej1.f27012I).c(java.lang.Integer.valueOf(ej0.f27017N), java.lang.Integer.valueOf(ej1.f27017N), com.google.android.gms.internal.ads.AbstractC2648Ni0.c().a()).d(ej0.f27024U, ej1.f27024U).d(ej0.f27025V, ej1.f27025V);
        if (ej0.f27024U && ej0.f27025V) {
            abstractC2794Rh0D = abstractC2794Rh0D.b(ej0.f27026W, ej1.f27026W);
        }
        return abstractC2794Rh0D.a();
    }

    @Override // com.google.android.gms.internal.ads.BJ0
    public final int e() {
        return this.f27023T;
    }

    @Override // com.google.android.gms.internal.ads.BJ0
    public final /* bridge */ /* synthetic */ boolean g(com.google.android.gms.internal.ads.BJ0 bj0) {
        com.google.android.gms.internal.ads.EJ0 ej0 = (com.google.android.gms.internal.ads.EJ0) bj0;
        if (!j$.util.Objects.equals(this.f25941F.f26574o, ej0.f25941F.f26574o)) {
            return false;
        }
        boolean z6 = this.f27011H.f37569G;
        return this.f27024U == ej0.f27024U && this.f27025V == ej0.f27025V;
    }
}
