package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5936zo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Lu0 f40396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4072iq0 f40397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC3633eq0 f40398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5498vp0 f40399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5058rp0 f40400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f40401f = 0;

    static {
        com.google.android.gms.internal.ads.Lu0 lu0B = com.google.android.gms.internal.ads.Kq0.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f40396a = lu0B;
        f40397b = com.google.android.gms.internal.ads.AbstractC4072iq0.b(new com.google.android.gms.internal.ads.InterfaceC3853gq0() { // from class: com.google.android.gms.internal.ads.vo0
            @Override // com.google.android.gms.internal.ads.InterfaceC3853gq0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.Sl0 sl0) {
                return com.google.android.gms.internal.ads.AbstractC5936zo0.d((com.google.android.gms.internal.ads.C3189an0) sl0);
            }
        }, com.google.android.gms.internal.ads.C3189an0.class, com.google.android.gms.internal.ads.C5830yq0.class);
        f40398c = com.google.android.gms.internal.ads.AbstractC3633eq0.b(new com.google.android.gms.internal.ads.InterfaceC3414cq0() { // from class: com.google.android.gms.internal.ads.wo0
            @Override // com.google.android.gms.internal.ads.InterfaceC3414cq0
            public final com.google.android.gms.internal.ads.Sl0 a(com.google.android.gms.internal.ads.Cq0 cq0) {
                return com.google.android.gms.internal.ads.AbstractC5936zo0.b((com.google.android.gms.internal.ads.C5830yq0) cq0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5830yq0.class);
        f40399d = com.google.android.gms.internal.ads.AbstractC5498vp0.b(new com.google.android.gms.internal.ads.InterfaceC5278tp0() { // from class: com.google.android.gms.internal.ads.xo0
            @Override // com.google.android.gms.internal.ads.InterfaceC5278tp0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.El0 el0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.AbstractC5936zo0.c((com.google.android.gms.internal.ads.Sm0) el0, wl0);
            }
        }, com.google.android.gms.internal.ads.Sm0.class, com.google.android.gms.internal.ads.C5720xq0.class);
        f40400e = com.google.android.gms.internal.ads.AbstractC5058rp0.b(new com.google.android.gms.internal.ads.InterfaceC4839pp0() { // from class: com.google.android.gms.internal.ads.yo0
            @Override // com.google.android.gms.internal.ads.InterfaceC4839pp0
            public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Cq0 cq0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.AbstractC5936zo0.a((com.google.android.gms.internal.ads.C5720xq0) cq0, wl0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5720xq0.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.Sm0 a(com.google.android.gms.internal.ads.C5720xq0 c5720xq0, com.google.android.gms.internal.ads.Wl0 wl0) throws java.security.GeneralSecurityException {
        if (!c5720xq0.g().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.Hs0 hs0E0 = com.google.android.gms.internal.ads.Hs0.e0(c5720xq0.d(), com.google.android.gms.internal.ads.C5730xv0.a());
            if (hs0E0.b0() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.Xm0 xm0C = com.google.android.gms.internal.ads.C3189an0.c();
            xm0C.a(hs0E0.f0().n());
            xm0C.b(f(c5720xq0.c()));
            com.google.android.gms.internal.ads.C3189an0 c3189an0C = xm0C.c();
            com.google.android.gms.internal.ads.Qm0 qm0A = com.google.android.gms.internal.ads.Sm0.a();
            qm0A.c(c3189an0C);
            qm0A.b(com.google.android.gms.internal.ads.Mu0.b(hs0E0.f0().d(), wl0));
            qm0A.a(c5720xq0.e());
            return qm0A.d();
        } catch (com.google.android.gms.internal.ads.Vv0 unused) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C3189an0 b(com.google.android.gms.internal.ads.C5830yq0 c5830yq0) throws java.security.GeneralSecurityException {
        if (!c5830yq0.c().h0().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(c5830yq0.c().h0())));
        }
        try {
            com.google.android.gms.internal.ads.Ks0 ks0F0 = com.google.android.gms.internal.ads.Ks0.f0(c5830yq0.c().g0(), com.google.android.gms.internal.ads.C5730xv0.a());
            if (ks0F0.c0() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
            }
            com.google.android.gms.internal.ads.Xm0 xm0C = com.google.android.gms.internal.ads.C3189an0.c();
            xm0C.a(ks0F0.b0());
            xm0C.b(f(c5830yq0.c().f0()));
            return xm0C.c();
        } catch (com.google.android.gms.internal.ads.Vv0 e6) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e6);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5720xq0 c(com.google.android.gms.internal.ads.Sm0 sm0, com.google.android.gms.internal.ads.Wl0 wl0) {
        com.google.android.gms.internal.ads.Fs0 fs0C0 = com.google.android.gms.internal.ads.Hs0.c0();
        byte[] bArrD = sm0.d().d(wl0);
        fs0C0.z(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArrD, 0, bArrD.length));
        return com.google.android.gms.internal.ads.C5720xq0.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((com.google.android.gms.internal.ads.Hs0) fs0C0.u()).g(), com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, g(sm0.b().d()), sm0.e());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5830yq0 d(com.google.android.gms.internal.ads.C3189an0 c3189an0) {
        com.google.android.gms.internal.ads.C3969ht0 c3969ht0B0 = com.google.android.gms.internal.ads.C4187jt0.b0();
        c3969ht0B0.A("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        com.google.android.gms.internal.ads.Is0 is0D0 = com.google.android.gms.internal.ads.Ks0.d0();
        is0D0.z(c3189an0.b());
        c3969ht0B0.B(((com.google.android.gms.internal.ads.Ks0) is0D0.u()).g());
        c3969ht0B0.z(g(c3189an0.d()));
        return com.google.android.gms.internal.ads.C5830yq0.b((com.google.android.gms.internal.ads.C4187jt0) c3969ht0B0.u());
    }

    public static void e(com.google.android.gms.internal.ads.Zp0 zp0) {
        zp0.i(f40397b);
        zp0.h(f40398c);
        zp0.g(f40399d);
        zp0.f(f40400e);
    }

    private static com.google.android.gms.internal.ads.Ym0 f(com.google.android.gms.internal.ads.Kt0 kt0) throws java.security.GeneralSecurityException {
        int iOrdinal = kt0.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.Ym0.f33404b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return com.google.android.gms.internal.ads.Ym0.f33406d;
            }
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + kt0.a());
            }
        }
        return com.google.android.gms.internal.ads.Ym0.f33405c;
    }

    private static com.google.android.gms.internal.ads.Kt0 g(com.google.android.gms.internal.ads.Ym0 ym0) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.Ym0.f33404b.equals(ym0)) {
            return com.google.android.gms.internal.ads.Kt0.TINK;
        }
        if (com.google.android.gms.internal.ads.Ym0.f33405c.equals(ym0)) {
            return com.google.android.gms.internal.ads.Kt0.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.Ym0.f33406d.equals(ym0)) {
            return com.google.android.gms.internal.ads.Kt0.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(ym0)));
    }
}
