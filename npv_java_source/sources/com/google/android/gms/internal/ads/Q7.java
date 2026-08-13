package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f30897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.C4651o5 f30898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.N4 f30899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.Y9 f30900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.K2 f30901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.C4873q6 f30902f;

    static {
        new com.google.android.gms.internal.ads.I1().c();
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
    }

    /* synthetic */ Q7(java.lang.String str, com.google.android.gms.internal.ads.C4207k3 c4207k3, com.google.android.gms.internal.ads.C4651o5 c4651o5, com.google.android.gms.internal.ads.N4 n6, com.google.android.gms.internal.ads.Y9 y10, com.google.android.gms.internal.ads.C4873q6 c4873q6, com.google.android.gms.internal.ads.AbstractC4765p7 abstractC4765p7) {
        this.f30897a = str;
        this.f30898b = c4651o5;
        this.f30899c = n6;
        this.f30900d = y10;
        this.f30901e = c4207k3;
        this.f30902f = c4873q6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.Q7)) {
            return false;
        }
        com.google.android.gms.internal.ads.Q7 q10 = (com.google.android.gms.internal.ads.Q7) obj;
        return j$.util.Objects.equals(this.f30897a, q10.f30897a) && this.f30901e.equals(q10.f30901e) && j$.util.Objects.equals(this.f30898b, q10.f30898b) && j$.util.Objects.equals(this.f30899c, q10.f30899c) && j$.util.Objects.equals(this.f30900d, q10.f30900d) && j$.util.Objects.equals(this.f30902f, q10.f30902f);
    }

    public final int hashCode() {
        int iHashCode = this.f30897a.hashCode() * 31;
        com.google.android.gms.internal.ads.C4651o5 c4651o5 = this.f30898b;
        return (((((((iHashCode + (c4651o5 != null ? c4651o5.hashCode() : 0)) * 31) + this.f30899c.hashCode()) * 31) + this.f30901e.hashCode()) * 31) + this.f30900d.hashCode()) * 31;
    }
}
