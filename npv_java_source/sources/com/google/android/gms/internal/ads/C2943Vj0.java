package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2943Vj0 extends com.google.android.gms.internal.ads.AbstractC2724Pj0 {
    /* synthetic */ C2943Vj0(com.google.android.gms.internal.ads.AbstractC3731fk0 abstractC3731fk0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final com.google.android.gms.internal.ads.C2835Sj0 a(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, com.google.android.gms.internal.ads.C2835Sj0 c2835Sj0) {
        com.google.android.gms.internal.ads.C2835Sj0 c2835Sj1;
        synchronized (abstractC3183ak0) {
            try {
                c2835Sj1 = abstractC3183ak0.f34137D;
                if (c2835Sj1 != c2835Sj0) {
                    abstractC3183ak0.f34137D = c2835Sj0;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c2835Sj1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final com.google.android.gms.internal.ads.C3087Zj0 b(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0) {
        com.google.android.gms.internal.ads.C3087Zj0 c3087Zj1;
        synchronized (abstractC3183ak0) {
            try {
                c3087Zj1 = abstractC3183ak0.f34138E;
                if (c3087Zj1 != c3087Zj0) {
                    abstractC3183ak0.f34138E = c3087Zj0;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c3087Zj1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final void c(com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0, com.google.android.gms.internal.ads.C3087Zj0 c3087Zj1) {
        c3087Zj0.f33653b = c3087Zj1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final void d(com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0, java.lang.Thread thread) {
        c3087Zj0.f33652a = thread;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final boolean e(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, com.google.android.gms.internal.ads.C2835Sj0 c2835Sj0, com.google.android.gms.internal.ads.C2835Sj0 c2835Sj1) {
        synchronized (abstractC3183ak0) {
            try {
                if (abstractC3183ak0.f34137D != c2835Sj0) {
                    return false;
                }
                abstractC3183ak0.f34137D = c2835Sj1;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final boolean f(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, java.lang.Object obj, java.lang.Object obj2) {
        synchronized (abstractC3183ak0) {
            try {
                if (abstractC3183ak0.f34136C != obj) {
                    return false;
                }
                abstractC3183ak0.f34136C = obj2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final boolean g(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0, com.google.android.gms.internal.ads.C3087Zj0 c3087Zj1) {
        synchronized (abstractC3183ak0) {
            try {
                if (abstractC3183ak0.f34138E != c3087Zj0) {
                    return false;
                }
                abstractC3183ak0.f34138E = c3087Zj1;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
