package A0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f174b = new long[2];

    public final boolean a(long j6) {
        if (d(j6)) {
            return false;
        }
        k(this.f173a, j6);
        return true;
    }

    public final boolean b(long j6) {
        return a(j6);
    }

    public final void c() {
        this.f173a = 0;
    }

    public final boolean d(long j6) {
        int i6 = this.f173a;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f174b[i10] == j6) {
                return true;
            }
        }
        return false;
    }

    public final long e(int i6) {
        return p251z0.A.b(this.f174b[i6]);
    }

    public final int f() {
        return this.f173a;
    }

    public final boolean g() {
        return this.f173a == 0;
    }

    public final boolean h(long j6) {
        int i6 = this.f173a;
        for (int i10 = 0; i10 < i6; i10++) {
            if (j6 == e(i10)) {
                j(i10);
                return true;
            }
        }
        return false;
    }

    public final boolean i(long j6) {
        return h(j6);
    }

    public final boolean j(int i6) {
        int i10 = this.f173a;
        if (i6 >= i10) {
            return false;
        }
        int i11 = i10 - 1;
        while (i6 < i11) {
            long[] jArr = this.f174b;
            int i12 = i6 + 1;
            jArr[i6] = jArr[i12];
            i6 = i12;
        }
        this.f173a--;
        return true;
    }

    public final void k(int i6, long j6) {
        long[] jArr = this.f174b;
        if (i6 >= jArr.length) {
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, java.lang.Math.max(i6 + 1, jArr.length * 2));
            p247y7.AbstractC7350t.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f174b = jArrCopyOf;
        }
        this.f174b[i6] = j6;
        if (i6 >= this.f173a) {
            this.f173a = i6 + 1;
        }
    }
}
