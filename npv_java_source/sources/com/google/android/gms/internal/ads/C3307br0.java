package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.br0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3307br0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4623nr0 f34387a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Mu0 f34388b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Integer f34389c = null;

    /* synthetic */ C3307br0(com.google.android.gms.internal.ads.AbstractC3416cr0 abstractC3416cr0) {
    }

    public final com.google.android.gms.internal.ads.C3307br0 a(java.lang.Integer num) {
        this.f34389c = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3307br0 b(com.google.android.gms.internal.ads.Mu0 mu0) {
        this.f34388b = mu0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3307br0 c(com.google.android.gms.internal.ads.C4623nr0 c4623nr0) {
        this.f34387a = c4623nr0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3525dr0 d() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Mu0 mu0;
        com.google.android.gms.internal.ads.Lu0 lu0A;
        com.google.android.gms.internal.ads.C4623nr0 c4623nr0 = this.f34387a;
        if (c4623nr0 == null || (mu0 = this.f34388b) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c4623nr0.c() != mu0.a()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (c4623nr0.a() && this.f34389c == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f34387a.a() && this.f34389c != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f34387a.g() == com.google.android.gms.internal.ads.C4403lr0.f37244e) {
            lu0A = com.google.android.gms.internal.ads.AbstractC3195aq0.f34152a;
        } else if (this.f34387a.g() == com.google.android.gms.internal.ads.C4403lr0.f37243d || this.f34387a.g() == com.google.android.gms.internal.ads.C4403lr0.f37242c) {
            lu0A = com.google.android.gms.internal.ads.AbstractC3195aq0.a(this.f34389c.intValue());
        } else {
            if (this.f34387a.g() != com.google.android.gms.internal.ads.C4403lr0.f37241b) {
                throw new java.lang.IllegalStateException("Unknown HmacParameters.Variant: ".concat(java.lang.String.valueOf(this.f34387a.g())));
            }
            lu0A = com.google.android.gms.internal.ads.AbstractC3195aq0.b(this.f34389c.intValue());
        }
        return new com.google.android.gms.internal.ads.C3525dr0(this.f34387a, this.f34388b, lu0A, this.f34389c, null);
    }
}
