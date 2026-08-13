package R7;

/* JADX INFO: loaded from: classes2.dex */
public class s extends R7.t {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final R7.t f9706D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final F8.n0 f9707E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private F8.n0 f9708F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.util.List f9709G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private java.util.List f9710H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private F8.e0 f9711I;

    class a implements p237x7.l {
        a() {
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean l(O7.f0 f0Var) {
            return java.lang.Boolean.valueOf(!f0Var.x0());
        }
    }

    class b implements p237x7.l {
        b() {
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public F8.M l(F8.M m6) {
            return R7.s.this.V0(m6);
        }
    }

    public s(R7.t tVar, F8.n0 n0Var) {
        this.f9706D = tVar;
        this.f9707E = n0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    private static /* synthetic */ void J0(int i6) {
        java.lang.String str = (i6 == 2 || i6 == 3 || i6 == 5 || i6 == 6 || i6 == 8 || i6 == 10 || i6 == 13 || i6 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 2 || i6 == 3 || i6 == 5 || i6 == 6 || i6 == 8 || i6 == 10 || i6 == 13 || i6 == 23) ? 3 : 2];
        if (i6 == 2) {
            objArr[0] = "typeArguments";
        } else if (i6 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i6 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i6 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i6 == 8) {
            objArr[0] = "typeArguments";
        } else if (i6 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i6 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i6 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i6) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i6 == 2 || i6 == 3 || i6 == 5 || i6 == 6 || i6 == 8 || i6 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i6 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i6 == 23) {
            objArr[2] = "substitute";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 2 && i6 != 3 && i6 != 5 && i6 != 6 && i6 != 8 && i6 != 10 && i6 != 13 && i6 != 23) {
            throw new java.lang.IllegalStateException(str2);
        }
        throw new java.lang.IllegalArgumentException(str2);
    }

