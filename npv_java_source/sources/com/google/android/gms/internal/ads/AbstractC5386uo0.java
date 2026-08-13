package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5386uo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Lu0 f39281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4072iq0 f39282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC3633eq0 f39283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5498vp0 f39284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5058rp0 f39285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f39286f = 0;

    static {
        com.google.android.gms.internal.ads.Lu0 lu0B = com.google.android.gms.internal.ads.Kq0.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f39281a = lu0B;
        f39282b = com.google.android.gms.internal.ads.AbstractC4072iq0.b(new com.google.android.gms.internal.ads.InterfaceC3853gq0() { // from class: com.google.android.gms.internal.ads.qo0
            @Override // com.google.android.gms.internal.ads.InterfaceC3853gq0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.Sl0 sl0) {
                return com.google.android.gms.internal.ads.AbstractC5386uo0.d((com.google.android.gms.internal.ads.Pm0) sl0);
            }
        }, com.google.android.gms.internal.ads.Pm0.class, com.google.android.gms.internal.ads.C5830yq0.class);
        f39283c = com.google.android.gms.internal.ads.AbstractC3633eq0.b(new com.google.android.gms.internal.ads.InterfaceC3414cq0() { // from class: com.google.android.gms.internal.ads.ro0
            @Override // com.google.android.gms.internal.ads.InterfaceC3414cq0
            public final com.google.android.gms.internal.ads.Sl0 a(com.google.android.gms.internal.ads.Cq0 cq0) {
                return com.google.android.gms.internal.ads.AbstractC5386uo0.b((com.google.android.gms.internal.ads.C5830yq0) cq0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5830yq0.class);
        f39284d = com.google.android.gms.internal.ads.AbstractC5498vp0.b(new com.google.android.gms.internal.ads.InterfaceC5278tp0() { // from class: com.google.android.gms.internal.ads.so0
            @Override // com.google.android.gms.internal.ads.InterfaceC5278tp0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.El0 el0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.AbstractC5386uo0.c((com.google.android.gms.internal.ads.Gm0) el0, wl0);
            }
        }, com.google.android.gms.internal.ads.Gm0.class, com.google.android.gms.internal.ads.C5720xq0.class);
        f39285e = com.google.android.gms.internal.ads.AbstractC5058rp0.b(new com.google.android.gms.internal.ads.InterfaceC4839pp0() { // from class: com.google.android.gms.internal.ads.to0
            @Override // com.google.android.gms.internal.ads.InterfaceC4839pp0
            public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Cq0 cq0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.AbstractC5386uo0.a((com.google.android.gms.internal.ads.C5720xq0) cq0, wl0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5720xq0.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.Gm0 a(com.google.android.gms.internal.ads.C5720xq0 c5720xq0, com.google.android.gms.internal.ads.Wl0 wl0) throws java.security.GeneralSecurityException {
        if (!c5720xq0.g().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.Bs0 bs0E0 = com.google.android.gms.internal.ads.Bs0.e0(c5720xq0.d(), com.google.android.gms.internal.ads.C5730xv0.a());
            if (bs0E0.b0() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.Mm0 mm0C = com.google.android.gms.internal.ads.Pm0.c();
            mm0C.b(bs0E0.f0().n());
            mm0C.a(12);
            mm0C.c(16);
            mm0C.d(f(c5720xq0.c()));
            com.google.android.gms.internal.ads.Pm0 pm0E = mm0C.e();
            com.google.android.gms.internal.ads.Em0 em0A = com.google.android.gms.internal.ads.Gm0.a();
            em0A.c(pm0E);
            em0A.b(com.google.android.gms.internal.ads.Mu0.b(bs0E0.f0().d(), wl0));
            em0A.a(c5720xq0.e());
            return em0A.d();
        } catch (com.google.android.gms.internal.ads.Vv0 unused) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.Pm0 b(com.google.android.gms.internal.ads.C5830yq0 c5830yq0) throws java.security.GeneralSecurityException {
        if (!c5830yq0.c().h0().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(c5830yq0.c().h0())));
        }
        try {
            com.google.android.gms.internal.ads.Es0 es0F0 = com.google.android.gms.internal.ads.Es0.f0(c5830yq0.c().g0(), com.google.android.gms.internal.ads.C5730xv0.a());
            if (es0F0.c0() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
            }
            com.google.android.gms.internal.ads.Mm0 mm0C = com.google.android.gms.internal.ads.Pm0.c();
            mm0C.b(es0F0.b0());
            mm0C.a(12);
            mm0C.c(16);
            mm0C.d(f(c5830yq0.c().f0()));
            return mm0C.e();
        } catch (com.google.android.gms.internal.ads.Vv0 e6) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmParameters failed: ", e6);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5720xq0 c(com.google.android.gms.internal.ads.Gm0 gm0, com.google.android.gms.internal.ads.Wl0 wl0) {
        com.google.android.gms.internal.ads.C5944zs0 c5944zs0C0 = com.google.android.gms.internal.ads.Bs0.c0();
        byte[] bArrD = gm0.d().d(wl0);
        c5944zs0C0.z(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArrD, 0, bArrD.length));
        return com.google.android.gms.internal.ads.C5720xq0.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((com.google.android.gms.internal.ads.Bs0) c5944zs0C0.u()).g(), com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, g(gm0.b().d()), gm0.e());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5830yq0 d(com.google.android.gms.internal.ads.Pm0 pm0) {
        com.google.android.gms.internal.ads.C3969ht0 c3969ht0B0 = com.google.android.gms.internal.ads.C4187jt0.b0();
        c3969ht0B0.A("type.googleapis.com/google.crypto.tink.AesGcmKey");
        com.google.android.gms.internal.ads.Cs0 cs0D0 = com.google.android.gms.internal.ads.Es0.d0();
        cs0D0.z(pm0.b());
        c3969ht0B0.B(((com.google.android.gms.internal.ads.Es0) cs0D0.u()).g());
        c3969ht0B0.z(g(pm0.d()));
        return com.google.android.gms.internal.ads.C5830yq0.b((com.google.android.gms.internal.ads.C4187jt0) c3969ht0B0.u());
    }

    public static void e(com.google.android.gms.internal.ads.Zp0 zp0) {
        zp0.i(f39282b);
        zp0.h(f39283c);
        zp0.g(f39284d);
        zp0.f(f39285e);
    }

    private static com.google.android.gms.internal.ads.Nm0 f(com.google.android.gms.internal.ads.Kt0 kt0) throws java.security.GeneralSecurityException {
        int iOrdinal = kt0.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.Nm0.f30372b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return com.google.android.gms.internal.ads.Nm0.f30374d;
            }
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + kt0.a());
            }
        }
        return com.google.android.gms.internal.ads.Nm0.f30373c;
    }

    private static com.google.android.gms.internal.ads.Kt0 g(com.google.android.gms.internal.ads.Nm0 nm0) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.Nm0.f30372b.equals(nm0)) {
            return com.google.android.gms.internal.ads.Kt0.TINK;
        }
        if (com.google.android.gms.internal.ads.Nm0.f30373c.equals(nm0)) {
            return com.google.android.gms.internal.ads.Kt0.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.Nm0.f30374d.equals(nm0)) {
            return com.google.android.gms.internal.ads.Kt0.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(nm0)));
    }
}
