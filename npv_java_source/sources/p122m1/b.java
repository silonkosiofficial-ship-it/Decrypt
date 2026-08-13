package p122m1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1.b.a f50231a = new m1.b.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:106:0x0267  */
        /* JADX WARN: Code duplicated, block: B:108:0x026a  */
        /* JADX WARN: Code duplicated, block: B:110:0x027b  */
        /* JADX WARN: Code duplicated, block: B:112:0x02be  */
        /* JADX WARN: Code duplicated, block: B:186:0x0497  */
        /* JADX WARN: Code duplicated, block: B:18:0x0061 A[PHI: r8 r15
  0x0061: PHI (r8v33 boolean) = (r8v1 boolean), (r8v36 boolean) binds: [B:30:0x007e, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x0061: PHI (r15v30 boolean) = (r15v1 boolean), (r15v33 boolean) binds: [B:30:0x007e, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:19:0x0063 A[PHI: r8 r15
  0x0063: PHI (r8v3 boolean) = (r8v1 boolean), (r8v36 boolean) binds: [B:30:0x007e, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r15v3 boolean) = (r15v1 boolean), (r15v33 boolean) binds: [B:30:0x007e, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:203:0x0505  */
        /* JADX WARN: Code duplicated, block: B:205:0x0510  */
        /* JADX WARN: Code duplicated, block: B:208:0x0520  */
        /* JADX WARN: Code duplicated, block: B:211:0x052e  */
        /* JADX WARN: Code duplicated, block: B:214:0x0540 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:274:0x0654  */
        /* JADX WARN: Code duplicated, block: B:277:0x0668  */
        /* JADX WARN: Code duplicated, block: B:278:0x066b  */
        /* JADX WARN: Code duplicated, block: B:284:0x0686  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r38v0, types: [e1.d, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v28 */
        /* JADX WARN: Type inference failed for: r5v29, types: [e1.i] */
        /* JADX WARN: Type inference failed for: r5v31 */
        /* JADX WARN: Type inference failed for: r8v31 */
        /* JADX WARN: Type inference failed for: r8v32 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, m1.e] */
        public final void a(p122m1.f fVar, p042e1.d dVar, int i6, int i10, p122m1.c cVar) {
            boolean z6;
            boolean z10;
            boolean z11;
            java.lang.Object objH;
            p122m1.d dVar2;
            p042e1.i iVarH;
            p122m1.d dVarI;
            p042e1.i iVarH2;
            int i11;
            int i12;
            p042e1.i iVarH3;
            p122m1.d dVarI2;
            int i13;
            int iK;
            p122m1.d dVarI3;
            p042e1.i iVarH4;
            p042e1.i iVarH5;
            p042e1.i iVarH6;
            ?? r6;
            p042e1.i iVarH7;
            p042e1.i iVarH8;
            int size;
            p122m1.d dVarI4;
            int i14 = i6;
            p247y7.AbstractC7350t.f(fVar, "container");
            p247y7.AbstractC7350t.f(dVar, "system");
            p247y7.AbstractC7350t.f(cVar, "chainHead");
            p122m1.e eVarC = cVar.c();
            p122m1.e eVarI = cVar.i();
            p122m1.e eVarE = cVar.e();
            p122m1.e eVarK = cVar.k();
            p122m1.e eVarH = cVar.h();
            float fL = cVar.l();
            cVar.d();
            cVar.j();
            boolean z12 = fVar.N()[i14] == m1.e.b.WRAP_CONTENT;
            p247y7.AbstractC7350t.c(eVarH);
            if (i14 == 0) {
                z6 = eVarH.J() == 0;
                z10 = eVarH.J() == 1;
                if (eVarH.J() == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z6 = eVarH.d0() == 0;
                z10 = eVarH.d0() == 1;
                if (eVarH.d0() == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            boolean z13 = z10;
            boolean z14 = z6;
            ?? r10 = eVarC;
            boolean z15 = false;
            while (true) {
                objH = null;
                if (z15) {
                    break;
                }
                p247y7.AbstractC7350t.c(r10);
                p122m1.d dVar3 = r10.M()[i10];
                int i15 = z11 ? 1 : 4;
                int iK2 = dVar3.k();
                m1.e.b bVar = r10.N()[i14];
                m1.e.b bVar2 = m1.e.b.MATCH_CONSTRAINT;
                boolean z16 = bVar == bVar2 && r10.a0()[i14] == 0;
                if (dVar3.i() != null && !p247y7.AbstractC7350t.b(r10, eVarC)) {
                    p122m1.d dVarI5 = dVar3.i();
                    p247y7.AbstractC7350t.c(dVarI5);
                    iK2 += dVarI5.k();
                }
                fL = fL;
                int i16 = iK2;
                if (z11 && !p247y7.AbstractC7350t.b(r10, eVarC) && !p247y7.AbstractC7350t.b(r10, eVarE)) {
                    i15 = 8;
                }
                if (dVar3.i() != null) {
                    if (p247y7.AbstractC7350t.b(r10, eVarE)) {
                        p042e1.i iVarH9 = dVar3.h();
                        p247y7.AbstractC7350t.c(iVarH9);
                        p122m1.d dVarI6 = dVar3.i();
                        p247y7.AbstractC7350t.c(dVarI6);
                        p042e1.i iVarH10 = dVarI6.h();
                        p247y7.AbstractC7350t.c(iVarH10);
                        dVar.l(iVarH9, iVarH10, i16, 6);
                    } else {
                        p042e1.i iVarH11 = dVar3.h();
                        p247y7.AbstractC7350t.c(iVarH11);
                        p122m1.d dVarI7 = dVar3.i();
                        p247y7.AbstractC7350t.c(dVarI7);
                        p042e1.i iVarH12 = dVarI7.h();
                        p247y7.AbstractC7350t.c(iVarH12);
                        dVar.l(iVarH11, iVarH12, i16, 8);
                    }
                    if (z16 && !z11) {
                        i15 = 5;
                    }
                    int i17 = (p247y7.AbstractC7350t.b(r10, eVarE) && z11 && r10.L0(i14)) ? 5 : i15;
                    p042e1.i iVarH13 = dVar3.h();
                    p247y7.AbstractC7350t.c(iVarH13);
                    p122m1.d dVarI8 = dVar3.i();
                    p247y7.AbstractC7350t.c(dVarI8);
                    p042e1.i iVarH14 = dVarI8.h();
                    p247y7.AbstractC7350t.c(iVarH14);
                    dVar.i(iVarH13, iVarH14, i16, i17);
                } else {
                    eVarH = eVarH;
                    z15 = z15;
                    z14 = z14;
                }
                if (z12) {
                    if (r10.A0() != 8 && r10.N()[i14] == bVar2) {
                        p042e1.i iVarH15 = r10.M()[i10 + 1].h();
                        p247y7.AbstractC7350t.c(iVarH15);
                        p042e1.i iVarH16 = r10.M()[i10].h();
                        p247y7.AbstractC7350t.c(iVarH16);
                        dVar.l(iVarH15, iVarH16, 0, 5);
                    }
                    p042e1.i iVarH17 = r10.M()[i10].h();
                    p247y7.AbstractC7350t.c(iVarH17);
                    p042e1.i iVarH18 = fVar.M()[i10].h();
                    p247y7.AbstractC7350t.c(iVarH18);
                    dVar.l(iVarH17, iVarH18, 0, 8);
                }
                p122m1.d dVarI9 = r10.M()[i10 + 1].i();
                if (dVarI9 != null) {
                    p122m1.e eVarG = dVarI9.g();
                    if (eVarG.M()[i10].i() != null) {
                        p122m1.d dVarI10 = eVarG.M()[i10].i();
                        p247y7.AbstractC7350t.c(dVarI10);
                        if (p247y7.AbstractC7350t.b(dVarI10.g(), r10)) {
                            objH = eVarG;
                        }
                    }
                }
                if (objH != null) {
                    r10 = objH;
                    z15 = z15;
                } else {
                    z15 = true;
                }
            }
            p122m1.e eVar = eVarH;
            float f6 = fL;
            boolean z17 = z14;
            if (eVarK != null) {
                p247y7.AbstractC7350t.c(eVarI);
                int i18 = i10 + 1;
                if (eVarI.M()[i18].i() != null) {
                    p122m1.d dVar4 = eVarK.M()[i18];
                    if (eVarK.N()[i14] == m1.e.b.MATCH_CONSTRAINT && eVarK.a0()[i14] == 0 && !z11) {
                        p122m1.d dVarI11 = dVar4.i();
                        p247y7.AbstractC7350t.c(dVarI11);
                        if (p247y7.AbstractC7350t.b(dVarI11.g(), fVar)) {
                            p042e1.i iVarH19 = dVar4.h();
                            p247y7.AbstractC7350t.c(iVarH19);
                            p122m1.d dVarI12 = dVar4.i();
                            p247y7.AbstractC7350t.c(dVarI12);
                            p042e1.i iVarH20 = dVarI12.h();
                            p247y7.AbstractC7350t.c(iVarH20);
                            dVar.i(iVarH19, iVarH20, -dVar4.k(), 5);
                        } else if (z11) {
                            dVarI4 = dVar4.i();
                            p247y7.AbstractC7350t.c(dVarI4);
                            if (p247y7.AbstractC7350t.b(dVarI4.g(), fVar)) {
                                p042e1.i iVarH21 = dVar4.h();
                                p247y7.AbstractC7350t.c(iVarH21);
                                p122m1.d dVarI13 = dVar4.i();
                                p247y7.AbstractC7350t.c(dVarI13);
                                p042e1.i iVarH22 = dVarI13.h();
                                p247y7.AbstractC7350t.c(iVarH22);
                                dVar.i(iVarH21, iVarH22, -dVar4.k(), 4);
                            }
                        }
                    } else if (z11) {
                        dVarI4 = dVar4.i();
                        p247y7.AbstractC7350t.c(dVarI4);
                        if (p247y7.AbstractC7350t.b(dVarI4.g(), fVar)) {
                            p042e1.i iVarH23 = dVar4.h();
                            p247y7.AbstractC7350t.c(iVarH23);
                            p122m1.d dVarI14 = dVar4.i();
                            p247y7.AbstractC7350t.c(dVarI14);
                            p042e1.i iVarH24 = dVarI14.h();
                            p247y7.AbstractC7350t.c(iVarH24);
                            dVar.i(iVarH23, iVarH24, -dVar4.k(), 4);
                        }
                    }
                    p042e1.i iVarH25 = dVar4.h();
                    p247y7.AbstractC7350t.c(iVarH25);
                    p122m1.d dVarI15 = eVarI.M()[i18].i();
                    p247y7.AbstractC7350t.c(dVarI15);
                    p042e1.i iVarH26 = dVarI15.h();
                    p247y7.AbstractC7350t.c(iVarH26);
                    dVar.n(iVarH25, iVarH26, -dVar4.k(), 6);
                }
            }
            if (z12) {
                int i19 = i10 + 1;
                p042e1.i iVarH27 = fVar.M()[i19].h();
                p247y7.AbstractC7350t.c(iVarH27);
                p247y7.AbstractC7350t.c(eVarI);
                p042e1.i iVarH28 = eVarI.M()[i19].h();
                p247y7.AbstractC7350t.c(iVarH28);
                dVar.l(iVarH27, iVarH28, eVarI.M()[i19].k(), 8);
            }
            java.util.ArrayList arrayListM = cVar.m();
            if (arrayListM != null && (size = arrayListM.size()) > 1) {
                float fO = (!cVar.g() || cVar.f()) ? f6 : cVar.o();
                float f10 = 0.0f;
                float f11 = 0.0f;
                p122m1.e eVar2 = null;
                int i20 = 0;
                while (i20 < size) {
                    java.lang.Object obj = arrayListM.get(i20);
                    p247y7.AbstractC7350t.e(obj, "get(...)");
                    p122m1.e eVar3 = (p122m1.e) obj;
                    float f12 = eVar3.f0()[i14];
                    if (f12 < f10) {
                        if (cVar.f()) {
                            p042e1.i iVarH29 = eVar3.M()[i10 + 1].h();
                            p247y7.AbstractC7350t.c(iVarH29);
                            p042e1.i iVarH30 = eVar3.M()[i10].h();
                            p247y7.AbstractC7350t.c(iVarH30);
                            dVar.i(iVarH29, iVarH30, 0, 4);
                        } else {
                            f12 = 1.0f;
                        }
                        i20++;
                        f10 = 0.0f;
                    }
                    if (f12 == 0.0f) {
                        p042e1.i iVarH31 = eVar3.M()[i10 + 1].h();
                        p247y7.AbstractC7350t.c(iVarH31);
                        p042e1.i iVarH32 = eVar3.M()[i10].h();
                        p247y7.AbstractC7350t.c(iVarH32);
                        dVar.i(iVarH31, iVarH32, 0, 8);
                    } else {
                        if (eVar2 != null) {
                            p042e1.i iVarH33 = eVar2.M()[i10].h();
                            int i21 = i10 + 1;
                            p042e1.i iVarH34 = eVar2.M()[i21].h();
                            p042e1.i iVarH35 = eVar3.M()[i10].h();
                            p042e1.i iVarH36 = eVar3.M()[i21].h();
                            p042e1.b bVarV = dVar.v();
                            bVarV.l(f11, fO, f12, iVarH33, iVarH34, iVarH35, iVarH36);
                            dVar.h(bVarV);
                        }
                        f11 = f12;
                        eVar2 = eVar3;
                    }
                    i20++;
                    f10 = 0.0f;
                }
            }
            if (eVarE != null && (p247y7.AbstractC7350t.b(eVarE, eVarK) || z11)) {
                p247y7.AbstractC7350t.c(eVarC);
                p122m1.d dVar5 = eVarC.M()[i10];
                p247y7.AbstractC7350t.c(eVarI);
                int i22 = i10 + 1;
                p122m1.d dVar6 = eVarI.M()[i22];
                if (dVar5.i() != null) {
                    p122m1.d dVarI16 = dVar5.i();
                    p247y7.AbstractC7350t.c(dVarI16);
                    iVarH7 = dVarI16.h();
                } else {
                    iVarH7 = null;
                }
                if (dVar6.i() != null) {
                    p122m1.d dVarI17 = dVar6.i();
                    p247y7.AbstractC7350t.c(dVarI17);
                    iVarH8 = dVarI17.h();
                } else {
                    iVarH8 = null;
                }
                p122m1.d dVar7 = eVarE.M()[i10];
                if (eVarK != null) {
                    dVar6 = eVarK.M()[i22];
                }
                if (iVarH7 != null && iVarH8 != null) {
                    float fX = i14 == 0 ? eVar.x() : eVar.v0();
                    int iK3 = dVar7.k();
                    int iK4 = dVar6.k();
                    p042e1.i iVarH37 = dVar7.h();
                    p247y7.AbstractC7350t.c(iVarH37);
                    p042e1.i iVarH38 = dVar6.h();
                    p247y7.AbstractC7350t.c(iVarH38);
                    dVar.g(iVarH37, iVarH7, iK3, fX, iVarH8, iVarH38, iK4, 7);
                }
            } else if (!z17 || eVarE == null) {
                int i23 = 8;
                if (z13 && eVarE != null) {
                    boolean z18 = cVar.o() > 0 && cVar.n() == cVar.o();
                    p122m1.e eVar4 = eVarE;
                    p122m1.e eVar5 = eVar4;
                    while (eVar4 != null) {
                        p122m1.e eVar6 = eVar4.Z()[i14];
                        while (eVar6 != null && eVar6.A0() == i23) {
                            eVar6 = eVar6.Z()[i14];
                        }
                        if (p247y7.AbstractC7350t.b(eVar4, eVarE) || p247y7.AbstractC7350t.b(eVar4, eVarK) || eVar6 == null) {
                            i23 = i23;
                        } else {
                            p122m1.e eVar7 = p247y7.AbstractC7350t.b(eVar6, eVarK) ? null : eVar6;
                            p122m1.d dVar8 = eVar4.M()[i10];
                            p042e1.i iVarH39 = dVar8.h();
                            if (dVar8.i() != null) {
                                p122m1.d dVarI18 = dVar8.i();
                                p247y7.AbstractC7350t.c(dVarI18);
                                dVarI18.h();
                            }
                            int i24 = i10 + 1;
                            p042e1.i iVarH40 = eVar5.M()[i24].h();
                            int iK5 = dVar8.k();
                            int iK6 = eVar4.M()[i24].k();
                            if (eVar7 != null) {
                                dVar2 = eVar7.M()[i10];
                                iVarH = dVar2.h();
                                if (dVar2.i() != null) {
                                    dVarI = dVar2.i();
                                    p247y7.AbstractC7350t.c(dVarI);
                                } else {
                                    iVarH2 = null;
                                }
                                if (dVar2 != null) {
                                    iK6 += dVar2.k();
                                }
                                int i25 = iK6;
                                int iK7 = eVar5.M()[i24].k() + iK5;
                                if (z18) {
                                    i11 = i23;
                                } else {
                                    i11 = 4;
                                }
                                if (iVarH39 == null && iVarH40 != null && iVarH != null && iVarH2 != null) {
                                    dVar.g(iVarH39, iVarH40, iK7, 0.5f, iVarH, iVarH2, i25, i11);
                                }
                                eVar6 = eVar7;
                            } else {
                                p247y7.AbstractC7350t.c(eVarK);
                                dVar2 = eVarK.M()[i10];
                                iVarH = dVar2 != null ? dVar2.h() : null;
                                dVarI = eVar4.M()[i24];
                            }
                            iVarH2 = dVarI.h();
                            if (dVar2 != null) {
                                iK6 += dVar2.k();
                            }
                            int i26 = iK6;
                            int iK8 = eVar5.M()[i24].k() + iK5;
                            if (z18) {
                                i11 = i23;
                            } else {
                                i11 = 4;
                            }
                            if (iVarH39 == null) {
                            }
                            eVar6 = eVar7;
                        }
                        if (eVar4.A0() != i23) {
                            eVar5 = eVar4;
                        }
                        eVar4 = eVar6;
                        i23 = i23;
                        i14 = i6;
                    }
                    p122m1.d dVar9 = eVarE.M()[i10];
                    p247y7.AbstractC7350t.c(eVarC);
                    p122m1.d dVarI19 = eVarC.M()[i10].i();
                    p247y7.AbstractC7350t.c(eVarK);
                    int i27 = i10 + 1;
                    p122m1.d dVar10 = eVarK.M()[i27];
                    p247y7.AbstractC7350t.c(eVarI);
                    p122m1.d dVarI20 = eVarI.M()[i27].i();
                    if (dVarI19 != null) {
                        if (!p247y7.AbstractC7350t.b(eVarE, eVarK)) {
                            p042e1.i iVarH41 = dVar9.h();
                            p247y7.AbstractC7350t.c(iVarH41);
                            p042e1.i iVarH42 = dVarI19.h();
                            p247y7.AbstractC7350t.c(iVarH42);
                            dVar.i(iVarH41, iVarH42, dVar9.k(), 5);
                        } else if (dVarI20 != null) {
                            p042e1.i iVarH43 = dVar9.h();
                            p247y7.AbstractC7350t.c(iVarH43);
                            p042e1.i iVarH44 = dVarI19.h();
                            p247y7.AbstractC7350t.c(iVarH44);
                            int iK9 = dVar9.k();
                            p042e1.i iVarH45 = dVar10.h();
                            p247y7.AbstractC7350t.c(iVarH45);
                            p042e1.i iVarH46 = dVarI20.h();
                            p247y7.AbstractC7350t.c(iVarH46);
                            dVar.g(iVarH43, iVarH44, iK9, 0.5f, iVarH45, iVarH46, dVar10.k(), 5);
                        }
                    }
                    if (dVarI20 != null && !p247y7.AbstractC7350t.b(eVarE, eVarK)) {
                        p042e1.i iVarH47 = dVar10.h();
                        p247y7.AbstractC7350t.c(iVarH47);
                        p042e1.i iVarH48 = dVarI20.h();
                        p247y7.AbstractC7350t.c(iVarH48);
                        dVar.i(iVarH47, iVarH48, -dVar10.k(), 5);
                    }
                }
            } else {
                boolean z19 = cVar.o() > 0 && cVar.n() == cVar.o();
                p122m1.e eVar8 = eVarE;
                p122m1.e eVar9 = eVar8;
                while (eVar9 != null) {
                    p122m1.e eVar10 = eVar9.Z()[i14];
                    while (true) {
                        if (eVar10 == null) {
                            i12 = 8;
                            break;
                        }
                        i12 = 8;
                        if (eVar10.A0() != 8) {
                            break;
                        } else {
                            eVar10 = eVar10.Z()[i14];
                        }
                    }
                    if (eVar10 != null || p247y7.AbstractC7350t.b(eVar9, eVarK)) {
                        p122m1.d dVar11 = eVar9.M()[i10];
                        p042e1.i iVarH49 = dVar11.h();
                        if (dVar11.i() != null) {
                            p122m1.d dVarI21 = dVar11.i();
                            p247y7.AbstractC7350t.c(dVarI21);
                            iVarH3 = dVarI21.h();
                        } else {
                            iVarH3 = null;
                        }
                        if (p247y7.AbstractC7350t.b(eVar8, eVar9)) {
                            if (p247y7.AbstractC7350t.b(eVar9, eVarE)) {
                                p247y7.AbstractC7350t.c(eVarC);
                                if (eVarC.M()[i10].i() != null) {
                                    dVarI2 = eVarC.M()[i10].i();
                                    p247y7.AbstractC7350t.c(dVarI2);
                                } else {
                                    iVarH3 = null;
                                }
                            }
                            int iK10 = dVar11.k();
                            i13 = i10 + 1;
                            iK = eVar9.M()[i13].k();
                            if (eVar10 != null) {
                                dVarI3 = eVar10.M()[i10];
                            } else {
                                p247y7.AbstractC7350t.c(eVarI);
                                dVarI3 = eVarI.M()[i13].i();
                                if (dVarI3 != null) {
                                    iVarH4 = null;
                                }
                                p042e1.i iVarH50 = eVar9.M()[i13].h();
                                if (dVarI3 != null) {
                                    iK += dVarI3.k();
                                }
                                int iK11 = iK10 + eVar8.M()[i13].k();
                                if (iVarH49 == null && iVarH3 != null && iVarH4 != null && iVarH50 != null) {
                                    if (p247y7.AbstractC7350t.b(eVar9, eVarE)) {
                                        iK11 = eVarE.M()[i10].k();
                                    }
                                    dVar.g(iVarH49, iVarH3, iK11, 0.5f, iVarH4, iVarH50, p247y7.AbstractC7350t.b(eVar9, eVarK) ? eVarK.M()[i13].k() : iK, z19 ? i12 : 5);
                                }
                            }
                            iVarH4 = dVarI3.h();
                            p042e1.i iVarH51 = eVar9.M()[i13].h();
                            if (dVarI3 != null) {
                                iK += dVarI3.k();
                            }
                            int iK12 = iK10 + eVar8.M()[i13].k();
                            if (iVarH49 == null) {
                            }
                        } else {
                            dVarI2 = eVar8.M()[i10 + 1];
                        }
                        iVarH3 = dVarI2.h();
                        int iK13 = dVar11.k();
                        i13 = i10 + 1;
                        iK = eVar9.M()[i13].k();
                        if (eVar10 != null) {
                            dVarI3 = eVar10.M()[i10];
                        } else {
                            p247y7.AbstractC7350t.c(eVarI);
                            dVarI3 = eVarI.M()[i13].i();
                            if (dVarI3 != null) {
                                iVarH4 = null;
                            }
                            p042e1.i iVarH52 = eVar9.M()[i13].h();
                            if (dVarI3 != null) {
                                iK += dVarI3.k();
                            }
                            int iK14 = iK13 + eVar8.M()[i13].k();
                            if (iVarH49 == null) {
                            }
                        }
                        iVarH4 = dVarI3.h();
                        p042e1.i iVarH53 = eVar9.M()[i13].h();
                        if (dVarI3 != null) {
                            iK += dVarI3.k();
                        }
                        int iK15 = iK13 + eVar8.M()[i13].k();
                        if (iVarH49 == null) {
                        }
                    }
                    if (eVar9.A0() == 8) {
                        eVar9 = eVar8;
                    }
                    eVar8 = eVar9;
                    eVar9 = eVar10;
                }
            }
            if ((!z17 && !z13) || eVarE == null || p247y7.AbstractC7350t.b(eVarE, eVarK)) {
                return;
            }
            p122m1.d dVar12 = eVarE.M()[i10];
            if (eVarK == null) {
                eVarK = eVarE;
            }
            int i28 = i10 + 1;
            p122m1.d dVar13 = eVarK.M()[i28];
            if (dVar12.i() != null) {
                p122m1.d dVarI22 = dVar12.i();
                p247y7.AbstractC7350t.c(dVarI22);
                iVarH5 = dVarI22.h();
            } else {
                iVarH5 = null;
            }
            if (dVar13.i() != null) {
                p122m1.d dVarI23 = dVar13.i();
                p247y7.AbstractC7350t.c(dVarI23);
                iVarH6 = dVarI23.h();
            } else {
                iVarH6 = null;
            }
            if (p247y7.AbstractC7350t.b(eVarI, eVarK)) {
                r6 = iVarH6;
            } else {
                p247y7.AbstractC7350t.c(eVarI);
                p122m1.d dVar14 = eVarI.M()[i28];
                if (dVar14.i() != null) {
                    p122m1.d dVarI24 = dVar14.i();
                    p247y7.AbstractC7350t.c(dVarI24);
                    objH = dVarI24.h();
                }
                r6 = objH;
            }
            if (p247y7.AbstractC7350t.b(eVarE, eVarK)) {
                dVar12 = eVarE.M()[i10];
                dVar13 = eVarE.M()[i28];
            }
            if (iVarH5 == null || r6 == 0) {
                return;
            }
            int iK16 = dVar12.k();
            int iK17 = eVarK.M()[i28].k();
            p042e1.i iVarH54 = dVar12.h();
            p247y7.AbstractC7350t.c(iVarH54);
            p042e1.i iVarH55 = dVar13.h();
            p247y7.AbstractC7350t.c(iVarH55);
            dVar.g(iVarH54, iVarH5, iK16, 0.5f, r6, iVarH55, iK17, 5);
        }

        public final void b(p122m1.f fVar, p042e1.d dVar, java.util.ArrayList arrayList, int i6) {
            int iD2;
            p122m1.c[] cVarArrC2;
            int i10;
            p247y7.AbstractC7350t.f(fVar, "constraintWidgetContainer");
            if (i6 == 0) {
                iD2 = fVar.x2();
                cVarArrC2 = fVar.w2();
                i10 = 0;
            } else {
                iD2 = fVar.D2();
                cVarArrC2 = fVar.C2();
                i10 = 2;
            }
            for (int i11 = 0; i11 < iD2; i11++) {
                p122m1.c cVar = cVarArrC2[i11];
                p247y7.AbstractC7350t.c(cVar);
                cVar.a();
                if (arrayList == null || p097j7.AbstractC6879v.Z(arrayList, cVar.c())) {
                    p247y7.AbstractC7350t.c(dVar);
                    a(fVar, dVar, i6, i10, cVar);
                }
            }
        }
    }
}
