package p170r;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f53338a = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p170r.K f53339b = new p170r.K(0);

    public static final void a(long[] jArr, int i6) {
        p247y7.AbstractC7350t.f(jArr, "metadata");
        int i10 = (i6 + 7) >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            long j6 = jArr[i11] & (-9187201950435737472L);
            jArr[i11] = (-72340172838076674L) & ((~j6) + (j6 >>> 7));
        }
        int iD0 = p097j7.AbstractC6872n.d0(jArr);
        int i12 = iD0 - 1;
        jArr[i12] = (jArr[i12] & 72057594037927935L) | (-72057594037927936L);
        jArr[iD0] = jArr[0];
    }

    public static final int b(long[] jArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(jArr, "metadata");
        while (i6 < i10) {
            if (((jArr[i6 >> 3] >> ((i6 & 7) << 3)) & 255) == 128) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static final int c(int i6) {
        if (i6 == 7) {
            return 6;
        }
        return i6 - (i6 / 8);
    }

    public static final p170r.K d() {
        return new p170r.K(0, 1, null);
    }

    public static final int e(int i6) {
        if (i6 == 0) {
            return 6;
        }
        return (i6 * 2) + 1;
    }

    public static final int f(int i6) {
        if (i6 > 0) {
            return (-1) >>> java.lang.Integer.numberOfLeadingZeros(i6);
        }
        return 0;
    }

    public static final int g(int i6) {
        if (i6 == 7) {
            return 8;
        }
        return i6 + ((i6 - 1) / 7);
    }
}
