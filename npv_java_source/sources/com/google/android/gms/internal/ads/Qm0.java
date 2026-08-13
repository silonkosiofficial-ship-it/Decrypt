package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Qm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3189an0 f31054a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Mu0 f31055b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Integer f31056c = null;

    /* synthetic */ Qm0(com.google.android.gms.internal.ads.Rm0 rm0) {
    }

    public final com.google.android.gms.internal.ads.Qm0 a(java.lang.Integer num) {
        this.f31056c = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.Qm0 b(com.google.android.gms.internal.ads.Mu0 mu0) {
        this.f31055b = mu0;
        return this;
    }

    public final com.google.android.gms.internal.ads.Qm0 c(com.google.android.gms.internal.ads.C3189an0 c3189an0) {
        this.f31054a = c3189an0;
        return this;
    }

    public final com.google.android.gms.internal.ads.Sm0 d() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Mu0 mu0;
        com.google.android.gms.internal.ads.Lu0 lu0B;
        com.google.android.gms.internal.ads.C3189an0 c3189an0 = this.f31054a;
        if (c3189an0 == null || (mu0 = this.f31055b) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c3189an0.b() != mu0.a()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (c3189an0.a() && this.f31056c == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f31054a.a() && this.f31056c != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f31054a.d() == com.google.android.gms.internal.ads.Ym0.f33406d) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.f34152a;
        } else if (this.f31054a.d() == com.google.android.gms.internal.ads.Ym0.f33405c) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.a(this.f31056c.intValue());
        } else {
            if (this.f31054a.d() != com.google.android.gms.internal.ads.Ym0.f33404b) {
                throw new java.lang.IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(java.lang.String.valueOf(this.f31054a.d())));
            }
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.b(this.f31056c.intValue());
        }
        return new com.google.android.gms.internal.ads.Sm0(this.f31054a, this.f31055b, lu0B, this.f31056c, null);
    }
}
