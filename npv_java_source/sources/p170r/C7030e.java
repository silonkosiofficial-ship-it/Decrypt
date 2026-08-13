package p170r;

/* JADX INFO: renamed from: r.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7030e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f53371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53374d;

    public C7030e() {
        this(0, 1, null);
    }

    public C7030e(int i6) {
        if (!(i6 >= 1)) {
            p180s.d.a("capacity must be >= 1");
        }
        if (!(i6 <= 1073741824)) {
            p180s.d.a("capacity must be <= 2^30");
        }
        i6 = java.lang.Integer.bitCount(i6) != 1 ? java.lang.Integer.highestOneBit(i6 - 1) << 1 : i6;
        this.f53374d = i6 - 1;
        this.f53371a = new int[i6];
    }

    public /* synthetic */ C7030e(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 8 : i6);
    }

    private final void c() {
        int[] iArr = this.f53371a;
        int length = iArr.length;
        int i6 = this.f53372b;
        int i10 = length - i6;
        int i11 = length << 1;
        if (i11 < 0) {
            throw new java.lang.RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i11];
        p097j7.AbstractC6872n.j(iArr, iArr2, 0, i6, length);
        p097j7.AbstractC6872n.j(this.f53371a, iArr2, i10, 0, this.f53372b);
        this.f53371a = iArr2;
        this.f53372b = 0;
        this.f53373c = length;
        this.f53374d = i11 - 1;
    }

    public final void a(int i6) {
        int[] iArr = this.f53371a;
        int i10 = this.f53373c;
        iArr[i10] = i6;
        int i11 = this.f53374d & (i10 + 1);
        this.f53373c = i11;
        if (i11 == this.f53372b) {
            c();
        }
    }

    public final void b() {
        this.f53373c = this.f53372b;
    }

    public final boolean d() {
        return this.f53372b == this.f53373c;
    }

    public final int e() {
        int i6 = this.f53372b;
        if (i6 == this.f53373c) {
            p170r.C7031f c7031f = p170r.C7031f.f53375a;
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        int i10 = this.f53371a[i6];
        this.f53372b = (i6 + 1) & this.f53374d;
        return i10;
    }
}
