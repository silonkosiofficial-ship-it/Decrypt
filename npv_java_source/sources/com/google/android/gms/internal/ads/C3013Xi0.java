package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3013Xi0 extends com.google.android.gms.internal.ads.AbstractC2648Ni0 implements java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final com.google.android.gms.internal.ads.AbstractC2648Ni0 f33161C;

    C3013Xi0(com.google.android.gms.internal.ads.AbstractC2648Ni0 abstractC2648Ni0) {
        this.f33161C = abstractC2648Ni0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2648Ni0, java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.f33161C.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.C3013Xi0) {
            return this.f33161C.equals(((com.google.android.gms.internal.ads.C3013Xi0) obj).f33161C);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f33161C.hashCode();
    }

    public final java.lang.String toString() {
        return this.f33161C.toString().concat(".reverse()");
    }
}
