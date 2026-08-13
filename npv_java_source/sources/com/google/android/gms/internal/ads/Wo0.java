package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Wo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Lu0 f32801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4072iq0 f32802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC3633eq0 f32803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5498vp0 f32804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5058rp0 f32805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f32806f = 0;

    static {
        com.google.android.gms.internal.ads.Lu0 lu0B = com.google.android.gms.internal.ads.Kq0.b("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f32801a = lu0B;
        f32802b = com.google.android.gms.internal.ads.AbstractC4072iq0.b(new com.google.android.gms.internal.ads.InterfaceC3853gq0() { // from class: com.google.android.gms.internal.ads.So0
            @Override // com.google.android.gms.internal.ads.InterfaceC3853gq0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.Sl0 sl0) {
                return com.google.android.gms.internal.ads.Wo0.d((com.google.android.gms.internal.ads.Vn0) sl0);
            }
        }, com.google.android.gms.internal.ads.Vn0.class, com.google.android.gms.internal.ads.C5830yq0.class);
        f32803c = com.google.android.gms.internal.ads.AbstractC3633eq0.b(new com.google.android.gms.internal.ads.InterfaceC3414cq0() { // from class: com.google.android.gms.internal.ads.To0
            @Override // com.google.android.gms.internal.ads.InterfaceC3414cq0
            public final com.google.android.gms.internal.ads.Sl0 a(com.google.android.gms.internal.ads.Cq0 cq0) {
                return com.google.android.gms.internal.ads.Wo0.b((com.google.android.gms.internal.ads.C5830yq0) cq0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5830yq0.class);
        f32804d = com.google.android.gms.internal.ads.AbstractC5498vp0.b(new com.google.android.gms.internal.ads.InterfaceC5278tp0() { // from class: com.google.android.gms.internal.ads.Uo0
            @Override // com.google.android.gms.internal.ads.InterfaceC5278tp0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.El0 el0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.Wo0.c((com.google.android.gms.internal.ads.Qn0) el0, wl0);
            }
        }, com.google.android.gms.internal.ads.Qn0.class, com.google.android.gms.internal.ads.C5720xq0.class);
        f32805e = com.google.android.gms.internal.ads.AbstractC5058rp0.b(new com.google.android.gms.internal.ads.InterfaceC4839pp0() { // from class: com.google.android.gms.internal.ads.Vo0
            @Override // com.google.android.gms.internal.ads.InterfaceC4839pp0
            public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Cq0 cq0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.Wo0.a((com.google.android.gms.internal.ads.C5720xq0) cq0, wl0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5720xq0.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.Qn0 a(com.google.android.gms.internal.ads.C5720xq0 c5720xq0, com.google.android.gms.internal.ads.Wl0 wl0) throws java.security.GeneralSecurityException {
        if (!c5720xq0.g().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.Qt0 qt0E0 = com.google.android.gms.internal.ads.Qt0.e0(c5720xq0.d(), com.google.android.gms.internal.ads.C5730xv0.a());
            if (qt0E0.b0() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (qt0E0.g0().n() == 32) {
                return com.google.android.gms.internal.ads.Qn0.a(com.google.android.gms.internal.ads.Vn0.d(f(c5720xq0.c()), qt0E0.f0().b0()), com.google.android.gms.internal.ads.Mu0.b(qt0E0.g0().d(), wl0), c5720xq0.e());
            }
            throw new java.security.GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (com.google.android.gms.internal.ads.Vv0 unused) {
            throw new java.security.GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.Vn0 b(com.google.android.gms.internal.ads.C5830yq0 c5830yq0) throws java.security.GeneralSecurityException {
        if (!c5830yq0.c().h0().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(c5830yq0.c().h0())));
        }
        try {
            com.google.android.gms.internal.ads.Tt0 tt0E0 = com.google.android.gms.internal.ads.Tt0.e0(c5830yq0.c().g0(), com.google.android.gms.internal.ads.C5730xv0.a());
            if (tt0E0.b0() == 0) {
                return com.google.android.gms.internal.ads.Vn0.d(f(c5830yq0.c().f0()), tt0E0.f0().b0());
            }
            throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.android.gms.internal.ads.Vv0 e6) {
            throw new java.security.GeneralSecurityException("Parsing XAesGcmParameters failed: ", e6);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5720xq0 c(com.google.android.gms.internal.ads.Qn0 qn0, com.google.android.gms.internal.ads.Wl0 wl0) {
        com.google.android.gms.internal.ads.Ot0 ot0C0 = com.google.android.gms.internal.ads.Qt0.c0();
        byte[] bArrD = qn0.d().d(wl0);
        ot0C0.z(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArrD, 0, bArrD.length));
        com.google.android.gms.internal.ads.Ut0 ut0C0 = com.google.android.gms.internal.ads.Xt0.c0();
        ut0C0.z(qn0.b().b());
        ot0C0.A((com.google.android.gms.internal.ads.Xt0) ut0C0.u());
        return com.google.android.gms.internal.ads.C5720xq0.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((com.google.android.gms.internal.ads.Qt0) ot0C0.u()).g(), com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, g(qn0.b().c()), qn0.e());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5830yq0 d(com.google.android.gms.internal.ads.Vn0 vn0) {
        com.google.android.gms.internal.ads.C3969ht0 c3969ht0B0 = com.google.android.gms.internal.ads.C4187jt0.b0();
        c3969ht0B0.A("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        com.google.android.gms.internal.ads.Rt0 rt0C0 = com.google.android.gms.internal.ads.Tt0.c0();
        com.google.android.gms.internal.ads.Ut0 ut0C0 = com.google.android.gms.internal.ads.Xt0.c0();
        ut0C0.z(vn0.b());
        rt0C0.z((com.google.android.gms.internal.ads.Xt0) ut0C0.u());
        c3969ht0B0.B(((com.google.android.gms.internal.ads.Tt0) rt0C0.u()).g());
        c3969ht0B0.z(g(vn0.c()));
        return com.google.android.gms.internal.ads.C5830yq0.b((com.google.android.gms.internal.ads.C4187jt0) c3969ht0B0.u());
    }

    public static void e(com.google.android.gms.internal.ads.Zp0 zp0) {
        zp0.i(f32802b);
        zp0.h(f32803c);
        zp0.g(f32804d);
        zp0.f(f32805e);
    }

    private static com.google.android.gms.internal.ads.Un0 f(com.google.android.gms.internal.ads.Kt0 kt0) throws java.security.GeneralSecurityException {
        int iOrdinal = kt0.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.Un0.f32264b;
        }
        if (iOrdinal == 3) {
            return com.google.android.gms.internal.ads.Un0.f32265c;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + kt0.a());
    }

    private static com.google.android.gms.internal.ads.Kt0 g(com.google.android.gms.internal.ads.Un0 un0) throws java.security.GeneralSecurityException {
        if (j$.util.Objects.equals(un0, com.google.android.gms.internal.ads.Un0.f32264b)) {
            return com.google.android.gms.internal.ads.Kt0.TINK;
        }
        if (j$.util.Objects.equals(un0, com.google.android.gms.internal.ads.Un0.f32265c)) {
            return com.google.android.gms.internal.ads.Kt0.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(un0.toString()));
    }
}
