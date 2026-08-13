package T5;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T5.a f12957a = new T5.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Map f12958b = j$.util.DesugarCollections.synchronizedMap(new java.util.LinkedHashMap());

    /* JADX INFO: renamed from: T5.a$a, reason: collision with other inner class name */
    private static final class C0277a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p059f9.a f12959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private T5.b f12960b;

        public C0277a(p059f9.a aVar, T5.b bVar) {
            p247y7.AbstractC7350t.f(aVar, "mutex");
            this.f12959a = aVar;
            this.f12960b = bVar;
        }

        public /* synthetic */ C0277a(p059f9.a aVar, T5.b bVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
            this(aVar, (i6 & 2) != 0 ? null : bVar);
        }

        public final p059f9.a a() {
            return this.f12959a;
        }

        public final T5.b b() {
            return this.f12960b;
        }

        public final void c(T5.b bVar) {
            this.f12960b = bVar;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof T5.a.C0277a)) {
                return false;
            }
            T5.a.C0277a c0277a = (T5.a.C0277a) obj;
            return p247y7.AbstractC7350t.b(this.f12959a, c0277a.f12959a) && p247y7.AbstractC7350t.b(this.f12960b, c0277a.f12960b);
        }

        public int hashCode() {
            int iHashCode = this.f12959a.hashCode() * 31;
            T5.b bVar = this.f12960b;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public java.lang.String toString() {
            return "Dependency(mutex=" + this.f12959a + ", subscriber=" + this.f12960b + ')';
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f12961F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f12962G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f12963H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f12964I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        java.lang.Object f12965J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        java.lang.Object f12966K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        /* synthetic */ java.lang.Object f12967L;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        int f12969N;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f12967L = obj;
            this.f12969N |= Integer.MIN_VALUE;
            return T5.a.this.c(this);
        }
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(T5.b.a aVar) {
        java.lang.StringBuilder sb;
        java.lang.String str;
        p247y7.AbstractC7350t.f(aVar, "subscriberName");
        if (aVar == T5.b.a.PERFORMANCE) {
            throw new java.lang.IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        java.util.Map map = f12958b;
        if (map.containsKey(aVar)) {
            sb = new java.lang.StringBuilder();
            sb.append("Dependency ");
            sb.append(aVar);
            str = " already added.";
        } else {
            p247y7.AbstractC7350t.e(map, "dependencies");
            map.put(aVar, new T5.a.C0277a(p059f9.g.a(true), null, 2, 0 == true ? 1 : 0));
            sb = new java.lang.StringBuilder();
            sb.append("Dependency to ");
            sb.append(aVar);
            str = " added.";
        }
        sb.append(str);
        sb.toString();
    }

    private final T5.a.C0277a b(T5.b.a aVar) {
        java.util.Map map = f12958b;
        p247y7.AbstractC7350t.e(map, "dependencies");
        java.lang.Object obj = map.get(aVar);
        if (obj != null) {
            p247y7.AbstractC7350t.e(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (T5.a.C0277a) obj;
        }
        throw new java.lang.IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    public static final void e(T5.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "subscriber");
        T5.b.a aVarB = bVar.b();
        T5.a.C0277a c0277aB = f12957a.b(aVarB);
        if (c0277aB.b() != null) {
            java.lang.String str = "Subscriber " + aVarB + " already registered.";
            return;
        }
        c0277aB.c(bVar);
        java.lang.String str2 = "Subscriber " + aVarB + " registered.";
        p059f9.a.C0508a.c(c0277aB.a(), null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a1 -> B:27:0x00a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(p127m7.e r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof T5.a.b
            if (r0 == 0) goto L13
            r0 = r11
            T5.a$b r0 = (T5.a.b) r0
            int r1 = r0.f12969N
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12969N = r1
            goto L18
        L13:
            T5.a$b r0 = new T5.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f12967L
            java.lang.Object r1 = p137n7.b.g()
            int r2 = r0.f12969N
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f12966K
            java.lang.Object r5 = r0.f12965J
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f12964I
            f9.a r6 = (p059f9.a) r6
            java.lang.Object r7 = r0.f12963H
            T5.b$a r7 = (T5.b.a) r7
            java.lang.Object r8 = r0.f12962G
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f12961F
            java.util.Map r9 = (java.util.Map) r9
            p087i7.x.b(r11)
            goto La2
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            p087i7.x.b(r11)
            java.util.Map r11 = T5.a.f12958b
            java.lang.String r2 = "dependencies"
            p247y7.AbstractC7350t.e(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = p097j7.S.d(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb5
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            T5.b$a r7 = (T5.b.a) r7
            java.lang.Object r11 = r11.getValue()
            T5.a$a r11 = (T5.a.C0277a) r11
            f9.a r6 = r11.a()
            r0.f12961F = r5
            r0.f12962G = r8
            r0.f12963H = r7
            r0.f12964I = r6
            r0.f12965J = r5
            r0.f12966K = r2
            r0.f12969N = r3
            java.lang.Object r11 = r6.c(r4, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            r9 = r5
        La2:
            T5.a r11 = T5.a.f12957a     // Catch: java.lang.Throwable -> Lb0
            T5.b r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.d(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L6b
        Lb0:
            r11 = move-exception
            r6.d(r4)
            throw r11
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.a.c(m7.e):java.lang.Object");
    }

    public final T5.b d(T5.b.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "subscriberName");
        T5.b bVarB = b(aVar).b();
        if (bVarB != null) {
            return bVarB;
        }
        throw new java.lang.IllegalStateException("Subscriber " + aVar + " has not been registered.");
    }
}
