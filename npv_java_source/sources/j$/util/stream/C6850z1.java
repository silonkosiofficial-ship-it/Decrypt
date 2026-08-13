package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
class C6850z1 extends java.util.concurrent.CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final j$.util.stream.K0 f48602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f48603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f48604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object f48605d;

    public C6850z1(j$.util.stream.K0 k6, java.lang.Object obj, int i6) {
        this.f48604c = i6;
        this.f48602a = k6;
        this.f48603b = 0;
        this.f48605d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6850z1(j$.util.stream.C6850z1 c6850z1, j$.util.stream.J0 j6, int i6) {
        this(c6850z1, j6, i6, (byte) 0);
        this.f48604c = 0;
        this.f48605d = c6850z1.f48605d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6850z1(j$.util.stream.C6850z1 c6850z1, j$.util.stream.K0 k6, int i6) {
        this(c6850z1, k6, i6, (byte) 0);
        this.f48604c = 1;
        this.f48605d = (java.lang.Object[]) c6850z1.f48605d;
    }

    C6850z1(j$.util.stream.C6850z1 c6850z1, j$.util.stream.K0 k6, int i6, byte b6) {
        super(c6850z1);
        this.f48602a = k6;
        this.f48603b = i6;
    }

    final void a() {
        switch (this.f48604c) {
            case 0:
                ((j$.util.stream.J0) this.f48602a).q(this.f48603b, this.f48605d);
                break;
            default:
                this.f48602a.h((java.lang.Object[]) this.f48605d, this.f48603b);
                break;
        }
    }

    final j$.util.stream.C6850z1 b(int i6, int i10) {
        switch (this.f48604c) {
            case 0:
                return new j$.util.stream.C6850z1(this, ((j$.util.stream.J0) this.f48602a).b(i6), i10);
            default:
                return new j$.util.stream.C6850z1(this, this.f48602a.b(i6), i10);
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.stream.C6850z1 c6850z1B = this;
        while (c6850z1B.f48602a.p() != 0) {
            c6850z1B.setPendingCount(c6850z1B.f48602a.p() - 1);
            int i6 = 0;
            int iCount = 0;
            while (i6 < c6850z1B.f48602a.p() - 1) {
                j$.util.stream.C6850z1 c6850z1B2 = c6850z1B.b(i6, c6850z1B.f48603b + iCount);
                iCount = (int) (((long) iCount) + c6850z1B2.f48602a.count());
                c6850z1B2.fork();
                i6++;
            }
            c6850z1B = c6850z1B.b(i6, c6850z1B.f48603b + iCount);
        }
        c6850z1B.a();
        c6850z1B.propagateCompletion();
    }
}
