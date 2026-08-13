package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends p198t8.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t8.k.a f54637b = new t8.k.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p198t8.k a(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "message");
            return new t8.k.b(str);
        }
    }

    public static final class b extends p198t8.k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.lang.String f54638c;

        public b(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "message");
            this.f54638c = str;
        }

        @Override // p198t8.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public H8.h a(O7.G g6) {
            p247y7.AbstractC7350t.f(g6, "module");
            return H8.k.d(H8.j.f4459L0, this.f54638c);
        }

        @Override // p198t8.g
        public java.lang.String toString() {
            return this.f54638c;
        }
    }

    public k() {
        super(p087i7.M.f46721a);
    }

    @Override // p198t8.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p087i7.M b() {
        throw new java.lang.UnsupportedOperationException();
    }
}
