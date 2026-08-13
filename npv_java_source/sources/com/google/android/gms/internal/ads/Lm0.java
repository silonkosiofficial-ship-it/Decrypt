package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Lm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4511mq0 f29561a = com.google.android.gms.internal.ads.AbstractC4511mq0.b(new com.google.android.gms.internal.ads.InterfaceC4291kq0() { // from class: com.google.android.gms.internal.ads.Hm0
        @Override // com.google.android.gms.internal.ads.InterfaceC4291kq0
        public final java.lang.Object a(com.google.android.gms.internal.ads.El0 el0) {
            return com.google.android.gms.internal.ads.C4189ju0.b((com.google.android.gms.internal.ads.Gm0) el0);
        }
    }, com.google.android.gms.internal.ads.Gm0.class, com.google.android.gms.internal.ads.InterfaceC5380ul0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Fl0 f29562b = com.google.android.gms.internal.ads.C5608wp0.d("type.googleapis.com/google.crypto.tink.AesGcmKey", com.google.android.gms.internal.ads.InterfaceC5380ul0.class, com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, com.google.android.gms.internal.ads.Bs0.g0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Qp0 f29563c = new com.google.android.gms.internal.ads.Qp0() { // from class: com.google.android.gms.internal.ads.Im0
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Np0 f29564d = new com.google.android.gms.internal.ads.Np0() { // from class: com.google.android.gms.internal.ads.Km0
        @Override // com.google.android.gms.internal.ads.Np0
        public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Sl0 sl0, java.lang.Integer num) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.Pm0 pm0 = (com.google.android.gms.internal.ads.Pm0) sl0;
            int i6 = com.google.android.gms.internal.ads.Lm0.f29566f;
            if (pm0.b() == 24) {
                throw new java.security.GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            com.google.android.gms.internal.ads.Em0 em0 = new com.google.android.gms.internal.ads.Em0(null);
            em0.c(pm0);
            em0.a(num);
            em0.b(com.google.android.gms.internal.ads.Mu0.c(pm0.b()));
            return em0.d();
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f29565e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f29566f = 0;

    public static void a(boolean z6) {
        int i6 = f29565e;
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(i6)) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i10 = com.google.android.gms.internal.ads.AbstractC5386uo0.f39286f;
        com.google.android.gms.internal.ads.AbstractC5386uo0.e(com.google.android.gms.internal.ads.Zp0.c());
        com.google.android.gms.internal.ads.Wp0.a().e(f29561a);
        com.google.android.gms.internal.ads.Vp0 vp0B = com.google.android.gms.internal.ads.Vp0.b();
        java.util.HashMap map = new java.util.HashMap();
        map.put("AES128_GCM", com.google.android.gms.internal.ads.Pn0.f30786a);
        com.google.android.gms.internal.ads.Mm0 mm0 = new com.google.android.gms.internal.ads.Mm0(null);
        mm0.a(12);
        mm0.b(16);
        mm0.c(16);
        com.google.android.gms.internal.ads.Nm0 nm0 = com.google.android.gms.internal.ads.Nm0.f30374d;
        mm0.d(nm0);
        map.put("AES128_GCM_RAW", mm0.e());
        map.put("AES256_GCM", com.google.android.gms.internal.ads.Pn0.f30787b);
        com.google.android.gms.internal.ads.Mm0 mm1 = new com.google.android.gms.internal.ads.Mm0(null);
        mm1.a(12);
        mm1.b(32);
        mm1.c(16);
        mm1.d(nm0);
        map.put("AES256_GCM_RAW", mm1.e());
        vp0B.d(j$.util.DesugarCollections.unmodifiableMap(map));
        com.google.android.gms.internal.ads.Rp0.a().b(f29563c, com.google.android.gms.internal.ads.Pm0.class);
        com.google.android.gms.internal.ads.Pp0.b().c(f29564d, com.google.android.gms.internal.ads.Pm0.class);
        com.google.android.gms.internal.ads.C4509mp0.c().f(f29562b, i6, true);
    }
}
