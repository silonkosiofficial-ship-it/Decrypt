package p178r8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    private static class a extends R7.C1500f {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(O7.InterfaceC1424e interfaceC1424e, O7.a0 a0Var, boolean z6) {
            super(interfaceC1424e, null, P7.g.f8385d.b(), true, O7.InterfaceC1421b.a.DECLARATION, a0Var);
            if (interfaceC1424e == null) {
                M(0);
            }
            if (a0Var == null) {
                M(1);
            }
            z1(java.util.Collections.emptyList(), p178r8.f.k(interfaceC1424e, z6));
        }

        private static /* synthetic */ void M(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    private static /* synthetic */ void a(int i6) {
        java.lang.String str = (i6 == 12 || i6 == 23 || i6 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 12 || i6 == 23 || i6 == 25) ? 2 : 3];
        switch (i6) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i6 == 12) {
            objArr[1] = "createSetter";
        } else if (i6 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i6 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i6) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 12 && i6 != 23 && i6 != 25) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static O7.X b(O7.InterfaceC1420a interfaceC1420a, F8.E e6, p138n8.f fVar, P7.g gVar, int i6) {
        if (interfaceC1420a == null) {
            a(32);
        }
        if (gVar == null) {
            a(33);
        }
        if (e6 == null) {
            return null;
        }
        return new R7.F(interfaceC1420a, new p257z8.c(interfaceC1420a, e6, fVar, null), gVar, p138n8.g.a(i6));
    }

    public static O7.X c(O7.InterfaceC1424e interfaceC1424e, F8.E e6, p138n8.f fVar, P7.g gVar, int i6) {
        if (interfaceC1424e == null) {
            a(34);
        }
        if (gVar == null) {
            a(35);
        }
        if (e6 == null) {
            return null;
        }
        return new R7.F(interfaceC1424e, new p257z8.b(interfaceC1424e, e6, fVar, null), gVar, p138n8.g.a(i6));
    }

    public static R7.D d(O7.U u6, P7.g gVar) {
        if (u6 == null) {
            a(13);
        }
        if (gVar == null) {
            a(14);
        }
        return j(u6, gVar, true, false, false);
    }

    public static R7.E e(O7.U u6, P7.g gVar, P7.g gVar2) {
        if (u6 == null) {
            a(0);
        }
        if (gVar == null) {
            a(1);
        }
        if (gVar2 == null) {
            a(2);
        }
        return n(u6, gVar, gVar2, true, false, false, u6.o());
    }

    public static O7.U f(O7.InterfaceC1424e interfaceC1424e) {
        if (interfaceC1424e == null) {
            a(26);
        }
        O7.G g6 = p178r8.f.g(interfaceC1424e);
        O7.InterfaceC1424e interfaceC1424eA = p178r8.r.a(g6).a(g6);
        if (interfaceC1424eA == null) {
            return null;
        }
        P7.g.a aVar = P7.g.f8385d;
        P7.g gVarB = aVar.b();
        O7.D d6 = O7.D.FINAL;
        O7.AbstractC1439u abstractC1439u = O7.AbstractC1438t.f8186e;
        p138n8.f fVar = L7.j.f6305e;
        O7.InterfaceC1421b.a aVar2 = O7.InterfaceC1421b.a.SYNTHESIZED;
        R7.C cX0 = R7.C.X0(interfaceC1424e, gVarB, d6, abstractC1439u, false, fVar, aVar2, interfaceC1424e.o(), false, false, false, false, false, false);
        R7.D d10 = new R7.D(cX0, aVar.b(), d6, abstractC1439u, false, false, false, aVar2, null, interfaceC1424e.o());
        cX0.d1(d10, null);
        cX0.k1(F8.F.i(F8.a0.f2872D.i(), interfaceC1424eA.p(), java.util.Collections.singletonList(new F8.k0(interfaceC1424e.w())), false), java.util.Collections.emptyList(), null, null, java.util.Collections.emptyList());
        d10.Y0(cX0.l());
        return cX0;
    }

    public static O7.Z g(O7.InterfaceC1424e interfaceC1424e) {
        if (interfaceC1424e == null) {
            a(24);
        }
        P7.g.a aVar = P7.g.f8385d;
        R7.G gU1 = R7.G.u1(interfaceC1424e, aVar.b(), L7.j.f6306f, O7.InterfaceC1421b.a.SYNTHESIZED, interfaceC1424e.o());
        R7.G gW1 = gU1.a1(null, null, java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.singletonList(new R7.L(gU1, null, 0, aVar.b(), p138n8.f.o("value"), p218v8.c.j(interfaceC1424e).W(), false, false, false, null, interfaceC1424e.o())), interfaceC1424e.w(), O7.D.FINAL, O7.AbstractC1438t.f8186e);
        if (gW1 == null) {
            a(25);
        }
        return gW1;
    }

    public static O7.Z h(O7.InterfaceC1424e interfaceC1424e) {
        if (interfaceC1424e == null) {
            a(22);
        }
        R7.G gW1 = R7.G.u1(interfaceC1424e, P7.g.f8385d.b(), L7.j.f6304d, O7.InterfaceC1421b.a.SYNTHESIZED, interfaceC1424e.o()).a1(null, null, java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), p218v8.c.j(interfaceC1424e).l(F8.u0.INVARIANT, interfaceC1424e.w()), O7.D.FINAL, O7.AbstractC1438t.f8186e);
        if (gW1 == null) {
            a(23);
        }
        return gW1;
    }

    public static O7.X i(O7.InterfaceC1420a interfaceC1420a, F8.E e6, P7.g gVar) {
        if (interfaceC1420a == null) {
            a(30);
        }
        if (gVar == null) {
            a(31);
        }
        if (e6 == null) {
            return null;
        }
        return new R7.F(interfaceC1420a, new p257z8.d(interfaceC1420a, e6, null), gVar);
    }

    public static R7.D j(O7.U u6, P7.g gVar, boolean z6, boolean z10, boolean z11) {
        if (u6 == null) {
            a(15);
        }
        if (gVar == null) {
            a(16);
        }
        return k(u6, gVar, z6, z10, z11, u6.o());
    }

    public static R7.D k(O7.U u6, P7.g gVar, boolean z6, boolean z10, boolean z11, O7.a0 a0Var) {
        if (u6 == null) {
            a(17);
        }
        if (gVar == null) {
            a(18);
        }
        if (a0Var == null) {
            a(19);
        }
        return new R7.D(u6, gVar, u6.q(), u6.h(), z6, z10, z11, O7.InterfaceC1421b.a.DECLARATION, null, a0Var);
    }

    public static R7.C1500f l(O7.InterfaceC1424e interfaceC1424e, O7.a0 a0Var) {
        if (interfaceC1424e == null) {
            a(20);
        }
        if (a0Var == null) {
            a(21);
        }
        return new r8.e.a(interfaceC1424e, a0Var, false);
    }

    public static R7.E m(O7.U u6, P7.g gVar, P7.g gVar2, boolean z6, boolean z10, boolean z11, O7.AbstractC1439u abstractC1439u, O7.a0 a0Var) {
        if (u6 == null) {
            a(7);
        }
        if (gVar == null) {
            a(8);
        }
        if (gVar2 == null) {
            a(9);
        }
        if (abstractC1439u == null) {
            a(10);
        }
        if (a0Var == null) {
            a(11);
        }
        R7.E e6 = new R7.E(u6, gVar, u6.q(), abstractC1439u, z6, z10, z11, O7.InterfaceC1421b.a.DECLARATION, null, a0Var);
        e6.Z0(R7.E.X0(e6, u6.getType(), gVar2));
        return e6;
    }

    public static R7.E n(O7.U u6, P7.g gVar, P7.g gVar2, boolean z6, boolean z10, boolean z11, O7.a0 a0Var) {
        if (u6 == null) {
            a(3);
        }
        if (gVar == null) {
            a(4);
        }
        if (gVar2 == null) {
            a(5);
        }
        if (a0Var == null) {
            a(6);
        }
        return m(u6, gVar, gVar2, z6, z10, z11, u6.h(), a0Var);
    }

    private static boolean o(O7.InterfaceC1443y interfaceC1443y) {
        if (interfaceC1443y == null) {
            a(29);
        }
        return interfaceC1443y.j() == O7.InterfaceC1421b.a.SYNTHESIZED && p178r8.f.A(interfaceC1443y.b());
    }

    public static boolean p(O7.InterfaceC1443y interfaceC1443y) {
        if (interfaceC1443y == null) {
            a(28);
        }
        return interfaceC1443y.getName().equals(L7.j.f6306f) && o(interfaceC1443y);
    }

    public static boolean q(O7.InterfaceC1443y interfaceC1443y) {
        if (interfaceC1443y == null) {
            a(27);
        }
        return interfaceC1443y.getName().equals(L7.j.f6304d) && o(interfaceC1443y);
    }
}
