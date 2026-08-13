package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2609Mh0 extends com.google.android.gms.internal.ads.AbstractC2648Ni0 implements java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.Comparator f29818C;

    C2609Mh0(java.util.Comparator comparator) {
        this.f29818C = comparator;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2648Ni0, java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.f29818C.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.C2609Mh0) {
            return this.f29818C.equals(((com.google.android.gms.internal.ads.C2609Mh0) obj).f29818C);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29818C.hashCode();
    }

    public final java.lang.String toString() {
        return this.f29818C.toString();
    }
}
