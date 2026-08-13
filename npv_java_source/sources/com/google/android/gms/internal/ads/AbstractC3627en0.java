package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.en0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3627en0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4511mq0 f35050a = com.google.android.gms.internal.ads.AbstractC4511mq0.b(new com.google.android.gms.internal.ads.InterfaceC4291kq0() { // from class: com.google.android.gms.internal.ads.cn0
        @Override // com.google.android.gms.internal.ads.InterfaceC4291kq0
        public final java.lang.Object a(com.google.android.gms.internal.ads.El0 el0) {
            com.google.android.gms.internal.ads.C3299bn0 c3299bn0 = (com.google.android.gms.internal.ads.C3299bn0) el0;
            int i6 = com.google.android.gms.internal.ads.AbstractC3627en0.f35053d;
            return com.google.android.gms.internal.ads.Bo0.e() ? com.google.android.gms.internal.ads.Bo0.b(c3299bn0) : com.google.android.gms.internal.ads.C4409lu0.b(c3299bn0);
        }
    }, com.google.android.gms.internal.ads.C3299bn0.class, com.google.android.gms.internal.ads.InterfaceC5380ul0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Np0 f35051b = new com.google.android.gms.internal.ads.Np0() { // from class: com.google.android.gms.internal.ads.dn0
        @Override // com.google.android.gms.internal.ads.Np0
        public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Sl0 sl0, java.lang.Integer num) {
            int i6 = com.google.android.gms.internal.ads.AbstractC3627en0.f35053d;
            return com.google.android.gms.internal.ads.C3299bn0.a(((com.google.android.gms.internal.ads.C3847gn0) sl0).b(), com.google.android.gms.internal.ads.Mu0.c(32), num);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Fl0 f35052c = com.google.android.gms.internal.ads.C5608wp0.d("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", com.google.android.gms.internal.ads.InterfaceC5380ul0.class, com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, com.google.android.gms.internal.ads.Ns0.g0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f35053d = 0;

    public static void a(boolean z6) {
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(1)) {
            throw new java.security.GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i6 = com.google.android.gms.internal.ads.Go0.f27894f;
        com.google.android.gms.internal.ads.Go0.e(com.google.android.gms.internal.ads.Zp0.c());
        com.google.android.gms.internal.ads.Wp0.a().e(f35050a);
        com.google.android.gms.internal.ads.Pp0.b().c(f35051b, com.google.android.gms.internal.ads.C3847gn0.class);
        com.google.android.gms.internal.ads.Vp0 vp0B = com.google.android.gms.internal.ads.Vp0.b();
        java.util.HashMap map = new java.util.HashMap();
        map.put("CHACHA20_POLY1305", com.google.android.gms.internal.ads.C3847gn0.c(com.google.android.gms.internal.ads.C3737fn0.f35426b));
        map.put("CHACHA20_POLY1305_RAW", com.google.android.gms.internal.ads.C3847gn0.c(com.google.android.gms.internal.ads.C3737fn0.f35428d));
        vp0B.d(j$.util.DesugarCollections.unmodifiableMap(map));
        com.google.android.gms.internal.ads.C4509mp0.c().d(f35052c, true);
    }
}
