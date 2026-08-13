package p239x9;

/* JADX INFO: renamed from: x9.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7295c0 implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f56989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.List f56990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f56991c;

    public C7295c0(final java.lang.String str, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(str, "serialName");
        p247y7.AbstractC7350t.f(obj, "objectInstance");
        this.f56989a = obj;
        this.f56990b = p097j7.AbstractC6879v.m();
        this.f56991c = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new p237x7.a() { // from class: x9.a0
            @Override // p237x7.a
            public final java.lang.Object b() {
                return p239x9.C7295c0.h(str, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p219v9.f h(java.lang.String str, final p239x9.C7295c0 c7295c0) {
        return p219v9.l.c(str, v9.n.d.f56061a, new p219v9.f[0], new p237x7.l() { // from class: x9.b0
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return p239x9.C7295c0.i(this.f56988C, (p219v9.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M i(p239x9.C7295c0 c7295c0, p219v9.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "$this$buildSerialDescriptor");
        aVar.h(c7295c0.f56990b);
        return p087i7.M.f46721a;
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return (p219v9.f) this.f56991c.getValue();
    }

    @Override // p199t9.a
    public java.lang.Object b(p229w9.h hVar) {
        int iR;
        p247y7.AbstractC7350t.f(hVar, "decoder");
        p219v9.f fVarA = a();
        p229w9.d dVarA = hVar.a(fVarA);
        if (dVarA.v() || (iR = dVarA.r(a())) == -1) {
            p087i7.M m6 = p087i7.M.f46721a;
            dVarA.b(fVarA);
            return this.f56989a;
        }
        throw new p199t9.d("Unexpected index " + iR);
    }

    @Override // p199t9.e
    public void e(p229w9.j jVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        p247y7.AbstractC7350t.f(obj, "value");
        jVar.a(a()).b(a());
    }
}
