package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5667xI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f39822a = new com.google.android.gms.internal.ads.C5128sR(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5557wI0 f39823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5557wI0 f39824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5557wI0 f39825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f39826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YJ0 f39827f;

    public C5667xI0(com.google.android.gms.internal.ads.YJ0 yj0) {
        this.f39827f = yj0;
        com.google.android.gms.internal.ads.C5557wI0 c5557wI0 = new com.google.android.gms.internal.ads.C5557wI0(0L, 65536);
        this.f39823b = c5557wI0;
        this.f39824c = c5557wI0;
        this.f39825d = c5557wI0;
    }

    private final int i(int i6) {
        com.google.android.gms.internal.ads.C5557wI0 c5557wI0 = this.f39825d;
        if (c5557wI0.f39574c == null) {
            com.google.android.gms.internal.ads.RJ0 rj0B = this.f39827f.b();
            com.google.android.gms.internal.ads.C5557wI0 c5557wI1 = new com.google.android.gms.internal.ads.C5557wI0(this.f39825d.f39573b, 65536);
            c5557wI0.f39574c = rj0B;
            c5557wI0.f39575d = c5557wI1;
        }
        return java.lang.Math.min(i6, (int) (this.f39825d.f39573b - this.f39826e));
    }

    private static com.google.android.gms.internal.ads.C5557wI0 j(com.google.android.gms.internal.ads.C5557wI0 c5557wI0, long j6) {
        while (j6 >= c5557wI0.f39573b) {
            c5557wI0 = c5557wI0.f39575d;
        }
        return c5557wI0;
    }

    private static com.google.android.gms.internal.ads.C5557wI0 k(com.google.android.gms.internal.ads.C5557wI0 c5557wI0, long j6, java.nio.ByteBuffer byteBuffer, int i6) {
        com.google.android.gms.internal.ads.C5557wI0 c5557wI0J = j(c5557wI0, j6);
        while (i6 > 0) {
            int iMin = java.lang.Math.min(i6, (int) (c5557wI0J.f39573b - j6));
            byteBuffer.put(c5557wI0J.f39574c.f31231a, c5557wI0J.a(j6), iMin);
            i6 -= iMin;
            j6 += (long) iMin;
            if (j6 == c5557wI0J.f39573b) {
                c5557wI0J = c5557wI0J.f39575d;
            }
        }
        return c5557wI0J;
    }

    private static com.google.android.gms.internal.ads.C5557wI0 l(com.google.android.gms.internal.ads.C5557wI0 c5557wI0, long j6, byte[] bArr, int i6) {
        com.google.android.gms.internal.ads.C5557wI0 c5557wI0J = j(c5557wI0, j6);
        int i10 = i6;
        while (i10 > 0) {
            int iMin = java.lang.Math.min(i10, (int) (c5557wI0J.f39573b - j6));
            java.lang.System.arraycopy(c5557wI0J.f39574c.f31231a, c5557wI0J.a(j6), bArr, i6 - i10, iMin);
            i10 -= iMin;
            j6 += (long) iMin;
            if (j6 == c5557wI0J.f39573b) {
                c5557wI0J = c5557wI0J.f39575d;
            }
        }
        return c5557wI0J;
    }

    private static com.google.android.gms.internal.ads.C5557wI0 m(com.google.android.gms.internal.ads.C5557wI0 c5557wI0, com.google.android.gms.internal.ads.C5518vz0 c5518vz0, com.google.android.gms.internal.ads.C5887zI0 c5887zI0, com.google.android.gms.internal.ads.C5128sR c5128sR) {
        com.google.android.gms.internal.ads.C5557wI0 c5557wI0L;
        int iG;
        if (c5518vz0.l()) {
            long j6 = c5887zI0.f40278b;
            c5128sR.i(1);
            com.google.android.gms.internal.ads.C5557wI0 c5557wI0L2 = l(c5557wI0, j6, c5128sR.n(), 1);
            long j10 = j6 + 1;
            byte b6 = c5128sR.n()[0];
            int i6 = b6 & 128;
            int i10 = b6 & 127;
            com.google.android.gms.internal.ads.Iy0 iy0 = c5518vz0.f39485c;
            byte[] bArr = iy0.f28551a;
            if (bArr == null) {
                iy0.f28551a = new byte[16];
            } else {
                java.util.Arrays.fill(bArr, (byte) 0);
            }
            boolean z6 = i6 != 0;
            c5557wI0L = l(c5557wI0L2, j10, iy0.f28551a, i10);
            long j11 = j10 + ((long) i10);
            if (z6) {
                c5128sR.i(2);
                c5557wI0L = l(c5557wI0L, j11, c5128sR.n(), 2);
                j11 += 2;
                iG = c5128sR.G();
            } else {
                iG = 1;
            }
            int[] iArr = iy0.f28554d;
            if (iArr == null || iArr.length < iG) {
                iArr = new int[iG];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = iy0.f28555e;
            if (iArr3 == null || iArr3.length < iG) {
                iArr3 = new int[iG];
            }
            int[] iArr4 = iArr3;
            if (z6) {
                int i11 = iG * 6;
                c5128sR.i(i11);
                c5557wI0L = l(c5557wI0L, j11, c5128sR.n(), i11);
                j11 += (long) i11;
                c5128sR.l(0);
                for (int i12 = 0; i12 < iG; i12++) {
                    iArr2[i12] = c5128sR.G();
                    iArr4[i12] = c5128sR.F();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = c5887zI0.f40277a - ((int) (j11 - c5887zI0.f40278b));
            }
            com.google.android.gms.internal.ads.Z0 z10 = c5887zI0.f40279c;
            int i13 = com.google.android.gms.internal.ads.EW.f27061a;
            iy0.c(iG, iArr2, iArr4, z10.f33448b, iy0.f28551a, z10.f33447a, z10.f33449c, z10.f33450d);
            long j12 = c5887zI0.f40278b;
            int i14 = (int) (j11 - j12);
            c5887zI0.f40278b = j12 + ((long) i14);
            c5887zI0.f40277a -= i14;
        } else {
            c5557wI0L = c5557wI0;
        }
        if (!c5518vz0.e()) {
            c5518vz0.j(c5887zI0.f40277a);
            return k(c5557wI0L, c5887zI0.f40278b, c5518vz0.f39486d, c5887zI0.f40277a);
        }
        c5128sR.i(4);
        com.google.android.gms.internal.ads.C5557wI0 c5557wI0L3 = l(c5557wI0L, c5887zI0.f40278b, c5128sR.n(), 4);
        int iF = c5128sR.F();
        c5887zI0.f40278b += 4;
        c5887zI0.f40277a -= 4;
        c5518vz0.j(iF);
        com.google.android.gms.internal.ads.C5557wI0 c5557wI0K = k(c5557wI0L3, c5887zI0.f40278b, c5518vz0.f39486d, iF);
        c5887zI0.f40278b += (long) iF;
        int i15 = c5887zI0.f40277a - iF;
        c5887zI0.f40277a = i15;
        java.nio.ByteBuffer byteBuffer = c5518vz0.f39489g;
        if (byteBuffer == null || byteBuffer.capacity() < i15) {
            c5518vz0.f39489g = java.nio.ByteBuffer.allocate(i15);
        } else {
            c5518vz0.f39489g.clear();
        }
        return k(c5557wI0K, c5887zI0.f40278b, c5518vz0.f39489g, c5887zI0.f40277a);
    }

    private final void n(int i6) {
        long j6 = this.f39826e + ((long) i6);
        this.f39826e = j6;
        com.google.android.gms.internal.ads.C5557wI0 c5557wI0 = this.f39825d;
        if (j6 == c5557wI0.f39573b) {
            this.f39825d = c5557wI0.f39575d;
        }
    }

    public final int a(com.google.android.gms.internal.ads.InterfaceC4884qB0 interfaceC4884qB0, int i6, boolean z6) throws java.io.EOFException {
        int i10 = i(i6);
        com.google.android.gms.internal.ads.C5557wI0 c5557wI0 = this.f39825d;
        int iH = interfaceC4884qB0.H(c5557wI0.f39574c.f31231a, c5557wI0.a(this.f39826e), i10);
        if (iH != -1) {
            n(iH);
            return iH;
        }
        if (z6) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    public final long b() {
        return this.f39826e;
    }

    public final void c(long j6) {
        com.google.android.gms.internal.ads.C5557wI0 c5557wI0;
        if (j6 != -1) {
            while (true) {
                c5557wI0 = this.f39823b;
                if (j6 < c5557wI0.f39573b) {
                    break;
                }
                this.f39827f.c(c5557wI0.f39574c);
                this.f39823b = this.f39823b.b();
            }
            if (this.f39824c.f39572a < c5557wI0.f39572a) {
                this.f39824c = c5557wI0;
            }
        }
    }

    public final void d(com.google.android.gms.internal.ads.C5518vz0 c5518vz0, com.google.android.gms.internal.ads.C5887zI0 c5887zI0) {
        m(this.f39824c, c5518vz0, c5887zI0, this.f39822a);
    }

    public final void e(com.google.android.gms.internal.ads.C5518vz0 c5518vz0, com.google.android.gms.internal.ads.C5887zI0 c5887zI0) {
        this.f39824c = m(this.f39824c, c5518vz0, c5887zI0, this.f39822a);
    }

    public final void f() {
        com.google.android.gms.internal.ads.C5557wI0 c5557wI0 = this.f39823b;
        if (c5557wI0.f39574c != null) {
            this.f39827f.d(c5557wI0);
            c5557wI0.b();
        }
        this.f39823b.d(0L, 65536);
        com.google.android.gms.internal.ads.C5557wI0 c5557wI1 = this.f39823b;
        this.f39824c = c5557wI1;
        this.f39825d = c5557wI1;
        this.f39826e = 0L;
        this.f39827f.g();
    }

    public final void g() {
        this.f39824c = this.f39823b;
    }

    public final void h(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6) {
        while (i6 > 0) {
            int i10 = i(i6);
            com.google.android.gms.internal.ads.C5557wI0 c5557wI0 = this.f39825d;
            c5128sR.h(c5557wI0.f39574c.f31231a, c5557wI0.a(this.f39826e), i10);
            i6 -= i10;
            n(i10);
        }
    }
}
