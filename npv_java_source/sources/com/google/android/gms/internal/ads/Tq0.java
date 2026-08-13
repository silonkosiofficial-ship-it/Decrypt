package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Tq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Integer f32002a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Integer f32003b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Uq0 f32004c = com.google.android.gms.internal.ads.Uq0.f32291e;

    /* synthetic */ Tq0(com.google.android.gms.internal.ads.Vq0 vq0) {
    }

    public final com.google.android.gms.internal.ads.Tq0 a(int i6) throws java.security.InvalidAlgorithmParameterException {
        if (i6 != 16 && i6 != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", java.lang.Integer.valueOf(i6 * 8)));
        }
        this.f32002a = java.lang.Integer.valueOf(i6);
        return this;
    }

    public final com.google.android.gms.internal.ads.Tq0 b(int i6) throws java.security.GeneralSecurityException {
        if (i6 >= 10 && i6 <= 16) {
            this.f32003b = java.lang.Integer.valueOf(i6);
            return this;
        }
        throw new java.security.GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i6);
    }

    public final com.google.android.gms.internal.ads.Tq0 c(com.google.android.gms.internal.ads.Uq0 uq0) {
        this.f32004c = uq0;
        return this;
    }

    public final com.google.android.gms.internal.ads.Wq0 d() throws java.security.GeneralSecurityException {
        java.lang.Integer num = this.f32002a;
        if (num == null) {
            throw new java.security.GeneralSecurityException("key size not set");
        }
        if (this.f32003b == null) {
            throw new java.security.GeneralSecurityException("tag size not set");
        }
        if (this.f32004c != null) {
            return new com.google.android.gms.internal.ads.Wq0(num.intValue(), this.f32003b.intValue(), this.f32004c, null);
        }
        throw new java.security.GeneralSecurityException("variant not set");
    }
}
