package R7;

/* JADX INFO: renamed from: R7.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1508n extends R7.AbstractC1501g {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final F8.e0 f9625K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final p248y8.h f9626L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final E8.i f9627M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final P7.g f9628N;

    /* JADX INFO: renamed from: R7.n$a */
    private class a extends p248y8.i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final E8.g f9629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final E8.g f9630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final E8.i f9631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ R7.C1508n f9632e;

        /* JADX INFO: renamed from: R7.n$a$a, reason: collision with other inner class name */
        class C0222a implements p237x7.l {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ R7.C1508n f9633C;

            C0222a(R7.C1508n c1508n) {
                this.f9633C = c1508n;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public java.util.Collection l(p138n8.f fVar) {
                return R7.C1508n.a.this.m(fVar);
            }
        }

        /* JADX INFO: renamed from: R7.n$a$b */
        class b implements p237x7.l {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ R7.C1508n f9635C;

            b(R7.C1508n c1508n) {
                this.f9635C = c1508n;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public java.util.Collection l(p138n8.f fVar) {
                return R7.C1508n.a.this.n(fVar);
            }
        }

        /* JADX INFO: renamed from: R7.n$a$c */
        class c implements p237x7.a {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ R7.C1508n f9637C;

            c(R7.C1508n c1508n) {
                this.f9637C = c1508n;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public java.util.Collection b() {
                return R7.C1508n.a.this.l();
            }
        }

        /* JADX INFO: renamed from: R7.n$a$d */
        class d extends p178r8.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.util.Set f9639a;

            d(java.util.Set set) {
                this.f9639a = set;
            }

            private static /* synthetic */ void f(int i6) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i6 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i6 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i6 == 1 || i6 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // p178r8.k
            public void a(O7.InterfaceC1421b interfaceC1421b) {
                if (interfaceC1421b == null) {
                    f(0);
                }
                p178r8.l.K(interfaceC1421b, null);
                this.f9639a.add(interfaceC1421b);
            }

            @Override // p178r8.j
            protected void e(O7.InterfaceC1421b interfaceC1421b, O7.InterfaceC1421b interfaceC1421b2) {
                if (interfaceC1421b == null) {
                    f(1);
                }
                if (interfaceC1421b2 == null) {
                    f(2);
                }
            }
        }

        public a(R7.C1508n c1508n, E8.n nVar) {
            if (nVar == null) {
                h(0);
            }
            this.f9632e = c1508n;
            this.f9629b = nVar.b(new R7.C1508n.a.C0222a(c1508n));
            this.f9630c = nVar.b(new R7.C1508n.a.b(c1508n));
            this.f9631d = nVar.d(new R7.C1508n.a.c(c1508n));
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        private static /* synthetic */ void h(int i6) {
            java.lang.String str;
            int i10;
            if (i6 != 3 && i6 != 7 && i6 != 9 && i6 != 12) {
                switch (i6) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        str = "@NotNull method %s.%s must not return null";
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i6 != 3 && i6 != 7 && i6 != 9 && i6 != 12) {
                switch (i6) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
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
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i6 == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i6 == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i6 == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i6 != 12) {
                switch (i6) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i6) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i6 != 3 && i6 != 7 && i6 != 9 && i6 != 12) {
                switch (i6) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        throw new java.lang.IllegalArgumentException(str2);
                }
            }
            throw new java.lang.IllegalStateException(str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.util.Collection l() {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (p138n8.f fVar : (java.util.Set) this.f9632e.f9627M.b()) {
                W7.d dVar = W7.d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(b(fVar, dVar));
                hashSet.addAll(c(fVar, dVar));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.util.Collection m(p138n8.f fVar) {
            if (fVar == null) {
                h(8);
            }
            return p(fVar, o().b(fVar, W7.d.FOR_NON_TRACKED_SCOPE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.util.Collection n(p138n8.f fVar) {
            if (fVar == null) {
                h(4);
            }
            return p(fVar, o().c(fVar, W7.d.FOR_NON_TRACKED_SCOPE));
        }

        private p248y8.h o() {
            p248y8.h hVarU = ((F8.E) this.f9632e.p().u().iterator().next()).u();
            if (hVarU == null) {
                h(9);
            }
            return hVarU;
        }

        private java.util.Collection p(p138n8.f fVar, java.util.Collection collection) {
            if (fVar == null) {
                h(10);
            }
            if (collection == null) {
                h(11);
            }
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            p178r8.l.f54007f.v(fVar, collection, java.util.Collections.emptySet(), this.f9632e, new R7.C1508n.a.d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // p248y8.i, p248y8.h
        public java.util.Set a() {
            java.util.Set set = (java.util.Set) this.f9632e.f9627M.b();
            if (set == null) {
                h(17);
            }
            return set;
        }

        @Override // p248y8.i, p248y8.h
        public java.util.Collection b(p138n8.f fVar, W7.b bVar) {
            if (fVar == null) {
                h(5);
            }
            if (bVar == null) {
                h(6);
            }
            java.util.Collection collection = (java.util.Collection) this.f9629b.l(fVar);
            if (collection == null) {
                h(7);
            }
            return collection;
        }

        @Override // p248y8.i, p248y8.h
        public java.util.Collection c(p138n8.f fVar, W7.b bVar) {
            if (fVar == null) {
                h(1);
            }
            if (bVar == null) {
                h(2);
            }
            java.util.Collection collection = (java.util.Collection) this.f9630c.l(fVar);
            if (collection == null) {
                h(3);
            }
            return collection;
        }

        @Override // p248y8.i, p248y8.h
        public java.util.Set d() {
            java.util.Set set = (java.util.Set) this.f9632e.f9627M.b();
            if (set == null) {
                h(19);
            }
            return set;
        }

        @Override // p248y8.i, p248y8.k
        public java.util.Collection e(p248y8.d dVar, p237x7.l lVar) {
            if (dVar == null) {
                h(13);
            }
            if (lVar == null) {
                h(14);
            }
            java.util.Collection collection = (java.util.Collection) this.f9631d.b();
            if (collection == null) {
                h(15);
            }
            return collection;
        }

        @Override // p248y8.i, p248y8.h
        public java.util.Set f() {
            java.util.Set setEmptySet = java.util.Collections.emptySet();
            if (setEmptySet == null) {
                h(18);
            }
            return setEmptySet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C1508n(E8.n nVar, O7.InterfaceC1424e interfaceC1424e, F8.E e6, p138n8.f fVar, E8.i iVar, P7.g gVar, O7.a0 a0Var) {
        super(nVar, interfaceC1424e, fVar, a0Var, false);
        if (nVar == null) {
            J0(6);
        }
        if (interfaceC1424e == null) {
            J0(7);
        }
        if (e6 == null) {
            J0(8);
        }
        if (fVar == null) {
            J0(9);
        }
        if (iVar == null) {
            J0(10);
        }
        if (gVar == null) {
            J0(11);
        }
        if (a0Var == null) {
            J0(12);
        }
        this.f9628N = gVar;
        this.f9625K = new F8.C0950k(this, java.util.Collections.emptyList(), java.util.Collections.singleton(e6), nVar);
        this.f9626L = new R7.C1508n.a(this, nVar);
        this.f9627M = iVar;
    }

    private static /* synthetic */ void J0(int i6) {
        java.lang.String str;
        int i10;
        switch (i6) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i6) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i6) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i6) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
                throw new java.lang.IllegalStateException(str2);
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    public static R7.C1508n U0(E8.n nVar, O7.InterfaceC1424e interfaceC1424e, p138n8.f fVar, E8.i iVar, P7.g gVar, O7.a0 a0Var) {
        if (nVar == null) {
            J0(0);
        }
        if (interfaceC1424e == null) {
            J0(1);
        }
        if (fVar == null) {
            J0(2);
        }
        if (iVar == null) {
            J0(3);
        }
        if (gVar == null) {
            J0(4);
        }
        if (a0Var == null) {
            J0(5);
        }
        return new R7.C1508n(nVar, interfaceC1424e, interfaceC1424e.w(), fVar, iVar, gVar, a0Var);
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1428i
    public java.util.List A() {
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (listEmptyList == null) {
            J0(22);
        }
        return listEmptyList;
    }

    @Override // O7.InterfaceC1424e
    public boolean E() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public boolean I() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public O7.h0 I0() {
        return null;
    }

    @Override // O7.C
    public boolean N0() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public java.util.Collection O() {
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (listEmptyList == null) {
            J0(23);
        }
        return listEmptyList;
    }

    @Override // O7.InterfaceC1424e
    public boolean P() {
        return false;
    }

    @Override // R7.t
    public p248y8.h Q(G8.g gVar) {
        if (gVar == null) {
            J0(13);
        }
        p248y8.h hVar = this.f9626L;
        if (hVar == null) {
            J0(14);
        }
        return hVar;
    }

    @Override // O7.C
    public boolean R() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public boolean R0() {
        return false;
    }

    @Override // O7.InterfaceC1428i
    public boolean S() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public O7.InterfaceC1423d X() {
        return null;
    }

    @Override // O7.InterfaceC1424e
    public p248y8.h Y() {
        y8.h.b bVar = y8.h.b.f57356b;
        if (bVar == null) {
            J0(15);
        }
        return bVar;
    }

    @Override // O7.InterfaceC1424e
    public O7.InterfaceC1424e a0() {
        return null;
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1436q, O7.C
    public O7.AbstractC1439u h() {
        O7.AbstractC1439u abstractC1439u = O7.AbstractC1438t.f8186e;
        if (abstractC1439u == null) {
            J0(20);
        }
        return abstractC1439u;
    }

    @Override // O7.InterfaceC1424e
    public O7.EnumC1425f j() {
        O7.EnumC1425f enumC1425f = O7.EnumC1425f.ENUM_ENTRY;
        if (enumC1425f == null) {
            J0(18);
        }
        return enumC1425f;
    }

    @Override // P7.a
    public P7.g k() {
        P7.g gVar = this.f9628N;
        if (gVar == null) {
            J0(21);
        }
        return gVar;
    }

    @Override // O7.InterfaceC1424e
    public boolean m() {
        return false;
    }

    @Override // O7.InterfaceC1427h
    public F8.e0 p() {
        F8.e0 e0Var = this.f9625K;
        if (e0Var == null) {
            J0(17);
        }
        return e0Var;
    }

    @Override // O7.InterfaceC1424e, O7.C
    public O7.D q() {
        O7.D d6 = O7.D.FINAL;
        if (d6 == null) {
            J0(19);
        }
        return d6;
    }

    @Override // O7.InterfaceC1424e
    public java.util.Collection r() {
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (listEmptyList == null) {
            J0(16);
        }
        return listEmptyList;
    }

    public java.lang.String toString() {
        return "enum entry " + getName();
    }
}
