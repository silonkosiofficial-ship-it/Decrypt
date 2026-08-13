package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5860z5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f40205e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f40209d = new byte[128];

    public C5860z5(int i6) {
    }

    public final void a(byte[] bArr, int i6, int i10) {
        if (this.f40206a) {
            int i11 = i10 - i6;
            byte[] bArr2 = this.f40209d;
            int length = bArr2.length;
            int i12 = this.f40207b + i11;
            if (length < i12) {
                this.f40209d = java.util.Arrays.copyOf(bArr2, i12 + i12);
            }
            java.lang.System.arraycopy(bArr, i6, this.f40209d, this.f40207b, i11);
            this.f40207b += i11;
        }
    }

    public final void b() {
        this.f40206a = false;
        this.f40207b = 0;
        this.f40208c = 0;
    }

    public final boolean c(int i6, int i10) {
        if (this.f40206a) {
            int i11 = this.f40207b - i10;
            this.f40207b = i11;
            if (this.f40208c != 0 || i6 != 181) {
                this.f40206a = false;
                return true;
            }
            this.f40208c = i11;
        } else if (i6 == 179) {
            this.f40206a = true;
        }
        a(f40205e, 0, 3);
        return false;
    }
}
