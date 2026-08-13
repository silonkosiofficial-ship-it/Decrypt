package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4183jr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Integer f36751a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Integer f36752b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4293kr0 f36753c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4403lr0 f36754d = com.google.android.gms.internal.ads.C4403lr0.f37244e;

    /* synthetic */ C4183jr0(com.google.android.gms.internal.ads.AbstractC4513mr0 abstractC4513mr0) {
    }

    public final com.google.android.gms.internal.ads.C4183jr0 a(com.google.android.gms.internal.ads.C4293kr0 c4293kr0) {
        this.f36753c = c4293kr0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C4183jr0 b(int i6) {
        this.f36751a = java.lang.Integer.valueOf(i6);
        return this;
    }

    public final com.google.android.gms.internal.ads.C4183jr0 c(int i6) {
        this.f36752b = java.lang.Integer.valueOf(i6);
        return this;
    }

    public final com.google.android.gms.internal.ads.C4183jr0 d(com.google.android.gms.internal.ads.C4403lr0 c4403lr0) {
        this.f36754d = c4403lr0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C4623nr0 e() throws java.security.GeneralSecurityException {
        java.lang.Integer num = this.f36751a;
        if (num == null) {
            throw new java.security.GeneralSecurityException("key size is not set");
        }
        if (this.f36752b == null) {
            throw new java.security.GeneralSecurityException("tag size is not set");
        }
        if (this.f36753c == null) {
            throw new java.security.GeneralSecurityException("hash type is not set");
        }
        if (this.f36754d == null) {
            throw new java.security.GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f36751a));
        }
        java.lang.Integer num2 = this.f36752b;
        int iIntValue = num2.intValue();
        com.google.android.gms.internal.ads.C4293kr0 c4293kr0 = this.f36753c;
        if (iIntValue < 10) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (c4293kr0 == com.google.android.gms.internal.ads.C4293kr0.f37016b) {
            if (iIntValue > 20) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (c4293kr0 == com.google.android.gms.internal.ads.C4293kr0.f37017c) {
            if (iIntValue > 28) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (c4293kr0 == com.google.android.gms.internal.ads.C4293kr0.f37018d) {
            if (iIntValue > 32) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (c4293kr0 == com.google.android.gms.internal.ads.C4293kr0.f37019e) {
            if (iIntValue > 48) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (c4293kr0 != com.google.android.gms.internal.ads.C4293kr0.f37020f) {
                throw new java.security.GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new com.google.android.gms.internal.ads.C4623nr0(this.f36751a.intValue(), this.f36752b.intValue(), this.f36754d, this.f36753c, null);
    }
}
