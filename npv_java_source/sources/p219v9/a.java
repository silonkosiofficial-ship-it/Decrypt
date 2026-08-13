package p219v9;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f56019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.List f56020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f56021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Set f56022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f56023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f56024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.List f56025g;

    public a(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "serialName");
        this.f56019a = str;
        this.f56020b = p097j7.AbstractC6879v.m();
        this.f56021c = new java.util.ArrayList();
        this.f56022d = new java.util.HashSet();
        this.f56023e = new java.util.ArrayList();
        this.f56024f = new java.util.ArrayList();
        this.f56025g = new java.util.ArrayList();
    }

    public static /* synthetic */ void b(p219v9.a aVar, java.lang.String str, p219v9.f fVar, java.util.List list, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            list = p097j7.AbstractC6879v.m();
        }
        if ((i6 & 8) != 0) {
            z6 = false;
        }
        aVar.a(str, fVar, list, z6);
    }

    public final void a(java.lang.String str, p219v9.f fVar, java.util.List list, boolean z6) {
        p247y7.AbstractC7350t.f(str, "elementName");
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p247y7.AbstractC7350t.f(list, "annotations");
        if (this.f56022d.add(str)) {
            this.f56021c.add(str);
            this.f56023e.add(fVar);
            this.f56024f.add(list);
            this.f56025g.add(java.lang.Boolean.valueOf(z6));
            return;
        }
        throw new java.lang.IllegalArgumentException(("Element with name '" + str + "' is already registered in " + this.f56019a).toString());
    }

    public final java.util.List c() {
        return this.f56020b;
    }

    public final java.util.List d() {
        return this.f56024f;
    }

    public final java.util.List e() {
        return this.f56023e;
    }

    public final java.util.List f() {
        return this.f56021c;
    }

    public final java.util.List g() {
        return this.f56025g;
    }

    public final void h(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<set-?>");
        this.f56020b = list;
    }
}
