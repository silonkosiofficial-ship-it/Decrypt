package Z8;

/* JADX INFO: loaded from: classes2.dex */
public interface I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z8.I.a f16761a = Z8.I.a.f16762a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Z8.I.a f16762a = new Z8.I.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Z8.I f16763b = new Z8.K();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Z8.I f16764c = new Z8.L();

        private a() {
        }

        public static /* synthetic */ Z8.I b(Z8.I.a aVar, long j6, long j10, int i6, java.lang.Object obj) {
            if ((i6 & 1) != 0) {
                j6 = 0;
            }
            if ((i6 & 2) != 0) {
                j10 = Long.MAX_VALUE;
            }
            return aVar.a(j6, j10);
        }

        public final Z8.I a(long j6, long j10) {
            return new Z8.M(j6, j10);
        }

        public final Z8.I c() {
            return f16763b;
        }

        public final Z8.I d() {
            return f16764c;
        }
    }

    Z8.InterfaceC1869f a(Z8.N n6);
}
