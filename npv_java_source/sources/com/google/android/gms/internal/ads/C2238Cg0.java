package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2238Cg0 implements java.io.Serializable, com.google.android.gms.internal.ads.InterfaceC2201Bg0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f26283C;

    @Override // com.google.android.gms.internal.ads.InterfaceC2201Bg0
    public final boolean b(java.lang.Object obj) {
        for (int i6 = 0; i6 < this.f26283C.size(); i6++) {
            if (!((com.google.android.gms.internal.ads.InterfaceC2201Bg0) this.f26283C.get(i6)).b(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.C2238Cg0) {
            return this.f26283C.equals(((com.google.android.gms.internal.ads.C2238Cg0) obj).f26283C);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26283C.hashCode() + 306654252;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Predicates.");
        sb.append("and(");
        boolean z6 = true;
        for (java.lang.Object obj : this.f26283C) {
            if (!z6) {
                sb.append(',');
            }
            sb.append(obj);
            z6 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
