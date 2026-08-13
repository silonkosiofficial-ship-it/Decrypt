package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements p109k9.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p109k9.o f49873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f49874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Set f49875c;

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.l {
        a() {
            super(1, p247y7.AbstractC7350t.a.class, "checkIfAllNegative", "formatter$checkIfAllNegative(Lkotlinx/datetime/internal/format/SignedFormatStructure;Ljava/lang/Object;)Z", 0);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(p109k9.z.e(p109k9.z.this, obj));
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {
        b() {
            super(2);
        }

        public final void a(java.lang.Object obj, boolean z6) {
            for (p109k9.m mVar : p109k9.z.this.f49875c) {
                mVar.c().c(obj, java.lang.Boolean.valueOf(z6 != p247y7.AbstractC7350t.b(mVar.c().a(obj), java.lang.Boolean.TRUE)));
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a(obj, ((java.lang.Boolean) obj2).booleanValue());
            return p087i7.M.f46721a;
        }
    }

    public z(p109k9.o oVar, boolean z6) {
        p247y7.AbstractC7350t.f(oVar, "format");
        this.f49873a = oVar;
        this.f49874b = z6;
        java.util.List listB = p109k9.p.b(oVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listB.iterator();
        while (it.hasNext()) {
            p109k9.m mVarC = ((p109k9.l) it.next()).c().c();
            if (mVarC != null) {
                arrayList.add(mVarC);
            }
        }
        java.util.Set setY0 = p097j7.AbstractC6879v.Y0(arrayList);
        this.f49875c = setY0;
        if (!(!setY0.isEmpty())) {
            throw new java.lang.IllegalArgumentException("Signed format must contain at least one field with a sign".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(p109k9.z zVar, java.lang.Object obj) {
        boolean z6 = false;
        for (p109k9.m mVar : zVar.f49875c) {
            if (p247y7.AbstractC7350t.b(mVar.c().a(obj), java.lang.Boolean.TRUE)) {
                z6 = true;
            } else if (!mVar.a(obj)) {
                return false;
            }
        }
        return z6;
    }

    @Override // p109k9.o
    public p119l9.e a() {
        return new p119l9.g(this.f49873a.a(), new k9.z.a(), this.f49874b);
    }

    @Override // p109k9.o
    public p129m9.q b() {
        return p129m9.n.b(p097j7.AbstractC6879v.p(new p129m9.q(p097j7.AbstractC6879v.e(new p129m9.t(new k9.z.b(), this.f49874b, "sign for " + this.f49875c)), p097j7.AbstractC6879v.m()), this.f49873a.b()));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p109k9.z) {
            p109k9.z zVar = (p109k9.z) obj;
            if (p247y7.AbstractC7350t.b(this.f49873a, zVar.f49873a) && this.f49874b == zVar.f49874b) {
                return true;
            }
        }
        return false;
    }

    public final p109k9.o f() {
        return this.f49873a;
    }

    public int hashCode() {
        return (this.f49873a.hashCode() * 31) + p190t.h.a(this.f49874b);
    }

    public java.lang.String toString() {
        return "SignedFormatStructure(" + this.f49873a + ')';
    }
}
