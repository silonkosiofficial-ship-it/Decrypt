package p058f8;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p058f8.d f45368a;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final f8.l.a f45369D = new f8.l.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(F8.t0 t0Var) {
            O7.InterfaceC1427h interfaceC1427hW = t0Var.W0().w();
            if (interfaceC1427hW == null) {
                return java.lang.Boolean.FALSE;
            }
            p138n8.f name = interfaceC1427hW.getName();
            N7.c cVar = N7.c.f7820a;
            return java.lang.Boolean.valueOf(p247y7.AbstractC7350t.b(name, cVar.h().g()) && p247y7.AbstractC7350t.b(p218v8.c.h(interfaceC1427hW), cVar.h()));
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final f8.l.b f45370D = new f8.l.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.E l(O7.InterfaceC1421b interfaceC1421b) {
            p247y7.AbstractC7350t.f(interfaceC1421b, "it");
            O7.X xV0 = interfaceC1421b.v0();
            p247y7.AbstractC7350t.c(xV0);
            F8.E type = xV0.getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            return type;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final f8.l.c f45371D = new f8.l.c();

        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.E l(O7.InterfaceC1421b interfaceC1421b) {
            p247y7.AbstractC7350t.f(interfaceC1421b, "it");
            F8.E eL = interfaceC1421b.l();
            p247y7.AbstractC7350t.c(eL);
            return eL;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ O7.j0 f45372D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(O7.j0 j0Var) {
            super(1);
            this.f45372D = j0Var;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.E l(O7.InterfaceC1421b interfaceC1421b) {
            p247y7.AbstractC7350t.f(interfaceC1421b, "it");
            F8.E type = ((O7.j0) interfaceC1421b.n().get(this.f45372D.getIndex())).getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            return type;
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final f8.l.e f45373D = new f8.l.e();

        e() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(F8.t0 t0Var) {
            p247y7.AbstractC7350t.f(t0Var, "it");
            return java.lang.Boolean.valueOf(t0Var instanceof F8.L);
        }
    }

    public l(p058f8.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "typeEnhancement");
        this.f45368a = dVar;
    }

    private final boolean a(F8.E e6) {
        return F8.q0.c(e6, f8.l.a.f45369D);
    }

    private final F8.E b(O7.InterfaceC1421b interfaceC1421b, P7.a aVar, boolean z6, p008a8.g gVar, X7.EnumC1824b enumC1824b, p058f8.q qVar, boolean z10, p237x7.l lVar) {
        p058f8.n nVar = new p058f8.n(aVar, z6, gVar, enumC1824b, false, 16, null);
        F8.E e6 = (F8.E) lVar.l(interfaceC1421b);
        java.util.Collection collectionF = interfaceC1421b.f();
        p247y7.AbstractC7350t.e(collectionF, "getOverriddenDescriptors(...)");
        java.util.Collection<O7.InterfaceC1421b> collection = collectionF;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collection, 10));
        for (O7.InterfaceC1421b interfaceC1421b2 : collection) {
            p247y7.AbstractC7350t.c(interfaceC1421b2);
            arrayList.add((F8.E) lVar.l(interfaceC1421b2));
        }
        return c(nVar, e6, arrayList, qVar, z10);
    }

    private final F8.E c(p058f8.n nVar, F8.E e6, java.util.List list, p058f8.q qVar, boolean z6) {
        return this.f45368a.a(e6, nVar.b(e6, list, qVar, z6), nVar.u());
    }

    static /* synthetic */ F8.E d(p058f8.l lVar, O7.InterfaceC1421b interfaceC1421b, P7.a aVar, boolean z6, p008a8.g gVar, X7.EnumC1824b enumC1824b, p058f8.q qVar, boolean z10, p237x7.l lVar2, int i6, java.lang.Object obj) {
        return lVar.b(interfaceC1421b, aVar, z6, gVar, enumC1824b, qVar, (i6 & 32) != 0 ? false : z10, lVar2);
    }

    static /* synthetic */ F8.E e(p058f8.l lVar, p058f8.n nVar, F8.E e6, java.util.List list, p058f8.q qVar, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            qVar = null;
        }
        p058f8.q qVar2 = qVar;
        if ((i6 & 8) != 0) {
            z6 = false;
        }
        return lVar.c(nVar, e6, list, qVar2, z6);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e4  */
    private final O7.InterfaceC1421b f(O7.InterfaceC1421b interfaceC1421b, p008a8.g gVar) {
        O7.InterfaceC1421b interfaceC1421b2;
        F8.E eJ;
        p058f8.k kVar;
        boolean z6;
        F8.E type;
        boolean z10;
        F8.E type2;
        java.util.List listA;
        Z7.f fVar;
        R7.D d6;
        if (!(interfaceC1421b instanceof Z7.a)) {
            return interfaceC1421b;
        }
        Z7.a aVar = (Z7.a) interfaceC1421b;
        boolean z11 = true;
        if (aVar.j() == O7.InterfaceC1421b.a.FAKE_OVERRIDE && aVar.a().f().size() == 1) {
            return interfaceC1421b;
        }
        p008a8.g gVarH = p008a8.a.h(gVar, k(interfaceC1421b, gVar));
        if (!(interfaceC1421b instanceof Z7.f) || (d6 = (fVar = (Z7.f) interfaceC1421b).d()) == null || d6.b0()) {
            interfaceC1421b2 = interfaceC1421b;
        } else {
            R7.D d10 = fVar.d();
            p247y7.AbstractC7350t.c(d10);
            interfaceC1421b2 = d10;
        }
        p058f8.q qVar = null;
        if (aVar.v0() != null) {
            O7.InterfaceC1443y interfaceC1443y = interfaceC1421b2 instanceof O7.InterfaceC1443y ? (O7.InterfaceC1443y) interfaceC1421b2 : null;
            eJ = j(interfaceC1421b, interfaceC1443y != null ? (O7.j0) interfaceC1443y.D(Z7.e.f16712i0) : null, gVarH, null, false, f8.l.b.f45370D);
        } else {
            eJ = null;
        }
        Z7.e eVar = interfaceC1421b instanceof Z7.e ? (Z7.e) interfaceC1421b : null;
        if (eVar != null) {
            p068g8.A a6 = p068g8.A.f45591a;
            O7.InterfaceC1432m interfaceC1432mB = eVar.b();
            p247y7.AbstractC7350t.d(interfaceC1432mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            java.lang.String strA = p068g8.x.a(a6, (O7.InterfaceC1424e) interfaceC1432mB, p068g8.y.c(eVar, false, false, 3, null));
            if (strA != null) {
                kVar = (p058f8.k) p058f8.j.d().get(strA);
            } else {
                kVar = null;
            }
        } else {
            kVar = null;
        }
        if (kVar != null) {
            kVar.a().size();
            aVar.n().size();
        }
        boolean z12 = (X7.J.c(gVar.a().i()) || gVarH.a().q().b()) && X7.J.b(interfaceC1421b);
        java.util.List listN = interfaceC1421b2.n();
        java.lang.String str = "getValueParameters(...)";
        p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
        java.util.List<O7.j0> list = listN;
        char c6 = '\n';
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        for (O7.j0 j0Var : list) {
            p058f8.q qVar2 = (kVar == null || (listA = kVar.a()) == null) ? qVar : (p058f8.q) p097j7.AbstractC6879v.l0(listA, j0Var.getIndex());
            java.util.ArrayList arrayList2 = arrayList;
            arrayList2.add(j(interfaceC1421b, j0Var, gVarH, qVar2, z12, new f8.l.d(j0Var)));
            arrayList = arrayList2;
            str = str;
            c6 = '\n';
            qVar = null;
        }
        java.util.ArrayList arrayList3 = arrayList;
        java.lang.String str2 = str;
        O7.U u6 = interfaceC1421b instanceof O7.U ? (O7.U) interfaceC1421b : null;
        F8.E eD = d(this, interfaceC1421b, interfaceC1421b2, true, gVarH, (u6 == null || !p018b8.c.a(u6)) ? X7.EnumC1824b.METHOD_RETURN_TYPE : X7.EnumC1824b.FIELD, kVar != null ? kVar.b() : null, false, f8.l.c.f45371D, 32, null);
        F8.E eL = aVar.l();
        p247y7.AbstractC7350t.c(eL);
        if (a(eL)) {
            z6 = true;
        } else {
            O7.X xV0 = aVar.v0();
            if ((xV0 == null || (type2 = xV0.getType()) == null) ? false : a(type2)) {
                z6 = true;
            } else {
                java.util.List listN2 = aVar.n();
                p247y7.AbstractC7350t.e(listN2, str2);
                java.util.List list2 = listN2;
                if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                    java.util.Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        }
                        F8.E type3 = ((O7.j0) it.next()).getType();
                        p247y7.AbstractC7350t.e(type3, "getType(...)");
                        if (a(type3)) {
                            z10 = true;
                            break;
                        }
                    }
                } else {
                    z10 = false;
                    break;
                }
                if (z10) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
        }
        p087i7.u uVarA = z6 ? p087i7.B.a(p208u8.d.a(), new X7.C1832j(interfaceC1421b)) : null;
        if (eJ == null && eD == null) {
            if (arrayList3.isEmpty()) {
                z11 = false;
                break;
            }
            java.util.Iterator it2 = arrayList3.iterator();
            do {
                if (!it2.hasNext()) {
                    z11 = false;
                    break;
                }
            } while (!(((F8.E) it2.next()) != null));
            if (!z11 && uVarA == null) {
                return interfaceC1421b;
            }
        }
        if (eJ == null) {
            O7.X xV1 = aVar.v0();
            type = xV1 != null ? xV1.getType() : null;
        } else {
            type = eJ;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList3, 10));
        int i6 = 0;
        for (java.lang.Object obj : arrayList3) {
            int i10 = i6 + 1;
            if (i6 < 0) {
                p097j7.AbstractC6879v.w();
            }
            F8.E type4 = (F8.E) obj;
            if (type4 == null) {
                type4 = ((O7.j0) aVar.n().get(i6)).getType();
                p247y7.AbstractC7350t.e(type4, "getType(...)");
            }
            arrayList4.add(type4);
            i6 = i10;
        }
        if (eD == null) {
            eD = aVar.l();
            p247y7.AbstractC7350t.c(eD);
        }
        Z7.a aVarN0 = aVar.n0(type, arrayList4, eD, uVarA);
        p247y7.AbstractC7350t.d(aVarN0, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
        return aVarN0;
    }

    private final F8.E j(O7.InterfaceC1421b interfaceC1421b, O7.j0 j0Var, p008a8.g gVar, p058f8.q qVar, boolean z6, p237x7.l lVar) {
        p008a8.g gVarH;
        return b(interfaceC1421b, j0Var, false, (j0Var == null || (gVarH = p008a8.a.h(gVar, j0Var.k())) == null) ? gVar : gVarH, X7.EnumC1824b.VALUE_PARAMETER, qVar, z6, lVar);
    }

    private final P7.g k(O7.InterfaceC1421b interfaceC1421b, p008a8.g gVar) {
        O7.InterfaceC1427h interfaceC1427hA = O7.AbstractC1437s.a(interfaceC1421b);
        if (interfaceC1427hA == null) {
            return interfaceC1421b.k();
        }
        p018b8.f fVar = interfaceC1427hA instanceof p018b8.f ? (p018b8.f) interfaceC1427hA : null;
        java.util.List listZ0 = fVar != null ? fVar.Z0() : null;
        java.util.List list = listZ0;
        if (list == null || list.isEmpty()) {
            return interfaceC1421b.k();
        }
        java.util.List list2 = listZ0;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new p018b8.e(gVar, (p048e8.InterfaceC6535a) it.next(), true));
        }
        return P7.g.f8385d.a(p097j7.AbstractC6879v.A0(interfaceC1421b.k(), arrayList));
    }

    public final java.util.Collection g(p008a8.g gVar, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(gVar, "c");
        p247y7.AbstractC7350t.f(collection, "platformSignatures");
        java.util.Collection collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collection2, 10));
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(f((O7.InterfaceC1421b) it.next(), gVar));
        }
        return arrayList;
    }

    public final F8.E h(F8.E e6, p008a8.g gVar) {
        p247y7.AbstractC7350t.f(e6, "type");
        p247y7.AbstractC7350t.f(gVar, "context");
        F8.E e10 = e(this, new p058f8.n(null, false, gVar, X7.EnumC1824b.TYPE_USE, true), e6, p097j7.AbstractC6879v.m(), null, false, 12, null);
        return e10 == null ? e6 : e10;
    }

    public final java.util.List i(O7.f0 f0Var, java.util.List list, p008a8.g gVar) {
        p247y7.AbstractC7350t.f(f0Var, "typeParameter");
        p247y7.AbstractC7350t.f(list, "bounds");
        p247y7.AbstractC7350t.f(gVar, "context");
        java.util.List<F8.E> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        for (F8.E e6 : list2) {
            if (!K8.a.b(e6, f8.l.e.f45373D)) {
                F8.E e10 = e(this, new p058f8.n(f0Var, false, gVar, X7.EnumC1824b.TYPE_PARAMETER_BOUNDS, false, 16, null), e6, p097j7.AbstractC6879v.m(), null, false, 12, null);
                if (e10 != null) {
                    e6 = e10;
                }
            }
            arrayList.add(e6);
        }
        return arrayList;
    }
}
