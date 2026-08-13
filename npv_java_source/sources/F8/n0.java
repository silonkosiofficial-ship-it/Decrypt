package F8;

/* JADX INFO: loaded from: classes2.dex */
public class n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F8.n0 f2951b = g(F8.l0.f2948b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F8.l0 f2952a;

    static class a implements p237x7.l {
        a() {
        }

        private static /* synthetic */ void a(int i6) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean l(p138n8.c cVar) {
            if (cVar == null) {
                a(0);
            }
            return java.lang.Boolean.valueOf(!cVar.equals(L7.j.a.f6355Q));
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2953a;

        static {
            int[] iArr = new int[F8.n0.d.values().length];
            f2953a = iArr;
            try {
                iArr[F8.n0.d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f2953a[F8.n0.d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f2953a[F8.n0.d.NO_CONFLICT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private static final class c extends java.lang.Exception {
        public c(java.lang.String str) {
            super(str);
        }
    }

    private enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected n0(F8.l0 l0Var) {
        if (l0Var == null) {
            a(7);
        }
        this.f2952a = l0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    private static /* synthetic */ void a(int i6) {
        java.lang.String str;
        int i10;
        if (i6 != 1 && i6 != 2 && i6 != 8 && i6 != 34 && i6 != 37) {
            switch (i6) {
                default:
                    switch (i6) {
                        default:
                            switch (i6) {
                                default:
                                    switch (i6) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 1 && i6 != 2 && i6 != 8 && i6 != 34 && i6 != 37) {
            switch (i6) {
                case 11:
                case 12:
                case 13:
                    i10 = 2;
                    break;
                default:
                    switch (i6) {
                        case 19:
                        case 20:
                        case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i10 = 2;
                            break;
                        default:
                            switch (i6) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i10 = 2;
                                    break;
                                default:
                                    switch (i6) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i10 = 2;
                                            break;
                                        default:
                                            i10 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i10 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i6 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i6 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i6 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i6 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i6 != 37) {
            switch (i6) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i6) {
                        case 19:
                        case 20:
                        case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i6) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i6) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i6) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 1 && i6 != 2 && i6 != 8 && i6 != 34 && i6 != 37) {
            switch (i6) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i6) {
                        case 19:
                        case 20:
                        case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i6) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i6) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new java.lang.IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    private static void b(int i6, F8.i0 i0Var, F8.l0 l0Var) {
        if (i6 <= 100) {
            return;
        }
        throw new java.lang.IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + o(i0Var) + "; substitution: " + o(l0Var));
    }

    public static F8.u0 c(F8.u0 u0Var, F8.i0 i0Var) {
        if (u0Var == null) {
            a(35);
        }
        if (i0Var == null) {
            a(36);
        }
        if (!i0Var.b()) {
            return d(u0Var, i0Var.a());
        }
        F8.u0 u0Var2 = F8.u0.OUT_VARIANCE;
        if (u0Var2 == null) {
            a(37);
        }
        return u0Var2;
    }

    public static F8.u0 d(F8.u0 u0Var, F8.u0 u0Var2) {
        if (u0Var == null) {
            a(38);
        }
        if (u0Var2 == null) {
            a(39);
        }
        F8.u0 u0Var3 = F8.u0.INVARIANT;
        if (u0Var == u0Var3) {
            if (u0Var2 == null) {
                a(40);
            }
            return u0Var2;
        }
        if (u0Var2 == u0Var3) {
            if (u0Var == null) {
                a(41);
            }
            return u0Var;
        }
        if (u0Var == u0Var2) {
            if (u0Var2 == null) {
                a(42);
            }
            return u0Var2;
        }
        throw new java.lang.AssertionError("Variance conflict: type parameter variance '" + u0Var + "' and projection kind '" + u0Var2 + "' cannot be combined");
    }

    private static F8.n0.d e(F8.u0 u0Var, F8.u0 u0Var2) {
        F8.u0 u0Var3 = F8.u0.IN_VARIANCE;
        if (u0Var == u0Var3 && u0Var2 == F8.u0.OUT_VARIANCE) {
            return F8.n0.d.OUT_IN_IN_POSITION;
        }
        return (u0Var == F8.u0.OUT_VARIANCE && u0Var2 == u0Var3) ? F8.n0.d.IN_IN_OUT_POSITION : F8.n0.d.NO_CONFLICT;
    }

    public static F8.n0 f(F8.E e6) {
        if (e6 == null) {
            a(6);
        }
        return g(F8.f0.i(e6.W0(), e6.U0()));
    }

    public static F8.n0 g(F8.l0 l0Var) {
        if (l0Var == null) {
            a(0);
        }
        return new F8.n0(l0Var);
    }

    public static F8.n0 h(F8.l0 l0Var, F8.l0 l0Var2) {
        if (l0Var == null) {
            a(3);
        }
        if (l0Var2 == null) {
            a(4);
        }
        return g(F8.C0958t.i(l0Var, l0Var2));
    }

    private static P7.g i(P7.g gVar) {
        if (gVar == null) {
            a(33);
        }
        return !gVar.H(L7.j.a.f6355Q) ? gVar : new P7.l(gVar, new F8.n0.a());
    }

    private static F8.i0 l(F8.E e6, F8.i0 i0Var, O7.f0 f0Var, F8.i0 i0Var2) {
        if (e6 == null) {
            a(26);
        }
        if (i0Var == null) {
            a(27);
        }
        if (i0Var2 == null) {
            a(28);
        }
        if (!e6.k().H(L7.j.a.f6355Q)) {
            if (i0Var == null) {
                a(29);
            }
            return i0Var;
        }
        F8.e0 e0VarW0 = i0Var.getType().W0();
        if (!(e0VarW0 instanceof G8.j)) {
            return i0Var;
        }
        F8.i0 i0VarA = ((G8.j) e0VarW0).a();
        F8.u0 u0VarA = i0VarA.a();
        F8.n0.d dVarE = e(i0Var2.a(), u0VarA);
        F8.n0.d dVar = F8.n0.d.OUT_IN_IN_POSITION;
        if (dVarE == dVar) {
            return new F8.k0(i0VarA.getType());
        }
        return (f0Var != null && e(f0Var.s(), u0VarA) == dVar) ? new F8.k0(i0VarA.getType()) : i0Var;
    }

    private static java.lang.String o(java.lang.Object obj) {
        try {
            return obj.toString();
        } catch (java.lang.Throwable th) {
            if (P8.d.a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    private F8.i0 r(F8.i0 i0Var, int i6) {
        F8.E type = i0Var.getType();
        F8.u0 u0VarA = i0Var.a();
        if (type.W0().w() instanceof O7.f0) {
            return i0Var;
        }
        F8.M mB = F8.Q.b(type);
        F8.E eP = mB != null ? m().p(mB, F8.u0.INVARIANT) : null;
        F8.E eB = F8.m0.b(type, s(type.W0().x(), type.U0(), i6), this.f2952a.d(type.k()));
        if ((eB instanceof F8.M) && (eP instanceof F8.M)) {
            eB = F8.Q.j((F8.M) eB, (F8.M) eP);
        }
        return new F8.k0(u0VarA, eB);
    }

    private java.util.List s(java.util.List list, java.util.List list2, int i6) throws F8.n0.c {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        boolean z6 = false;
        for (int i10 = 0; i10 < list.size(); i10++) {
            O7.f0 f0Var = (O7.f0) list.get(i10);
            F8.i0 i0Var = (F8.i0) list2.get(i10);
            F8.i0 i0VarU = u(i0Var, f0Var, i6 + 1);
            int i11 = F8.n0.b.f2953a[e(f0Var.s(), i0VarU.a()).ordinal()];
            if (i11 == 1 || i11 == 2) {
                i0VarU = F8.q0.s(f0Var);
            } else if (i11 == 3) {
                F8.u0 u0VarS = f0Var.s();
                F8.u0 u0Var = F8.u0.INVARIANT;
                if (u0VarS != u0Var && !i0VarU.b()) {
                    i0VarU = new F8.k0(u0Var, i0VarU.getType());
                }
            }
            if (i0VarU != i0Var) {
                z6 = true;
            }
            arrayList.add(i0VarU);
        }
        return !z6 ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private F8.i0 u(F8.i0 i0Var, O7.f0 f0Var, int i6) throws F8.n0.c {
        if (i0Var == null) {
            a(18);
        }
        b(i6, i0Var, this.f2952a);
        if (i0Var.b()) {
            return i0Var;
        }
        F8.E type = i0Var.getType();
        if (type instanceof F8.r0) {
            F8.r0 r0Var = (F8.r0) type;
            F8.t0 t0VarO0 = r0Var.O0();
            F8.E eM = r0Var.M();
            F8.i0 i0VarU = u(new F8.k0(i0Var.a(), t0VarO0), f0Var, i6 + 1);
            return i0VarU.b() ? i0VarU : new F8.k0(i0VarU.a(), F8.s0.d(i0VarU.getType().Z0(), p(eM, i0Var.a())));
        }
        if (!F8.AbstractC0959u.a(type) && !(type.Z0() instanceof F8.L)) {
            F8.i0 i0VarE = this.f2952a.e(type);
            F8.i0 i0VarL = i0VarE != null ? l(type, i0VarE, f0Var, i0Var) : null;
            F8.u0 u0VarA = i0Var.a();
            if (i0VarL == null && F8.B.b(type) && !F8.c0.b(type)) {
                F8.AbstractC0963y abstractC0963yA = F8.B.a(type);
                int i10 = i6 + 1;
                F8.i0 i0VarU2 = u(new F8.k0(u0VarA, abstractC0963yA.e1()), f0Var, i10);
                F8.i0 i0VarU3 = u(new F8.k0(u0VarA, abstractC0963yA.f1()), f0Var, i10);
                return (i0VarU2.getType() == abstractC0963yA.e1() && i0VarU3.getType() == abstractC0963yA.f1()) ? i0Var : new F8.k0(i0VarU2.a(), F8.F.d(F8.m0.a(i0VarU2.getType()), F8.m0.a(i0VarU3.getType())));
            }
            if (!L7.g.n0(type) && !F8.G.a(type)) {
                if (i0VarL != null) {
                    F8.n0.d dVarE = e(u0VarA, i0VarL.a());
                    if (!p188s8.d.d(type)) {
                        int i11 = F8.n0.b.f2953a[dVarE.ordinal()];
                        if (i11 == 1) {
                            throw new F8.n0.c("Out-projection in in-position");
                        }
                        if (i11 == 2) {
                            return new F8.k0(F8.u0.OUT_VARIANCE, type.W0().t().I());
                        }
                    }
                    F8.InterfaceC0952m interfaceC0952mA = F8.c0.a(type);
                    if (i0VarL.b()) {
                        return i0VarL;
                    }
                    F8.E eQ = interfaceC0952mA != null ? interfaceC0952mA.Q(i0VarL.getType()) : F8.q0.q(i0VarL.getType(), type.X0());
                    if (!type.k().isEmpty()) {
                        eQ = K8.a.x(eQ, new P7.k(eQ.k(), i(this.f2952a.d(type.k()))));
                    }
                    if (dVarE == F8.n0.d.NO_CONFLICT) {
                        u0VarA = d(u0VarA, i0VarL.a());
                    }
                    return new F8.k0(u0VarA, eQ);
                }
                i0Var = r(i0Var, i6);
                if (i0Var == null) {
                    a(25);
                }
            }
        }
        return i0Var;
    }

    public F8.l0 j() {
        F8.l0 l0Var = this.f2952a;
        if (l0Var == null) {
            a(8);
        }
        return l0Var;
    }

    public boolean k() {
        return this.f2952a.f();
    }

    public F8.n0 m() {
        F8.l0 l0Var = this.f2952a;
        return ((l0Var instanceof F8.C) && l0Var.b()) ? new F8.n0(new F8.C(((F8.C) this.f2952a).j(), ((F8.C) this.f2952a).i(), false)) : this;
    }

    public F8.E n(F8.E e6, F8.u0 u0Var) {
        if (e6 == null) {
            a(9);
        }
        if (u0Var == null) {
            a(10);
        }
        if (k()) {
            if (e6 == null) {
                a(11);
            }
            return e6;
        }
        try {
            F8.E type = u(new F8.k0(u0Var, e6), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (F8.n0.c e10) {
            H8.h hVarD = H8.k.d(H8.j.f4498f0, e10.getMessage());
            if (hVarD == null) {
                a(13);
            }
            return hVarD;
        }
    }

    public F8.E p(F8.E e6, F8.u0 u0Var) {
        if (e6 == null) {
            a(14);
        }
        if (u0Var == null) {
            a(15);
        }
        F8.i0 i0VarQ = q(new F8.k0(u0Var, j().g(e6, u0Var)));
        if (i0VarQ == null) {
            return null;
        }
        return i0VarQ.getType();
    }

    public F8.i0 q(F8.i0 i0Var) {
        if (i0Var == null) {
            a(16);
        }
        F8.i0 i0VarT = t(i0Var);
        return (this.f2952a.a() || this.f2952a.b()) ? L8.b.c(i0VarT, this.f2952a.b()) : i0VarT;
    }

    public F8.i0 t(F8.i0 i0Var) {
        if (i0Var == null) {
            a(17);
        }
        if (k()) {
            return i0Var;
        }
        try {
            return u(i0Var, null, 0);
        } catch (F8.n0.c unused) {
            return null;
        }
    }
}
