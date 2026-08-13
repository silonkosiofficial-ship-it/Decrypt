package androidx.coordinatorlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B1.f f21360a = new B1.g(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p170r.Y f21361b = new p170r.Y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.ArrayList f21362c = new java.util.ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.HashSet f21363d = new java.util.HashSet();

    private void e(java.lang.Object obj, java.util.ArrayList arrayList, java.util.HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new java.lang.RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f21361b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                e(arrayList2.get(i6), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private java.util.ArrayList f() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f21360a.b();
        return arrayList == null ? new java.util.ArrayList() : arrayList;
    }

    private void k(java.util.ArrayList arrayList) {
        arrayList.clear();
        this.f21360a.a(arrayList);
    }

    public void a(java.lang.Object obj, java.lang.Object obj2) {
        if (!this.f21361b.containsKey(obj) || !this.f21361b.containsKey(obj2)) {
            throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        java.util.ArrayList arrayListF = (java.util.ArrayList) this.f21361b.get(obj);
        if (arrayListF == null) {
            arrayListF = f();
            this.f21361b.put(obj, arrayListF);
        }
        arrayListF.add(obj2);
    }

    public void b(java.lang.Object obj) {
        if (this.f21361b.containsKey(obj)) {
            return;
        }
        this.f21361b.put(obj, null);
    }

    public void c() {
        int size = this.f21361b.size();
        for (int i6 = 0; i6 < size; i6++) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f21361b.k(i6);
            if (arrayList != null) {
                k(arrayList);
            }
        }
        this.f21361b.clear();
    }

    public boolean d(java.lang.Object obj) {
        return this.f21361b.containsKey(obj);
    }

    public java.util.List g(java.lang.Object obj) {
        return (java.util.List) this.f21361b.get(obj);
    }

    public java.util.List h(java.lang.Object obj) {
        int size = this.f21361b.size();
        java.util.ArrayList arrayList = null;
        for (int i6 = 0; i6 < size; i6++) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f21361b.k(i6);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(this.f21361b.f(i6));
            }
        }
        return arrayList;
    }

    public java.util.ArrayList i() {
        this.f21362c.clear();
        this.f21363d.clear();
        int size = this.f21361b.size();
        for (int i6 = 0; i6 < size; i6++) {
            e(this.f21361b.f(i6), this.f21362c, this.f21363d);
        }
        return this.f21362c;
    }

    public boolean j(java.lang.Object obj) {
        int size = this.f21361b.size();
        for (int i6 = 0; i6 < size; i6++) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f21361b.k(i6);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
