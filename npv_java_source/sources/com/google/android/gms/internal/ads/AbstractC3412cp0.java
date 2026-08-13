package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3412cp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Lu0 f34566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4072iq0 f34567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC3633eq0 f34568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5498vp0 f34569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5058rp0 f34570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f34571f = 0;

    static {
        com.google.android.gms.internal.ads.Lu0 lu0B = com.google.android.gms.internal.ads.Kq0.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f34566a = lu0B;
        f34567b = com.google.android.gms.internal.ads.AbstractC4072iq0.b(new com.google.android.gms.internal.ads.InterfaceC3853gq0() { // from class: com.google.android.gms.internal.ads.Yo0
            @Override // com.google.android.gms.internal.ads.InterfaceC3853gq0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.Sl0 sl0) {
                return com.google.android.gms.internal.ads.AbstractC3412cp0.d((com.google.android.gms.internal.ads.C3410co0) sl0);
            }
        }, com.google.android.gms.internal.ads.C3410co0.class, com.google.android.gms.internal.ads.C5830yq0.class);
        f34568c = com.google.android.gms.internal.ads.AbstractC3633eq0.b(new com.google.android.gms.internal.ads.InterfaceC3414cq0() { // from class: com.google.android.gms.internal.ads.Zo0
            @Override // com.google.android.gms.internal.ads.InterfaceC3414cq0
            public final com.google.android.gms.internal.ads.Sl0 a(com.google.android.gms.internal.ads.Cq0 cq0) {
                return com.google.android.gms.internal.ads.AbstractC3412cp0.b((com.google.android.gms.internal.ads.C5830yq0) cq0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5830yq0.class);
        f34569d = com.google.android.gms.internal.ads.AbstractC5498vp0.b(new com.google.android.gms.internal.ads.InterfaceC5278tp0() { // from class: com.google.android.gms.internal.ads.ap0
            @Override // com.google.android.gms.internal.ads.InterfaceC5278tp0
            public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.El0 el0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.AbstractC3412cp0.c((com.google.android.gms.internal.ads.Wn0) el0, wl0);
            }
        }, com.google.android.gms.internal.ads.Wn0.class, com.google.android.gms.internal.ads.C5720xq0.class);
        f34570e = com.google.android.gms.internal.ads.AbstractC5058rp0.b(new com.google.android.gms.internal.ads.InterfaceC4839pp0() { // from class: com.google.android.gms.internal.ads.bp0
            @Override // com.google.android.gms.internal.ads.InterfaceC4839pp0
            public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Cq0 cq0, com.google.android.gms.internal.ads.Wl0 wl0) {
                return com.google.android.gms.internal.ads.AbstractC3412cp0.a((com.google.android.gms.internal.ads.C5720xq0) cq0, wl0);
            }
        }, lu0B, com.google.android.gms.internal.ads.C5720xq0.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.Wn0 a(com.google.android.gms.internal.ads.C5720xq0 c5720xq0, com.google.android.gms.internal.ads.Wl0 wl0) throws java.security.GeneralSecurityException {
        if (!c5720xq0.g().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.C3203au0 c3203au0E0 = com.google.android.gms.internal.ads.C3203au0.e0(c5720xq0.d(), com.google.android.gms.internal.ads.C5730xv0.a());
            if (c3203au0E0.b0() == 0) {
                return com.google.android.gms.internal.ads.Wn0.a(f(c5720xq0.c()), com.google.android.gms.internal.ads.Mu0.b(c3203au0E0.f0().d(), wl0), c5720xq0.e());
            }
            throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.android.gms.internal.ads.Vv0 unused) {
            throw new java.security.GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C3410co0 b(com.google.android.gms.internal.ads.C5830yq0 c5830yq0) throws java.security.GeneralSecurityException {
        if (!c5830yq0.c().h0().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(c5830yq0.c().h0())));
        }
        try {
            if (com.google.android.gms.internal.ads.C3531du0.e0(c5830yq0.c().g0(), com.google.android.gms.internal.ads.C5730xv0.a()).b0() == 0) {
                return com.google.android.gms.internal.ads.C3410co0.c(f(c5830yq0.c().f0()));
            }
            throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.android.gms.internal.ads.Vv0 e6) {
            throw new java.security.GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e6);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5720xq0 c(com.google.android.gms.internal.ads.Wn0 wn0, com.google.android.gms.internal.ads.Wl0 wl0) {
        com.google.android.gms.internal.ads.Yt0 yt0C0 = com.google.android.gms.internal.ads.C3203au0.c0();
        byte[] bArrD = wn0.d().d(wl0);
        yt0C0.z(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArrD, 0, bArrD.length));
        return com.google.android.gms.internal.ads.C5720xq0.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((com.google.android.gms.internal.ads.C3203au0) yt0C0.u()).g(), com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, g(wn0.b().b()), wn0.e());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.C5830yq0 d(com.google.android.gms.internal.ads.C3410co0 c3410co0) {
        com.google.android.gms.internal.ads.C3969ht0 c3969ht0B0 = com.google.android.gms.internal.ads.C4187jt0.b0();
        c3969ht0B0.A("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        c3969ht0B0.B(com.google.android.gms.internal.ads.C3531du0.d0().g());
        c3969ht0B0.z(g(c3410co0.b()));
        return com.google.android.gms.internal.ads.C5830yq0.b((com.google.android.gms.internal.ads.C4187jt0) c3969ht0B0.u());
    }

    public static void e(com.google.android.gms.internal.ads.Zp0 zp0) {
        zp0.i(f34567b);
        zp0.h(f34568c);
        zp0.g(f34569d);
        zp0.f(f34570e);
    }

    private static com.google.android.gms.internal.ads.C3301bo0 f(com.google.android.gms.internal.ads.Kt0 kt0) throws java.security.GeneralSecurityException {
        int iOrdinal = kt0.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.C3301bo0.f34376b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return com.google.android.gms.internal.ads.C3301bo0.f34378d;
            }
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + kt0.a());
            }
        }
        return com.google.android.gms.internal.ads.C3301bo0.f34377c;
    }

    private static com.google.android.gms.internal.ads.Kt0 g(com.google.android.gms.internal.ads.C3301bo0 c3301bo0) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.C3301bo0.f34376b.equals(c3301bo0)) {
            return com.google.android.gms.internal.ads.Kt0.TINK;
        }
        if (com.google.android.gms.internal.ads.C3301bo0.f34377c.equals(c3301bo0)) {
            return com.google.android.gms.internal.ads.Kt0.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.C3301bo0.f34378d.equals(c3301bo0)) {
            return com.google.android.gms.internal.ads.Kt0.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(c3301bo0.toString()));
    }
}
