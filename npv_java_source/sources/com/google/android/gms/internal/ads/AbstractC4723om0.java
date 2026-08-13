package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.om0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4723om0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4511mq0 f37862a = com.google.android.gms.internal.ads.AbstractC4511mq0.b(new com.google.android.gms.internal.ads.InterfaceC4291kq0() { // from class: com.google.android.gms.internal.ads.lm0
        @Override // com.google.android.gms.internal.ads.InterfaceC4291kq0
        public final java.lang.Object a(com.google.android.gms.internal.ads.El0 el0) {
            return com.google.android.gms.internal.ads.C4519mu0.b((com.google.android.gms.internal.ads.C4283km0) el0);
        }
    }, com.google.android.gms.internal.ads.C4283km0.class, com.google.android.gms.internal.ads.InterfaceC5380ul0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Fl0 f37863b = com.google.android.gms.internal.ads.C5608wp0.d("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", com.google.android.gms.internal.ads.InterfaceC5380ul0.class, com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, com.google.android.gms.internal.ads.C3418cs0.h0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Qp0 f37864c = new com.google.android.gms.internal.ads.Qp0() { // from class: com.google.android.gms.internal.ads.mm0
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Np0 f37865d = new com.google.android.gms.internal.ads.Np0() { // from class: com.google.android.gms.internal.ads.nm0
        @Override // com.google.android.gms.internal.ads.Np0
        public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Sl0 sl0, java.lang.Integer num) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.C5272tm0 c5272tm0 = (com.google.android.gms.internal.ads.C5272tm0) sl0;
            int i6 = com.google.android.gms.internal.ads.AbstractC4723om0.f37867f;
            if (c5272tm0.b() != 16 && c5272tm0.b() != 32) {
                throw new java.security.GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            com.google.android.gms.internal.ads.C3955hm0 c3955hm0 = new com.google.android.gms.internal.ads.C3955hm0(null);
            c3955hm0.d(c5272tm0);
            c3955hm0.c(num);
            c3955hm0.a(com.google.android.gms.internal.ads.Mu0.c(c5272tm0.b()));
            c3955hm0.b(com.google.android.gms.internal.ads.Mu0.c(c5272tm0.c()));
            return c3955hm0.e();
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f37866e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f37867f = 0;

    public static void a(boolean z6) {
        int i6 = f37866e;
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(i6)) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i10 = com.google.android.gms.internal.ads.AbstractC3959ho0.f36138f;
        com.google.android.gms.internal.ads.AbstractC3959ho0.e(com.google.android.gms.internal.ads.Zp0.c());
        com.google.android.gms.internal.ads.Wp0.a().e(f37862a);
        com.google.android.gms.internal.ads.Vp0 vp0B = com.google.android.gms.internal.ads.Vp0.b();
        java.util.HashMap map = new java.util.HashMap();
        map.put("AES128_CTR_HMAC_SHA256", com.google.android.gms.internal.ads.Pn0.f30790e);
        com.google.android.gms.internal.ads.C4833pm0 c4833pm0 = new com.google.android.gms.internal.ads.C4833pm0(null);
        c4833pm0.a(16);
        c4833pm0.c(32);
        c4833pm0.e(16);
        c4833pm0.d(16);
        com.google.android.gms.internal.ads.C4943qm0 c4943qm0 = com.google.android.gms.internal.ads.C4943qm0.f38314d;
        c4833pm0.b(c4943qm0);
        com.google.android.gms.internal.ads.C5052rm0 c5052rm0 = com.google.android.gms.internal.ads.C5052rm0.f38555d;
        c4833pm0.f(c5052rm0);
        map.put("AES128_CTR_HMAC_SHA256_RAW", c4833pm0.g());
        map.put("AES256_CTR_HMAC_SHA256", com.google.android.gms.internal.ads.Pn0.f30791f);
        com.google.android.gms.internal.ads.C4833pm0 c4833pm1 = new com.google.android.gms.internal.ads.C4833pm0(null);
        c4833pm1.a(32);
        c4833pm1.c(32);
        c4833pm1.e(32);
        c4833pm1.d(16);
        c4833pm1.b(c4943qm0);
        c4833pm1.f(c5052rm0);
        map.put("AES256_CTR_HMAC_SHA256_RAW", c4833pm1.g());
        vp0B.d(j$.util.DesugarCollections.unmodifiableMap(map));
        com.google.android.gms.internal.ads.Rp0.a().b(f37864c, com.google.android.gms.internal.ads.C5272tm0.class);
        com.google.android.gms.internal.ads.Pp0.b().c(f37865d, com.google.android.gms.internal.ads.C5272tm0.class);
        com.google.android.gms.internal.ads.C4509mp0.c().f(f37863b, i6, true);
    }
}
