package T6;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements T6.H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T6.H f13175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f13176b;

    public h0(T6.H h6) {
        p247y7.AbstractC7350t.f(h6, "encodedParametersBuilder");
        this.f13175a = h6;
        this.f13176b = h6.b();
    }

    @Override // W6.z
    public java.util.Set a() {
        return T6.i0.c(this.f13175a).a();
    }

    @Override // W6.z
    public boolean b() {
        return this.f13176b;
    }

    @Override // W6.z
    public java.util.List c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        java.util.ArrayList arrayList = null;
        java.util.List listC = this.f13175a.c(T6.AbstractC1658f.m(str, false, 1, null));
        if (listC != null) {
            java.util.List list = listC;
            arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(T6.AbstractC1658f.k((java.lang.String) it.next(), 0, 0, true, null, 11, null));
            }
        }
        return arrayList;
    }

    @Override // W6.z
    public void clear() {
        this.f13175a.clear();
    }

    @Override // W6.z
    public void d(java.lang.String str, java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(iterable, "values");
        T6.H h6 = this.f13175a;
        java.lang.String strM = T6.AbstractC1658f.m(str, false, 1, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(T6.AbstractC1658f.o((java.lang.String) it.next()));
        }
        h6.d(strM, arrayList);
    }

    @Override // W6.z
    public void e(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "value");
        this.f13175a.e(T6.AbstractC1658f.m(str, false, 1, null), T6.AbstractC1658f.o(str2));
    }

    @Override // T6.H
    public T6.G i() {
        return T6.i0.c(this.f13175a);
    }

    @Override // W6.z
    public boolean isEmpty() {
        return this.f13175a.isEmpty();
    }

    @Override // W6.z
    public java.util.Set names() {
        java.util.Set setNames = this.f13175a.names();
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(setNames, 10));
        java.util.Iterator it = setNames.iterator();
        while (it.hasNext()) {
            arrayList.add(T6.AbstractC1658f.k((java.lang.String) it.next(), 0, 0, false, null, 15, null));
        }
        return p097j7.AbstractC6879v.Y0(arrayList);
    }
}
