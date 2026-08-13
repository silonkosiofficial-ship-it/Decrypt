package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3955hm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5272tm0 f36126a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Mu0 f36127b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Mu0 f36128c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Integer f36129d = null;

    /* synthetic */ C3955hm0(com.google.android.gms.internal.ads.AbstractC4173jm0 abstractC4173jm0) {
    }

    public final com.google.android.gms.internal.ads.C3955hm0 a(com.google.android.gms.internal.ads.Mu0 mu0) {
        this.f36127b = mu0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3955hm0 b(com.google.android.gms.internal.ads.Mu0 mu0) {
        this.f36128c = mu0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3955hm0 c(java.lang.Integer num) {
        this.f36129d = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3955hm0 d(com.google.android.gms.internal.ads.C5272tm0 c5272tm0) {
        this.f36126a = c5272tm0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C4283km0 e() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Lu0 lu0B;
        com.google.android.gms.internal.ads.C5272tm0 c5272tm0 = this.f36126a;
        if (c5272tm0 == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters");
        }
        com.google.android.gms.internal.ads.Mu0 mu0 = this.f36127b;
        if (mu0 == null || this.f36128c == null) {
            throw new java.security.GeneralSecurityException("Cannot build without key material");
        }
        if (c5272tm0.b() != mu0.a()) {
            throw new java.security.GeneralSecurityException("AES key size mismatch");
        }
        if (c5272tm0.c() != this.f36128c.a()) {
            throw new java.security.GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.f36126a.a() && this.f36129d == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f36126a.a() && this.f36129d != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f36126a.h() == com.google.android.gms.internal.ads.C5052rm0.f38555d) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.f34152a;
        } else if (this.f36126a.h() == com.google.android.gms.internal.ads.C5052rm0.f38554c) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.a(this.f36129d.intValue());
        } else {
            if (this.f36126a.h() != com.google.android.gms.internal.ads.C5052rm0.f38553b) {
                throw new java.lang.IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(java.lang.String.valueOf(this.f36126a.h())));
            }
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.b(this.f36129d.intValue());
        }
        return new com.google.android.gms.internal.ads.C4283km0(this.f36126a, this.f36127b, this.f36128c, lu0B, this.f36129d, null);
    }
}
