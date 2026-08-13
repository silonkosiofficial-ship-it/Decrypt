package L7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p138n8.f f6248g = p138n8.f.s("<built-ins module>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private R7.x f6249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private E8.i f6250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E8.i f6251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E8.i f6252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E8.g f6253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final E8.n f6254f;

    class a implements p237x7.a {
        a() {
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.util.Collection b() {
            return java.util.Arrays.asList(L7.g.this.r().s0(L7.j.f6325y), L7.g.this.r().s0(L7.j.f6295A), L7.g.this.r().s0(L7.j.f6296B), L7.g.this.r().s0(L7.j.f6326z));
        }
    }

    class b implements p237x7.a {
        b() {
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public L7.g.e b() {
            java.util.EnumMap enumMap = new java.util.EnumMap(L7.h.class);
            java.util.HashMap map = new java.util.HashMap();
            java.util.HashMap map2 = new java.util.HashMap();
            for (L7.h hVar : L7.h.values()) {
                F8.M mQ = L7.g.this.q(hVar.n().g());
                F8.M mQ2 = L7.g.this.q(hVar.i().g());
                enumMap.put(hVar, mQ2);
                map.put(mQ, mQ2);
                map2.put(mQ2, mQ);
            }
            return new L7.g.e(enumMap, map, map2, null);
        }
    }

    class c implements p237x7.l {
        c() {
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public O7.InterfaceC1424e l(p138n8.f fVar) {
            O7.InterfaceC1427h interfaceC1427hG = L7.g.this.s().g(fVar, W7.d.FROM_BUILTINS);
            if (interfaceC1427hG == null) {
                throw new java.lang.AssertionError("Built-in class " + L7.j.f6325y.c(fVar) + " is not found");
            }
            if (interfaceC1427hG instanceof O7.InterfaceC1424e) {
                return (O7.InterfaceC1424e) interfaceC1427hG;
            }
            throw new java.lang.AssertionError("Must be a class descriptor " + fVar + ", but was " + interfaceC1427hG);
        }
    }

    class d implements p237x7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ R7.x f6258C;

        d(R7.x xVar) {
            this.f6258C = xVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Void b() {
            if (L7.g.this.f6249a == null) {
                L7.g.this.f6249a = this.f6258C;
                return null;
            }
            throw new java.lang.AssertionError("Built-ins module is already set: " + L7.g.this.f6249a + " (attempting to reset to " + this.f6258C + ")");
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.Map f6260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final java.util.Map f6261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final java.util.Map f6262c;

        private e(java.util.Map map, java.util.Map map2, java.util.Map map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f6260a = map;
            this.f6261b = map2;
            this.f6262c = map3;
        }

        /* synthetic */ e(java.util.Map map, java.util.Map map2, java.util.Map map3, L7.g.a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i6 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    protected g(E8.n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f6254f = nVar;
        this.f6252d = nVar.d(new L7.g.a());
        this.f6251c = nVar.d(new L7.g.b());
        this.f6253e = nVar.b(new L7.g.c());
    }

    private static F8.E A(F8.E e6, O7.G g6) {
        p138n8.b bVarK;
        p138n8.b bVarA;
        O7.InterfaceC1424e interfaceC1424eA;
        if (e6 == null) {
            a(72);
        }
        if (g6 == null) {
            a(73);
        }
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        if (interfaceC1427hW == null) {
            return null;
        }
        L7.n nVar = L7.n.f6435a;
        if (!nVar.b(interfaceC1427hW.getName()) || (bVarK = p218v8.c.k(interfaceC1427hW)) == null || (bVarA = nVar.a(bVarK)) == null || (interfaceC1424eA = O7.AbstractC1442x.a(g6, bVarA)) == null) {
            return null;
        }
        return interfaceC1424eA.w();
    }

    public static boolean A0(F8.E e6) {
        if (e6 == null) {
            a(130);
        }
        return i0(e6, L7.j.a.f6338F0.j());
    }

    public static boolean B0(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(10);
        }
        while (interfaceC1432m != null) {
            if (interfaceC1432m instanceof O7.K) {
                return ((O7.K) interfaceC1432m).e().i(L7.j.f6324x);
            }
            interfaceC1432m = interfaceC1432m.b();
        }
        return false;
    }

    public static boolean C0(F8.E e6) {
        if (e6 == null) {
            a(143);
        }
        return m0(e6, L7.j.a.f6375f);
    }

    public static boolean D0(F8.E e6) {
        if (e6 == null) {
            a(133);
        }
        return x0(e6) || A0(e6) || y0(e6) || z0(e6);
    }

    public static L7.h N(F8.E e6) {
        if (e6 == null) {
            a(93);
        }
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        if (interfaceC1427hW == null) {
            return null;
        }
        return P(interfaceC1427hW);
    }

    public static L7.h P(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(78);
        }
        if (L7.j.a.f6346J0.contains(interfaceC1432m.getName())) {
            return (L7.h) L7.j.a.f6350L0.get(p178r8.f.m(interfaceC1432m));
        }
        return null;
    }

    private O7.InterfaceC1424e Q(L7.h hVar) {
        if (hVar == null) {
            a(16);
        }
        return p(hVar.n().g());
    }

    public static L7.h S(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(77);
        }
        if (L7.j.a.f6344I0.contains(interfaceC1432m.getName())) {
            return (L7.h) L7.j.a.f6348K0.get(p178r8.f.m(interfaceC1432m));
        }
        return null;
    }

    private static /* synthetic */ void a(int i6) {
        java.lang.String str;
        int i10;
        switch (i6) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i10 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i10 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 77:
            case 78:
            case 90:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION /* 127 */:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i6) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case 24:
                objArr[1] = "getKProperty";
                break;
            case 25:
                objArr[1] = "getKProperty0";
                break;
            case 26:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case 35:
                objArr[1] = "getCollection";
                break;
            case 36:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case 44:
                objArr[1] = "getMutableMapEntry";
                break;
            case 45:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case 64:
                objArr[1] = "getBooleanType";
                break;
            case 65:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i6) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case 90:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case 100:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION /* 127 */:
                objArr[2] = "isUInt";
                break;
            case 128:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i6) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new java.lang.IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    public static boolean a0(O7.InterfaceC1424e interfaceC1424e) {
        if (interfaceC1424e == null) {
            a(109);
        }
        return e(interfaceC1424e, L7.j.a.f6367b);
    }

    public static boolean b0(F8.E e6) {
        if (e6 == null) {
            a(140);
        }
        return h0(e6, L7.j.a.f6367b);
    }

    public static boolean c0(F8.E e6) {
        if (e6 == null) {
            a(89);
        }
        return h0(e6, L7.j.a.f6381i);
    }

    public static boolean d0(F8.E e6) {
        if (e6 == null) {
            a(91);
        }
        return c0(e6) || q0(e6);
    }

    private static boolean e(O7.InterfaceC1427h interfaceC1427h, p138n8.d dVar) {
        if (interfaceC1427h == null) {
            a(104);
        }
        if (dVar == null) {
            a(105);
        }
        return interfaceC1427h.getName().equals(dVar.i()) && dVar.equals(p178r8.f.m(interfaceC1427h));
    }

    public static boolean e0(O7.InterfaceC1424e interfaceC1424e) {
        if (interfaceC1424e == null) {
            a(90);
        }
        return e(interfaceC1424e, L7.j.a.f6381i) || P(interfaceC1424e) != null;
    }

    public static boolean f0(F8.E e6) {
        if (e6 == null) {
            a(111);
        }
        return i0(e6, L7.j.a.f6383j);
    }

    public static boolean g0(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(9);
        }
        return p178r8.f.r(interfaceC1432m, L7.b.class, false) != null;
    }

    private static boolean h0(F8.E e6, p138n8.d dVar) {
        if (e6 == null) {
            a(98);
        }
        if (dVar == null) {
            a(99);
        }
        return w0(e6.W0(), dVar);
    }

    private static boolean i0(F8.E e6, p138n8.d dVar) {
        if (e6 == null) {
            a(135);
        }
        if (dVar == null) {
            a(136);
        }
        return h0(e6, dVar) && !e6.X0();
    }

    public static boolean j0(F8.E e6) {
        if (e6 == null) {
            a(142);
        }
        return p0(e6);
    }

    public static boolean k0(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(162);
        }
        if (interfaceC1432m.a().k().H(L7.j.a.f6413y)) {
            return true;
        }
        if (!(interfaceC1432m instanceof O7.U)) {
            return false;
        }
        O7.U u6 = (O7.U) interfaceC1432m;
        boolean zT0 = u6.t0();
        O7.V vD = u6.d();
        O7.W wI = u6.i();
        if (vD != null && k0(vD)) {
            if (!zT0) {
                return true;
            }
            if (wI != null && k0(wI)) {
                return true;
            }
        }
        return false;
    }

    public static boolean l0(O7.InterfaceC1424e interfaceC1424e) {
        if (interfaceC1424e == null) {
            a(159);
        }
        return e(interfaceC1424e, L7.j.a.f6384j0);
    }

    private static boolean m0(F8.E e6, p138n8.d dVar) {
        if (e6 == null) {
            a(106);
        }
        if (dVar == null) {
            a(107);
        }
        return !e6.X0() && h0(e6, dVar);
    }

    public static boolean n0(F8.E e6) {
        if (e6 == null) {
            a(137);
        }
        return o0(e6) && !F8.q0.l(e6);
    }

    public static boolean o0(F8.E e6) {
        if (e6 == null) {
            a(139);
        }
        return h0(e6, L7.j.a.f6369c);
    }

    private O7.InterfaceC1424e p(java.lang.String str) {
        if (str == null) {
            a(14);
        }
        O7.InterfaceC1424e interfaceC1424e = (O7.InterfaceC1424e) this.f6253e.l(p138n8.f.o(str));
        if (interfaceC1424e == null) {
            a(15);
        }
        return interfaceC1424e;
    }

    public static boolean p0(F8.E e6) {
        if (e6 == null) {
            a(141);
        }
        return b0(e6) && e6.X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public F8.M q(java.lang.String str) {
        if (str == null) {
            a(47);
        }
        F8.M mW = p(str).w();
        if (mW == null) {
            a(48);
        }
        return mW;
    }

    public static boolean q0(F8.E e6) {
        if (e6 == null) {
            a(92);
        }
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        return (interfaceC1427hW == null || P(interfaceC1427hW) == null) ? false : true;
    }

    public static boolean r0(O7.InterfaceC1424e interfaceC1424e) {
        if (interfaceC1424e == null) {
            a(97);
        }
        return S(interfaceC1424e) != null;
    }

    public static boolean s0(F8.E e6) {
        if (e6 == null) {
            a(95);
        }
        return !e6.X0() && t0(e6);
    }

    public static boolean t0(F8.E e6) {
        if (e6 == null) {
            a(96);
        }
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        return (interfaceC1427hW instanceof O7.InterfaceC1424e) && r0((O7.InterfaceC1424e) interfaceC1427hW);
    }

    public static boolean u0(O7.InterfaceC1424e interfaceC1424e) {
        if (interfaceC1424e == null) {
            a(108);
        }
        return e(interfaceC1424e, L7.j.a.f6367b) || e(interfaceC1424e, L7.j.a.f6369c);
    }

    public static boolean v0(F8.E e6) {
        return e6 != null && m0(e6, L7.j.a.f6379h);
    }

    public static boolean w0(F8.e0 e0Var, p138n8.d dVar) {
        if (e0Var == null) {
            a(102);
        }
        if (dVar == null) {
            a(103);
        }
        O7.InterfaceC1427h interfaceC1427hW = e0Var.w();
        return (interfaceC1427hW instanceof O7.InterfaceC1424e) && e(interfaceC1427hW, dVar);
    }

    public static boolean x0(F8.E e6) {
        if (e6 == null) {
            a(129);
        }
        return i0(e6, L7.j.a.f6336E0.j());
    }

    public static boolean y0(F8.E e6) {
        if (e6 == null) {
            a(131);
        }
        return i0(e6, L7.j.a.f6340G0.j());
    }

    public static boolean z0(F8.E e6) {
        if (e6 == null) {
            a(132);
        }
        return i0(e6, L7.j.a.f6342H0.j());
    }

    public F8.M B() {
        F8.M mR = R(L7.h.FLOAT);
        if (mR == null) {
            a(61);
        }
        return mR;
    }

    public O7.InterfaceC1424e C(int i6) {
        return p(L7.j.b(i6));
    }

    public F8.M D() {
        F8.M mR = R(L7.h.INT);
        if (mR == null) {
            a(59);
        }
        return mR;
    }

    public O7.InterfaceC1424e E() {
        O7.InterfaceC1424e interfaceC1424eO = o(L7.j.a.f6384j0.l());
        if (interfaceC1424eO == null) {
            a(21);
        }
        return interfaceC1424eO;
    }

    public void E0(R7.x xVar) {
        if (xVar == null) {
            a(1);
        }
        this.f6254f.i(new L7.g.d(xVar));
    }

    public F8.M F() {
        F8.M mR = R(L7.h.LONG);
        if (mR == null) {
            a(60);
        }
        return mR;
    }

    public O7.InterfaceC1424e G() {
        return p("Nothing");
    }

    public F8.M H() {
        F8.M mW = G().w();
        if (mW == null) {
            a(49);
        }
        return mW;
    }

    public F8.M I() {
        F8.M mD1 = i().a1(true);
        if (mD1 == null) {
            a(52);
        }
        return mD1;
    }

    public F8.M J() {
        F8.M mD1 = H().a1(true);
        if (mD1 == null) {
            a(50);
        }
        return mD1;
    }

    public O7.InterfaceC1424e K() {
        return p("Number");
    }

    public F8.M L() {
        F8.M mW = K().w();
        if (mW == null) {
            a(56);
        }
        return mW;
    }

    protected Q7.c M() {
        Q7.c.b bVar = Q7.c.b.f9116a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    public F8.M O(L7.h hVar) {
        if (hVar == null) {
            a(74);
        }
        F8.M m6 = (F8.M) ((L7.g.e) this.f6251c.b()).f6260a.get(hVar);
        if (m6 == null) {
            a(75);
        }
        return m6;
    }

    public F8.M R(L7.h hVar) {
        if (hVar == null) {
            a(54);
        }
        F8.M mW = Q(hVar).w();
        if (mW == null) {
            a(55);
        }
        return mW;
    }

    public F8.M T() {
        F8.M mR = R(L7.h.SHORT);
        if (mR == null) {
            a(58);
        }
        return mR;
    }

    protected E8.n U() {
        E8.n nVar = this.f6254f;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    public O7.InterfaceC1424e V() {
        return p("String");
    }

    public F8.M W() {
        F8.M mW = V().w();
        if (mW == null) {
            a(66);
        }
        return mW;
    }

    public O7.InterfaceC1424e X(int i6) {
        O7.InterfaceC1424e interfaceC1424eO = o(L7.j.f6317q.c(p138n8.f.o(L7.j.d(i6))));
        if (interfaceC1424eO == null) {
            a(18);
        }
        return interfaceC1424eO;
    }

    public O7.InterfaceC1424e Y() {
        return p("Unit");
    }

    public F8.M Z() {
        F8.M mW = Y().w();
        if (mW == null) {
            a(65);
        }
        return mW;
    }

    protected void f(boolean z6) {
        R7.x xVar = new R7.x(f6248g, this.f6254f, this, null);
        this.f6249a = xVar;
        xVar.b1(L7.a.f6239a.a().a(this.f6254f, this.f6249a, v(), M(), g(), z6));
        R7.x xVar2 = this.f6249a;
        xVar2.h1(xVar2);
    }

    protected Q7.a g() {
        Q7.a.C0209a c0209a = Q7.a.C0209a.f9114a;
        if (c0209a == null) {
            a(3);
        }
        return c0209a;
    }

    public O7.InterfaceC1424e h() {
        return p("Any");
    }

    public F8.M i() {
        F8.M mW = h().w();
        if (mW == null) {
            a(51);
        }
        return mW;
    }

    public O7.InterfaceC1424e j() {
        return p("Array");
    }

    public F8.E k(F8.E e6) {
        F8.E eA;
        if (e6 == null) {
            a(68);
        }
        if (c0(e6)) {
            if (e6.U0().size() != 1) {
                throw new java.lang.IllegalStateException();
            }
            F8.E type = ((F8.i0) e6.U0().get(0)).getType();
            if (type == null) {
                a(69);
            }
            return type;
        }
        F8.E eN = F8.q0.n(e6);
        F8.E e10 = (F8.E) ((L7.g.e) this.f6251c.b()).f6262c.get(eN);
        if (e10 != null) {
            return e10;
        }
        O7.G gH = p178r8.f.h(eN);
        if (gH != null && (eA = A(eN, gH)) != null) {
            return eA;
        }
        throw new java.lang.IllegalStateException("not array: " + e6);
    }

    public F8.M l(F8.u0 u0Var, F8.E e6) {
        if (u0Var == null) {
            a(83);
        }
        if (e6 == null) {
            a(84);
        }
        F8.M m6 = m(u0Var, e6, P7.g.f8385d.b());
        if (m6 == null) {
            a(85);
        }
        return m6;
    }

    public F8.M m(F8.u0 u0Var, F8.E e6, P7.g gVar) {
        if (u0Var == null) {
            a(79);
        }
        if (e6 == null) {
            a(80);
        }
        if (gVar == null) {
            a(81);
        }
        F8.M mG = F8.F.g(F8.b0.b(gVar), j(), java.util.Collections.singletonList(new F8.k0(u0Var, e6)));
        if (mG == null) {
            a(82);
        }
        return mG;
    }

    public F8.M n() {
        F8.M mR = R(L7.h.BOOLEAN);
        if (mR == null) {
            a(64);
        }
        return mR;
    }

    public O7.InterfaceC1424e o(p138n8.c cVar) {
        if (cVar == null) {
            a(12);
        }
        O7.InterfaceC1424e interfaceC1424eD = O7.AbstractC1437s.d(r(), cVar, W7.d.FROM_BUILTINS);
        if (interfaceC1424eD == null) {
            a(13);
        }
        return interfaceC1424eD;
    }

    public R7.x r() {
        if (this.f6249a == null) {
            this.f6249a = (R7.x) this.f6250b.b();
        }
        R7.x xVar = this.f6249a;
        if (xVar == null) {
            a(7);
        }
        return xVar;
    }

    public p248y8.h s() {
        p248y8.h hVarU = r().s0(L7.j.f6325y).u();
        if (hVarU == null) {
            a(11);
        }
        return hVarU;
    }

    public F8.M t() {
        F8.M mR = R(L7.h.BYTE);
        if (mR == null) {
            a(57);
        }
        return mR;
    }

    public F8.M u() {
        F8.M mR = R(L7.h.CHAR);
        if (mR == null) {
            a(63);
        }
        return mR;
    }

    protected java.lang.Iterable v() {
        java.util.List listSingletonList = java.util.Collections.singletonList(new M7.a(this.f6254f, r()));
        if (listSingletonList == null) {
            a(5);
        }
        return listSingletonList;
    }

    public O7.InterfaceC1424e w() {
        O7.InterfaceC1424e interfaceC1424eO = o(L7.j.a.f6360V);
        if (interfaceC1424eO == null) {
            a(35);
        }
        return interfaceC1424eO;
    }

    public O7.InterfaceC1424e x() {
        return p("Comparable");
    }

    public F8.M y() {
        F8.M mI = I();
        if (mI == null) {
            a(53);
        }
        return mI;
    }

    public F8.M z() {
        F8.M mR = R(L7.h.DOUBLE);
        if (mR == null) {
            a(62);
        }
        return mR;
    }
}
