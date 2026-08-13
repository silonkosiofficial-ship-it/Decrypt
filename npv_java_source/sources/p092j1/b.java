package p092j1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1.b.a f49130a = new j1.b.a(null);

    public static final class a {

        /* JADX INFO: renamed from: j1.b$a$a, reason: collision with other inner class name */
        public static final class C0612a implements p092j1.b.InterfaceC0613b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private float f49131a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f49132b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private float f49133c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f49134d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private java.lang.String f49135e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private java.lang.String f49136f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private float f49137g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private float f49138h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private float f49139i;

            public C0612a(float f6, float f10, float f11, java.lang.String str, java.lang.String str2) {
                this.f49131a = f6;
                this.f49132b = f10;
                this.f49133c = f11;
                this.f49135e = str == null ? "" : str;
                this.f49136f = str2 == null ? "" : str2;
                this.f49139i = f10;
                this.f49138h = f6;
            }

            public final java.util.ArrayList a() {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i6 = (int) this.f49138h;
                int i10 = (int) this.f49139i;
                if (i6 <= i10) {
                    int i11 = i6;
                    while (true) {
                        arrayList.add(this.f49135e + i6 + this.f49136f);
                        i6 += (int) this.f49133c;
                        if (i11 == i10) {
                            break;
                        }
                        i11++;
                    }
                }
                return arrayList;
            }

            @Override // p092j1.b.InterfaceC0613b
            public float value() {
                float f6 = this.f49137g;
                if (f6 >= this.f49139i) {
                    this.f49134d = true;
                }
                if (!this.f49134d) {
                    this.f49137g = f6 + this.f49133c;
                }
                return this.f49137g;
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final int b(java.lang.String str, java.lang.String... strArr) {
            int length = strArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                if (p247y7.AbstractC7350t.b(strArr[i6], str)) {
                    return i6;
                }
            }
            return -1;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x006a  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private final void f(java.lang.String str, p092j1.g gVar, java.lang.String str2, j1.b.d dVar, p082i1.f fVar) throws p082i1.g {
            float fU;
            float fW;
            float f6;
            float fW2;
            float fW3;
            java.lang.String strE;
            p102k1.d dVarP = str.charAt(0) == 'h' ? gVar.p() : gVar.B();
            dVarP.A0(str2);
            for (java.lang.Object obj : fVar.j0()) {
                p247y7.AbstractC7350t.e(obj, "next(...)");
                java.lang.String str3 = (java.lang.String) obj;
                switch (str3.hashCode()) {
                    case -1383228885:
                        if (str3.equals("bottom")) {
                            break;
                        }
                        break;
                    case -567445985:
                        if (str3.equals("contains")) {
                            p082i1.c cVarR = fVar.R(str3);
                            if (cVarR instanceof p082i1.a) {
                                p082i1.a aVar = (p082i1.a) cVarR;
                                if (aVar.size() >= 1) {
                                    for (int i6 = 0; i6 < aVar.size(); i6++) {
                                        p082i1.c cVarQ = aVar.Q(i6);
                                        if (cVarQ instanceof p082i1.a) {
                                            p082i1.a aVar2 = (p082i1.a) cVarQ;
                                            if (aVar2.size() > 0) {
                                                java.lang.String strE2 = aVar2.Q(0).e();
                                                int size = aVar2.size();
                                                if (size != 2) {
                                                    if (size != 3) {
                                                        if (size == 4) {
                                                            float fU2 = aVar2.U(1);
                                                            float fW4 = w(gVar, aVar2.U(2));
                                                            fW2 = w(gVar, aVar2.U(3));
                                                            fU = fU2;
                                                            fW3 = fW4;
                                                        } else if (size != 6) {
                                                            fU = Float.NaN;
                                                        } else {
                                                            float fU3 = aVar2.U(1);
                                                            float fW5 = w(gVar, aVar2.U(2));
                                                            float fW6 = w(gVar, aVar2.U(3));
                                                            float fW7 = w(gVar, aVar2.U(4));
                                                            fW = w(gVar, aVar2.U(5));
                                                            fW3 = fW5;
                                                            fW2 = fW6;
                                                            f6 = fW7;
                                                            fU = fU3;
                                                        }
                                                        dVarP.Z0(strE2, fU, fW3, fW2, f6, fW);
                                                    } else {
                                                        float fU4 = aVar2.U(1);
                                                        fW3 = w(gVar, aVar2.U(2));
                                                        fW2 = fW3;
                                                        fU = fU4;
                                                    }
                                                    f6 = Float.NaN;
                                                    fW = Float.NaN;
                                                    dVarP.Z0(strE2, fU, fW3, fW2, f6, fW);
                                                } else {
                                                    fU = aVar2.U(1);
                                                }
                                                fW3 = Float.NaN;
                                                fW2 = Float.NaN;
                                                f6 = Float.NaN;
                                                fW = Float.NaN;
                                                dVarP.Z0(strE2, fU, fW3, fW2, f6, fW);
                                            }
                                        } else {
                                            dVarP.T0(cVarQ.e());
                                        }
                                    }
                                }
                            }
                            java.lang.System.out.println((java.lang.Object) (str2 + " contains should be an array \"" + cVarR.e() + "\""));
                            return;
                        }
                        continue;
                        break;
                    case 100571:
                        if (str3.equals("end")) {
                            break;
                        }
                        break;
                    case 115029:
                        if (str3.equals("top")) {
                            break;
                        }
                        break;
                    case 3317767:
                        if (str3.equals("left")) {
                            break;
                        }
                        break;
                    case 108511772:
                        if (str3.equals("right")) {
                            break;
                        }
                        break;
                    case 109757538:
                        if (str3.equals("start")) {
                            break;
                        }
                        break;
                    case 109780401:
                        if (str3.equals("style")) {
                            p082i1.c cVarR2 = fVar.R(str3);
                            if (cVarR2 instanceof p082i1.a) {
                                p082i1.a aVar3 = (p082i1.a) cVarR2;
                                if (aVar3.size() > 1) {
                                    strE = aVar3.e0(0);
                                    dVarP.a1(aVar3.U(1));
                                } else {
                                    strE = cVarR2.e();
                                }
                            } else {
                                strE = cVarR2.e();
                            }
                            dVarP.i1(p247y7.AbstractC7350t.b(strE, "packed") ? j1.g.a.PACKED : p247y7.AbstractC7350t.b(strE, "spread_inside") ? j1.g.a.SPREAD_INSIDE : j1.g.a.SPREAD);
                        } else {
                            continue;
                        }
                        break;
                    default:
                        continue;
                }
                h(gVar, dVar, fVar, dVarP, str3);
                dVarP = dVarP;
            }
        }

        /* JADX WARN: Code duplicated, block: B:112:0x0259  */
        /* JADX WARN: Code duplicated, block: B:155:0x0327  */
        /* JADX WARN: Code duplicated, block: B:176:0x0376  */
        /* JADX WARN: Code duplicated, block: B:75:0x01b9  */
        /* JADX WARN: Code duplicated, block: B:99:0x0211  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private final void l(java.lang.String str, p092j1.g gVar, java.lang.String str2, j1.b.d dVar, p082i1.f fVar) throws p082i1.g {
            java.lang.String strE;
            java.lang.String strE0;
            java.lang.String strE1;
            float fG;
            float fU;
            float fU2;
            java.lang.String strE2;
            java.lang.String strE3;
            java.lang.String strE4;
            int iO;
            int iX;
            int iX2;
            int iX3;
            float fG2;
            float fU3;
            float fU4;
            float fU5;
            float fW;
            float fW2;
            p102k1.f fVarI = gVar.i(str2, str.charAt(0) == 'v');
            for (java.lang.Object obj : fVar.j0()) {
                p247y7.AbstractC7350t.e(obj, "next(...)");
                java.lang.String str3 = (java.lang.String) obj;
                switch (str3.hashCode()) {
                    case -1254185091:
                        if (str3.equals("hAlign")) {
                            java.lang.String strE5 = fVar.R(str3).e();
                            if (p247y7.AbstractC7350t.b(strE5, "start")) {
                                p247y7.AbstractC7350t.c(fVarI);
                                fVarI.e1(0);
                            } else {
                                boolean zB = p247y7.AbstractC7350t.b(strE5, "end");
                                p247y7.AbstractC7350t.c(fVarI);
                                if (zB) {
                                    fVarI.e1(1);
                                } else {
                                    fVarI.e1(2);
                                }
                            }
                        } else {
                            p092j1.a aVarD = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD);
                            a(gVar, dVar, aVarD, fVar, str3);
                        }
                        break;
                    case -1237307863:
                        if (str3.equals("hStyle")) {
                            p082i1.c cVarR = fVar.R(str3);
                            if (cVarR instanceof p082i1.a) {
                                p082i1.a aVar = (p082i1.a) cVarR;
                                if (aVar.size() > 1) {
                                    strE0 = aVar.e0(0);
                                    strE = aVar.e0(1);
                                    strE1 = aVar.size() > 2 ? aVar.e0(2) : "";
                                } else {
                                    strE = cVarR.e();
                                    strE0 = "";
                                    strE1 = strE0;
                                }
                            } else {
                                strE = cVarR.e();
                                strE0 = "";
                                strE1 = strE0;
                            }
                            if (!p247y7.AbstractC7350t.b(strE, "")) {
                                p247y7.AbstractC7350t.c(fVarI);
                                fVarI.g1(j1.g.a.f49173C.a(strE));
                            }
                            if (!p247y7.AbstractC7350t.b(strE0, "")) {
                                p247y7.AbstractC7350t.c(fVarI);
                                fVarI.b1(j1.g.a.f49173C.a(strE0));
                            }
                            if (!p247y7.AbstractC7350t.b(strE1, "")) {
                                p247y7.AbstractC7350t.c(fVarI);
                                fVarI.i1(j1.g.a.f49173C.a(strE1));
                            }
                        } else {
                            p092j1.a aVarD2 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD2);
                            a(gVar, dVar, aVarD2, fVar, str3);
                        }
                        break;
                    case -1198076529:
                        if (str3.equals("hFlowBias")) {
                            p082i1.c cVarR2 = fVar.R(str3);
                            if (cVarR2 instanceof p082i1.a) {
                                p082i1.a aVar2 = (p082i1.a) cVarR2;
                                if (aVar2.size() > 1) {
                                    fU = aVar2.U(0);
                                    fG = aVar2.U(1);
                                    fU2 = aVar2.size() > 2 ? aVar2.U(2) : 0.5f;
                                } else {
                                    fG = cVarR2.g();
                                    fU = 0.5f;
                                    fU2 = 0.5f;
                                }
                            } else {
                                fG = cVarR2.g();
                                fU = 0.5f;
                                fU2 = 0.5f;
                            }
                            p247y7.AbstractC7350t.c(fVarI);
                            fVarI.e0(fG);
                            if (fU != 0.5f) {
                                fVarI.a1(fU);
                            }
                            if (fU2 != 0.5f) {
                                fVarI.h1(fU2);
                            }
                        } else {
                            p092j1.a aVarD3 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD3);
                            a(gVar, dVar, aVarD3, fVar, str3);
                        }
                        break;
                    case -853376977:
                        if (str3.equals("vAlign")) {
                            java.lang.String strE6 = fVar.R(str3).e();
                            int iHashCode = strE6.hashCode();
                            if (iHashCode != -1720785339) {
                                if (iHashCode != -1383228885) {
                                    if (iHashCode == 115029 && strE6.equals("top")) {
                                        p247y7.AbstractC7350t.c(fVarI);
                                        fVarI.r1(0);
                                    } else {
                                        p247y7.AbstractC7350t.c(fVarI);
                                        fVarI.r1(2);
                                    }
                                } else if (strE6.equals("bottom")) {
                                    p247y7.AbstractC7350t.c(fVarI);
                                    fVarI.r1(1);
                                } else {
                                    p247y7.AbstractC7350t.c(fVarI);
                                    fVarI.r1(2);
                                }
                            } else if (strE6.equals("baseline")) {
                                p247y7.AbstractC7350t.c(fVarI);
                                fVarI.r1(3);
                            } else {
                                p247y7.AbstractC7350t.c(fVarI);
                                fVarI.r1(2);
                            }
                        } else {
                            p092j1.a aVarD4 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD4);
                            a(gVar, dVar, aVarD4, fVar, str3);
                        }
                        break;
                    case -836499749:
                        if (str3.equals("vStyle")) {
                            p082i1.c cVarR3 = fVar.R(str3);
                            if (cVarR3 instanceof p082i1.a) {
                                p082i1.a aVar3 = (p082i1.a) cVarR3;
                                if (aVar3.size() > 1) {
                                    strE3 = aVar3.e0(0);
                                    strE2 = aVar3.e0(1);
                                    strE4 = aVar3.size() > 2 ? aVar3.e0(2) : "";
                                } else {
                                    strE2 = cVarR3.e();
                                    strE3 = "";
                                    strE4 = strE3;
                                }
                            } else {
                                strE2 = cVarR3.e();
                                strE3 = "";
                                strE4 = strE3;
                            }
                            if (!p247y7.AbstractC7350t.b(strE2, "")) {
                                p247y7.AbstractC7350t.c(fVarI);
                                fVarI.t1(j1.g.a.f49173C.a(strE2));
                            }
                            if (!p247y7.AbstractC7350t.b(strE3, "")) {
                                p247y7.AbstractC7350t.c(fVarI);
                                fVarI.d1(j1.g.a.f49173C.a(strE3));
                            }
                            if (!p247y7.AbstractC7350t.b(strE4, "")) {
                                p247y7.AbstractC7350t.c(fVarI);
                                fVarI.k1(j1.g.a.f49173C.a(strE4));
                            }
                        } else {
                            p092j1.a aVarD5 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD5);
                            a(gVar, dVar, aVarD5, fVar, str3);
                        }
                        break;
                    case -806339567:
                        if (str3.equals("padding")) {
                            p082i1.c cVarR4 = fVar.R(str3);
                            if (cVarR4 instanceof p082i1.a) {
                                p082i1.a aVar4 = (p082i1.a) cVarR4;
                                if (aVar4.size() > 1) {
                                    iO = aVar4.X(0);
                                    iX3 = aVar4.X(1);
                                    if (aVar4.size() > 2) {
                                        iX2 = aVar4.X(2);
                                        try {
                                            iX = ((p082i1.a) cVarR4).X(3);
                                        } catch (java.lang.IndexOutOfBoundsException unused) {
                                            iX = 0;
                                        }
                                    } else {
                                        iX2 = iO;
                                        iX = iX3;
                                    }
                                } else {
                                    iO = cVarR4.o();
                                    iX = iO;
                                    iX2 = iX;
                                    iX3 = iX2;
                                }
                            } else {
                                iO = cVarR4.o();
                                iX = iO;
                                iX2 = iX;
                                iX3 = iX2;
                            }
                            p247y7.AbstractC7350t.c(fVarI);
                            fVarI.o1(iO);
                            fVarI.q1(iX3);
                            fVarI.p1(iX2);
                            fVarI.n1(iX);
                        } else {
                            p092j1.a aVarD6 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD6);
                            a(gVar, dVar, aVarD6, fVar, str3);
                        }
                        break;
                    case -732635235:
                        if (str3.equals("vFlowBias")) {
                            p082i1.c cVarR5 = fVar.R(str3);
                            if (cVarR5 instanceof p082i1.a) {
                                p082i1.a aVar5 = (p082i1.a) cVarR5;
                                if (aVar5.size() > 1) {
                                    fU3 = aVar5.U(0);
                                    fG2 = aVar5.U(1);
                                    fU4 = aVar5.size() > 2 ? aVar5.U(2) : 0.5f;
                                } else {
                                    fG2 = cVarR5.g();
                                    fU3 = 0.5f;
                                    fU4 = 0.5f;
                                }
                            } else {
                                fG2 = cVarR5.g();
                                fU3 = 0.5f;
                                fU4 = 0.5f;
                            }
                            try {
                                p247y7.AbstractC7350t.c(fVarI);
                                fVarI.R0(fG2);
                                if (fU3 != 0.5f) {
                                    fVarI.c1(fU3);
                                }
                                if (fU4 != 0.5f) {
                                    fVarI.j1(fU4);
                                }
                            } catch (java.lang.NumberFormatException unused2) {
                            }
                        } else {
                            p092j1.a aVarD7 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD7);
                            a(gVar, dVar, aVarD7, fVar, str3);
                        }
                        break;
                    case -567445985:
                        if (str3.equals("contains")) {
                            p082i1.c cVarR6 = fVar.R(str3);
                            if (cVarR6 instanceof p082i1.a) {
                                p082i1.a aVar6 = (p082i1.a) cVarR6;
                                if (aVar6.size() >= 1) {
                                    for (int i6 = 0; i6 < aVar6.size(); i6++) {
                                        p082i1.c cVarQ = aVar6.Q(i6);
                                        if (cVarQ instanceof p082i1.a) {
                                            p082i1.a aVar7 = (p082i1.a) cVarQ;
                                            if (aVar7.size() > 0) {
                                                java.lang.String strE7 = aVar7.Q(0).e();
                                                int size = aVar7.size();
                                                if (size == 2) {
                                                    fU5 = aVar7.U(1);
                                                    fW = Float.NaN;
                                                    fW2 = Float.NaN;
                                                } else if (size == 3) {
                                                    fU5 = aVar7.U(1);
                                                    fW = w(gVar, aVar7.U(2));
                                                    fW2 = fW;
                                                } else if (size != 4) {
                                                    fW = Float.NaN;
                                                    fW2 = Float.NaN;
                                                    fU5 = Float.NaN;
                                                } else {
                                                    fU5 = aVar7.U(1);
                                                    fW2 = w(gVar, aVar7.U(2));
                                                    fW = w(gVar, aVar7.U(3));
                                                }
                                                p247y7.AbstractC7350t.c(fVarI);
                                                fVarI.Z0(strE7, fU5, fW2, fW);
                                            }
                                        } else {
                                            p247y7.AbstractC7350t.c(fVarI);
                                            fVarI.T0(cVarQ.e());
                                        }
                                    }
                                }
                            }
                            java.lang.System.out.println((java.lang.Object) (str2 + " contains should be an array \"" + cVarR6.e() + "\""));
                        } else {
                            p092j1.a aVarD8 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD8);
                            a(gVar, dVar, aVarD8, fVar, str3);
                        }
                        break;
                    case -488900360:
                        if (str3.equals("maxElement")) {
                            int iO2 = fVar.R(str3).o();
                            p247y7.AbstractC7350t.c(fVarI);
                            fVarI.l1(iO2);
                        } else {
                            p092j1.a aVarD9 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD9);
                            a(gVar, dVar, aVarD9, fVar, str3);
                        }
                        break;
                    case 3169614:
                        if (str3.equals("hGap")) {
                            int iO3 = fVar.R(str3).o();
                            p247y7.AbstractC7350t.c(fVarI);
                            fVarI.f1(iO3);
                        } else {
                            p092j1.a aVarD10 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD10);
                            a(gVar, dVar, aVarD10, fVar, str3);
                        }
                        break;
                    case 3575610:
                        if (str3.equals("type")) {
                            boolean zB2 = p247y7.AbstractC7350t.b(fVar.R(str3).e(), "hFlow");
                            p247y7.AbstractC7350t.c(fVarI);
                            if (zB2) {
                                fVarI.m1(0);
                            } else {
                                fVarI.m1(1);
                            }
                        } else {
                            p092j1.a aVarD11 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD11);
                            a(gVar, dVar, aVarD11, fVar, str3);
                        }
                        break;
                    case 3586688:
                        if (str3.equals("vGap")) {
                            int iO4 = fVar.R(str3).o();
                            p247y7.AbstractC7350t.c(fVarI);
                            fVarI.s1(iO4);
                        } else {
                            p092j1.a aVarD12 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD12);
                            a(gVar, dVar, aVarD12, fVar, str3);
                        }
                        break;
                    case 3657802:
                        if (str3.equals("wrap")) {
                            java.lang.String strE8 = fVar.R(str3).e();
                            p247y7.AbstractC7350t.c(fVarI);
                            fVarI.u1(p092j1.g.EnumC0615g.f49226C.a(strE8));
                        } else {
                            p092j1.a aVarD13 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD13);
                            a(gVar, dVar, aVarD13, fVar, str3);
                        }
                        break;
                    default:
                        p092j1.a aVarD14 = gVar.d(str2);
                        p247y7.AbstractC7350t.c(aVarD14);
                        a(gVar, dVar, aVarD14, fVar, str3);
                        break;
                }
                return;
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x01f8  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private final void n(java.lang.String str, p092j1.g gVar, java.lang.String str2, j1.b.d dVar, p082i1.f fVar) throws p082i1.g {
            int iO;
            int iX;
            int iX2;
            int iX3;
            p102k1.g gVarJ = gVar.j(str2, str);
            p247y7.AbstractC7350t.c(gVarJ);
            for (java.lang.String str3 : fVar.j0()) {
                switch (str3.hashCode()) {
                    case -1439500848:
                        if (str3.equals("orientation")) {
                            p247y7.AbstractC7350t.c(str3);
                            gVarJ.d1(fVar.R(str3).o());
                        } else {
                            p092j1.a aVarD = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD);
                            a(gVar, dVar, aVarD, fVar, str3);
                        }
                        break;
                    case -806339567:
                        if (str3.equals("padding")) {
                            p247y7.AbstractC7350t.c(str3);
                            p082i1.c cVarR = fVar.R(str3);
                            if (cVarR instanceof p082i1.a) {
                                p082i1.a aVar = (p082i1.a) cVarR;
                                if (aVar.size() > 1) {
                                    iO = aVar.X(0);
                                    iX3 = aVar.X(1);
                                    if (aVar.size() > 2) {
                                        iX2 = aVar.X(2);
                                        try {
                                            iX = ((p082i1.a) cVarR).X(3);
                                        } catch (java.lang.IndexOutOfBoundsException unused) {
                                            iX = 0;
                                        }
                                    } else {
                                        iX2 = iO;
                                        iX = iX3;
                                    }
                                } else {
                                    iO = cVarR.o();
                                    iX = iO;
                                    iX2 = iX;
                                    iX3 = iX2;
                                }
                            } else {
                                iO = cVarR.o();
                                iX = iO;
                                iX2 = iX;
                                iX3 = iX2;
                            }
                            gVarJ.g1(iO);
                            gVarJ.h1(iX3);
                            gVarJ.f1(iX2);
                            gVarJ.e1(iX);
                        } else {
                            p092j1.a aVarD2 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD2);
                            a(gVar, dVar, aVarD2, fVar, str3);
                        }
                        break;
                    case -567445985:
                        if (str3.equals("contains")) {
                            p082i1.a aVarT = fVar.T(str3);
                            if (aVarT != null) {
                                for (int i6 = 0; i6 < aVarT.size(); i6++) {
                                    p092j1.a aVarD3 = gVar.d(aVarT.Q(i6).e());
                                    p247y7.AbstractC7350t.c(aVarD3);
                                    gVarJ.T0(aVarD3);
                                }
                            }
                        } else {
                            p092j1.a aVarD4 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD4);
                            a(gVar, dVar, aVarD4, fVar, str3);
                        }
                        break;
                    case 3169614:
                        if (str3.equals("hGap")) {
                            p247y7.AbstractC7350t.c(str3);
                            gVarJ.c1(w(gVar, fVar.R(str3).g()));
                        } else {
                            p092j1.a aVarD5 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD5);
                            a(gVar, dVar, aVarD5, fVar, str3);
                        }
                        break;
                    case 3506649:
                        if (str3.equals("rows")) {
                            p247y7.AbstractC7350t.c(str3);
                            int iO2 = fVar.R(str3).o();
                            if (iO2 > 0) {
                                gVarJ.j1(iO2);
                            }
                        } else {
                            p092j1.a aVarD6 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD6);
                            a(gVar, dVar, aVarD6, fVar, str3);
                        }
                        break;
                    case 3586688:
                        if (str3.equals("vGap")) {
                            p247y7.AbstractC7350t.c(str3);
                            gVarJ.m1(w(gVar, fVar.R(str3).g()));
                        } else {
                            p092j1.a aVarD7 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD7);
                            a(gVar, dVar, aVarD7, fVar, str3);
                        }
                        break;
                    case 97513095:
                        if (str3.equals("flags")) {
                            p247y7.AbstractC7350t.c(str3);
                            java.lang.String strE = fVar.R(str3).e();
                            if (strE == null || strE.length() <= 0) {
                                p082i1.a aVarT2 = fVar.T(str3);
                                if (aVarT2 != null) {
                                    java.lang.String str4 = "";
                                    for (int i10 = 0; i10 < aVarT2.size(); i10++) {
                                        str4 = str4 + aVarT2.Q(i10).e();
                                        if (i10 != aVarT2.size() - 1) {
                                            str4 = str4 + "|";
                                        }
                                    }
                                    gVarJ.b1(str4);
                                }
                            } else {
                                gVarJ.b1(strE);
                            }
                        } else {
                            p092j1.a aVarD8 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD8);
                            a(gVar, dVar, aVarD8, fVar, str3);
                        }
                        break;
                    case 109497044:
                        if (str3.equals("skips")) {
                            p247y7.AbstractC7350t.c(str3);
                            java.lang.String strE2 = fVar.R(str3).e();
                            if (strE2 != null && S8.r.c0(strE2, ":", false, 2, null)) {
                                gVarJ.k1(strE2);
                            }
                        } else {
                            p092j1.a aVarD9 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD9);
                            a(gVar, dVar, aVarD9, fVar, str3);
                        }
                        break;
                    case 109638249:
                        if (str3.equals("spans")) {
                            p247y7.AbstractC7350t.c(str3);
                            java.lang.String strE3 = fVar.R(str3).e();
                            if (strE3 != null && S8.r.c0(strE3, ":", false, 2, null)) {
                                gVarJ.l1(strE3);
                            }
                        } else {
                            p092j1.a aVarD10 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD10);
                            a(gVar, dVar, aVarD10, fVar, str3);
                        }
                        break;
                    case 144441793:
                        if (str3.equals("rowWeights")) {
                            p247y7.AbstractC7350t.c(str3);
                            java.lang.String strE4 = fVar.R(str3).e();
                            if (strE4 != null && S8.r.c0(strE4, ",", false, 2, null)) {
                                gVarJ.i1(strE4);
                            }
                        } else {
                            p092j1.a aVarD11 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD11);
                            a(gVar, dVar, aVarD11, fVar, str3);
                        }
                        break;
                    case 949721053:
                        if (str3.equals("columns")) {
                            p247y7.AbstractC7350t.c(str3);
                            int iO3 = fVar.R(str3).o();
                            if (iO3 > 0) {
                                gVarJ.a1(iO3);
                            }
                        } else {
                            p092j1.a aVarD12 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD12);
                            a(gVar, dVar, aVarD12, fVar, str3);
                        }
                        break;
                    case 2033353925:
                        if (str3.equals("columnWeights")) {
                            p247y7.AbstractC7350t.c(str3);
                            java.lang.String strE5 = fVar.R(str3).e();
                            if (strE5 != null && S8.r.c0(strE5, ",", false, 2, null)) {
                                gVarJ.Z0(strE5);
                            }
                        } else {
                            p092j1.a aVarD13 = gVar.d(str2);
                            p247y7.AbstractC7350t.c(aVarD13);
                            a(gVar, dVar, aVarD13, fVar, str3);
                        }
                        break;
                    default:
                        p092j1.a aVarD14 = gVar.d(str2);
                        p247y7.AbstractC7350t.c(aVarD14);
                        a(gVar, dVar, aVarD14, fVar, str3);
                        break;
                }
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private final void r(p082i1.c cVar, p092j1.a aVar) throws p082i1.g {
            java.lang.String strF0;
            int i6;
            if (cVar instanceof p082i1.f) {
                p072h1.a aVar2 = new p072h1.a();
                p082i1.f fVar = (p082i1.f) cVar;
                for (java.lang.String str : fVar.j0()) {
                    switch (str.hashCode()) {
                        case -1897525331:
                            if (str.equals("stagger")) {
                                p247y7.AbstractC7350t.c(str);
                                aVar2.a(600, fVar.V(str));
                            } else {
                                continue;
                            }
                            break;
                        case -1310311125:
                            if (str.equals("easing")) {
                                p247y7.AbstractC7350t.c(str);
                                strF0 = fVar.f0(str);
                                i6 = 603;
                                break;
                            }
                            break;
                        case -1285003983:
                            if (str.equals("quantize")) {
                                p247y7.AbstractC7350t.c(str);
                                p082i1.c cVarR = fVar.R(str);
                                if (cVarR instanceof p082i1.a) {
                                    p082i1.a aVar3 = (p082i1.a) cVarR;
                                    int size = aVar3.size();
                                    if (size > 0) {
                                        aVar2.b(610, aVar3.X(0));
                                        if (size > 1) {
                                            aVar2.c(611, aVar3.e0(1));
                                            if (size > 2) {
                                                aVar2.a(602, aVar3.U(2));
                                            }
                                        }
                                    }
                                } else {
                                    aVar2.b(610, fVar.Y(str));
                                }
                            } else {
                                continue;
                            }
                            break;
                        case -791482387:
                            if (str.equals("pathArc")) {
                                p247y7.AbstractC7350t.c(str);
                                java.lang.String strF1 = fVar.f0(str);
                                int iB = b(strF1, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                                if (iB == -1) {
                                    java.lang.System.out.println((java.lang.Object) (cVar.s() + " pathArc = '" + strF1 + "'"));
                                    aVar.B0(aVar2);
                                }
                                aVar2.b(607, iB);
                            } else {
                                continue;
                            }
                            break;
                        case -236944793:
                            if (str.equals("relativeTo")) {
                                p247y7.AbstractC7350t.c(str);
                                strF0 = fVar.f0(str);
                                i6 = 605;
                                break;
                            }
                            break;
                        default:
                            continue;
                    }
                    aVar2.c(i6, strF0);
                }
                aVar.B0(aVar2);
            }
        }

        private final void s(p092j1.g gVar, j1.b.d dVar, p082i1.f fVar) throws p082i1.g {
            for (java.lang.String str : fVar.j0()) {
                p247y7.AbstractC7350t.c(str);
                p082i1.c cVarR = fVar.R(str);
                if (cVarR instanceof p082i1.e) {
                    dVar.e(str, cVarR.o());
                } else if (cVarR instanceof p082i1.f) {
                    p082i1.f fVar2 = (p082i1.f) cVarR;
                    if (fVar2.i0("from") && fVar2.i0("to")) {
                        dVar.d(str, dVar.a(fVar2.R("from")), dVar.a(fVar2.R("to")), 1.0f, fVar2.h0("prefix"), fVar2.h0("postfix"));
                    } else if (fVar2.i0("from") && fVar2.i0("step")) {
                        dVar.c(str, dVar.a(fVar2.R("from")), dVar.a(fVar2.R("step")));
                    } else if (fVar2.i0("ids")) {
                        p082i1.a aVarS = fVar2.S("ids");
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int size = aVarS.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            arrayList.add(aVarS.e0(i6));
                        }
                        dVar.f(str, arrayList);
                    } else if (fVar2.i0("tag")) {
                        java.util.ArrayList arrayListK = gVar.k(fVar2.f0("tag"));
                        p247y7.AbstractC7350t.c(arrayListK);
                        dVar.f(str, arrayListK);
                    }
                }
            }
        }

        private final float w(p092j1.g gVar, float f6) {
            p092j1.c cVarH = gVar.h();
            p247y7.AbstractC7350t.c(cVarH);
            return cVarH.a(f6);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void a(p092j1.g gVar, j1.b.d dVar, p092j1.a aVar, p082i1.f fVar, java.lang.String str) throws p082i1.g {
            p092j1.a aVarD;
            float fA;
            p247y7.AbstractC7350t.f(gVar, "state");
            p247y7.AbstractC7350t.f(dVar, "layoutVariables");
            p247y7.AbstractC7350t.f(aVar, "reference");
            p247y7.AbstractC7350t.f(fVar, "element");
            if (str != null) {
                switch (str.hashCode()) {
                    case -1448775240:
                        if (str.equals("centerVertically")) {
                            java.lang.Object objF0 = fVar.f0(str);
                            if (p247y7.AbstractC7350t.b(objF0, "parent")) {
                                objF0 = 0;
                            }
                            aVarD = gVar.d(objF0);
                            p247y7.AbstractC7350t.c(aVarD);
                            aVar.N0(aVarD);
                            aVar.o(aVarD);
                        }
                        break;
                    case -1364013995:
                        if (str.equals("center")) {
                            java.lang.Object objF1 = fVar.f0(str);
                            if (p247y7.AbstractC7350t.b(objF1, "parent")) {
                                objF1 = 0;
                            }
                            aVarD = gVar.d(objF1);
                            p247y7.AbstractC7350t.c(aVarD);
                            aVar.J0(aVarD);
                            aVar.y(aVarD);
                            aVar.N0(aVarD);
                            aVar.o(aVarD);
                        }
                        break;
                    case -1349088399:
                        if (str.equals("custom")) {
                            i(fVar, aVar, str);
                        }
                        break;
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            aVar.r0(dVar.a(fVar.R(str)));
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            aVar.s0(dVar.a(fVar.R(str)));
                        }
                        break;
                    case -1249320804:
                        if (str.equals("rotationZ")) {
                            aVar.t0(dVar.a(fVar.R(str)));
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            aVar.O0(w(gVar, dVar.a(fVar.R(str))));
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            aVar.P0(w(gVar, dVar.a(fVar.R(str))));
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            aVar.Q0(w(gVar, dVar.a(fVar.R(str))));
                        }
                        break;
                    case -1221029593:
                        if (str.equals("height")) {
                            p092j1.c cVarH = gVar.h();
                            p247y7.AbstractC7350t.c(cVarH);
                            aVar.x0(j(fVar, str, gVar, cVarH));
                        }
                        break;
                    case -1068318794:
                        if (str.equals("motion")) {
                            r(fVar.R(str), aVar);
                        }
                        break;
                    case -987906986:
                        if (str.equals("pivotX")) {
                            aVar.m0(dVar.a(fVar.R(str)));
                        }
                        break;
                    case -987906985:
                        if (str.equals("pivotY")) {
                            aVar.n0(dVar.a(fVar.R(str)));
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            aVar.u0(dVar.a(fVar.R(str)));
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            aVar.v0(dVar.a(fVar.R(str)));
                        }
                        break;
                    case -247669061:
                        if (str.equals("hRtlBias")) {
                            float fA2 = dVar.a(fVar.R(str));
                            if (gVar.s()) {
                                fA2 = 1.0f - fA2;
                            }
                            aVar.e0(fA2);
                        }
                        break;
                    case -61505906:
                        if (str.equals("vWeight")) {
                            aVar.E0(dVar.a(fVar.R(str)));
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            fA = dVar.a(fVar.R(str));
                            aVar.f(fA);
                        }
                        break;
                    case 98116417:
                        if (str.equals("hBias")) {
                            aVar.e0(dVar.a(fVar.R(str)));
                        }
                        break;
                    case 111045711:
                        if (str.equals("vBias")) {
                            aVar.R0(dVar.a(fVar.R(str)));
                        }
                        break;
                    case 113126854:
                        if (str.equals("width")) {
                            p092j1.c cVarH2 = gVar.h();
                            p247y7.AbstractC7350t.c(cVarH2);
                            aVar.G0(j(fVar, str, gVar, cVarH2));
                        }
                        break;
                    case 398344448:
                        if (str.equals("hWeight")) {
                            aVar.z0(dVar.a(fVar.R(str)));
                        }
                        break;
                    case 1404070310:
                        if (str.equals("centerHorizontally")) {
                            java.lang.Object objF2 = fVar.f0(str);
                            if (p247y7.AbstractC7350t.b(objF2, "parent")) {
                                objF2 = 0;
                            }
                            p092j1.a aVarD2 = gVar.d(objF2);
                            p247y7.AbstractC7350t.c(aVarD2);
                            aVar.J0(aVarD2);
                            aVar.y(aVarD2);
                        }
                        break;
                    case 1941332754:
                        if (str.equals("visibility")) {
                            java.lang.String strF0 = fVar.f0(str);
                            int iHashCode = strF0.hashCode();
                            if (iHashCode != -1901805651) {
                                if (iHashCode != 3178655) {
                                    if (iHashCode == 466743410 && strF0.equals("visible")) {
                                        aVar.S0(0);
                                    }
                                    break;
                                } else if (strF0.equals("gone")) {
                                    aVar.S0(8);
                                    break;
                                }
                            } else if (strF0.equals("invisible")) {
                                aVar.S0(4);
                                fA = 0.0f;
                                aVar.f(fA);
                                break;
                            }
                        }
                        break;
                }
            }
            h(gVar, dVar, fVar, aVar, str);
        }

        public final java.lang.String c(p082i1.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "element");
            for (java.lang.String str : fVar.j0()) {
                if (str.hashCode() == 3575610 && str.equals("type")) {
                    return fVar.f0("type");
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0092  */
        /* JADX WARN: Code duplicated, block: B:32:0x009b  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void d(p092j1.g gVar, java.lang.String str, p082i1.f fVar) throws p082i1.g {
            p082i1.a aVarT;
            j1.g.d dVar;
            p247y7.AbstractC7350t.f(gVar, "state");
            p247y7.AbstractC7350t.f(fVar, "element");
            boolean z6 = !gVar.s();
            p102k1.c cVarB = gVar.b(str, j1.g.d.END);
            for (java.lang.String str2 : fVar.j0()) {
                int iHashCode = str2.hashCode();
                if (iHashCode != -1081309778) {
                    if (iHashCode != -962590849) {
                        if (iHashCode == -567445985 && str2.equals("contains") && (aVarT = fVar.T(str2)) != null) {
                            for (int i6 = 0; i6 < aVarT.size(); i6++) {
                                p092j1.a aVarD = gVar.d(aVarT.Q(i6).e());
                                p247y7.AbstractC7350t.c(cVarB);
                                p247y7.AbstractC7350t.c(aVarD);
                                cVarB.T0(aVarD);
                            }
                        }
                    } else if (str2.equals("direction")) {
                        p247y7.AbstractC7350t.c(str2);
                        java.lang.String strF0 = fVar.f0(str2);
                        switch (strF0.hashCode()) {
                            case -1383228885:
                                if (strF0.equals("bottom")) {
                                    p247y7.AbstractC7350t.c(cVarB);
                                    dVar = j1.g.d.BOTTOM;
                                    cVarB.Z0(dVar);
                                }
                                break;
                            case 100571:
                                if (strF0.equals("end")) {
                                    if (z6) {
                                        p247y7.AbstractC7350t.c(cVarB);
                                        dVar = j1.g.d.RIGHT;
                                    } else {
                                        p247y7.AbstractC7350t.c(cVarB);
                                        dVar = j1.g.d.LEFT;
                                    }
                                    cVarB.Z0(dVar);
                                }
                                break;
                            case 115029:
                                if (strF0.equals("top")) {
                                    p247y7.AbstractC7350t.c(cVarB);
                                    dVar = j1.g.d.TOP;
                                    cVarB.Z0(dVar);
                                }
                                break;
                            case 3317767:
                                if (strF0.equals("left")) {
                                    p247y7.AbstractC7350t.c(cVarB);
                                    dVar = j1.g.d.LEFT;
                                    cVarB.Z0(dVar);
                                }
                                break;
                            case 108511772:
                                if (strF0.equals("right")) {
                                    p247y7.AbstractC7350t.c(cVarB);
                                    dVar = j1.g.d.RIGHT;
                                    cVarB.Z0(dVar);
                                }
                                break;
                            case 109757538:
                                if (strF0.equals("start")) {
                                    if (z6) {
                                        p247y7.AbstractC7350t.c(cVarB);
                                        dVar = j1.g.d.LEFT;
                                    } else {
                                        p247y7.AbstractC7350t.c(cVarB);
                                        dVar = j1.g.d.RIGHT;
                                    }
                                    cVarB.Z0(dVar);
                                }
                                break;
                        }
                    }
                } else if (str2.equals("margin")) {
                    float fW = fVar.W(str2);
                    if (!java.lang.Float.isNaN(fW)) {
                        p247y7.AbstractC7350t.c(cVarB);
                        cVarB.j0(java.lang.Float.valueOf(w(gVar, fW)));
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x009f  */
        public final void e(int i6, p092j1.g gVar, j1.b.d dVar, p082i1.a aVar) throws p082i1.g {
            java.lang.String strE;
            p247y7.AbstractC7350t.f(gVar, "state");
            p247y7.AbstractC7350t.f(dVar, "margins");
            p247y7.AbstractC7350t.f(aVar, "helper");
            p102k1.d dVarP = i6 == 0 ? gVar.p() : gVar.B();
            p082i1.c cVarQ = aVar.Q(1);
            if (cVarQ instanceof p082i1.a) {
                p082i1.a aVar2 = (p082i1.a) cVarQ;
                if (aVar2.size() < 1) {
                    return;
                }
                int size = aVar2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    dVarP.T0(aVar2.e0(i10));
                }
                if (aVar.size() > 2) {
                    p082i1.c cVarQ2 = aVar.Q(2);
                    p082i1.f fVar = cVarQ2 instanceof p082i1.f ? (p082i1.f) cVarQ2 : null;
                    if (fVar == null) {
                        return;
                    }
                    for (java.lang.String str : fVar.j0()) {
                        if (str.hashCode() == 109780401 && str.equals("style")) {
                            p247y7.AbstractC7350t.c(str);
                            p082i1.c cVarR = fVar.R(str);
                            if (cVarR instanceof p082i1.a) {
                                p082i1.a aVar3 = (p082i1.a) cVarR;
                                if (aVar3.size() > 1) {
                                    strE = aVar3.e0(0);
                                    dVarP.a1(aVar3.U(1));
                                } else {
                                    strE = cVarR.e();
                                }
                            } else {
                                strE = cVarR.e();
                            }
                            dVarP.i1(p247y7.AbstractC7350t.b(strE, "packed") ? j1.g.a.PACKED : p247y7.AbstractC7350t.b(strE, "spread_inside") ? j1.g.a.SPREAD_INSIDE : j1.g.a.SPREAD);
                        } else {
                            p247y7.AbstractC7350t.d(dVarP, "null cannot be cast to non-null type androidx.constraintlayout.core.state.ConstraintReference");
                            h(gVar, dVar, fVar, dVarP, str);
                        }
                    }
                }
            }
        }

        public final long g(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "value");
            if (!S8.r.V(str, "#", false, 2, null)) {
                return -1L;
            }
            java.lang.String strSubstring = str.substring(1);
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            if (strSubstring.length() == 6) {
                strSubstring = "FF" + strSubstring;
            }
            return java.lang.Long.parseLong(strSubstring, S8.AbstractC1628a.a(16));
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:117:0x021b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:118:0x021d  */
        /* JADX WARN: Code duplicated, block: B:121:0x0225  */
        /* JADX WARN: Code duplicated, block: B:124:0x022c  */
        /* JADX WARN: Code duplicated, block: B:125:0x022f  */
        /* JADX WARN: Code duplicated, block: B:128:0x0236  */
        /* JADX WARN: Code duplicated, block: B:129:0x0238  */
        /* JADX WARN: Code duplicated, block: B:130:0x023c  */
        /* JADX WARN: Code duplicated, block: B:131:0x023e  */
        /* JADX WARN: Code duplicated, block: B:134:0x0245  */
        /* JADX WARN: Code duplicated, block: B:137:0x024c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:138:0x024e  */
        /* JADX WARN: Code duplicated, block: B:139:0x0252  */
        /* JADX WARN: Code duplicated, block: B:140:0x0256 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:141:0x0258  */
        /* JADX WARN: Code duplicated, block: B:142:0x025c  */
        /* JADX WARN: Code restructure failed: missing block: B:157:0x0298, code lost:
        
            if (r7 != false) goto L158;
         */
        /* JADX WARN: Code restructure failed: missing block: B:158:0x029a, code lost:
        
            p247y7.AbstractC7350t.c(r2);
            r27.g0(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:159:0x02a1, code lost:
        
            p247y7.AbstractC7350t.c(r2);
            r27.q0(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:167:0x02bd, code lost:
        
            if (r7 != false) goto L159;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:20:0x00a0. Please report as an issue. */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(p092j1.g r24, j1.b.d r25, p082i1.f r26, p092j1.a r27, java.lang.String r28) throws p082i1.g {
            /*
                Method dump skipped, instruction units count: 826
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j1.b.a.h(j1.g, j1.b$d, i1.f, j1.a, java.lang.String):void");
        }

        public final void i(p082i1.f fVar, p092j1.a aVar, java.lang.String str) throws p082i1.g {
            p247y7.AbstractC7350t.f(fVar, "element");
            p247y7.AbstractC7350t.f(aVar, "reference");
            p082i1.f fVarB0 = fVar.b0(str);
            if (fVarB0 == null) {
                return;
            }
            for (java.lang.String str2 : fVarB0.j0()) {
                p247y7.AbstractC7350t.c(str2);
                p082i1.c cVarR = fVarB0.R(str2);
                if (cVarR instanceof p082i1.e) {
                    aVar.e(str2, cVarR.g());
                } else if (cVarR instanceof p082i1.h) {
                    long jG = g(cVarR.e());
                    if (jG != -1) {
                        aVar.d(str2, (int) jG);
                    }
                }
            }
        }

        public final p092j1.d j(p082i1.f fVar, java.lang.String str, p092j1.g gVar, p092j1.c cVar) throws p082i1.g {
            p247y7.AbstractC7350t.f(fVar, "element");
            p247y7.AbstractC7350t.f(gVar, "state");
            p247y7.AbstractC7350t.f(cVar, "dpToPixels");
            p247y7.AbstractC7350t.c(str);
            p082i1.c cVarR = fVar.R(str);
            j1.d.a aVar = p092j1.d.f49147i;
            p092j1.d dVarA = aVar.a(0);
            if (cVarR instanceof p082i1.h) {
                return k(cVarR.e());
            }
            if (cVarR instanceof p082i1.e) {
                return aVar.a(gVar.e(java.lang.Float.valueOf(cVar.a(fVar.V(str)))));
            }
            if (!(cVarR instanceof p082i1.f)) {
                return dVarA;
            }
            p082i1.f fVar2 = (p082i1.f) cVarR;
            java.lang.String strH0 = fVar2.h0("value");
            if (strH0 != null) {
                dVarA = k(strH0);
            }
            p082i1.c cVarD0 = fVar2.d0("min");
            if (cVarD0 != null) {
                if (cVarD0 instanceof p082i1.e) {
                    dVarA.g(gVar.e(java.lang.Float.valueOf(cVar.a(((p082i1.e) cVarD0).g()))));
                } else if (cVarD0 instanceof p082i1.h) {
                    dVarA.h("WRAP_DIMENSION");
                }
            }
            p082i1.c cVarD1 = fVar2.d0("max");
            if (cVarD1 == null) {
                return dVarA;
            }
            if (cVarD1 instanceof p082i1.e) {
                dVarA.e(gVar.e(java.lang.Float.valueOf(cVar.a(((p082i1.e) cVarD1).g()))));
                return dVarA;
            }
            if (!(cVarD1 instanceof p082i1.h)) {
                return dVarA;
            }
            dVarA.f("WRAP_DIMENSION");
            return dVarA;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final p092j1.d k(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "dimensionString");
            j1.d.a aVar = p092j1.d.f49147i;
            p092j1.d dVarA = aVar.a(0);
            switch (str.hashCode()) {
                case -1460244870:
                    if (str.equals("preferWrap")) {
                        return aVar.f("WRAP_DIMENSION");
                    }
                    break;
                case -995424086:
                    if (str.equals("parent")) {
                        return aVar.c();
                    }
                    break;
                case -895684237:
                    if (str.equals("spread")) {
                        return aVar.f("SPREAD_DIMENSION");
                    }
                    break;
                case 3657802:
                    if (str.equals("wrap")) {
                        return aVar.g();
                    }
                    break;
            }
            if (!S8.r.J(str, "%", false, 2, null)) {
                return S8.r.c0(str, ":", false, 2, null) ? aVar.e(str).l("SPREAD_DIMENSION") : dVarA;
            }
            java.lang.String strSubstring = str.substring(0, S8.r.o0(str, '%', 0, false, 6, null));
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            return aVar.d(0, java.lang.Float.parseFloat(strSubstring) / 100.0f).k(0);
        }

        public final void m(p092j1.g gVar, j1.b.d dVar, p082i1.f fVar) throws p082i1.g {
            p247y7.AbstractC7350t.f(gVar, "state");
            p247y7.AbstractC7350t.f(dVar, "layoutVariables");
            p247y7.AbstractC7350t.f(fVar, "json");
            for (java.lang.String str : fVar.j0()) {
                p247y7.AbstractC7350t.c(str);
                p082i1.c cVarR = fVar.R(str);
                java.util.ArrayList arrayListB = dVar.b(str);
                if (arrayListB != null && (cVarR instanceof p082i1.f)) {
                    java.util.Iterator it = arrayListB.iterator();
                    while (it.hasNext()) {
                        u(gVar, dVar, (java.lang.String) it.next(), (p082i1.f) cVarR);
                    }
                }
            }
        }

        public final void o(int i6, p092j1.g gVar, p082i1.a aVar) throws p082i1.g {
            java.lang.String strH0;
            p247y7.AbstractC7350t.f(gVar, "state");
            p247y7.AbstractC7350t.f(aVar, "helper");
            p082i1.c cVarQ = aVar.Q(1);
            p082i1.f fVar = cVarQ instanceof p082i1.f ? (p082i1.f) cVarQ : null;
            if (fVar == null || (strH0 = fVar.h0("id")) == null) {
                return;
            }
            p(i6, gVar, strH0, fVar);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void p(int i6, p092j1.g gVar, java.lang.String str, p082i1.f fVar) throws p082i1.g {
            p247y7.AbstractC7350t.f(gVar, "state");
            p247y7.AbstractC7350t.f(fVar, "params");
            java.util.ArrayList<java.lang.String> arrayListJ0 = fVar.j0();
            p092j1.a aVarD = gVar.d(str);
            if (i6 == 0) {
                gVar.q(str);
            } else {
                gVar.C(str);
            }
            boolean z6 = !gVar.s() || i6 == 0;
            p247y7.AbstractC7350t.c(aVarD);
            p102k1.e eVarC = aVarD.c();
            p247y7.AbstractC7350t.c(eVarC);
            p102k1.h hVar = (p102k1.h) eVarC;
            float fV = 0.0f;
            boolean z10 = true;
            boolean z11 = false;
            for (java.lang.String str2 : arrayListJ0) {
                switch (str2.hashCode()) {
                    case -678927291:
                        if (str2.equals("percent")) {
                            p082i1.a aVarT = fVar.T(str2);
                            if (aVarT == null) {
                                p247y7.AbstractC7350t.c(str2);
                                fV = fVar.V(str2);
                                z11 = true;
                                z10 = true;
                            } else {
                                if (aVarT.size() > 1) {
                                    java.lang.String strE0 = aVarT.e0(0);
                                    float fU = aVarT.U(1);
                                    switch (strE0.hashCode()) {
                                        case 100571:
                                            if (strE0.equals("end")) {
                                                z10 = !z6;
                                            }
                                            fV = fU;
                                            break;
                                        case 3317767:
                                            if (strE0.equals("left")) {
                                                z10 = true;
                                                fV = fU;
                                                z11 = true;
                                            } else {
                                                fV = fU;
                                            }
                                            break;
                                        case 108511772:
                                            if (strE0.equals("right")) {
                                                fV = fU;
                                                z10 = false;
                                            } else {
                                                fV = fU;
                                            }
                                            break;
                                        case 109757538:
                                            if (strE0.equals("start")) {
                                                z10 = z6;
                                            }
                                            fV = fU;
                                            break;
                                        default:
                                            fV = fU;
                                            break;
                                    }
                                }
                                z11 = true;
                            }
                        }
                        break;
                    case 100571:
                        if (str2.equals("end")) {
                            p247y7.AbstractC7350t.c(str2);
                            fV = w(gVar, fVar.V(str2));
                            z10 = !z6;
                        }
                        break;
                    case 3317767:
                        if (str2.equals("left")) {
                            p247y7.AbstractC7350t.c(str2);
                            fV = w(gVar, fVar.V(str2));
                            z10 = true;
                        }
                        break;
                    case 108511772:
                        if (str2.equals("right")) {
                            p247y7.AbstractC7350t.c(str2);
                            fV = w(gVar, fVar.V(str2));
                            z10 = false;
                        }
                        break;
                    case 109757538:
                        if (str2.equals("start")) {
                            p247y7.AbstractC7350t.c(str2);
                            fV = w(gVar, fVar.V(str2));
                            z10 = z6;
                        }
                        break;
                }
            }
            if (z11) {
                if (z10) {
                    hVar.e(fV);
                    return;
                } else {
                    hVar.e(1.0f - fV);
                    return;
                }
            }
            java.lang.Float fValueOf = java.lang.Float.valueOf(fV);
            if (z10) {
                hVar.h(fValueOf);
            } else {
                hVar.d(fValueOf);
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void q(p092j1.g gVar, j1.b.d dVar, p082i1.a aVar) throws p082i1.g {
            p247y7.AbstractC7350t.f(gVar, "state");
            p247y7.AbstractC7350t.f(dVar, "layoutVariables");
            p247y7.AbstractC7350t.f(aVar, "element");
            int size = aVar.size();
            for (int i6 = 0; i6 < size; i6++) {
                p082i1.c cVarQ = aVar.Q(i6);
                if (cVarQ instanceof p082i1.a) {
                    p082i1.a aVar2 = (p082i1.a) cVarQ;
                    if (aVar2.size() > 1) {
                        java.lang.String strE0 = aVar2.e0(0);
                        switch (strE0.hashCode()) {
                            case -1785507558:
                                if (strE0.equals("vGuideline")) {
                                    o(1, gVar, aVar2);
                                }
                                break;
                            case -1252464839:
                                if (strE0.equals("hChain")) {
                                    e(0, gVar, dVar, aVar2);
                                }
                                break;
                            case -851656725:
                                if (strE0.equals("vChain")) {
                                    e(1, gVar, dVar, aVar2);
                                }
                                break;
                            case 965681512:
                                if (strE0.equals("hGuideline")) {
                                    o(0, gVar, aVar2);
                                }
                                break;
                        }
                    }
                }
            }
        }

        public final void t(p092j1.g gVar, j1.b.d dVar, p092j1.a aVar, p082i1.f fVar) throws p082i1.g {
            p247y7.AbstractC7350t.f(aVar, "reference");
            p247y7.AbstractC7350t.f(fVar, "element");
            if (aVar.d0() == null) {
                aVar.G0(p092j1.d.f49147i.g());
            }
            if (aVar.B() == null) {
                aVar.x0(p092j1.d.f49147i.g());
            }
            for (java.lang.String str : fVar.j0()) {
                p247y7.AbstractC7350t.c(gVar);
                p247y7.AbstractC7350t.c(dVar);
                a(gVar, dVar, aVar, fVar, str);
            }
        }

        public final void u(p092j1.g gVar, j1.b.d dVar, java.lang.String str, p082i1.f fVar) throws p082i1.g {
            p247y7.AbstractC7350t.f(gVar, "state");
            p247y7.AbstractC7350t.f(fVar, "element");
            p092j1.a aVarD = gVar.d(str);
            p247y7.AbstractC7350t.c(aVarD);
            t(gVar, dVar, aVarD, fVar);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x00a6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:101:0x00a6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:102:0x00f7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:103:0x00f7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:104:0x00cc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:105:0x00e5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:106:0x00e5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:107:0x00f7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:108:0x0109 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:109:0x007c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:110:0x0114 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:111:0x0073 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:121:0x0017 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:124:0x0017 A[DONT_GENERATE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:125:0x0017 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:127:0x0017 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:129:0x0017 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:130:0x0017 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:132:0x0017 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:133:0x0017 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:135:0x0017 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:137:0x0017 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:138:0x0017 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:139:0x0017 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x0110 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x010b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x0084 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x0092 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x009c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x00ae A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x00b8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x00c2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x00d1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:96:0x00db A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:97:0x00ed A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:98:0x00ff A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:99:0x008d A[SYNTHETIC] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void v(p082i1.f fVar, p092j1.g gVar, j1.b.d dVar) {
            p082i1.f fVar2;
            java.lang.String strC;
            int i6;
            p247y7.AbstractC7350t.f(fVar, "parsedJson");
            p247y7.AbstractC7350t.f(gVar, "state");
            p247y7.AbstractC7350t.f(dVar, "layoutVariables");
            for (java.lang.Object obj : fVar.j0()) {
                p247y7.AbstractC7350t.e(obj, "next(...)");
                java.lang.String str = (java.lang.String) obj;
                p082i1.c cVarR = fVar.R(str);
                int iHashCode = str.hashCode();
                if (iHashCode != -1824489883) {
                    if (iHashCode != 1875016085) {
                        if (iHashCode == 1921490263 && str.equals("Variables")) {
                            if (cVarR instanceof p082i1.f) {
                                s(gVar, dVar, (p082i1.f) cVarR);
                            }
                        } else if (cVarR instanceof p082i1.f) {
                            fVar2 = (p082i1.f) cVarR;
                            strC = c(fVar2);
                            if (strC != null) {
                                switch (strC.hashCode()) {
                                    case -1785507558:
                                        if (strC.equals("vGuideline")) {
                                            i6 = 1;
                                            p(i6, gVar, str, fVar2);
                                        }
                                        break;
                                    case -1354837162:
                                        if (strC.equals("column")) {
                                            n(strC, gVar, str, dVar, fVar2);
                                        }
                                        break;
                                    case -1252464839:
                                        if (strC.equals("hChain")) {
                                            f(strC, gVar, str, dVar, fVar2);
                                        }
                                        break;
                                    case -851656725:
                                        if (strC.equals("vChain")) {
                                            f(strC, gVar, str, dVar, fVar2);
                                        }
                                        break;
                                    case -333143113:
                                        if (strC.equals("barrier")) {
                                            d(gVar, str, fVar2);
                                        }
                                        break;
                                    case 113114:
                                        if (strC.equals("row")) {
                                            n(strC, gVar, str, dVar, fVar2);
                                        }
                                        break;
                                    case 3181382:
                                        if (strC.equals("grid")) {
                                            n(strC, gVar, str, dVar, fVar2);
                                        }
                                        break;
                                    case 98238902:
                                        if (strC.equals("hFlow")) {
                                            l(strC, gVar, str, dVar, fVar2);
                                        }
                                        break;
                                    case 111168196:
                                        if (strC.equals("vFlow")) {
                                            l(strC, gVar, str, dVar, fVar2);
                                        }
                                        break;
                                    case 965681512:
                                        if (strC.equals("hGuideline")) {
                                            i6 = 0;
                                            p(i6, gVar, str, fVar2);
                                        }
                                        break;
                                }
                            } else {
                                u(gVar, dVar, str, fVar2);
                            }
                        } else if (cVarR instanceof p082i1.e) {
                            dVar.e(str, cVarR.o());
                        }
                    } else if (str.equals("Generate")) {
                        if (cVarR instanceof p082i1.f) {
                            m(gVar, dVar, (p082i1.f) cVarR);
                        }
                    } else if (cVarR instanceof p082i1.f) {
                        fVar2 = (p082i1.f) cVarR;
                        strC = c(fVar2);
                        if (strC != null) {
                            switch (strC.hashCode()) {
                                case -1785507558:
                                    if (strC.equals("vGuideline")) {
                                        i6 = 1;
                                        p(i6, gVar, str, fVar2);
                                    }
                                    break;
                                case -1354837162:
                                    if (strC.equals("column")) {
                                        n(strC, gVar, str, dVar, fVar2);
                                    }
                                    break;
                                case -1252464839:
                                    if (strC.equals("hChain")) {
                                        f(strC, gVar, str, dVar, fVar2);
                                    }
                                    break;
                                case -851656725:
                                    if (strC.equals("vChain")) {
                                        f(strC, gVar, str, dVar, fVar2);
                                    }
                                    break;
                                case -333143113:
                                    if (strC.equals("barrier")) {
                                        d(gVar, str, fVar2);
                                    }
                                    break;
                                case 113114:
                                    if (strC.equals("row")) {
                                        n(strC, gVar, str, dVar, fVar2);
                                    }
                                    break;
                                case 3181382:
                                    if (strC.equals("grid")) {
                                        n(strC, gVar, str, dVar, fVar2);
                                    }
                                    break;
                                case 98238902:
                                    if (strC.equals("hFlow")) {
                                        l(strC, gVar, str, dVar, fVar2);
                                    }
                                    break;
                                case 111168196:
                                    if (strC.equals("vFlow")) {
                                        l(strC, gVar, str, dVar, fVar2);
                                    }
                                    break;
                                case 965681512:
                                    if (strC.equals("hGuideline")) {
                                        i6 = 0;
                                        p(i6, gVar, str, fVar2);
                                    }
                                    break;
                            }
                        } else {
                            u(gVar, dVar, str, fVar2);
                        }
                    } else if (cVarR instanceof p082i1.e) {
                        dVar.e(str, cVarR.o());
                    }
                } else if (str.equals("Helpers")) {
                    if (cVarR instanceof p082i1.a) {
                        q(gVar, dVar, (p082i1.a) cVarR);
                    }
                } else if (cVarR instanceof p082i1.f) {
                    fVar2 = (p082i1.f) cVarR;
                    strC = c(fVar2);
                    if (strC != null) {
                        switch (strC.hashCode()) {
                            case -1785507558:
                                if (strC.equals("vGuideline")) {
                                    i6 = 1;
                                    p(i6, gVar, str, fVar2);
                                }
                                break;
                            case -1354837162:
                                if (strC.equals("column")) {
                                    n(strC, gVar, str, dVar, fVar2);
                                }
                                break;
                            case -1252464839:
                                if (strC.equals("hChain")) {
                                    f(strC, gVar, str, dVar, fVar2);
                                }
                                break;
                            case -851656725:
                                if (strC.equals("vChain")) {
                                    f(strC, gVar, str, dVar, fVar2);
                                }
                                break;
                            case -333143113:
                                if (strC.equals("barrier")) {
                                    d(gVar, str, fVar2);
                                }
                                break;
                            case 113114:
                                if (strC.equals("row")) {
                                    n(strC, gVar, str, dVar, fVar2);
                                }
                                break;
                            case 3181382:
                                if (strC.equals("grid")) {
                                    n(strC, gVar, str, dVar, fVar2);
                                }
                                break;
                            case 98238902:
                                if (strC.equals("hFlow")) {
                                    l(strC, gVar, str, dVar, fVar2);
                                }
                                break;
                            case 111168196:
                                if (strC.equals("vFlow")) {
                                    l(strC, gVar, str, dVar, fVar2);
                                }
                                break;
                            case 965681512:
                                if (strC.equals("hGuideline")) {
                                    i6 = 0;
                                    p(i6, gVar, str, fVar2);
                                }
                                break;
                        }
                    } else {
                        u(gVar, dVar, str, fVar2);
                    }
                } else if (cVarR instanceof p082i1.e) {
                    dVar.e(str, cVarR.o());
                }
            }
        }
    }

    /* JADX INFO: renamed from: j1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0613b {
        float value();
    }

    public static final class c implements p092j1.b.InterfaceC0613b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f49140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f49141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f49142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f49143d;

        public c(float f6, float f10) {
            this.f49140a = f6;
            this.f49141b = f10;
            this.f49142c = f6;
        }

        @Override // p092j1.b.InterfaceC0613b
        public float value() {
            if (!this.f49143d) {
                this.f49142c += this.f49141b;
            }
            return this.f49142c;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.util.HashMap f49144a = new java.util.HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.util.HashMap f49145b = new java.util.HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.util.HashMap f49146c = new java.util.HashMap();

        public final float a(java.lang.Object obj) {
            p247y7.AbstractC7350t.f(obj, "elementName");
            if (!(obj instanceof p082i1.h)) {
                if (obj instanceof p082i1.e) {
                    return ((p082i1.e) obj).g();
                }
                return 0.0f;
            }
            java.lang.String strE = ((p082i1.h) obj).e();
            if (this.f49145b.containsKey(strE)) {
                java.lang.Object obj2 = this.f49145b.get(strE);
                p247y7.AbstractC7350t.c(obj2);
                return ((p092j1.b.InterfaceC0613b) obj2).value();
            }
            if (!this.f49144a.containsKey(strE)) {
                return 0.0f;
            }
            java.lang.Object obj3 = this.f49144a.get(strE);
            p247y7.AbstractC7350t.c(obj3);
            return ((java.lang.Number) obj3).intValue();
        }

        public final java.util.ArrayList b(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "elementName");
            if (this.f49146c.containsKey(str)) {
                return (java.util.ArrayList) this.f49146c.get(str);
            }
            return null;
        }

        public final void c(java.lang.String str, float f6, float f10) {
            if (this.f49145b.containsKey(str)) {
                this.f49145b.get(str);
            }
            java.util.HashMap map = this.f49145b;
            p247y7.AbstractC7350t.c(str);
            map.put(str, new j1.b.c(f6, f10));
        }

        public final void d(java.lang.String str, float f6, float f10, float f11, java.lang.String str2, java.lang.String str3) {
            p247y7.AbstractC7350t.f(str, "elementName");
            if (this.f49145b.containsKey(str)) {
                this.f49145b.get(str);
            }
            j1.b.a.C0612a c0612a = new j1.b.a.C0612a(f6, f10, f11, str2, str3);
            this.f49145b.put(str, c0612a);
            this.f49146c.put(str, c0612a.a());
        }

        public final void e(java.lang.String str, int i6) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i6);
            java.util.HashMap map = this.f49144a;
            p247y7.AbstractC7350t.c(str);
            map.put(str, numValueOf);
        }

        public final void f(java.lang.String str, java.util.ArrayList arrayList) {
            p247y7.AbstractC7350t.f(str, "elementName");
            p247y7.AbstractC7350t.f(arrayList, "elements");
            this.f49146c.put(str, arrayList);
        }
    }
}
