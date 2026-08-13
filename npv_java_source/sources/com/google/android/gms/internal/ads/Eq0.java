package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Eq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class f27130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Lu0 f27131b;

    /* synthetic */ Eq0(java.lang.Class cls, com.google.android.gms.internal.ads.Lu0 lu0, com.google.android.gms.internal.ads.Gq0 gq0) {
        this.f27130a = cls;
        this.f27131b = lu0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.Eq0)) {
            return false;
        }
        com.google.android.gms.internal.ads.Eq0 eq0 = (com.google.android.gms.internal.ads.Eq0) obj;
        return eq0.f27130a.equals(this.f27130a) && eq0.f27131b.equals(this.f27131b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.f27130a, this.f27131b);
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.Lu0 lu0 = this.f27131b;
        return this.f27130a.getSimpleName() + ", object identifier: " + java.lang.String.valueOf(lu0);
    }
}
