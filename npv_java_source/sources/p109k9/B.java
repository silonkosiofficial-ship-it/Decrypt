package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B implements p109k9.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p109k9.n f49825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Set f49826b;

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.l {
        a(java.lang.Object obj) {
            super(1, obj, p109k9.InterfaceC6916b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.String l(java.lang.Object obj) {
            return (java.lang.String) ((p109k9.InterfaceC6916b) this.f57287D).b(obj);
        }
    }

    public B(p109k9.n nVar, java.util.Set set) {
        p247y7.AbstractC7350t.f(nVar, "field");
        p247y7.AbstractC7350t.f(set, "acceptedStrings");
        this.f49825a = nVar;
        this.f49826b = set;
        if (!(!set.isEmpty())) {
            throw new java.lang.IllegalArgumentException("The set of accepted strings is empty".toString());
        }
    }

    @Override // p109k9.l
    public p119l9.e a() {
        return new p119l9.j(new k9.B.a(this.f49825a.b()));
    }

    @Override // p109k9.l
    public p129m9.q b() {
        return new p129m9.q(p097j7.AbstractC6879v.e(new p129m9.u(this.f49826b, this.f49825a.b(), this.f49825a.getName())), p097j7.AbstractC6879v.m());
    }

    @Override // p109k9.l
    public final p109k9.n c() {
        return this.f49825a;
    }
}
