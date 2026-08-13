package p170r;

/* JADX INFO: loaded from: classes.dex */
public final class L extends p170r.W {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f53294e;

    private final class a extends r.W.a implements java.util.Set, p256z7.f {

        /* JADX INFO: renamed from: r.L$a$a, reason: collision with other inner class name */
        public static final class C0695a implements java.util.Iterator, p256z7.a {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            private int f53296C = -1;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            private final java.util.Iterator f53297D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p170r.L f53298E;

            /* JADX INFO: renamed from: r.L$a$a$a, reason: collision with other inner class name */
            static final class C0696a extends p147o7.k implements p237x7.p {

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                java.lang.Object f53299E;

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                java.lang.Object f53300F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                java.lang.Object f53301G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                int f53302H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                int f53303I;

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                int f53304J;

                /* JADX INFO: renamed from: K, reason: collision with root package name */
                int f53305K;

                /* JADX INFO: renamed from: L, reason: collision with root package name */
                long f53306L;

                /* JADX INFO: renamed from: M, reason: collision with root package name */
                int f53307M;

                /* JADX INFO: renamed from: N, reason: collision with root package name */
                private /* synthetic */ java.lang.Object f53308N;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ p170r.L f53309O;

                /* JADX INFO: renamed from: P, reason: collision with root package name */
                final /* synthetic */ r.L.a.C0695a f53310P;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0696a(p170r.L l6, r.L.a.C0695a c0695a, p127m7.e eVar) {
                    super(2, eVar);
                    this.f53309O = l6;
                    this.f53310P = c0695a;
                }

