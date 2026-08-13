package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Gr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Lu0 f27905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4072iq0 f27906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC3633eq0 f27907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5498vp0 f27908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5058rp0 f27909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27910f = 0;

    static {
        com.google.android.gms.internal.ads.Lu0 lu0B = com.google.android.gms.internal.ads.Kq0.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f27905a = lu0B;
        f27906b = com.google.android.gms.internal.ads.AbstractC4072iq0.b(new com.google.android.gms.internal.ads.InterfaceC3853gq0() { // from class: com.google.android.gms.internal.ads.Cr0
            @Override // com.google.android.gms.internal.ads.InterfaceC3853gq0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.Sl0 sl0) {
                return com.google.android.gms.internal.ads.Gr0.b((com.google.android.gms.internal.ads.Wq0) sl0);
            }
        }, com.google.android.gms.internal.ads.Wq0.class, com.google.android.gms.internal.ads.C5830yq0.class);
        f27907c = com.google.android.gms.internal.ads.AbstractC3633eq0.b(new com.google.android.gms.internal.ads.InterfaceC3414cq0() { // from class: com.google.android.gms.internal.ads.Dr0
            @Override // com.google.android.gms.internal.ads.InterfaceC3414cq0
            public final com.google.android.gms.internal.ads.Sl0 a(com.google.android.gms.internal.ads.Cq0 cq0) {
                return com.google.android.gms.internal.ads.Gr0.d((com.google.android.gms.internal.ads.C5830yq0) cq0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5830yq0.class);
        f27908d = com.google.android.gms.internal.ads.AbstractC5498vp0.b(new com.google.android.gms.internal.ads.InterfaceC5278tp0() { // from class: com.google.android.gms.internal.ads.Er0
            @Override // com.google.android.gms.internal.ads.InterfaceC5278tp0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.El0 el0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.Gr0.a((com.google.android.gms.internal.ads.Nq0) el0, wl0);
            }
        }, com.google.android.gms.internal.ads.Nq0.class, com.google.android.gms.internal.ads.C5720xq0.class);
        f27909e = com.google.android.gms.internal.ads.AbstractC5058rp0.b(new com.google.android.gms.internal.ads.InterfaceC4839pp0() { // from class: com.google.android.gms.internal.ads.Fr0
            @Override // com.google.android.gms.internal.ads.InterfaceC4839pp0
            public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Cq0 cq0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.Gr0.c((com.google.android.gms.internal.ads.C5720xq0) cq0, wl0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5720xq0.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5720xq0 a(com.google.android.gms.internal.ads.Nq0 nq0, com.google.android.gms.internal.ads.Wl0 wl0) {
        com.google.android.gms.internal.ads.Rr0 rr0C0 = com.google.android.gms.internal.ads.Tr0.c0();
        rr0C0.A(g(nq0.b()));
        byte[] bArrD = nq0.d().d(wl0);
        rr0C0.z(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArrD, 0, bArrD.length));
        return com.google.android.gms.internal.ads.C5720xq0.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((com.google.android.gms.internal.ads.Tr0) rr0C0.u()).g(), com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, h(nq0.b().f()), nq0.e());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5830yq0 b(com.google.android.gms.internal.ads.Wq0 wq0) {
        com.google.android.gms.internal.ads.C3969ht0 c3969ht0B0 = com.google.android.gms.internal.ads.C4187jt0.b0();
        c3969ht0B0.A("type.googleapis.com/google.crypto.tink.AesCmacKey");
        com.google.android.gms.internal.ads.Ur0 ur0C0 = com.google.android.gms.internal.ads.Wr0.c0();
        ur0C0.A(g(wq0));
        ur0C0.z(wq0.c());
        c3969ht0B0.B(((com.google.android.gms.internal.ads.Wr0) ur0C0.u()).g());
        c3969ht0B0.z(h(wq0.f()));
        return com.google.android.gms.internal.ads.C5830yq0.b((com.google.android.gms.internal.ads.C4187jt0) c3969ht0B0.u());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.Nq0 c(com.google.android.gms.internal.ads.C5720xq0 c5720xq0, com.google.android.gms.internal.ads.Wl0 wl0) throws java.security.GeneralSecurityException {
        if (!c5720xq0.g().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.Tr0 tr0E0 = com.google.android.gms.internal.ads.Tr0.e0(c5720xq0.d(), com.google.android.gms.internal.ads.C5730xv0.a());
            if (tr0E0.b0() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.Tq0 tq0E = com.google.android.gms.internal.ads.Wq0.e();
            tq0E.a(tr0E0.g0().n());
            tq0E.b(tr0E0.f0().b0());
            tq0E.c(f(c5720xq0.c()));
            com.google.android.gms.internal.ads.Wq0 wq0D = tq0E.d();
            com.google.android.gms.internal.ads.Lq0 lq0A = com.google.android.gms.internal.ads.Nq0.a();
            lq0A.c(wq0D);
            lq0A.a(com.google.android.gms.internal.ads.Mu0.b(tr0E0.g0().d(), wl0));
            lq0A.b(c5720xq0.e());
            return lq0A.d();
        } catch (com.google.android.gms.internal.ads.Vv0 | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.Wq0 d(com.google.android.gms.internal.ads.C5830yq0 c5830yq0) throws java.security.GeneralSecurityException {
        if (!c5830yq0.c().h0().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(c5830yq0.c().h0())));
        }
        try {
            com.google.android.gms.internal.ads.Wr0 wr0E0 = com.google.android.gms.internal.ads.Wr0.e0(c5830yq0.c().g0(), com.google.android.gms.internal.ads.C5730xv0.a());
            com.google.android.gms.internal.ads.Tq0 tq0E = com.google.android.gms.internal.ads.Wq0.e();
            tq0E.a(wr0E0.b0());
            tq0E.b(wr0E0.f0().b0());
            tq0E.c(f(c5830yq0.c().f0()));
            return tq0E.d();
        } catch (com.google.android.gms.internal.ads.Vv0 e6) {
            throw new java.security.GeneralSecurityException("Parsing AesCmacParameters failed: ", e6);
        }
    }

    public static void e(com.google.android.gms.internal.ads.Zp0 zp0) {
        zp0.i(f27906b);
        zp0.h(f27907c);
        zp0.g(f27908d);
        zp0.f(f27909e);
    }

    private static com.google.android.gms.internal.ads.Uq0 f(com.google.android.gms.internal.ads.Kt0 kt0) throws java.security.GeneralSecurityException {
        int iOrdinal = kt0.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.Uq0.f32288b;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Uq0.f32290d;
        }
        if (iOrdinal == 3) {
            return com.google.android.gms.internal.ads.Uq0.f32291e;
        }
        if (iOrdinal == 4) {
            return com.google.android.gms.internal.ads.Uq0.f32289c;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + kt0.a());
    }

    private static com.google.android.gms.internal.ads.Zr0 g(com.google.android.gms.internal.ads.Wq0 wq0) {
        com.google.android.gms.internal.ads.Xr0 xr0C0 = com.google.android.gms.internal.ads.Zr0.c0();
        xr0C0.z(wq0.b());
        return (com.google.android.gms.internal.ads.Zr0) xr0C0.u();
    }

    private static com.google.android.gms.internal.ads.Kt0 h(com.google.android.gms.internal.ads.Uq0 uq0) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.Uq0.f32288b.equals(uq0)) {
            return com.google.android.gms.internal.ads.Kt0.TINK;
        }
        if (com.google.android.gms.internal.ads.Uq0.f32289c.equals(uq0)) {
            return com.google.android.gms.internal.ads.Kt0.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.Uq0.f32291e.equals(uq0)) {
            return com.google.android.gms.internal.ads.Kt0.RAW;
        }
        if (com.google.android.gms.internal.ads.Uq0.f32290d.equals(uq0)) {
            return com.google.android.gms.internal.ads.Kt0.LEGACY;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(uq0)));
    }
}
