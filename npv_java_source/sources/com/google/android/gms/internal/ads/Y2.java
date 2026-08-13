package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f33261a = new com.google.android.gms.internal.ads.C5128sR(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33262b;

    private final long b(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        int i6;
        com.google.android.gms.internal.ads.C3983i0 c3983i0 = (com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0;
        int i10 = 0;
        c3983i0.L(this.f33261a.n(), 0, 1, false);
        int i11 = this.f33261a.n()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while (true) {
            i6 = i13 + 1;
            if ((i11 & i12) != 0) {
                break;
            }
            i12 >>= 1;
            i13 = i6;
        }
        int i14 = i11 & (~i12);
        c3983i0.L(this.f33261a.n(), 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (this.f33261a.n()[i10] & 255) + (i14 << 8);
        }
        this.f33262b += i6;
        return i14;
    }

    public final boolean a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) throws java.io.EOFException, java.io.InterruptedIOException {
        long jF = interfaceC5300u0.f();
        long j6 = 1024;
        if (jF != -1 && jF <= 1024) {
            j6 = jF;
        }
        com.google.android.gms.internal.ads.C3983i0 c3983i0 = (com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0;
        c3983i0.L(this.f33261a.n(), 0, 4, false);
        long jK = this.f33261a.K();
        this.f33262b = 4;
        while (jK != 440786851) {
            int i6 = (int) j6;
            int i10 = this.f33262b + 1;
            this.f33262b = i10;
            if (i10 == i6) {
                return false;
            }
            c3983i0.L(this.f33261a.n(), 0, 1, false);
            jK = ((jK << 8) & (-256)) | ((long) (this.f33261a.n()[0] & 255));
        }
        long jB = b(interfaceC5300u0);
        long j10 = this.f33262b;
        if (jB != Long.MIN_VALUE) {
            long j11 = j10 + jB;
            if (jF == -1 || j11 < jF) {
                while (true) {
                    long j12 = this.f33262b;
                    if (j12 < j11) {
                        if (b(interfaceC5300u0) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jB2 = b(interfaceC5300u0);
                        if (jB2 < 0) {
                            return false;
                        }
                        if (jB2 != 0) {
                            int i11 = (int) jB2;
                            c3983i0.g(i11, false);
                            this.f33262b += i11;
                        }
                    } else if (j12 == j11) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
