package C;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final C.t.a f1150D = new C.t.a();

        a() {
            super(1);
        }

        public final void a(D0.X.a aVar) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.List f1151D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f1152E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.util.List list, V.InterfaceC1753w0 interfaceC1753w0) {
            super(1);
            this.f1151D = list;
            this.f1152E = interfaceC1753w0;
        }

        public final void a(D0.X.a aVar) {
            java.util.List list = this.f1151D;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((C.v) list.get(i6)).t(aVar);
            }
            D.L.a(this.f1152E);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    private static final void a(java.util.List list, java.lang.Object[] objArr) {
        for (java.lang.Object obj : objArr) {
            list.add(obj);
        }
    }

    private static final java.util.List b(java.util.List list, java.util.List list2, java.util.List list3, int i6, int i10, int i11, int i12, int i13, boolean z6, A.C0768b.m mVar, A.C0768b.e eVar, boolean z10, Y0.e eVar2) {
        int i14 = z6 ? i10 : i6;
        boolean z11 = i11 < java.lang.Math.min(i14, i12);
        if (z11 && i13 != 0) {
            throw new java.lang.IllegalStateException("non-zero firstLineScrollOffset".toString());
        }
        int size = list.size();
        int length = 0;
        for (int i15 = 0; i15 < size; i15++) {
            length += ((C.x) list.get(i15)).b().length;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        if (!z11) {
            int size2 = list2.size() - 1;
            if (size2 >= 0) {
                int iE = i13;
                while (true) {
                    int i16 = size2 - 1;
                    C.v vVar = (C.v) list2.get(size2);
                    iE -= vVar.e();
                    vVar.n(iE, 0, i6, i10);
                    arrayList.add(vVar);
                    if (i16 < 0) {
                        break;
                    }
                    size2 = i16;
                }
            }
            int size3 = list.size();
            int iE2 = i13;
            for (int i17 = 0; i17 < size3; i17++) {
                C.x xVar = (C.x) list.get(i17);
                a(arrayList, xVar.f(iE2, i6, i10));
                iE2 += xVar.d();
            }
            int size4 = list3.size();
            for (int i18 = 0; i18 < size4; i18++) {
                C.v vVar2 = (C.v) list3.get(i18);
                vVar2.n(iE2, 0, i6, i10);
                arrayList.add(vVar2);
                iE2 += vVar2.e();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new java.lang.IllegalArgumentException("no items".toString());
            }
            int size5 = list.size();
            int[] iArr = new int[size5];
            for (int i19 = 0; i19 < size5; i19++) {
                iArr[i19] = ((C.x) list.get(c(i19, z10, size5))).c();
            }
            int[] iArr2 = new int[size5];
            for (int i20 = 0; i20 < size5; i20++) {
                iArr2[i20] = 0;
            }
            if (z6) {
                if (mVar == null) {
                    throw new java.lang.IllegalArgumentException("null verticalArrangement".toString());
                }
                mVar.b(eVar2, i14, iArr, iArr2);
            } else {
                if (eVar == null) {
                    throw new java.lang.IllegalArgumentException("null horizontalArrangement".toString());
                }
                eVar.c(eVar2, i14, iArr, Y0.v.Ltr, iArr2);
            }
            E7.g gVarA0 = p097j7.AbstractC6872n.a0(iArr2);
            if (z10) {
                gVarA0 = E7.j.o(gVarA0);
            }
            int iF = gVarA0.f();
            int iG = gVarA0.g();
            int iO = gVarA0.o();
            if ((iO > 0 && iF <= iG) || (iO < 0 && iG <= iF)) {
                while (true) {
                    int iC = iArr2[iF];
                    C.x xVar2 = (C.x) list.get(c(iF, z10, size5));
                    if (z10) {
                        iC = (i14 - iC) - xVar2.c();
                    }
                    a(arrayList, xVar2.f(iC, i6, i10));
                    if (iF == iG) {
                        break;
                    }
                    iF += iO;
                }
            }
        }
        return arrayList;
    }

    private static final int c(int i6, boolean z6, int i10) {
        return !z6 ? i6 : (i10 - i6) - 1;
    }

    public static final C.u d(int i6, C.y yVar, C.w wVar, int i10, int i11, int i12, int i13, int i14, int i15, float f6, long j6, boolean z6, A.C0768b.m mVar, A.C0768b.e eVar, boolean z10, Y0.e eVar2, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator, int i16, java.util.List list, W8.N n6, V.InterfaceC1753w0 interfaceC1753w0, p141o0.C1 c6, p237x7.l lVar, p237x7.q qVar) {
        boolean z11;
        int i17;
        int iD;
        C.x xVar;
        int i18;
        int i19;
        int iH;
        java.util.List list2;
        C.v[] vVarArrB;
        C.v vVar;
        int i20;
        if (i11 < 0) {
            throw new java.lang.IllegalArgumentException("negative beforeContentPadding".toString());
        }
        if (i12 < 0) {
            throw new java.lang.IllegalArgumentException("negative afterContentPadding".toString());
        }
        if (i6 <= 0) {
            int iN = Y0.C1859b.n(j6);
            int iM = Y0.C1859b.m(j6);
            lazyLayoutItemAnimator.l(0, iN, iM, new java.util.ArrayList(), wVar.e(), wVar, z6, false, i16, false, 0, 0, n6, c6);
            long jH = lazyLayoutItemAnimator.h();
            if (!Y0.t.e(jH, Y0.t.f16230b.a())) {
                iN = Y0.c.i(j6, Y0.t.g(jH));
                iM = Y0.c.h(j6, Y0.t.f(jH));
            }
            return new C.u(null, 0, false, 0.0f, (D0.K) qVar.j(java.lang.Integer.valueOf(iN), java.lang.Integer.valueOf(iM), C.t.a.f1150D), false, n6, eVar2, i16, lVar, p097j7.AbstractC6879v.m(), -i11, i10 + i12, 0, z10, z6 ? p230x.s.Vertical : p230x.s.Horizontal, i12, i13);
        }
        int iRound = java.lang.Math.round(f6);
        int i21 = i15 - iRound;
        if (i14 == 0 && i21 < 0) {
            iRound += i21;
            i21 = 0;
        }
        p097j7.C6871m c6871m = new p097j7.C6871m();
        int i22 = -i11;
        int i23 = (i13 < 0 ? i13 : 0) + i22;
        int iD2 = i21 + i23;
        int i24 = i14;
        while (iD2 < 0 && i24 > 0) {
            i24--;
            C.x xVarC = yVar.c(i24);
            c6871m.add(0, xVarC);
            iD2 += xVarC.d();
        }
        if (iD2 < i23) {
            iRound += iD2;
            iD2 = i23;
        }
        int i25 = iD2 - i23;
        int i26 = i10 + i12;
        int i27 = i24;
        int iD3 = E7.j.d(i26, 0);
        int i28 = i27;
        int iD4 = i25;
        int iD5 = -i25;
        int i29 = 0;
        boolean z12 = false;
        while (true) {
            z11 = true;
            if (i29 >= c6871m.size()) {
                break;
            }
            if (iD5 >= iD3) {
                c6871m.remove(i29);
                z12 = true;
            } else {
                i28++;
                iD5 += ((C.x) c6871m.get(i29)).d();
                i29++;
            }
        }
        int iD6 = iD5;
        boolean z13 = z12;
        int i30 = i28;
        int i31 = i27;
        while (i30 < i6 && (iD6 < iD3 || iD6 <= 0 || c6871m.isEmpty())) {
            int i32 = iD3;
            C.x xVarC2 = yVar.c(i30);
            if (xVarC2.e()) {
                break;
            }
            iD6 += xVarC2.d();
            if (iD6 <= i23) {
                i20 = i23;
                if (((C.v) p097j7.AbstractC6872n.x0(xVarC2.b())).getIndex() != i6 - 1) {
                    iD4 -= xVarC2.d();
                    i31 = i30 + 1;
                    z13 = true;
                }
                i30++;
                iD3 = i32;
                i23 = i20;
            } else {
                i20 = i23;
            }
            c6871m.add(xVarC2);
            i31 = i31;
            i30++;
            iD3 = i32;
            i23 = i20;
        }
        int i33 = i31;
        if (iD6 < i10) {
            int i34 = i10 - iD6;
            int i35 = iD6 + i34;
            int i36 = i33;
            iD = iD4 - i34;
            while (iD < i11 && i36 > 0) {
                int i37 = i36 - 1;
                C.x xVarC3 = yVar.c(i37);
                c6871m.add(0, xVarC3);
                iD += xVarC3.d();
                i36 = i37;
            }
            iRound += i34;
            if (iD < 0) {
                iRound += iD;
                i17 = i35 + iD;
                iD = 0;
            } else {
                i17 = i35;
            }
        } else {
            i17 = iD6;
            iD = iD4;
        }
        float f10 = (A7.a.a(java.lang.Math.round(f6)) != A7.a.a(iRound) || java.lang.Math.abs(java.lang.Math.round(f6)) < java.lang.Math.abs(iRound)) ? f6 : iRound;
        if (iD < 0) {
            throw new java.lang.IllegalArgumentException("negative initial offset".toString());
        }
        int i38 = -iD;
        C.x xVar2 = (C.x) c6871m.first();
        C.v vVar2 = (C.v) p097j7.AbstractC6872n.Z(xVar2.b());
        int index = vVar2 != null ? vVar2.getIndex() : 0;
        C.x xVar3 = (C.x) c6871m.M();
        int index2 = (xVar3 == null || (vVarArrB = xVar3.b()) == null || (vVar = (C.v) p097j7.AbstractC6872n.A0(vVarArrB)) == null) ? 0 : vVar.getIndex();
        int size = list.size();
        java.util.List listM = null;
        int i39 = iD;
        java.util.List listM2 = null;
        int i40 = 0;
        while (i40 < size) {
            int i41 = size;
            int iIntValue = ((java.lang.Number) list.get(i40)).intValue();
            if (iIntValue >= 0 && iIntValue < index) {
                int iD7 = yVar.d(iIntValue);
                C.v vVarA = wVar.a(iIntValue, 0, iD7, yVar.a(0, iD7));
                if (listM2 == null) {
                    listM2 = new java.util.ArrayList();
                }
                java.util.List list3 = listM2;
                list3.add(vVarA);
                listM2 = list3;
            }
            i40++;
            size = i41;
            index = index;
            f10 = f10;
        }
        int i42 = index;
        float f11 = f10;
        if (listM2 == null) {
            listM2 = p097j7.AbstractC6879v.m();
        }
        java.util.List list4 = listM2;
        int size2 = list.size();
        int i43 = 0;
        while (i43 < size2) {
            int iIntValue2 = ((java.lang.Number) list.get(i43)).intValue();
            if (index2 + 1 <= iIntValue2 && iIntValue2 < i6) {
                int iD8 = yVar.d(iIntValue2);
                C.v vVarA2 = wVar.a(iIntValue2, 0, iD8, yVar.a(0, iD8));
                if (listM == null) {
                    listM = new java.util.ArrayList();
                }
                java.util.List list5 = listM;
                list5.add(vVarA2);
                listM = list5;
            }
            i43++;
            index2 = index2;
        }
        int i44 = index2;
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        java.util.List list6 = listM;
        if (i11 > 0 || i13 < 0) {
            int size3 = c6871m.size();
            C.x xVar4 = xVar2;
            int i45 = 0;
            int i46 = i39;
            while (i45 < size3) {
                int iD9 = ((C.x) c6871m.get(i45)).d();
                if (i46 == 0 || iD9 > i46 || i45 == p097j7.AbstractC6879v.o(c6871m)) {
                    break;
                }
                i46 -= iD9;
                i45++;
                xVar4 = (C.x) c6871m.get(i45);
            }
            xVar = xVar4;
            i18 = i46;
        } else {
            xVar = xVar2;
            i18 = i39;
        }
        int iL = z6 ? Y0.C1859b.l(j6) : Y0.c.i(j6, i17);
        int iH2 = z6 ? Y0.c.h(j6, i17) : Y0.C1859b.k(j6);
        int i47 = i42;
        java.util.List listB = b(c6871m, list4, list6, iL, iH2, i17, i10, i38, z6, mVar, eVar, z10, eVar2);
        int i48 = i17;
        lazyLayoutItemAnimator.l((int) f11, iL, iH2, listB, wVar.e(), wVar, z6, false, i16, false, i18, i48, n6, c6);
        long jH2 = lazyLayoutItemAnimator.h();
        if (Y0.t.e(jH2, Y0.t.f16230b.a())) {
            i19 = iL;
            iH = iH2;
        } else {
            int i49 = z6 ? iH2 : iL;
            i19 = Y0.c.i(j6, java.lang.Math.max(iL, Y0.t.g(jH2)));
            iH = Y0.c.h(j6, java.lang.Math.max(iH2, Y0.t.f(jH2)));
            int i50 = z6 ? iH : i19;
            if (i50 != i49) {
                int size4 = listB.size();
                for (int i51 = 0; i51 < size4; i51++) {
                    ((C.v) listB.get(i51)).v(i50);
                }
            }
        }
        if (i44 == i6 - 1 && i48 <= i10) {
            z11 = false;
        }
        D0.K k6 = (D0.K) qVar.j(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(iH), new C.t.b(listB, interfaceC1753w0));
        if (list4.isEmpty() && list6.isEmpty()) {
            list2 = listB;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(listB.size());
            int size5 = listB.size();
            int i52 = 0;
            while (i52 < size5) {
                java.lang.Object obj = listB.get(i52);
                int index3 = ((C.v) obj).getIndex();
                int i53 = i47;
                if (i53 <= index3 && index3 <= i44) {
                    arrayList.add(obj);
                }
                i52++;
                i47 = i53;
            }
            list2 = arrayList;
        }
        return new C.u(xVar, i18, z11, f11, k6, z13, n6, eVar2, i16, lVar, list2, i22, i26, i6, z10, z6 ? p230x.s.Vertical : p230x.s.Horizontal, i12, i13);
    }
}