                /* JADX WARN: Code duplicated, block: B:13:0x0059  */
                /* JADX WARN: Code duplicated, block: B:21:0x00a2 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:22:0x00a4  */
                /* JADX WARN: Code duplicated, block: B:24:0x00af  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0057 -> B:23:0x00ad). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:14:0x006f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0078 -> B:20:0x009f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009c -> B:20:0x009f). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object r23) {
                    /*
                        r22 = this;
                        r0 = r22
                        java.lang.Object r1 = p137n7.b.g()
                        int r2 = r0.f53307M
                        r4 = 8
                        r5 = 1
                        if (r2 == 0) goto L36
                        if (r2 != r5) goto L2e
                        int r2 = r0.f53305K
                        int r6 = r0.f53304J
                        long r7 = r0.f53306L
                        int r9 = r0.f53303I
                        int r10 = r0.f53302H
                        java.lang.Object r11 = r0.f53301G
                        long[] r11 = (long[]) r11
                        java.lang.Object r12 = r0.f53300F
                        r.L r12 = (p170r.L) r12
                        java.lang.Object r13 = r0.f53299E
                        r.L$a$a r13 = (r.L.a.C0695a) r13
                        java.lang.Object r14 = r0.f53308N
                        R8.j r14 = (R8.j) r14
                        p087i7.x.b(r23)
                        goto L9f
                    L2e:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L36:
                        p087i7.x.b(r23)
                        java.lang.Object r2 = r0.f53308N
                        R8.j r2 = (R8.j) r2
                        r.L r6 = r0.f53309O
                        r.L$a$a r7 = r0.f53310P
                        long[] r8 = r6.f53340a
                        int r9 = r8.length
                        int r9 = r9 + (-2)
                        if (r9 < 0) goto Lb2
                        r10 = 0
                    L49:
                        r11 = r8[r10]
                        long r13 = ~r11
                        r15 = 7
                        long r13 = r13 << r15
                        long r13 = r13 & r11
                        r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                        long r13 = r13 & r15
                        int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                        if (r13 == 0) goto Lad
                        int r13 = r10 - r9
                        int r13 = ~r13
                        int r13 = r13 >>> 31
                        int r13 = 8 - r13
                        r14 = r2
                        r2 = 0
                        r19 = r11
                        r12 = r6
                        r11 = r8
                        r6 = r13
                        r13 = r7
                        r7 = r19
                        r21 = r10
                        r10 = r9
                        r9 = r21
                    L6f:
                        if (r2 >= r6) goto La2
                        r15 = 255(0xff, double:1.26E-321)
                        long r15 = r15 & r7
                        r17 = 128(0x80, double:6.32E-322)
                        int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                        if (r15 >= 0) goto L9f
                        int r15 = r9 << 3
                        int r15 = r15 + r2
                        r13.b(r15)
                        java.lang.Object[] r3 = r12.f53341b
                        r3 = r3[r15]
                        r0.f53308N = r14
                        r0.f53299E = r13
                        r0.f53300F = r12
                        r0.f53301G = r11
                        r0.f53302H = r10
                        r0.f53303I = r9
                        r0.f53306L = r7
                        r0.f53304J = r6
                        r0.f53305K = r2
                        r0.f53307M = r5
                        java.lang.Object r3 = r14.b(r3, r0)
                        if (r3 != r1) goto L9f
                        return r1
                    L9f:
                        long r7 = r7 >> r4
                        int r2 = r2 + r5
                        goto L6f
                    La2:
                        if (r6 != r4) goto Lb2
                        r8 = r11
                        r6 = r12
                        r7 = r13
                        r2 = r14
                        r19 = r10
                        r10 = r9
                        r9 = r19
                    Lad:
                        if (r10 == r9) goto Lb2
                        int r10 = r10 + 1
                        goto L49
                    Lb2:
                        i7.M r1 = p087i7.M.f46721a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: r.L.a.C0695a.C0696a.B(java.lang.Object):java.lang.Object");
                }

                @Override // p237x7.p
                /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object u(R8.j jVar, p127m7.e eVar) {
                    return ((r.L.a.C0695a.C0696a) x(jVar, eVar)).B(p087i7.M.f46721a);
                }

                @Override // p147o7.a
                public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                    r.L.a.C0695a.C0696a c0696a = new r.L.a.C0695a.C0696a(this.f53309O, this.f53310P, eVar);
                    c0696a.f53308N = obj;
                    return c0696a;
                }
            }

            C0695a(p170r.L l6) {
                this.f53298E = l6;
                this.f53297D = R8.k.a(new r.L.a.C0695a.C0696a(l6, this, null));
            }

            public final void b(int i6) {
                this.f53296C = i6;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f53297D.hasNext();
            }

            @Override // java.util.Iterator
            public java.lang.Object next() {
                return this.f53297D.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                int i6 = this.f53296C;
                if (i6 != -1) {
                    this.f53298E.y(i6);
                    this.f53296C = -1;
                }
            }
        }

        public a() {
            super();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(java.lang.Object obj) {
            return p170r.L.this.h(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection collection) {
            p247y7.AbstractC7350t.f(collection, "elements");
            return p170r.L.this.i(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            p170r.L.this.m();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            return new r.L.a.C0695a(p170r.L.this);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object obj) {
            return p170r.L.this.x(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection collection) {
            p247y7.AbstractC7350t.f(collection, "elements");
            int iC = p170r.L.this.c();
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                p170r.L.this.t(it.next());
            }
            return iC != p170r.L.this.c();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection collection) {
            p247y7.AbstractC7350t.f(collection, "elements");
            p170r.L l6 = p170r.L.this;
            long[] jArr = l6.f53340a;
            int length = jArr.length - 2;
            boolean z6 = false;
            if (length >= 0) {
                int i6 = 0;
                boolean z10 = false;
                while (true) {
                    long j6 = jArr[i6];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j6) < 128) {
                                int i12 = (i6 << 3) + i11;
                                if (!collection.contains(l6.f53341b[i12])) {
                                    l6.y(i12);
                                    z10 = true;
                                }
                            }
                            j6 >>= 8;
                        }
                        if (i10 != 8) {
                            return z10;
                        }
                    }
                    if (i6 != length) {
                        i6++;
                    } else {
                        z6 = z10;
                    }
                }
            }
            return z6;
        }
    }

    public L(int i6) {
        super(null);
        if (!(i6 >= 0)) {
            p180s.d.a("Capacity must be a positive value.");
        }
        s(p170r.V.g(i6));
    }

    public /* synthetic */ L(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 6 : i6);
    }

