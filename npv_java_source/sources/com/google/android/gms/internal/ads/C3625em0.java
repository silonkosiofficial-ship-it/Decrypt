package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.em0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3625em0 implements com.google.android.gms.internal.ads.InterfaceC5380ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5500vq0 f35048a;

    /* synthetic */ C3625em0(com.google.android.gms.internal.ads.C5500vq0 c5500vq0, com.google.android.gms.internal.ads.AbstractC3735fm0 abstractC3735fm0) {
        this.f35048a = c5500vq0;
        if (c5500vq0.g()) {
            com.google.android.gms.internal.ads.Ep0 ep0A = com.google.android.gms.internal.ads.Up0.b().a();
            com.google.android.gms.internal.ads.Ip0 ip0A = com.google.android.gms.internal.ads.Lp0.a(c5500vq0);
            ep0A.a(ip0A, "aead", "encrypt");
            ep0A.a(ip0A, "aead", "decrypt");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5380ul0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr.length > 5) {
            for (com.google.android.gms.internal.ads.C5280tq0 c5280tq0 : this.f35048a.f(java.util.Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] bArrA = ((com.google.android.gms.internal.ads.InterfaceC5380ul0) c5280tq0.d()).a(bArr, bArr2);
                    c5280tq0.a();
                    return bArrA;
                } catch (java.security.GeneralSecurityException unused) {
                }
            }
        }
        for (com.google.android.gms.internal.ads.C5280tq0 c5280tq1 : this.f35048a.f(com.google.android.gms.internal.ads.AbstractC5930zl0.f40372a)) {
            try {
                byte[] bArrA2 = ((com.google.android.gms.internal.ads.InterfaceC5380ul0) c5280tq1.d()).a(bArr, bArr2);
                c5280tq1.a();
                return bArrA2;
            } catch (java.security.GeneralSecurityException unused2) {
            }
        }
        throw new java.security.GeneralSecurityException("decryption failed");
    }
}
