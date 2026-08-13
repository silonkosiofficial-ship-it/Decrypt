package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ao0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3191ao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4511mq0 f34147a = com.google.android.gms.internal.ads.AbstractC4511mq0.b(new com.google.android.gms.internal.ads.InterfaceC4291kq0() { // from class: com.google.android.gms.internal.ads.Xn0
        @Override // com.google.android.gms.internal.ads.InterfaceC4291kq0
        public final java.lang.Object a(com.google.android.gms.internal.ads.El0 el0) {
            com.google.android.gms.internal.ads.Wn0 wn0 = (com.google.android.gms.internal.ads.Wn0) el0;
            int i6 = com.google.android.gms.internal.ads.AbstractC3191ao0.f34151e;
            return com.google.android.gms.internal.ads.Xo0.c() ? com.google.android.gms.internal.ads.Xo0.b(wn0) : com.google.android.gms.internal.ads.Ku0.b(wn0);
        }
    }, com.google.android.gms.internal.ads.Wn0.class, com.google.android.gms.internal.ads.InterfaceC5380ul0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Fl0 f34148b = com.google.android.gms.internal.ads.C5608wp0.d("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", com.google.android.gms.internal.ads.InterfaceC5380ul0.class, com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, com.google.android.gms.internal.ads.C3203au0.g0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Qp0 f34149c = new com.google.android.gms.internal.ads.Qp0() { // from class: com.google.android.gms.internal.ads.Yn0
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Np0 f34150d = new com.google.android.gms.internal.ads.Np0() { // from class: com.google.android.gms.internal.ads.Zn0
        @Override // com.google.android.gms.internal.ads.Np0
        public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Sl0 sl0, java.lang.Integer num) {
            int i6 = com.google.android.gms.internal.ads.AbstractC3191ao0.f34151e;
            return com.google.android.gms.internal.ads.Wn0.a(((com.google.android.gms.internal.ads.C3410co0) sl0).b(), com.google.android.gms.internal.ads.Mu0.c(32), num);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f34151e = 0;

    public static void a(boolean z6) {
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(1)) {
            throw new java.security.GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i6 = com.google.android.gms.internal.ads.AbstractC3412cp0.f34571f;
        com.google.android.gms.internal.ads.AbstractC3412cp0.e(com.google.android.gms.internal.ads.Zp0.c());
        com.google.android.gms.internal.ads.Wp0.a().e(f34147a);
        com.google.android.gms.internal.ads.Vp0 vp0B = com.google.android.gms.internal.ads.Vp0.b();
        java.util.HashMap map = new java.util.HashMap();
        map.put("XCHACHA20_POLY1305", com.google.android.gms.internal.ads.C3410co0.c(com.google.android.gms.internal.ads.C3301bo0.f34376b));
        map.put("XCHACHA20_POLY1305_RAW", com.google.android.gms.internal.ads.C3410co0.c(com.google.android.gms.internal.ads.C3301bo0.f34378d));
        vp0B.d(j$.util.DesugarCollections.unmodifiableMap(map));
        com.google.android.gms.internal.ads.Pp0.b().c(f34150d, com.google.android.gms.internal.ads.C3410co0.class);
        com.google.android.gms.internal.ads.Rp0.a().b(f34149c, com.google.android.gms.internal.ads.C3410co0.class);
        com.google.android.gms.internal.ads.C4509mp0.c().d(f34148b, true);
    }
}
