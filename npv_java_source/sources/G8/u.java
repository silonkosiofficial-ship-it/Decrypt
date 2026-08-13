package G8;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G8.u f3165a = new G8.u();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final G8.u.a f3166C = new G8.u.a.c("START", 0);

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final G8.u.a f3167D = new G8.u.a.C0076a("ACCEPT_NULL", 1);

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final G8.u.a f3168E = new G8.u.a.d("UNKNOWN", 2);

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final G8.u.a f3169F = new G8.u.a.b("NOT_NULL", 3);

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private static final /* synthetic */ G8.u.a[] f3170G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f3171H;

        /* JADX INFO: renamed from: G8.u$a$a, reason: collision with other inner class name */
        static final class C0076a extends G8.u.a {
            C0076a(java.lang.String str, int i6) {
                super(str, i6, null);
            }

            @Override // G8.u.a
            public G8.u.a g(F8.t0 t0Var) {
                p247y7.AbstractC7350t.f(t0Var, "nextType");
                return i(t0Var);
            }
        }

        static final class b extends G8.u.a {
            b(java.lang.String str, int i6) {
                super(str, i6, null);
            }

            @Override // G8.u.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public G8.u.a.b g(F8.t0 t0Var) {
                p247y7.AbstractC7350t.f(t0Var, "nextType");
                return this;
            }
        }

        static final class c extends G8.u.a {
            c(java.lang.String str, int i6) {
                super(str, i6, null);
            }

            @Override // G8.u.a
            public G8.u.a g(F8.t0 t0Var) {
                p247y7.AbstractC7350t.f(t0Var, "nextType");
                return i(t0Var);
            }
        }

        static final class d extends G8.u.a {
            d(java.lang.String str, int i6) {
                super(str, i6, null);
            }

            @Override // G8.u.a
            public G8.u.a g(F8.t0 t0Var) {
                p247y7.AbstractC7350t.f(t0Var, "nextType");
                G8.u.a aVarI = i(t0Var);
                return aVarI == G8.u.a.f3167D ? this : aVarI;
            }
        }

        static {
            G8.u.a[] aVarArrE = e();
            f3170G = aVarArrE;
            f3171H = p157p7.b.a(aVarArrE);
        }

        private a(java.lang.String str, int i6) {
            super(str, i6);
        }

        public /* synthetic */ a(java.lang.String str, int i6, p247y7.AbstractC7342k abstractC7342k) {
            this(str, i6);
        }

        private static final /* synthetic */ G8.u.a[] e() {
            return new G8.u.a[]{f3166C, f3167D, f3168E, f3169F};
        }

        public static G8.u.a valueOf(java.lang.String str) {
            return (G8.u.a) java.lang.Enum.valueOf(G8.u.a.class, str);
        }

        public static G8.u.a[] values() {
            return (G8.u.a[]) f3170G.clone();
        }

        public abstract G8.u.a g(F8.t0 t0Var);

        protected final G8.u.a i(F8.t0 t0Var) {
            p247y7.AbstractC7350t.f(t0Var, "<this>");
            if (t0Var.X0()) {
                return f3167D;
            }
            if (t0Var instanceof F8.C0954o) {
                ((F8.C0954o) t0Var).i1();
            }
            return G8.n.f3160a.a(t0Var) ? f3169F : f3168E;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.Set f3172D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.util.Set set) {
            super(0);
            this.f3172D = set;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String b() {
            return "This collections cannot be empty! input types: " + p097j7.AbstractC6879v.r0(this.f3172D, null, null, null, 0, null, null, 63, null);
        }
    }

    /* synthetic */ class c extends p247y7.AbstractC7347p implements p237x7.p {
        c(java.lang.Object obj) {
            super(2, obj);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "isStrictSupertype";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(G8.u.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean u(F8.E e6, F8.E e10) {
            p247y7.AbstractC7350t.f(e6, "p0");
            p247y7.AbstractC7350t.f(e10, "p1");
            return java.lang.Boolean.valueOf(((G8.u) this.f57287D).e(e6, e10));
        }
    }

    /* synthetic */ class d extends p247y7.AbstractC7347p implements p237x7.p {
        d(java.lang.Object obj) {
            super(2, obj);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "equalTypes";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(G8.m.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean u(F8.E e6, F8.E e10) {
            p247y7.AbstractC7350t.f(e6, "p0");
            p247y7.AbstractC7350t.f(e10, "p1");
            return java.lang.Boolean.valueOf(((G8.m) this.f57287D).b(e6, e10));
        }
    }

    private u() {
    }

    private final java.util.Collection b(java.util.Collection collection, p237x7.p pVar) {
        java.util.ArrayList<F8.M> arrayList = new java.util.ArrayList(collection);
        java.util.Iterator it = arrayList.iterator();
        p247y7.AbstractC7350t.e(it, "iterator(...)");
        while (it.hasNext()) {
            F8.M m6 = (F8.M) it.next();
            if (!arrayList.isEmpty()) {
                for (F8.M m10 : arrayList) {
                    if (m10 != m6) {
                        p247y7.AbstractC7350t.c(m10);
                        p247y7.AbstractC7350t.c(m6);
                        if (((java.lang.Boolean) pVar.u(m10, m6)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final F8.M d(java.util.Set set) {
        if (set.size() == 1) {
            return (F8.M) p097j7.AbstractC6879v.F0(set);
        }
        new G8.u.b(set);
        java.util.Set set2 = set;
        java.util.Collection collectionB = b(set2, new G8.u.c(this));
        collectionB.isEmpty();
        F8.M mB = p198t8.n.f54639f.b(collectionB);
        if (mB != null) {
            return mB;
        }
        java.util.Collection collectionB2 = b(collectionB, new G8.u.d(G8.l.f3154b.a()));
        collectionB2.isEmpty();
        return collectionB2.size() < 2 ? (F8.M) p097j7.AbstractC6879v.F0(collectionB2) : new F8.D(set2).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(F8.E e6, F8.E e10) {
        G8.m mVarA = G8.l.f3154b.a();
        return mVarA.d(e6, e10) && !mVarA.d(e10, e6);
    }

    public final F8.M c(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "types");
        list.size();
        java.util.ArrayList<F8.M> arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            F8.M m6 = (F8.M) it.next();
            if (m6.W0() instanceof F8.D) {
                java.util.Collection collectionU = m6.W0().u();
                p247y7.AbstractC7350t.e(collectionU, "getSupertypes(...)");
                java.util.Collection<F8.E> collection = collectionU;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(collection, 10));
                for (F8.E e6 : collection) {
                    p247y7.AbstractC7350t.c(e6);
                    F8.M mD = F8.B.d(e6);
                    if (m6.X0()) {
                        mD = mD.a1(true);
                    }
                    arrayList2.add(mD);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(m6);
            }
        }
        G8.u.a aVarG = G8.u.a.f3166C;
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVarG = aVarG.g((F8.t0) it2.next());
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (F8.M mI : arrayList) {
            if (aVarG == G8.u.a.f3169F) {
                if (mI instanceof G8.i) {
                    mI = F8.Q.k((G8.i) mI);
                }
                mI = F8.Q.i(mI, false, 1, null);
            }
            linkedHashSet.add(mI);
        }
        java.util.List list2 = list;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        java.util.Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((F8.M) it3.next()).V0());
        }
        java.util.Iterator it4 = arrayList3.iterator();
        if (!it4.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        java.lang.Object next = it4.next();
        while (it4.hasNext()) {
            next = ((F8.a0) next).D((F8.a0) it4.next());
        }
        return d(linkedHashSet).c1((F8.a0) next);
    }
}
