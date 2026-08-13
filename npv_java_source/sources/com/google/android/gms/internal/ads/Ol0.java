package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Ol0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5066rt0 f30558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f30559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Cp0 f30560c;

    private Ol0(com.google.android.gms.internal.ads.C5066rt0 c5066rt0, java.util.List list) {
        this.f30558a = c5066rt0;
        this.f30559b = list;
        this.f30560c = com.google.android.gms.internal.ads.Cp0.f26289b;
    }

    /* synthetic */ Ol0(com.google.android.gms.internal.ads.C5066rt0 c5066rt0, java.util.List list, com.google.android.gms.internal.ads.Cp0 cp0, com.google.android.gms.internal.ads.Nl0 nl0) {
        this.f30558a = c5066rt0;
        this.f30559b = list;
        this.f30560c = cp0;
    }

    static final com.google.android.gms.internal.ads.Ol0 a(com.google.android.gms.internal.ads.C5066rt0 c5066rt0) throws java.security.GeneralSecurityException {
        h(c5066rt0);
        return new com.google.android.gms.internal.ads.Ol0(c5066rt0, g(c5066rt0));
    }

    public static final com.google.android.gms.internal.ads.Ol0 b(com.google.android.gms.internal.ads.Sl0 sl0) {
        com.google.android.gms.internal.ads.Ll0 ll0 = new com.google.android.gms.internal.ads.Ll0();
        com.google.android.gms.internal.ads.Jl0 jl0 = new com.google.android.gms.internal.ads.Jl0(sl0, null);
        jl0.d();
        jl0.c();
        ll0.a(jl0);
        return ll0.b();
    }

    private final java.lang.Object f(com.google.android.gms.internal.ads.AbstractC4399lp0 abstractC4399lp0, java.lang.Class cls, java.lang.Class cls2) throws java.security.GeneralSecurityException {
        int i6 = com.google.android.gms.internal.ads.Zl0.f33655a;
        com.google.android.gms.internal.ads.C5066rt0 c5066rt0 = this.f30558a;
        int iC0 = c5066rt0.c0();
        int i10 = 0;
        boolean z6 = false;
        boolean z10 = true;
        for (com.google.android.gms.internal.ads.C4847pt0 c4847pt0 : c5066rt0.h0()) {
            if (c4847pt0.k0() == 3) {
                if (!c4847pt0.j0()) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("key %d has no key data", java.lang.Integer.valueOf(c4847pt0.b0())));
                }
                if (c4847pt0.f0() == com.google.android.gms.internal.ads.Kt0.UNKNOWN_PREFIX) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("key %d has unknown prefix", java.lang.Integer.valueOf(c4847pt0.b0())));
                }
                if (c4847pt0.k0() == 2) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("key %d has unknown status", java.lang.Integer.valueOf(c4847pt0.b0())));
                }
                if (c4847pt0.b0() == iC0) {
                    if (z6) {
                        throw new java.security.GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z6 = true;
                }
                z10 &= c4847pt0.c0().c0() == com.google.android.gms.internal.ads.EnumC3529dt0.ASYMMETRIC_PUBLIC;
                i10++;
            }
        }
        if (i10 == 0) {
            throw new java.security.GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z6 && !z10) {
            throw new java.security.GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        com.google.android.gms.internal.ads.C5170sq0 c5170sq0B = com.google.android.gms.internal.ads.C5500vq0.b(cls2);
        c5170sq0B.c(this.f30560c);
        for (int i11 = 0; i11 < this.f30559b.size(); i11++) {
            com.google.android.gms.internal.ads.C4847pt0 c4847pt0E0 = this.f30558a.e0(i11);
            if (c4847pt0E0.k0() == 3) {
                com.google.android.gms.internal.ads.Ml0 ml0 = (com.google.android.gms.internal.ads.Ml0) this.f30559b.get(i11);
                if (ml0 == null) {
                    throw new java.security.GeneralSecurityException("Key parsing of key with index " + i11 + " and type_url " + c4847pt0E0.c0().g0() + " failed, unable to get primitive");
                }
                com.google.android.gms.internal.ads.El0 el0A = ml0.a();
                try {
                    java.lang.Object objB = abstractC4399lp0.b(el0A, cls2);
                    if (c4847pt0E0.b0() == this.f30558a.c0()) {
                        c5170sq0B.b(objB, el0A, c4847pt0E0);
                    } else {
                        c5170sq0B.a(objB, el0A, c4847pt0E0);
                    }
                } catch (java.security.GeneralSecurityException e6) {
                    throw new java.security.GeneralSecurityException("Unable to get primitive " + cls2.toString() + " for key of type " + c4847pt0E0.c0().g0() + ", see https://developers.google.com/tink/faq/registration_errors", e6);
                }
            }
        }
        return abstractC4399lp0.c(c5170sq0B.d(), cls);
    }

    private static java.util.List g(com.google.android.gms.internal.ads.C5066rt0 c5066rt0) {
        com.google.android.gms.internal.ads.Gl0 gl0;
        java.util.ArrayList arrayList = new java.util.ArrayList(c5066rt0.b0());
        for (com.google.android.gms.internal.ads.C4847pt0 c4847pt0 : c5066rt0.h0()) {
            int iB0 = c4847pt0.b0();
            try {
                com.google.android.gms.internal.ads.C5720xq0 c5720xq0A = com.google.android.gms.internal.ads.C5720xq0.a(c4847pt0.c0().g0(), c4847pt0.c0().f0(), c4847pt0.c0().c0(), c4847pt0.f0(), c4847pt0.f0() == com.google.android.gms.internal.ads.Kt0.RAW ? null : java.lang.Integer.valueOf(c4847pt0.b0()));
                com.google.android.gms.internal.ads.Zp0 zp0C = com.google.android.gms.internal.ads.Zp0.c();
                com.google.android.gms.internal.ads.Wl0 wl0A = com.google.android.gms.internal.ads.Wl0.a();
                com.google.android.gms.internal.ads.El0 c5828yp0 = !zp0C.j(c5720xq0A) ? new com.google.android.gms.internal.ads.C5828yp0(c5720xq0A, wl0A) : zp0C.a(c5720xq0A, wl0A);
                int iK0 = c4847pt0.k0() - 2;
                if (iK0 == 1) {
                    gl0 = com.google.android.gms.internal.ads.Gl0.f27875b;
                } else if (iK0 == 2) {
                    gl0 = com.google.android.gms.internal.ads.Gl0.f27876c;
                } else {
                    if (iK0 != 3) {
                        throw new java.security.GeneralSecurityException("Unknown key status");
                    }
                    gl0 = com.google.android.gms.internal.ads.Gl0.f27877d;
                }
                arrayList.add(new com.google.android.gms.internal.ads.Ml0(c5828yp0, gl0, iB0, iB0 == c5066rt0.c0(), null));
            } catch (java.security.GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(com.google.android.gms.internal.ads.C5066rt0 c5066rt0) throws java.security.GeneralSecurityException {
        if (c5066rt0 == null || c5066rt0.b0() <= 0) {
            throw new java.security.GeneralSecurityException("empty keyset");
        }
    }

    final com.google.android.gms.internal.ads.C5066rt0 c() {
        return this.f30558a;
    }

    public final java.lang.Object d(com.google.android.gms.internal.ads.AbstractC5820yl0 abstractC5820yl0, java.lang.Class cls) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.AbstractC4399lp0 abstractC4399lp0 = (com.google.android.gms.internal.ads.AbstractC4399lp0) abstractC5820yl0;
        java.lang.Class clsA = abstractC4399lp0.a(cls);
        if (clsA != null) {
            return f(abstractC4399lp0, cls, clsA);
        }
        throw new java.security.GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public final java.lang.String toString() {
        int i6 = com.google.android.gms.internal.ads.Zl0.f33655a;
        com.google.android.gms.internal.ads.C5176st0 c5176st0B0 = com.google.android.gms.internal.ads.C5726xt0.b0();
        com.google.android.gms.internal.ads.C5066rt0 c5066rt0 = this.f30558a;
        c5176st0B0.A(c5066rt0.c0());
        for (com.google.android.gms.internal.ads.C4847pt0 c4847pt0 : c5066rt0.h0()) {
            com.google.android.gms.internal.ads.C5286tt0 c5286tt0B0 = com.google.android.gms.internal.ads.C5506vt0.b0();
            c5286tt0B0.B(c4847pt0.c0().g0());
            c5286tt0B0.C(c4847pt0.k0());
            c5286tt0B0.A(c4847pt0.f0());
            c5286tt0B0.z(c4847pt0.b0());
            c5176st0B0.z((com.google.android.gms.internal.ads.C5506vt0) c5286tt0B0.u());
        }
        return ((com.google.android.gms.internal.ads.C5726xt0) c5176st0B0.u()).toString();
    }
}
