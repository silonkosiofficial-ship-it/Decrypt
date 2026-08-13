package X5;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends X5.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X5.c.a f15887c = new X5.c.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E7.i f15888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f15889b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final X5.c a(int i6, int i10) {
            return new X5.c(new E7.i(i6, i10), true, null);
        }
    }

    private c(E7.i iVar, boolean z6) {
        this.f15888a = iVar;
        this.f15889b = z6;
    }

    public /* synthetic */ c(E7.i iVar, boolean z6, p247y7.AbstractC7342k abstractC7342k) {
        this(iVar, z6);
    }

    @Override // X5.a
    public boolean d(int i6, java.lang.StringBuilder sb) {
        p247y7.AbstractC7350t.f(sb, "stringBuilder");
        if (this.f15889b != this.f15888a.D(i6)) {
            return false;
        }
        sb.append("&#");
        java.lang.String string = java.lang.Integer.toString(i6, S8.AbstractC1628a.a(10));
        p247y7.AbstractC7350t.e(string, "toString(...)");
        sb.append(string);
        sb.append(';');
        return true;
    }
}
