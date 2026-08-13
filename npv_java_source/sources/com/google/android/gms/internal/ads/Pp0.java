package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Pp0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Np0 f30814b = new com.google.android.gms.internal.ads.Np0() { // from class: com.google.android.gms.internal.ads.Mp0
        @Override // com.google.android.gms.internal.ads.Np0
        public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Sl0 sl0, java.lang.Integer num) throws java.security.GeneralSecurityException {
            int i6 = com.google.android.gms.internal.ads.Pp0.f30816d;
            com.google.android.gms.internal.ads.C4187jt0 c4187jt0C = ((com.google.android.gms.internal.ads.C5938zp0) sl0).b().c();
            com.google.android.gms.internal.ads.Fl0 fl0B = com.google.android.gms.internal.ads.C4509mp0.c().b(c4187jt0C.h0());
            if (!com.google.android.gms.internal.ads.C4509mp0.c().e(c4187jt0C.h0())) {
                throw new java.security.GeneralSecurityException("Creating new keys is not allowed.");
            }
            com.google.android.gms.internal.ads.C3749ft0 c3749ft0A = fl0B.a(c4187jt0C.g0());
            return new com.google.android.gms.internal.ads.C5828yp0(com.google.android.gms.internal.ads.C5720xq0.a(c3749ft0A.g0(), c3749ft0A.f0(), c3749ft0A.c0(), c4187jt0C.f0(), num), com.google.android.gms.internal.ads.Dl0.a());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Pp0 f30815c = e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f30816d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f30817a = new java.util.HashMap();

    public static com.google.android.gms.internal.ads.Pp0 b() {
        return f30815c;
    }

    private final synchronized com.google.android.gms.internal.ads.El0 d(com.google.android.gms.internal.ads.Sl0 sl0, java.lang.Integer num) {
        com.google.android.gms.internal.ads.Np0 np0;
        np0 = (com.google.android.gms.internal.ads.Np0) this.f30817a.get(sl0.getClass());
        if (np0 == null) {
            throw new java.security.GeneralSecurityException("Cannot create a new key for parameters " + sl0.toString() + ": no key creator for this class was registered.");
        }
        return np0.a(sl0, num);
    }

    private static com.google.android.gms.internal.ads.Pp0 e() {
        com.google.android.gms.internal.ads.Pp0 pp0 = new com.google.android.gms.internal.ads.Pp0();
        try {
            pp0.c(f30814b, com.google.android.gms.internal.ads.C5938zp0.class);
            return pp0;
        } catch (java.security.GeneralSecurityException e6) {
            throw new java.lang.IllegalStateException("unexpected error.", e6);
        }
    }

    public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Sl0 sl0, java.lang.Integer num) {
        return d(sl0, num);
    }

    public final synchronized void c(com.google.android.gms.internal.ads.Np0 np0, java.lang.Class cls) {
        try {
            com.google.android.gms.internal.ads.Np0 np1 = (com.google.android.gms.internal.ads.Np0) this.f30817a.get(cls);
            if (np1 != null && !np1.equals(np0)) {
                throw new java.security.GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.f30817a.put(cls, np0);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
