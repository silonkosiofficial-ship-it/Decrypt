package U6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.a f14547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T6.InterfaceC1668p f14548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f14549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f14550d;

    public static final class a extends U6.e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final p237x7.a f14551e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p237x7.a aVar, p237x7.a aVar2, T6.InterfaceC1668p interfaceC1668p) {
            super(aVar2, interfaceC1668p, null);
            p247y7.AbstractC7350t.f(aVar, "provider");
            p247y7.AbstractC7350t.f(aVar2, "dispose");
            p247y7.AbstractC7350t.f(interfaceC1668p, "partHeaders");
            this.f14551e = aVar;
        }

        public final p237x7.a f() {
            return this.f14551e;
        }
    }

    public static final class b extends U6.e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final java.lang.String f14552e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String str, p237x7.a aVar, T6.InterfaceC1668p interfaceC1668p) {
            super(aVar, interfaceC1668p, null);
            p247y7.AbstractC7350t.f(str, "value");
            p247y7.AbstractC7350t.f(aVar, "dispose");
            p247y7.AbstractC7350t.f(interfaceC1668p, "partHeaders");
            this.f14552e = str;
        }

        public final java.lang.String f() {
            return this.f14552e;
        }
    }

    private e(p237x7.a aVar, T6.InterfaceC1668p interfaceC1668p) {
        this.f14547a = aVar;
        this.f14548b = interfaceC1668p;
        p087i7.r rVar = p087i7.r.NONE;
        this.f14549c = p087i7.AbstractC6669o.a(rVar, new p237x7.a() { // from class: U6.c
            @Override // p237x7.a
            public final java.lang.Object b() {
                return U6.e.c(this.f14545C);
            }
        });
        this.f14550d = p087i7.AbstractC6669o.a(rVar, new p237x7.a() { // from class: U6.d
            @Override // p237x7.a
            public final java.lang.Object b() {
                return U6.e.d(this.f14546C);
            }
        });
    }

    public /* synthetic */ e(p237x7.a aVar, T6.InterfaceC1668p interfaceC1668p, p247y7.AbstractC7342k abstractC7342k) {
        this(aVar, interfaceC1668p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T6.C1659g c(U6.e eVar) {
        java.lang.String strD = eVar.f14548b.d(T6.C1673v.f13241a.f());
        if (strD != null) {
            return T6.C1659g.f13104d.a(strD);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T6.C1660h d(U6.e eVar) {
        java.lang.String strD = eVar.f14548b.d(T6.C1673v.f13241a.h());
        if (strD != null) {
            return T6.C1660h.f13129f.b(strD);
        }
        return null;
    }

    public final T6.InterfaceC1668p e() {
        return this.f14548b;
    }
}
