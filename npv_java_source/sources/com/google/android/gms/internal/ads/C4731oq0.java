package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4731oq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class f37877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Class f37878b;

    /* synthetic */ C4731oq0(java.lang.Class cls, java.lang.Class cls2, com.google.android.gms.internal.ads.AbstractC4951qq0 abstractC4951qq0) {
        this.f37877a = cls;
        this.f37878b = cls2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.C4731oq0)) {
            return false;
        }
        com.google.android.gms.internal.ads.C4731oq0 c4731oq0 = (com.google.android.gms.internal.ads.C4731oq0) obj;
        return c4731oq0.f37877a.equals(this.f37877a) && c4731oq0.f37878b.equals(this.f37878b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.f37877a, this.f37878b);
    }

    public final java.lang.String toString() {
        java.lang.Class cls = this.f37878b;
        return this.f37877a.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
