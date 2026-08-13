package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4849pu0 implements com.google.android.gms.internal.ads.InterfaceC4959qu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Bu0 f38098a;

    @Override // com.google.android.gms.internal.ads.InterfaceC4959qu0
    public final java.lang.Object o(java.lang.String str) throws java.security.GeneralSecurityException {
        java.util.Iterator it = com.google.android.gms.internal.ads.C5178su0.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        java.lang.Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f38098a.a(str, (java.security.Provider) it.next());
            } catch (java.lang.Exception e6) {
                if (exc == null) {
                    exc = e6;
                }
            }
        }
        throw new java.security.GeneralSecurityException("No good Provider found.", exc);
    }
}
