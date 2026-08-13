package X9;

/* JADX INFO: renamed from: X9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1834b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final X9.C1836d.a f16117a = new X9.C1836d.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f16118b = -1234567890;

    public static final boolean a(byte[] bArr, int i6, byte[] bArr2, int i10, int i11) {
        p247y7.AbstractC7350t.f(bArr, "a");
        p247y7.AbstractC7350t.f(bArr2, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12 + i6] != bArr2[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j6, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j6 || j6 - j10 < j11) {
            throw new java.lang.ArrayIndexOutOfBoundsException("size=" + j6 + " offset=" + j10 + " byteCount=" + j11);
        }
    }

    public static final int c() {
        return f16118b;
    }

    public static final X9.C1836d.a d() {
        return f16117a;
    }

    public static final int e(X9.C1839g c1839g, int i6) {
        p247y7.AbstractC7350t.f(c1839g, "<this>");
        return i6 == f16118b ? c1839g.I() : i6;
    }

    public static final int f(byte[] bArr, int i6) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        return i6 == f16118b ? bArr.length : i6;
    }

    public static final X9.C1836d.a g(X9.C1836d.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "unsafeCursor");
        return aVar == f16117a ? new X9.C1836d.a() : aVar;
    }

    public static final int h(int i6) {
        return ((i6 & 255) << 24) | (((-16777216) & i6) >>> 24) | ((16711680 & i6) >>> 8) | ((65280 & i6) << 8);
    }

    public static final long i(long j6) {
        return ((j6 & 255) << 56) | (((-72057594037927936L) & j6) >>> 56) | ((71776119061217280L & j6) >>> 40) | ((280375465082880L & j6) >>> 24) | ((1095216660480L & j6) >>> 8) | ((4278190080L & j6) << 8) | ((16711680 & j6) << 24) | ((65280 & j6) << 40);
    }

    public static final short j(short s6) {
        return (short) (((s6 & 255) << 8) | ((65280 & s6) >>> 8));
    }

    public static final java.lang.String k(byte b6) {
        return S8.r.z(new char[]{Y9.b.f()[(b6 >> 4) & 15], Y9.b.f()[b6 & 15]});
    }

    public static final java.lang.String l(int i6) {
        int i10 = 0;
        if (i6 == 0) {
            return "0";
        }
        char[] cArr = {Y9.b.f()[(i6 >> 28) & 15], Y9.b.f()[(i6 >> 24) & 15], Y9.b.f()[(i6 >> 20) & 15], Y9.b.f()[(i6 >> 16) & 15], Y9.b.f()[(i6 >> 12) & 15], Y9.b.f()[(i6 >> 8) & 15], Y9.b.f()[(i6 >> 4) & 15], Y9.b.f()[i6 & 15]};
        while (i10 < 8 && cArr[i10] == '0') {
            i10++;
        }
        return S8.r.A(cArr, i10, 8);
    }
}
