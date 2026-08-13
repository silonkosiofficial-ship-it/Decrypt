package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class PM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f30708a = new java.util.HashMap();

    PM() {
    }

    public final synchronized com.google.android.gms.internal.ads.OM a(java.lang.String str) {
        return (com.google.android.gms.internal.ads.OM) this.f30708a.get(str);
    }

    public final java.lang.String b(java.lang.String str) {
        com.google.android.gms.internal.ads.C3956hn c3956hn;
        com.google.android.gms.internal.ads.OM omA = a(str);
        return (omA == null || (c3956hn = omA.f30490b) == null) ? "" : c3956hn.toString();
    }

    final synchronized void c(java.lang.String str, com.google.android.gms.internal.ads.M70 m70) {
        com.google.android.gms.internal.ads.C3956hn c3956hnJ;
        if (this.f30708a.containsKey(str)) {
            return;
        }
        com.google.android.gms.internal.ads.C3956hn c3956hnK = null;
        if (m70 == null) {
            c3956hnJ = null;
        } else {
            try {
                c3956hnJ = m70.j();
            } catch (com.google.android.gms.internal.ads.C5315u70 unused) {
                c3956hnJ = null;
            }
        }
        if (m70 != null) {
            try {
                c3956hnK = m70.k();
            } catch (com.google.android.gms.internal.ads.C5315u70 unused2) {
            }
        }
        boolean z6 = true;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25620l9)).booleanValue()) {
            if (m70 == null) {
                z6 = false;
            } else {
                try {
                    m70.c();
                } catch (com.google.android.gms.internal.ads.C5315u70 unused3) {
                    z6 = false;
                }
            }
        }
        this.f30708a.put(str, new com.google.android.gms.internal.ads.OM(str, c3956hnJ, c3956hnK, z6));
    }

    final synchronized void d(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2874Tm interfaceC2874Tm) {
        if (this.f30708a.containsKey(str)) {
            return;
        }
        try {
            this.f30708a.put(str, new com.google.android.gms.internal.ads.OM(str, interfaceC2874Tm.e(), interfaceC2874Tm.i(), true));
        } catch (java.lang.Throwable unused) {
        }
    }
}
