package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Gn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Lu0 f27883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4072iq0 f27884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC3633eq0 f27885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5498vp0 f27886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5058rp0 f27887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27888f = 0;

    static {
        com.google.android.gms.internal.ads.Lu0 lu0B = com.google.android.gms.internal.ads.Kq0.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f27883a = lu0B;
        f27884b = com.google.android.gms.internal.ads.AbstractC4072iq0.b(new com.google.android.gms.internal.ads.InterfaceC3853gq0() { // from class: com.google.android.gms.internal.ads.Cn0
            @Override // com.google.android.gms.internal.ads.InterfaceC3853gq0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.Sl0 sl0) {
                return com.google.android.gms.internal.ads.Gn0.d((com.google.android.gms.internal.ads.Bn0) sl0);
            }
        }, com.google.android.gms.internal.ads.Bn0.class, com.google.android.gms.internal.ads.C5830yq0.class);
        f27885c = com.google.android.gms.internal.ads.AbstractC3633eq0.b(new com.google.android.gms.internal.ads.InterfaceC3414cq0() { // from class: com.google.android.gms.internal.ads.Dn0
            @Override // com.google.android.gms.internal.ads.InterfaceC3414cq0
            public final com.google.android.gms.internal.ads.Sl0 a(com.google.android.gms.internal.ads.Cq0 cq0) {
                return com.google.android.gms.internal.ads.Gn0.b((com.google.android.gms.internal.ads.C5830yq0) cq0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5830yq0.class);
        f27886d = com.google.android.gms.internal.ads.AbstractC5498vp0.b(new com.google.android.gms.internal.ads.InterfaceC5278tp0() { // from class: com.google.android.gms.internal.ads.En0
            @Override // com.google.android.gms.internal.ads.InterfaceC5278tp0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.El0 el0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.Gn0.c((com.google.android.gms.internal.ads.C5604wn0) el0, wl0);
            }
        }, com.google.android.gms.internal.ads.C5604wn0.class, com.google.android.gms.internal.ads.C5720xq0.class);
        f27887e = com.google.android.gms.internal.ads.AbstractC5058rp0.b(new com.google.android.gms.internal.ads.InterfaceC4839pp0() { // from class: com.google.android.gms.internal.ads.Fn0
            @Override // com.google.android.gms.internal.ads.InterfaceC4839pp0
            public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Cq0 cq0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.Gn0.a((com.google.android.gms.internal.ads.C5720xq0) cq0, wl0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5720xq0.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5604wn0 a(com.google.android.gms.internal.ads.C5720xq0 c5720xq0, com.google.android.gms.internal.ads.Wl0 wl0) throws java.security.GeneralSecurityException {
        if (!c5720xq0.g().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.Gt0 gt0E0 = com.google.android.gms.internal.ads.Gt0.e0(c5720xq0.d(), com.google.android.gms.internal.ads.C5730xv0.a());
            if (gt0E0.b0() == 0) {
                return com.google.android.gms.internal.ads.C5604wn0.a(f(gt0E0.f0(), c5720xq0.c()), c5720xq0.e());
            }
            throw new java.security.GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + java.lang.String.valueOf(gt0E0));
        } catch (com.google.android.gms.internal.ads.Vv0 e6) {
            throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e6);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.Bn0 b(com.google.android.gms.internal.ads.C5830yq0 c5830yq0) throws java.security.GeneralSecurityException {
        if (!c5830yq0.c().h0().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(c5830yq0.c().h0())));
        }
        try {
            return f(com.google.android.gms.internal.ads.Jt0.f0(c5830yq0.c().g0(), com.google.android.gms.internal.ads.C5730xv0.a()), c5830yq0.c().f0());
        } catch (com.google.android.gms.internal.ads.Vv0 e6) {
            throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e6);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5720xq0 c(com.google.android.gms.internal.ads.C5604wn0 c5604wn0, com.google.android.gms.internal.ads.Wl0 wl0) {
        com.google.android.gms.internal.ads.Et0 et0C0 = com.google.android.gms.internal.ads.Gt0.c0();
        et0C0.z(g(c5604wn0.b()));
        return com.google.android.gms.internal.ads.C5720xq0.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((com.google.android.gms.internal.ads.Gt0) et0C0.u()).g(), com.google.android.gms.internal.ads.EnumC3529dt0.REMOTE, h(c5604wn0.b().c()), c5604wn0.c());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5830yq0 d(com.google.android.gms.internal.ads.Bn0 bn0) {
        com.google.android.gms.internal.ads.C3969ht0 c3969ht0B0 = com.google.android.gms.internal.ads.C4187jt0.b0();
        c3969ht0B0.A("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        c3969ht0B0.B(g(bn0).g());
        c3969ht0B0.z(h(bn0.c()));
        return com.google.android.gms.internal.ads.C5830yq0.b((com.google.android.gms.internal.ads.C4187jt0) c3969ht0B0.u());
    }

    public static void e(com.google.android.gms.internal.ads.Zp0 zp0) {
        zp0.i(f27884b);
        zp0.h(f27885c);
        zp0.g(f27886d);
        zp0.f(f27887e);
    }

    private static com.google.android.gms.internal.ads.Bn0 f(com.google.android.gms.internal.ads.Jt0 jt0, com.google.android.gms.internal.ads.Kt0 kt0) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.C5824yn0 c5824yn0;
        com.google.android.gms.internal.ads.C5934zn0 c5934zn0;
        com.google.android.gms.internal.ads.C3969ht0 c3969ht0B0 = com.google.android.gms.internal.ads.C4187jt0.b0();
        c3969ht0B0.A(jt0.b0().h0());
        c3969ht0B0.B(jt0.b0().g0());
        c3969ht0B0.z(com.google.android.gms.internal.ads.Kt0.RAW);
        com.google.android.gms.internal.ads.Sl0 sl0A = com.google.android.gms.internal.ads.Yl0.a(((com.google.android.gms.internal.ads.C4187jt0) c3969ht0B0.u()).l());
        if (sl0A instanceof com.google.android.gms.internal.ads.Pm0) {
            c5824yn0 = com.google.android.gms.internal.ads.C5824yn0.f40134b;
        } else if (sl0A instanceof com.google.android.gms.internal.ads.C3847gn0) {
            c5824yn0 = com.google.android.gms.internal.ads.C5824yn0.f40136d;
        } else if (sl0A instanceof com.google.android.gms.internal.ads.C3410co0) {
            c5824yn0 = com.google.android.gms.internal.ads.C5824yn0.f40135c;
        } else if (sl0A instanceof com.google.android.gms.internal.ads.C5272tm0) {
            c5824yn0 = com.google.android.gms.internal.ads.C5824yn0.f40137e;
        } else if (sl0A instanceof com.google.android.gms.internal.ads.Dm0) {
            c5824yn0 = com.google.android.gms.internal.ads.C5824yn0.f40138f;
        } else {
            if (!(sl0A instanceof com.google.android.gms.internal.ads.C3189an0)) {
                throw new java.security.GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(sl0A.toString()));
            }
            c5824yn0 = com.google.android.gms.internal.ads.C5824yn0.f40139g;
        }
        com.google.android.gms.internal.ads.C5714xn0 c5714xn0 = new com.google.android.gms.internal.ads.C5714xn0(null);
        int iOrdinal = kt0.ordinal();
        if (iOrdinal == 1) {
            c5934zn0 = com.google.android.gms.internal.ads.C5934zn0.f40393b;
        } else {
            if (iOrdinal != 3) {
                throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + kt0.a());
            }
            c5934zn0 = com.google.android.gms.internal.ads.C5934zn0.f40394c;
        }
        c5714xn0.d(c5934zn0);
        c5714xn0.c(jt0.g0());
        c5714xn0.a((com.google.android.gms.internal.ads.AbstractC3406cm0) sl0A);
        c5714xn0.b(c5824yn0);
        return c5714xn0.e();
    }

    private static com.google.android.gms.internal.ads.Jt0 g(com.google.android.gms.internal.ads.Bn0 bn0) throws java.security.GeneralSecurityException {
        try {
            com.google.android.gms.internal.ads.C4187jt0 c4187jt0E0 = com.google.android.gms.internal.ads.C4187jt0.e0(com.google.android.gms.internal.ads.Yl0.b(bn0.b()), com.google.android.gms.internal.ads.C5730xv0.a());
            com.google.android.gms.internal.ads.Ht0 ht0C0 = com.google.android.gms.internal.ads.Jt0.c0();
            ht0C0.A(bn0.d());
            ht0C0.z(c4187jt0E0);
            return (com.google.android.gms.internal.ads.Jt0) ht0C0.u();
        } catch (com.google.android.gms.internal.ads.Vv0 e6) {
            throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e6);
        }
    }

    private static com.google.android.gms.internal.ads.Kt0 h(com.google.android.gms.internal.ads.C5934zn0 c5934zn0) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.C5934zn0.f40393b.equals(c5934zn0)) {
            return com.google.android.gms.internal.ads.Kt0.TINK;
        }
        if (com.google.android.gms.internal.ads.C5934zn0.f40394c.equals(c5934zn0)) {
            return com.google.android.gms.internal.ads.Kt0.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(c5934zn0)));
    }
}
