package P7;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements P7.g {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f8395C;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p138n8.c f8396D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p138n8.c cVar) {
            super(1);
            this.f8396D = cVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P7.c l(P7.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "it");
            return gVar.j(this.f8396D);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final P7.k.b f8397D = new P7.k.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R8.h l(P7.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "it");
            return p097j7.AbstractC6879v.Y(gVar);
        }
    }

    public k(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "delegates");
        this.f8395C = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(P7.g... gVarArr) {
        this(p097j7.AbstractC6872n.R0(gVarArr));
        p247y7.AbstractC7350t.f(gVarArr, "delegates");
    }

    @Override // P7.g
    public boolean H(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        java.util.Iterator it = p097j7.AbstractC6879v.Y(this.f8395C).iterator();
        while (it.hasNext()) {
            if (((P7.g) it.next()).H(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // P7.g
    public boolean isEmpty() {
        java.util.List list = this.f8395C;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((P7.g) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return R8.k.B(p097j7.AbstractC6879v.Y(this.f8395C), P7.k.b.f8397D).iterator();
    }

    @Override // P7.g
    public P7.c j(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        return (P7.c) R8.k.A(R8.k.H(p097j7.AbstractC6879v.Y(this.f8395C), new P7.k.a(cVar)));
    }
}
