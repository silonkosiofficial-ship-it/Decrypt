package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5494vn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Lu0 f39453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4072iq0 f39454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC3633eq0 f39455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5498vp0 f39456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5058rp0 f39457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f39458f = 0;

    static {
        com.google.android.gms.internal.ads.Lu0 lu0B = com.google.android.gms.internal.ads.Kq0.b("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f39453a = lu0B;
        f39454b = com.google.android.gms.internal.ads.AbstractC4072iq0.b(new com.google.android.gms.internal.ads.InterfaceC3853gq0() { // from class: com.google.android.gms.internal.ads.rn0
            @Override // com.google.android.gms.internal.ads.InterfaceC3853gq0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.Sl0 sl0) {
                return com.google.android.gms.internal.ads.AbstractC5494vn0.d((com.google.android.gms.internal.ads.C4945qn0) sl0);
            }
        }, com.google.android.gms.internal.ads.C4945qn0.class, com.google.android.gms.internal.ads.C5830yq0.class);
        f39455c = com.google.android.gms.internal.ads.AbstractC3633eq0.b(new com.google.android.gms.internal.ads.InterfaceC3414cq0() { // from class: com.google.android.gms.internal.ads.sn0
            @Override // com.google.android.gms.internal.ads.InterfaceC3414cq0
            public final com.google.android.gms.internal.ads.Sl0 a(com.google.android.gms.internal.ads.Cq0 cq0) {
                return com.google.android.gms.internal.ads.AbstractC5494vn0.b((com.google.android.gms.internal.ads.C5830yq0) cq0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5830yq0.class);
        f39456d = com.google.android.gms.internal.ads.AbstractC5498vp0.b(new com.google.android.gms.internal.ads.InterfaceC5278tp0() { // from class: com.google.android.gms.internal.ads.tn0
            @Override // com.google.android.gms.internal.ads.InterfaceC5278tp0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.El0 el0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.AbstractC5494vn0.c((com.google.android.gms.internal.ads.C4725on0) el0, wl0);
            }
        }, com.google.android.gms.internal.ads.C4725on0.class, com.google.android.gms.internal.ads.C5720xq0.class);
        f39457e = com.google.android.gms.internal.ads.AbstractC5058rp0.b(new com.google.android.gms.internal.ads.InterfaceC4839pp0() { // from class: com.google.android.gms.internal.ads.un0
            @Override // com.google.android.gms.internal.ads.InterfaceC4839pp0
            public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Cq0 cq0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.AbstractC5494vn0.a((com.google.android.gms.internal.ads.C5720xq0) cq0, wl0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5720xq0.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C4725on0 a(com.google.android.gms.internal.ads.C5720xq0 c5720xq0, com.google.android.gms.internal.ads.Wl0 wl0) throws java.security.GeneralSecurityException {
        if (!c5720xq0.g().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.At0 at0E0 = com.google.android.gms.internal.ads.At0.e0(c5720xq0.d(), com.google.android.gms.internal.ads.C5730xv0.a());
            if (at0E0.b0() == 0) {
                return com.google.android.gms.internal.ads.C4725on0.a(com.google.android.gms.internal.ads.C4945qn0.c(at0E0.f0().f0(), f(c5720xq0.c())), c5720xq0.e());
            }
            throw new java.security.GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + java.lang.String.valueOf(at0E0));
        } catch (com.google.android.gms.internal.ads.Vv0 e6) {
            throw new java.security.GeneralSecurityException("Parsing KmsAeadKey failed: ", e6);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C4945qn0 b(com.google.android.gms.internal.ads.C5830yq0 c5830yq0) throws java.security.GeneralSecurityException {
        if (!c5830yq0.c().h0().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(c5830yq0.c().h0())));
        }
        try {
            return com.google.android.gms.internal.ads.C4945qn0.c(com.google.android.gms.internal.ads.Dt0.e0(c5830yq0.c().g0(), com.google.android.gms.internal.ads.C5730xv0.a()).f0(), f(c5830yq0.c().f0()));
        } catch (com.google.android.gms.internal.ads.Vv0 e6) {
            throw new java.security.GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e6);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5720xq0 c(com.google.android.gms.internal.ads.C4725on0 c4725on0, com.google.android.gms.internal.ads.Wl0 wl0) {
        com.google.android.gms.internal.ads.C5836yt0 c5836yt0C0 = com.google.android.gms.internal.ads.At0.c0();
        com.google.android.gms.internal.ads.Bt0 bt0B0 = com.google.android.gms.internal.ads.Dt0.b0();
        bt0B0.z(c4725on0.b().d());
        c5836yt0C0.z((com.google.android.gms.internal.ads.Dt0) bt0B0.u());
        return com.google.android.gms.internal.ads.C5720xq0.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((com.google.android.gms.internal.ads.At0) c5836yt0C0.u()).g(), com.google.android.gms.internal.ads.EnumC3529dt0.REMOTE, g(c4725on0.b().b()), c4725on0.c());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5830yq0 d(com.google.android.gms.internal.ads.C4945qn0 c4945qn0) {
        com.google.android.gms.internal.ads.C3969ht0 c3969ht0B0 = com.google.android.gms.internal.ads.C4187jt0.b0();
        c3969ht0B0.A("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        com.google.android.gms.internal.ads.Bt0 bt0B0 = com.google.android.gms.internal.ads.Dt0.b0();
        bt0B0.z(c4945qn0.d());
        c3969ht0B0.B(((com.google.android.gms.internal.ads.Dt0) bt0B0.u()).g());
        c3969ht0B0.z(g(c4945qn0.b()));
        return com.google.android.gms.internal.ads.C5830yq0.b((com.google.android.gms.internal.ads.C4187jt0) c3969ht0B0.u());
    }

    public static void e(com.google.android.gms.internal.ads.Zp0 zp0) {
        zp0.i(f39454b);
        zp0.h(f39455c);
        zp0.g(f39456d);
        zp0.f(f39457e);
    }

    private static com.google.android.gms.internal.ads.C4835pn0 f(com.google.android.gms.internal.ads.Kt0 kt0) throws java.security.GeneralSecurityException {
        int iOrdinal = kt0.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.C4835pn0.f38075b;
        }
        if (iOrdinal == 3) {
            return com.google.android.gms.internal.ads.C4835pn0.f38076c;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + kt0.a());
    }

    private static com.google.android.gms.internal.ads.Kt0 g(com.google.android.gms.internal.ads.C4835pn0 c4835pn0) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.C4835pn0.f38075b.equals(c4835pn0)) {
            return com.google.android.gms.internal.ads.Kt0.TINK;
        }
        if (com.google.android.gms.internal.ads.C4835pn0.f38076c.equals(c4835pn0)) {
            return com.google.android.gms.internal.ads.Kt0.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(c4835pn0.toString()));
    }
}