    private final int o(java.lang.Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i10 = i6 >>> 7;
        int i11 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i12 = this.f53342c;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f53340a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j6 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = i11;
            int i17 = i11;
            long j11 = j6 ^ (j10 * 72340172838076673L);
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = (i13 + (java.lang.Long.numberOfTrailingZeros(j12) >> 3)) & i12;
                if (p247y7.AbstractC7350t.b(this.f53341b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iP = p(i10);
                if (this.f53294e == 0 && ((this.f53340a[iP >> 3] >> ((iP & 7) << 3)) & 255) != 254) {
                    k();
                    iP = p(i10);
                }
                this.f53343d++;
                int i18 = this.f53294e;
                long[] jArr2 = this.f53340a;
                int i19 = iP >> 3;
                long j13 = jArr2[i19];
                int i20 = (iP & 7) << 3;
                this.f53294e = i18 - (((j13 >> i20) & 255) == 128 ? 1 : 0);
                int i21 = this.f53342c;
                long j14 = ((~(255 << i20)) & j13) | (j10 << i20);
                jArr2[i19] = j14;
                jArr2[(((iP - 7) & i21) + (i21 & 7)) >> 3] = j14;
                return iP;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
        }
    }

    private final int p(int i6) {
        int i10 = this.f53342c;
        int i11 = i6 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f53340a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j6 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j10 = j6 & ((~j6) << 7) & (-9187201950435737472L);
            if (j10 != 0) {
                return (i11 + (java.lang.Long.numberOfTrailingZeros(j10) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    private final void q() {
        this.f53294e = p170r.V.c(b()) - this.f53343d;
    }

    private final void r(int i6) {
        long[] jArr;
        if (i6 == 0) {
            jArr = p170r.V.f53338a;
        } else {
            jArr = new long[((i6 + 15) & (-8)) >> 3];
            p097j7.AbstractC6872n.A(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f53340a = jArr;
        int i10 = i6 >> 3;
        long j6 = 255 << ((i6 & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j6)) | j6;
        q();
    }

    private final void s(int i6) {
        int iMax = i6 > 0 ? java.lang.Math.max(7, p170r.V.f(i6)) : 0;
        this.f53342c = iMax;
        r(iMax);
        this.f53341b = new java.lang.Object[iMax];
    }

    public final boolean h(java.lang.Object obj) {
        int iC = c();
        this.f53341b[o(obj)] = obj;
        return c() != iC;
    }

    public final boolean i(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "elements");
        int iC = c();
        u(iterable);
        return iC != c();
    }

    public final boolean j(p170r.W w6) {
        p247y7.AbstractC7350t.f(w6, "elements");
        int iC = c();
        w(w6);
        return iC != c();
    }

    public final void k() {
        if (this.f53342c <= 8 || java.lang.Long.compare(p087i7.G.g(p087i7.G.g(this.f53343d) * 32) ^ Long.MIN_VALUE, p087i7.G.g(p087i7.G.g(this.f53342c) * 25) ^ Long.MIN_VALUE) > 0) {
            z(p170r.V.e(this.f53342c));
        } else {
            n();
        }
    }

    public final java.util.Set l() {
        return new r.L.a();
    }

    public final void m() {
        this.f53343d = 0;
        long[] jArr = this.f53340a;
        if (jArr != p170r.V.f53338a) {
            p097j7.AbstractC6872n.A(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f53340a;
            int i6 = this.f53342c;
            int i10 = i6 >> 3;
            long j6 = 255 << ((i6 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j6)) | j6;
        }
        p097j7.AbstractC6872n.w(this.f53341b, null, 0, this.f53342c);
        q();
    }

    public final void n() {
        int i6;
        long[] jArr = this.f53340a;
        int i10 = this.f53342c;
        java.lang.Object[] objArr = this.f53341b;
        p170r.V.a(jArr, i10);
        int i11 = 0;
        int i12 = 0;
        int iB = -1;
        while (i12 != i10) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j6 = (jArr[i13] >> i14) & 255;
            if (j6 == 128) {
                iB = i12;
                i12++;
            } else {
                if (j6 == 254) {
                    java.lang.Object obj = objArr[i12];
                    int iHashCode = (obj != null ? obj.hashCode() : i11) * (-862048943);
                    int i15 = iHashCode ^ (iHashCode << 16);
                    int i16 = i15 >>> 7;
                    int iP = p(i16);
                    int i17 = i16 & i10;
                    if (((iP - i17) & i10) / 8 == ((i12 - i17) & i10) / 8) {
                        jArr[i13] = (((long) (i15 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i14) | ((~(255 << i14)) & jArr[i13]);
                        jArr[p097j7.AbstractC6872n.d0(jArr)] = (jArr[i11] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i18 = iP >> 3;
                        long j10 = jArr[i18];
                        int i19 = (iP & 7) << 3;
                        if (((j10 >> i19) & 255) == 128) {
                            int i20 = i12;
                            jArr[i18] = (((long) (i15 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i19) | (j10 & (~(255 << i19)));
                            jArr[i13] = (jArr[i13] & (~(255 << i14))) | (128 << i14);
                            objArr[iP] = objArr[i20];
                            objArr[i20] = null;
                            i6 = i20;
                            iB = i6;
                        } else {
                            int i21 = i12;
                            jArr[i18] = (((long) (i15 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i19) | (j10 & (~(255 << i19)));
                            if (iB == -1) {
                                iB = p170r.V.b(jArr, i21 + 1, i10);
                            }
                            objArr[iB] = objArr[iP];
                            objArr[iP] = objArr[i21];
                            objArr[i21] = objArr[iB];
                            i6 = i21 - 1;
                        }
                        jArr[p097j7.AbstractC6872n.d0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i12 = i6 + 1;
                        i11 = 0;
                    }
                }
                i12++;
            }
        }
        q();
    }

    public final void t(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int i6 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i12 = this.f53342c;
        int i13 = i10 >>> 7;
        loop0: while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f53340a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j6 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i14) & i12;
                if (p247y7.AbstractC7350t.b(this.f53341b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i6 += 8;
                i13 = i14 + i6;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            y(iNumberOfTrailingZeros);
        }
    }

    public final void u(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "elements");
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            v(it.next());
        }
    }

    public final void v(java.lang.Object obj) {
        this.f53341b[o(obj)] = obj;
    }

    public final void w(p170r.W w6) {
        p247y7.AbstractC7350t.f(w6, "elements");
        java.lang.Object[] objArr = w6.f53341b;
        long[] jArr = w6.f53340a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j6 = jArr[i6];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i6 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j6) < 128) {
                        v(objArr[(i6 << 3) + i11]);
                    }
                    j6 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    public final boolean x(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i10 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i11 = this.f53342c;
        int i12 = (i6 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f53340a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j6 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = (((long) i10) * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i12) & i11;
                if (p247y7.AbstractC7350t.b(this.f53341b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        boolean z6 = iNumberOfTrailingZeros >= 0;
        if (z6) {
            y(iNumberOfTrailingZeros);
        }
        return z6;
    }

    public final void y(int i6) {
        this.f53343d--;
        long[] jArr = this.f53340a;
        int i10 = this.f53342c;
        int i11 = i6 >> 3;
        int i12 = (i6 & 7) << 3;
        long j6 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j6;
        jArr[(((i6 - 7) & i10) + (i10 & 7)) >> 3] = j6;
        this.f53341b[i6] = null;
    }

    public final void z(int i6) {
        long[] jArr = this.f53340a;
        java.lang.Object[] objArr = this.f53341b;
        int i10 = this.f53342c;
        s(i6);
        long[] jArr2 = this.f53340a;
        java.lang.Object[] objArr2 = this.f53341b;
        int i11 = this.f53342c;
        for (int i12 = 0; i12 < i10; i12++) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                java.lang.Object obj = objArr[i12];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i13 = iHashCode ^ (iHashCode << 16);
                int iP = p(i13 >>> 7);
                long j6 = i13 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
                int i14 = iP >> 3;
                int i15 = (iP & 7) << 3;
                long j10 = (jArr2[i14] & (~(255 << i15))) | (j6 << i15);
                jArr2[i14] = j10;
                jArr2[(((iP - 7) & i11) + (i11 & 7)) >> 3] = j10;
                objArr2[iP] = obj;
            }
        }
    }
}
