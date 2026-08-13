package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class R5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f31121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31122e;

    public R5(int i6, int i10) {
        this.f31118a = i6;
        byte[] bArr = new byte[131];
        this.f31121d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i6, int i10) {
        if (this.f31119b) {
            int i11 = i10 - i6;
            byte[] bArr2 = this.f31121d;
            int length = bArr2.length;
            int i12 = this.f31122e + i11;
            if (length < i12) {
                this.f31121d = java.util.Arrays.copyOf(bArr2, i12 + i12);
            }
            java.lang.System.arraycopy(bArr, i6, this.f31121d, this.f31122e, i11);
            this.f31122e += i11;
        }
    }

    public final void b() {
        this.f31119b = false;
        this.f31120c = false;
    }

    public final void c(int i6) {
        com.google.android.gms.internal.ads.LC.f(!this.f31119b);
        boolean z6 = i6 == this.f31118a;
        this.f31119b = z6;
        if (z6) {
            this.f31122e = 3;
            this.f31120c = false;
        }
    }

    public final boolean d(int i6) {
        if (!this.f31119b) {
            return false;
        }
        this.f31122e -= i6;
        this.f31119b = false;
        this.f31120c = true;
        return true;
    }

    public final boolean e() {
        return this.f31120c;
    }
}
