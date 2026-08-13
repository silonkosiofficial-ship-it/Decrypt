package E8;

/* JADX INFO: loaded from: classes2.dex */
public class f implements E8.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.String f2272d = S8.r.r1(E8.f.class.getCanonicalName(), ".", "");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final E8.n f2273e = new E8.f.a("NO_LOCKS", E8.f.InterfaceC0052f.f2282a, E8.e.f2271b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final E8.k f2274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E8.f.InterfaceC0052f f2275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f2276c;

    static class a extends E8.f {
        a(java.lang.String str, E8.f.InterfaceC0052f interfaceC0052f, E8.k kVar) {
            super(str, interfaceC0052f, kVar, null);
        }

        private static /* synthetic */ void j(int i6) {
            java.lang.String str = i6 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i6 != 1 ? 3 : 2];
            if (i6 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i6 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i6 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i6 == 1) {
                throw new java.lang.IllegalStateException(str2);
            }
        }

        @Override // E8.f
        protected E8.f.o p(java.lang.String str, java.lang.Object obj) {
            if (str == null) {
                j(0);
            }
            E8.f.o oVarA = E8.f.o.a();
            if (oVarA == null) {
                j(1);
            }
            return oVarA;
        }
    }

    class b extends E8.f.j {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f2277F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(E8.f fVar, p237x7.a aVar, java.lang.Object obj) {
            super(fVar, aVar);
            this.f2277F = obj;
        }

        private static /* synthetic */ void a(int i6) {
            throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // E8.f.h
        protected E8.f.o f(boolean z6) {
            E8.f.o oVarD = E8.f.o.d(this.f2277F);
            if (oVarD == null) {
                a(0);
            }
            return oVarD;
        }
    }

    class c extends E8.f.k {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.l f2279G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.l f2280H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(E8.f fVar, p237x7.a aVar, p237x7.l lVar, p237x7.l lVar2) {
            super(fVar, aVar);
            this.f2279G = lVar;
            this.f2280H = lVar2;
        }

        private static /* synthetic */ void a(int i6) {
            java.lang.String str = i6 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[i6 != 2 ? 2 : 3];
            if (i6 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i6 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i6 == 2) {
                objArr[2] = "doPostCompute";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i6 == 2) {
                throw new java.lang.IllegalArgumentException(str2);
            }
        }

        @Override // E8.f.h
        protected E8.f.o f(boolean z6) {
            p237x7.l lVar = this.f2279G;
            if (lVar == null) {
                E8.f.o oVarF = super.f(z6);
                if (oVarF == null) {
                    a(0);
                }
                return oVarF;
            }
            E8.f.o oVarD = E8.f.o.d(lVar.l(java.lang.Boolean.valueOf(z6)));
            if (oVarD == null) {
                a(1);
            }
            return oVarD;
        }

        @Override // E8.f.i
        protected void g(java.lang.Object obj) {
            if (obj == null) {
                a(2);
            }
            this.f2280H.l(obj);
        }
    }

    private static class d extends E8.f.e implements E8.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(E8.f fVar, java.util.concurrent.ConcurrentMap concurrentMap) {
            super(fVar, concurrentMap, null);
            if (fVar == null) {
                e(0);
            }
            if (concurrentMap == null) {
                e(1);
            }
        }

        /* synthetic */ d(E8.f fVar, java.util.concurrent.ConcurrentMap concurrentMap, E8.f.a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void e(int i6) {
            java.lang.String str = i6 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i6 != 3 ? 3 : 2];
            if (i6 == 1) {
                objArr[0] = "map";
            } else if (i6 == 2) {
                objArr[0] = "computation";
            } else if (i6 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i6 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i6 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i6 != 3) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i6 == 3) {
                throw new java.lang.IllegalStateException(str2);
            }
        }

        @Override // E8.f.e, E8.a
        public java.lang.Object a(java.lang.Object obj, p237x7.a aVar) {
            if (aVar == null) {
                e(2);
            }
            java.lang.Object objA = super.a(obj, aVar);
            if (objA == null) {
                e(3);
            }
            return objA;
        }
    }

    private static class e extends E8.f.l implements E8.b {

        class a implements p237x7.l {
            a() {
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public java.lang.Object l(E8.f.g gVar) {
                return gVar.f2284b.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(E8.f fVar, java.util.concurrent.ConcurrentMap concurrentMap) {
            super(fVar, concurrentMap, new E8.f.e.a());
            if (fVar == null) {
                e(0);
            }
            if (concurrentMap == null) {
                e(1);
            }
        }

        /* synthetic */ e(E8.f fVar, java.util.concurrent.ConcurrentMap concurrentMap, E8.f.a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void e(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 == 1) {
                objArr[0] = "map";
            } else if (i6 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i6 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public java.lang.Object a(java.lang.Object obj, p237x7.a aVar) {
            if (aVar == null) {
                e(2);
            }
            return l(new E8.f.g(obj, aVar));
        }
    }

    /* JADX INFO: renamed from: E8.f$f, reason: collision with other inner class name */
    public interface InterfaceC0052f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final E8.f.InterfaceC0052f f2282a = new E8.f.InterfaceC0052f.a();

        /* JADX INFO: renamed from: E8.f$f$a */
        static class a implements E8.f.InterfaceC0052f {
            a() {
            }

            private static /* synthetic */ void b(int i6) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // E8.f.InterfaceC0052f
            public java.lang.RuntimeException a(java.lang.Throwable th) {
                if (th == null) {
                    b(0);
                }
                throw P8.d.b(th);
            }
        }

        java.lang.RuntimeException a(java.lang.Throwable th);
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f2283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p237x7.a f2284b;

        public g(java.lang.Object obj, p237x7.a aVar) {
            this.f2283a = obj;
            this.f2284b = aVar;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f2283a.equals(((E8.f.g) obj).f2283a);
        }

        public int hashCode() {
            return this.f2283a.hashCode();
        }
    }

    private static class h implements E8.j {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final E8.f f2285C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p237x7.a f2286D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private volatile java.lang.Object f2287E;

        public h(E8.f fVar, p237x7.a aVar) {
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f2287E = E8.f.n.NOT_COMPUTED;
            this.f2285C = fVar;
            this.f2286D = aVar;
        }

        private static /* synthetic */ void a(int i6) {
            java.lang.String str = (i6 == 2 || i6 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i6 == 2 || i6 == 3) ? 2 : 3];
            if (i6 == 1) {
                objArr[0] = "computable";
            } else if (i6 == 2 || i6 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i6 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i6 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i6 != 2 && i6 != 3) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i6 != 2 && i6 != 3) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0042 A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x004d A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // p237x7.a
        public java.lang.Object b() {
            java.lang.Object objB;
            E8.f.o oVarF;
            java.lang.Object obj = this.f2287E;
            if (!(obj instanceof E8.f.n)) {
                return P8.h.f(obj);
            }
            this.f2285C.f2274a.b();
            try {
                java.lang.Object obj2 = this.f2287E;
                if (obj2 instanceof E8.f.n) {
                    E8.f.n nVar = E8.f.n.COMPUTING;
                    if (obj2 == nVar) {
                        this.f2287E = E8.f.n.RECURSION_WAS_DETECTED;
                        E8.f.o oVarF2 = f(true);
                        if (!oVarF2.c()) {
                            objB = oVarF2.b();
                        } else if (obj2 == E8.f.n.RECURSION_WAS_DETECTED) {
                            oVarF = f(false);
                            if (oVarF.c()) {
                                this.f2287E = nVar;
                                try {
                                    objB = this.f2286D.b();
                                    e(objB);
                                    this.f2287E = objB;
                                } catch (java.lang.Throwable th) {
                                    if (P8.d.a(th)) {
                                        this.f2287E = E8.f.n.NOT_COMPUTED;
                                        throw th;
                                    }
                                    if (this.f2287E == E8.f.n.COMPUTING) {
                                        this.f2287E = P8.h.c(th);
                                    }
                                    throw this.f2285C.f2275b.a(th);
                                }
                            } else {
                                objB = oVarF.b();
                            }
                        } else {
                            this.f2287E = nVar;
                            objB = this.f2286D.b();
                            e(objB);
                            this.f2287E = objB;
                        }
                    } else if (obj2 == E8.f.n.RECURSION_WAS_DETECTED) {
                        oVarF = f(false);
                        if (oVarF.c()) {
                            objB = oVarF.b();
                        } else {
                            this.f2287E = nVar;
                            objB = this.f2286D.b();
                            e(objB);
                            this.f2287E = objB;
                        }
                    } else {
                        this.f2287E = nVar;
                        objB = this.f2286D.b();
                        e(objB);
                        this.f2287E = objB;
                    }
                } else {
                    objB = P8.h.f(obj2);
                }
                this.f2285C.f2274a.a();
                return objB;
            } catch (java.lang.Throwable th2) {
                this.f2285C.f2274a.a();
                throw th2;
            }
        }

        protected void e(java.lang.Object obj) {
        }

        protected E8.f.o f(boolean z6) {
            E8.f.o oVarP = this.f2285C.p("in a lazy value", null);
            if (oVarP == null) {
                a(2);
            }
            return oVarP;
        }

        public boolean h() {
            return (this.f2287E == E8.f.n.NOT_COMPUTED || this.f2287E == E8.f.n.COMPUTING) ? false : true;
        }
    }

    private static abstract class i extends E8.f.h {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private volatile E8.l f2288F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(E8.f fVar, p237x7.a aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f2288F = null;
        }

        private static /* synthetic */ void a(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // E8.f.h, p237x7.a
        public java.lang.Object b() {
            E8.l lVar = this.f2288F;
            return (lVar == null || !lVar.b()) ? super.b() : lVar.a();
        }

        @Override // E8.f.h
        protected final void e(java.lang.Object obj) {
            this.f2288F = new E8.l(obj);
            try {
                g(obj);
            } finally {
                this.f2288F = null;
            }
        }

        protected abstract void g(java.lang.Object obj);
    }

    private static class j extends E8.f.h implements E8.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(E8.f fVar, p237x7.a aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i6) {
            java.lang.String str = i6 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i6 != 2 ? 3 : 2];
            if (i6 == 1) {
                objArr[0] = "computable";
            } else if (i6 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i6 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i6 != 2) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i6 == 2) {
                throw new java.lang.IllegalStateException(str2);
            }
        }

        @Override // E8.f.h, p237x7.a
        public java.lang.Object b() {
            java.lang.Object objB = super.b();
            if (objB == null) {
                a(2);
            }
            return objB;
        }
    }

    private static abstract class k extends E8.f.i implements E8.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(E8.f fVar, p237x7.a aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i6) {
            java.lang.String str = i6 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i6 != 2 ? 3 : 2];
            if (i6 == 1) {
                objArr[0] = "computable";
            } else if (i6 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i6 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i6 != 2) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i6 == 2) {
                throw new java.lang.IllegalStateException(str2);
            }
        }

        @Override // E8.f.i, E8.f.h, p237x7.a
        public java.lang.Object b() {
            java.lang.Object objB = super.b();
            if (objB == null) {
                a(2);
            }
            return objB;
        }
    }

    private static class l implements E8.h {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final E8.f f2289C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final java.util.concurrent.ConcurrentMap f2290D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final p237x7.l f2291E;

        public l(E8.f fVar, java.util.concurrent.ConcurrentMap concurrentMap, p237x7.l lVar) {
            if (fVar == null) {
                e(0);
            }
            if (concurrentMap == null) {
                e(1);
            }
            if (lVar == null) {
                e(2);
            }
            this.f2289C = fVar;
            this.f2290D = concurrentMap;
            this.f2291E = lVar;
        }

        private static /* synthetic */ void e(int i6) {
            java.lang.String str = (i6 == 3 || i6 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i6 == 3 || i6 == 4) ? 2 : 3];
            if (i6 == 1) {
                objArr[0] = "map";
            } else if (i6 == 2) {
                objArr[0] = "compute";
            } else if (i6 == 3 || i6 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i6 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i6 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i6 != 3 && i6 != 4) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i6 != 3 && i6 != 4) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        private java.lang.AssertionError f(java.lang.Object obj, java.lang.Object obj2) {
            return (java.lang.AssertionError) E8.f.q(new java.lang.AssertionError("Inconsistent key detected. " + E8.f.n.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f2289C));
        }

        private java.lang.AssertionError g(java.lang.Object obj, java.lang.Object obj2) {
            java.lang.AssertionError assertionError = (java.lang.AssertionError) E8.f.q(new java.lang.AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f2289C));
            if (assertionError == null) {
                e(4);
            }
            return assertionError;
        }

        private java.lang.AssertionError m(java.lang.Object obj, java.lang.Throwable th) {
            return (java.lang.AssertionError) E8.f.q(new java.lang.AssertionError("Unable to remove " + obj + " under " + this.f2289C, th));
        }

        protected E8.f.o k(java.lang.Object obj, boolean z6) {
            E8.f.o oVarP = this.f2289C.p("", obj);
            if (oVarP == null) {
                e(3);
            }
            return oVarP;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
  0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v21 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #3 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:24:0x0050, B:34:0x007b, B:37:0x0087, B:39:0x008b, B:40:0x008f, B:41:0x0090, B:42:0x0092, B:47:0x009b, B:49:0x00a9, B:50:0x00ad, B:51:0x00ae, B:52:0x00b8, B:54:0x00be, B:55:0x00c8, B:57:0x00ca, B:58:0x00ce, B:44:0x0094, B:45:0x0098, B:36:0x0081, B:53:0x00b9, B:27:0x0056, B:31:0x0075, B:32:0x0079), top: B:67:0x0018, inners: #0, #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: all -> 0x003b, TryCatch #3 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:24:0x0050, B:34:0x007b, B:37:0x0087, B:39:0x008b, B:40:0x008f, B:41:0x0090, B:42:0x0092, B:47:0x009b, B:49:0x00a9, B:50:0x00ad, B:51:0x00ae, B:52:0x00b8, B:54:0x00be, B:55:0x00c8, B:57:0x00ca, B:58:0x00ce, B:44:0x0094, B:45:0x0098, B:36:0x0081, B:53:0x00b9, B:27:0x0056, B:31:0x0075, B:32:0x0079), top: B:67:0x0018, inners: #0, #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x004d  */
        /* JADX WARN: Code duplicated, block: B:24:0x0050 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #3 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:24:0x0050, B:34:0x007b, B:37:0x0087, B:39:0x008b, B:40:0x008f, B:41:0x0090, B:42:0x0092, B:47:0x009b, B:49:0x00a9, B:50:0x00ad, B:51:0x00ae, B:52:0x00b8, B:54:0x00be, B:55:0x00c8, B:57:0x00ca, B:58:0x00ce, B:44:0x0094, B:45:0x0098, B:36:0x0081, B:53:0x00b9, B:27:0x0056, B:31:0x0075, B:32:0x0079), top: B:67:0x0018, inners: #0, #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0055  */
        /* JADX WARN: Code duplicated, block: B:29:0x006d  */
        /* JADX WARN: Code duplicated, block: B:31:0x0075 A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #2 {all -> 0x007a, blocks: (B:27:0x0056, B:31:0x0075, B:32:0x0079), top: B:65:0x0056, outer: #3 }] */
        @Override // p237x7.l
        public java.lang.Object l(java.lang.Object obj) {
            java.lang.AssertionError assertionErrorG;
            java.lang.Object objL;
            java.lang.Object objPut;
            java.lang.Object objD;
            E8.f.o oVarK;
            java.lang.Object obj2 = this.f2290D.get(obj);
            if (obj2 != null && obj2 != E8.f.n.COMPUTING) {
                return P8.h.d(obj2);
            }
            this.f2289C.f2274a.b();
            try {
                java.lang.Object obj3 = this.f2290D.get(obj);
                E8.f.n nVar = E8.f.n.COMPUTING;
                if (obj3 == nVar) {
                    obj3 = E8.f.n.RECURSION_WAS_DETECTED;
                    oVarK = k(obj, true);
                    if (oVarK.c()) {
                        if (obj3 == E8.f.n.RECURSION_WAS_DETECTED) {
                            oVarK = k(obj, false);
                            if (!oVarK.c()) {
                                objD = oVarK.b();
                            }
                        }
                        if (obj3 != null) {
                            assertionErrorG = null;
                            try {
                                this.f2290D.put(obj, nVar);
                                objL = this.f2291E.l(obj);
                                objPut = this.f2290D.put(obj, P8.h.b(objL));
                                if (objPut == nVar) {
                                    this.f2289C.f2274a.a();
                                    return objL;
                                }
                                assertionErrorG = g(obj, objPut);
                                throw assertionErrorG;
                            } catch (java.lang.Throwable th) {
                                if (P8.d.a(th)) {
                                    try {
                                        java.lang.Object objRemove = this.f2290D.remove(obj);
                                        if (objRemove != E8.f.n.COMPUTING) {
                                            throw f(obj, objRemove);
                                        }
                                        throw th;
                                    } catch (java.lang.Throwable th2) {
                                        throw m(obj, th2);
                                    }
                                }
                                if (th != assertionErrorG) {
                                    java.lang.Object objPut2 = this.f2290D.put(obj, P8.h.c(th));
                                    if (objPut2 != E8.f.n.COMPUTING) {
                                        throw g(obj, objPut2);
                                    }
                                    throw this.f2289C.f2275b.a(th);
                                }
                                try {
                                    this.f2290D.remove(obj);
                                    throw this.f2289C.f2275b.a(th);
                                } catch (java.lang.Throwable th3) {
                                    throw m(obj, th3);
                                }
                            }
                            this.f2289C.f2274a.a();
                            throw th;
                        }
                        objD = P8.h.d(obj3);
                    } else {
                        objD = oVarK.b();
                    }
                } else {
                    if (obj3 == E8.f.n.RECURSION_WAS_DETECTED) {
                        oVarK = k(obj, false);
                        if (!oVarK.c()) {
                            objD = oVarK.b();
                        }
                    }
                    if (obj3 != null) {
                        assertionErrorG = null;
                        this.f2290D.put(obj, nVar);
                        objL = this.f2291E.l(obj);
                        objPut = this.f2290D.put(obj, P8.h.b(objL));
                        if (objPut == nVar) {
                            this.f2289C.f2274a.a();
                            return objL;
                        }
                        assertionErrorG = g(obj, objPut);
                        throw assertionErrorG;
                        this.f2289C.f2274a.a();
                        throw th;
                    }
                    objD = P8.h.d(obj3);
                }
                this.f2289C.f2274a.a();
                return objD;
            } catch (java.lang.Throwable th4) {
                this.f2289C.f2274a.a();
                throw th4;
            }
        }

        @Override // E8.h
        public boolean q(java.lang.Object obj) {
            java.lang.Object obj2 = this.f2290D.get(obj);
            return (obj2 == null || obj2 == E8.f.n.COMPUTING) ? false : true;
        }
    }

    private static class m extends E8.f.l implements E8.g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(E8.f fVar, java.util.concurrent.ConcurrentMap concurrentMap, p237x7.l lVar) {
            super(fVar, concurrentMap, lVar);
            if (fVar == null) {
                e(0);
            }
            if (concurrentMap == null) {
                e(1);
            }
            if (lVar == null) {
                e(2);
            }
        }

        private static /* synthetic */ void e(int i6) {
            java.lang.String str = i6 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i6 != 3 ? 3 : 2];
            if (i6 == 1) {
                objArr[0] = "map";
            } else if (i6 == 2) {
                objArr[0] = "compute";
            } else if (i6 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i6 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i6 != 3) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i6 == 3) {
                throw new java.lang.IllegalStateException(str2);
            }
        }

        @Override // E8.f.l, p237x7.l
        public java.lang.Object l(java.lang.Object obj) {
            java.lang.Object objL = super.l(obj);
            if (objL == null) {
                e(3);
            }
            return objL;
        }
    }

    private enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    private static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f2296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f2297b;

        private o(java.lang.Object obj, boolean z6) {
            this.f2296a = obj;
            this.f2297b = z6;
        }

        public static E8.f.o a() {
            return new E8.f.o(null, true);
        }

        public static E8.f.o d(java.lang.Object obj) {
            return new E8.f.o(obj, false);
        }

        public java.lang.Object b() {
            return this.f2296a;
        }

        public boolean c() {
            return this.f2297b;
        }

        public java.lang.String toString() {
            return c() ? "FALL_THROUGH" : java.lang.String.valueOf(this.f2296a);
        }
    }

    public f(java.lang.String str) {
        this(str, (java.lang.Runnable) null, (p237x7.l) null);
    }

    private f(java.lang.String str, E8.f.InterfaceC0052f interfaceC0052f, E8.k kVar) {
        if (str == null) {
            j(4);
        }
        if (interfaceC0052f == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f2274a = kVar;
        this.f2275b = interfaceC0052f;
        this.f2276c = str;
    }

    /* synthetic */ f(java.lang.String str, E8.f.InterfaceC0052f interfaceC0052f, E8.k kVar, E8.f.a aVar) {
        this(str, interfaceC0052f, kVar);
    }

    public f(java.lang.String str, java.lang.Runnable runnable, p237x7.l lVar) {
        this(str, E8.f.InterfaceC0052f.f2282a, E8.k.f2298a.a(runnable, lVar));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    private static /* synthetic */ void j(int i6) {
        java.lang.String str = (i6 == 10 || i6 == 13 || i6 == 20 || i6 == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 10 || i6 == 13 || i6 == 20 || i6 == 37) ? 2 : 3];
        if (i6 == 1 || i6 == 3 || i6 == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i6 != 6) {
            switch (i6) {
                case 8:
                    objArr[0] = "exceptionHandlingStrategy";
                    break;
                case 9:
                case 11:
                case 14:
                case 16:
                case 19:
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    objArr[0] = "compute";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                case 12:
                case 17:
                case 25:
                case 27:
                    objArr[0] = "onRecursiveCall";
                    break;
                case 15:
                case 18:
                case 22:
                    objArr[0] = "map";
                    break;
                case 23:
                case 24:
                case 26:
                case 28:
                case 30:
                case 31:
                case 32:
                case 34:
                    objArr[0] = "computable";
                    break;
                case 29:
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                    objArr[0] = "postCompute";
                    break;
                case 35:
                    objArr[0] = "source";
                    break;
                case 36:
                    objArr[0] = "throwable";
                    break;
                default:
                    objArr[0] = "debugText";
                    break;
            }
        } else {
            objArr[0] = "lock";
        }
        if (i6 == 10 || i6 == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i6 == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i6 != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i6) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                break;
            case 19:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case 25:
                objArr[2] = "createLazyValue";
                break;
            case 26:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case 31:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 10 && i6 != 13 && i6 != 20 && i6 != 37) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    private static java.util.concurrent.ConcurrentMap m() {
        return new j$.util.concurrent.ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Throwable q(java.lang.Throwable th) {
        if (th == null) {
            j(36);
        }
        java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i6 = 0;
        while (i6 < length) {
            if (!stackTrace[i6].getClassName().startsWith(f2272d)) {
                java.util.List listSubList = java.util.Arrays.asList(stackTrace).subList(i6, length);
                th.setStackTrace((java.lang.StackTraceElement[]) listSubList.toArray(new java.lang.StackTraceElement[listSubList.size()]));
                return th;
            }
            i6++;
        }
        i6 = -1;
        java.util.List listSubList2 = java.util.Arrays.asList(stackTrace).subList(i6, length);
        th.setStackTrace((java.lang.StackTraceElement[]) listSubList2.toArray(new java.lang.StackTraceElement[listSubList2.size()]));
        return th;
    }

    @Override // E8.n
    public E8.b a() {
        return new E8.f.e(this, m(), null);
    }

    @Override // E8.n
    public E8.g b(p237x7.l lVar) {
        if (lVar == null) {
            j(9);
        }
        E8.g gVarN = n(lVar, m());
        if (gVarN == null) {
            j(10);
        }
        return gVarN;
    }

    @Override // E8.n
    public E8.a c() {
        return new E8.f.d(this, m(), null);
    }

    @Override // E8.n
    public E8.i d(p237x7.a aVar) {
        if (aVar == null) {
            j(23);
        }
        return new E8.f.j(this, aVar);
    }

    @Override // E8.n
    public E8.i e(p237x7.a aVar, java.lang.Object obj) {
        if (aVar == null) {
            j(26);
        }
        if (obj == null) {
            j(27);
        }
        return new E8.f.b(this, aVar, obj);
    }

    @Override // E8.n
    public E8.j f(p237x7.a aVar) {
        if (aVar == null) {
            j(30);
        }
        return new E8.f.h(this, aVar);
    }

    @Override // E8.n
    public E8.i g(p237x7.a aVar, p237x7.l lVar, p237x7.l lVar2) {
        if (aVar == null) {
            j(28);
        }
        if (lVar2 == null) {
            j(29);
        }
        return new E8.f.c(this, aVar, lVar, lVar2);
    }

    @Override // E8.n
    public E8.h h(p237x7.l lVar) {
        if (lVar == null) {
            j(19);
        }
        E8.h hVarO = o(lVar, m());
        if (hVarO == null) {
            j(20);
        }
        return hVarO;
    }

    @Override // E8.n
    public java.lang.Object i(p237x7.a aVar) {
        if (aVar == null) {
            j(34);
        }
        this.f2274a.b();
        try {
            java.lang.Object objB = aVar.b();
            this.f2274a.a();
            return objB;
        } catch (java.lang.Throwable th) {
            try {
                throw this.f2275b.a(th);
            } catch (java.lang.Throwable th2) {
                this.f2274a.a();
                throw th2;
            }
        }
    }

    public E8.g n(p237x7.l lVar, java.util.concurrent.ConcurrentMap concurrentMap) {
        if (lVar == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new E8.f.m(this, concurrentMap, lVar);
    }

    public E8.h o(p237x7.l lVar, java.util.concurrent.ConcurrentMap concurrentMap) {
        if (lVar == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new E8.f.l(this, concurrentMap, lVar);
    }

    protected E8.f.o p(java.lang.String str, java.lang.Object obj) {
        java.lang.String str2;
        if (str == null) {
            j(35);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        throw ((java.lang.AssertionError) q(new java.lang.AssertionError(sb.toString())));
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + "@" + java.lang.Integer.toHexString(hashCode()) + " (" + this.f2276c + ")";
    }
}
