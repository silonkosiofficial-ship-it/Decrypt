package R7;

/* JADX INFO: renamed from: R7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1495a extends R7.t {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p138n8.f f9578D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected final E8.i f9579E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final E8.i f9580F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final E8.i f9581G;

    /* JADX INFO: renamed from: R7.a$a, reason: collision with other inner class name */
    class C0219a implements p237x7.a {

        /* JADX INFO: renamed from: R7.a$a$a, reason: collision with other inner class name */
        class C0220a implements p237x7.l {
            C0220a() {
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public F8.M l(G8.g gVar) {
                O7.InterfaceC1427h interfaceC1427hF = gVar.f(R7.AbstractC1495a.this);
                if (interfaceC1427hF == null) {
                    return (F8.M) R7.AbstractC1495a.this.f9579E.b();
                }
                if (interfaceC1427hF instanceof O7.e0) {
                    return F8.F.b((O7.e0) interfaceC1427hF, F8.q0.g(interfaceC1427hF.p().x()));
                }
                return interfaceC1427hF instanceof R7.t ? F8.q0.u(interfaceC1427hF.p().v(gVar), ((R7.t) interfaceC1427hF).Q(gVar), this) : interfaceC1427hF.w();
            }
        }

        C0219a() {
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public F8.M b() {
            R7.AbstractC1495a abstractC1495a = R7.AbstractC1495a.this;
            return F8.q0.v(abstractC1495a, abstractC1495a.M0(), new R7.AbstractC1495a.C0219a.C0220a());
        }
    }

    /* JADX INFO: renamed from: R7.a$b */
    class b implements p237x7.a {
        b() {
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p248y8.h b() {
            return new p248y8.f(R7.AbstractC1495a.this.M0());
        }
    }

    /* JADX INFO: renamed from: R7.a$c */
    class c implements p237x7.a {
        c() {
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public O7.X b() {
            return new R7.q(R7.AbstractC1495a.this);
        }
    }

    public AbstractC1495a(E8.n nVar, p138n8.f fVar) {
        if (nVar == null) {
            J0(0);
        }
        if (fVar == null) {
            J0(1);
        }
        this.f9578D = fVar;
        this.f9579E = nVar.d(new R7.AbstractC1495a.C0219a());
        this.f9580F = nVar.d(new R7.AbstractC1495a.b());
        this.f9581G = nVar.d(new R7.AbstractC1495a.c());
    }

    private static /* synthetic */ void J0(int i6) {
        java.lang.String str = (i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5 || i6 == 6 || i6 == 9 || i6 == 12 || i6 == 14 || i6 == 16 || i6 == 17 || i6 == 19 || i6 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5 || i6 == 6 || i6 == 9 || i6 == 12 || i6 == 14 || i6 == 16 || i6 == 17 || i6 == 19 || i6 == 20) ? 2 : 3];
        switch (i6) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i6 == 2) {
            objArr[1] = "getName";
        } else if (i6 == 3) {
            objArr[1] = "getOriginal";
        } else if (i6 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i6 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i6 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i6 == 9 || i6 == 12 || i6 == 14 || i6 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i6 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i6 == 19) {
            objArr[1] = "substitute";
        } else if (i6 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i6) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 2 && i6 != 3 && i6 != 4 && i6 != 5 && i6 != 6 && i6 != 9 && i6 != 12 && i6 != 14 && i6 != 16 && i6 != 17 && i6 != 19 && i6 != 20) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // O7.InterfaceC1424e
    public p248y8.h H0() {
        p248y8.h hVar = (p248y8.h) this.f9580F.b();
        if (hVar == null) {
            J0(4);
        }
        return hVar;
    }

    @Override // R7.t
    public p248y8.h M(F8.l0 l0Var, G8.g gVar) {
        if (l0Var == null) {
            J0(10);
        }
        if (gVar == null) {
            J0(11);
        }
        if (!l0Var.f()) {
            return new p248y8.m(Q(gVar), F8.n0.g(l0Var));
        }
        p248y8.h hVarQ = Q(gVar);
        if (hVarQ == null) {
            J0(12);
        }
        return hVarQ;
    }

    @Override // O7.InterfaceC1424e
    public p248y8.h M0() {
        p248y8.h hVarQ = Q(p218v8.c.o(p178r8.f.g(this)));
        if (hVarQ == null) {
            J0(17);
        }
        return hVarQ;
    }

    @Override // O7.c0
    /* JADX INFO: renamed from: O0 */
    public O7.InterfaceC1424e c(F8.n0 n0Var) {
        if (n0Var == null) {
            J0(18);
        }
        return n0Var.k() ? this : new R7.s(this, n0Var);
    }

    @Override // O7.InterfaceC1424e
    public java.util.List P0() {
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (listEmptyList == null) {
            J0(6);
        }
        return listEmptyList;
    }

    @Override // O7.InterfaceC1424e
    public O7.X S0() {
        O7.X x6 = (O7.X) this.f9581G.b();
        if (x6 == null) {
            J0(5);
        }
        return x6;
    }

    @Override // O7.InterfaceC1432m
    public O7.InterfaceC1424e a() {
        return this;
    }

    @Override // O7.InterfaceC1424e
    public p248y8.h f0(F8.l0 l0Var) {
        if (l0Var == null) {
            J0(15);
        }
        p248y8.h hVarM = M(l0Var, p218v8.c.o(p178r8.f.g(this)));
        if (hVarM == null) {
            J0(16);
        }
        return hVarM;
    }

    @Override // O7.I
    public p138n8.f getName() {
        p138n8.f fVar = this.f9578D;
        if (fVar == null) {
            J0(2);
        }
        return fVar;
    }

    @Override // O7.InterfaceC1432m
    public java.lang.Object r0(O7.InterfaceC1434o interfaceC1434o, java.lang.Object obj) {
        return interfaceC1434o.l(this, obj);
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1427h
    public F8.M w() {
        F8.M m6 = (F8.M) this.f9579E.b();
        if (m6 == null) {
            J0(20);
        }
        return m6;
    }
}
