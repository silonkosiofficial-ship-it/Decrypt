package p180s;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f54036a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f54037b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Object[] f54038c = new java.lang.Object[0];

    public static final int a(int[] iArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(iArr, "array");
        int i11 = i6 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final int b(long[] jArr, int i6, long j6) {
        p247y7.AbstractC7350t.f(jArr, "array");
        int i10 = i6 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j10 = jArr[i12];
            if (j10 < j6) {
                i11 = i12 + 1;
            } else {
                if (j10 <= j6) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    public static final boolean c(java.lang.Object obj, java.lang.Object obj2) {
        return p247y7.AbstractC7350t.b(obj, obj2);
    }

    public static final int d(int i6) {
        for (int i10 = 4; i10 < 32; i10++) {
            int i11 = (1 << i10) - 12;
            if (i6 <= i11) {
                return i11;
            }
        }
        return i6;
    }

    public static final int e(int i6) {
        return d(i6 * 4) / 4;
    }

    public static final int f(int i6) {
        return d(i6 * 8) / 8;
    }
}
