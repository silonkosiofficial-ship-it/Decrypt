package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.um0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5382um0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Dm0 f39215a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Mu0 f39216b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Integer f39217c = null;

    /* synthetic */ C5382um0(com.google.android.gms.internal.ads.AbstractC5492vm0 abstractC5492vm0) {
    }

    public final com.google.android.gms.internal.ads.C5382um0 a(java.lang.Integer num) {
        this.f39217c = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.C5382um0 b(com.google.android.gms.internal.ads.Mu0 mu0) {
        this.f39216b = mu0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C5382um0 c(com.google.android.gms.internal.ads.Dm0 dm0) {
        this.f39215a = dm0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C5602wm0 d() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Mu0 mu0;
        com.google.android.gms.internal.ads.Lu0 lu0B;
        com.google.android.gms.internal.ads.Dm0 dm0 = this.f39215a;
        if (dm0 == null || (mu0 = this.f39216b) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (dm0.c() != mu0.a()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (dm0.a() && this.f39217c == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f39215a.a() && this.f39217c != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f39215a.e() == com.google.android.gms.internal.ads.Bm0.f26017d) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.f34152a;
        } else if (this.f39215a.e() == com.google.android.gms.internal.ads.Bm0.f26016c) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.a(this.f39217c.intValue());
        } else {
            if (this.f39215a.e() != com.google.android.gms.internal.ads.Bm0.f26015b) {
                throw new java.lang.IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(java.lang.String.valueOf(this.f39215a.e())));
            }
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.b(this.f39217c.intValue());
        }
        return new com.google.android.gms.internal.ads.C5602wm0(this.f39215a, this.f39216b, lu0B, this.f39217c, null);
    }
}
