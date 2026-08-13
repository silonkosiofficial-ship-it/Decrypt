package B;

/* JADX INFO: loaded from: classes.dex */
public abstract class u implements D.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B.m f490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D.w f491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f492c;

    private u(long j6, boolean z6, B.m mVar, D.w wVar) {
        this.f490a = mVar;
        this.f491b = wVar;
        this.f492c = Y0.c.b(0, z6 ? Y0.C1859b.l(j6) : Integer.MAX_VALUE, 0, z6 ? Integer.MAX_VALUE : Y0.C1859b.k(j6), 5, null);
    }

    public /* synthetic */ u(long j6, boolean z6, B.m mVar, D.w wVar, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, z6, mVar, wVar);
    }

    public static /* synthetic */ B.t e(B.u uVar, int i6, long j6, int i10, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i10 & 2) != 0) {
            j6 = uVar.f492c;
        }
        return uVar.d(i6, j6);
    }

    public abstract B.t b(int i6, java.lang.Object obj, java.lang.Object obj2, java.util.List list, long j6);

    @Override // D.z
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public B.t a(int i6, int i10, int i11, long j6) {
        return d(i6, j6);
    }

    public final B.t d(int i6, long j6) {
        return b(i6, this.f490a.b(i6), this.f490a.e(i6), this.f491b.p0(i6, j6), j6);
    }

    public final long f() {
        return this.f492c;
    }

    public final androidx.compose.foundation.lazy.layout.c g() {
        return this.f490a.c();
    }
}
