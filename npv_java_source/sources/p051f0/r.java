package p051f0;

/* JADX INFO: loaded from: classes.dex */
public final class r implements p051f0.y, java.util.List, java.util.RandomAccess, p256z7.d {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p051f0.A f44865C;

    public static final class a extends p051f0.A {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Y.f f44866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f44867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f44868e;

        public a(Y.f fVar) {
            this.f44866c = fVar;
        }

        @Override // p051f0.A
        public void c(p051f0.A a6) {
            synchronized (p051f0.s.f44872a) {
                p247y7.AbstractC7350t.d(a6, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.f44866c = ((f0.r.a) a6).f44866c;
                this.f44867d = ((f0.r.a) a6).f44867d;
                this.f44868e = ((f0.r.a) a6).f44868e;
                p087i7.M m6 = p087i7.M.f46721a;
            }
        }

        @Override // p051f0.A
        public p051f0.A d() {
            return new f0.r.a(this.f44866c);
        }

        public final Y.f i() {
            return this.f44866c;
        }

        public final int j() {
            return this.f44867d;
        }

        public final int k() {
            return this.f44868e;
        }

        public final void l(Y.f fVar) {
            this.f44866c = fVar;
        }

        public final void m(int i6) {
            this.f44867d = i6;
        }

        public final void n(int i6) {
            this.f44868e = i6;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f44869D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.util.Collection f44870E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i6, java.util.Collection collection) {
            super(1);
            this.f44869D = i6;
            this.f44870E = collection;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.util.List list) {
            return java.lang.Boolean.valueOf(list.addAll(this.f44869D, this.f44870E));
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.Collection f44871D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(java.util.Collection collection) {
            super(1);
            this.f44871D = collection;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.util.List list) {
            return java.lang.Boolean.valueOf(list.retainAll(this.f44871D));
        }
    }

    public r() {
        Y.f fVarA = Y.a.a();
        f0.r.a aVar = new f0.r.a(fVarA);
        if (p051f0.k.f44821e.e()) {
            f0.r.a aVar2 = new f0.r.a(fVarA);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f44865C = aVar;
    }

    private final boolean o(p237x7.l lVar) {
        int iJ;
        Y.f fVarI;
        java.lang.Object objL;
        p051f0.k kVarC;
        boolean z6;
        do {
            synchronized (p051f0.s.f44872a) {
                p051f0.A aE = e();
                p247y7.AbstractC7350t.d(aE, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                f0.r.a aVar = (f0.r.a) p051f0.p.F((f0.r.a) aE);
                iJ = aVar.j();
                fVarI = aVar.i();
                p087i7.M m6 = p087i7.M.f46721a;
            }
            p247y7.AbstractC7350t.c(fVarI);
            Y.f.a aVarBuilder = fVarI.builder();
            objL = lVar.l(aVarBuilder);
            Y.f fVarI2 = aVarBuilder.i();
            if (p247y7.AbstractC7350t.b(fVarI2, fVarI)) {
                break;
            }
            p051f0.A aE2 = e();
            p247y7.AbstractC7350t.d(aE2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            f0.r.a aVar2 = (f0.r.a) aE2;
            p051f0.p.J();
            synchronized (p051f0.p.I()) {
                kVarC = p051f0.k.f44821e.c();
                f0.r.a aVar3 = (f0.r.a) p051f0.p.h0(aVar2, this, kVarC);
                synchronized (p051f0.s.f44872a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(fVarI2);
                        z6 = true;
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z6 = false;
                    }
                }
            }
            p051f0.p.Q(kVarC, this);
        } while (!z6);
        return ((java.lang.Boolean) objL).booleanValue();
    }

    @Override // p051f0.y
    public void C(p051f0.A a6) {
        a6.g(e());
        p247y7.AbstractC7350t.d(a6, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.f44865C = (f0.r.a) a6;
    }

    public java.lang.Object D(int i6) {
        int iJ;
        Y.f fVarI;
        p051f0.k kVarC;
        boolean z6;
        java.lang.Object obj = get(i6);
        do {
            synchronized (p051f0.s.f44872a) {
                p051f0.A aE = e();
                p247y7.AbstractC7350t.d(aE, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                f0.r.a aVar = (f0.r.a) p051f0.p.F((f0.r.a) aE);
                iJ = aVar.j();
                fVarI = aVar.i();
                p087i7.M m6 = p087i7.M.f46721a;
            }
            p247y7.AbstractC7350t.c(fVarI);
            Y.f fVarY = fVarI.y(i6);
            if (p247y7.AbstractC7350t.b(fVarY, fVarI)) {
                break;
            }
            p051f0.A aE2 = e();
            p247y7.AbstractC7350t.d(aE2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            f0.r.a aVar2 = (f0.r.a) aE2;
            p051f0.p.J();
            synchronized (p051f0.p.I()) {
                kVarC = p051f0.k.f44821e.c();
                f0.r.a aVar3 = (f0.r.a) p051f0.p.h0(aVar2, this, kVarC);
                synchronized (p051f0.s.f44872a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(fVarY);
                        z6 = true;
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z6 = false;
                    }
                }
            }
            p051f0.p.Q(kVarC, this);
        } while (!z6);
        return obj;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0083 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(int r8, int r9) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = p051f0.s.a()
            monitor-enter(r0)
            f0.A r1 = r7.e()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            p247y7.AbstractC7350t.d(r1, r2)     // Catch: java.lang.Throwable -> L8a
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L8a
            f0.A r1 = p051f0.p.F(r1)     // Catch: java.lang.Throwable -> L8a
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L8a
            int r2 = r1.j()     // Catch: java.lang.Throwable -> L8a
            Y.f r1 = r1.i()     // Catch: java.lang.Throwable -> L8a
            i7.M r3 = p087i7.M.f46721a     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r0)
            p247y7.AbstractC7350t.c(r1)
            Y.f$a r0 = r1.builder()
            java.util.List r3 = r0.subList(r8, r9)
            r3.clear()
            Y.f r0 = r0.i()
            boolean r1 = p247y7.AbstractC7350t.b(r0, r1)
            if (r1 != 0) goto L89
            f0.A r1 = r7.e()
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            p247y7.AbstractC7350t.d(r1, r3)
            f0.r$a r1 = (f0.r.a) r1
            p051f0.p.J()
            java.lang.Object r3 = p051f0.p.I()
            monitor-enter(r3)
            f0.k$a r4 = p051f0.k.f44821e     // Catch: java.lang.Throwable -> L83
            f0.k r4 = r4.c()     // Catch: java.lang.Throwable -> L83
            f0.A r1 = p051f0.p.h0(r1, r7, r4)     // Catch: java.lang.Throwable -> L83
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L83
            java.lang.Object r5 = p051f0.s.a()     // Catch: java.lang.Throwable -> L83
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L83
            int r6 = r1.j()     // Catch: java.lang.Throwable -> L78
            if (r6 != r2) goto L7a
            r1.l(r0)     // Catch: java.lang.Throwable -> L78
            int r0 = r1.j()     // Catch: java.lang.Throwable -> L78
            r2 = 1
            int r0 = r0 + r2
            r1.m(r0)     // Catch: java.lang.Throwable -> L78
            int r0 = r1.k()     // Catch: java.lang.Throwable -> L78
            int r0 = r0 + r2
            r1.n(r0)     // Catch: java.lang.Throwable -> L78
            goto L7b
        L78:
            r8 = move-exception
            goto L85
        L7a:
            r2 = 0
        L7b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r3)
            p051f0.p.Q(r4, r7)
            if (r2 == 0) goto L0
            goto L89
        L83:
            r8 = move-exception
            goto L87
        L85:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
            throw r8     // Catch: java.lang.Throwable -> L83
        L87:
            monitor-exit(r3)
            throw r8
        L89:
            return
        L8a:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p051f0.r.E(int, int):void");
    }

    public final int M(java.util.Collection collection, int i6, int i10) {
        int iJ;
        Y.f fVarI;
        p051f0.k kVarC;
        boolean z6;
        int size = size();
        do {
            synchronized (p051f0.s.f44872a) {
                p051f0.A aE = e();
                p247y7.AbstractC7350t.d(aE, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                f0.r.a aVar = (f0.r.a) p051f0.p.F((f0.r.a) aE);
                iJ = aVar.j();
                fVarI = aVar.i();
                p087i7.M m6 = p087i7.M.f46721a;
            }
            p247y7.AbstractC7350t.c(fVarI);
            Y.f.a aVarBuilder = fVarI.builder();
            aVarBuilder.subList(i6, i10).retainAll(collection);
            Y.f fVarI2 = aVarBuilder.i();
            if (p247y7.AbstractC7350t.b(fVarI2, fVarI)) {
                break;
            }
            p051f0.A aE2 = e();
            p247y7.AbstractC7350t.d(aE2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            f0.r.a aVar2 = (f0.r.a) aE2;
            p051f0.p.J();
            synchronized (p051f0.p.I()) {
                kVarC = p051f0.k.f44821e.c();
                f0.r.a aVar3 = (f0.r.a) p051f0.p.h0(aVar2, this, kVarC);
                synchronized (p051f0.s.f44872a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(fVarI2);
                        z6 = true;
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z6 = false;
                    }
                }
            }
            p051f0.p.Q(kVarC, this);
        } while (!z6);
        return size - size();
    }

    public final java.util.List N() {
        return d().i();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0079 */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void add(int r8, java.lang.Object r9) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = p051f0.s.a()
            monitor-enter(r0)
            f0.A r1 = r7.e()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            p247y7.AbstractC7350t.d(r1, r2)     // Catch: java.lang.Throwable -> L7f
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L7f
            f0.A r1 = p051f0.p.F(r1)     // Catch: java.lang.Throwable -> L7f
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L7f
            int r2 = r1.j()     // Catch: java.lang.Throwable -> L7f
            Y.f r1 = r1.i()     // Catch: java.lang.Throwable -> L7f
            i7.M r3 = p087i7.M.f46721a     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r0)
            p247y7.AbstractC7350t.c(r1)
            Y.f r0 = r1.add(r8, r9)
            boolean r1 = p247y7.AbstractC7350t.b(r0, r1)
            if (r1 == 0) goto L2f
            goto L78
        L2f:
            f0.A r1 = r7.e()
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            p247y7.AbstractC7350t.d(r1, r3)
            f0.r$a r1 = (f0.r.a) r1
            p051f0.p.J()
            java.lang.Object r3 = p051f0.p.I()
            monitor-enter(r3)
            f0.k$a r4 = p051f0.k.f44821e     // Catch: java.lang.Throwable -> L79
            f0.k r4 = r4.c()     // Catch: java.lang.Throwable -> L79
            f0.A r1 = p051f0.p.h0(r1, r7, r4)     // Catch: java.lang.Throwable -> L79
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L79
            java.lang.Object r5 = p051f0.s.a()     // Catch: java.lang.Throwable -> L79
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L79
            int r6 = r1.j()     // Catch: java.lang.Throwable -> L6e
            if (r6 != r2) goto L70
            r1.l(r0)     // Catch: java.lang.Throwable -> L6e
            int r0 = r1.k()     // Catch: java.lang.Throwable -> L6e
            r2 = 1
            int r0 = r0 + r2
            r1.n(r0)     // Catch: java.lang.Throwable -> L6e
            int r0 = r1.j()     // Catch: java.lang.Throwable -> L6e
            int r0 = r0 + r2
            r1.m(r0)     // Catch: java.lang.Throwable -> L6e
            goto L71
        L6e:
            r8 = move-exception
            goto L7b
        L70:
            r2 = 0
        L71:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r3)
            p051f0.p.Q(r4, r7)
            if (r2 == 0) goto L0
        L78:
            return
        L79:
            r8 = move-exception
            goto L7d
        L7b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L79
            throw r8     // Catch: java.lang.Throwable -> L79
        L7d:
            monitor-exit(r3)
            throw r8
        L7f:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p051f0.r.add(int, java.lang.Object):void");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007b */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean add(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = p051f0.s.a()
            monitor-enter(r0)
            f0.A r1 = r9.e()     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            p247y7.AbstractC7350t.d(r1, r2)     // Catch: java.lang.Throwable -> L81
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L81
            f0.A r1 = p051f0.p.F(r1)     // Catch: java.lang.Throwable -> L81
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L81
            int r2 = r1.j()     // Catch: java.lang.Throwable -> L81
            Y.f r1 = r1.i()     // Catch: java.lang.Throwable -> L81
            i7.M r3 = p087i7.M.f46721a     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)
            p247y7.AbstractC7350t.c(r1)
            Y.f r0 = r1.add(r10)
            boolean r1 = p247y7.AbstractC7350t.b(r0, r1)
            r3 = 0
            if (r1 == 0) goto L30
            goto L7a
        L30:
            f0.A r1 = r9.e()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            p247y7.AbstractC7350t.d(r1, r4)
            f0.r$a r1 = (f0.r.a) r1
            p051f0.p.J()
            java.lang.Object r4 = p051f0.p.I()
            monitor-enter(r4)
            f0.k$a r5 = p051f0.k.f44821e     // Catch: java.lang.Throwable -> L7b
            f0.k r5 = r5.c()     // Catch: java.lang.Throwable -> L7b
            f0.A r1 = p051f0.p.h0(r1, r9, r5)     // Catch: java.lang.Throwable -> L7b
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = p051f0.s.a()     // Catch: java.lang.Throwable -> L7b
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L7b
            int r7 = r1.j()     // Catch: java.lang.Throwable -> L70
            r8 = 1
            if (r7 != r2) goto L72
            r1.l(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.k()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.n(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.j()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.m(r0)     // Catch: java.lang.Throwable -> L70
            r3 = r8
            goto L72
        L70:
            r10 = move-exception
            goto L7d
        L72:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r4)
            p051f0.p.Q(r5, r9)
            if (r3 == 0) goto L0
            r3 = r8
        L7a:
            return r3
        L7b:
            r10 = move-exception
            goto L7f
        L7d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            throw r10     // Catch: java.lang.Throwable -> L7b
        L7f:
            monitor-exit(r4)
            throw r10
        L81:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p051f0.r.add(java.lang.Object):boolean");
    }

    @Override // java.util.List
    public boolean addAll(int i6, java.util.Collection collection) {
        return o(new f0.r.b(i6, collection));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007b */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean addAll(java.util.Collection r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = p051f0.s.a()
            monitor-enter(r0)
            f0.A r1 = r9.e()     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            p247y7.AbstractC7350t.d(r1, r2)     // Catch: java.lang.Throwable -> L81
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L81
            f0.A r1 = p051f0.p.F(r1)     // Catch: java.lang.Throwable -> L81
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L81
            int r2 = r1.j()     // Catch: java.lang.Throwable -> L81
            Y.f r1 = r1.i()     // Catch: java.lang.Throwable -> L81
            i7.M r3 = p087i7.M.f46721a     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)
            p247y7.AbstractC7350t.c(r1)
            Y.f r0 = r1.addAll(r10)
            boolean r1 = p247y7.AbstractC7350t.b(r0, r1)
            r3 = 0
            if (r1 == 0) goto L30
            goto L7a
        L30:
            f0.A r1 = r9.e()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            p247y7.AbstractC7350t.d(r1, r4)
            f0.r$a r1 = (f0.r.a) r1
            p051f0.p.J()
            java.lang.Object r4 = p051f0.p.I()
            monitor-enter(r4)
            f0.k$a r5 = p051f0.k.f44821e     // Catch: java.lang.Throwable -> L7b
            f0.k r5 = r5.c()     // Catch: java.lang.Throwable -> L7b
            f0.A r1 = p051f0.p.h0(r1, r9, r5)     // Catch: java.lang.Throwable -> L7b
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = p051f0.s.a()     // Catch: java.lang.Throwable -> L7b
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L7b
            int r7 = r1.j()     // Catch: java.lang.Throwable -> L70
            r8 = 1
            if (r7 != r2) goto L72
            r1.l(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.k()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.n(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.j()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.m(r0)     // Catch: java.lang.Throwable -> L70
            r3 = r8
            goto L72
        L70:
            r10 = move-exception
            goto L7d
        L72:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r4)
            p051f0.p.Q(r5, r9)
            if (r3 == 0) goto L0
            r3 = r8
        L7a:
            return r3
        L7b:
            r10 = move-exception
            goto L7f
        L7d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            throw r10     // Catch: java.lang.Throwable -> L7b
        L7f:
            monitor-exit(r4)
            throw r10
        L81:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p051f0.r.addAll(java.util.Collection):boolean");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        p051f0.k kVarC;
        p051f0.A aE = e();
        p247y7.AbstractC7350t.d(aE, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        f0.r.a aVar = (f0.r.a) aE;
        p051f0.p.J();
        synchronized (p051f0.p.I()) {
            kVarC = p051f0.k.f44821e.c();
            f0.r.a aVar2 = (f0.r.a) p051f0.p.h0(aVar, this, kVarC);
            synchronized (p051f0.s.f44872a) {
                aVar2.l(Y.a.a());
                aVar2.m(aVar2.j() + 1);
                aVar2.n(aVar2.k() + 1);
            }
        }
        p051f0.p.Q(kVarC, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return d().i().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        return d().i().containsAll(collection);
    }

    public final f0.r.a d() {
        p051f0.A aE = e();
        p247y7.AbstractC7350t.d(aE, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (f0.r.a) p051f0.p.X((f0.r.a) aE, this);
    }

    @Override // p051f0.y
    public p051f0.A e() {
        return this.f44865C;
    }

    public int f() {
        return d().i().size();
    }

    public final int g() {
        p051f0.A aE = e();
        p247y7.AbstractC7350t.d(aE, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((f0.r.a) p051f0.p.F((f0.r.a) aE)).k();
    }

    @Override // java.util.List
    public java.lang.Object get(int i6) {
        return d().i().get(i6);
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        return d().i().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return d().i().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        return d().i().lastIndexOf(obj);
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return new p051f0.w(this, 0);
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i6) {
        return new p051f0.w(this, i6);
    }

    @Override // java.util.List
    public final /* bridge */ java.lang.Object remove(int i6) {
        return D(i6);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007b */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = p051f0.s.a()
            monitor-enter(r0)
            f0.A r1 = r9.e()     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            p247y7.AbstractC7350t.d(r1, r2)     // Catch: java.lang.Throwable -> L81
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L81
            f0.A r1 = p051f0.p.F(r1)     // Catch: java.lang.Throwable -> L81
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L81
            int r2 = r1.j()     // Catch: java.lang.Throwable -> L81
            Y.f r1 = r1.i()     // Catch: java.lang.Throwable -> L81
            i7.M r3 = p087i7.M.f46721a     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)
            p247y7.AbstractC7350t.c(r1)
            Y.f r0 = r1.remove(r10)
            boolean r1 = p247y7.AbstractC7350t.b(r0, r1)
            r3 = 0
            if (r1 == 0) goto L30
            goto L7a
        L30:
            f0.A r1 = r9.e()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            p247y7.AbstractC7350t.d(r1, r4)
            f0.r$a r1 = (f0.r.a) r1
            p051f0.p.J()
            java.lang.Object r4 = p051f0.p.I()
            monitor-enter(r4)
            f0.k$a r5 = p051f0.k.f44821e     // Catch: java.lang.Throwable -> L7b
            f0.k r5 = r5.c()     // Catch: java.lang.Throwable -> L7b
            f0.A r1 = p051f0.p.h0(r1, r9, r5)     // Catch: java.lang.Throwable -> L7b
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = p051f0.s.a()     // Catch: java.lang.Throwable -> L7b
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L7b
            int r7 = r1.j()     // Catch: java.lang.Throwable -> L70
            r8 = 1
            if (r7 != r2) goto L72
            r1.l(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.k()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.n(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.j()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.m(r0)     // Catch: java.lang.Throwable -> L70
            r3 = r8
            goto L72
        L70:
            r10 = move-exception
            goto L7d
        L72:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r4)
            p051f0.p.Q(r5, r9)
            if (r3 == 0) goto L0
            r3 = r8
        L7a:
            return r3
        L7b:
            r10 = move-exception
            goto L7f
        L7d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            throw r10     // Catch: java.lang.Throwable -> L7b
        L7f:
            monitor-exit(r4)
            throw r10
        L81:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p051f0.r.remove(java.lang.Object):boolean");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007b */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean removeAll(java.util.Collection r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = p051f0.s.a()
            monitor-enter(r0)
            f0.A r1 = r9.e()     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            p247y7.AbstractC7350t.d(r1, r2)     // Catch: java.lang.Throwable -> L81
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L81
            f0.A r1 = p051f0.p.F(r1)     // Catch: java.lang.Throwable -> L81
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L81
            int r2 = r1.j()     // Catch: java.lang.Throwable -> L81
            Y.f r1 = r1.i()     // Catch: java.lang.Throwable -> L81
            i7.M r3 = p087i7.M.f46721a     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)
            p247y7.AbstractC7350t.c(r1)
            Y.f r0 = r1.removeAll(r10)
            boolean r1 = p247y7.AbstractC7350t.b(r0, r1)
            r3 = 0
            if (r1 == 0) goto L30
            goto L7a
        L30:
            f0.A r1 = r9.e()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            p247y7.AbstractC7350t.d(r1, r4)
            f0.r$a r1 = (f0.r.a) r1
            p051f0.p.J()
            java.lang.Object r4 = p051f0.p.I()
            monitor-enter(r4)
            f0.k$a r5 = p051f0.k.f44821e     // Catch: java.lang.Throwable -> L7b
            f0.k r5 = r5.c()     // Catch: java.lang.Throwable -> L7b
            f0.A r1 = p051f0.p.h0(r1, r9, r5)     // Catch: java.lang.Throwable -> L7b
            f0.r$a r1 = (f0.r.a) r1     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = p051f0.s.a()     // Catch: java.lang.Throwable -> L7b
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L7b
            int r7 = r1.j()     // Catch: java.lang.Throwable -> L70
            r8 = 1
            if (r7 != r2) goto L72
            r1.l(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.k()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.n(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.j()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.m(r0)     // Catch: java.lang.Throwable -> L70
            r3 = r8
            goto L72
        L70:
            r10 = move-exception
            goto L7d
        L72:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r4)
            p051f0.p.Q(r5, r9)
            if (r3 == 0) goto L0
            r3 = r8
        L7a:
            return r3
        L7b:
            r10 = move-exception
            goto L7f
        L7d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            throw r10     // Catch: java.lang.Throwable -> L7b
        L7f:
            monitor-exit(r4)
            throw r10
        L81:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p051f0.r.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        return o(new f0.r.c(collection));
    }

    @Override // p051f0.y
    public /* synthetic */ p051f0.A s(p051f0.A a6, p051f0.A a10, p051f0.A a11) {
        return p051f0.x.a(this, a6, a10, a11);
    }

    @Override // java.util.List
    public java.lang.Object set(int i6, java.lang.Object obj) {
        int iJ;
        Y.f fVarI;
        p051f0.k kVarC;
        boolean z6;
        java.lang.Object obj2 = get(i6);
        do {
            synchronized (p051f0.s.f44872a) {
                p051f0.A aE = e();
                p247y7.AbstractC7350t.d(aE, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                f0.r.a aVar = (f0.r.a) p051f0.p.F((f0.r.a) aE);
                iJ = aVar.j();
                fVarI = aVar.i();
                p087i7.M m6 = p087i7.M.f46721a;
            }
            p247y7.AbstractC7350t.c(fVarI);
            Y.f fVar = fVarI.set(i6, obj);
            if (p247y7.AbstractC7350t.b(fVar, fVarI)) {
                break;
            }
            p051f0.A aE2 = e();
            p247y7.AbstractC7350t.d(aE2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            f0.r.a aVar2 = (f0.r.a) aE2;
            p051f0.p.J();
            synchronized (p051f0.p.I()) {
                kVarC = p051f0.k.f44821e.c();
                f0.r.a aVar3 = (f0.r.a) p051f0.p.h0(aVar2, this, kVarC);
                synchronized (p051f0.s.f44872a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(fVar);
                        z6 = true;
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z6 = false;
                    }
                }
            }
            p051f0.p.Q(kVarC, this);
        } while (!z6);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.List
    public java.util.List subList(int i6, int i10) {
        if (!(i6 >= 0 && i6 <= i10 && i10 <= size())) {
            V.I0.a("fromIndex or toIndex are out of bounds");
        }
        return new p051f0.B(this, i6, i10);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return p247y7.AbstractC7341j.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return p247y7.AbstractC7341j.b(this, objArr);
    }

    public java.lang.String toString() {
        p051f0.A aE = e();
        p247y7.AbstractC7350t.d(aE, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((f0.r.a) p051f0.p.F((f0.r.a) aE)).i() + ")@" + hashCode();
    }
}
