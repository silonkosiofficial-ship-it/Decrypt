package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Am0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Integer f25783a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Integer f25784b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Integer f25785c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Bm0 f25786d = com.google.android.gms.internal.ads.Bm0.f26017d;

    /* synthetic */ Am0(com.google.android.gms.internal.ads.Cm0 cm0) {
    }

    public final com.google.android.gms.internal.ads.Am0 a(int i6) throws java.security.GeneralSecurityException {
        if (i6 != 12 && i6 != 16) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", java.lang.Integer.valueOf(i6)));
        }
        this.f25784b = java.lang.Integer.valueOf(i6);
        return this;
    }

    public final com.google.android.gms.internal.ads.Am0 b(int i6) throws java.security.InvalidAlgorithmParameterException {
        if (i6 != 16 && i6 != 24 && i6 != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i6)));
        }
        this.f25783a = java.lang.Integer.valueOf(i6);
        return this;
    }

    public final com.google.android.gms.internal.ads.Am0 c(int i6) {
        this.f25785c = 16;
        return this;
    }

    public final com.google.android.gms.internal.ads.Am0 d(com.google.android.gms.internal.ads.Bm0 bm0) {
        this.f25786d = bm0;
        return this;
    }

    public final com.google.android.gms.internal.ads.Dm0 e() throws java.security.GeneralSecurityException {
        java.lang.Integer num = this.f25783a;
        if (num == null) {
            throw new java.security.GeneralSecurityException("Key size is not set");
        }
        if (this.f25784b == null) {
            throw new java.security.GeneralSecurityException("IV size is not set");
        }
        if (this.f25786d == null) {
            throw new java.security.GeneralSecurityException("Variant is not set");
        }
        if (this.f25785c == null) {
            throw new java.security.GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.f25784b.intValue();
        this.f25785c.intValue();
        return new com.google.android.gms.internal.ads.Dm0(iIntValue, iIntValue2, 16, this.f25786d, null);
    }
}
