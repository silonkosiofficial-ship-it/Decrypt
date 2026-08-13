package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3299bn0 extends com.google.android.gms.internal.ads.AbstractC3297bm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3847gn0 f34372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Mu0 f34373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Lu0 f34374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Integer f34375d;

    private C3299bn0(com.google.android.gms.internal.ads.C3847gn0 c3847gn0, com.google.android.gms.internal.ads.Mu0 mu0, com.google.android.gms.internal.ads.Lu0 lu0, java.lang.Integer num) {
        this.f34372a = c3847gn0;
        this.f34373b = mu0;
        this.f34374c = lu0;
        this.f34375d = num;
    }

    public static com.google.android.gms.internal.ads.C3299bn0 a(com.google.android.gms.internal.ads.C3737fn0 c3737fn0, com.google.android.gms.internal.ads.Mu0 mu0, java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Lu0 lu0B;
        com.google.android.gms.internal.ads.C3737fn0 c3737fn1 = com.google.android.gms.internal.ads.C3737fn0.f35428d;
        if (c3737fn0 != c3737fn1 && num == null) {
            throw new java.security.GeneralSecurityException("For given Variant " + c3737fn0.toString() + " the value of idRequirement must be non-null");
        }
        if (c3737fn0 == c3737fn1 && num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (mu0.a() != 32) {
            throw new java.security.GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + mu0.a());
        }
        com.google.android.gms.internal.ads.C3847gn0 c3847gn0C = com.google.android.gms.internal.ads.C3847gn0.c(c3737fn0);
        if (c3847gn0C.b() == c3737fn1) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.f34152a;
        } else if (c3847gn0C.b() == com.google.android.gms.internal.ads.C3737fn0.f35427c) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.a(num.intValue());
        } else {
            if (c3847gn0C.b() != com.google.android.gms.internal.ads.C3737fn0.f35426b) {
                throw new java.lang.IllegalStateException("Unknown Variant: ".concat(c3847gn0C.b().toString()));
            }
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.b(num.intValue());
        }
        return new com.google.android.gms.internal.ads.C3299bn0(c3847gn0C, mu0, lu0B, num);
    }

    public final com.google.android.gms.internal.ads.C3847gn0 b() {
        return this.f34372a;
    }

    public final com.google.android.gms.internal.ads.Lu0 c() {
        return this.f34374c;
    }

    public final com.google.android.gms.internal.ads.Mu0 d() {
        return this.f34373b;
    }

    public final java.lang.Integer e() {
        return this.f34375d;
    }
}
