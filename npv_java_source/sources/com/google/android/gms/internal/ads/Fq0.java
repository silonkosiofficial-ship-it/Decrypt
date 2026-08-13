package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Fq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class f27464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Class f27465b;

    /* synthetic */ Fq0(java.lang.Class cls, java.lang.Class cls2, com.google.android.gms.internal.ads.Gq0 gq0) {
        this.f27464a = cls;
        this.f27465b = cls2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.Fq0)) {
            return false;
        }
        com.google.android.gms.internal.ads.Fq0 fq0 = (com.google.android.gms.internal.ads.Fq0) obj;
        return fq0.f27464a.equals(this.f27464a) && fq0.f27465b.equals(this.f27465b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.f27464a, this.f27465b);
    }

    public final java.lang.String toString() {
        java.lang.Class cls = this.f27465b;
        return this.f27464a.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
