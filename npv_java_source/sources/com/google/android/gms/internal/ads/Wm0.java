package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Wm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4511mq0 f32792a = com.google.android.gms.internal.ads.AbstractC4511mq0.b(new com.google.android.gms.internal.ads.InterfaceC4291kq0() { // from class: com.google.android.gms.internal.ads.Tm0
        @Override // com.google.android.gms.internal.ads.InterfaceC4291kq0
        public final java.lang.Object a(com.google.android.gms.internal.ads.El0 el0) {
            return com.google.android.gms.internal.ads.C3631ep0.b((com.google.android.gms.internal.ads.Sm0) el0);
        }
    }, com.google.android.gms.internal.ads.Sm0.class, com.google.android.gms.internal.ads.InterfaceC5380ul0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Np0 f32793b = new com.google.android.gms.internal.ads.Np0() { // from class: com.google.android.gms.internal.ads.Um0
        @Override // com.google.android.gms.internal.ads.Np0
        public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Sl0 sl0, java.lang.Integer num) {
            com.google.android.gms.internal.ads.C3189an0 c3189an0 = (com.google.android.gms.internal.ads.C3189an0) sl0;
            com.google.android.gms.internal.ads.Qm0 qm0 = new com.google.android.gms.internal.ads.Qm0(null);
            qm0.c(c3189an0);
            qm0.a(num);
            qm0.b(com.google.android.gms.internal.ads.Mu0.c(c3189an0.b()));
            return qm0.d();
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Qp0 f32794c = new com.google.android.gms.internal.ads.Qp0() { // from class: com.google.android.gms.internal.ads.Vm0
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Fl0 f32795d = com.google.android.gms.internal.ads.C5608wp0.d("type.googleapis.com/google.crypto.tink.AesGcmSivKey", com.google.android.gms.internal.ads.InterfaceC5380ul0.class, com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, com.google.android.gms.internal.ads.Hs0.g0());

    public static void a(boolean z6) {
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(1)) {
            throw new java.security.GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i6 = com.google.android.gms.internal.ads.AbstractC5936zo0.f40401f;
        com.google.android.gms.internal.ads.AbstractC5936zo0.e(com.google.android.gms.internal.ads.Zp0.c());
        if (b()) {
            com.google.android.gms.internal.ads.Wp0.a().e(f32792a);
            com.google.android.gms.internal.ads.Vp0 vp0B = com.google.android.gms.internal.ads.Vp0.b();
            java.util.HashMap map = new java.util.HashMap();
            com.google.android.gms.internal.ads.Xm0 xm0 = new com.google.android.gms.internal.ads.Xm0(null);
            xm0.a(16);
            com.google.android.gms.internal.ads.Ym0 ym0 = com.google.android.gms.internal.ads.Ym0.f33404b;
            xm0.b(ym0);
            map.put("AES128_GCM_SIV", xm0.c());
            com.google.android.gms.internal.ads.Xm0 xm1 = new com.google.android.gms.internal.ads.Xm0(null);
            xm1.a(16);
            com.google.android.gms.internal.ads.Ym0 ym1 = com.google.android.gms.internal.ads.Ym0.f33406d;
            xm1.b(ym1);
            map.put("AES128_GCM_SIV_RAW", xm1.c());
            com.google.android.gms.internal.ads.Xm0 xm2 = new com.google.android.gms.internal.ads.Xm0(null);
            xm2.a(32);
            xm2.b(ym0);
            map.put("AES256_GCM_SIV", xm2.c());
            com.google.android.gms.internal.ads.Xm0 xm3 = new com.google.android.gms.internal.ads.Xm0(null);
            xm3.a(32);
            xm3.b(ym1);
            map.put("AES256_GCM_SIV_RAW", xm3.c());
            vp0B.d(j$.util.DesugarCollections.unmodifiableMap(map));
            com.google.android.gms.internal.ads.Rp0.a().b(f32794c, com.google.android.gms.internal.ads.C3189an0.class);
            com.google.android.gms.internal.ads.Pp0.b().c(f32793b, com.google.android.gms.internal.ads.C3189an0.class);
            com.google.android.gms.internal.ads.C4509mp0.c().d(f32795d, true);
        }
    }

    private static boolean b() {
        try {
            javax.crypto.Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException unused) {
            return false;
        }
    }
}
