package E7;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends E7.g implements E7.f {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final E7.i.a f2266G = new E7.i.a(null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final E7.i f2267H = new E7.i(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final E7.i a() {
            return E7.i.f2267H;
        }
    }

    public i(int i6, int i10) {
        super(i6, i10, 1);
    }

    public boolean D(int i6) {
        return f() <= i6 && i6 <= g();
    }

    public java.lang.Integer E() {
        return java.lang.Integer.valueOf(g());
    }

    public java.lang.Integer M() {
        return java.lang.Integer.valueOf(f());
    }

    @Override // E7.g
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof E7.i) {
            if (!isEmpty() || !((E7.i) obj).isEmpty()) {
                E7.i iVar = (E7.i) obj;
                if (f() != iVar.f() || g() != iVar.g()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // E7.g
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (f() * 31) + g();
    }

    @Override // E7.g
    public boolean isEmpty() {
        return f() > g();
    }

    @Override // E7.g
    public java.lang.String toString() {
        return f() + ".." + g();
    }
}
