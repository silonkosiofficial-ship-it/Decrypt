package G8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends F8.AbstractC0946g {

    public static final class a extends G8.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final G8.f.a f3135a = new G8.f.a();

        private a() {
        }
    }

    /* synthetic */ class b extends p247y7.AbstractC7347p implements p237x7.l {
        b(java.lang.Object obj) {
            super(1, obj);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "prepareType";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(G8.f.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final F8.t0 l(J8.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "p0");
            return ((G8.f) this.f57287D).a(iVar);
        }
    }

    private final F8.M c(F8.M m6) {
        F8.E type;
        F8.e0 e0VarW0 = m6.W0();
        F8.D dH = null;
        t0VarZ0 = null;
        F8.t0 t0VarZ0 = null;
        if (!(e0VarW0 instanceof p188s8.c)) {
            if (!(e0VarW0 instanceof F8.D) || !m6.X0()) {
                return m6;
            }
            F8.D d6 = (F8.D) e0VarW0;
            java.util.Collection collectionU = d6.u();
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collectionU, 10));
            java.util.Iterator it = collectionU.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                arrayList.add(K8.a.w((F8.E) it.next()));
                z6 = true;
            }
            if (z6) {
                F8.E eD = d6.d();
                dH = new F8.D(arrayList).h(eD != null ? K8.a.w(eD) : null);
            }
            if (dH != null) {
                d6 = dH;
            }
            return d6.c();
        }
        p188s8.c cVar = (p188s8.c) e0VarW0;
        F8.i0 i0VarA = cVar.a();
        if (i0VarA.a() != F8.u0.IN_VARIANCE) {
            i0VarA = null;
        }
        if (i0VarA != null && (type = i0VarA.getType()) != null) {
            t0VarZ0 = type.Z0();
        }
        F8.t0 t0Var = t0VarZ0;
        if (cVar.c() == null) {
            F8.i0 i0VarA2 = cVar.a();
            java.util.Collection collectionU2 = cVar.u();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(collectionU2, 10));
            java.util.Iterator it2 = collectionU2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((F8.E) it2.next()).Z0());
            }
            cVar.e(new G8.j(i0VarA2, arrayList2, null, 4, null));
        }
        J8.b bVar = J8.b.FOR_SUBTYPING;
        G8.j jVarC = cVar.c();
        p247y7.AbstractC7350t.c(jVarC);
        return new G8.i(bVar, jVarC, t0Var, m6.V0(), m6.X0(), false, 32, null);
    }

    @Override // F8.AbstractC0946g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public F8.t0 a(J8.i iVar) {
        F8.t0 t0VarD;
        p247y7.AbstractC7350t.f(iVar, "type");
        if (!(iVar instanceof F8.E)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        F8.t0 t0VarZ0 = ((F8.E) iVar).Z0();
        if (t0VarZ0 instanceof F8.M) {
            t0VarD = c((F8.M) t0VarZ0);
        } else {
            if (!(t0VarZ0 instanceof F8.AbstractC0963y)) {
                throw new p087i7.s();
            }
            F8.AbstractC0963y abstractC0963y = (F8.AbstractC0963y) t0VarZ0;
            F8.M mC = c(abstractC0963y.e1());
            F8.M mC2 = c(abstractC0963y.f1());
            t0VarD = (mC == abstractC0963y.e1() && mC2 == abstractC0963y.f1()) ? t0VarZ0 : F8.F.d(mC, mC2);
        }
        return F8.s0.c(t0VarD, t0VarZ0, new G8.f.b(this));
    }
}
