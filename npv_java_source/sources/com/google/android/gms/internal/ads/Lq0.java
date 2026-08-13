package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Lq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Wq0 f29575a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Mu0 f29576b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Integer f29577c = null;

    /* synthetic */ Lq0(com.google.android.gms.internal.ads.Mq0 mq0) {
    }

    public final com.google.android.gms.internal.ads.Lq0 a(com.google.android.gms.internal.ads.Mu0 mu0) {
        this.f29576b = mu0;
        return this;
    }

    public final com.google.android.gms.internal.ads.Lq0 b(java.lang.Integer num) {
        this.f29577c = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.Lq0 c(com.google.android.gms.internal.ads.Wq0 wq0) {
        this.f29575a = wq0;
        return this;
    }

    public final com.google.android.gms.internal.ads.Nq0 d() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Mu0 mu0;
        com.google.android.gms.internal.ads.Lu0 lu0A;
        com.google.android.gms.internal.ads.Wq0 wq0 = this.f29575a;
        if (wq0 == null || (mu0 = this.f29576b) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (wq0.c() != mu0.a()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (wq0.a() && this.f29577c == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f29575a.a() && this.f29577c != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f29575a.f() == com.google.android.gms.internal.ads.Uq0.f32291e) {
            lu0A = com.google.android.gms.internal.ads.AbstractC3195aq0.f34152a;
        } else if (this.f29575a.f() == com.google.android.gms.internal.ads.Uq0.f32290d || this.f29575a.f() == com.google.android.gms.internal.ads.Uq0.f32289c) {
            lu0A = com.google.android.gms.internal.ads.AbstractC3195aq0.a(this.f29577c.intValue());
        } else {
            if (this.f29575a.f() != com.google.android.gms.internal.ads.Uq0.f32288b) {
                throw new java.lang.IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(java.lang.String.valueOf(this.f29575a.f())));
            }
            lu0A = com.google.android.gms.internal.ads.AbstractC3195aq0.b(this.f29577c.intValue());
        }
        return new com.google.android.gms.internal.ads.Nq0(this.f29575a, this.f29576b, lu0A, this.f29577c, null);
    }
}
