package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E implements p109k9.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p109k9.D f49835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Integer f49837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f49838d;

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

    public E(p109k9.D d6, int i6, java.lang.Integer num) {
        p247y7.AbstractC7350t.f(d6, "field");
        this.f49835a = d6;
        this.f49836b = i6;
        this.f49837c = num;
        int iE = d6.e();
        this.f49838d = iE;
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("The minimum number of digits (" + i6 + ") is negative").toString());
        }
        if (iE < i6) {
            throw new java.lang.IllegalArgumentException(("The maximum number of digits (" + iE + ") is less than the minimum number of digits (" + i6 + ')').toString());
        }
        if (num == null || num.intValue() > i6) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i6 + ')').toString());
    }

    @Override // p109k9.l
    public p119l9.e a() {
        p119l9.k kVar = new p119l9.k(new k9.E.a(this.f49835a.b()), this.f49836b);
        java.lang.Integer num = this.f49837c;
        return num != null ? new p119l9.i(kVar, num.intValue()) : kVar;
    }

    @Override // p109k9.l
    public p129m9.q b() {
        return p129m9.p.f(java.lang.Integer.valueOf(this.f49836b), java.lang.Integer.valueOf(this.f49838d), this.f49837c, this.f49835a.b(), this.f49835a.getName(), false, 32, null);
    }

    @Override // p109k9.l
    public /* bridge */ /* synthetic */ p109k9.n c() {
        return this.f49835a;
    }
}
