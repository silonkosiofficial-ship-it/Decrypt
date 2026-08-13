package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k implements p109k9.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p109k9.n f49850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f49853d;

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.l {
        a(java.lang.Object obj) {
            super(1, obj, p109k9.InterfaceC6916b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final p099j9.a l(java.lang.Object obj) {
            return (p099j9.a) ((p109k9.InterfaceC6916b) this.f57287D).b(obj);
        }
    }

    public k(p109k9.n nVar, int i6, int i10, java.util.List list) {
        p247y7.AbstractC7350t.f(nVar, "field");
        p247y7.AbstractC7350t.f(list, "zerosToAdd");
        this.f49850a = nVar;
        this.f49851b = i6;
        this.f49852c = i10;
        this.f49853d = list;
    }

    @Override // p109k9.l
    public p119l9.e a() {
        return new p119l9.d(new k9.k.a(this.f49850a.b()), this.f49851b, this.f49852c, this.f49853d);
    }

    @Override // p109k9.l
    public p129m9.q b() {
        return new p129m9.q(p097j7.AbstractC6879v.e(new p129m9.h(p097j7.AbstractC6879v.e(new p129m9.d(this.f49851b, this.f49852c, this.f49850a.b(), this.f49850a.getName())))), p097j7.AbstractC6879v.m());
    }

    @Override // p109k9.l
    public final p109k9.n c() {
        return this.f49850a;
    }
}
