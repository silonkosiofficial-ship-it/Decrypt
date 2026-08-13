package p172r1;

/* JADX INFO: loaded from: classes.dex */
abstract class b {
    static void a(p172r1.f fVar, p162q1.d dVar, int i6) {
        int i10;
        p172r1.c[] cVarArr;
        int i11;
        if (i6 == 0) {
            i10 = fVar.f53725G0;
            cVarArr = fVar.f53728J0;
            i11 = 0;
        } else {
            i10 = fVar.f53726H0;
            cVarArr = fVar.f53727I0;
            i11 = 2;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            p172r1.c cVar = cVarArr[i12];
            cVar.a();
            b(fVar, dVar, i6, i11, cVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f A[PHI: r8 r15
  0x002f: PHI (r8v43 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r15v31 boolean) = (r15v1 boolean), (r15v33 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:172:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[PHI: r8 r15
  0x0031: PHI (r8v3 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r15v3 boolean) = (r15v1 boolean), (r15v33 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:188:0x030c  */
    /* JADX WARN: Code duplicated, block: B:189:0x031e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0326  */
    /* JADX WARN: Code duplicated, block: B:192:0x0329  */
    /* JADX WARN: Code duplicated, block: B:195:0x0333  */
    /* JADX WARN: Code duplicated, block: B:197:0x033a  */
    /* JADX WARN: Code duplicated, block: B:254:0x0402  */
    /* JADX WARN: Code duplicated, block: B:257:0x0414  */
    /* JADX WARN: Code duplicated, block: B:258:0x0417  */
    /* JADX WARN: Code duplicated, block: B:264:0x0437  */
    /* JADX WARN: Code duplicated, block: B:93:0x015b  */
    /* JADX WARN: Code duplicated, block: B:95:0x015e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0164  */
    /* JADX WARN: Code duplicated, block: B:99:0x0185  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r38v0, types: [q1.d] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [q1.i] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [r1.e] */
    static void b(p172r1.f fVar, p162q1.d dVar, int i6, int i10, p172r1.c cVar) {
        boolean z6;
        boolean z10;
        boolean z11;
        java.lang.Object obj;
        int i11;
        p172r1.d dVar2;
        p162q1.i iVar;
        p172r1.d dVar3;
        p162q1.i iVar2;
        int i12;
        p172r1.d dVar4;
        int iC;
        int i13;
        int iC2;
        p172r1.d dVar5;
        p162q1.i iVar3;
        p162q1.i iVar4;
        ?? r6;
        p162q1.i iVar5;
        int size;
        p172r1.d dVar6;
        int i14;
        p172r1.e eVar = cVar.f53598a;
        p172r1.e eVar2 = cVar.f53600c;
        p172r1.e eVar3 = cVar.f53599b;
        p172r1.e eVar4 = cVar.f53601d;
        p172r1.e eVar5 = cVar.f53602e;
        float f6 = cVar.f53608k;
        boolean z12 = fVar.f53651M[i6] == r1.e.b.WRAP_CONTENT;
        if (i6 == 0) {
            int i15 = eVar5.f53690m0;
            z6 = i15 == 0;
            z10 = i15 == 1;
            if (i15 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            int i16 = eVar5.f53692n0;
            z6 = i16 == 0;
            z10 = i16 == 1;
            if (i16 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        boolean z13 = z10;
        boolean z14 = false;
        boolean z15 = z6;
        ?? r10 = eVar;
        while (true) {
            obj = null;
            if (z14) {
                break;
            }
            p172r1.d dVar7 = r10.f53648J[i10];
            int i17 = z11 ? 1 : 4;
            int iC3 = dVar7.c();
            r1.e.b bVar = r10.f53651M[i6];
            float f10 = f6;
            r1.e.b bVar2 = r1.e.b.MATCH_CONSTRAINT;
            boolean z16 = bVar == bVar2 && r10.f53691n[i6] == 0;
            p172r1.d dVar8 = dVar7.f53623d;
            if (dVar8 != null && r10 != eVar) {
                iC3 += dVar8.c();
            }
            int i18 = iC3;
            if (z11 && r10 != eVar && r10 != eVar3) {
                i17 = 5;
            }
            p172r1.d dVar9 = dVar7.f53623d;
            p172r1.e eVar6 = eVar5;
            if (dVar9 != null) {
                if (r10 == eVar3) {
                    dVar.h(dVar7.f53626g, dVar9.f53626g, i18, 6);
                } else {
                    dVar.h(dVar7.f53626g, dVar9.f53626g, i18, 8);
                }
                dVar.e(dVar7.f53626g, dVar7.f53623d.f53626g, i18, (!z16 || z11) ? i17 : 5);
            } else {
                eVar = eVar;
            }
            if (z12) {
                if (r10.O() == 8 || r10.f53651M[i6] != bVar2) {
                    i14 = 0;
                } else {
                    p172r1.d[] dVarArr = r10.f53648J;
                    i14 = 0;
                    dVar.h(dVarArr[i10 + 1].f53626g, dVarArr[i10].f53626g, 0, 5);
                }
                dVar.h(r10.f53648J[i10].f53626g, fVar.f53648J[i10].f53626g, i14, 8);
            }
            p172r1.d dVar10 = r10.f53648J[i10 + 1].f53623d;
            if (dVar10 != null) {
                p172r1.e eVar7 = dVar10.f53621b;
                p172r1.d dVar11 = eVar7.f53648J[i10].f53623d;
                if (dVar11 != null && dVar11.f53621b == r10) {
                    obj = eVar7;
                }
            }
            if (obj != null) {
                r10 = obj;
                z14 = z14;
            } else {
                z14 = true;
            }
            z15 = z15;
            f6 = f10;
            eVar5 = eVar6;
            eVar = eVar;
            r10 = r10;
        }
        p172r1.e eVar8 = eVar5;
        float f11 = f6;
        p172r1.e eVar9 = eVar;
        boolean z17 = z15;
        if (eVar4 != null) {
            int i19 = i10 + 1;
            if (eVar2.f53648J[i19].f53623d != null) {
                p172r1.d dVar12 = eVar4.f53648J[i19];
                if (eVar4.f53651M[i6] == r1.e.b.MATCH_CONSTRAINT && eVar4.f53691n[i6] == 0 && !z11) {
                    p172r1.d dVar13 = dVar12.f53623d;
                    if (dVar13.f53621b == fVar) {
                        dVar.e(dVar12.f53626g, dVar13.f53626g, -dVar12.c(), 5);
                    } else if (z11) {
                        dVar6 = dVar12.f53623d;
                        if (dVar6.f53621b == fVar) {
                            dVar.e(dVar12.f53626g, dVar6.f53626g, -dVar12.c(), 4);
                        }
                    }
                } else if (z11) {
                    dVar6 = dVar12.f53623d;
                    if (dVar6.f53621b == fVar) {
                        dVar.e(dVar12.f53626g, dVar6.f53626g, -dVar12.c(), 4);
                    }
                }
                dVar.j(dVar12.f53626g, eVar2.f53648J[i19].f53623d.f53626g, -dVar12.c(), 6);
            }
        }
        if (z12) {
            int i20 = i10 + 1;
            p162q1.i iVar6 = fVar.f53648J[i20].f53626g;
            p172r1.d dVar14 = eVar2.f53648J[i20];
            dVar.h(iVar6, dVar14.f53626g, dVar14.c(), 8);
        }
        java.util.ArrayList arrayList = cVar.f53605h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f12 = (!cVar.f53615r || cVar.f53617t) ? f11 : cVar.f53607j;
            float f13 = 0.0f;
            float f14 = 0.0f;
            p172r1.e eVar10 = null;
            int i21 = 0;
            while (i21 < size) {
                p172r1.e eVar11 = (p172r1.e) arrayList.get(i21);
                float f15 = eVar11.f53698q0[i6];
                if (f15 < f13) {
                    if (cVar.f53617t) {
                        p172r1.d[] dVarArr2 = eVar11.f53648J;
                        dVar.e(dVarArr2[i10 + 1].f53626g, dVarArr2[i10].f53626g, 0, 4);
                    } else {
                        f15 = 1.0f;
                    }
                    arrayList = arrayList;
                    i21++;
                    arrayList = arrayList;
                    f13 = 0.0f;
                }
                if (f15 == f13) {
                    p172r1.d[] dVarArr3 = eVar11.f53648J;
                    dVar.e(dVarArr3[i10 + 1].f53626g, dVarArr3[i10].f53626g, 0, 8);
                    arrayList = arrayList;
                } else {
                    if (eVar10 != null) {
                        p172r1.d[] dVarArr4 = eVar10.f53648J;
                        p162q1.i iVar7 = dVarArr4[i10].f53626g;
                        int i22 = i10 + 1;
                        p162q1.i iVar8 = dVarArr4[i22].f53626g;
                        p172r1.d[] dVarArr5 = eVar11.f53648J;
                        p162q1.i iVar9 = dVarArr5[i10].f53626g;
                        p162q1.i iVar10 = dVarArr5[i22].f53626g;
                        p162q1.b bVarR = dVar.r();
                        bVarR.l(f14, f12, f15, iVar7, iVar8, iVar9, iVar10);
                        dVar.d(bVarR);
                    }
                    eVar10 = eVar11;
                    f14 = f15;
                }
                i21++;
                arrayList = arrayList;
                f13 = 0.0f;
            }
        }
        if (eVar3 != null && (eVar3 == eVar4 || z11)) {
            p172r1.d dVar15 = eVar9.f53648J[i10];
            int i23 = i10 + 1;
            p172r1.d dVar16 = eVar2.f53648J[i23];
            p172r1.d dVar17 = dVar15.f53623d;
            p162q1.i iVar11 = dVar17 != null ? dVar17.f53626g : null;
            p172r1.d dVar18 = dVar16.f53623d;
            p162q1.i iVar12 = dVar18 != null ? dVar18.f53626g : null;
            p172r1.d dVar19 = eVar3.f53648J[i10];
            p172r1.d dVar20 = eVar4.f53648J[i23];
            if (iVar11 != null && iVar12 != null) {
                dVar.c(dVar19.f53626g, iVar11, dVar19.c(), i6 == 0 ? eVar8.f53668b0 : eVar8.f53670c0, iVar12, dVar20.f53626g, dVar20.c(), 7);
            }
        } else if (!z17 || eVar3 == null) {
            int i24 = 8;
            if (z13 && eVar3 != null) {
                int i25 = cVar.f53607j;
                boolean z18 = i25 > 0 && cVar.f53606i == i25;
                p172r1.e eVar12 = eVar3;
                p172r1.e eVar13 = eVar12;
                while (eVar12 != null) {
                    p172r1.e eVar14 = eVar12.f53702s0[i6];
                    while (eVar14 != null && eVar14.O() == i24) {
                        eVar14 = eVar14.f53702s0[i6];
                    }
                    if (eVar12 == eVar3 || eVar12 == eVar4 || eVar14 == null) {
                        eVar13 = eVar13;
                        i11 = i24;
                    } else {
                        p172r1.e eVar15 = eVar14 == eVar4 ? null : eVar14;
                        p172r1.d dVar21 = eVar12.f53648J[i10];
                        p162q1.i iVar13 = dVar21.f53626g;
                        p172r1.d dVar22 = dVar21.f53623d;
                        if (dVar22 != null) {
                            p162q1.i iVar14 = dVar22.f53626g;
                        }
                        int i26 = i10 + 1;
                        p162q1.i iVar15 = eVar13.f53648J[i26].f53626g;
                        int iC4 = dVar21.c();
                        int iC5 = eVar12.f53648J[i26].c();
                        if (eVar15 != null) {
                            dVar2 = eVar15.f53648J[i10];
                            iVar = dVar2.f53626g;
                            dVar3 = dVar2.f53623d;
                            if (dVar3 == null) {
                                iVar2 = null;
                            }
                            if (dVar2 != null) {
                                iC5 += dVar2.c();
                            }
                            int i27 = iC5;
                            int iC6 = eVar13.f53648J[i26].c() + iC4;
                            if (z18) {
                                i12 = 8;
                            } else {
                                i12 = 4;
                            }
                            if (iVar13 != null || iVar15 == null || iVar == null || iVar2 == null) {
                                i11 = 8;
                            } else {
                                i11 = 8;
                                dVar.c(iVar13, iVar15, iC6, 0.5f, iVar, iVar2, i27, i12);
                            }
                            eVar14 = eVar15;
                        } else {
                            dVar2 = eVar4.f53648J[i10];
                            iVar = dVar2 != null ? dVar2.f53626g : null;
                            dVar3 = eVar12.f53648J[i26];
                        }
                        iVar2 = dVar3.f53626g;
                        if (dVar2 != null) {
                            iC5 += dVar2.c();
                        }
                        int i28 = iC5;
                        int iC7 = eVar13.f53648J[i26].c() + iC4;
                        if (z18) {
                            i12 = 8;
                        } else {
                            i12 = 4;
                        }
                        if (iVar13 != null) {
                            i11 = 8;
                        } else {
                            i11 = 8;
                        }
                        eVar14 = eVar15;
                    }
                    if (eVar12.O() == i11) {
                        eVar12 = eVar13;
                    }
                    i24 = i11;
                    eVar13 = eVar12;
                    eVar12 = eVar14;
                }
                p172r1.d dVar23 = eVar3.f53648J[i10];
                p172r1.d dVar24 = eVar9.f53648J[i10].f53623d;
                int i29 = i10 + 1;
                p172r1.d dVar25 = eVar4.f53648J[i29];
                p172r1.d dVar26 = eVar2.f53648J[i29].f53623d;
                if (dVar24 != null) {
                    if (eVar3 != eVar4) {
                        dVar.e(dVar23.f53626g, dVar24.f53626g, dVar23.c(), 5);
                    } else if (dVar26 != null) {
                        dVar.c(dVar23.f53626g, dVar24.f53626g, dVar23.c(), 0.5f, dVar25.f53626g, dVar26.f53626g, dVar25.c(), 5);
                    }
                }
                if (dVar26 != null && eVar3 != eVar4) {
                    dVar.e(dVar25.f53626g, dVar26.f53626g, -dVar25.c(), 5);
                }
            }
        } else {
            int i30 = cVar.f53607j;
            boolean z19 = i30 > 0 && cVar.f53606i == i30;
            p172r1.e eVar16 = eVar3;
            p172r1.e eVar17 = eVar16;
            while (eVar16 != null) {
                p172r1.e eVar18 = eVar16.f53702s0[i6];
                while (eVar18 != null && eVar18.O() == 8) {
                    eVar18 = eVar18.f53702s0[i6];
                }
                if (eVar18 != null || eVar16 == eVar4) {
                    p172r1.d dVar27 = eVar16.f53648J[i10];
                    p162q1.i iVar16 = dVar27.f53626g;
                    p172r1.d dVar28 = dVar27.f53623d;
                    p162q1.i iVar17 = dVar28 != null ? dVar28.f53626g : null;
                    if (eVar17 != eVar16) {
                        dVar4 = eVar17.f53648J[i10 + 1];
                    } else {
                        if (eVar16 == eVar3 && eVar17 == eVar16) {
                            dVar4 = eVar9.f53648J[i10].f53623d;
                            if (dVar4 == null) {
                                iVar17 = null;
                            }
                        }
                        iC = dVar27.c();
                        i13 = i10 + 1;
                        iC2 = eVar16.f53648J[i13].c();
                        if (eVar18 != null) {
                            dVar5 = eVar18.f53648J[i10];
                            p162q1.i iVar18 = dVar5.f53626g;
                            iVar4 = eVar16.f53648J[i13].f53626g;
                            iVar3 = iVar18;
                        } else {
                            dVar5 = eVar2.f53648J[i13].f53623d;
                            if (dVar5 != null) {
                                iVar3 = dVar5.f53626g;
                            } else {
                                iVar3 = null;
                            }
                            iVar4 = eVar16.f53648J[i13].f53626g;
                        }
                        if (dVar5 != null) {
                            iC2 += dVar5.c();
                        }
                        if (eVar17 != null) {
                            iC += eVar17.f53648J[i13].c();
                        }
                        if (iVar16 == null && iVar17 != null && iVar3 != null && iVar4 != null) {
                            if (eVar16 == eVar3) {
                                iC = eVar3.f53648J[i10].c();
                            }
                            dVar.c(iVar16, iVar17, iC, 0.5f, iVar3, iVar4, eVar16 == eVar4 ? eVar4.f53648J[i13].c() : iC2, z19 ? 8 : 5);
                        }
                    }
                    iVar17 = dVar4.f53626g;
                    iC = dVar27.c();
                    i13 = i10 + 1;
                    iC2 = eVar16.f53648J[i13].c();
                    if (eVar18 != null) {
                        dVar5 = eVar18.f53648J[i10];
                        p162q1.i iVar19 = dVar5.f53626g;
                        iVar4 = eVar16.f53648J[i13].f53626g;
                        iVar3 = iVar19;
                    } else {
                        dVar5 = eVar2.f53648J[i13].f53623d;
                        if (dVar5 != null) {
                            iVar3 = dVar5.f53626g;
                        } else {
                            iVar3 = null;
                        }
                        iVar4 = eVar16.f53648J[i13].f53626g;
                    }
                    if (dVar5 != null) {
                        iC2 += dVar5.c();
                    }
                    if (eVar17 != null) {
                        iC += eVar17.f53648J[i13].c();
                    }
                    if (iVar16 == null) {
                    }
                }
                if (eVar16.O() != 8) {
                    eVar17 = eVar16;
                }
                eVar16 = eVar18;
            }
        }
        if ((!z17 && !z13) || eVar3 == null || eVar3 == eVar4) {
            return;
        }
        p172r1.d[] dVarArr6 = eVar3.f53648J;
        p172r1.d dVar29 = dVarArr6[i10];
        int i31 = i10 + 1;
        p172r1.d dVar30 = eVar4.f53648J[i31];
        p172r1.d dVar31 = dVar29.f53623d;
        p162q1.i iVar20 = dVar31 != null ? dVar31.f53626g : null;
        p172r1.d dVar32 = dVar30.f53623d;
        if (dVar32 != null) {
            iVar5 = dVar32.f53626g;
        } else {
            r6 = 0;
        }
        if (eVar2 != eVar4) {
            p172r1.d dVar33 = eVar2.f53648J[i31].f53623d;
            if (dVar33 != null) {
                r6 = iVar5;
                obj = dVar33.f53626g;
            }
            r6 = iVar5;
            r6 = obj;
        }
        if (eVar3 == eVar4) {
            dVar30 = dVarArr6[i31];
        }
        if (iVar20 == null || r6 == 0) {
            return;
        }
        dVar.c(dVar29.f53626g, iVar20, dVar29.c(), 0.5f, r6, dVar30.f53626g, eVar4.f53648J[i31].c(), 5);
    }
}
