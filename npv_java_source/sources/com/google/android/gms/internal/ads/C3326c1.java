package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3326c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f34412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34415d;

    public C3326c1(byte[] bArr) {
        this.f34412a = bArr;
        this.f34413b = bArr.length;
    }

    public final int a() {
        return (this.f34414c * 8) + this.f34415d;
    }

    public final int b(int i6) {
        int i10 = this.f34414c;
        int i11 = 8 - this.f34415d;
        int i12 = i10 + 1;
        byte[] bArr = this.f34412a;
        int iMin = java.lang.Math.min(i6, i11);
        int i13 = ((bArr[i10] & 255) >> this.f34415d) & (255 >> (8 - iMin));
        while (iMin < i6) {
            i13 |= (this.f34412a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i6));
        c(i6);
        return i14;
    }

    public final void c(int i6) {
        int i10;
        int i11 = i6 / 8;
        int i12 = this.f34414c + i11;
        this.f34414c = i12;
        int i13 = this.f34415d + (i6 - (i11 * 8));
        this.f34415d = i13;
        if (i13 > 7) {
            i12++;
            this.f34414c = i12;
            i13 -= 8;
            this.f34415d = i13;
        }
        boolean z6 = false;
        if (i12 >= 0 && (i12 < (i10 = this.f34413b) || (i12 == i10 && i13 == 0))) {
            z6 = true;
        }
        com.google.android.gms.internal.ads.LC.f(z6);
    }

    public final boolean d() {
        int i6 = (this.f34412a[this.f34414c] & 255) >> this.f34415d;
        c(1);
        return 1 == (i6 & 1);
    }
}
