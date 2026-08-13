package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Po0 implements com.google.android.gms.internal.ads.InterfaceC5380ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5380ul0 f30807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f30808b;

    private Po0(com.google.android.gms.internal.ads.InterfaceC5380ul0 interfaceC5380ul0, byte[] bArr) {
        this.f30807a = interfaceC5380ul0;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new java.lang.IllegalArgumentException("identifier has an invalid length");
        }
        this.f30808b = bArr;
    }

    public static com.google.android.gms.internal.ads.InterfaceC5380ul0 b(com.google.android.gms.internal.ads.C5828yp0 c5828yp0) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Lu0 lu0B;
        com.google.android.gms.internal.ads.C5720xq0 c5720xq0A = c5828yp0.a(com.google.android.gms.internal.ads.Dl0.a());
        com.google.android.gms.internal.ads.C3420ct0 c3420ct0B0 = com.google.android.gms.internal.ads.C3749ft0.b0();
        c3420ct0B0.A(c5720xq0A.g());
        c3420ct0B0.B(c5720xq0A.d());
        c3420ct0B0.z(c5720xq0A.b());
        com.google.android.gms.internal.ads.InterfaceC5380ul0 interfaceC5380ul0 = (com.google.android.gms.internal.ads.InterfaceC5380ul0) com.google.android.gms.internal.ads.Vl0.b((com.google.android.gms.internal.ads.C3749ft0) c3420ct0B0.u(), com.google.android.gms.internal.ads.InterfaceC5380ul0.class);
        com.google.android.gms.internal.ads.Kt0 kt0C = c5720xq0A.c();
        int iOrdinal = kt0C.ordinal();
        if (iOrdinal == 1) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.b(c5828yp0.b().intValue());
        } else if (iOrdinal == 2) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.a(c5828yp0.b().intValue());
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("unknown output prefix type ".concat(java.lang.String.valueOf(kt0C)));
            }
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.a(c5828yp0.b().intValue());
        } else {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.f34152a;
        }
        return new com.google.android.gms.internal.ads.Po0(interfaceC5380ul0, lu0B.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5380ul0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.f30808b;
        if (bArr3.length == 0) {
            return this.f30807a.a(bArr, bArr2);
        }
        if (com.google.android.gms.internal.ads.Kq0.c(bArr3, bArr)) {
            return this.f30807a.a(java.util.Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new java.security.GeneralSecurityException("wrong prefix");
    }
}
