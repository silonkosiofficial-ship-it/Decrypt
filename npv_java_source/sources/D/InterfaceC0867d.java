package D;

/* JADX INFO: renamed from: D.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0867d {

    /* JADX INFO: renamed from: D.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.lang.Object f1641c;

        public a(int i6, int i10, java.lang.Object obj) {
            this.f1639a = i6;
            this.f1640b = i10;
            this.f1641c = obj;
            if (i6 < 0) {
                throw new java.lang.IllegalArgumentException(("startIndex should be >= 0, but was " + i6).toString());
            }
            if (i10 > 0) {
                return;
            }
            throw new java.lang.IllegalArgumentException(("size should be >0, but was " + i10).toString());
        }

        public final int a() {
            return this.f1640b;
        }

        public final int b() {
            return this.f1639a;
        }

        public final java.lang.Object c() {
            return this.f1641c;
        }
    }

    int a();

    void b(int i6, int i10, p237x7.l lVar);

    D.InterfaceC0867d.a get(int i6);
}
