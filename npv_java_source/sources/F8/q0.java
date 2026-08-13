package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F8.M f2966a = H8.k.d(H8.j.f4500g0, new java.lang.String[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F8.M f2967b = H8.k.d(H8.j.f4486Z, new java.lang.String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F8.M f2968c = new F8.q0.a("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F8.M f2969d = new F8.q0.a("UNIT_EXPECTED_TYPE");

    public static class a extends F8.AbstractC0956q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final java.lang.String f2970D;

        public a(java.lang.String str) {
            this.f2970D = str;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0030  */
        private static /* synthetic */ void i1(int i6) {
            java.lang.String str = (i6 == 1 || i6 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i6 == 1 || i6 == 4) ? 2 : 3];
            if (i6 == 1) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else if (i6 == 2) {
                objArr[0] = "delegate";
            } else if (i6 == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i6 != 4) {
                objArr[0] = "newAttributes";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
            if (i6 == 1) {
                objArr[1] = "toString";
            } else if (i6 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i6 != 1) {
                if (i6 == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i6 == 3) {
                    objArr[2] = "refine";
                } else if (i6 != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i6 != 1 && i6 != 4) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        @Override // F8.t0
        /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
        public F8.M a1(boolean z6) {
            throw new java.lang.IllegalStateException(this.f2970D);
        }

        @Override // F8.t0
        /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
        public F8.M c1(F8.a0 a0Var) {
            if (a0Var == null) {
                i1(0);
            }
            throw new java.lang.IllegalStateException(this.f2970D);
        }

        @Override // F8.AbstractC0956q
        protected F8.M f1() {
            throw new java.lang.IllegalStateException(this.f2970D);
        }

        @Override // F8.AbstractC0956q
        public F8.AbstractC0956q h1(F8.M m6) {
            if (m6 == null) {
                i1(2);
            }
            throw new java.lang.IllegalStateException(this.f2970D);
        }

        @Override // F8.AbstractC0956q
        /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public F8.q0.a g1(G8.g gVar) {
            if (gVar == null) {
                i1(3);
            }
            return this;
        }

        @Override // F8.M
        public java.lang.String toString() {
            java.lang.String str = this.f2970D;
            if (str == null) {
                i1(1);
            }
            return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x011c  */
    private static /* synthetic */ void a(int i6) {
        java.lang.String str;
        int i10;
        if (i6 != 4 && i6 != 9 && i6 != 11 && i6 != 15 && i6 != 17 && i6 != 19 && i6 != 26 && i6 != 35 && i6 != 48 && i6 != 53 && i6 != 6 && i6 != 7) {
            switch (i6) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 4 && i6 != 9 && i6 != 11 && i6 != 15 && i6 != 17 && i6 != 19 && i6 != 26 && i6 != 35 && i6 != 48 && i6 != 53 && i6 != 6 && i6 != 7) {
            switch (i6) {
                case 56:
                case 57:
                case 58:
                case 59:
                    i10 = 2;
                    break;
                default:
                    i10 = 3;
                    break;
            }
        } else {
            i10 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i6 == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i6 == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i6 == 11 || i6 == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i6 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i6 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i6 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i6 == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i6 == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i6 != 53) {
            if (i6 != 6 && i6 != 7) {
                switch (i6) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i6) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 4 && i6 != 9 && i6 != 11 && i6 != 15 && i6 != 17 && i6 != 19 && i6 != 26 && i6 != 35 && i6 != 48 && i6 != 53 && i6 != 6 && i6 != 7) {
            switch (i6) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static boolean b(F8.E e6) {
        if (e6 == null) {
            a(28);
        }
        if (e6.X0()) {
            return true;
        }
        return F8.B.b(e6) && b(F8.B.a(e6).f1());
    }

    public static boolean c(F8.E e6, p237x7.l lVar) {
        if (lVar == null) {
            a(43);
        }
        return d(e6, lVar, null);
    }

    private static boolean d(F8.E e6, p237x7.l lVar, P8.g gVar) {
        if (lVar == null) {
            a(44);
        }
        if (e6 == null) {
            return false;
        }
        F8.t0 t0VarZ0 = e6.Z0();
        if (w(e6)) {
            return ((java.lang.Boolean) lVar.l(t0VarZ0)).booleanValue();
        }
        if (gVar != null && gVar.contains(e6)) {
            return false;
        }
        if (((java.lang.Boolean) lVar.l(t0VarZ0)).booleanValue()) {
            return true;
        }
        if (gVar == null) {
            gVar = P8.g.d();
        }
        gVar.add(e6);
        F8.AbstractC0963y abstractC0963y = t0VarZ0 instanceof F8.AbstractC0963y ? (F8.AbstractC0963y) t0VarZ0 : null;
        if (abstractC0963y != null && (d(abstractC0963y.e1(), lVar, gVar) || d(abstractC0963y.f1(), lVar, gVar))) {
            return true;
        }
        if ((t0VarZ0 instanceof F8.C0954o) && d(((F8.C0954o) t0VarZ0).i1(), lVar, gVar)) {
            return true;
        }
        F8.e0 e0VarW0 = e6.W0();
        if (e0VarW0 instanceof F8.D) {
            java.util.Iterator it = ((F8.D) e0VarW0).u().iterator();
            while (it.hasNext()) {
                if (d((F8.E) it.next(), lVar, gVar)) {
                    return true;
                }
            }
            return false;
        }
        for (F8.i0 i0Var : e6.U0()) {
            if (!i0Var.b()) {
                if (d(i0Var.getType(), lVar, gVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static F8.E e(F8.E e6, F8.E e10, F8.n0 n0Var) {
        if (e6 == null) {
            a(20);
        }
        if (e10 == null) {
            a(21);
        }
        if (n0Var == null) {
            a(22);
        }
        F8.E eP = n0Var.p(e10, F8.u0.INVARIANT);
        if (eP != null) {
            return q(eP, e6.X0());
        }
        return null;
    }

    public static O7.InterfaceC1424e f(F8.E e6) {
        if (e6 == null) {
            a(30);
        }
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        if (interfaceC1427hW instanceof O7.InterfaceC1424e) {
            return (O7.InterfaceC1424e) interfaceC1427hW;
        }
        return null;
    }

    public static java.util.List g(java.util.List list) {
        if (list == null) {
            a(16);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new F8.k0(((O7.f0) it.next()).w()));
        }
        java.util.List listT0 = p097j7.AbstractC6879v.T0(arrayList);
        if (listT0 == null) {
            a(17);
        }
        return listT0;
    }

    public static java.util.List h(F8.E e6) {
        if (e6 == null) {
            a(18);
        }
        F8.n0 n0VarF = F8.n0.f(e6);
        java.util.Collection collectionU = e6.W0().u();
        java.util.ArrayList arrayList = new java.util.ArrayList(collectionU.size());
        java.util.Iterator it = collectionU.iterator();
        while (it.hasNext()) {
            F8.E e10 = e(e6, (F8.E) it.next(), n0VarF);
            if (e10 != null) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    public static O7.f0 i(F8.E e6) {
        if (e6 == null) {
            a(63);
        }
        if (e6.W0().w() instanceof O7.f0) {
            return (O7.f0) e6.W0().w();
        }
        return null;
    }

    public static boolean j(F8.E e6) {
        if (e6 == null) {
            a(29);
        }
        if (e6.W0().w() instanceof O7.InterfaceC1424e) {
            return false;
        }
        java.util.Iterator it = h(e6).iterator();
        while (it.hasNext()) {
            if (l((F8.E) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(F8.E e6) {
        return e6 != null && e6.W0() == f2966a.W0();
    }

    public static boolean l(F8.E e6) {
        if (e6 == null) {
            a(27);
        }
        if (e6.X0()) {
            return true;
        }
        if (F8.B.b(e6) && l(F8.B.a(e6).f1())) {
            return true;
        }
        if (F8.Q.c(e6)) {
            return false;
        }
        if (m(e6)) {
            return j(e6);
        }
        F8.e0 e0VarW0 = e6.W0();
        if (e0VarW0 instanceof F8.D) {
            java.util.Iterator it = e0VarW0.u().iterator();
            while (it.hasNext()) {
                if (l((F8.E) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(F8.E e6) {
        if (e6 == null) {
            a(60);
        }
        if (i(e6) != null) {
            return true;
        }
        e6.W0();
        return false;
    }

    public static F8.E n(F8.E e6) {
        if (e6 == null) {
            a(2);
        }
        return p(e6, false);
    }

    public static F8.E o(F8.E e6) {
        if (e6 == null) {
            a(1);
        }
        return p(e6, true);
    }

    public static F8.E p(F8.E e6, boolean z6) {
        if (e6 == null) {
            a(3);
        }
        F8.t0 t0VarA1 = e6.Z0().a1(z6);
        if (t0VarA1 == null) {
            a(4);
        }
        return t0VarA1;
    }

    public static F8.E q(F8.E e6, boolean z6) {
        if (e6 == null) {
            a(8);
        }
        if (z6) {
            return o(e6);
        }
        if (e6 == null) {
            a(9);
        }
        return e6;
    }

    public static F8.M r(F8.M m6, boolean z6) {
        if (m6 == null) {
            a(5);
        }
        if (!z6) {
            if (m6 == null) {
                a(7);
            }
            return m6;
        }
        F8.M mA1 = m6.a1(true);
        if (mA1 == null) {
            a(6);
        }
        return mA1;
    }

    public static F8.i0 s(O7.f0 f0Var) {
        if (f0Var == null) {
            a(45);
        }
        return new F8.T(f0Var);
    }

    public static F8.i0 t(O7.f0 f0Var, F8.AbstractC0961w abstractC0961w) {
        if (f0Var == null) {
            a(46);
        }
        return abstractC0961w.b() == F8.p0.SUPERTYPE ? new F8.k0(F8.U.b(f0Var)) : new F8.T(f0Var);
    }

    public static F8.M u(F8.e0 e0Var, p248y8.h hVar, p237x7.l lVar) {
        if (e0Var == null) {
            a(12);
        }
        if (hVar == null) {
            a(13);
        }
        if (lVar == null) {
            a(14);
        }
        F8.M mN = F8.F.n(F8.a0.f2872D.i(), e0Var, g(e0Var.x()), false, hVar, lVar);
        if (mN == null) {
            a(15);
        }
        return mN;
    }

    public static F8.M v(O7.InterfaceC1427h interfaceC1427h, p248y8.h hVar, p237x7.l lVar) {
        if (!H8.k.m(interfaceC1427h)) {
            return u(interfaceC1427h.p(), hVar, lVar);
        }
        H8.h hVarD = H8.k.d(H8.j.f4498f0, interfaceC1427h.toString());
        if (hVarD == null) {
            a(11);
        }
        return hVarD;
    }

    public static boolean w(F8.E e6) {
        if (e6 == null) {
            a(0);
        }
        return e6 == f2968c || e6 == f2969d;
    }
}
