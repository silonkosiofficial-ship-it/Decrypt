package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Mm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Integer f29827a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Integer f29828b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Integer f29829c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Nm0 f29830d = com.google.android.gms.internal.ads.Nm0.f30374d;

    /* synthetic */ Mm0(com.google.android.gms.internal.ads.Om0 om0) {
    }

    public final com.google.android.gms.internal.ads.Mm0 a(int i6) {
        this.f29828b = 12;
        return this;
    }

    public final com.google.android.gms.internal.ads.Mm0 b(int i6) throws java.security.InvalidAlgorithmParameterException {
        if (i6 != 16 && i6 != 24 && i6 != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i6)));
        }
        this.f29827a = java.lang.Integer.valueOf(i6);
        return this;
    }

    public final com.google.android.gms.internal.ads.Mm0 c(int i6) {
        this.f29829c = 16;
        return this;
    }

    public final com.google.android.gms.internal.ads.Mm0 d(com.google.android.gms.internal.ads.Nm0 nm0) {
        this.f29830d = nm0;
        return this;
    }

    public final com.google.android.gms.internal.ads.Pm0 e() throws java.security.GeneralSecurityException {
        java.lang.Integer num = this.f29827a;
        if (num == null) {
            throw new java.security.GeneralSecurityException("Key size is not set");
        }
        if (this.f29830d == null) {
            throw new java.security.GeneralSecurityException("Variant is not set");
        }
        if (this.f29828b == null) {
            throw new java.security.GeneralSecurityException("IV size is not set");
        }
        if (this.f29829c == null) {
            throw new java.security.GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.f29828b.intValue();
        this.f29829c.intValue();
        return new com.google.android.gms.internal.ads.Pm0(iIntValue, 12, 16, this.f29830d, null);
    }
}
