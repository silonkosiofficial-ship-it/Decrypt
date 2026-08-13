package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5932zm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4511mq0 f40383a = com.google.android.gms.internal.ads.AbstractC4511mq0.b(new com.google.android.gms.internal.ads.InterfaceC4291kq0() { // from class: com.google.android.gms.internal.ads.xm0
        @Override // com.google.android.gms.internal.ads.InterfaceC4291kq0
        public final java.lang.Object a(com.google.android.gms.internal.ads.El0 el0) {
            return com.google.android.gms.internal.ads.C4079iu0.b((com.google.android.gms.internal.ads.C5602wm0) el0);
        }
    }, com.google.android.gms.internal.ads.C5602wm0.class, com.google.android.gms.internal.ads.InterfaceC5380ul0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Fl0 f40384b = com.google.android.gms.internal.ads.C5608wp0.d("type.googleapis.com/google.crypto.tink.AesEaxKey", com.google.android.gms.internal.ads.InterfaceC5380ul0.class, com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, com.google.android.gms.internal.ads.C5064rs0.h0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Np0 f40385c = new com.google.android.gms.internal.ads.Np0() { // from class: com.google.android.gms.internal.ads.ym0
        @Override // com.google.android.gms.internal.ads.Np0
        public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Sl0 sl0, java.lang.Integer num) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.Dm0 dm0 = (com.google.android.gms.internal.ads.Dm0) sl0;
            int i6 = com.google.android.gms.internal.ads.AbstractC5932zm0.f40386d;
            if (dm0.c() == 24) {
                throw new java.security.GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            com.google.android.gms.internal.ads.C5382um0 c5382um0 = new com.google.android.gms.internal.ads.C5382um0(null);
            c5382um0.c(dm0);
            c5382um0.a(num);
            c5382um0.b(com.google.android.gms.internal.ads.Mu0.c(dm0.c()));
            return c5382um0.d();
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f40386d = 0;

    public static void a(boolean z6) {
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(1)) {
            throw new java.security.GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i6 = com.google.android.gms.internal.ads.AbstractC4617no0.f37666f;
        com.google.android.gms.internal.ads.AbstractC4617no0.e(com.google.android.gms.internal.ads.Zp0.c());
        com.google.android.gms.internal.ads.Wp0.a().e(f40383a);
        com.google.android.gms.internal.ads.Vp0 vp0B = com.google.android.gms.internal.ads.Vp0.b();
        java.util.HashMap map = new java.util.HashMap();
        map.put("AES128_EAX", com.google.android.gms.internal.ads.Pn0.f30788c);
        com.google.android.gms.internal.ads.Am0 am0 = new com.google.android.gms.internal.ads.Am0(null);
        am0.a(16);
        am0.b(16);
        am0.c(16);
        com.google.android.gms.internal.ads.Bm0 bm0 = com.google.android.gms.internal.ads.Bm0.f26017d;
        am0.d(bm0);
        map.put("AES128_EAX_RAW", am0.e());
        map.put("AES256_EAX", com.google.android.gms.internal.ads.Pn0.f30789d);
        com.google.android.gms.internal.ads.Am0 am1 = new com.google.android.gms.internal.ads.Am0(null);
        am1.a(16);
        am1.b(32);
        am1.c(16);
        am1.d(bm0);
        map.put("AES256_EAX_RAW", am1.e());
        vp0B.d(j$.util.DesugarCollections.unmodifiableMap(map));
        com.google.android.gms.internal.ads.Pp0.b().c(f40385c, com.google.android.gms.internal.ads.Dm0.class);
        com.google.android.gms.internal.ads.C4509mp0.c().d(f40384b, true);
    }
}
