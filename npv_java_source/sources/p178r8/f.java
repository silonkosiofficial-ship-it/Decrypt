package p178r8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p138n8.c f53993a = new p138n8.c("kotlin.jvm.JvmName");

    public static boolean A(O7.InterfaceC1432m interfaceC1432m) {
        return D(interfaceC1432m, O7.EnumC1425f.ENUM_CLASS);
    }

    public static boolean B(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(36);
        }
        return D(interfaceC1432m, O7.EnumC1425f.ENUM_ENTRY);
    }

    public static boolean C(O7.InterfaceC1432m interfaceC1432m) {
        return D(interfaceC1432m, O7.EnumC1425f.INTERFACE);
    }

    private static boolean D(O7.InterfaceC1432m interfaceC1432m, O7.EnumC1425f enumC1425f) {
        if (enumC1425f == null) {
            a(37);
        }
        return (interfaceC1432m instanceof O7.InterfaceC1424e) && ((O7.InterfaceC1424e) interfaceC1432m).j() == enumC1425f;
    }

    public static boolean E(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(1);
        }
        while (interfaceC1432m != null) {
            if (u(interfaceC1432m) || y(interfaceC1432m)) {
                return true;
            }
            interfaceC1432m = interfaceC1432m.b();
        }
        return false;
    }

    private static boolean F(F8.E e6, O7.InterfaceC1432m interfaceC1432m) {
        if (e6 == null) {
            a(30);
        }
        if (interfaceC1432m == null) {
            a(31);
        }
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        if (interfaceC1427hW == null) {
            return false;
        }
        O7.InterfaceC1432m interfaceC1432mA = interfaceC1427hW.a();
        return (interfaceC1432mA instanceof O7.InterfaceC1427h) && (interfaceC1432m instanceof O7.InterfaceC1427h) && ((O7.InterfaceC1427h) interfaceC1432m).p().equals(((O7.InterfaceC1427h) interfaceC1432mA).p());
    }

    public static boolean G(O7.InterfaceC1432m interfaceC1432m) {
        return (D(interfaceC1432m, O7.EnumC1425f.CLASS) || D(interfaceC1432m, O7.EnumC1425f.INTERFACE)) && ((O7.InterfaceC1424e) interfaceC1432m).q() == O7.D.SEALED;
    }

    public static boolean H(O7.InterfaceC1424e interfaceC1424e, O7.InterfaceC1424e interfaceC1424e2) {
        if (interfaceC1424e == null) {
            a(28);
        }
        if (interfaceC1424e2 == null) {
            a(29);
        }
        return I(interfaceC1424e.w(), interfaceC1424e2.a());
    }

    public static boolean I(F8.E e6, O7.InterfaceC1432m interfaceC1432m) {
        if (e6 == null) {
            a(32);
        }
        if (interfaceC1432m == null) {
            a(33);
        }
        if (F(e6, interfaceC1432m)) {
            return true;
        }
        java.util.Iterator it = e6.W0().u().iterator();
        while (it.hasNext()) {
            if (I((F8.E) it.next(), interfaceC1432m)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(O7.InterfaceC1432m interfaceC1432m) {
        return interfaceC1432m != null && (interfaceC1432m.b() instanceof O7.K);
    }

    public static boolean K(O7.k0 k0Var, F8.E e6) {
        if (k0Var == null) {
            a(66);
        }
        if (e6 == null) {
            a(67);
        }
        if (k0Var.t0() || F8.G.a(e6)) {
            return false;
        }
        if (F8.q0.b(e6)) {
            return true;
        }
        L7.g gVarJ = p218v8.c.j(k0Var);
        if (!L7.g.s0(e6)) {
            G8.e eVar = G8.e.f3134a;
            if (!eVar.b(gVarJ.W(), e6) && !eVar.b(gVarJ.K().w(), e6) && !eVar.b(gVarJ.i(), e6) && !L7.n.d(e6)) {
                return false;
            }
        }
        return true;
    }

    public static O7.InterfaceC1421b L(O7.InterfaceC1421b interfaceC1421b) {
        if (interfaceC1421b == null) {
            a(59);
        }
        while (interfaceC1421b.j() == O7.InterfaceC1421b.a.FAKE_OVERRIDE) {
            java.util.Collection collectionF = interfaceC1421b.f();
            if (collectionF.isEmpty()) {
                throw new java.lang.IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC1421b);
            }
            interfaceC1421b = (O7.InterfaceC1421b) collectionF.iterator().next();
        }
        return interfaceC1421b;
    }

    public static O7.InterfaceC1436q M(O7.InterfaceC1436q interfaceC1436q) {
        if (interfaceC1436q == null) {
            a(64);
        }
        if (interfaceC1436q instanceof O7.InterfaceC1421b) {
            return L((O7.InterfaceC1421b) interfaceC1436q);
        }
        if (interfaceC1436q == null) {
            a(65);
        }
        return interfaceC1436q;
    }

    private static /* synthetic */ void a(int i6) {
        java.lang.String str;
        int i10;
        switch (i6) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i6) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i6) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i6) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new java.lang.IllegalStateException(str2);
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    public static boolean b(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1432m interfaceC1432m2) {
        if (interfaceC1432m == null) {
            a(16);
        }
        if (interfaceC1432m2 == null) {
            a(17);
        }
        return g(interfaceC1432m).equals(g(interfaceC1432m2));
    }

    private static void c(O7.InterfaceC1420a interfaceC1420a, java.util.Set set) {
        if (interfaceC1420a == null) {
            a(73);
        }
        if (set == null) {
            a(74);
        }
        if (set.contains(interfaceC1420a)) {
            return;
        }
        java.util.Iterator it = interfaceC1420a.a().f().iterator();
        while (it.hasNext()) {
            O7.InterfaceC1420a interfaceC1420aA = ((O7.InterfaceC1420a) it.next()).a();
            c(interfaceC1420aA, set);
            set.add(interfaceC1420aA);
        }
    }

    public static java.util.Set d(O7.InterfaceC1420a interfaceC1420a) {
        if (interfaceC1420a == null) {
            a(71);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        c(interfaceC1420a.a(), linkedHashSet);
        return linkedHashSet;
    }

    public static O7.InterfaceC1424e e(F8.E e6) {
        if (e6 == null) {
            a(45);
        }
        return f(e6.W0());
    }

    public static O7.InterfaceC1424e f(F8.e0 e0Var) {
        if (e0Var == null) {
            a(46);
        }
        O7.InterfaceC1424e interfaceC1424e = (O7.InterfaceC1424e) e0Var.w();
        if (interfaceC1424e == null) {
            a(47);
        }
        return interfaceC1424e;
    }

    public static O7.G g(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(21);
        }
        O7.G gI = i(interfaceC1432m);
        if (gI == null) {
            a(22);
        }
        return gI;
    }

    public static O7.G h(F8.E e6) {
        if (e6 == null) {
            a(20);
        }
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        if (interfaceC1427hW == null) {
            return null;
        }
        return i(interfaceC1427hW);
    }

    public static O7.G i(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(23);
        }
        while (interfaceC1432m != null) {
            if (interfaceC1432m instanceof O7.G) {
                return (O7.G) interfaceC1432m;
            }
            if (interfaceC1432m instanceof O7.P) {
                return ((O7.P) interfaceC1432m).E0();
            }
            interfaceC1432m = interfaceC1432m.b();
        }
        return null;
    }

    public static O7.b0 j(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(82);
        }
        if (interfaceC1432m instanceof O7.W) {
            interfaceC1432m = ((O7.W) interfaceC1432m).K0();
        }
        if (interfaceC1432m instanceof O7.InterfaceC1435p) {
            O7.b0 b0VarA = ((O7.InterfaceC1435p) interfaceC1432m).o().a();
            if (b0VarA == null) {
                a(83);
            }
            return b0VarA;
        }
        O7.b0 b0Var = O7.b0.f8149a;
        if (b0Var == null) {
            a(84);
        }
        return b0Var;
    }

    public static O7.AbstractC1439u k(O7.InterfaceC1424e interfaceC1424e, boolean z6) {
        if (interfaceC1424e == null) {
            a(48);
        }
        O7.EnumC1425f enumC1425fJ = interfaceC1424e.j();
        if (enumC1425fJ == O7.EnumC1425f.ENUM_CLASS || enumC1425fJ.g()) {
            O7.AbstractC1439u abstractC1439u = O7.AbstractC1438t.f8182a;
            if (abstractC1439u == null) {
                a(49);
            }
            return abstractC1439u;
        }
        if (G(interfaceC1424e)) {
            if (z6) {
                O7.AbstractC1439u abstractC1439u2 = O7.AbstractC1438t.f8184c;
                if (abstractC1439u2 == null) {
                    a(50);
                }
                return abstractC1439u2;
            }
            O7.AbstractC1439u abstractC1439u3 = O7.AbstractC1438t.f8182a;
            if (abstractC1439u3 == null) {
                a(51);
            }
            return abstractC1439u3;
        }
        if (u(interfaceC1424e)) {
            O7.AbstractC1439u abstractC1439u4 = O7.AbstractC1438t.f8193l;
            if (abstractC1439u4 == null) {
                a(52);
            }
            return abstractC1439u4;
        }
        O7.AbstractC1439u abstractC1439u5 = O7.AbstractC1438t.f8186e;
        if (abstractC1439u5 == null) {
            a(53);
        }
        return abstractC1439u5;
    }

    public static O7.X l(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(0);
        }
        if (interfaceC1432m instanceof O7.InterfaceC1424e) {
            return ((O7.InterfaceC1424e) interfaceC1432m).S0();
        }
        return null;
    }

    public static p138n8.d m(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(2);
        }
        p138n8.c cVarO = o(interfaceC1432m);
        return cVarO != null ? cVarO.j() : p(interfaceC1432m);
    }

    public static p138n8.c n(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(3);
        }
        p138n8.c cVarO = o(interfaceC1432m);
        if (cVarO == null) {
            cVarO = p(interfaceC1432m).l();
        }
        if (cVarO == null) {
            a(4);
        }
        return cVarO;
    }

    private static p138n8.c o(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(5);
        }
        if ((interfaceC1432m instanceof O7.G) || H8.k.m(interfaceC1432m)) {
            return p138n8.c.f51948c;
        }
        if (interfaceC1432m instanceof O7.P) {
            return ((O7.P) interfaceC1432m).e();
        }
        if (interfaceC1432m instanceof O7.K) {
            return ((O7.K) interfaceC1432m).e();
        }
        return null;
    }

    private static p138n8.d p(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(6);
        }
        p138n8.d dVarC = m(interfaceC1432m.b()).c(interfaceC1432m.getName());
        if (dVarC == null) {
            a(7);
        }
        return dVarC;
    }

    public static O7.InterfaceC1432m q(O7.InterfaceC1432m interfaceC1432m, java.lang.Class cls) {
        if (cls == null) {
            a(18);
        }
        return r(interfaceC1432m, cls, true);
    }

    public static O7.InterfaceC1432m r(O7.InterfaceC1432m interfaceC1432m, java.lang.Class cls, boolean z6) {
        if (cls == null) {
            a(19);
        }
        if (interfaceC1432m == null) {
            return null;
        }
        if (z6) {
            interfaceC1432m = interfaceC1432m.b();
        }
        while (interfaceC1432m != null) {
            if (cls.isInstance(interfaceC1432m)) {
                return interfaceC1432m;
            }
            interfaceC1432m = interfaceC1432m.b();
        }
        return null;
    }

    public static O7.InterfaceC1424e s(O7.InterfaceC1424e interfaceC1424e) {
        if (interfaceC1424e == null) {
            a(44);
        }
        java.util.Iterator it = interfaceC1424e.p().u().iterator();
        while (it.hasNext()) {
            O7.InterfaceC1424e interfaceC1424eE = e((F8.E) it.next());
            if (interfaceC1424eE.j() != O7.EnumC1425f.INTERFACE) {
                return interfaceC1424eE;
            }
        }
        return null;
    }

    public static boolean t(O7.InterfaceC1432m interfaceC1432m) {
        return D(interfaceC1432m, O7.EnumC1425f.ANNOTATION_CLASS);
    }

    public static boolean u(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(34);
        }
        return v(interfaceC1432m) && interfaceC1432m.getName().equals(p138n8.h.f51965b);
    }

    public static boolean v(O7.InterfaceC1432m interfaceC1432m) {
        return D(interfaceC1432m, O7.EnumC1425f.CLASS);
    }

    public static boolean w(O7.InterfaceC1432m interfaceC1432m) {
        return v(interfaceC1432m) || A(interfaceC1432m);
    }

    public static boolean x(O7.InterfaceC1432m interfaceC1432m) {
        return D(interfaceC1432m, O7.EnumC1425f.OBJECT) && ((O7.InterfaceC1424e) interfaceC1432m).E();
    }

    public static boolean y(O7.InterfaceC1432m interfaceC1432m) {
        return (interfaceC1432m instanceof O7.InterfaceC1436q) && ((O7.InterfaceC1436q) interfaceC1432m).h() == O7.AbstractC1438t.f8187f;
    }

    public static boolean z(O7.InterfaceC1424e interfaceC1424e, O7.InterfaceC1424e interfaceC1424e2) {
        if (interfaceC1424e == null) {
            a(26);
        }
        if (interfaceC1424e2 == null) {
            a(27);
        }
        java.util.Iterator it = interfaceC1424e.p().u().iterator();
        while (it.hasNext()) {
            if (F((F8.E) it.next(), interfaceC1424e2.a())) {
                return true;
            }
        }
        return false;
    }
}
