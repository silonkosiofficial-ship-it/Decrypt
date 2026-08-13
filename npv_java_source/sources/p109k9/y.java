package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y implements p109k9.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p109k9.n f49870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49872c;

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.l {
        a(java.lang.Object obj) {
            super(1, obj, p109k9.InterfaceC6916b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer l(java.lang.Object obj) {
            return (java.lang.Integer) ((p109k9.InterfaceC6916b) this.f57287D).b(obj);
        }
    }

    public y(p109k9.n nVar, int i6, int i10) {
        p247y7.AbstractC7350t.f(nVar, "field");
        this.f49870a = nVar;
        this.f49871b = i6;
        this.f49872c = i10;
    }

    @Override // p109k9.l
    public p119l9.e a() {
        return new p119l9.f(new k9.y.a(this.f49870a.b()), this.f49871b, this.f49872c);
    }

    @Override // p109k9.l
    public p129m9.q b() {
        return p129m9.p.a(this.f49871b, this.f49872c, this.f49870a.b(), this.f49870a.getName());
    }

    @Override // p109k9.l
    public final p109k9.n c() {
        return this.f49870a;
    }
}
