package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4130jJ0 extends com.google.android.gms.internal.ads.BJ0 implements java.lang.Comparable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f36631G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final boolean f36632H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.lang.String f36633I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4570nJ0 f36634J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final boolean f36635K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final int f36636L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final int f36637M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final int f36638N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f36639O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final int f36640P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final int f36641Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final boolean f36642R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final int f36643S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final int f36644T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final int f36645U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final int f36646V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final boolean f36647W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final boolean f36648X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final boolean f36649Y;

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    public C4130jJ0(int i6, com.google.android.gms.internal.ads.C2728Pm c2728Pm, int i10, com.google.android.gms.internal.ads.C4570nJ0 c4570nJ0, int i11, boolean z6, com.google.android.gms.internal.ads.InterfaceC2201Bg0 interfaceC2201Bg0, int i12) {
        int i13;
        int iM;
        byte b6;
        boolean z10;
        int iM2;
        boolean z11;
        super(i6, c2728Pm, i10);
        this.f36634J = c4570nJ0;
        int i14 = 1;
        int i15 = true != c4570nJ0.f37575M ? 16 : 24;
        this.f36633I = com.google.android.gms.internal.ads.GJ0.p(this.f25941F.f26563d);
        this.f36635K = com.google.android.gms.internal.ads.BB0.a(i11, false);
        int i16 = 0;
        while (true) {
            i13 = Integer.MAX_VALUE;
            if (i16 >= c4570nJ0.f35449o.size()) {
                iM = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iM = com.google.android.gms.internal.ads.GJ0.m(this.f25941F, (java.lang.String) c4570nJ0.f35449o.get(i16), false);
                if (iM > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.f36637M = i16;
        this.f36636L = iM;
        this.f36638N = com.google.android.gms.internal.ads.GJ0.l(this.f25941F.f26565f, 0);
        com.google.android.gms.internal.ads.D d6 = this.f25941F;
        int i17 = d6.f26565f;
        this.f36639O = i17 == 0 || (i17 & 1) != 0;
        this.f36642R = 1 == (d6.f26564e & 1);
        java.lang.String str = d6.f26574o;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2123537834) {
                if (iHashCode != 187078297) {
                    if (iHashCode == 1504698186 && str.equals("audio/iamf")) {
                        b6 = 2;
                    } else {
                        b6 = -1;
                    }
                } else if (str.equals("audio/ac4")) {
                    b6 = 1;
                } else {
                    b6 = -1;
                }
            } else if (str.equals("audio/eac3-joc")) {
                b6 = 0;
            } else {
                b6 = -1;
            }
            if (b6 == 0 || b6 == 1 || b6 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f36649Y = z10;
        this.f36643S = d6.f26551D;
        this.f36644T = d6.f26552E;
        this.f36645U = d6.f26569j;
        this.f36632H = interfaceC2201Bg0.b(d6);
        android.content.res.Configuration configuration = android.content.res.Resources.getSystem().getConfiguration();
        java.lang.String[] strArrSplit = com.google.android.gms.internal.ads.EW.f27061a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new java.lang.String[]{configuration.locale.toLanguageTag()};
        for (int i18 = 0; i18 < strArrSplit.length; i18++) {
            strArrSplit[i18] = com.google.android.gms.internal.ads.EW.e(strArrSplit[i18]);
        }
        int i19 = 0;
        while (true) {
            if (i19 >= strArrSplit.length) {
                iM2 = 0;
                i19 = Integer.MAX_VALUE;
                break;
            } else {
                iM2 = com.google.android.gms.internal.ads.GJ0.m(this.f25941F, strArrSplit[i19], false);
                if (iM2 > 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        this.f36640P = i19;
        this.f36641Q = iM2;
        for (int i20 = 0; i20 < c4570nJ0.f35453s.size(); i20++) {
            java.lang.String str2 = this.f25941F.f26574o;
            if (str2 != null && str2.equals(c4570nJ0.f35453s.get(i20))) {
                i13 = i20;
                break;
            }
        }
        this.f36646V = i13;
        this.f36647W = (i11 & 384) == 128;
        this.f36648X = (i11 & 64) == 64;
        com.google.android.gms.internal.ads.C4570nJ0 c4570nJ1 = this.f36634J;
        if (!com.google.android.gms.internal.ads.BB0.a(i11, c4570nJ1.f37577O) || (!(z11 = this.f36632H) && !c4570nJ1.f37570H)) {
            i14 = 0;
        } else if (com.google.android.gms.internal.ads.BB0.a(i11, false) && z11 && this.f25941F.f26569j != -1 && ((c4570nJ1.f37579Q || !z6) && (i15 & i11) != 0)) {
            i14 = 2;
        }
        this.f36631G = i14;
    }

    @Override // com.google.android.gms.internal.ads.BJ0
    public final int e() {
        return this.f36631G;
    }

    @Override // com.google.android.gms.internal.ads.BJ0
    public final /* bridge */ /* synthetic */ boolean g(com.google.android.gms.internal.ads.BJ0 bj0) {
        java.lang.String str;
        com.google.android.gms.internal.ads.C4130jJ0 c4130jJ0 = (com.google.android.gms.internal.ads.C4130jJ0) bj0;
        boolean z6 = this.f36634J.f37573K;
        com.google.android.gms.internal.ads.D d6 = this.f25941F;
        int i6 = d6.f26551D;
        if (i6 == -1) {
            return false;
        }
        com.google.android.gms.internal.ads.D d10 = c4130jJ0.f25941F;
        if (i6 != d10.f26551D || (str = d6.f26574o) == null || !android.text.TextUtils.equals(str, d10.f26574o)) {
            return false;
        }
        boolean z10 = this.f36634J.f37572J;
        int i10 = this.f25941F.f26552E;
        return i10 != -1 && i10 == c4130jJ0.f25941F.f26552E && this.f36647W == c4130jJ0.f36647W && this.f36648X == c4130jJ0.f36648X;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.google.android.gms.internal.ads.C4130jJ0 c4130jJ0) {
        com.google.android.gms.internal.ads.AbstractC2648Ni0 abstractC2648Ni0A = (this.f36632H && this.f36635K) ? com.google.android.gms.internal.ads.GJ0.f27782j : com.google.android.gms.internal.ads.GJ0.f27782j.a();
        com.google.android.gms.internal.ads.AbstractC2794Rh0 abstractC2794Rh0C = com.google.android.gms.internal.ads.AbstractC2794Rh0.i().d(this.f36635K, c4130jJ0.f36635K).c(java.lang.Integer.valueOf(this.f36637M), java.lang.Integer.valueOf(c4130jJ0.f36637M), com.google.android.gms.internal.ads.AbstractC2648Ni0.c().a()).b(this.f36636L, c4130jJ0.f36636L).b(this.f36638N, c4130jJ0.f36638N).d(this.f36642R, c4130jJ0.f36642R).d(this.f36639O, c4130jJ0.f36639O).c(java.lang.Integer.valueOf(this.f36640P), java.lang.Integer.valueOf(c4130jJ0.f36640P), com.google.android.gms.internal.ads.AbstractC2648Ni0.c().a()).b(this.f36641Q, c4130jJ0.f36641Q).d(this.f36632H, c4130jJ0.f36632H).c(java.lang.Integer.valueOf(this.f36646V), java.lang.Integer.valueOf(c4130jJ0.f36646V), com.google.android.gms.internal.ads.AbstractC2648Ni0.c().a());
        boolean z6 = this.f36634J.f35460z;
        com.google.android.gms.internal.ads.AbstractC2794Rh0 abstractC2794Rh0C2 = abstractC2794Rh0C.d(this.f36647W, c4130jJ0.f36647W).d(this.f36648X, c4130jJ0.f36648X).d(this.f36649Y, c4130jJ0.f36649Y).c(java.lang.Integer.valueOf(this.f36643S), java.lang.Integer.valueOf(c4130jJ0.f36643S), abstractC2648Ni0A).c(java.lang.Integer.valueOf(this.f36644T), java.lang.Integer.valueOf(c4130jJ0.f36644T), abstractC2648Ni0A);
        if (j$.util.Objects.equals(this.f36633I, c4130jJ0.f36633I)) {
            abstractC2794Rh0C2 = abstractC2794Rh0C2.c(java.lang.Integer.valueOf(this.f36645U), java.lang.Integer.valueOf(c4130jJ0.f36645U), abstractC2648Ni0A);
        }
        return abstractC2794Rh0C2.a();
    }
}
