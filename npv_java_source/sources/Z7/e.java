package Z7;

/* JADX INFO: loaded from: classes2.dex */
public class e extends R7.G implements Z7.a {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final O7.InterfaceC1420a.InterfaceC0196a f16712i0 = new Z7.e.a();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final O7.InterfaceC1420a.InterfaceC0196a f16713j0 = new Z7.e.b();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private Z7.e.c f16714g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final boolean f16715h0;

    static class a implements O7.InterfaceC1420a.InterfaceC0196a {
        a() {
        }
    }

    static class b implements O7.InterfaceC1420a.InterfaceC0196a {
        b() {
        }
    }

    private enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public final boolean f16721C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public final boolean f16722D;

        c(boolean z6, boolean z10) {
            this.f16721C = z6;
            this.f16722D = z10;
        }

        private static /* synthetic */ void e(int i6) {
            throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        public static Z7.e.c g(boolean z6, boolean z10) {
            Z7.e.c cVar;
            if (z6) {
                cVar = z10 ? STABLE_SYNTHESIZED : STABLE_DECLARED;
            } else {
                cVar = z10 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            }
            if (cVar == null) {
                e(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(O7.InterfaceC1432m interfaceC1432m, O7.Z z6, P7.g gVar, p138n8.f fVar, O7.InterfaceC1421b.a aVar, O7.a0 a0Var, boolean z10) {
        super(interfaceC1432m, z6, gVar, fVar, aVar, a0Var);
        if (interfaceC1432m == null) {
            M(0);
        }
        if (gVar == null) {
            M(1);
        }
        if (fVar == null) {
            M(2);
        }
        if (aVar == null) {
            M(3);
        }
        if (a0Var == null) {
            M(4);
        }
        this.f16714g0 = null;
        this.f16715h0 = z10;
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.String str = (i6 == 13 || i6 == 18 || i6 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 13 || i6 == 18 || i6 == 21) ? 2 : 3];
        switch (i6) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i6 == 13) {
            objArr[1] = "initialize";
        } else if (i6 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i6 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i6) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 13 && i6 != 18 && i6 != 21) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static Z7.e y1(O7.InterfaceC1432m interfaceC1432m, P7.g gVar, p138n8.f fVar, O7.a0 a0Var, boolean z6) {
        if (interfaceC1432m == null) {
            M(5);
        }
        if (gVar == null) {
            M(6);
        }
        if (fVar == null) {
            M(7);
        }
        if (a0Var == null) {
            M(8);
        }
        return new Z7.e(interfaceC1432m, null, gVar, fVar, O7.InterfaceC1421b.a.DECLARATION, a0Var, z6);
    }

    @Override // Z7.a
    /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] */
    public Z7.e n0(F8.E e6, java.util.List list, F8.E e10, p087i7.u uVar) {
        if (list == null) {
            M(19);
        }
        if (e10 == null) {
            M(20);
        }
        Z7.e eVar = (Z7.e) z().m(Z7.h.a(list, n(), this)).q(e10).k(e6 == null ? null : p178r8.e.i(this, e6, P7.g.f8385d.b())).j().n().i();
        if (uVar != null) {
            eVar.d1((O7.InterfaceC1420a.InterfaceC0196a) uVar.c(), uVar.d());
        }
        if (eVar == null) {
            M(21);
        }
        return eVar;
    }

    public void B1(boolean z6, boolean z10) {
        this.f16714g0 = Z7.e.c.g(z6, z10);
    }

    @Override // R7.p, O7.InterfaceC1420a
    public boolean L() {
        return this.f16714g0.f16722D;
    }

    @Override // R7.p
    public boolean Z0() {
        return this.f16714g0.f16721C;
    }

    @Override // R7.G
    public R7.G x1(O7.X x6, O7.X x10, java.util.List list, java.util.List list2, java.util.List list3, F8.E e6, O7.D d6, O7.AbstractC1439u abstractC1439u, java.util.Map map) {
        if (list == null) {
            M(9);
        }
        if (list2 == null) {
            M(10);
        }
        if (list3 == null) {
            M(11);
        }
        if (abstractC1439u == null) {
            M(12);
        }
        R7.G gX1 = super.x1(x6, x10, list, list2, list3, e6, d6, abstractC1439u, map);
        o1(M8.p.f7108a.a(gX1).a());
        if (gX1 == null) {
            M(13);
        }
        return gX1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R7.G, R7.p
    /* JADX INFO: renamed from: z1, reason: merged with bridge method [inline-methods] */
    public Z7.e U0(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1443y interfaceC1443y, O7.InterfaceC1421b.a aVar, p138n8.f fVar, P7.g gVar, O7.a0 a0Var) {
        if (interfaceC1432m == null) {
            M(14);
        }
        if (aVar == null) {
            M(15);
        }
        if (gVar == null) {
            M(16);
        }
        if (a0Var == null) {
            M(17);
        }
        O7.Z z6 = (O7.Z) interfaceC1443y;
        if (fVar == null) {
            fVar = getName();
        }
        Z7.e eVar = new Z7.e(interfaceC1432m, z6, gVar, fVar, aVar, a0Var, this.f16715h0);
        eVar.B1(Z0(), L());
        return eVar;
    }
}
