package N2;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements M2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f7609a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Object f7610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private O2.d f7611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private N2.c.a f7612d;

    public interface a {
        void a(java.util.List list);

        void b(java.util.List list);
    }

    c(O2.d dVar) {
        this.f7611c = dVar;
    }

    private void h(N2.c.a aVar, java.lang.Object obj) {
        if (this.f7609a.isEmpty() || aVar == null) {
            return;
        }
        if (obj == null || c(obj)) {
            aVar.b(this.f7609a);
        } else {
            aVar.a(this.f7609a);
        }
    }

    @Override // M2.a
    public void a(java.lang.Object obj) {
        this.f7610b = obj;
        h(this.f7612d, obj);
    }

    abstract boolean b(Q2.p pVar);

    abstract boolean c(java.lang.Object obj);

    public boolean d(java.lang.String str) {
        java.lang.Object obj = this.f7610b;
        return obj != null && c(obj) && this.f7609a.contains(str);
    }

    public void e(java.lang.Iterable iterable) {
        this.f7609a.clear();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Q2.p pVar = (Q2.p) it.next();
            if (b(pVar)) {
                this.f7609a.add(pVar.f8803a);
            }
        }
        if (this.f7609a.isEmpty()) {
            this.f7611c.c(this);
        } else {
            this.f7611c.a(this);
        }
        h(this.f7612d, this.f7610b);
    }

    public void f() {
        if (this.f7609a.isEmpty()) {
            return;
        }
        this.f7609a.clear();
        this.f7611c.c(this);
    }

    public void g(N2.c.a aVar) {
        if (this.f7612d != aVar) {
            this.f7612d = aVar;
            h(aVar, this.f7610b);
        }
    }
}
