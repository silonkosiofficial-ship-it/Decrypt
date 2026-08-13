package p190t;

/* JADX INFO: renamed from: t.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7155c implements D0.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p190t.f f54428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f54429b;

    /* JADX INFO: renamed from: t.c$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.List f54430D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.util.List list) {
            super(1);
            this.f54430D = list;
        }

        public final void a(D0.X.a aVar) {
            java.util.List list = this.f54430D;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                D0.X.a.h(aVar, (D0.X) list.get(i6), 0, 0, 0.0f, 4, null);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public C7155c(p190t.f fVar) {
        this.f54428a = fVar;
    }

    @Override // D0.I
    public int a(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(0)).T(i6));
            int iO = p097j7.AbstractC6879v.o(list);
            int i10 = 1;
            if (1 <= iO) {
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(i10)).T(i6));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i10 == iO) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // D0.I
    public D0.K b(D0.M m6, java.util.List list, long j6) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(((D0.G) list.get(i6)).U(j6));
        }
        java.lang.Object obj2 = null;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int iI0 = ((D0.X) obj).I0();
            int iO = p097j7.AbstractC6879v.o(arrayList);
            if (1 <= iO) {
                int i10 = 1;
                while (true) {
                    java.lang.Object obj3 = arrayList.get(i10);
                    int iI1 = ((D0.X) obj3).I0();
                    if (iI0 < iI1) {
                        obj = obj3;
                        iI0 = iI1;
                    }
                    if (i10 == iO) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            obj = null;
        }
        D0.X x6 = (D0.X) obj;
        int iI2 = x6 != null ? x6.I0() : 0;
        if (!arrayList.isEmpty()) {
            java.lang.Object obj4 = arrayList.get(0);
            int iW0 = ((D0.X) obj4).w0();
            int iO2 = p097j7.AbstractC6879v.o(arrayList);
            if (1 <= iO2) {
                int i11 = 1;
                while (true) {
                    java.lang.Object obj5 = arrayList.get(i11);
                    int iW1 = ((D0.X) obj5).w0();
                    if (iW0 < iW1) {
                        obj4 = obj5;
                        iW0 = iW1;
                    }
                    if (i11 == iO2) {
                        break;
                    }
                    i11++;
                }
            }
            obj2 = obj4;
        }
        D0.X x10 = (D0.X) obj2;
        int iW2 = x10 != null ? x10.w0() : 0;
        if (!m6.A0()) {
            if (!this.f54429b) {
            }
            return D0.L.b(m6, iI2, iW2, null, new p190t.C7155c.a(arrayList), 4, null);
        }
        this.f54429b = true;
        this.f54428a.a().setValue(Y0.t.b(Y0.u.a(iI2, iW2)));
        return D0.L.b(m6, iI2, iW2, null, new p190t.C7155c.a(arrayList), 4, null);
    }

    @Override // D0.I
    public int c(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(0)).S(i6));
            int iO = p097j7.AbstractC6879v.o(list);
            int i10 = 1;
            if (1 <= iO) {
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(i10)).S(i6));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i10 == iO) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // D0.I
    public int e(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(0)).n0(i6));
            int iO = p097j7.AbstractC6879v.o(list);
            int i10 = 1;
            if (1 <= iO) {
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(i10)).n0(i6));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i10 == iO) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // D0.I
    public int j(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(0)).t(i6));
            int iO = p097j7.AbstractC6879v.o(list);
            int i10 = 1;
            if (1 <= iO) {
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(i10)).t(i6));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i10 == iO) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
