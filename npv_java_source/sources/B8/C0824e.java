package B8;

/* JADX INFO: renamed from: B8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0824e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O7.G f863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O7.J f864b;

    /* JADX INFO: renamed from: B8.e$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f865a;

        static {
            int[] iArr = new int[p088i8.b.C0568b.c.EnumC0571c.values().length];
            try {
                iArr[p088i8.b.C0568b.c.EnumC0571c.BYTE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p088i8.b.C0568b.c.EnumC0571c.CHAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p088i8.b.C0568b.c.EnumC0571c.SHORT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[p088i8.b.C0568b.c.EnumC0571c.INT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[p088i8.b.C0568b.c.EnumC0571c.LONG.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[p088i8.b.C0568b.c.EnumC0571c.FLOAT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[p088i8.b.C0568b.c.EnumC0571c.DOUBLE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[p088i8.b.C0568b.c.EnumC0571c.BOOLEAN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[p088i8.b.C0568b.c.EnumC0571c.STRING.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[p088i8.b.C0568b.c.EnumC0571c.CLASS.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[p088i8.b.C0568b.c.EnumC0571c.ENUM.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[p088i8.b.C0568b.c.EnumC0571c.ANNOTATION.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[p088i8.b.C0568b.c.EnumC0571c.ARRAY.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            f865a = iArr;
        }
    }

    public C0824e(O7.G g6, O7.J j6) {
        p247y7.AbstractC7350t.f(g6, "module");
        p247y7.AbstractC7350t.f(j6, "notFoundClasses");
        this.f863a = g6;
        this.f864b = j6;
    }

    private final boolean b(p198t8.g gVar, F8.E e6, p088i8.b.C0568b.c cVar) {
        p088i8.b.C0568b.c.EnumC0571c enumC0571cS = cVar.S();
        int i6 = enumC0571cS == null ? -1 : B8.C0824e.a.f865a[enumC0571cS.ordinal()];
        if (i6 == 10) {
            O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
            O7.InterfaceC1424e interfaceC1424e = interfaceC1427hW instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hW : null;
            if (interfaceC1424e != null && !L7.g.l0(interfaceC1424e)) {
                return false;
            }
        } else {
            if (i6 != 13) {
                return p247y7.AbstractC7350t.b(gVar.a(this.f863a), e6);
            }
            if (!(gVar instanceof p198t8.b) || ((java.util.List) ((p198t8.b) gVar).b()).size() != cVar.J().size()) {
                throw new java.lang.IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
            }
            F8.E eK = c().k(e6);
            p247y7.AbstractC7350t.e(eK, "getArrayElementType(...)");
            p198t8.b bVar = (p198t8.b) gVar;
            java.lang.Iterable iterableN = p097j7.AbstractC6879v.n((java.util.Collection) bVar.b());
            if (!(iterableN instanceof java.util.Collection) || !((java.util.Collection) iterableN).isEmpty()) {
                java.util.Iterator it = iterableN.iterator();
                while (it.hasNext()) {
                    int iB = ((p097j7.O) it).b();
                    p198t8.g gVar2 = (p198t8.g) ((java.util.List) bVar.b()).get(iB);
                    p088i8.b.C0568b.c cVarH = cVar.H(iB);
                    p247y7.AbstractC7350t.e(cVarH, "getArrayElement(...)");
                    if (!b(gVar2, eK, cVarH)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final L7.g c() {
        return this.f863a.t();
    }

    private final p087i7.u d(p088i8.b.C0568b c0568b, java.util.Map map, p108k8.c cVar) {
        O7.j0 j0Var = (O7.j0) map.get(B8.y.b(cVar, c0568b.w()));
        if (j0Var == null) {
            return null;
        }
        p138n8.f fVarB = B8.y.b(cVar, c0568b.w());
        F8.E type = j0Var.getType();
        p247y7.AbstractC7350t.e(type, "getType(...)");
        p088i8.b.C0568b.c cVarX = c0568b.x();
        p247y7.AbstractC7350t.e(cVarX, "getValue(...)");
        return new p087i7.u(fVarB, g(type, cVarX, cVar));
    }

    private final O7.InterfaceC1424e e(p138n8.b bVar) {
        return O7.AbstractC1442x.c(this.f863a, bVar, this.f864b);
    }

    private final p198t8.g g(F8.E e6, p088i8.b.C0568b.c cVar, p108k8.c cVar2) {
        p198t8.g gVarF = f(e6, cVar, cVar2);
        if (!b(gVarF, e6, cVar)) {
            gVarF = null;
        }
        if (gVarF != null) {
            return gVarF;
        }
        return p198t8.k.f54637b.a("Unexpected argument value: actual type " + cVar.S() + " != expected type " + e6);
    }

    public final P7.c a(p088i8.b bVar, p108k8.c cVar) {
        p247y7.AbstractC7350t.f(bVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        O7.InterfaceC1424e interfaceC1424eE = e(B8.y.a(cVar, bVar.A()));
        java.util.Map mapH = p097j7.S.h();
        if (bVar.x() != 0 && !H8.k.m(interfaceC1424eE) && p178r8.f.t(interfaceC1424eE)) {
            java.util.Collection collectionR = interfaceC1424eE.r();
            p247y7.AbstractC7350t.e(collectionR, "getConstructors(...)");
            O7.InterfaceC1423d interfaceC1423d = (O7.InterfaceC1423d) p097j7.AbstractC6879v.H0(collectionR);
            if (interfaceC1423d != null) {
                java.util.List listN = interfaceC1423d.n();
                p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
                java.util.List list = listN;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(list, 10)), 16));
                for (java.lang.Object obj : list) {
                    linkedHashMap.put(((O7.j0) obj).getName(), obj);
                }
                java.util.List<p088i8.b.C0568b> listY = bVar.y();
                p247y7.AbstractC7350t.e(listY, "getArgumentList(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (p088i8.b.C0568b c0568b : listY) {
                    p247y7.AbstractC7350t.c(c0568b);
                    p087i7.u uVarD = d(c0568b, linkedHashMap, cVar);
                    if (uVarD != null) {
                        arrayList.add(uVarD);
                    }
                }
                mapH = p097j7.S.q(arrayList);
            }
        }
        return new P7.d(interfaceC1424eE.w(), mapH, O7.a0.f8143a);
    }

    public final p198t8.g f(F8.E e6, p088i8.b.C0568b.c cVar, p108k8.c cVar2) {
        p198t8.g wVar;
        p247y7.AbstractC7350t.f(e6, "expectedType");
        p247y7.AbstractC7350t.f(cVar, "value");
        p247y7.AbstractC7350t.f(cVar2, "nameResolver");
        java.lang.Boolean boolD = p108k8.b.f49783P.d(cVar.O());
        p247y7.AbstractC7350t.e(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        p088i8.b.C0568b.c.EnumC0571c enumC0571cS = cVar.S();
        switch (enumC0571cS == null ? -1 : B8.C0824e.a.f865a[enumC0571cS.ordinal()]) {
            case 1:
                byte bQ = (byte) cVar.Q();
                wVar = zBooleanValue ? new p198t8.w(bQ) : new p198t8.d(bQ);
                break;
            case 2:
                return new p198t8.e((char) cVar.Q());
            case 3:
                short sQ = (short) cVar.Q();
                wVar = zBooleanValue ? new p198t8.z(sQ) : new p198t8.t(sQ);
                break;
            case 4:
                int iQ = (int) cVar.Q();
                wVar = zBooleanValue ? new p198t8.x(iQ) : new p198t8.m(iQ);
                break;
            case 5:
                long jQ = cVar.Q();
                return zBooleanValue ? new p198t8.y(jQ) : new p198t8.q(jQ);
            case 6:
                return new p198t8.l(cVar.P());
            case 7:
                return new p198t8.i(cVar.M());
            case 8:
                return new p198t8.c(cVar.Q() != 0);
            case 9:
                return new p198t8.u(cVar2.getString(cVar.R()));
            case 10:
                return new p198t8.p(B8.y.a(cVar2, cVar.K()), cVar.G());
            case 11:
                return new p198t8.j(B8.y.a(cVar2, cVar.K()), B8.y.b(cVar2, cVar.N()));
            case 12:
                p088i8.b bVarF = cVar.F();
                p247y7.AbstractC7350t.e(bVarF, "getAnnotation(...)");
                return new p198t8.C7156a(a(bVarF, cVar2));
            case 13:
                p198t8.h hVar = p198t8.h.f54633a;
                java.util.List listJ = cVar.J();
                p247y7.AbstractC7350t.e(listJ, "getArrayElementList(...)");
                java.util.List<p088i8.b.C0568b.c> list = listJ;
                java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
                for (p088i8.b.C0568b.c cVar3 : list) {
                    F8.M mI = c().i();
                    p247y7.AbstractC7350t.e(mI, "getAnyType(...)");
                    p247y7.AbstractC7350t.c(cVar3);
                    arrayList.add(f(mI, cVar3, cVar2));
                }
                return hVar.a(arrayList, e6);
            default:
                throw new java.lang.IllegalStateException(("Unsupported annotation argument type: " + cVar.S() + " (expected " + e6 + ')').toString());
        }
        return wVar;
    }
}
