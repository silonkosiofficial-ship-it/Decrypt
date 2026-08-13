package p031d0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f44282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f44283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object[] f44284c;

    public h(int i6, long[] jArr, java.lang.Object[] objArr) {
        this.f44282a = i6;
        this.f44283b = jArr;
        this.f44284c = objArr;
    }

    private final int a(long j6) {
        int i6 = this.f44282a - 1;
        if (i6 == -1) {
            return -1;
        }
        int i10 = 0;
        if (i6 == 0) {
            long j10 = this.f44283b[0];
            if (j10 == j6) {
                return 0;
            }
            return j10 > j6 ? -2 : -1;
        }
        while (i10 <= i6) {
            int i11 = (i10 + i6) >>> 1;
            long j11 = this.f44283b[i11] - j6;
            if (j11 < 0) {
                i10 = i11 + 1;
            } else {
                if (j11 <= 0) {
                    return i11;
                }
                i6 = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public final java.lang.Object b(long j6) {
        int iA = a(j6);
        if (iA >= 0) {
            return this.f44284c[iA];
        }
        return null;
    }

    public final p031d0.h c(long j6, java.lang.Object obj) {
        int i6 = this.f44282a;
        int i10 = 0;
        int i11 = 0;
        for (java.lang.Object obj2 : this.f44284c) {
            if (obj2 != null) {
                i11++;
            }
        }
        int i12 = i11 + 1;
        long[] jArr = new long[i12];
        java.lang.Object[] objArr = new java.lang.Object[i12];
        if (i12 > 1) {
            int i13 = 0;
            while (i10 < i12 && i13 < i6) {
                long j10 = this.f44283b[i13];
                java.lang.Object obj3 = this.f44284c[i13];
                if (j10 > j6) {
                    jArr[i10] = j6;
                    objArr[i10] = obj;
                    i10++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i10] = j10;
                    objArr[i10] = obj3;
                    i10++;
                }
                i13++;
            }
            if (i13 == i6) {
                jArr[i11] = j6;
                objArr[i11] = obj;
            } else {
                while (i10 < i12) {
                    long j11 = this.f44283b[i13];
                    java.lang.Object obj4 = this.f44284c[i13];
                    if (obj4 != null) {
                        jArr[i10] = j11;
                        objArr[i10] = obj4;
                        i10++;
                    }
                    i13++;
                }
            }
        } else {
            jArr[0] = j6;
            objArr[0] = obj;
        }
        return new p031d0.h(i12, jArr, objArr);
    }

    public final boolean d(long j6, java.lang.Object obj) {
        int iA = a(j6);
        if (iA < 0) {
            return false;
        }
        this.f44284c[iA] = obj;
        return true;
    }
}
