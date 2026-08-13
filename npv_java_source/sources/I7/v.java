package I7;

/* JADX INFO: loaded from: classes2.dex */
public class v extends I7.y implements F7.l {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5508Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5509R;

    public static final class a extends I7.y.c implements F7.l.a {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private final I7.v f5510L;

        public a(I7.v vVar) {
            p247y7.AbstractC7350t.f(vVar, "property");
            this.f5510L = vVar;
        }

        @Override // F7.k.a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public I7.v a() {
            return this.f5510L;
        }

        @Override // p237x7.a
        public java.lang.Object b() {
            return a().get();
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I7.v.a b() {
            return new I7.v.a(I7.v.this);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        public final java.lang.Object b() {
            I7.v vVar = I7.v.this;
            return vVar.H(vVar.F(), null, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(I7.AbstractC1278n abstractC1278n, O7.U u6) {
        super(abstractC1278n, u6);
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        p247y7.AbstractC7350t.f(u6, "descriptor");
        p087i7.r rVar = p087i7.r.PUBLICATION;
        this.f5508Q = p087i7.AbstractC6669o.a(rVar, new I7.v.b());
        this.f5509R = p087i7.AbstractC6669o.a(rVar, new I7.v.c());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(I7.AbstractC1278n abstractC1278n, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        super(abstractC1278n, str, str2, obj);
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "signature");
        p087i7.r rVar = p087i7.r.PUBLICATION;
        this.f5508Q = p087i7.AbstractC6669o.a(rVar, new I7.v.b());
        this.f5509R = p087i7.AbstractC6669o.a(rVar, new I7.v.c());
    }

    @Override // F7.k
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public I7.v.a d() {
        return (I7.v.a) this.f5508Q.getValue();
    }

    @Override // p237x7.a
    public java.lang.Object b() {
        return get();
    }

    @Override // F7.l
    public java.lang.Object get() {
        return d().z(new java.lang.Object[0]);
    }
}
