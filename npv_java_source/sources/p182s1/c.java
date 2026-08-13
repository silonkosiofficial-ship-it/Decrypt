package p182s1;

/* JADX INFO: loaded from: classes.dex */
public class c extends p182s1.m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    java.util.ArrayList f54054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f54055l;

    public c(p172r1.e eVar, int i6) {
        super(eVar);
        this.f54054k = new java.util.ArrayList();
        this.f54105f = i6;
        q();
    }

    private void q() {
        p172r1.e eVar;
        p172r1.e eVarH = this.f54101b;
        do {
            eVar = eVarH;
            eVarH = eVarH.H(this.f54105f);
        } while (eVarH != null);
        this.f54101b = eVar;
        this.f54054k.add(eVar.J(this.f54105f));
        p172r1.e eVarF = eVar.F(this.f54105f);
        while (eVarF != null) {
            this.f54054k.add(eVarF.J(this.f54105f));
            eVarF = eVarF.F(this.f54105f);
        }
        for (p182s1.m mVar : this.f54054k) {
            int i6 = this.f54105f;
            if (i6 == 0) {
                mVar.f54101b.f53669c = this;
            } else if (i6 == 1) {
                mVar.f54101b.f53671d = this;
            }
        }
        if (this.f54105f == 0 && ((p172r1.f) this.f54101b.G()).a1() && this.f54054k.size() > 1) {
            java.util.ArrayList arrayList = this.f54054k;
            this.f54101b = ((p182s1.m) arrayList.get(arrayList.size() - 1)).f54101b;
        }
        this.f54055l = this.f54105f == 0 ? this.f54101b.x() : this.f54101b.L();
    }

    private p172r1.e r() {
        for (int i6 = 0; i6 < this.f54054k.size(); i6++) {
            p182s1.m mVar = (p182s1.m) this.f54054k.get(i6);
            if (mVar.f54101b.O() != 8) {
                return mVar.f54101b;
            }
        }
        return null;
    }

    private p172r1.e s() {
        for (int size = this.f54054k.size() - 1; size >= 0; size--) {
            p182s1.m mVar = (p182s1.m) this.f54054k.get(size);
            if (mVar.f54101b.O() != 8) {
                return mVar.f54101b;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01cf A[PHI: r1 r22 r23 r24
  0x01cf: PHI (r1v52 int) = (r1v50 int), (r1v58 int) binds: [B:119:0x01cd, B:110:0x01a7] A[DONT_GENERATE, DONT_INLINE]
  0x01cf: PHI (r22v1 float) = (r22v0 float), (r22v3 float) binds: [B:119:0x01cd, B:110:0x01a7] A[DONT_GENERATE, DONT_INLINE]
  0x01cf: PHI (r23v4 boolean) = (r23v3 boolean), (r23v6 boolean) binds: [B:119:0x01cd, B:110:0x01a7] A[DONT_GENERATE, DONT_INLINE]
  0x01cf: PHI (r24v4 int) = (r24v3 int), (r24v6 int) binds: [B:119:0x01cd, B:110:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:311:0x00f6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x014f  */
    @Override // p182s1.m, p182s1.d
    public void a(p182s1.d dVar) {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        float f6;
        boolean z6;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        int i18;
        float f10;
        int iMax;
        int i19;
        int i20;
        float f11;
        if (this.f54107h.f54074j && this.f54108i.f54074j) {
            p172r1.e eVarG = this.f54101b.G();
            boolean zA1 = (eVarG == null || !(eVarG instanceof p172r1.f)) ? false : ((p172r1.f) eVarG).a1();
            int i21 = this.f54108i.f54071g - this.f54107h.f54071g;
            int size = this.f54054k.size();
            int i22 = 0;
            while (true) {
                i6 = -1;
                i10 = 8;
                if (i22 >= size) {
                    i22 = -1;
                    break;
                } else if (((p182s1.m) this.f54054k.get(i22)).f54101b.O() != 8) {
                    break;
                } else {
                    i22++;
                }
            }
            int i23 = size - 1;
            for (int i24 = i23; i24 >= 0; i24--) {
                if (((p182s1.m) this.f54054k.get(i24)).f54101b.O() != 8) {
                    i6 = i24;
                    break;
                }
            }
            int i25 = 0;
            while (true) {
                if (i25 >= 2) {
                    i11 = 0;
                    i12 = 0;
                    i13 = 0;
                    f6 = 0.0f;
                    break;
                }
                int i26 = 0;
                i12 = 0;
                i13 = 0;
                int i27 = 0;
                f6 = 0.0f;
                while (i26 < size) {
                    p182s1.m mVar = (p182s1.m) this.f54054k.get(i26);
                    if (mVar.f54101b.O() != i10) {
                        i27++;
                        if (i26 > 0 && i26 >= i22) {
                            i12 += mVar.f54107h.f54070f;
                        }
                        p182s1.g gVar = mVar.f54104e;
                        int i28 = gVar.f54071g;
                        boolean z11 = mVar.f54103d != r1.e.b.MATCH_CONSTRAINT;
                        if (z11) {
                            int i29 = this.f54105f;
                            if (i29 == 0 && !mVar.f54101b.f53673e.f54104e.f54074j) {
                                return;
                            }
                            if (i29 == 1 && !mVar.f54101b.f53675f.f54104e.f54074j) {
                                return;
                            } else {
                                i19 = i28;
                            }
                        } else {
                            i19 = i28;
                            if (mVar.f54100a == 1 && i25 == 0) {
                                i20 = gVar.f54086m;
                                i13++;
                            } else {
                                if (gVar.f54074j) {
                                    i20 = i19;
                                }
                                if (z11) {
                                    i12 += i20;
                                } else {
                                    i13++;
                                    f11 = mVar.f54101b.f53698q0[this.f54105f];
                                    if (f11 >= 0.0f) {
                                        f6 += f11;
                                    }
                                }
                                if (i26 >= i23 && i26 < i6) {
                                    i12 += -mVar.f54108i.f54070f;
                                }
                            }
                            z11 = true;
                            if (z11) {
                                i13++;
                                f11 = mVar.f54101b.f53698q0[this.f54105f];
                                if (f11 >= 0.0f) {
                                    f6 += f11;
                                }
                            } else {
                                i12 += i20;
                            }
                            if (i26 >= i23) {
                            }
                        }
                        i20 = i19;
                        if (z11) {
                            i13++;
                            f11 = mVar.f54101b.f53698q0[this.f54105f];
                            if (f11 >= 0.0f) {
                                f6 += f11;
                            }
                        } else {
                            i12 += i20;
                        }
                        if (i26 >= i23) {
                        }
                    }
                    i26++;
                    i10 = 8;
                }
                if (i12 < i21 || i13 == 0) {
                    i11 = i27;
                    break;
                } else {
                    i25++;
                    i10 = 8;
                }
            }
            int i30 = this.f54107h.f54071g;
            if (zA1) {
                i30 = this.f54108i.f54071g;
            }
            if (i12 > i21) {
                int i31 = (int) (((i12 - i21) / 2.0f) + 0.5f);
                i30 = zA1 ? i30 + i31 : i30 - i31;
            }
            if (i13 > 0) {
                float f12 = i21 - i12;
                int i32 = (int) ((f12 / i13) + 0.5f);
                int i33 = 0;
                int i34 = 0;
                while (i33 < size) {
                    p182s1.m mVar2 = (p182s1.m) this.f54054k.get(i33);
                    int i35 = i32;
                    int i36 = i12;
                    if (mVar2.f54101b.O() != 8 && mVar2.f54103d == r1.e.b.MATCH_CONSTRAINT) {
                        p182s1.g gVar2 = mVar2.f54104e;
                        if (gVar2.f54074j) {
                            z10 = zA1;
                            i18 = i11;
                            i30 = i30;
                            f10 = f12;
                        } else {
                            int i37 = f6 > 0.0f ? (int) (((mVar2.f54101b.f53698q0[this.f54105f] * f12) / f6) + 0.5f) : i35;
                            if (this.f54105f == 0) {
                                p172r1.e eVar = mVar2.f54101b;
                                f10 = f12;
                                int i38 = eVar.f53695p;
                                z10 = zA1;
                                i18 = i11;
                                iMax = java.lang.Math.max(eVar.f53693o, mVar2.f54100a == 1 ? java.lang.Math.min(i37, gVar2.f54086m) : i37);
                                if (i38 > 0) {
                                    iMax = java.lang.Math.min(i38, iMax);
                                }
                                if (iMax != i37) {
                                    i34++;
                                    i37 = iMax;
                                }
                            } else {
                                z10 = zA1;
                                i18 = i11;
                                f10 = f12;
                                p172r1.e eVar2 = mVar2.f54101b;
                                int i39 = eVar2.f53701s;
                                iMax = java.lang.Math.max(eVar2.f53699r, mVar2.f54100a == 1 ? java.lang.Math.min(i37, gVar2.f54086m) : i37);
                                if (i39 > 0) {
                                    iMax = java.lang.Math.min(i39, iMax);
                                }
                                if (iMax != i37) {
                                    i34++;
                                    i37 = iMax;
                                }
                            }
                            mVar2.f54104e.d(i37);
                        }
                    } else {
                        z10 = zA1;
                        i18 = i11;
                        i30 = i30;
                        f10 = f12;
                    }
                    i33++;
                    i32 = i35;
                    i12 = i36;
                    i30 = i30;
                    f12 = f10;
                    zA1 = z10;
                    i11 = i18;
                }
                z6 = zA1;
                i14 = i11;
                i15 = i30;
                int i40 = i12;
                if (i34 > 0) {
                    i13 -= i34;
                    i12 = 0;
                    for (int i41 = 0; i41 < size; i41++) {
                        p182s1.m mVar3 = (p182s1.m) this.f54054k.get(i41);
                        if (mVar3.f54101b.O() != 8) {
                            if (i41 > 0 && i41 >= i22) {
                                i12 += mVar3.f54107h.f54070f;
                            }
                            i12 += mVar3.f54104e.f54071g;
                            if (i41 < i23 && i41 < i6) {
                                i12 += -mVar3.f54108i.f54070f;
                            }
                        }
                    }
                } else {
                    i12 = i40;
                }
                i17 = 2;
                if (this.f54055l == 2 && i34 == 0) {
                    i16 = 0;
                    this.f54055l = 0;
                } else {
                    i16 = 0;
                }
            } else {
                z6 = zA1;
                i14 = i11;
                i15 = i30;
                i16 = 0;
                i17 = 2;
            }
            if (i12 > i21) {
                this.f54055l = i17;
            }
            if (i14 > 0 && i13 == 0 && i22 == i6) {
                this.f54055l = i17;
            }
            int i42 = this.f54055l;
            int i43 = i14;
            if (i42 == 1) {
                int i44 = i43 > 1 ? (i21 - i12) / (i43 - 1) : i43 == 1 ? (i21 - i12) / 2 : i16;
                if (i13 > 0) {
                    i44 = i16;
                }
                int i45 = i15;
                for (int i46 = i16; i46 < size; i46++) {
                    p182s1.m mVar4 = (p182s1.m) this.f54054k.get(z6 ? size - (i46 + 1) : i46);
                    if (mVar4.f54101b.O() == 8) {
                        mVar4.f54107h.d(i45);
                        mVar4.f54108i.d(i45);
                    } else {
                        if (i46 > 0) {
                            i45 = z6 ? i45 - i44 : i45 + i44;
                        }
                        if (i46 > 0 && i46 >= i22) {
                            int i47 = mVar4.f54107h.f54070f;
                            i45 = z6 ? i45 - i47 : i45 + i47;
                        }
                        (z6 ? mVar4.f54108i : mVar4.f54107h).d(i45);
                        p182s1.g gVar3 = mVar4.f54104e;
                        int i48 = gVar3.f54071g;
                        if (mVar4.f54103d == r1.e.b.MATCH_CONSTRAINT && mVar4.f54100a == 1) {
                            i48 = gVar3.f54086m;
                        }
                        i45 = z6 ? i45 - i48 : i45 + i48;
                        (z6 ? mVar4.f54107h : mVar4.f54108i).d(i45);
                        mVar4.f54106g = true;
                        if (i46 < i23 && i46 < i6) {
                            int i49 = -mVar4.f54108i.f54070f;
                            i45 = z6 ? i45 - i49 : i45 + i49;
                        }
                    }
                }
                return;
            }
            if (i42 == 0) {
                int i50 = (i21 - i12) / (i43 + 1);
                if (i13 > 0) {
                    i50 = i16;
                }
                int i51 = i15;
                for (int i52 = i16; i52 < size; i52++) {
                    p182s1.m mVar5 = (p182s1.m) this.f54054k.get(z6 ? size - (i52 + 1) : i52);
                    if (mVar5.f54101b.O() == 8) {
                        mVar5.f54107h.d(i51);
                        mVar5.f54108i.d(i51);
                    } else {
                        int i53 = z6 ? i51 - i50 : i51 + i50;
                        if (i52 > 0 && i52 >= i22) {
                            int i54 = mVar5.f54107h.f54070f;
                            i53 = z6 ? i53 - i54 : i53 + i54;
                        }
                        (z6 ? mVar5.f54108i : mVar5.f54107h).d(i53);
                        p182s1.g gVar4 = mVar5.f54104e;
                        int iMin = gVar4.f54071g;
                        if (mVar5.f54103d == r1.e.b.MATCH_CONSTRAINT && mVar5.f54100a == 1) {
                            iMin = java.lang.Math.min(iMin, gVar4.f54086m);
                        }
                        i51 = z6 ? i53 - iMin : i53 + iMin;
                        (z6 ? mVar5.f54107h : mVar5.f54108i).d(i51);
                        if (i52 < i23 && i52 < i6) {
                            int i55 = -mVar5.f54108i.f54070f;
                            i51 = z6 ? i51 - i55 : i51 + i55;
                        }
                    }
                }
                return;
            }
            if (i42 == 2) {
                float fW = this.f54105f == 0 ? this.f54101b.w() : this.f54101b.K();
                if (z6) {
                    fW = 1.0f - fW;
                }
                int i56 = (int) (((i21 - i12) * fW) + 0.5f);
                if (i56 < 0 || i13 > 0) {
                    i56 = i16;
                }
                int i57 = z6 ? i15 - i56 : i15 + i56;
                for (int i58 = i16; i58 < size; i58++) {
                    p182s1.m mVar6 = (p182s1.m) this.f54054k.get(z6 ? size - (i58 + 1) : i58);
                    if (mVar6.f54101b.O() == 8) {
                        mVar6.f54107h.d(i57);
                        mVar6.f54108i.d(i57);
                    } else {
                        if (i58 > 0 && i58 >= i22) {
                            int i59 = mVar6.f54107h.f54070f;
                            i57 = z6 ? i57 - i59 : i57 + i59;
                        }
                        (z6 ? mVar6.f54108i : mVar6.f54107h).d(i57);
                        p182s1.g gVar5 = mVar6.f54104e;
                        int i60 = gVar5.f54071g;
                        if (mVar6.f54103d == r1.e.b.MATCH_CONSTRAINT && mVar6.f54100a == 1) {
                            i60 = gVar5.f54086m;
                        }
                        i57 = z6 ? i57 - i60 : i57 + i60;
                        (z6 ? mVar6.f54107h : mVar6.f54108i).d(i57);
                        if (i58 < i23 && i58 < i6) {
                            int i61 = -mVar6.f54108i.f54070f;
                            i57 = z6 ? i57 - i61 : i57 + i61;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a5 A[PHI: r0 r1
  0x00a5: PHI (r0v13 int) = (r0v10 int), (r0v19 int) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r1v3 s1.f) = (r1v2 s1.f), (r1v7 s1.f) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p182s1.m
    void d() {
        p182s1.f fVarI;
        int iC;
        java.util.Iterator it = this.f54054k.iterator();
        while (it.hasNext()) {
            ((p182s1.m) it.next()).d();
        }
        int size = this.f54054k.size();
        if (size < 1) {
            return;
        }
        p172r1.e eVar = ((p182s1.m) this.f54054k.get(0)).f54101b;
        p172r1.e eVar2 = ((p182s1.m) this.f54054k.get(size - 1)).f54101b;
        if (this.f54105f == 0) {
            p172r1.d dVar = eVar.f53640B;
            p172r1.d dVar2 = eVar2.f53642D;
            p182s1.f fVarI2 = i(dVar, 0);
            int iC2 = dVar.c();
            p172r1.e eVarR = r();
            if (eVarR != null) {
                iC2 = eVarR.f53640B.c();
            }
            if (fVarI2 != null) {
                b(this.f54107h, fVarI2, iC2);
            }
            fVarI = i(dVar2, 0);
            iC = dVar2.c();
            p172r1.e eVarS = s();
            if (eVarS != null) {
                iC = eVarS.f53642D.c();
            }
            if (fVarI != null) {
                b(this.f54108i, fVarI, -iC);
            }
        } else {
            p172r1.d dVar3 = eVar.f53641C;
            p172r1.d dVar4 = eVar2.f53643E;
            p182s1.f fVarI3 = i(dVar3, 1);
            int iC3 = dVar3.c();
            p172r1.e eVarR2 = r();
            if (eVarR2 != null) {
                iC3 = eVarR2.f53641C.c();
            }
            if (fVarI3 != null) {
                b(this.f54107h, fVarI3, iC3);
            }
            fVarI = i(dVar4, 1);
            iC = dVar4.c();
            p172r1.e eVarS2 = s();
            if (eVarS2 != null) {
                iC = eVarS2.f53643E.c();
            }
            if (fVarI != null) {
                b(this.f54108i, fVarI, -iC);
            }
        }
        this.f54107h.f54065a = this;
        this.f54108i.f54065a = this;
    }

    @Override // p182s1.m
    public void e() {
        for (int i6 = 0; i6 < this.f54054k.size(); i6++) {
            ((p182s1.m) this.f54054k.get(i6)).e();
        }
    }

    @Override // p182s1.m
    void f() {
        this.f54102c = null;
        java.util.Iterator it = this.f54054k.iterator();
        while (it.hasNext()) {
            ((p182s1.m) it.next()).f();
        }
    }

    @Override // p182s1.m
    public long j() {
        int size = this.f54054k.size();
        long j6 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            p182s1.m mVar = (p182s1.m) this.f54054k.get(i6);
            j6 = j6 + ((long) mVar.f54107h.f54070f) + mVar.j() + ((long) mVar.f54108i.f54070f);
        }
        return j6;
    }

    @Override // p182s1.m
    boolean m() {
        int size = this.f54054k.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!((p182s1.m) this.f54054k.get(i6)).m()) {
                return false;
            }
        }
        return true;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f54105f == 0 ? "horizontal : " : "vertical : ");
        java.lang.String string = sb.toString();
        java.util.Iterator it = this.f54054k.iterator();
        while (it.hasNext()) {
            java.lang.String str = string + "<";
            string = (str + ((p182s1.m) it.next())) + "> ";
        }
        return string;
    }
}
