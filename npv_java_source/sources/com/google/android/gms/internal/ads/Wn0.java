package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Wn0 extends com.google.android.gms.internal.ads.AbstractC3297bm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3410co0 f32796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Mu0 f32797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Lu0 f32798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Integer f32799d;

    private Wn0(com.google.android.gms.internal.ads.C3410co0 c3410co0, com.google.android.gms.internal.ads.Mu0 mu0, com.google.android.gms.internal.ads.Lu0 lu0, java.lang.Integer num) {
        this.f32796a = c3410co0;
        this.f32797b = mu0;
        this.f32798c = lu0;
        this.f32799d = num;
    }

    public static com.google.android.gms.internal.ads.Wn0 a(com.google.android.gms.internal.ads.C3301bo0 c3301bo0, com.google.android.gms.internal.ads.Mu0 mu0, java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Lu0 lu0B;
        com.google.android.gms.internal.ads.C3301bo0 c3301bo1 = com.google.android.gms.internal.ads.C3301bo0.f34378d;
        if (c3301bo0 != c3301bo1 && num == null) {
            throw new java.security.GeneralSecurityException("For given Variant " + c3301bo0.toString() + " the value of idRequirement must be non-null");
        }
        if (c3301bo0 == c3301bo1 && num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (mu0.a() != 32) {
            throw new java.security.GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + mu0.a());
        }
        com.google.android.gms.internal.ads.C3410co0 c3410co0C = com.google.android.gms.internal.ads.C3410co0.c(c3301bo0);
        if (c3410co0C.b() == c3301bo1) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.f34152a;
        } else if (c3410co0C.b() == com.google.android.gms.internal.ads.C3301bo0.f34377c) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.a(num.intValue());
        } else {
            if (c3410co0C.b() != com.google.android.gms.internal.ads.C3301bo0.f34376b) {
                throw new java.lang.IllegalStateException("Unknown Variant: ".concat(c3410co0C.b().toString()));
            }
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.b(num.intValue());
        }
        return new com.google.android.gms.internal.ads.Wn0(c3410co0C, mu0, lu0B, num);
    }

    public final com.google.android.gms.internal.ads.C3410co0 b() {
        return this.f32796a;
    }

    public final com.google.android.gms.internal.ads.Lu0 c() {
        return this.f32798c;
    }

    public final com.google.android.gms.internal.ads.Mu0 d() {
        return this.f32797b;
    }

    public final java.lang.Integer e() {
        return this.f32799d;
    }
}