    private F8.n0 T0() {
        if (this.f9708F == null) {
            if (this.f9707E.k()) {
                this.f9708F = this.f9707E;
            } else {
                java.util.List listX = this.f9706D.p().x();
                this.f9709G = new java.util.ArrayList(listX.size());
                this.f9708F = F8.AbstractC0957s.b(listX, this.f9707E.j(), this, this.f9709G);
                this.f9710H = p097j7.AbstractC6879v.e0(this.f9709G, new R7.s.a());
            }
        }
        return this.f9708F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public F8.M V0(F8.M m6) {
        return (m6 == null || this.f9707E.k()) ? m6 : (F8.M) T0().p(m6, F8.u0.INVARIANT);
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1428i
    public java.util.List A() {
        T0();
        java.util.List list = this.f9710H;
        if (list == null) {
            J0(30);
        }
        return list;
    }

    @Override // O7.C
    public boolean C() {
        return this.f9706D.C();
    }

    @Override // O7.InterfaceC1424e
    public boolean E() {
        return this.f9706D.E();
    }

    @Override // O7.InterfaceC1424e
    public p248y8.h H0() {
        p248y8.h hVarH0 = this.f9706D.H0();
        if (hVarH0 == null) {
            J0(28);
        }
        return hVarH0;
    }

    @Override // O7.InterfaceC1424e
    public boolean I() {
        return this.f9706D.I();
    }

    @Override // O7.InterfaceC1424e
    public O7.h0 I0() {
        O7.h0 h0VarI0 = this.f9706D.I0();
        if (h0VarI0 == null) {
            return null;
        }
        return h0VarI0.c(new R7.s.b());
    }

    @Override // R7.t
    public p248y8.h M(F8.l0 l0Var, G8.g gVar) {
        if (l0Var == null) {
            J0(5);
        }
        if (gVar == null) {
            J0(6);
        }
        p248y8.h hVarM = this.f9706D.M(l0Var, gVar);
        if (!this.f9707E.k()) {
            return new p248y8.m(hVarM, T0());
        }
        if (hVarM == null) {
            J0(7);
        }
        return hVarM;
    }

    @Override // O7.InterfaceC1424e
    public p248y8.h M0() {
        p248y8.h hVarQ = Q(p218v8.c.o(p178r8.f.g(this.f9706D)));
        if (hVarQ == null) {
            J0(12);
        }
        return hVarQ;
    }

    @Override // O7.C
    public boolean N0() {
        return this.f9706D.N0();
    }

    @Override // O7.InterfaceC1424e
    public java.util.Collection O() {
        java.util.Collection collectionO = this.f9706D.O();
        if (collectionO == null) {
            J0(31);
        }
        return collectionO;
    }

    @Override // O7.InterfaceC1424e
    public boolean P() {
        return this.f9706D.P();
    }

    @Override // O7.InterfaceC1424e
    public java.util.List P0() {
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (listEmptyList == null) {
            J0(17);
        }
        return listEmptyList;
    }

    @Override // R7.t
    public p248y8.h Q(G8.g gVar) {
        if (gVar == null) {
            J0(13);
        }
        p248y8.h hVarQ = this.f9706D.Q(gVar);
        if (!this.f9707E.k()) {
            return new p248y8.m(hVarQ, T0());
        }
        if (hVarQ == null) {
            J0(14);
        }
        return hVarQ;
    }

    @Override // O7.C
    public boolean R() {
        return this.f9706D.R();
    }

    @Override // O7.InterfaceC1424e
    public boolean R0() {
        return this.f9706D.R0();
    }

    @Override // O7.InterfaceC1428i
    public boolean S() {
        return this.f9706D.S();
    }

    @Override // O7.InterfaceC1424e
    public O7.X S0() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // O7.c0
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public O7.InterfaceC1424e c(F8.n0 n0Var) {
        if (n0Var == null) {
            J0(23);
        }
        return n0Var.k() ? this : new R7.s(this, F8.n0.h(n0Var.j(), T0().j()));
    }

    @Override // O7.InterfaceC1424e
    public O7.InterfaceC1423d X() {
        return this.f9706D.X();
    }

    @Override // O7.InterfaceC1424e
    public p248y8.h Y() {
        p248y8.h hVarY = this.f9706D.Y();
        if (hVarY == null) {
            J0(15);
        }
        return hVarY;
    }

    @Override // O7.InterfaceC1432m
    public O7.InterfaceC1424e a() {
        O7.InterfaceC1424e interfaceC1424eA = this.f9706D.a();
        if (interfaceC1424eA == null) {
            J0(21);
        }
        return interfaceC1424eA;
    }

    @Override // O7.InterfaceC1424e
    public O7.InterfaceC1424e a0() {
        return this.f9706D.a0();
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1433n, O7.InterfaceC1432m
    public O7.InterfaceC1432m b() {
        O7.InterfaceC1432m interfaceC1432mB = this.f9706D.b();
        if (interfaceC1432mB == null) {
            J0(22);
        }
        return interfaceC1432mB;
    }

    @Override // O7.InterfaceC1424e
    public p248y8.h f0(F8.l0 l0Var) {
        if (l0Var == null) {
            J0(10);
        }
        p248y8.h hVarM = M(l0Var, p218v8.c.o(p178r8.f.g(this)));
        if (hVarM == null) {
            J0(11);
        }
        return hVarM;
    }

    @Override // O7.I
    public p138n8.f getName() {
        p138n8.f name = this.f9706D.getName();
        if (name == null) {
            J0(20);
        }
        return name;
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1436q, O7.C
    public O7.AbstractC1439u h() {
        O7.AbstractC1439u abstractC1439uH = this.f9706D.h();
        if (abstractC1439uH == null) {
            J0(27);
        }
        return abstractC1439uH;
    }

    @Override // O7.InterfaceC1424e
    public O7.EnumC1425f j() {
        O7.EnumC1425f enumC1425fJ = this.f9706D.j();
        if (enumC1425fJ == null) {
            J0(25);
        }
        return enumC1425fJ;
    }

    @Override // P7.a
    public P7.g k() {
        P7.g gVarK = this.f9706D.k();
        if (gVarK == null) {
            J0(19);
        }
        return gVarK;
    }

    @Override // O7.InterfaceC1424e
    public boolean m() {
        return this.f9706D.m();
    }

    @Override // O7.InterfaceC1435p
    public O7.a0 o() {
        O7.a0 a0Var = O7.a0.f8143a;
        if (a0Var == null) {
            J0(29);
        }
        return a0Var;
    }

    @Override // O7.InterfaceC1427h
    public F8.e0 p() {
        F8.e0 e0VarP = this.f9706D.p();
        if (this.f9707E.k()) {
            if (e0VarP == null) {
                J0(0);
            }
            return e0VarP;
        }
        if (this.f9711I == null) {
            F8.n0 n0VarT0 = T0();
            java.util.Collection collectionU = e0VarP.u();
            java.util.ArrayList arrayList = new java.util.ArrayList(collectionU.size());
            java.util.Iterator it = collectionU.iterator();
            while (it.hasNext()) {
                arrayList.add(n0VarT0.p((F8.E) it.next(), F8.u0.INVARIANT));
            }
            this.f9711I = new F8.C0950k(this, this.f9709G, arrayList, E8.f.f2273e);
        }
        F8.e0 e0Var = this.f9711I;
        if (e0Var == null) {
            J0(1);
        }
        return e0Var;
    }

    @Override // O7.InterfaceC1424e, O7.C
    public O7.D q() {
        O7.D dQ = this.f9706D.q();
        if (dQ == null) {
            J0(26);
        }
        return dQ;
    }

    @Override // O7.InterfaceC1424e
    public java.util.Collection r() {
        java.util.Collection<O7.InterfaceC1423d> collectionR = this.f9706D.r();
        java.util.ArrayList arrayList = new java.util.ArrayList(collectionR.size());
        for (O7.InterfaceC1423d interfaceC1423d : collectionR) {
            arrayList.add(((O7.InterfaceC1423d) interfaceC1423d.z().z(interfaceC1423d.a()).x(interfaceC1423d.q()).r(interfaceC1423d.h()).l(interfaceC1423d.j()).v(false).i()).c(T0()));
        }
        return arrayList;
    }

    @Override // O7.InterfaceC1432m
    public java.lang.Object r0(O7.InterfaceC1434o interfaceC1434o, java.lang.Object obj) {
        return interfaceC1434o.l(this, obj);
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1427h
    public F8.M w() {
        F8.M m6 = F8.F.m(F8.C0953n.f2950a.a(k(), null, null), p(), F8.q0.g(p().x()), false, M0());
        if (m6 == null) {
            J0(16);
        }
        return m6;
    }
}
