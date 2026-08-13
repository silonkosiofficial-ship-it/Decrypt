package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5714xn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5934zn0 f39922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f39923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5824yn0 f39924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC3406cm0 f39925d;

    /* synthetic */ C5714xn0(com.google.android.gms.internal.ads.An0 an0) {
    }

    public final com.google.android.gms.internal.ads.C5714xn0 a(com.google.android.gms.internal.ads.AbstractC3406cm0 abstractC3406cm0) {
        this.f39925d = abstractC3406cm0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C5714xn0 b(com.google.android.gms.internal.ads.C5824yn0 c5824yn0) {
        this.f39924c = c5824yn0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C5714xn0 c(java.lang.String str) {
        this.f39923b = str;
        return this;
    }

    public final com.google.android.gms.internal.ads.C5714xn0 d(com.google.android.gms.internal.ads.C5934zn0 c5934zn0) {
        this.f39922a = c5934zn0;
        return this;
    }

    public final com.google.android.gms.internal.ads.Bn0 e() throws java.security.GeneralSecurityException {
        if (this.f39922a == null) {
            this.f39922a = com.google.android.gms.internal.ads.C5934zn0.f40394c;
        }
        if (this.f39923b == null) {
            throw new java.security.GeneralSecurityException("kekUri must be set");
        }
        com.google.android.gms.internal.ads.C5824yn0 c5824yn0 = this.f39924c;
        if (c5824yn0 == null) {
            throw new java.security.GeneralSecurityException("dekParsingStrategy must be set");
        }
        com.google.android.gms.internal.ads.AbstractC3406cm0 abstractC3406cm0 = this.f39925d;
        if (abstractC3406cm0 == null) {
            throw new java.security.GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (abstractC3406cm0.a()) {
            throw new java.security.GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((c5824yn0.equals(com.google.android.gms.internal.ads.C5824yn0.f40134b) && (abstractC3406cm0 instanceof com.google.android.gms.internal.ads.Pm0)) || ((c5824yn0.equals(com.google.android.gms.internal.ads.C5824yn0.f40136d) && (abstractC3406cm0 instanceof com.google.android.gms.internal.ads.C3847gn0)) || ((c5824yn0.equals(com.google.android.gms.internal.ads.C5824yn0.f40135c) && (abstractC3406cm0 instanceof com.google.android.gms.internal.ads.C3410co0)) || ((c5824yn0.equals(com.google.android.gms.internal.ads.C5824yn0.f40137e) && (abstractC3406cm0 instanceof com.google.android.gms.internal.ads.C5272tm0)) || ((c5824yn0.equals(com.google.android.gms.internal.ads.C5824yn0.f40138f) && (abstractC3406cm0 instanceof com.google.android.gms.internal.ads.Dm0)) || (c5824yn0.equals(com.google.android.gms.internal.ads.C5824yn0.f40139g) && (abstractC3406cm0 instanceof com.google.android.gms.internal.ads.C3189an0))))))) {
            return new com.google.android.gms.internal.ads.Bn0(this.f39922a, this.f39923b, this.f39924c, this.f39925d, null);
        }
        throw new java.security.GeneralSecurityException("Cannot use parsing strategy " + this.f39924c.toString() + " when new keys are picked according to " + java.lang.String.valueOf(this.f39925d) + ".");
    }
}
