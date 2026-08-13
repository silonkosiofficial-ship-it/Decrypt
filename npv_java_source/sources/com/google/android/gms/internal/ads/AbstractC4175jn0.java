package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4175jn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4511mq0 f36732a = com.google.android.gms.internal.ads.AbstractC4511mq0.b(new com.google.android.gms.internal.ads.InterfaceC4291kq0() { // from class: com.google.android.gms.internal.ads.hn0
        @Override // com.google.android.gms.internal.ads.InterfaceC4291kq0
        public final java.lang.Object a(com.google.android.gms.internal.ads.El0 el0) throws java.security.GeneralSecurityException {
            int i6 = com.google.android.gms.internal.ads.AbstractC4175jn0.f36735d;
            com.google.android.gms.internal.ads.Ql0.a(((com.google.android.gms.internal.ads.C4725on0) el0).b().d());
            throw null;
        }
    }, com.google.android.gms.internal.ads.C4725on0.class, com.google.android.gms.internal.ads.InterfaceC5380ul0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Fl0 f36733b = com.google.android.gms.internal.ads.C5608wp0.d("type.googleapis.com/google.crypto.tink.KmsAeadKey", com.google.android.gms.internal.ads.InterfaceC5380ul0.class, com.google.android.gms.internal.ads.EnumC3529dt0.REMOTE, com.google.android.gms.internal.ads.At0.g0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Np0 f36734c = new com.google.android.gms.internal.ads.Np0() { // from class: com.google.android.gms.internal.ads.in0
        @Override // com.google.android.gms.internal.ads.Np0
        public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Sl0 sl0, java.lang.Integer num) {
            return com.google.android.gms.internal.ads.C4725on0.a((com.google.android.gms.internal.ads.C4945qn0) sl0, num);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f36735d = 0;

    public static void a(boolean z6) {
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(1)) {
            throw new java.security.GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i6 = com.google.android.gms.internal.ads.AbstractC5494vn0.f39458f;
        com.google.android.gms.internal.ads.AbstractC5494vn0.e(com.google.android.gms.internal.ads.Zp0.c());
        com.google.android.gms.internal.ads.Wp0.a().e(f36732a);
        com.google.android.gms.internal.ads.Pp0.b().c(f36734c, com.google.android.gms.internal.ads.C4945qn0.class);
        com.google.android.gms.internal.ads.C4509mp0.c().d(f36733b, true);
    }
}
