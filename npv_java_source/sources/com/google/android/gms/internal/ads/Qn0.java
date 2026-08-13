package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Qn0 extends com.google.android.gms.internal.ads.AbstractC3297bm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Vn0 f31057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Mu0 f31058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Lu0 f31059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Integer f31060d;

    private Qn0(com.google.android.gms.internal.ads.Vn0 vn0, com.google.android.gms.internal.ads.Mu0 mu0, com.google.android.gms.internal.ads.Lu0 lu0, java.lang.Integer num) {
        this.f31057a = vn0;
        this.f31058b = mu0;
        this.f31059c = lu0;
        this.f31060d = num;
    }

    public static com.google.android.gms.internal.ads.Qn0 a(com.google.android.gms.internal.ads.Vn0 vn0, com.google.android.gms.internal.ads.Mu0 mu0, java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Lu0 lu0B;
        com.google.android.gms.internal.ads.Un0 un0C = vn0.c();
        com.google.android.gms.internal.ads.Un0 un0 = com.google.android.gms.internal.ads.Un0.f32265c;
        if (un0C != un0 && num == null) {
            throw new java.security.GeneralSecurityException("For given Variant " + vn0.c().toString() + " the value of idRequirement must be non-null");
        }
        if (vn0.c() == un0 && num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (mu0.a() != 32) {
            throw new java.security.GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + mu0.a());
        }
        if (vn0.c() == un0) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.f34152a;
        } else {
            if (vn0.c() != com.google.android.gms.internal.ads.Un0.f32264b) {
                throw new java.lang.IllegalStateException("Unknown Variant: ".concat(vn0.c().toString()));
            }
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.b(num.intValue());
        }
        return new com.google.android.gms.internal.ads.Qn0(vn0, mu0, lu0B, num);
    }

    public final com.google.android.gms.internal.ads.Vn0 b() {
        return this.f31057a;
    }

    public final com.google.android.gms.internal.ads.Lu0 c() {
        return this.f31059c;
    }

    public final com.google.android.gms.internal.ads.Mu0 d() {
        return this.f31058b;
    }

    public final java.lang.Integer e() {
        return this.f31060d;
    }
}
