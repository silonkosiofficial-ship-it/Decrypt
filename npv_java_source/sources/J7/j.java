package J7;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements J7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f5802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J7.e f5803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.reflect.Member f5804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final J7.j.a f5805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E7.i[] f5806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f5807f;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final E7.i f5808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.List[] f5809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.lang.reflect.Method f5810c;

        public a(E7.i iVar, java.util.List[] listArr, java.lang.reflect.Method method) {
            p247y7.AbstractC7350t.f(iVar, "argumentRange");
            p247y7.AbstractC7350t.f(listArr, "unboxParameters");
            this.f5808a = iVar;
            this.f5809b = listArr;
            this.f5810c = method;
        }

        public final E7.i a() {
            return this.f5808a;
        }

        public final java.lang.reflect.Method b() {
            return this.f5810c;
        }

        public final java.util.List[] c() {
            return this.f5809b;
        }
    }

    public static final class b implements J7.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Method f5811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.reflect.Method f5812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.util.List f5813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.util.List f5814d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final java.util.List f5815e;

        public b(O7.InterfaceC1443y interfaceC1443y, I7.AbstractC1278n abstractC1278n, java.lang.String str, java.util.List list) {
            java.util.Collection collectionE;
            p247y7.AbstractC7350t.f(interfaceC1443y, "descriptor");
            p247y7.AbstractC7350t.f(abstractC1278n, "container");
            p247y7.AbstractC7350t.f(str, "constructorDesc");
            p247y7.AbstractC7350t.f(list, "originalParameters");
            java.lang.reflect.Method methodN = abstractC1278n.n("constructor-impl", str);
            p247y7.AbstractC7350t.c(methodN);
            this.f5811a = methodN;
            java.lang.reflect.Method methodN2 = abstractC1278n.n("box-impl", S8.r.K0(str, "V") + U7.d.b(abstractC1278n.e()));
            p247y7.AbstractC7350t.c(methodN2);
            this.f5812b = methodN2;
            java.util.List list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                F8.E type = ((O7.Q) it.next()).getType();
                p247y7.AbstractC7350t.e(type, "getType(...)");
                arrayList.add(J7.k.o(F8.m0.a(type), interfaceC1443y));
            }
            this.f5813c = arrayList;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
            int i6 = 0;
            for (java.lang.Object obj : list2) {
                int i10 = i6 + 1;
                if (i6 < 0) {
                    p097j7.AbstractC6879v.w();
                }
                O7.InterfaceC1427h interfaceC1427hW = ((O7.Q) obj).getType().W0().w();
                p247y7.AbstractC7350t.d(interfaceC1427hW, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                O7.InterfaceC1424e interfaceC1424e = (O7.InterfaceC1424e) interfaceC1427hW;
                java.util.List list3 = (java.util.List) this.f5813c.get(i6);
                if (list3 != null) {
                    java.util.List list4 = list3;
                    collectionE = new java.util.ArrayList(p097j7.AbstractC6879v.x(list4, 10));
                    java.util.Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        collectionE.add(((java.lang.reflect.Method) it2.next()).getReturnType());
                    }
                } else {
                    java.lang.Class clsQ = I7.M.q(interfaceC1424e);
                    p247y7.AbstractC7350t.c(clsQ);
                    collectionE = p097j7.AbstractC6879v.e(clsQ);
                }
                arrayList2.add(collectionE);
                i6 = i10;
            }
            this.f5814d = arrayList2;
            this.f5815e = p097j7.AbstractC6879v.z(arrayList2);
        }

        public java.lang.Void a() {
            return null;
        }

        public final java.util.List b() {
            return this.f5814d;
        }

        @Override // J7.e
        public java.lang.reflect.Type l() {
            java.lang.Class<?> returnType = this.f5812b.getReturnType();
            p247y7.AbstractC7350t.e(returnType, "getReturnType(...)");
            return returnType;
        }

        @Override // J7.e
        public java.util.List m() {
            return this.f5815e;
        }

        @Override // J7.e
        public /* bridge */ /* synthetic */ java.lang.reflect.Member n() {
            return (java.lang.reflect.Member) a();
        }

        @Override // J7.e
        public java.lang.Object z(java.lang.Object[] objArr) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.util.Collection collectionE;
            p247y7.AbstractC7350t.f(objArr, "args");
            java.util.List<p087i7.u> listG1 = p097j7.AbstractC6872n.g1(objArr, this.f5813c);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (p087i7.u uVar : listG1) {
                java.lang.Object objA = uVar.a();
                java.util.List list = (java.util.List) uVar.b();
                if (list != null) {
                    java.util.List list2 = list;
                    collectionE = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        collectionE.add(((java.lang.reflect.Method) it.next()).invoke(objA, null));
                    }
                } else {
                    collectionE = p097j7.AbstractC6879v.e(objA);
                }
                p097j7.AbstractC6879v.C(arrayList, collectionE);
            }
            java.lang.Object[] array = arrayList.toArray(new java.lang.Object[0]);
            this.f5811a.invoke(null, java.util.Arrays.copyOf(array, array.length));
            return this.f5812b.invoke(null, java.util.Arrays.copyOf(array, array.length));
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final J7.j.c f5816D = new J7.j.c();

        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(O7.InterfaceC1424e interfaceC1424e) {
            p247y7.AbstractC7350t.f(interfaceC1424e, "$this$makeKotlinParameterTypes");
            return java.lang.Boolean.valueOf(p178r8.h.g(interfaceC1424e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    public j(O7.InterfaceC1421b interfaceC1421b, J7.e eVar, boolean z6) {
        java.lang.Class clsR;
        int i6;
        J7.j.a aVar;
        F8.E eJ;
        p247y7.AbstractC7350t.f(interfaceC1421b, "descriptor");
        p247y7.AbstractC7350t.f(eVar, "oldCaller");
        this.f5802a = z6;
        boolean z10 = false;
        if (eVar instanceof J7.f.h.c) {
            O7.X xV0 = interfaceC1421b.v0();
            xV0 = xV0 == null ? interfaceC1421b.m0() : xV0;
            F8.E type = xV0 != null ? xV0.getType() : null;
            if (type != null && p178r8.h.i(type)) {
                java.util.List listM = J7.k.m(F8.m0.a(type));
                p247y7.AbstractC7350t.c(listM);
                java.util.List list = listM;
                java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((java.lang.reflect.Method) it.next()).invoke(((J7.f.h.c) eVar).e(), null));
                }
                eVar = new J7.f.h.d((java.lang.reflect.Method) ((J7.f.h.c) eVar).n(), arrayList.toArray(new java.lang.Object[0]));
            }
        }
        this.f5803b = eVar;
        this.f5804c = eVar.n();
        F8.E eL = interfaceC1421b.l();
        p247y7.AbstractC7350t.c(eL);
        boolean z11 = interfaceC1421b instanceof O7.InterfaceC1443y;
        java.lang.reflect.Method methodJ = ((z11 && ((O7.InterfaceC1443y) interfaceC1421b).y() && (eJ = p178r8.h.j(eL)) != null && L7.g.s0(eJ)) || (clsR = J7.k.r(eL)) == null) ? null : J7.k.j(clsR, interfaceC1421b);
        if (p178r8.h.a(interfaceC1421b)) {
            aVar = new J7.j.a(E7.i.f2266G.a(), new java.util.List[0], methodJ);
        } else {
            int i10 = -1;
            if (!(eVar instanceof J7.f.h.c) && !(eVar instanceof J7.f.h.d)) {
                if (interfaceC1421b instanceof O7.InterfaceC1431l) {
                    if (!(eVar instanceof J7.d)) {
                        i10 = 0;
                    }
                } else if (interfaceC1421b.m0() == null || (eVar instanceof J7.d)) {
                    i10 = 0;
                } else {
                    O7.InterfaceC1432m interfaceC1432mB = interfaceC1421b.b();
                    p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
                    if (p178r8.h.g(interfaceC1432mB)) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                }
            }
            int i11 = eVar instanceof J7.f.h.d ? -((J7.f.h.d) eVar).f() : i10;
            java.util.List listQ = J7.k.q(interfaceC1421b, J7.j.c.f5816D);
            if (this.f5802a) {
                java.util.Iterator it2 = listQ.iterator();
                int iA = 0;
                while (it2.hasNext()) {
                    iA += a((F8.E) it2.next());
                }
                i6 = ((iA + 31) / 32) + 1;
            } else {
                i6 = 0;
            }
            int i12 = i6 + ((z11 && ((O7.InterfaceC1443y) interfaceC1421b).y()) ? 1 : 0);
            java.util.Iterator it3 = listQ.iterator();
            int iA2 = 0;
            while (it3.hasNext()) {
                iA2 += a((F8.E) it3.next());
            }
            int i13 = iA2 + i11 + i12;
            J7.k.f(this, i13, interfaceC1421b, this.f5802a);
            E7.i iVarQ = E7.j.q(java.lang.Math.max(i10, 0), listQ.size() + i10);
            java.util.List[] listArr = new java.util.List[i13];
            int i14 = 0;
            while (i14 < i13) {
                listArr[i14] = (i14 > iVarQ.g() || iVarQ.f() > i14) ? null : J7.k.o(F8.m0.a((F8.E) listQ.get(i14 - i10)), interfaceC1421b);
                i14++;
            }
            aVar = new J7.j.a(iVarQ, listArr, methodJ);
        }
        this.f5805d = aVar;
        java.util.List listC = p097j7.AbstractC6879v.c();
        J7.e eVar2 = this.f5803b;
        int length = eVar2 instanceof J7.f.h.d ? ((J7.f.h.d) eVar2).e().length : eVar2 instanceof J7.f.h.c ? 1 : 0;
        if (length > 0) {
            listC.add(E7.j.q(0, length));
        }
        java.util.List[] listArrC = aVar.c();
        int length2 = listArrC.length;
        int i15 = 0;
        while (i15 < length2) {
            java.util.List list2 = listArrC[i15];
            int size = (list2 != null ? list2.size() : 1) + length;
            listC.add(E7.j.q(length, size));
            i15++;
            length = size;
        }
        this.f5806e = (E7.i[]) p097j7.AbstractC6879v.a(listC).toArray(new E7.i[0]);
        java.lang.Iterable iterableA = this.f5805d.a();
        if (!(iterableA instanceof java.util.Collection) || !((java.util.Collection) iterableA).isEmpty()) {
            java.util.Iterator it4 = iterableA.iterator();
            while (it4.hasNext()) {
                java.util.List list3 = this.f5805d.c()[((p097j7.O) it4).b()];
                if (list3 != null && list3.size() > 1) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f5807f = z10;
    }

    private static final int a(F8.E e6) {
        java.util.List listM = J7.k.m(F8.m0.a(e6));
        if (listM != null) {
            return listM.size();
        }
        return 1;
    }

    public final E7.i b(int i6) {
        E7.i iVar;
        if (i6 >= 0) {
            E7.i[] iVarArr = this.f5806e;
            if (i6 < iVarArr.length) {
                return iVarArr[i6];
            }
        }
        E7.i[] iVarArr2 = this.f5806e;
        if (iVarArr2.length == 0) {
            iVar = new E7.i(i6, i6);
        } else {
            int length = (i6 - iVarArr2.length) + ((E7.i) p097j7.AbstractC6872n.x0(iVarArr2)).g() + 1;
            iVar = new E7.i(length, length);
        }
        return iVar;
    }

    @Override // J7.e
    public java.lang.reflect.Type l() {
        return this.f5803b.l();
    }

    @Override // J7.e
    public java.util.List m() {
        return this.f5803b.m();
    }

    @Override // J7.e
    public java.lang.reflect.Member n() {
        return this.f5804c;
    }

    @Override // J7.e
    public java.lang.Object z(java.lang.Object[] objArr) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Object objInvoke;
        java.lang.Object objG;
        java.lang.Object objG2;
        p247y7.AbstractC7350t.f(objArr, "args");
        E7.i iVarA = this.f5805d.a();
        java.util.List[] listArrC = this.f5805d.c();
        java.lang.reflect.Method methodB = this.f5805d.b();
        if (!iVarA.isEmpty()) {
            if (this.f5807f) {
                java.util.List listD = p097j7.AbstractC6879v.d(objArr.length);
                int iF = iVarA.f();
                for (int i6 = 0; i6 < iF; i6++) {
                    listD.add(objArr[i6]);
                }
                int iF2 = iVarA.f();
                int iG = iVarA.g();
                if (iF2 <= iG) {
                    while (true) {
                        java.util.List<java.lang.reflect.Method> list = listArrC[iF2];
                        java.lang.Object obj = objArr[iF2];
                        if (list != null) {
                            for (java.lang.reflect.Method method : list) {
                                java.util.List list2 = listD;
                                if (obj != null) {
                                    objG2 = method.invoke(obj, null);
                                } else {
                                    java.lang.Class<?> returnType = method.getReturnType();
                                    p247y7.AbstractC7350t.e(returnType, "getReturnType(...)");
                                    objG2 = I7.M.g(returnType);
                                }
                                list2.add(objG2);
                            }
                        } else {
                            listD.add(obj);
                        }
                        if (iF2 == iG) {
                            break;
                        }
                        iF2++;
                    }
                }
                int iG2 = iVarA.g() + 1;
                int iE0 = p097j7.AbstractC6872n.e0(objArr);
                if (iG2 <= iE0) {
                    while (true) {
                        listD.add(objArr[iG2]);
                        if (iG2 == iE0) {
                            break;
                        }
                        iG2++;
                    }
                }
                objArr = p097j7.AbstractC6879v.a(listD).toArray(new java.lang.Object[0]);
            } else {
                int length = objArr.length;
                java.lang.Object[] objArr2 = new java.lang.Object[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int iF3 = iVarA.f();
                    if (i10 > iVarA.g() || iF3 > i10) {
                        objG = objArr[i10];
                    } else {
                        java.util.List list3 = listArrC[i10];
                        java.lang.reflect.Method method2 = list3 != null ? (java.lang.reflect.Method) p097j7.AbstractC6879v.G0(list3) : null;
                        objG = objArr[i10];
                        if (method2 != null) {
                            if (objG != null) {
                                objG = method2.invoke(objG, null);
                            } else {
                                java.lang.Class<?> returnType2 = method2.getReturnType();
                                p247y7.AbstractC7350t.e(returnType2, "getReturnType(...)");
                                objG = I7.M.g(returnType2);
                            }
                        }
                    }
                    objArr2[i10] = objG;
                }
                objArr = objArr2;
            }
        }
        java.lang.Object objZ = this.f5803b.z(objArr);
        return (objZ == p137n7.b.g() || methodB == null || (objInvoke = methodB.invoke(null, objZ)) == null) ? objZ : objInvoke;
    }
}
