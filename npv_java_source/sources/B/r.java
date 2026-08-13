package B;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final B.r.a f441D = new B.r.a();

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
        final /* synthetic */ java.util.List f442D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ B.t f443E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f444F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f445G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.util.List list, B.t tVar, boolean z6, V.InterfaceC1753w0 interfaceC1753w0) {
            super(1);
            this.f442D = list;
            this.f443E = tVar;
            this.f444F = z6;
            this.f445G = interfaceC1753w0;
        }

        public final void a(D0.X.a aVar) {
            java.util.List list = this.f442D;
            B.t tVar = this.f443E;
            boolean z6 = this.f444F;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                B.t tVar2 = (B.t) list.get(i6);
                if (tVar2 != tVar) {
                    tVar2.r(aVar, z6);
                }
            }
            B.t tVar3 = this.f443E;
            if (tVar3 != null) {
                tVar3.r(aVar, this.f444F);
            }
            D.L.a(this.f445G);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    private static final java.util.List a(java.util.List list, java.util.List list2, java.util.List list3, int i6, int i10, int i11, int i12, int i13, boolean z6, A.C0768b.m mVar, A.C0768b.e eVar, boolean z10, Y0.e eVar2) {
        int i14 = z6 ? i10 : i6;
        boolean z11 = i11 < java.lang.Math.min(i14, i12);
        if (z11 && i13 != 0) {
            throw new java.lang.IllegalStateException("non-zero itemsScrollOffset".toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + list2.size() + list3.size());
        if (!z11) {
            int size = list2.size();
            int iE = i13;
            for (int i15 = 0; i15 < size; i15++) {
                B.t tVar = (B.t) list2.get(i15);
                iE -= tVar.e();
                tVar.s(iE, i6, i10);
                arrayList.add(tVar);
            }
            int size2 = list.size();
            int iE2 = i13;
            for (int i16 = 0; i16 < size2; i16++) {
                B.t tVar2 = (B.t) list.get(i16);
                tVar2.s(iE2, i6, i10);
                arrayList.add(tVar2);
                iE2 += tVar2.e();
            }
            int size3 = list3.size();
            for (int i17 = 0; i17 < size3; i17++) {
                B.t tVar3 = (B.t) list3.get(i17);
                tVar3.s(iE2, i6, i10);
                arrayList.add(tVar3);
                iE2 += tVar3.e();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new java.lang.IllegalArgumentException("no extra items".toString());
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i18 = 0; i18 < size4; i18++) {
                iArr[i18] = ((B.t) list.get(b(i18, z10, size4))).a();
            }
            int[] iArr2 = new int[size4];
            for (int i19 = 0; i19 < size4; i19++) {
                iArr2[i19] = 0;
            }
            if (z6) {
                if (mVar == null) {
                    throw new java.lang.IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                }
                mVar.b(eVar2, i14, iArr, iArr2);
            } else {
                if (eVar == null) {
                    throw new java.lang.IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
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
                    int iA = iArr2[iF];
                    B.t tVar4 = (B.t) list.get(b(iF, z10, size4));
                    if (z10) {
                        iA = (i14 - iA) - tVar4.a();
                    }
                    tVar4.s(iA, i6, i10);
                    arrayList.add(tVar4);
                    if (iF == iG) {
                        break;
                    }
                    iF += iO;
                }
            }
        }
        return arrayList;
    }

    private static final int b(int i6, boolean z6, int i10) {
        return !z6 ? i6 : (i10 - i6) - 1;
    }

    private static final java.util.List c(java.util.List list, B.u uVar, int i6, int i10, java.util.List list2, float f6, boolean z6, B.q qVar) {
        java.util.ArrayList arrayList;
        B.l lVar;
        B.t tVar;
        java.lang.Object obj;
        int iE;
        int index;
        int iMin;
        B.t tVar2;
        java.lang.Object obj2;
        int i11 = i6 - 1;
        int iMin2 = java.lang.Math.min(((B.t) p097j7.AbstractC6879v.t0(list)).getIndex() + i10, i11);
        int index2 = ((B.t) p097j7.AbstractC6879v.t0(list)).getIndex() + 1;
        if (index2 <= iMin2) {
            java.util.ArrayList arrayList2 = null;
            while (true) {
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                arrayList = arrayList2;
                arrayList.add(B.u.e(uVar, index2, 0L, 2, null));
                if (index2 == iMin2) {
                    break;
                }
                index2++;
                arrayList2 = arrayList;
            }
        } else {
            arrayList = null;
        }
        if (z6 && qVar != null && (!qVar.j().isEmpty())) {
            java.util.List listJ = qVar.j();
            int size = listJ.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    lVar = null;
                    break;
                }
                if (((B.l) listJ.get(size)).getIndex() > iMin2 && (size == 0 || ((B.l) listJ.get(size - 1)).getIndex() <= iMin2)) {
                    lVar = (B.l) listJ.get(size);
                    break;
                }
            }
            B.l lVar2 = (B.l) p097j7.AbstractC6879v.t0(qVar.j());
            if (lVar != null && (index = lVar.getIndex()) <= (iMin = java.lang.Math.min(lVar2.getIndex(), i11))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = arrayList.get(i12);
                            if (((B.t) obj2).getIndex() == index) {
                                break;
                            }
                            i12++;
                        }
                        tVar2 = (B.t) obj2;
                    } else {
                        tVar2 = null;
                    }
                    if (tVar2 == null) {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(B.u.e(uVar, index, 0L, 2, null));
                    }
                    if (index == iMin) {
                        break;
                    }
                    index++;
                }
            }
            float fC = ((qVar.c() - lVar2.c()) - lVar2.a()) - f6;
            if (fC > 0.0f) {
                int index3 = lVar2.getIndex() + 1;
                int i13 = 0;
                while (index3 < i6 && i13 < fC) {
                    if (index3 <= iMin2) {
                        int size3 = list.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size3) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i14);
                            if (((B.t) obj).getIndex() == index3) {
                                break;
                            }
                            i14++;
                        }
                        tVar = (B.t) obj;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size4) {
                                obj = null;
                                break;
                            }
                            obj = arrayList.get(i15);
                            if (((B.t) obj).getIndex() == index3) {
                                break;
                            }
                            i15++;
                        }
                        tVar = (B.t) obj;
                    } else {
                        tVar = null;
                    }
                    if (tVar != null) {
                        index3++;
                        iE = tVar.e();
                    } else {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(B.u.e(uVar, index3, 0L, 2, null));
                        index3++;
                        iE = ((B.t) p097j7.AbstractC6879v.t0(arrayList)).e();
                    }
                    i13 += iE;
                }
            }
        }
        if (arrayList != null && ((B.t) p097j7.AbstractC6879v.t0(arrayList)).getIndex() > iMin2) {
            iMin2 = ((B.t) p097j7.AbstractC6879v.t0(arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i16 = 0; i16 < size5; i16++) {
            int iIntValue = ((java.lang.Number) list2.get(i16)).intValue();
            if (iIntValue > iMin2) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(B.u.e(uVar, iIntValue, 0L, 2, null));
            }
        }
        return arrayList == null ? p097j7.AbstractC6879v.m() : arrayList;
    }

    private static final java.util.List d(int i6, B.u uVar, int i10, java.util.List list) {
        int iMax = java.lang.Math.max(0, i6 - i10);
        int i11 = i6 - 1;
        java.util.ArrayList arrayList = null;
        if (iMax <= i11) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(B.u.e(uVar, i11, 0L, 2, null));
                if (i11 == iMax) {
                    break;
                }
                i11--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i12 = size - 1;
                int iIntValue = ((java.lang.Number) list.get(size)).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(B.u.e(uVar, iIntValue, 0L, 2, null));
                }
                if (i12 < 0) {
                    break;
                }
                size = i12;
            }
        }
        return arrayList == null ? p097j7.AbstractC6879v.m() : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x037d  */
    /* JADX WARN: Code duplicated, block: B:147:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:148:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:150:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:159:0x0412  */
    /* JADX WARN: Code duplicated, block: B:161:0x0417  */
    public static final B.s e(int i6, B.u uVar, int i10, int i11, int i12, int i13, int i14, int i15, float f6, long j6, boolean z6, java.util.List list, A.C0768b.m mVar, A.C0768b.e eVar, boolean z10, Y0.e eVar2, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator, int i16, java.util.List list2, boolean z11, boolean z12, B.q qVar, W8.N n6, V.InterfaceC1753w0 interfaceC1753w0, p141o0.C1 c6, p237x7.q qVar2) {
        int i17;
        int i18;
        int iMax;
        int i19;
        int i20;
        int i21;
        int i22;
        B.t tVar;
        int i23;
        int iH;
        int i24;
        boolean z13;
        boolean z14;
        int size;
        int i25;
        java.util.List list3;
        B.t tVar2;
        p230x.s sVar;
        int i26;
        int i27;
        if (i11 < 0) {
            throw new java.lang.IllegalArgumentException("invalid beforeContentPadding".toString());
        }
        if (i12 < 0) {
            throw new java.lang.IllegalArgumentException("invalid afterContentPadding".toString());
        }
        if (i6 <= 0) {
            int iN = Y0.C1859b.n(j6);
            int iM = Y0.C1859b.m(j6);
            lazyLayoutItemAnimator.l(0, iN, iM, new java.util.ArrayList(), uVar.g(), uVar, z6, z12, 1, z11, 0, 0, n6, c6);
            if (!z12) {
                long jH = lazyLayoutItemAnimator.h();
                if (!Y0.t.e(jH, Y0.t.f16230b.a())) {
                    iN = Y0.c.i(j6, Y0.t.g(jH));
                    iM = Y0.c.h(j6, Y0.t.f(jH));
                }
            }
            return new B.s(null, 0, false, 0.0f, (D0.K) qVar2.j(java.lang.Integer.valueOf(iN), java.lang.Integer.valueOf(iM), B.r.a.f441D), 0.0f, false, n6, eVar2, uVar.f(), p097j7.AbstractC6879v.m(), -i11, i10 + i12, 0, z10, z6 ? p230x.s.Vertical : p230x.s.Horizontal, i12, i13, null);
        }
        int i28 = 0;
        int i29 = i14;
        if (i29 >= i6) {
            i29 = i6 - 1;
            i17 = 0;
        } else {
            i17 = i15;
        }
        int iRound = java.lang.Math.round(f6);
        int i30 = i17 - iRound;
        if (i29 == 0 && i30 < 0) {
            iRound += i30;
            i30 = 0;
        }
        p097j7.C6871m c6871m = new p097j7.C6871m();
        int i31 = -i11;
        int i32 = (i13 < 0 ? i13 : 0) + i31;
        int iE = i30 + i32;
        int iMax2 = 0;
        while (iE < 0 && i29 > 0) {
            i29--;
            B.t tVarE = B.u.e(uVar, i29, 0L, 2, null);
            c6871m.add(i28, tVarE);
            iMax2 = java.lang.Math.max(iMax2, tVarE.m());
            iE += tVarE.e();
            i28 = 0;
        }
        if (iE < i32) {
            iRound += iE;
            iE = i32;
        }
        int i33 = iE - i32;
        int i34 = i10 + i12;
        int i35 = i29;
        int iD = E7.j.d(i34, 0);
        int i36 = i35;
        int i37 = iMax2;
        int iE2 = -i33;
        int i38 = 0;
        boolean z15 = false;
        while (i38 < c6871m.size()) {
            if (iE2 >= iD) {
                c6871m.remove(i38);
                z15 = true;
            } else {
                i36++;
                iE2 += ((B.t) c6871m.get(i38)).e();
                i38++;
            }
        }
        int iE3 = i33;
        int iE4 = iE2;
        boolean z16 = z15;
        int i39 = i36;
        int iMax3 = i37;
        while (i39 < i6 && (iE4 < iD || iE4 <= 0 || c6871m.isEmpty())) {
            int i40 = iD;
            B.t tVarE2 = B.u.e(uVar, i39, 0L, 2, null);
            iE4 += tVarE2.e();
            if (iE4 <= i32) {
                i26 = i32;
                if (i39 != i6 - 1) {
                    i27 = i39 + 1;
                    iE3 -= tVarE2.e();
                    z16 = true;
                }
                i39++;
                iD = i40;
                i35 = i27;
                i32 = i26;
            } else {
                i26 = i32;
            }
            iMax3 = java.lang.Math.max(iMax3, tVarE2.m());
            c6871m.add(tVarE2);
            i27 = i35;
            i39++;
            iD = i40;
            i35 = i27;
            i32 = i26;
        }
        if (iE4 < i10) {
            int i41 = i10 - iE4;
            iE3 -= i41;
            int i42 = iE4 + i41;
            iMax = iMax3;
            i21 = i35;
            while (iE3 < i11 && i21 > 0) {
                int i43 = i21 - 1;
                B.t tVarE3 = B.u.e(uVar, i43, 0L, 2, null);
                c6871m.add(0, tVarE3);
                iMax = java.lang.Math.max(iMax, tVarE3.m());
                iE3 += tVarE3.e();
                i21 = i43;
                i34 = i34;
            }
            i18 = i34;
            i19 = i41 + iRound;
            if (iE3 < 0) {
                i19 += iE3;
                i20 = i42 + iE3;
                iE3 = 0;
            } else {
                i20 = i42;
            }
        } else {
            i18 = i34;
            iMax = iMax3;
            i19 = iRound;
            i20 = iE4;
            i21 = i35;
        }
        int i44 = iMax;
        float f10 = (A7.a.a(java.lang.Math.round(f6)) != A7.a.a(i19) || java.lang.Math.abs(java.lang.Math.round(f6)) < java.lang.Math.abs(i19)) ? f6 : i19;
        float f11 = f6 - f10;
        float f12 = (!z12 || i19 <= iRound || f11 > 0.0f) ? 0.0f : (i19 - iRound) + f11;
        if (iE3 < 0) {
            throw new java.lang.IllegalArgumentException("negative currentFirstItemScrollOffset".toString());
        }
        int i45 = -iE3;
        B.t tVar3 = (B.t) c6871m.first();
        if (i11 > 0 || i13 < 0) {
            int size2 = c6871m.size();
            B.t tVar4 = tVar3;
            int i46 = iE3;
            int i47 = 0;
            while (true) {
                if (i47 < size2) {
                    int i48 = size2;
                    int iE5 = ((B.t) c6871m.get(i47)).e();
                    if (i46 != 0 && iE5 <= i46) {
                        i22 = i45;
                        if (i47 == p097j7.AbstractC6879v.o(c6871m)) {
                            break;
                        }
                        i46 -= iE5;
                        i47++;
                        tVar4 = (B.t) c6871m.get(i47);
                        i45 = i22;
                        size2 = i48;
                    }
                }
                i22 = i45;
                break;
            }
            tVar = tVar4;
            i23 = i46;
        } else {
            i22 = i45;
            i23 = iE3;
            tVar = tVar3;
        }
        java.util.List listD = d(i21, uVar, i16, list2);
        int i49 = i39;
        int i50 = 0;
        int iMax4 = i44;
        for (int size3 = listD.size(); i50 < size3; size3 = size3) {
            iMax4 = java.lang.Math.max(iMax4, ((B.t) listD.get(i50)).m());
            i50++;
        }
        float f13 = f10;
        B.t tVar5 = tVar;
        java.util.List listC = c(c6871m, uVar, i6, i16, list2, f13, z12, qVar);
        int size4 = listC.size();
        for (int i51 = 0; i51 < size4; i51++) {
            iMax4 = java.lang.Math.max(iMax4, ((B.t) listC.get(i51)).m());
        }
        boolean z17 = p247y7.AbstractC7350t.b(tVar5, c6871m.first()) && listD.isEmpty() && listC.isEmpty();
        int i52 = Y0.c.i(j6, z6 ? iMax4 : i20);
        if (z6) {
            iMax4 = i20;
        }
        int iH2 = Y0.c.h(j6, iMax4);
        int i53 = i18;
        int i54 = i20;
        java.util.List listA = a(c6871m, listD, listC, i52, iH2, i20, i10, i22, z6, mVar, eVar, z10, eVar2);
        lazyLayoutItemAnimator.l((int) f13, i52, iH2, listA, uVar.g(), uVar, z6, z12, 1, z11, i23, i54, n6, c6);
        if (z12) {
            iH = iH2;
            i24 = i52;
        } else {
            long jH2 = lazyLayoutItemAnimator.h();
            if (Y0.t.e(jH2, Y0.t.f16230b.a())) {
                iH = iH2;
                i24 = i52;
            } else {
                int i55 = z6 ? iH2 : i52;
                int i56 = Y0.c.i(j6, java.lang.Math.max(i52, Y0.t.g(jH2)));
                iH = Y0.c.h(j6, java.lang.Math.max(iH2, Y0.t.f(jH2)));
                int i57 = z6 ? iH : i56;
                if (i57 != i55) {
                    int size5 = listA.size();
                    for (int i58 = 0; i58 < size5; i58++) {
                        ((B.t) listA.get(i58)).t(i57);
                    }
                }
                i24 = i56;
            }
        }
        B.t tVarA = list.isEmpty() ^ true ? B.i.a(listA, uVar, list, i11, i24, iH) : null;
        if (i49 >= i6) {
            z13 = z12;
            if (i54 <= i10) {
                z14 = false;
            }
            D0.K k6 = (D0.K) qVar2.j(java.lang.Integer.valueOf(i24), java.lang.Integer.valueOf(iH), new B.r.b(listA, tVarA, z13, interfaceC1753w0));
            if (z17) {
                list3 = listA;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(listA.size());
                size = listA.size();
                for (i25 = 0; i25 < size; i25++) {
                    java.lang.Object obj = listA.get(i25);
                    tVar2 = (B.t) obj;
                    if ((tVar2.getIndex() < ((B.t) c6871m.first()).getIndex() && tVar2.getIndex() <= ((B.t) c6871m.last()).getIndex()) || tVar2 == tVarA) {
                        arrayList.add(obj);
                    }
                }
                list3 = arrayList;
            }
            if (z6) {
                sVar = p230x.s.Vertical;
            } else {
                sVar = p230x.s.Horizontal;
            }
            return new B.s(tVar5, i23, z14, f13, k6, f12, z16, n6, eVar2, uVar.f(), list3, i31, i53, i6, z10, sVar, i12, i13, null);
        }
        z13 = z12;
        z14 = true;
        D0.K k10 = (D0.K) qVar2.j(java.lang.Integer.valueOf(i24), java.lang.Integer.valueOf(iH), new B.r.b(listA, tVarA, z13, interfaceC1753w0));
        if (z17) {
            list3 = listA;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(listA.size());
            size = listA.size();
            while (i25 < size) {
                java.lang.Object obj2 = listA.get(i25);
                tVar2 = (B.t) obj2;
                if (tVar2.getIndex() < ((B.t) c6871m.first()).getIndex()) {
                }
            }
            list3 = arrayList2;
        }
        if (z6) {
            sVar = p230x.s.Vertical;
        } else {
            sVar = p230x.s.Horizontal;
        }
        return new B.s(tVar5, i23, z14, f13, k10, f12, z16, n6, eVar2, uVar.f(), list3, i31, i53, i6, z10, sVar, i12, i13, null);
    }
}
