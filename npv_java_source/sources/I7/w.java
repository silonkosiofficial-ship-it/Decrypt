package I7;

/* JADX INFO: loaded from: classes2.dex */
public class w extends I7.y implements F7.m {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5513Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5514R;

    public static final class a extends I7.y.c implements F7.m.a {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private final I7.w f5515L;

        public a(I7.w wVar) {
            p247y7.AbstractC7350t.f(wVar, "property");
            this.f5515L = wVar;
        }

        @Override // F7.k.a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public I7.w a() {
            return this.f5515L;
        }

        @Override // p237x7.l
        public java.lang.Object l(java.lang.Object obj) {
            return a().get(obj);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I7.w.a b() {
            return new I7.w.a(I7.w.this);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.reflect.Member b() {
            return I7.w.this.F();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(I7.AbstractC1278n abstractC1278n, O7.U u6) {
        super(abstractC1278n, u6);
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        p247y7.AbstractC7350t.f(u6, "descriptor");
        p087i7.r rVar = p087i7.r.PUBLICATION;
        this.f5513Q = p087i7.AbstractC6669o.a(rVar, new I7.w.b());
        this.f5514R = p087i7.AbstractC6669o.a(rVar, new I7.w.c());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(I7.AbstractC1278n abstractC1278n, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        super(abstractC1278n, str, str2, obj);
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "signature");
        p087i7.r rVar = p087i7.r.PUBLICATION;
        this.f5513Q = p087i7.AbstractC6669o.a(rVar, new I7.w.b());
        this.f5514R = p087i7.AbstractC6669o.a(rVar, new I7.w.c());
    }

    @Override // F7.k
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public I7.w.a d() {
        return (I7.w.a) this.f5513Q.getValue();
    }

    @Override // F7.m
    public java.lang.Object get(java.lang.Object obj) {
        return d().z(obj);
    }

    @Override // p237x7.l
    public java.lang.Object l(java.lang.Object obj) {
        return get(obj);
    }
}
