package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4833pm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Integer f38068a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Integer f38069b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Integer f38070c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Integer f38071d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4943qm0 f38072e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5052rm0 f38073f = com.google.android.gms.internal.ads.C5052rm0.f38555d;

    /* synthetic */ C4833pm0(com.google.android.gms.internal.ads.AbstractC5162sm0 abstractC5162sm0) {
    }

    public final com.google.android.gms.internal.ads.C4833pm0 a(int i6) throws java.security.InvalidAlgorithmParameterException {
        if (i6 != 16 && i6 != 24 && i6 != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i6)));
        }
        this.f38068a = java.lang.Integer.valueOf(i6);
        return this;
    }

    public final com.google.android.gms.internal.ads.C4833pm0 b(com.google.android.gms.internal.ads.C4943qm0 c4943qm0) {
        this.f38072e = c4943qm0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C4833pm0 c(int i6) throws java.security.InvalidAlgorithmParameterException {
        if (i6 < 16) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", java.lang.Integer.valueOf(i6)));
        }
        this.f38069b = java.lang.Integer.valueOf(i6);
        return this;
    }

    public final com.google.android.gms.internal.ads.C4833pm0 d(int i6) throws java.security.GeneralSecurityException {
        if (i6 < 12 || i6 > 16) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", java.lang.Integer.valueOf(i6)));
        }
        this.f38070c = java.lang.Integer.valueOf(i6);
        return this;
    }

    public final com.google.android.gms.internal.ads.C4833pm0 e(int i6) throws java.security.GeneralSecurityException {
        if (i6 < 10) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; must be at least 10 bytes", java.lang.Integer.valueOf(i6)));
        }
        this.f38071d = java.lang.Integer.valueOf(i6);
        return this;
    }

    public final com.google.android.gms.internal.ads.C4833pm0 f(com.google.android.gms.internal.ads.C5052rm0 c5052rm0) {
        this.f38073f = c5052rm0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C5272tm0 g() throws java.security.GeneralSecurityException {
        if (this.f38068a == null) {
            throw new java.security.GeneralSecurityException("AES key size is not set");
        }
        if (this.f38069b == null) {
            throw new java.security.GeneralSecurityException("HMAC key size is not set");
        }
        if (this.f38070c == null) {
            throw new java.security.GeneralSecurityException("iv size is not set");
        }
        java.lang.Integer num = this.f38071d;
        if (num == null) {
            throw new java.security.GeneralSecurityException("tag size is not set");
        }
        if (this.f38072e == null) {
            throw new java.security.GeneralSecurityException("hash type is not set");
        }
        if (this.f38073f == null) {
            throw new java.security.GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        com.google.android.gms.internal.ads.C4943qm0 c4943qm0 = this.f38072e;
        if (c4943qm0 == com.google.android.gms.internal.ads.C4943qm0.f38312b) {
            if (iIntValue > 20) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (c4943qm0 == com.google.android.gms.internal.ads.C4943qm0.f38313c) {
            if (iIntValue > 28) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (c4943qm0 == com.google.android.gms.internal.ads.C4943qm0.f38314d) {
            if (iIntValue > 32) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (c4943qm0 == com.google.android.gms.internal.ads.C4943qm0.f38315e) {
            if (iIntValue > 48) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (c4943qm0 != com.google.android.gms.internal.ads.C4943qm0.f38316f) {
                throw new java.security.GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new com.google.android.gms.internal.ads.C5272tm0(this.f38068a.intValue(), this.f38069b.intValue(), this.f38070c.intValue(), this.f38071d.intValue(), this.f38073f, this.f38072e, null);
    }
}
