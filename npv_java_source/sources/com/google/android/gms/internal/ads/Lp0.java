package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Lp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.Dp0 f29574a = new com.google.android.gms.internal.ads.Jp0(null);

    public static com.google.android.gms.internal.ads.Ip0 a(com.google.android.gms.internal.ads.C5500vq0 c5500vq0) {
        com.google.android.gms.internal.ads.Gl0 gl0;
        com.google.android.gms.internal.ads.Fp0 fp0 = new com.google.android.gms.internal.ads.Fp0();
        fp0.b(c5500vq0.a());
        java.util.Iterator it = c5500vq0.e().iterator();
        while (it.hasNext()) {
            for (com.google.android.gms.internal.ads.C5280tq0 c5280tq0 : (java.util.List) it.next()) {
                int iF = c5280tq0.f() - 2;
                if (iF == 1) {
                    gl0 = com.google.android.gms.internal.ads.Gl0.f27875b;
                } else if (iF == 2) {
                    gl0 = com.google.android.gms.internal.ads.Gl0.f27876c;
                } else {
                    if (iF != 3) {
                        throw new java.lang.IllegalStateException("Unknown key status");
                    }
                    gl0 = com.google.android.gms.internal.ads.Gl0.f27877d;
                }
                int iA = c5280tq0.a();
                java.lang.String strE = c5280tq0.e();
                if (strE.startsWith("type.googleapis.com/google.crypto.")) {
                    strE = strE.substring(34);
                }
                fp0.a(gl0, iA, strE, c5280tq0.b().name());
            }
        }
        if (c5500vq0.c() != null) {
            fp0.c(c5500vq0.c().a());
        }
        try {
            return fp0.d();
        } catch (java.security.GeneralSecurityException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }
}
