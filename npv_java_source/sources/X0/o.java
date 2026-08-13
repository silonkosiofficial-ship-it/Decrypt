package X0;

/* JADX INFO: loaded from: classes.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X0.o.a f15646a = X0.o.a.f15647a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ X0.o.a f15647a = new X0.o.a();

        private a() {
        }

        public final X0.o a(p141o0.AbstractC6984n0 abstractC6984n0, float f6) {
            if (abstractC6984n0 == null) {
                return X0.o.b.f15648b;
            }
            if (abstractC6984n0 instanceof p141o0.f2) {
                return b(X0.m.c(((p141o0.f2) abstractC6984n0).b(), f6));
            }
            if (abstractC6984n0 instanceof p141o0.a2) {
                return new X0.c((p141o0.a2) abstractC6984n0, f6);
            }
            throw new p087i7.s();
        }

        public final X0.o b(long j6) {
            return j6 != 16 ? new X0.d(j6, null) : X0.o.b.f15648b;
        }
    }

    public static final class b implements X0.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final X0.o.b f15648b = new X0.o.b();

        private b() {
        }

        @Override // X0.o
        public float a() {
            return Float.NaN;
        }

        @Override // X0.o
        public long c() {
            return p141o0.C7016y0.f52264b.g();
        }

        @Override // X0.o
        public /* synthetic */ X0.o d(p237x7.a aVar) {
            return X0.n.b(this, aVar);
        }

        @Override // X0.o
        public /* synthetic */ X0.o e(X0.o oVar) {
            return X0.n.a(this, oVar);
        }

        @Override // X0.o
        public p141o0.AbstractC6984n0 f() {
            return null;
        }
    }

    float a();

    long c();

    X0.o d(p237x7.a aVar);

    X0.o e(X0.o oVar);

    p141o0.AbstractC6984n0 f();
}
