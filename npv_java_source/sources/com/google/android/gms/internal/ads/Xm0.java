package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Xm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Integer f33167a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Ym0 f33168b = com.google.android.gms.internal.ads.Ym0.f33406d;

    /* synthetic */ Xm0(com.google.android.gms.internal.ads.Zm0 zm0) {
    }

    public final com.google.android.gms.internal.ads.Xm0 a(int i6) throws java.security.InvalidAlgorithmParameterException {
        if (i6 != 16 && i6 != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i6)));
        }
        this.f33167a = java.lang.Integer.valueOf(i6);
        return this;
    }

    public final com.google.android.gms.internal.ads.Xm0 b(com.google.android.gms.internal.ads.Ym0 ym0) {
        this.f33168b = ym0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3189an0 c() throws java.security.GeneralSecurityException {
        java.lang.Integer num = this.f33167a;
        if (num == null) {
            throw new java.security.GeneralSecurityException("Key size is not set");
        }
        if (this.f33168b != null) {
            return new com.google.android.gms.internal.ads.C3189an0(num.intValue(), this.f33168b, null);
        }
        throw new java.security.GeneralSecurityException("Variant is not set");
    }
}
