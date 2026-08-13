package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ir0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4074ir0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4511mq0 f36364a = com.google.android.gms.internal.ads.AbstractC4511mq0.b(new com.google.android.gms.internal.ads.InterfaceC4291kq0() { // from class: com.google.android.gms.internal.ads.er0
        @Override // com.google.android.gms.internal.ads.InterfaceC4291kq0
        public final java.lang.Object a(com.google.android.gms.internal.ads.El0 el0) {
            return new com.google.android.gms.internal.ads.Jr0((com.google.android.gms.internal.ads.C3525dr0) el0);
        }
    }, com.google.android.gms.internal.ads.C3525dr0.class, com.google.android.gms.internal.ads.Xq0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4511mq0 f36365b = com.google.android.gms.internal.ads.AbstractC4511mq0.b(new com.google.android.gms.internal.ads.InterfaceC4291kq0() { // from class: com.google.android.gms.internal.ads.fr0
        @Override // com.google.android.gms.internal.ads.InterfaceC4291kq0
        public final java.lang.Object a(com.google.android.gms.internal.ads.El0 el0) {
            return com.google.android.gms.internal.ads.Iu0.b((com.google.android.gms.internal.ads.C3525dr0) el0);
        }
    }, com.google.android.gms.internal.ads.C3525dr0.class, com.google.android.gms.internal.ads.Rl0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Fl0 f36366c = com.google.android.gms.internal.ads.C5608wp0.d("type.googleapis.com/google.crypto.tink.HmacKey", com.google.android.gms.internal.ads.Rl0.class, com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, com.google.android.gms.internal.ads.Vs0.i0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Qp0 f36367d = new com.google.android.gms.internal.ads.Qp0() { // from class: com.google.android.gms.internal.ads.gr0
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Np0 f36368e = new com.google.android.gms.internal.ads.Np0() { // from class: com.google.android.gms.internal.ads.hr0
        @Override // com.google.android.gms.internal.ads.Np0
        public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Sl0 sl0, java.lang.Integer num) {
            com.google.android.gms.internal.ads.C4623nr0 c4623nr0 = (com.google.android.gms.internal.ads.C4623nr0) sl0;
            com.google.android.gms.internal.ads.C3307br0 c3307br0 = new com.google.android.gms.internal.ads.C3307br0(null);
            c3307br0.c(c4623nr0);
            c3307br0.b(com.google.android.gms.internal.ads.Mu0.c(c4623nr0.c()));
            c3307br0.a(num);
            return c3307br0.d();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f36369f = 2;

    public static void a(boolean z6) throws java.security.GeneralSecurityException {
        int i6 = f36369f;
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(i6)) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i10 = com.google.android.gms.internal.ads.Or0.f30581h;
        com.google.android.gms.internal.ads.Or0.e(com.google.android.gms.internal.ads.Zp0.c());
        com.google.android.gms.internal.ads.Wp0.a().e(f36364a);
        com.google.android.gms.internal.ads.Wp0.a().e(f36365b);
        com.google.android.gms.internal.ads.Vp0 vp0B = com.google.android.gms.internal.ads.Vp0.b();
        java.util.HashMap map = new java.util.HashMap();
        map.put("HMAC_SHA256_128BITTAG", com.google.android.gms.internal.ads.Br0.f26034a);
        com.google.android.gms.internal.ads.C4183jr0 c4183jr0 = new com.google.android.gms.internal.ads.C4183jr0(null);
        c4183jr0.b(32);
        c4183jr0.c(16);
        com.google.android.gms.internal.ads.C4403lr0 c4403lr0 = com.google.android.gms.internal.ads.C4403lr0.f37244e;
        c4183jr0.d(c4403lr0);
        com.google.android.gms.internal.ads.C4293kr0 c4293kr0 = com.google.android.gms.internal.ads.C4293kr0.f37018d;
        c4183jr0.a(c4293kr0);
        map.put("HMAC_SHA256_128BITTAG_RAW", c4183jr0.e());
        com.google.android.gms.internal.ads.C4183jr0 c4183jr1 = new com.google.android.gms.internal.ads.C4183jr0(null);
        c4183jr1.b(32);
        c4183jr1.c(32);
        com.google.android.gms.internal.ads.C4403lr0 c4403lr1 = com.google.android.gms.internal.ads.C4403lr0.f37241b;
        c4183jr1.d(c4403lr1);
        c4183jr1.a(c4293kr0);
        map.put("HMAC_SHA256_256BITTAG", c4183jr1.e());
        com.google.android.gms.internal.ads.C4183jr0 c4183jr2 = new com.google.android.gms.internal.ads.C4183jr0(null);
        c4183jr2.b(32);
        c4183jr2.c(32);
        c4183jr2.d(c4403lr0);
        c4183jr2.a(c4293kr0);
        map.put("HMAC_SHA256_256BITTAG_RAW", c4183jr2.e());
        com.google.android.gms.internal.ads.C4183jr0 c4183jr3 = new com.google.android.gms.internal.ads.C4183jr0(null);
        c4183jr3.b(64);
        c4183jr3.c(16);
        c4183jr3.d(c4403lr1);
        com.google.android.gms.internal.ads.C4293kr0 c4293kr1 = com.google.android.gms.internal.ads.C4293kr0.f37020f;
        c4183jr3.a(c4293kr1);
        map.put("HMAC_SHA512_128BITTAG", c4183jr3.e());
        com.google.android.gms.internal.ads.C4183jr0 c4183jr4 = new com.google.android.gms.internal.ads.C4183jr0(null);
        c4183jr4.b(64);
        c4183jr4.c(16);
        c4183jr4.d(c4403lr0);
        c4183jr4.a(c4293kr1);
        map.put("HMAC_SHA512_128BITTAG_RAW", c4183jr4.e());
        com.google.android.gms.internal.ads.C4183jr0 c4183jr5 = new com.google.android.gms.internal.ads.C4183jr0(null);
        c4183jr5.b(64);
        c4183jr5.c(32);
        c4183jr5.d(c4403lr1);
        c4183jr5.a(c4293kr1);
        map.put("HMAC_SHA512_256BITTAG", c4183jr5.e());
        com.google.android.gms.internal.ads.C4183jr0 c4183jr6 = new com.google.android.gms.internal.ads.C4183jr0(null);
        c4183jr6.b(64);
        c4183jr6.c(32);
        c4183jr6.d(c4403lr0);
        c4183jr6.a(c4293kr1);
        map.put("HMAC_SHA512_256BITTAG_RAW", c4183jr6.e());
        map.put("HMAC_SHA512_512BITTAG", com.google.android.gms.internal.ads.Br0.f26035b);
        com.google.android.gms.internal.ads.C4183jr0 c4183jr7 = new com.google.android.gms.internal.ads.C4183jr0(null);
        c4183jr7.b(64);
        c4183jr7.c(64);
        c4183jr7.d(c4403lr0);
        c4183jr7.a(c4293kr1);
        map.put("HMAC_SHA512_512BITTAG_RAW", c4183jr7.e());
        vp0B.d(j$.util.DesugarCollections.unmodifiableMap(map));
        com.google.android.gms.internal.ads.Pp0.b().c(f36368e, com.google.android.gms.internal.ads.C4623nr0.class);
        com.google.android.gms.internal.ads.Rp0.a().b(f36367d, com.google.android.gms.internal.ads.C4623nr0.class);
        com.google.android.gms.internal.ads.C4509mp0.c().f(f36366c, i6, true);
    }
}
