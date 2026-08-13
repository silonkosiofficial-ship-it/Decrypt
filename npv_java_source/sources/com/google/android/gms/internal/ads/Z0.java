package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f33448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33450d;

    public Z0(int i6, byte[] bArr, int i10, int i11) {
        this.f33447a = i6;
        this.f33448b = bArr;
        this.f33449c = i10;
        this.f33450d = i11;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.Z0.class == obj.getClass()) {
            com.google.android.gms.internal.ads.Z0 z6 = (com.google.android.gms.internal.ads.Z0) obj;
            if (this.f33447a == z6.f33447a && this.f33449c == z6.f33449c && this.f33450d == z6.f33450d && java.util.Arrays.equals(this.f33448b, z6.f33448b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f33447a * 31) + java.util.Arrays.hashCode(this.f33448b)) * 31) + this.f33449c) * 31) + this.f33450d;
    }
}
