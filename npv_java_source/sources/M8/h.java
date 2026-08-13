package M8;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p138n8.f f7087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S8.o f7088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Collection f7089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.l f7090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M8.f[] f7091e;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final M8.h.a f7092D = new M8.h.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Void l(O7.InterfaceC1443y interfaceC1443y) {
            p247y7.AbstractC7350t.f(interfaceC1443y, "$this$null");
            return null;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final M8.h.b f7093D = new M8.h.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Void l(O7.InterfaceC1443y interfaceC1443y) {
            p247y7.AbstractC7350t.f(interfaceC1443y, "$this$null");
            return null;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final M8.h.c f7094D = new M8.h.c();

        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Void l(O7.InterfaceC1443y interfaceC1443y) {
            p247y7.AbstractC7350t.f(interfaceC1443y, "$this$null");
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(S8.o oVar, M8.f[] fVarArr, p237x7.l lVar) {
        this((p138n8.f) null, oVar, (java.util.Collection) null, lVar, (M8.f[]) java.util.Arrays.copyOf(fVarArr, fVarArr.length));
        p247y7.AbstractC7350t.f(oVar, "regex");
        p247y7.AbstractC7350t.f(fVarArr, "checks");
        p247y7.AbstractC7350t.f(lVar, "additionalChecks");
    }

    public /* synthetic */ h(S8.o oVar, M8.f[] fVarArr, p237x7.l lVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(oVar, fVarArr, (i6 & 4) != 0 ? M8.h.b.f7093D : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(java.util.Collection collection, M8.f[] fVarArr, p237x7.l lVar) {
        this((p138n8.f) null, (S8.o) null, collection, lVar, (M8.f[]) java.util.Arrays.copyOf(fVarArr, fVarArr.length));
        p247y7.AbstractC7350t.f(collection, "nameList");
        p247y7.AbstractC7350t.f(fVarArr, "checks");
        p247y7.AbstractC7350t.f(lVar, "additionalChecks");
    }

    public /* synthetic */ h(java.util.Collection collection, M8.f[] fVarArr, p237x7.l lVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(collection, fVarArr, (i6 & 4) != 0 ? M8.h.c.f7094D : lVar);
    }

    private h(p138n8.f fVar, S8.o oVar, java.util.Collection collection, p237x7.l lVar, M8.f... fVarArr) {
        this.f7087a = fVar;
        this.f7088b = oVar;
        this.f7089c = collection;
        this.f7090d = lVar;
        this.f7091e = fVarArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(p138n8.f fVar, M8.f[] fVarArr, p237x7.l lVar) {
        this(fVar, (S8.o) null, (java.util.Collection) null, lVar, (M8.f[]) java.util.Arrays.copyOf(fVarArr, fVarArr.length));
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(fVarArr, "checks");
        p247y7.AbstractC7350t.f(lVar, "additionalChecks");
    }

    public /* synthetic */ h(p138n8.f fVar, M8.f[] fVarArr, p237x7.l lVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(fVar, fVarArr, (i6 & 4) != 0 ? M8.h.a.f7092D : lVar);
    }

    public final M8.g a(O7.InterfaceC1443y interfaceC1443y) {
        p247y7.AbstractC7350t.f(interfaceC1443y, "functionDescriptor");
        for (M8.f fVar : this.f7091e) {
            java.lang.String strB = fVar.b(interfaceC1443y);
            if (strB != null) {
                return new M8.g.b(strB);
            }
        }
        java.lang.String str = (java.lang.String) this.f7090d.l(interfaceC1443y);
        return str != null ? new M8.g.b(str) : M8.g.c.f7086b;
    }

    public final boolean b(O7.InterfaceC1443y interfaceC1443y) {
        p247y7.AbstractC7350t.f(interfaceC1443y, "functionDescriptor");
        if (this.f7087a != null && !p247y7.AbstractC7350t.b(interfaceC1443y.getName(), this.f7087a)) {
            return false;
        }
        if (this.f7088b != null) {
            java.lang.String strG = interfaceC1443y.getName().g();
            p247y7.AbstractC7350t.e(strG, "asString(...)");
            if (!this.f7088b.d(strG)) {
                return false;
            }
        }
        java.util.Collection collection = this.f7089c;
        return collection == null || collection.contains(interfaceC1443y.getName());
    }
}
