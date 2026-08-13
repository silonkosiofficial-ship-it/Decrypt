package p158p8;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f52786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52787b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.io.OutputStream f52790e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52789d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52788c = 0;

    public static class a extends java.io.IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private f(java.io.OutputStream outputStream, byte[] bArr) {
        this.f52790e = outputStream;
        this.f52786a = bArr;
        this.f52787b = bArr.length;
    }

    public static int A(long j6) {
        return v(G(j6));
    }

    public static int B(java.lang.String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return u(bytes.length) + bytes.length;
        } catch (java.io.UnsupportedEncodingException e6) {
            throw new java.lang.RuntimeException("UTF-8 not supported.", e6);
        }
    }

    public static int C(int i6) {
        return u(p158p8.y.c(i6, 0));
    }

    public static int D(int i6) {
        return u(i6);
    }

    public static int E(long j6) {
        return v(j6);
    }

    public static int F(int i6) {
        return (i6 >> 31) ^ (i6 << 1);
    }

    public static long G(long j6) {
        return (j6 >> 63) ^ (j6 << 1);
    }

    public static p158p8.f I(java.io.OutputStream outputStream, int i6) {
        return new p158p8.f(outputStream, new byte[i6]);
    }

    private void J() throws java.io.IOException {
        java.io.OutputStream outputStream = this.f52790e;
        if (outputStream == null) {
            throw new p8.f.a();
        }
        outputStream.write(this.f52786a, 0, this.f52788c);
        this.f52788c = 0;
    }

    public static int a(int i6, boolean z6) {
        return C(i6) + b(z6);
    }

    public static int b(boolean z6) {
        return 1;
    }

    public static int c(byte[] bArr) {
        return u(bArr.length) + bArr.length;
    }

    public static int d(int i6, p158p8.d dVar) {
        return C(i6) + e(dVar);
    }

    public static int e(p158p8.d dVar) {
        return u(dVar.size()) + dVar.size();
    }

    public static int f(int i6, double d6) {
        return C(i6) + g(d6);
    }

    public static int g(double d6) {
        return 8;
    }

    public static int h(int i6, int i10) {
        return C(i6) + i(i10);
    }

    public static int i(int i6) {
        return p(i6);
    }

    public static int j(int i6) {
        return 4;
    }

    public static int k(long j6) {
        return 8;
    }

    public static int l(int i6, float f6) {
        return C(i6) + m(f6);
    }

    public static int m(float f6) {
        return 4;
    }

    public static int n(p158p8.p pVar) {
        return pVar.b();
    }

    public static int o(int i6, int i10) {
        return C(i6) + p(i10);
    }

    public static int p(int i6) {
        if (i6 >= 0) {
            return u(i6);
        }
        return 10;
    }

    public static int q(long j6) {
        return v(j6);
    }

    public static int r(int i6, p158p8.p pVar) {
        return C(i6) + s(pVar);
    }

    public static int s(p158p8.p pVar) {
        int iB = pVar.b();
        return u(iB) + iB;
    }

    static int t(int i6) {
        if (i6 > 4096) {
            return 4096;
        }
        return i6;
    }

    public static int u(int i6) {
        if ((i6 & (-128)) == 0) {
            return 1;
        }
        if ((i6 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i6) == 0) {
            return 3;
        }
        return (i6 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int v(long j6) {
        if (((-128) & j6) == 0) {
            return 1;
        }
        if (((-16384) & j6) == 0) {
            return 2;
        }
        if (((-2097152) & j6) == 0) {
            return 3;
        }
        if (((-268435456) & j6) == 0) {
            return 4;
        }
        if (((-34359738368L) & j6) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j6) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j6) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j6) == 0) {
            return 8;
        }
        return (j6 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int w(int i6) {
        return 4;
    }

    public static int x(long j6) {
        return 8;
    }

    public static int y(int i6) {
        return u(F(i6));
    }

    public static int z(int i6, long j6) {
        return C(i6) + A(j6);
    }

    public void H() throws java.io.IOException {
        if (this.f52790e != null) {
            J();
        }
    }

    public void K(int i6, boolean z6) throws java.io.IOException {
        v0(i6, 0);
        L(z6);
    }

    public void L(boolean z6) throws java.io.IOException {
        g0(z6 ? 1 : 0);
    }

    public void M(byte[] bArr) throws java.io.IOException {
        n0(bArr.length);
        j0(bArr);
    }

    public void N(int i6, p158p8.d dVar) {
        v0(i6, 2);
        O(dVar);
    }

    public void O(p158p8.d dVar) {
        n0(dVar.size());
        h0(dVar);
    }

    public void P(int i6, double d6) throws java.io.IOException {
        v0(i6, 1);
        Q(d6);
    }

    public void Q(double d6) throws java.io.IOException {
        m0(java.lang.Double.doubleToRawLongBits(d6));
    }

    public void R(int i6, int i10) throws java.io.IOException {
        v0(i6, 0);
        S(i10);
    }

    public void S(int i6) throws java.io.IOException {
        a0(i6);
    }

    public void T(int i6) {
        l0(i6);
    }

    public void U(long j6) {
        m0(j6);
    }

    public void V(int i6, float f6) throws java.io.IOException {
        v0(i6, 5);
        W(f6);
    }

    public void W(float f6) throws java.io.IOException {
        l0(java.lang.Float.floatToRawIntBits(f6));
    }

    public void X(int i6, p158p8.p pVar) {
        v0(i6, 3);
        Y(pVar);
        v0(i6, 4);
    }

    public void Y(p158p8.p pVar) {
        pVar.h(this);
    }

    public void Z(int i6, int i10) throws java.io.IOException {
        v0(i6, 0);
        a0(i10);
    }

    public void a0(int i6) throws java.io.IOException {
        if (i6 >= 0) {
            n0(i6);
        } else {
            o0(i6);
        }
    }

    public void b0(long j6) throws java.io.IOException {
        o0(j6);
    }

    public void c0(int i6, p158p8.p pVar) {
        v0(i6, 2);
        d0(pVar);
    }

    public void d0(p158p8.p pVar) {
        n0(pVar.b());
        pVar.h(this);
    }

    public void e0(int i6, p158p8.p pVar) {
        v0(1, 3);
        w0(2, i6);
        c0(3, pVar);
        v0(1, 4);
    }

    public void f0(byte b6) throws java.io.IOException {
        if (this.f52788c == this.f52787b) {
            J();
        }
        byte[] bArr = this.f52786a;
        int i6 = this.f52788c;
        this.f52788c = i6 + 1;
        bArr[i6] = b6;
        this.f52789d++;
    }

    public void g0(int i6) throws java.io.IOException {
        f0((byte) i6);
    }

    public void h0(p158p8.d dVar) throws java.io.IOException {
        i0(dVar, 0, dVar.size());
    }

    public void i0(p158p8.d dVar, int i6, int i10) throws java.io.IOException {
        int i11 = this.f52787b;
        int i12 = this.f52788c;
        if (i11 - i12 >= i10) {
            dVar.s(this.f52786a, i6, i12, i10);
            this.f52788c += i10;
        } else {
            int i13 = i11 - i12;
            dVar.s(this.f52786a, i6, i12, i13);
            int i14 = i6 + i13;
            i10 -= i13;
            this.f52788c = this.f52787b;
            this.f52789d += i13;
            J();
            if (i10 <= this.f52787b) {
                dVar.s(this.f52786a, i14, 0, i10);
                this.f52788c = i10;
            } else {
                dVar.T(this.f52790e, i14, i10);
            }
        }
        this.f52789d += i10;
    }

    public void j0(byte[] bArr) throws java.io.IOException {
        k0(bArr, 0, bArr.length);
    }

    public void k0(byte[] bArr, int i6, int i10) throws java.io.IOException {
        int i11 = this.f52787b;
        int i12 = this.f52788c;
        if (i11 - i12 >= i10) {
            java.lang.System.arraycopy(bArr, i6, this.f52786a, i12, i10);
            this.f52788c += i10;
        } else {
            int i13 = i11 - i12;
            java.lang.System.arraycopy(bArr, i6, this.f52786a, i12, i13);
            int i14 = i6 + i13;
            i10 -= i13;
            this.f52788c = this.f52787b;
            this.f52789d += i13;
            J();
            if (i10 <= this.f52787b) {
                java.lang.System.arraycopy(bArr, i14, this.f52786a, 0, i10);
                this.f52788c = i10;
            } else {
                this.f52790e.write(bArr, i14, i10);
            }
        }
        this.f52789d += i10;
    }

    public void l0(int i6) throws java.io.IOException {
        g0(i6 & 255);
        g0((i6 >> 8) & 255);
        g0((i6 >> 16) & 255);
        g0((i6 >> 24) & 255);
    }

    public void m0(long j6) throws java.io.IOException {
        g0(((int) j6) & 255);
        g0(((int) (j6 >> 8)) & 255);
        g0(((int) (j6 >> 16)) & 255);
        g0(((int) (j6 >> 24)) & 255);
        g0(((int) (j6 >> 32)) & 255);
        g0(((int) (j6 >> 40)) & 255);
        g0(((int) (j6 >> 48)) & 255);
        g0(((int) (j6 >> 56)) & 255);
    }

    public void n0(int i6) {
        while ((i6 & (-128)) != 0) {
            g0((i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) | 128);
            i6 >>>= 7;
        }
        g0(i6);
    }

    public void o0(long j6) throws java.io.IOException {
        while (((-128) & j6) != 0) {
            g0((((int) j6) & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) | 128);
            j6 >>>= 7;
        }
        g0((int) j6);
    }

    public void p0(int i6) throws java.io.IOException {
        l0(i6);
    }

    public void q0(long j6) throws java.io.IOException {
        m0(j6);
    }

    public void r0(int i6) {
        n0(F(i6));
    }

    public void s0(int i6, long j6) throws java.io.IOException {
        v0(i6, 0);
        t0(j6);
    }

    public void t0(long j6) throws java.io.IOException {
        o0(G(j6));
    }

    public void u0(java.lang.String str) throws java.io.IOException {
        byte[] bytes = str.getBytes("UTF-8");
        n0(bytes.length);
        j0(bytes);
    }

    public void v0(int i6, int i10) {
        n0(p158p8.y.c(i6, i10));
    }

    public void w0(int i6, int i10) {
        v0(i6, 0);
        x0(i10);
    }

    public void x0(int i6) {
        n0(i6);
    }

    public void y0(long j6) {
        o0(j6);
    }
}
