package R7;

/* JADX INFO: renamed from: R7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1499e extends R7.AbstractC1505k implements O7.f0 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final F8.u0 f9596G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final boolean f9597H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final int f9598I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final E8.i f9599J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final E8.i f9600K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final E8.n f9601L;

    /* JADX INFO: renamed from: R7.e$a */
    class a implements p237x7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ E8.n f9602C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ O7.d0 f9603D;

        a(E8.n nVar, O7.d0 d0Var) {
            this.f9602C = nVar;
            this.f9603D = d0Var;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public F8.e0 b() {
            return new R7.AbstractC1499e.c(R7.AbstractC1499e.this, this.f9602C, this.f9603D);
        }
    }

    /* JADX INFO: renamed from: R7.e$b */
    class b implements p237x7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p138n8.f f9605C;

        /* JADX INFO: renamed from: R7.e$b$a */
        class a implements p237x7.a {
            a() {
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public p248y8.h b() {
                return p248y8.n.j("Scope for type parameter " + R7.AbstractC1499e.b.this.f9605C.g(), R7.AbstractC1499e.this.getUpperBounds());
            }
        }

        b(p138n8.f fVar) {
            this.f9605C = fVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public F8.M b() {
            return F8.F.m(F8.a0.f2872D.i(), R7.AbstractC1499e.this.p(), java.util.Collections.emptyList(), false, new p248y8.g(new R7.AbstractC1499e.b.a()));
        }
    }

    /* JADX INFO: renamed from: R7.e$c */
    private class c extends F8.AbstractC0945f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final O7.d0 f9608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ R7.AbstractC1499e f9609e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(R7.AbstractC1499e abstractC1499e, E8.n nVar, O7.d0 d0Var) {
            super(nVar);
            if (nVar == null) {
                p(0);
            }
            this.f9609e = abstractC1499e;
            this.f9608d = d0Var;
        }

        private static /* synthetic */ void p(int i6) {
            java.lang.String str = (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5 || i6 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5 || i6 == 8) ? 2 : 3];
            switch (i6) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i6 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i6 == 2) {
                objArr[1] = "getParameters";
            } else if (i6 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i6 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i6 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i6 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i6) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4 && i6 != 5 && i6 != 8) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        @Override // F8.AbstractC0951l
        protected boolean d(O7.InterfaceC1427h interfaceC1427h) {
            if (interfaceC1427h == null) {
                p(9);
            }
            return (interfaceC1427h instanceof O7.f0) && p178r8.d.f53988a.h(this.f9609e, (O7.f0) interfaceC1427h, true);
        }

        @Override // F8.AbstractC0945f
        protected java.util.Collection g() {
            java.util.List listU0 = this.f9609e.U0();
            if (listU0 == null) {
                p(1);
            }
            return listU0;
        }

        @Override // F8.AbstractC0945f
        protected F8.E h() {
            return H8.k.d(H8.j.f4480W, new java.lang.String[0]);
        }

        @Override // F8.AbstractC0945f
        protected O7.d0 k() {
            O7.d0 d0Var = this.f9608d;
            if (d0Var == null) {
                p(5);
            }
            return d0Var;
        }

        @Override // F8.AbstractC0945f
        protected java.util.List m(java.util.List list) {
            if (list == null) {
                p(7);
            }
            java.util.List listO0 = this.f9609e.O0(list);
            if (listO0 == null) {
                p(8);
            }
            return listO0;
        }

        @Override // F8.AbstractC0945f
        protected void o(F8.E e6) {
            if (e6 == null) {
                p(6);
            }
            this.f9609e.T0(e6);
        }

        @Override // F8.e0
        public L7.g t() {
            L7.g gVarJ = p218v8.c.j(this.f9609e);
            if (gVarJ == null) {
                p(4);
            }
            return gVarJ;
        }

        public java.lang.String toString() {
            return this.f9609e.getName().toString();
        }

        @Override // F8.AbstractC0951l, F8.e0
        public O7.InterfaceC1427h w() {
            R7.AbstractC1499e abstractC1499e = this.f9609e;
            if (abstractC1499e == null) {
                p(3);
            }
            return abstractC1499e;
        }

        @Override // F8.e0
        public java.util.List x() {
            java.util.List listEmptyList = java.util.Collections.emptyList();
            if (listEmptyList == null) {
                p(2);
            }
            return listEmptyList;
        }

        @Override // F8.e0
        public boolean y() {
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1499e(E8.n nVar, O7.InterfaceC1432m interfaceC1432m, P7.g gVar, p138n8.f fVar, F8.u0 u0Var, boolean z6, int i6, O7.a0 a0Var, O7.d0 d0Var) {
        super(interfaceC1432m, gVar, fVar, a0Var);
        if (nVar == null) {
            M(0);
        }
        if (interfaceC1432m == null) {
            M(1);
        }
        if (gVar == null) {
            M(2);
        }
        if (fVar == null) {
            M(3);
        }
        if (u0Var == null) {
            M(4);
        }
        if (a0Var == null) {
            M(5);
        }
        if (d0Var == null) {
            M(6);
        }
        this.f9596G = u0Var;
        this.f9597H = z6;
        this.f9598I = i6;
        this.f9599J = nVar.d(new R7.AbstractC1499e.a(nVar, d0Var));
        this.f9600K = nVar.d(new R7.AbstractC1499e.b(fVar));
        this.f9601L = nVar;
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.String str;
        int i10;
        switch (i6) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i10 = 2;
                break;
            case 12:
            default:
                i10 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i6) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i6) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i6) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new java.lang.IllegalStateException(str2);
            case 12:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    @Override // O7.f0
    public boolean K() {
        return this.f9597H;
    }

    protected java.util.List O0(java.util.List list) {
        if (list == null) {
            M(12);
        }
        if (list == null) {
            M(13);
        }
        return list;
    }

    protected abstract void T0(F8.E e6);

    protected abstract java.util.List U0();

    @Override // R7.AbstractC1505k, R7.AbstractC1504j, O7.InterfaceC1432m
    public O7.f0 a() {
        O7.f0 f0Var = (O7.f0) super.a();
        if (f0Var == null) {
            M(11);
        }
        return f0Var;
    }

    @Override // O7.f0
    public int getIndex() {
        return this.f9598I;
    }

    @Override // O7.f0
    public java.util.List getUpperBounds() {
        java.util.List listU = ((R7.AbstractC1499e.c) p()).u();
        if (listU == null) {
            M(8);
        }
        return listU;
    }

    @Override // O7.f0, O7.InterfaceC1427h
    public final F8.e0 p() {
        F8.e0 e0Var = (F8.e0) this.f9599J.b();
        if (e0Var == null) {
            M(9);
        }
        return e0Var;
    }

    @Override // O7.f0
    public E8.n p0() {
        E8.n nVar = this.f9601L;
        if (nVar == null) {
            M(14);
        }
        return nVar;
    }

    @Override // O7.InterfaceC1432m
    public java.lang.Object r0(O7.InterfaceC1434o interfaceC1434o, java.lang.Object obj) {
        return interfaceC1434o.i(this, obj);
    }

    @Override // O7.f0
    public F8.u0 s() {
        F8.u0 u0Var = this.f9596G;
        if (u0Var == null) {
            M(7);
        }
        return u0Var;
    }

    @Override // O7.InterfaceC1427h
    public F8.M w() {
        F8.M m6 = (F8.M) this.f9600K.b();
        if (m6 == null) {
            M(10);
        }
        return m6;
    }

    @Override // O7.f0
    public boolean x0() {
        return false;
    }
}
