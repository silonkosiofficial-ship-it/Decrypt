package P9;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P9.m.a f8697c = new P9.m.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f8699b = new int[10];

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public final int a(int i6) {
        return this.f8699b[i6];
    }

    public final int b() {
        if ((this.f8698a & 2) != 0) {
            return this.f8699b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f8698a & 128) != 0) {
            return this.f8699b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.f8698a & 16) != 0) {
            return this.f8699b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i6) {
        return (this.f8698a & 32) != 0 ? this.f8699b[5] : i6;
    }

    public final boolean f(int i6) {
        return ((1 << i6) & this.f8698a) != 0;
    }

    public final void g(P9.m mVar) {
        p247y7.AbstractC7350t.f(mVar, "other");
        for (int i6 = 0; i6 < 10; i6++) {
            if (mVar.f(i6)) {
                h(i6, mVar.a(i6));
            }
        }
    }

    public final P9.m h(int i6, int i10) {
        if (i6 >= 0) {
            int[] iArr = this.f8699b;
            if (i6 < iArr.length) {
                this.f8698a = (1 << i6) | this.f8698a;
                iArr[i6] = i10;
            }
        }
        return this;
    }

    public final int i() {
        return java.lang.Integer.bitCount(this.f8698a);
    }
}
