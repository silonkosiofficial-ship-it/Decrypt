package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5361uc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f39185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.lang.String f39186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f39187c;

    C5361uc(long j6, java.lang.String str, int i6) {
        this.f39185a = j6;
        this.f39186b = str;
        this.f39187c = i6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.google.android.gms.internal.ads.C5361uc)) {
            com.google.android.gms.internal.ads.C5361uc c5361uc = (com.google.android.gms.internal.ads.C5361uc) obj;
            if (c5361uc.f39185a == this.f39185a && c5361uc.f39187c == this.f39187c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f39185a;
    }
}
