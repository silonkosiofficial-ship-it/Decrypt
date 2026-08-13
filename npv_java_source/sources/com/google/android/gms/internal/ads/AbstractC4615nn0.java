package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4615nn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Fl0 f37657a = com.google.android.gms.internal.ads.C5608wp0.d("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", com.google.android.gms.internal.ads.InterfaceC5380ul0.class, com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC, com.google.android.gms.internal.ads.Gt0.g0());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Np0 f37658b = new com.google.android.gms.internal.ads.Np0() { // from class: com.google.android.gms.internal.ads.ln0
        @Override // com.google.android.gms.internal.ads.Np0
        public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Sl0 sl0, java.lang.Integer num) {
            return com.google.android.gms.internal.ads.C5604wn0.a((com.google.android.gms.internal.ads.Bn0) sl0, num);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4511mq0 f37659c = com.google.android.gms.internal.ads.AbstractC4511mq0.b(new com.google.android.gms.internal.ads.InterfaceC4291kq0() { // from class: com.google.android.gms.internal.ads.mn0
        @Override // com.google.android.gms.internal.ads.InterfaceC4291kq0
        public final java.lang.Object a(com.google.android.gms.internal.ads.El0 el0) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.C5604wn0 c5604wn0 = (com.google.android.gms.internal.ads.C5604wn0) el0;
            int i6 = com.google.android.gms.internal.ads.AbstractC4615nn0.f37660d;
            java.lang.String strD = c5604wn0.b().d();
            c5604wn0.b().b();
            com.google.android.gms.internal.ads.Ql0.a(strD);
            throw null;
        }
    }, com.google.android.gms.internal.ads.C5604wn0.class, com.google.android.gms.internal.ads.InterfaceC5380ul0.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f37660d = 0;

    public static void a(boolean z6) {
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(1)) {
            throw new java.security.GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i6 = com.google.android.gms.internal.ads.Gn0.f27888f;
        com.google.android.gms.internal.ads.Gn0.e(com.google.android.gms.internal.ads.Zp0.c());
        com.google.android.gms.internal.ads.Pp0.b().c(f37658b, com.google.android.gms.internal.ads.Bn0.class);
        com.google.android.gms.internal.ads.Wp0.a().e(f37659c);
        com.google.android.gms.internal.ads.C4509mp0.c().d(f37657a, true);
    }
}
