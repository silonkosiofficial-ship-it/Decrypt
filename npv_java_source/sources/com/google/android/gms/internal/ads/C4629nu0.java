package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4629nu0 implements com.google.android.gms.internal.ads.InterfaceC4959qu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Bu0 f37693a;

    @Override // com.google.android.gms.internal.ads.InterfaceC4959qu0
    public final java.lang.Object o(java.lang.String str) {
        java.util.Iterator it = com.google.android.gms.internal.ads.C5178su0.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.f37693a.a(str, (java.security.Provider) it.next());
            } catch (java.lang.Exception unused) {
            }
        }
        return this.f37693a.a(str, null);
    }
}
