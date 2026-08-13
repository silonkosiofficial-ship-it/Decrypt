package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3692fJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.util.SparseBooleanArray f35322a;

    public final int a(int i6) {
        com.google.android.gms.internal.ads.LC.a(i6, 0, this.f35322a.size());
        return this.f35322a.keyAt(i6);
    }

    public final int b() {
        return this.f35322a.size();
    }

    public final boolean c(int i6) {
        return this.f35322a.get(i6);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.C3692fJ0)) {
            return false;
        }
        com.google.android.gms.internal.ads.C3692fJ0 c3692fJ0 = (com.google.android.gms.internal.ads.C3692fJ0) obj;
        if (com.google.android.gms.internal.ads.EW.f27061a >= 24) {
            return this.f35322a.equals(c3692fJ0.f35322a);
        }
        if (this.f35322a.size() != c3692fJ0.f35322a.size()) {
            return false;
        }
        for (int i6 = 0; i6 < this.f35322a.size(); i6++) {
            if (a(i6) != c3692fJ0.a(i6)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (com.google.android.gms.internal.ads.EW.f27061a >= 24) {
            return this.f35322a.hashCode();
        }
        int size = this.f35322a.size();
        for (int i6 = 0; i6 < this.f35322a.size(); i6++) {
            size = (size * 31) + a(i6);
        }
        return size;
    }
}
