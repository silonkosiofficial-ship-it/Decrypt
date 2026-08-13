package p007a7;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a7.c.a f17069e = new a7.c.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.List f17070f = new java.util.ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p007a7.i f17071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p007a7.j f17072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.List f17073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17074d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(p007a7.i iVar, p007a7.j jVar) {
        p247y7.AbstractC7350t.f(iVar, "phase");
        p247y7.AbstractC7350t.f(jVar, "relation");
        java.util.List list = f17070f;
        p247y7.AbstractC7350t.d(list, "null cannot be cast to non-null type kotlin.collections.MutableList<@[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.Unit>>");
        this(iVar, jVar, p247y7.W.c(list));
        if (!list.isEmpty()) {
            throw new java.lang.IllegalStateException("The shared empty array list has been modified".toString());
        }
    }

    public c(p007a7.i iVar, p007a7.j jVar, java.util.List list) {
        p247y7.AbstractC7350t.f(iVar, "phase");
        p247y7.AbstractC7350t.f(jVar, "relation");
        p247y7.AbstractC7350t.f(list, "interceptors");
        this.f17071a = iVar;
        this.f17072b = jVar;
        this.f17073c = list;
        this.f17074d = true;
    }

    private final java.util.List c() {
        return p097j7.AbstractC6879v.W0(this.f17073c);
    }

    private final void d() {
        this.f17073c = c();
        this.f17074d = false;
    }

    public final void a(p237x7.q qVar) {
        p247y7.AbstractC7350t.f(qVar, "interceptor");
        if (this.f17074d) {
            d();
        }
        this.f17073c.add(qVar);
    }

    public final void b(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "destination");
        java.util.List list2 = this.f17073c;
        if (list instanceof java.util.ArrayList) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            arrayList.ensureCapacity(arrayList.size() + list2.size());
        }
        int size = list2.size();
        for (int i6 = 0; i6 < size; i6++) {
            list.add(list2.get(i6));
        }
    }

    public final p007a7.i e() {
        return this.f17071a;
    }

    public final p007a7.j f() {
        return this.f17072b;
    }

    public final int g() {
        return this.f17073c.size();
    }

    public final boolean h() {
        return this.f17073c.isEmpty();
    }

    public final java.util.List i() {
        this.f17074d = true;
        return this.f17073c;
    }

    public java.lang.String toString() {
        return "Phase `" + this.f17071a.a() + "`, " + g() + " handlers";
    }
}
