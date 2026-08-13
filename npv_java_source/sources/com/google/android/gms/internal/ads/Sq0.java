package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Sq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Np0 f31786a = new com.google.android.gms.internal.ads.Np0() { // from class: com.google.android.gms.internal.ads.Oq0
        @Override // com.google.android.gms.internal.ads.Np0
        public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Sl0 sl0, java.lang.Integer num) {
            return com.google.android.gms.internal.ads.Sq0.b((com.google.android.gms.internal.ads.Wq0) sl0, num);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4511mq0 f31787b = com.google.android.gms.internal.ads.AbstractC4511mq0.b(new com.google.android.gms.internal.ads.InterfaceC4291kq0() { // from class: com.google.android.gms.internal.ads.Pq0
        @Override // com.google.android.gms.internal.ads.InterfaceC4291kq0
        public final java.lang.Object a(com.google.android.gms.internal.ads.El0 el0) {
            return com.google.android.gms.internal.ads.Sq0.c((com.google.android.gms.internal.ads.Nq0) el0);
        }
    }, com.google.android.gms.internal.ads.Nq0.class, com.google.android.gms.internal.ads.Xq0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4511mq0 f31788c = com.google.android.gms.internal.ads.AbstractC4511mq0.b(new com.google.android.gms.internal.ads.InterfaceC4291kq0() { // from class: com.google.android.gms.internal.ads.Rq0
        @Override // com.google.android.gms.internal.ads.InterfaceC4291kq0
        public final java.lang.Object a(com.google.android.gms.internal.ads.El0 el0) {
            return com.google.android.gms.internal.ads.Sq0.a((com.google.android.gms.internal.ads.Nq0) el0);
        }
    }, com.google.android.gms.internal.ads.Nq0.class, com.google.android.gms.internal.ads.Rl0.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Fl0 f31789d = com.google.android.gms.internal.ads.C5608wp0.d("type.googleapis.com/google.crypto.tink.AesCmacKey", com.google.android.gms.internal.ads.Rl0.class, com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, com.google.android.gms.internal.ads.Tr0.h0());

    public static /* synthetic */ com.google.android.gms.internal.ads.Rl0 a(com.google.android.gms.internal.ads.Nq0 nq0) throws java.security.GeneralSecurityException {
        e(nq0.b());
        return com.google.android.gms.internal.ads.Iu0.a(nq0);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.Nq0 b(com.google.android.gms.internal.ads.Wq0 wq0, java.lang.Integer num) throws java.security.GeneralSecurityException {
        e(wq0);
        com.google.android.gms.internal.ads.Lq0 lq0 = new com.google.android.gms.internal.ads.Lq0(null);
        lq0.c(wq0);
        lq0.a(com.google.android.gms.internal.ads.Mu0.c(wq0.c()));
        lq0.b(num);
        return lq0.d();
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.Xq0 c(com.google.android.gms.internal.ads.Nq0 nq0) throws java.security.GeneralSecurityException {
        e(nq0.b());
        return new com.google.android.gms.internal.ads.Ir0(nq0);
    }

    public static void d(boolean z6) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(1)) {
            throw new java.security.GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i6 = com.google.android.gms.internal.ads.Gr0.f27910f;
        com.google.android.gms.internal.ads.Gr0.e(com.google.android.gms.internal.ads.Zp0.c());
        com.google.android.gms.internal.ads.Pp0.b().c(f31786a, com.google.android.gms.internal.ads.Wq0.class);
        com.google.android.gms.internal.ads.Wp0.a().e(f31787b);
        com.google.android.gms.internal.ads.Wp0.a().e(f31788c);
        com.google.android.gms.internal.ads.Vp0 vp0B = com.google.android.gms.internal.ads.Vp0.b();
        java.util.HashMap map = new java.util.HashMap();
        com.google.android.gms.internal.ads.Wq0 wq0 = com.google.android.gms.internal.ads.Br0.f26036c;
        map.put("AES_CMAC", wq0);
        map.put("AES256_CMAC", wq0);
        com.google.android.gms.internal.ads.Tq0 tq0 = new com.google.android.gms.internal.ads.Tq0(null);
        tq0.a(32);
        tq0.b(16);
        tq0.c(com.google.android.gms.internal.ads.Uq0.f32291e);
        map.put("AES256_CMAC_RAW", tq0.d());
        vp0B.d(j$.util.DesugarCollections.unmodifiableMap(map));
        com.google.android.gms.internal.ads.C4509mp0.c().d(f31789d, true);
    }

    private static void e(com.google.android.gms.internal.ads.Wq0 wq0) throws java.security.GeneralSecurityException {
        if (wq0.c() != 32) {
            throw new java.security.GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
