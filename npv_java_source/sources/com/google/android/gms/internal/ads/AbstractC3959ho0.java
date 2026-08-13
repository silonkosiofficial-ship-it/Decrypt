package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ho0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3959ho0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Lu0 f36133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4072iq0 f36134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC3633eq0 f36135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5498vp0 f36136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5058rp0 f36137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f36138f = 0;

    static {
        com.google.android.gms.internal.ads.Lu0 lu0B = com.google.android.gms.internal.ads.Kq0.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f36133a = lu0B;
        f36134b = com.google.android.gms.internal.ads.AbstractC4072iq0.b(new com.google.android.gms.internal.ads.InterfaceC3853gq0() { // from class: com.google.android.gms.internal.ads.do0
            @Override // com.google.android.gms.internal.ads.InterfaceC3853gq0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.Sl0 sl0) {
                return com.google.android.gms.internal.ads.AbstractC3959ho0.d((com.google.android.gms.internal.ads.C5272tm0) sl0);
            }
        }, com.google.android.gms.internal.ads.C5272tm0.class, com.google.android.gms.internal.ads.C5830yq0.class);
        f36135c = com.google.android.gms.internal.ads.AbstractC3633eq0.b(new com.google.android.gms.internal.ads.InterfaceC3414cq0() { // from class: com.google.android.gms.internal.ads.eo0
            @Override // com.google.android.gms.internal.ads.InterfaceC3414cq0
            public final com.google.android.gms.internal.ads.Sl0 a(com.google.android.gms.internal.ads.Cq0 cq0) {
                return com.google.android.gms.internal.ads.AbstractC3959ho0.b((com.google.android.gms.internal.ads.C5830yq0) cq0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5830yq0.class);
        f36136d = com.google.android.gms.internal.ads.AbstractC5498vp0.b(new com.google.android.gms.internal.ads.InterfaceC5278tp0() { // from class: com.google.android.gms.internal.ads.fo0
            @Override // com.google.android.gms.internal.ads.InterfaceC5278tp0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.El0 el0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.AbstractC3959ho0.c((com.google.android.gms.internal.ads.C4283km0) el0, wl0);
            }
        }, com.google.android.gms.internal.ads.C4283km0.class, com.google.android.gms.internal.ads.C5720xq0.class);
        f36137e = com.google.android.gms.internal.ads.AbstractC5058rp0.b(new com.google.android.gms.internal.ads.InterfaceC4839pp0() { // from class: com.google.android.gms.internal.ads.go0
            @Override // com.google.android.gms.internal.ads.InterfaceC4839pp0
            public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Cq0 cq0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.AbstractC3959ho0.a((com.google.android.gms.internal.ads.C5720xq0) cq0, wl0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5720xq0.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C4283km0 a(com.google.android.gms.internal.ads.C5720xq0 c5720xq0, com.google.android.gms.internal.ads.Wl0 wl0) throws java.security.GeneralSecurityException {
        if (!c5720xq0.g().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.C3418cs0 c3418cs0E0 = com.google.android.gms.internal.ads.C3418cs0.e0(c5720xq0.d(), com.google.android.gms.internal.ads.C5730xv0.a());
            if (c3418cs0E0.b0() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (c3418cs0E0.f0().b0() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (c3418cs0E0.g0().b0() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            com.google.android.gms.internal.ads.C4833pm0 c4833pm0F = com.google.android.gms.internal.ads.C5272tm0.f();
            c4833pm0F.a(c3418cs0E0.f0().g0().n());
            c4833pm0F.c(c3418cs0E0.g0().h0().n());
            c4833pm0F.d(c3418cs0E0.f0().f0().b0());
            c4833pm0F.e(c3418cs0E0.g0().g0().b0());
            c4833pm0F.b(f(c3418cs0E0.g0().g0().c0()));
            c4833pm0F.f(g(c5720xq0.c()));
            com.google.android.gms.internal.ads.C5272tm0 c5272tm0G = c4833pm0F.g();
            com.google.android.gms.internal.ads.C3955hm0 c3955hm0A = com.google.android.gms.internal.ads.C4283km0.a();
            c3955hm0A.d(c5272tm0G);
            c3955hm0A.a(com.google.android.gms.internal.ads.Mu0.b(c3418cs0E0.f0().g0().d(), wl0));
            c3955hm0A.b(com.google.android.gms.internal.ads.Mu0.b(c3418cs0E0.g0().h0().d(), wl0));
            c3955hm0A.c(c5720xq0.e());
            return c3955hm0A.e();
        } catch (com.google.android.gms.internal.ads.Vv0 unused) {
            throw new java.security.GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5272tm0 b(com.google.android.gms.internal.ads.C5830yq0 c5830yq0) throws java.security.GeneralSecurityException {
        if (!c5830yq0.c().h0().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(c5830yq0.c().h0())));
        }
        try {
            com.google.android.gms.internal.ads.C3747fs0 c3747fs0D0 = com.google.android.gms.internal.ads.C3747fs0.d0(c5830yq0.c().g0(), com.google.android.gms.internal.ads.C5730xv0.a());
            if (c3747fs0D0.f0().c0() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.C4833pm0 c4833pm0F = com.google.android.gms.internal.ads.C5272tm0.f();
            c4833pm0F.a(c3747fs0D0.e0().b0());
            c4833pm0F.c(c3747fs0D0.f0().b0());
            c4833pm0F.d(c3747fs0D0.e0().f0().b0());
            c4833pm0F.e(c3747fs0D0.f0().h0().b0());
            c4833pm0F.b(f(c3747fs0D0.f0().h0().c0()));
            c4833pm0F.f(g(c5830yq0.c().f0()));
            return c4833pm0F.g();
        } catch (com.google.android.gms.internal.ads.Vv0 e6) {
            throw new java.security.GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e6);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5720xq0 c(com.google.android.gms.internal.ads.C4283km0 c4283km0, com.google.android.gms.internal.ads.Wl0 wl0) {
        com.google.android.gms.internal.ads.C3199as0 c3199as0C0 = com.google.android.gms.internal.ads.C3418cs0.c0();
        com.google.android.gms.internal.ads.C3857gs0 c3857gs0C0 = com.google.android.gms.internal.ads.C4076is0.c0();
        com.google.android.gms.internal.ads.C4515ms0 c4515ms0C0 = com.google.android.gms.internal.ads.C4735os0.c0();
        c4515ms0C0.z(c4283km0.b().d());
        c3857gs0C0.A((com.google.android.gms.internal.ads.C4735os0) c4515ms0C0.u());
        byte[] bArrD = c4283km0.d().d(wl0);
        c3857gs0C0.z(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArrD, 0, bArrD.length));
        c3199as0C0.z((com.google.android.gms.internal.ads.C4076is0) c3857gs0C0.u());
        com.google.android.gms.internal.ads.Ss0 ss0C0 = com.google.android.gms.internal.ads.Vs0.c0();
        ss0C0.A(h(c4283km0.b()));
        byte[] bArrD2 = c4283km0.e().d(wl0);
        ss0C0.z(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArrD2, 0, bArrD2.length));
        c3199as0C0.A((com.google.android.gms.internal.ads.Vs0) ss0C0.u());
        return com.google.android.gms.internal.ads.C5720xq0.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((com.google.android.gms.internal.ads.C3418cs0) c3199as0C0.u()).g(), com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, i(c4283km0.b().h()), c4283km0.f());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5830yq0 d(com.google.android.gms.internal.ads.C5272tm0 c5272tm0) {
        com.google.android.gms.internal.ads.C3969ht0 c3969ht0B0 = com.google.android.gms.internal.ads.C4187jt0.b0();
        c3969ht0B0.A("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        com.google.android.gms.internal.ads.C3527ds0 c3527ds0B0 = com.google.android.gms.internal.ads.C3747fs0.b0();
        com.google.android.gms.internal.ads.C4185js0 c4185js0C0 = com.google.android.gms.internal.ads.C4405ls0.c0();
        com.google.android.gms.internal.ads.C4515ms0 c4515ms0C0 = com.google.android.gms.internal.ads.C4735os0.c0();
        c4515ms0C0.z(c5272tm0.d());
        c4185js0C0.A((com.google.android.gms.internal.ads.C4735os0) c4515ms0C0.u());
        c4185js0C0.z(c5272tm0.b());
        c3527ds0B0.z((com.google.android.gms.internal.ads.C4405ls0) c4185js0C0.u());
        com.google.android.gms.internal.ads.Ws0 ws0D0 = com.google.android.gms.internal.ads.Ys0.d0();
        ws0D0.A(h(c5272tm0));
        ws0D0.z(c5272tm0.c());
        c3527ds0B0.A((com.google.android.gms.internal.ads.Ys0) ws0D0.u());
        c3969ht0B0.B(((com.google.android.gms.internal.ads.C3747fs0) c3527ds0B0.u()).g());
        c3969ht0B0.z(i(c5272tm0.h()));
        return com.google.android.gms.internal.ads.C5830yq0.b((com.google.android.gms.internal.ads.C4187jt0) c3969ht0B0.u());
    }

    public static void e(com.google.android.gms.internal.ads.Zp0 zp0) {
        zp0.i(f36134b);
        zp0.h(f36135c);
        zp0.g(f36136d);
        zp0.f(f36137e);
    }

    private static com.google.android.gms.internal.ads.C4943qm0 f(com.google.android.gms.internal.ads.Rs0 rs0) throws java.security.GeneralSecurityException {
        int iOrdinal = rs0.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.C4943qm0.f38312b;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.C4943qm0.f38315e;
        }
        if (iOrdinal == 3) {
            return com.google.android.gms.internal.ads.C4943qm0.f38314d;
        }
        if (iOrdinal == 4) {
            return com.google.android.gms.internal.ads.C4943qm0.f38316f;
        }
        if (iOrdinal == 5) {
            return com.google.android.gms.internal.ads.C4943qm0.f38313c;
        }
        throw new java.security.GeneralSecurityException("Unable to parse HashType: " + rs0.a());
    }

    private static com.google.android.gms.internal.ads.C5052rm0 g(com.google.android.gms.internal.ads.Kt0 kt0) throws java.security.GeneralSecurityException {
        int iOrdinal = kt0.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.C5052rm0.f38553b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return com.google.android.gms.internal.ads.C5052rm0.f38555d;
            }
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + kt0.a());
            }
        }
        return com.google.android.gms.internal.ads.C5052rm0.f38554c;
    }

    private static com.google.android.gms.internal.ads.C3311bt0 h(com.google.android.gms.internal.ads.C5272tm0 c5272tm0) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Rs0 rs0;
        com.google.android.gms.internal.ads.Zs0 zs0D0 = com.google.android.gms.internal.ads.C3311bt0.d0();
        zs0D0.A(c5272tm0.e());
        com.google.android.gms.internal.ads.C4943qm0 c4943qm0G = c5272tm0.g();
        if (com.google.android.gms.internal.ads.C4943qm0.f38312b.equals(c4943qm0G)) {
            rs0 = com.google.android.gms.internal.ads.Rs0.SHA1;
        } else if (com.google.android.gms.internal.ads.C4943qm0.f38313c.equals(c4943qm0G)) {
            rs0 = com.google.android.gms.internal.ads.Rs0.SHA224;
        } else if (com.google.android.gms.internal.ads.C4943qm0.f38314d.equals(c4943qm0G)) {
            rs0 = com.google.android.gms.internal.ads.Rs0.SHA256;
        } else if (com.google.android.gms.internal.ads.C4943qm0.f38315e.equals(c4943qm0G)) {
            rs0 = com.google.android.gms.internal.ads.Rs0.SHA384;
        } else {
            if (!com.google.android.gms.internal.ads.C4943qm0.f38316f.equals(c4943qm0G)) {
                throw new java.security.GeneralSecurityException("Unable to serialize HashType ".concat(java.lang.String.valueOf(c4943qm0G)));
            }
            rs0 = com.google.android.gms.internal.ads.Rs0.SHA512;
        }
        zs0D0.z(rs0);
        return (com.google.android.gms.internal.ads.C3311bt0) zs0D0.u();
    }

    private static com.google.android.gms.internal.ads.Kt0 i(com.google.android.gms.internal.ads.C5052rm0 c5052rm0) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.C5052rm0.f38553b.equals(c5052rm0)) {
            return com.google.android.gms.internal.ads.Kt0.TINK;
        }
        if (com.google.android.gms.internal.ads.C5052rm0.f38554c.equals(c5052rm0)) {
            return com.google.android.gms.internal.ads.Kt0.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.C5052rm0.f38555d.equals(c5052rm0)) {
            return com.google.android.gms.internal.ads.Kt0.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(c5052rm0)));
    }
}
