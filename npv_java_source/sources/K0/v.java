package K0;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f6074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.p f6075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6076c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final K0.v.a f6077D = new K0.v.a();

        a() {
            super(2);
        }

        @Override // p237x7.p
        public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public v(java.lang.String str, p237x7.p pVar) {
        this.f6074a = str;
        this.f6075b = pVar;
    }

    public /* synthetic */ v(java.lang.String str, p237x7.p pVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(str, (i6 & 2) != 0 ? K0.v.a.f6077D : pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(java.lang.String str, boolean z6) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.f6076c = z6;
    }

    public v(java.lang.String str, boolean z6, p237x7.p pVar) {
        this(str, pVar);
        this.f6076c = z6;
    }

    public final java.lang.String a() {
        return this.f6074a;
    }

    public final boolean b() {
        return this.f6076c;
    }

    public final java.lang.Object c(java.lang.Object obj, java.lang.Object obj2) {
        return this.f6075b.u(obj, obj2);
    }

    public final void d(K0.w wVar, F7.k kVar, java.lang.Object obj) {
        wVar.d(this, obj);
    }

    public java.lang.String toString() {
        return "AccessibilityKey: " + this.f6074a;
    }
}
