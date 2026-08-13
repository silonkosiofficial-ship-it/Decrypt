package E7;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends E7.a implements E7.f {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final E7.c.a f2254G = new E7.c.a(null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final E7.c f2255H = new E7.c(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public c(char c6, char c10) {
        super(c6, c10, 1);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof E7.c) {
            if (!isEmpty() || !((E7.c) obj).isEmpty()) {
                E7.c cVar = (E7.c) obj;
                if (f() != cVar.f() || g() != cVar.g()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (f() * 31) + g();
    }

    public boolean isEmpty() {
        return p247y7.AbstractC7350t.g(f(), g()) > 0;
    }

    public java.lang.String toString() {
        return f() + ".." + g();
    }
}
