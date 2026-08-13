package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Em0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Pm0 f27104a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Mu0 f27105b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Integer f27106c = null;

    /* synthetic */ Em0(com.google.android.gms.internal.ads.Fm0 fm0) {
    }

    public final com.google.android.gms.internal.ads.Em0 a(java.lang.Integer num) {
        this.f27106c = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.Em0 b(com.google.android.gms.internal.ads.Mu0 mu0) {
        this.f27105b = mu0;
        return this;
    }

    public final com.google.android.gms.internal.ads.Em0 c(com.google.android.gms.internal.ads.Pm0 pm0) {
        this.f27104a = pm0;
        return this;
    }

    public final com.google.android.gms.internal.ads.Gm0 d() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Mu0 mu0;
        com.google.android.gms.internal.ads.Lu0 lu0B;
        com.google.android.gms.internal.ads.Pm0 pm0 = this.f27104a;
        if (pm0 == null || (mu0 = this.f27105b) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (pm0.b() != mu0.a()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (pm0.a() && this.f27106c == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f27104a.a() && this.f27106c != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f27104a.d() == com.google.android.gms.internal.ads.Nm0.f30374d) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.f34152a;
        } else if (this.f27104a.d() == com.google.android.gms.internal.ads.Nm0.f30373c) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.a(this.f27106c.intValue());
        } else {
            if (this.f27104a.d() != com.google.android.gms.internal.ads.Nm0.f30372b) {
                throw new java.lang.IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(java.lang.String.valueOf(this.f27104a.d())));
            }
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.b(this.f27106c.intValue());
        }
        return new com.google.android.gms.internal.ads.Gm0(this.f27104a, this.f27105b, lu0B, this.f27106c, null);
    }
}
