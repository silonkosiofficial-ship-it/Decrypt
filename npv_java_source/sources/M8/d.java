package M8;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends M8.c {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final M8.d.a f7077E = new M8.d.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.lang.Object[] f7078C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f7079D;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public static final class b extends p097j7.AbstractC6861c {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f7080E = -1;

        b() {
        }

        @Override // p097j7.AbstractC6861c
        protected void b() {
            do {
                int i6 = this.f7080E + 1;
                this.f7080E = i6;
                if (i6 >= M8.d.this.f7078C.length) {
                    break;
                }
            } while (M8.d.this.f7078C[this.f7080E] == null);
            if (this.f7080E >= M8.d.this.f7078C.length) {
                c();
                return;
            }
            java.lang.Object obj = M8.d.this.f7078C[this.f7080E];
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            d(obj);
        }
    }

    public d() {
        this(new java.lang.Object[20], 0);
    }

    private d(java.lang.Object[] objArr, int i6) {
        super(null);
        this.f7078C = objArr;
        this.f7079D = i6;
    }

    private final void g(int i6) {
        java.lang.Object[] objArr = this.f7078C;
        if (objArr.length > i6) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i6);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f7078C, length);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
        this.f7078C = objArrCopyOf;
    }

    @Override // M8.c
    public int d() {
        return this.f7079D;
    }

    @Override // M8.c
    public void e(int i6, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "value");
        g(i6);
        if (this.f7078C[i6] == null) {
            this.f7079D = d() + 1;
        }
        this.f7078C[i6] = obj;
    }

    @Override // M8.c
    public java.lang.Object get(int i6) {
        return p097j7.AbstractC6872n.g0(this.f7078C, i6);
    }

    @Override // M8.c, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new M8.d.b();
    }
}
