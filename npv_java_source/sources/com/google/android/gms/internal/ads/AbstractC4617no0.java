package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.no0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4617no0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Lu0 f37661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4072iq0 f37662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC3633eq0 f37663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5498vp0 f37664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5058rp0 f37665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f37666f = 0;

    static {
        com.google.android.gms.internal.ads.Lu0 lu0B = com.google.android.gms.internal.ads.Kq0.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f37661a = lu0B;
        f37662b = com.google.android.gms.internal.ads.AbstractC4072iq0.b(new com.google.android.gms.internal.ads.InterfaceC3853gq0() { // from class: com.google.android.gms.internal.ads.io0
            @Override // com.google.android.gms.internal.ads.InterfaceC3853gq0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.Sl0 sl0) {
                return com.google.android.gms.internal.ads.AbstractC4617no0.d((com.google.android.gms.internal.ads.Dm0) sl0);
            }
        }, com.google.android.gms.internal.ads.Dm0.class, com.google.android.gms.internal.ads.C5830yq0.class);
        f37663c = com.google.android.gms.internal.ads.AbstractC3633eq0.b(new com.google.android.gms.internal.ads.InterfaceC3414cq0() { // from class: com.google.android.gms.internal.ads.jo0
            @Override // com.google.android.gms.internal.ads.InterfaceC3414cq0
            public final com.google.android.gms.internal.ads.Sl0 a(com.google.android.gms.internal.ads.Cq0 cq0) {
                return com.google.android.gms.internal.ads.AbstractC4617no0.b((com.google.android.gms.internal.ads.C5830yq0) cq0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5830yq0.class);
        f37664d = com.google.android.gms.internal.ads.AbstractC5498vp0.b(new com.google.android.gms.internal.ads.InterfaceC5278tp0() { // from class: com.google.android.gms.internal.ads.ko0
            @Override // com.google.android.gms.internal.ads.InterfaceC5278tp0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.El0 el0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.AbstractC4617no0.c((com.google.android.gms.internal.ads.C5602wm0) el0, wl0);
            }
        }, com.google.android.gms.internal.ads.C5602wm0.class, com.google.android.gms.internal.ads.C5720xq0.class);
        f37665e = com.google.android.gms.internal.ads.AbstractC5058rp0.b(new com.google.android.gms.internal.ads.InterfaceC4839pp0() { // from class: com.google.android.gms.internal.ads.mo0
            @Override // com.google.android.gms.internal.ads.InterfaceC4839pp0
            public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Cq0 cq0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.AbstractC4617no0.a((com.google.android.gms.internal.ads.C5720xq0) cq0, wl0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5720xq0.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5602wm0 a(com.google.android.gms.internal.ads.C5720xq0 c5720xq0, com.google.android.gms.internal.ads.Wl0 wl0) throws java.security.GeneralSecurityException {
        if (!c5720xq0.g().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.C5064rs0 c5064rs0E0 = com.google.android.gms.internal.ads.C5064rs0.e0(c5720xq0.d(), com.google.android.gms.internal.ads.C5730xv0.a());
            if (c5064rs0E0.b0() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.Am0 am0D = com.google.android.gms.internal.ads.Dm0.d();
            am0D.b(c5064rs0E0.g0().n());
            am0D.a(c5064rs0E0.f0().b0());
            am0D.c(16);
            am0D.d(f(c5720xq0.c()));
            com.google.android.gms.internal.ads.Dm0 dm0E = am0D.e();
            com.google.android.gms.internal.ads.C5382um0 c5382um0A = com.google.android.gms.internal.ads.C5602wm0.a();
            c5382um0A.c(dm0E);
            c5382um0A.b(com.google.android.gms.internal.ads.Mu0.b(c5064rs0E0.g0().d(), wl0));
            c5382um0A.a(c5720xq0.e());
            return c5382um0A.d();
        } catch (com.google.android.gms.internal.ads.Vv0 unused) {
            throw new java.security.GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.Dm0 b(com.google.android.gms.internal.ads.C5830yq0 c5830yq0) throws java.security.GeneralSecurityException {
        if (!c5830yq0.c().h0().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(c5830yq0.c().h0())));
        }
        try {
            com.google.android.gms.internal.ads.C5504vs0 c5504vs0E0 = com.google.android.gms.internal.ads.C5504vs0.e0(c5830yq0.c().g0(), com.google.android.gms.internal.ads.C5730xv0.a());
            com.google.android.gms.internal.ads.Am0 am0D = com.google.android.gms.internal.ads.Dm0.d();
            am0D.b(c5504vs0E0.b0());
            am0D.a(c5504vs0E0.f0().b0());
            am0D.c(16);
            am0D.d(f(c5830yq0.c().f0()));
            return am0D.e();
        } catch (com.google.android.gms.internal.ads.Vv0 e6) {
            throw new java.security.GeneralSecurityException("Parsing AesEaxParameters failed: ", e6);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5720xq0 c(com.google.android.gms.internal.ads.C5602wm0 c5602wm0, com.google.android.gms.internal.ads.Wl0 wl0) {
        com.google.android.gms.internal.ads.C4845ps0 c4845ps0C0 = com.google.android.gms.internal.ads.C5064rs0.c0();
        c4845ps0C0.A(g(c5602wm0.b()));
        byte[] bArrD = c5602wm0.d().d(wl0);
        c4845ps0C0.z(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArrD, 0, bArrD.length));
        return com.google.android.gms.internal.ads.C5720xq0.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((com.google.android.gms.internal.ads.C5064rs0) c4845ps0C0.u()).g(), com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, h(c5602wm0.b().e()), c5602wm0.e());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5830yq0 d(com.google.android.gms.internal.ads.Dm0 dm0) {
        com.google.android.gms.internal.ads.C3969ht0 c3969ht0B0 = com.google.android.gms.internal.ads.C4187jt0.b0();
        c3969ht0B0.A("type.googleapis.com/google.crypto.tink.AesEaxKey");
        com.google.android.gms.internal.ads.C5284ts0 c5284ts0C0 = com.google.android.gms.internal.ads.C5504vs0.c0();
        c5284ts0C0.A(g(dm0));
        c5284ts0C0.z(dm0.c());
        c3969ht0B0.B(((com.google.android.gms.internal.ads.C5504vs0) c5284ts0C0.u()).g());
        c3969ht0B0.z(h(dm0.e()));
        return com.google.android.gms.internal.ads.C5830yq0.b((com.google.android.gms.internal.ads.C4187jt0) c3969ht0B0.u());
    }

    public static void e(com.google.android.gms.internal.ads.Zp0 zp0) {
        zp0.i(f37662b);
        zp0.h(f37663c);
        zp0.g(f37664d);
        zp0.f(f37665e);
    }

    private static com.google.android.gms.internal.ads.Bm0 f(com.google.android.gms.internal.ads.Kt0 kt0) throws java.security.GeneralSecurityException {
        int iOrdinal = kt0.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.Bm0.f26015b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return com.google.android.gms.internal.ads.Bm0.f26017d;
            }
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + kt0.a());
            }
        }
        return com.google.android.gms.internal.ads.Bm0.f26016c;
    }

    private static com.google.android.gms.internal.ads.C5834ys0 g(com.google.android.gms.internal.ads.Dm0 dm0) {
        com.google.android.gms.internal.ads.C5614ws0 c5614ws0C0 = com.google.android.gms.internal.ads.C5834ys0.c0();
        c5614ws0C0.z(dm0.b());
        return (com.google.android.gms.internal.ads.C5834ys0) c5614ws0C0.u();
    }

    private static com.google.android.gms.internal.ads.Kt0 h(com.google.android.gms.internal.ads.Bm0 bm0) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.Bm0.f26015b.equals(bm0)) {
            return com.google.android.gms.internal.ads.Kt0.TINK;
        }
        if (com.google.android.gms.internal.ads.Bm0.f26016c.equals(bm0)) {
            return com.google.android.gms.internal.ads.Kt0.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.Bm0.f26017d.equals(bm0)) {
            return com.google.android.gms.internal.ads.Kt0.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(bm0)));
    }
}
