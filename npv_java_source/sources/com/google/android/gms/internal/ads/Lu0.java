package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Lu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f29584a;

    private Lu0(byte[] bArr, int i6, int i10) {
        byte[] bArr2 = new byte[i10];
        this.f29584a = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static com.google.android.gms.internal.ads.Lu0 b(byte[] bArr) {
        if (bArr != null) {
            return new com.google.android.gms.internal.ads.Lu0(bArr, 0, bArr.length);
        }
        throw new java.lang.NullPointerException("data must be non-null");
    }

    public final int a() {
        return this.f29584a.length;
    }

    public final byte[] c() {
        byte[] bArr = this.f29584a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.Lu0) {
            return java.util.Arrays.equals(((com.google.android.gms.internal.ads.Lu0) obj).f29584a, this.f29584a);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f29584a);
    }

    public final java.lang.String toString() {
        byte[] bArr = this.f29584a;
        int length = bArr.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + length);
        for (byte b6 : bArr) {
            sb.append("0123456789abcdef".charAt((b6 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b6 & 15));
        }
        return "Bytes(" + sb.toString() + ")";
    }
}
