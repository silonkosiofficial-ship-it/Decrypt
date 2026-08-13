package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final F8.h0.a f2928f = new F8.h0.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F8.AbstractC0960v f2929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F8.g0 f2930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E8.f f2931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f2932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E8.g f2933e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0089  */
        /* JADX WARN: Code duplicated, block: B:24:0x0093  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:48:0x0120  */
        /* JADX WARN: Code duplicated, block: B:52:0x012a  */
        /* JADX WARN: Code duplicated, block: B:57:0x0140  */
        /* JADX WARN: Code duplicated, block: B:79:0x01be  */
        /* JADX WARN: Code duplicated, block: B:83:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:88:0x01de  */
        public final F8.E a(F8.E e6, F8.n0 n0Var, java.util.Set set, boolean z6) {
            F8.t0 t0VarF;
            boolean z10;
            F8.E type;
            boolean z11;
            F8.E type2;
            boolean z12;
            F8.E type3;
            p247y7.AbstractC7350t.f(e6, "<this>");
            p247y7.AbstractC7350t.f(n0Var, "substitutor");
            F8.t0 t0VarZ0 = e6.Z0();
            if (t0VarZ0 instanceof F8.AbstractC0963y) {
                F8.AbstractC0963y abstractC0963y = (F8.AbstractC0963y) t0VarZ0;
                F8.M mE1 = abstractC0963y.e1();
                if (!mE1.W0().x().isEmpty() && mE1.W0().w() != null) {
                    java.util.List listX = mE1.W0().x();
                    p247y7.AbstractC7350t.e(listX, "getParameters(...)");
                    java.util.List<O7.f0> list = listX;
                    java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
                    for (O7.f0 f0Var : list) {
                        F8.i0 t6 = (F8.i0) p097j7.AbstractC6879v.l0(e6.U0(), f0Var.getIndex());
                        if (!z6 || t6 == null || (type3 = t6.getType()) == null) {
                            if (set == null && set.contains(f0Var)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (t6 != null || z12) {
                                t6 = new F8.T(f0Var);
                            } else {
                                F8.l0 l0VarJ = n0Var.j();
                                F8.E type4 = t6.getType();
                                p247y7.AbstractC7350t.e(type4, "getType(...)");
                                if (l0VarJ.e(type4) == null) {
                                    t6 = new F8.T(f0Var);
                                }
                            }
                        } else {
                            p247y7.AbstractC7350t.c(type3);
                            if (K8.a.e(type3)) {
                                if (set == null) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (t6 != null) {
                                    t6 = new F8.T(f0Var);
                                } else {
                                    t6 = new F8.T(f0Var);
                                }
                            }
                        }
                        arrayList.add(t6);
                    }
                    mE1 = F8.m0.f(mE1, arrayList, null, 2, null);
                }
                F8.M mF1 = abstractC0963y.f1();
                if (!mF1.W0().x().isEmpty() && mF1.W0().w() != null) {
                    java.util.List listX2 = mF1.W0().x();
                    p247y7.AbstractC7350t.e(listX2, "getParameters(...)");
                    java.util.List<O7.f0> list2 = listX2;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
                    for (O7.f0 f0Var2 : list2) {
                        F8.i0 t10 = (F8.i0) p097j7.AbstractC6879v.l0(e6.U0(), f0Var2.getIndex());
                        if (!z6 || t10 == null || (type2 = t10.getType()) == null) {
                            if (set == null && set.contains(f0Var2)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (t10 != null || z11) {
                                t10 = new F8.T(f0Var2);
                            } else {
                                F8.l0 l0VarJ2 = n0Var.j();
                                F8.E type5 = t10.getType();
                                p247y7.AbstractC7350t.e(type5, "getType(...)");
                                if (l0VarJ2.e(type5) == null) {
                                    t10 = new F8.T(f0Var2);
                                }
                            }
                        } else {
                            p247y7.AbstractC7350t.c(type2);
                            if (K8.a.e(type2)) {
                                if (set == null) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (t10 != null) {
                                    t10 = new F8.T(f0Var2);
                                } else {
                                    t10 = new F8.T(f0Var2);
                                }
                            }
                        }
                        arrayList2.add(t10);
                    }
                    mF1 = F8.m0.f(mF1, arrayList2, null, 2, null);
                }
                t0VarF = F8.F.d(mE1, mF1);
            } else {
                if (!(t0VarZ0 instanceof F8.M)) {
                    throw new p087i7.s();
                }
                F8.M m6 = (F8.M) t0VarZ0;
                if (m6.W0().x().isEmpty() || m6.W0().w() == null) {
                    t0VarF = m6;
                } else {
                    java.util.List listX3 = m6.W0().x();
                    p247y7.AbstractC7350t.e(listX3, "getParameters(...)");
                    java.util.List<O7.f0> list3 = listX3;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list3, 10));
                    for (O7.f0 f0Var3 : list3) {
                        F8.i0 t11 = (F8.i0) p097j7.AbstractC6879v.l0(e6.U0(), f0Var3.getIndex());
                        if (!z6 || t11 == null || (type = t11.getType()) == null) {
                            if (set == null && set.contains(f0Var3)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (t11 != null || z10) {
                                t11 = new F8.T(f0Var3);
                            } else {
                                F8.l0 l0VarJ3 = n0Var.j();
                                F8.E type6 = t11.getType();
                                p247y7.AbstractC7350t.e(type6, "getType(...)");
                                if (l0VarJ3.e(type6) == null) {
                                    t11 = new F8.T(f0Var3);
                                }
                            }
                        } else {
                            p247y7.AbstractC7350t.c(type);
                            if (K8.a.e(type)) {
                                if (set == null) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (t11 != null) {
                                    t11 = new F8.T(f0Var3);
                                } else {
                                    t11 = new F8.T(f0Var3);
                                }
                            }
                        }
                        arrayList3.add(t11);
                    }
                    t0VarF = F8.m0.f(m6, arrayList3, null, 2, null);
                }
            }
            F8.E eN = n0Var.n(F8.s0.b(t0VarF, t0VarZ0), F8.u0.OUT_VARIANCE);
            p247y7.AbstractC7350t.e(eN, "safeSubstitute(...)");
            return eN;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final O7.f0 f2934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final F8.AbstractC0961w f2935b;

        public b(O7.f0 f0Var, F8.AbstractC0961w abstractC0961w) {
            p247y7.AbstractC7350t.f(f0Var, "typeParameter");
            p247y7.AbstractC7350t.f(abstractC0961w, "typeAttr");
            this.f2934a = f0Var;
            this.f2935b = abstractC0961w;
        }

        public final F8.AbstractC0961w a() {
            return this.f2935b;
        }

        public final O7.f0 b() {
            return this.f2934a;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof F8.h0.b)) {
                return false;
            }
            F8.h0.b bVar = (F8.h0.b) obj;
            return p247y7.AbstractC7350t.b(bVar.f2934a, this.f2934a) && p247y7.AbstractC7350t.b(bVar.f2935b, this.f2935b);
        }

        public int hashCode() {
            int iHashCode = this.f2934a.hashCode();
            return iHashCode + (iHashCode * 31) + this.f2935b.hashCode();
        }

        public java.lang.String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f2934a + ", typeAttr=" + this.f2935b + ')';
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H8.h b() {
            return H8.k.d(H8.j.f4485Y0, F8.h0.this.toString());
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {
        d() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.E l(F8.h0.b bVar) {
            return F8.h0.this.d(bVar.b(), bVar.a());
        }
    }

    public h0(F8.AbstractC0960v abstractC0960v, F8.g0 g0Var) {
        p247y7.AbstractC7350t.f(abstractC0960v, "projectionComputer");
        p247y7.AbstractC7350t.f(g0Var, "options");
        this.f2929a = abstractC0960v;
        this.f2930b = g0Var;
        E8.f fVar = new E8.f("Type parameter upper bound erasure results");
        this.f2931c = fVar;
        this.f2932d = p087i7.AbstractC6669o.b(new F8.h0.c());
        E8.g gVarB = fVar.b(new F8.h0.d());
        p247y7.AbstractC7350t.e(gVarB, "createMemoizedFunction(...)");
        this.f2933e = gVarB;
    }

    public /* synthetic */ h0(F8.AbstractC0960v abstractC0960v, F8.g0 g0Var, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(abstractC0960v, (i6 & 2) != 0 ? new F8.g0(false, false) : g0Var);
    }

    private final F8.E b(F8.AbstractC0961w abstractC0961w) {
        F8.E eY;
        F8.M mA = abstractC0961w.a();
        return (mA == null || (eY = K8.a.y(mA)) == null) ? e() : eY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F8.E d(O7.f0 f0Var, F8.AbstractC0961w abstractC0961w) {
        F8.i0 i0VarA;
        java.util.Set setC = abstractC0961w.c();
        if (setC != null && setC.contains(f0Var.a())) {
            return b(abstractC0961w);
        }
        F8.M mW = f0Var.w();
        p247y7.AbstractC7350t.e(mW, "getDefaultType(...)");
        java.util.Set<O7.f0> setG = K8.a.g(mW, setC);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(setG, 10)), 16));
        for (O7.f0 f0Var2 : setG) {
            if (setC == null || !setC.contains(f0Var2)) {
                i0VarA = this.f2929a.a(f0Var2, abstractC0961w, this, c(f0Var2, abstractC0961w.d(f0Var)));
            } else {
                i0VarA = F8.q0.t(f0Var2, abstractC0961w);
                p247y7.AbstractC7350t.e(i0VarA, "makeStarProjection(...)");
            }
            p087i7.u uVarA = p087i7.B.a(f0Var2.p(), i0VarA);
            linkedHashMap.put(uVarA.c(), uVarA.d());
        }
        F8.n0 n0VarG = F8.n0.g(F8.f0.a.e(F8.f0.f2923c, linkedHashMap, false, 2, null));
        p247y7.AbstractC7350t.e(n0VarG, "create(...)");
        java.util.List upperBounds = f0Var.getUpperBounds();
        p247y7.AbstractC7350t.e(upperBounds, "getUpperBounds(...)");
        java.util.Set setF = f(n0VarG, upperBounds, abstractC0961w);
        if (!(!setF.isEmpty())) {
            return b(abstractC0961w);
        }
        if (!this.f2930b.a()) {
            if (setF.size() == 1) {
                return (F8.E) p097j7.AbstractC6879v.F0(setF);
            }
            throw new java.lang.IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds".toString());
        }
        java.util.List listT0 = p097j7.AbstractC6879v.T0(setF);
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listT0, 10));
        java.util.Iterator it = listT0.iterator();
        while (it.hasNext()) {
            arrayList.add(((F8.E) it.next()).Z0());
        }
        return G8.d.a(arrayList);
    }

    private final H8.h e() {
        return (H8.h) this.f2932d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066 A[EDGE_INSN: B:22:0x0066->B:19:0x0066 BREAK  A[LOOP:0: B:3:0x0008->B:23:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:? A[LOOP:0: B:3:0x0008->B:23:?, LOOP_END, SYNTHETIC] */
    private final java.util.Set f(F8.n0 n0Var, java.util.List list, F8.AbstractC0961w abstractC0961w) {
        F8.E eB;
        java.util.Set setB = p097j7.Z.b();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            F8.E e6 = (F8.E) it.next();
            O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
            if (interfaceC1427hW instanceof O7.InterfaceC1424e) {
                eB = f2928f.a(e6, n0Var, abstractC0961w.c(), this.f2930b.b());
            } else {
                if (interfaceC1427hW instanceof O7.f0) {
                    java.util.Set setC = abstractC0961w.c();
                    if (setC == null || !setC.contains(interfaceC1427hW)) {
                        java.util.List upperBounds = ((O7.f0) interfaceC1427hW).getUpperBounds();
                        p247y7.AbstractC7350t.e(upperBounds, "getUpperBounds(...)");
                        setB.addAll(f(n0Var, upperBounds, abstractC0961w));
                    } else {
                        eB = b(abstractC0961w);
                    }
                }
                if (!this.f2930b.a()) {
                    break;
                }
            }
            setB.add(eB);
            if (!this.f2930b.a()) {
                break;
                break;
            }
        }
        return p097j7.Z.a(setB);
    }

    public final F8.E c(O7.f0 f0Var, F8.AbstractC0961w abstractC0961w) {
        p247y7.AbstractC7350t.f(f0Var, "typeParameter");
        p247y7.AbstractC7350t.f(abstractC0961w, "typeAttr");
        java.lang.Object objL = this.f2933e.l(new F8.h0.b(f0Var, abstractC0961w));
        p247y7.AbstractC7350t.e(objL, "invoke(...)");
        return (F8.E) objL;
    }
}
