package p219v9;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements p219v9.f, p239x9.InterfaceC7310k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f56038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v9.m f56039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f56040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f56041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Set f56042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String[] f56043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p219v9.f[] f56044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.List[] f56045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f56046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.Map f56047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p219v9.f[] f56048k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f56049l;

    public i(java.lang.String str, p219v9.m mVar, int i6, java.util.List list, p219v9.a aVar) {
        p247y7.AbstractC7350t.f(str, "serialName");
        p247y7.AbstractC7350t.f(mVar, "kind");
        p247y7.AbstractC7350t.f(list, "typeParameters");
        p247y7.AbstractC7350t.f(aVar, "builder");
        this.f56038a = str;
        this.f56039b = mVar;
        this.f56040c = i6;
        this.f56041d = aVar.c();
        this.f56042e = p097j7.AbstractC6879v.R0(aVar.f());
        java.lang.String[] strArr = (java.lang.String[]) aVar.f().toArray(new java.lang.String[0]);
        this.f56043f = strArr;
        this.f56044g = p239x9.AbstractC7299e0.b(aVar.e());
        this.f56045h = (java.util.List[]) aVar.d().toArray(new java.util.List[0]);
        this.f56046i = p097j7.AbstractC6879v.O0(aVar.g());
        java.lang.Iterable<p097j7.L> iterableE1 = p097j7.AbstractC6872n.e1(strArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(iterableE1, 10));
        for (p097j7.L l6 : iterableE1) {
            arrayList.add(p087i7.B.a(l6.d(), java.lang.Integer.valueOf(l6.c())));
        }
        this.f56047j = p097j7.S.q(arrayList);
        this.f56048k = p239x9.AbstractC7299e0.b(list);
        this.f56049l = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: v9.g
            @Override // p237x7.a
            public final java.lang.Object b() {
                return java.lang.Integer.valueOf(p219v9.i.o(this.f56036C));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(p219v9.i iVar) {
        return p239x9.AbstractC7313l0.a(iVar, iVar.f56048k);
    }

    private final int p() {
        return ((java.lang.Number) this.f56049l.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence q(p219v9.i iVar, int i6) {
        return iVar.f(i6) + ": " + iVar.h(i6).a();
    }

    @Override // p219v9.f
    public java.lang.String a() {
        return this.f56038a;
    }

    @Override // p239x9.InterfaceC7310k
    public java.util.Set b() {
        return this.f56042e;
    }

    @Override // p219v9.f
    public /* synthetic */ boolean c() {
        return p219v9.e.c(this);
    }

    @Override // p219v9.f
    public int d(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        java.lang.Integer num = (java.lang.Integer) this.f56047j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p219v9.f
    public int e() {
        return this.f56040c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p219v9.i) {
            p219v9.f fVar = (p219v9.f) obj;
            if (p247y7.AbstractC7350t.b(a(), fVar.a()) && java.util.Arrays.equals(this.f56048k, ((p219v9.i) obj).f56048k) && e() == fVar.e()) {
                int iE = e();
                for (int i6 = 0; i6 < iE; i6++) {
                    if (p247y7.AbstractC7350t.b(h(i6).a(), fVar.h(i6).a()) && p247y7.AbstractC7350t.b(h(i6).j(), fVar.h(i6).j())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p219v9.f
    public java.lang.String f(int i6) {
        return this.f56043f[i6];
    }

    @Override // p219v9.f
    public java.util.List g(int i6) {
        return this.f56045h[i6];
    }

    @Override // p219v9.f
    public p219v9.f h(int i6) {
        return this.f56044g[i6];
    }

    public int hashCode() {
        return p();
    }

    @Override // p219v9.f
    public boolean i(int i6) {
        return this.f56046i[i6];
    }

    @Override // p219v9.f
    public p219v9.m j() {
        return this.f56039b;
    }

    @Override // p219v9.f
    public java.util.List k() {
        return this.f56041d;
    }

    @Override // p219v9.f
    public /* synthetic */ boolean m() {
        return p219v9.e.b(this);
    }

    public java.lang.String toString() {
        return p097j7.AbstractC6879v.r0(E7.j.q(0, e()), ", ", a() + '(', ")", 0, null, new p237x7.l() { // from class: v9.h
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return p219v9.i.q(this.f56037C, ((java.lang.Integer) obj).intValue());
            }
        }, 24, null);
    }
}
