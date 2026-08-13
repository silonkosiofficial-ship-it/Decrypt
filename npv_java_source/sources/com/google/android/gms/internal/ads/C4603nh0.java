package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4603nh0 extends com.google.android.gms.internal.ads.AbstractC2493Je0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3843gl0 f37637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f37638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f37639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f37640h;

    public C4603nh0() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f37640h;
        if (i11 == 0) {
            return -1;
        }
        int iMin = java.lang.Math.min(i10, i11);
        byte[] bArr2 = this.f37638f;
        int i12 = com.google.android.gms.internal.ads.EW.f27061a;
        java.lang.System.arraycopy(bArr2, this.f37639g, bArr, i6, iMin);
        this.f37639g += iMin;
        this.f37640h -= iMin;
        D(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) throws com.google.android.gms.internal.ads.C4708of, com.google.android.gms.internal.ads.C2722Pi0 {
        h(c3843gl0);
        this.f37637e = c3843gl0;
        android.net.Uri uriNormalizeScheme = c3843gl0.f35675a.normalizeScheme();
        java.lang.String scheme = uriNormalizeScheme.getScheme();
        com.google.android.gms.internal.ads.LC.e("data".equals(scheme), "Unsupported scheme: ".concat(java.lang.String.valueOf(scheme)));
        java.lang.String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        java.lang.String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw com.google.android.gms.internal.ads.C4708of.b("Unexpected URI format: ".concat(java.lang.String.valueOf(uriNormalizeScheme)), null);
        }
        java.lang.String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f37638f = android.util.Base64.decode(str, 0);
            } catch (java.lang.IllegalArgumentException e6) {
                throw com.google.android.gms.internal.ads.C4708of.b("Error while parsing Base64 encoded string: ".concat(java.lang.String.valueOf(str)), e6);
            }
        } else {
            this.f37638f = java.net.URLDecoder.decode(str, java.nio.charset.StandardCharsets.US_ASCII.name()).getBytes(java.nio.charset.StandardCharsets.UTF_8);
        }
        long j6 = c3843gl0.f35679e;
        int length = this.f37638f.length;
        if (j6 > length) {
            this.f37638f = null;
            throw new com.google.android.gms.internal.ads.C2722Pi0(2008);
        }
        int i10 = (int) j6;
        this.f37639g = i10;
        int i11 = length - i10;
        this.f37640h = i11;
        long j10 = c3843gl0.f35680f;
        if (j10 != -1) {
            this.f37640h = (int) java.lang.Math.min(i11, j10);
        }
        i(c3843gl0);
        long j11 = c3843gl0.f35680f;
        return j11 != -1 ? j11 : this.f37640h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        com.google.android.gms.internal.ads.C3843gl0 c3843gl0 = this.f37637e;
        if (c3843gl0 != null) {
            return c3843gl0.f35675a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() {
        if (this.f37638f != null) {
            this.f37638f = null;
            g();
        }
        this.f37637e = null;
    }
}
