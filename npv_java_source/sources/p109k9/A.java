package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A implements p109k9.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p109k9.n f49820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Integer f49821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Integer f49822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Integer f49823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.Integer f49824e;

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

    public A(p109k9.n nVar, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
        p247y7.AbstractC7350t.f(nVar, "field");
        this.f49820a = nVar;
        this.f49821b = num;
        this.f49822c = num2;
        this.f49823d = num3;
        this.f49824e = num4;
        if (num != null && num.intValue() < 0) {
            throw new java.lang.IllegalArgumentException(("The minimum number of digits (" + num + ") is negative").toString());
        }
        if (num2 == null || num == null || num2.intValue() >= num.intValue()) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("The maximum number of digits (" + num2 + ") is less than the minimum number of digits (" + num + ')').toString());
    }

    @Override // p109k9.l
    public p119l9.e a() {
        k9.A.a aVar = new k9.A.a(this.f49820a.b());
        java.lang.Integer num = this.f49821b;
        p119l9.h hVar = new p119l9.h(aVar, num != null ? num.intValue() : 0, this.f49824e);
        java.lang.Integer num2 = this.f49823d;
        return num2 != null ? new p119l9.i(hVar, num2.intValue()) : hVar;
    }

    @Override // p109k9.l
    public p129m9.q b() {
        return p129m9.p.b(this.f49821b, this.f49822c, this.f49823d, this.f49820a.b(), this.f49820a.getName(), this.f49824e);
    }

    @Override // p109k9.l
    public final p109k9.n c() {
        return this.f49820a;
    }
}
