package R4;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F5.b f9489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f9490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Integer f9491c = null;

    public c(android.content.Context context, F5.b bVar, java.lang.String str) {
        this.f9489a = bVar;
        this.f9490b = str;
    }

    private void a(T4.a.c cVar) {
        ((T4.a) this.f9489a.get()).c(cVar);
    }

    private void b(java.util.List list) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(f());
        int i6 = i();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            R4.b bVar = (R4.b) it.next();
            while (arrayDeque.size() >= i6) {
                k(((T4.a.c) arrayDeque.pollFirst()).f12938b);
            }
            T4.a.c cVarF = bVar.f(this.f9490b);
            a(cVarF);
            arrayDeque.offer(cVarF);
        }
    }

    private static java.util.List c(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(R4.b.b((java.util.Map) it.next()));
        }
        return arrayList;
    }

    private boolean d(java.util.List list, R4.b bVar) {
        java.lang.String strC = bVar.c();
        java.lang.String strE = bVar.e();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            R4.b bVar2 = (R4.b) it.next();
            if (bVar2.c().equals(strC) && bVar2.e().equals(strE)) {
                return true;
            }
        }
        return false;
    }

    private java.util.List f() {
        return ((T4.a) this.f9489a.get()).f(this.f9490b, "");
    }

    private java.util.ArrayList g(java.util.List list, java.util.List list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            R4.b bVar = (R4.b) it.next();
            if (!d(list2, bVar)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private java.util.ArrayList h(java.util.List list, java.util.List list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            R4.b bVar = (R4.b) it.next();
            if (!d(list2, bVar)) {
                arrayList.add(bVar.f(this.f9490b));
            }
        }
        return arrayList;
    }

    private int i() {
        if (this.f9491c == null) {
            this.f9491c = java.lang.Integer.valueOf(((T4.a) this.f9489a.get()).e(this.f9490b));
        }
        return this.f9491c.intValue();
    }

    private void k(java.lang.String str) {
        ((T4.a) this.f9489a.get()).clearConditionalUserProperty(str, null, null);
    }

    private void l(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            k(((T4.a.c) it.next()).f12938b);
        }
    }

    private void n(java.util.List list) throws R4.a {
        if (list.isEmpty()) {
            j();
            return;
        }
        java.util.List listE = e();
        l(h(listE, list));
        b(g(list, listE));
    }

    private void o() throws R4.a {
        if (this.f9489a.get() == null) {
            throw new R4.a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public java.util.List e() throws R4.a {
        o();
        java.util.List listF = f();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(R4.b.a((T4.a.c) it.next()));
        }
        return arrayList;
    }

    public void j() throws R4.a {
        o();
        l(f());
    }

    public void m(java.util.List list) throws R4.a {
        o();
        if (list == null) {
            throw new java.lang.IllegalArgumentException("The replacementExperiments list is null.");
        }
        n(c(list));
    }
}
