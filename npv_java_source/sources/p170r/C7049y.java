package p170r;

/* JADX INFO: renamed from: r.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7049y extends p170r.AbstractC7033h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f53430e;

    public C7049y(int i6) {
        super(null);
        if (!(i6 >= 0)) {
            p180s.d.a("Capacity must be a positive value.");
        }
        g(p170r.V.g(i6));
    }

    private final void e() {
        this.f53430e = p170r.V.c(b()) - this.f53379d;
    }

    private final void f(int i6) {
        long[] jArr;
        if (i6 == 0) {
            jArr = p170r.V.f53338a;
        } else {
            jArr = new long[((i6 + 15) & (-8)) >> 3];
            p097j7.AbstractC6872n.A(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f53376a = jArr;
        int i10 = i6 >> 3;
        long j6 = 255 << ((i6 & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j6)) | j6;
        e();
    }

    private final void g(int i6) {
        int iMax = i6 > 0 ? java.lang.Math.max(7, p170r.V.f(i6)) : 0;
        this.f53378c = iMax;
        f(iMax);
        this.f53377b = new float[iMax];
    }
}
