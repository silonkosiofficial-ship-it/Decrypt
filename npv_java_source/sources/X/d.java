package X;

/* JADX INFO: loaded from: classes.dex */
public final class d implements java.util.Set, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p170r.W f15559C;

    static final class a extends p147o7.k implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        java.lang.Object f15560E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f15561F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f15562G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f15563H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f15564I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f15565J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        long f15566K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f15567L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f15568M;

        a(p127m7.e eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x005a  */
        /* JADX WARN: Code duplicated, block: B:21:0x0097 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x0099  */
        /* JADX WARN: Code duplicated, block: B:24:0x009f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:23:0x009d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:14:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:20:0x0094). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0091 -> B:20:0x0094). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = p137n7.b.g()
                int r2 = r0.f15567L
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L33
                if (r2 != r5) goto L2b
                int r2 = r0.f15565J
                int r6 = r0.f15564I
                long r7 = r0.f15566K
                int r9 = r0.f15563H
                int r10 = r0.f15562G
                java.lang.Object r11 = r0.f15561F
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f15560E
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object r13 = r0.f15568M
                R8.j r13 = (R8.j) r13
                p087i7.x.b(r21)
                goto L94
            L2b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L33:
                p087i7.x.b(r21)
                java.lang.Object r2 = r0.f15568M
                R8.j r2 = (R8.j) r2
                X.d r6 = X.d.this
                r.W r6 = r6.d()
                java.lang.Object[] r7 = r6.f53341b
                long[] r6 = r6.f53340a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto La2
                r9 = r3
            L4a:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L9d
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L6b:
                if (r2 >= r6) goto L97
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.32E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L94
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.f15568M = r13
                r0.f15560E = r12
                r0.f15561F = r11
                r0.f15562G = r10
                r0.f15563H = r9
                r0.f15566K = r7
                r0.f15564I = r6
                r0.f15565J = r2
                r0.f15567L = r5
                java.lang.Object r14 = r13.b(r14, r0)
                if (r14 != r1) goto L94
                return r1
            L94:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L6b
            L97:
                if (r6 != r4) goto La2
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
            L9d:
                if (r9 == r8) goto La2
                int r9 = r9 + 1
                goto L4a
            La2:
                i7.M r1 = p087i7.M.f46721a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: X.d.a.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(R8.j jVar, p127m7.e eVar) {
            return ((X.d.a) x(jVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            X.d.a aVar = X.d.this.new a(eVar);
            aVar.f15568M = obj;
            return aVar;
        }
    }

    public d(p170r.W w6) {
        this.f15559C = w6;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f15559C.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        java.util.Collection collection2 = collection;
        if ((collection2 instanceof java.util.Collection) && collection2.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f15559C.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final p170r.W d() {
        return this.f15559C;
    }

    public int e() {
        return this.f15559C.c();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f15559C.d();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return R8.k.a(new X.d.a(null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        return p247y7.AbstractC7341j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return p247y7.AbstractC7341j.b(this, objArr);
    }
}
