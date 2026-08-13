package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2597Mb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f29802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29805d = 0;

    public C2597Mb0(byte[] bArr, int i6, int i10) {
        this.f29802a = bArr;
        this.f29804c = i6;
        this.f29803b = i10;
        j();
    }

    private final int i() {
        int i6 = 0;
        while (!h()) {
            i6++;
        }
        return ((1 << i6) - 1) + (i6 > 0 ? a(i6) : 0);
    }

    private final void j() {
        int i6;
        int i10 = this.f29804c;
        boolean z6 = false;
        if (i10 >= 0 && (i10 < (i6 = this.f29803b) || (i10 == i6 && this.f29805d == 0))) {
            z6 = true;
        }
        com.google.android.gms.internal.ads.LC.f(z6);
    }

    private final boolean k(int i6) {
        if (i6 < 2 || i6 >= this.f29803b) {
            return false;
        }
        byte[] bArr = this.f29802a;
        return bArr[i6] == 3 && bArr[i6 + (-2)] == 0 && bArr[i6 + (-1)] == 0;
    }

    public final int a(int i6) {
        int i10;
        this.f29805d += i6;
        int i11 = 0;
        while (true) {
            i10 = this.f29805d;
            int i12 = 2;
            if (i10 <= 8) {
                break;
            }
            int i13 = i10 - 8;
            this.f29805d = i13;
            byte[] bArr = this.f29802a;
            int i14 = this.f29804c;
            i11 |= (bArr[i14] & 255) << i13;
            if (true != k(i14 + 1)) {
                i12 = 1;
            }
            this.f29804c = i14 + i12;
        }
        byte[] bArr2 = this.f29802a;
        int i15 = this.f29804c;
        int i16 = i11 | ((bArr2[i15] & 255) >> (8 - i10));
        int i17 = 32 - i6;
        if (i10 == 8) {
            this.f29805d = 0;
            this.f29804c = i15 + (true != k(i15 + 1) ? 1 : 2);
        }
        int i18 = ((-1) >>> i17) & i16;
        j();
        return i18;
    }

    public final int b() {
        int i6 = i();
        return (i6 % 2 == 0 ? -1 : 1) * ((i6 + 1) / 2);
    }

    public final int c() {
        return i();
    }

    public final void d() {
        int i6 = this.f29805d;
        if (i6 > 0) {
            f(8 - i6);
        }
    }

    public final void e() {
        int i6 = this.f29805d + 1;
        this.f29805d = i6;
        if (i6 == 8) {
            this.f29805d = 0;
            int i10 = this.f29804c;
            this.f29804c = i10 + (true == k(i10 + 1) ? 2 : 1);
        }
        j();
    }

    public final void f(int i6) {
        int i10 = this.f29804c;
        int i11 = i6 / 8;
        int i12 = i10 + i11;
        this.f29804c = i12;
        int i13 = this.f29805d + (i6 - (i11 * 8));
        this.f29805d = i13;
        if (i13 > 7) {
            this.f29804c = i12 + 1;
            this.f29805d = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 > this.f29804c) {
                j();
                return;
            } else if (k(i10)) {
                this.f29804c++;
                i10 += 2;
            }
        }
    }

    public final boolean g(int i6) {
        int i10 = this.f29804c;
        int i11 = i6 / 8;
        int i12 = i10 + i11;
        int i13 = (this.f29805d + i6) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.f29803b) {
                break;
            }
            if (k(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f29803b;
        if (i12 >= i14) {
            return i12 == i14 && i13 == 0;
        }
        return true;
    }

    public final boolean h() {
        int i6 = this.f29802a[this.f29804c] & (128 >> this.f29805d);
        e();
        return i6 != 0;
    }
}
