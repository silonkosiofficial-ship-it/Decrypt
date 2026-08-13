package I7;

/* JADX INFO: loaded from: classes2.dex */
public class x extends I7.y implements F7.n {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5518Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5519R;

    public static final class a extends I7.y.c implements F7.n.a {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private final I7.x f5520L;

        public a(I7.x xVar) {
            p247y7.AbstractC7350t.f(xVar, "property");
            this.f5520L = xVar;
        }

        @Override // F7.k.a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public I7.x a() {
            return this.f5520L;
        }

        @Override // p237x7.p
        public java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return G().w(obj, obj2);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I7.x.a b() {
            return new I7.x.a(I7.x.this);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.reflect.Member b() {
            return I7.x.this.F();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(I7.AbstractC1278n abstractC1278n, O7.U u6) {
        super(abstractC1278n, u6);
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        p247y7.AbstractC7350t.f(u6, "descriptor");
        p087i7.r rVar = p087i7.r.PUBLICATION;
        this.f5518Q = p087i7.AbstractC6669o.a(rVar, new I7.x.b());
        this.f5519R = p087i7.AbstractC6669o.a(rVar, new I7.x.c());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(I7.AbstractC1278n abstractC1278n, java.lang.String str, java.lang.String str2) {
        super(abstractC1278n, str, str2, p247y7.AbstractC7337f.f57285I);
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "signature");
        p087i7.r rVar = p087i7.r.PUBLICATION;
        this.f5518Q = p087i7.AbstractC6669o.a(rVar, new I7.x.b());
        this.f5519R = p087i7.AbstractC6669o.a(rVar, new I7.x.c());
    }

    @Override // F7.k
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public I7.x.a d() {
        return (I7.x.a) this.f5518Q.getValue();
    }

    @Override // p237x7.p
    public java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
        return w(obj, obj2);
    }

    @Override // F7.n
    public java.lang.Object w(java.lang.Object obj, java.lang.Object obj2) {
        return J().z(obj, obj2);
    }
}
