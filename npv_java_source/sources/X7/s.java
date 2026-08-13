package X7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O7.AbstractC1439u f16035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O7.AbstractC1439u f16036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final O7.AbstractC1439u f16037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.Map f16038d;

    static class a extends O7.r {
        a(O7.n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // O7.AbstractC1439u
        public boolean e(p257z8.g gVar, O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1432m interfaceC1432m, boolean z6) {
            if (interfaceC1436q == null) {
                g(0);
            }
            if (interfaceC1432m == null) {
                g(1);
            }
            return X7.s.d(interfaceC1436q, interfaceC1432m);
        }
    }

    static class b extends O7.r {
        b(O7.n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // O7.AbstractC1439u
        public boolean e(p257z8.g gVar, O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1432m interfaceC1432m, boolean z6) {
            if (interfaceC1436q == null) {
                g(0);
            }
            if (interfaceC1432m == null) {
                g(1);
            }
            return X7.s.e(gVar, interfaceC1436q, interfaceC1432m);
        }
    }

    static class c extends O7.r {
        c(O7.n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // O7.AbstractC1439u
        public boolean e(p257z8.g gVar, O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1432m interfaceC1432m, boolean z6) {
            if (interfaceC1436q == null) {
                g(0);
            }
            if (interfaceC1432m == null) {
                g(1);
            }
            return X7.s.e(gVar, interfaceC1436q, interfaceC1432m);
        }
    }

    static {
        X7.s.a aVar = new X7.s.a(S7.a.f12614c);
        f16035a = aVar;
        X7.s.b bVar = new X7.s.b(S7.c.f12616c);
        f16036b = bVar;
        X7.s.c cVar = new X7.s.c(S7.b.f12615c);
        f16037c = cVar;
        f16038d = new java.util.HashMap();
        f(aVar);
        f(bVar);
        f(cVar);
    }

    private static /* synthetic */ void a(int i6) {
        java.lang.String str = (i6 == 5 || i6 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 5 || i6 == 6) ? 2 : 3];
        switch (i6) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i6 == 5 || i6 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i6 == 2 || i6 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i6 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i6 != 5 && i6 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 5 && i6 != 6) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1432m interfaceC1432m2) {
        if (interfaceC1432m == null) {
            a(2);
        }
        if (interfaceC1432m2 == null) {
            a(3);
        }
        O7.K k6 = (O7.K) p178r8.f.r(interfaceC1432m, O7.K.class, false);
        O7.K k10 = (O7.K) p178r8.f.r(interfaceC1432m2, O7.K.class, false);
        return (k10 == null || k6 == null || !k6.e().equals(k10.e())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(p257z8.g gVar, O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1436q == null) {
            a(0);
        }
        if (interfaceC1432m == null) {
            a(1);
        }
        if (d(p178r8.f.M(interfaceC1436q), interfaceC1432m)) {
            return true;
        }
        return O7.AbstractC1438t.f8184c.e(gVar, interfaceC1436q, interfaceC1432m, false);
    }

    private static void f(O7.AbstractC1439u abstractC1439u) {
        f16038d.put(abstractC1439u.b(), abstractC1439u);
    }

    public static O7.AbstractC1439u g(O7.n0 n0Var) {
        if (n0Var == null) {
            a(4);
        }
        O7.AbstractC1439u abstractC1439u = (O7.AbstractC1439u) f16038d.get(n0Var);
        if (abstractC1439u != null) {
            return abstractC1439u;
        }
        O7.AbstractC1439u abstractC1439uJ = O7.AbstractC1438t.j(n0Var);
        if (abstractC1439uJ == null) {
            a(5);
        }
        return abstractC1439uJ;
    }
}
