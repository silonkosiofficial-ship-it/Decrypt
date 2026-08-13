package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5604wn0 extends com.google.android.gms.internal.ads.AbstractC3297bm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Bn0 f39682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Lu0 f39683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Integer f39684c;

    private C5604wn0(com.google.android.gms.internal.ads.Bn0 bn0, com.google.android.gms.internal.ads.Lu0 lu0, java.lang.Integer num) {
        this.f39682a = bn0;
        this.f39683b = lu0;
        this.f39684c = num;
    }

    public static com.google.android.gms.internal.ads.C5604wn0 a(com.google.android.gms.internal.ads.Bn0 bn0, java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Lu0 lu0B;
        if (bn0.c() == com.google.android.gms.internal.ads.C5934zn0.f40394c) {
            if (num != null) {
                throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.f34152a;
        } else {
            if (bn0.c() != com.google.android.gms.internal.ads.C5934zn0.f40393b) {
                throw new java.security.GeneralSecurityException("Unknown Variant: ".concat(java.lang.String.valueOf(bn0.c())));
            }
            if (num == null) {
                throw new java.security.GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.b(num.intValue());
        }
        return new com.google.android.gms.internal.ads.C5604wn0(bn0, lu0B, num);
    }

    public final com.google.android.gms.internal.ads.Bn0 b() {
        return this.f39682a;
    }

    public final java.lang.Integer c() {
        return this.f39684c;
    }
}
