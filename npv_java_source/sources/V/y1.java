package V;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class y1 {

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f15073G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f15074H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p127m7.i f15075I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f15076J;

        /* JADX INFO: renamed from: V.y1$a$a, reason: collision with other inner class name */
        static final class C0287a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ V.M0 f15077C;

            C0287a(V.M0 m6) {
                this.f15077C = m6;
            }

            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                this.f15077C.setValue(obj);
                return p087i7.M.f46721a;
            }
        }

        static final class b extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f15078G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1869f f15079H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ V.M0 f15080I;

            /* JADX INFO: renamed from: V.y1$a$b$a, reason: collision with other inner class name */
            static final class C0288a implements Z8.InterfaceC1870g {

                /* JADX INFO: renamed from: C, reason: collision with root package name */
                final /* synthetic */ V.M0 f15081C;

                C0288a(V.M0 m6) {
                    this.f15081C = m6;
                }

                @Override // Z8.InterfaceC1870g
                public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                    this.f15081C.setValue(obj);
                    return p087i7.M.f46721a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Z8.InterfaceC1869f interfaceC1869f, V.M0 m6, p127m7.e eVar) {
                super(2, eVar);
                this.f15079H = interfaceC1869f;
                this.f15080I = m6;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f15078G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    Z8.InterfaceC1869f interfaceC1869f = this.f15079H;
                    V.y1.a.b.C0288a c0288a = new V.y1.a.b.C0288a(this.f15080I);
                    this.f15078G = 1;
                    if (interfaceC1869f.b(c0288a, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((V.y1.a.b) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new V.y1.a.b(this.f15079H, this.f15080I, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p127m7.i iVar, Z8.InterfaceC1869f interfaceC1869f, p127m7.e eVar) {
            super(2, eVar);
            this.f15075I = iVar;
            this.f15076J = interfaceC1869f;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f15073G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                V.M0 m6 = (V.M0) this.f15074H;
                if (p247y7.AbstractC7350t.b(this.f15075I, p127m7.j.f51198C)) {
                    Z8.InterfaceC1869f interfaceC1869f = this.f15076J;
                    V.y1.a.C0287a c0287a = new V.y1.a.C0287a(m6);
                    this.f15073G = 1;
                    if (interfaceC1869f.b(c0287a, this) == objG) {
                        return objG;
                    }
                } else {
                    p127m7.i iVar = this.f15075I;
                    V.y1.a.b bVar = new V.y1.a.b(this.f15076J, m6, null);
                    this.f15073G = 2;
                    if (W8.AbstractC1784g.g(iVar, bVar, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i6 != 1 && i6 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(V.M0 m6, p127m7.e eVar) {
            return ((V.y1.a) x(m6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            V.y1.a aVar = new V.y1.a(this.f15075I, this.f15076J, eVar);
            aVar.f15074H = obj;
            return aVar;
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f15082G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f15083H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f15084I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        java.lang.Object f15085J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        java.lang.Object f15086K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f15087L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        int f15088M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f15089N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ p237x7.a f15090O;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p170r.L f15091D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p170r.L l6) {
                super(1);
                this.f15091D = l6;
            }

            public final void a(java.lang.Object obj) {
                if (obj instanceof p051f0.z) {
                    ((p051f0.z) obj).r(p051f0.g.a(4));
                }
                this.f15091D.h(obj);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a(obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: V.y1$b$b, reason: collision with other inner class name */
        static final class C0289b extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ Y8.j f15092D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0289b(Y8.j jVar) {
                super(2);
                this.f15092D = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x005c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:21:0x005e A[LOOP:0: B:7:0x0019->B:21:0x005e, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:41:0x0061 A[SYNTHETIC] */
            public final void a(java.util.Set set, p051f0.k kVar) {
                java.lang.Object next;
                if (!(set instanceof X.d)) {
                    java.util.Set set2 = set;
                    if (!(set2 instanceof java.util.Collection) || !set2.isEmpty()) {
                        java.util.Iterator it = set2.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                                if (!(next instanceof p051f0.z)) {
                                    break;
                                }
                            }
                        } while (!((p051f0.z) next).q(p051f0.g.a(4)));
                        this.f15092D.j(set);
                    }
                }
                p170r.W wD = ((X.d) set).d();
                java.lang.Object[] objArr = wD.f53341b;
                long[] jArr = wD.f53340a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    loop0: while (true) {
                        long j6 = jArr[i6];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j6) < 128) {
                                    java.lang.Object obj = objArr[(i6 << 3) + i11];
                                    if (!(obj instanceof p051f0.z) || ((p051f0.z) obj).q(p051f0.g.a(4))) {
                                        break loop0;
                                    }
                                }
                                j6 >>= 8;
                            }
                            if (i10 == 8) {
                                if (i6 != length) {
                                    i6++;
                                }
                            }
                        } else if (i6 != length) {
                            i6++;
                        }
                    }
                    this.f15092D.j(set);
                }
            }

            @Override // p237x7.p
            public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                a((java.util.Set) obj, (p051f0.k) obj2);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p237x7.a aVar, p127m7.e eVar) {
            super(2, eVar);
            this.f15090O = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00d5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e1 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:32:0x00dd, B:34:0x00e1, B:39:0x00eb, B:42:0x00f9, B:46:0x010f, B:48:0x0118, B:56:0x0134, B:57:0x0137, B:15:0x0050, B:43:0x0104, B:45:0x010c, B:54:0x0130, B:55:0x0133), top: B:71:0x0050, inners: #2 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f9 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:32:0x00dd, B:34:0x00e1, B:39:0x00eb, B:42:0x00f9, B:46:0x010f, B:48:0x0118, B:56:0x0134, B:57:0x0137, B:15:0x0050, B:43:0x0104, B:45:0x010c, B:54:0x0130, B:55:0x0133), top: B:71:0x0050, inners: #2 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0118 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:32:0x00dd, B:34:0x00e1, B:39:0x00eb, B:42:0x00f9, B:46:0x010f, B:48:0x0118, B:56:0x0134, B:57:0x0137, B:15:0x0050, B:43:0x0104, B:45:0x010c, B:54:0x0130, B:55:0x0133), top: B:71:0x0050, inners: #2 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x012c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x0139  */
        /* JADX WARN: Path cross not found for [B:42:0x00f9, B:58:0x0138], limit reached: 76 */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 334
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: V.y1.b.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((V.y1.b) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            V.y1.b bVar = new V.y1.b(this.f15090O, eVar);
            bVar.f15089N = obj;
            return bVar;
        }
    }

    public static final V.G1 b(Z8.InterfaceC1869f interfaceC1869f, java.lang.Object obj, p127m7.i iVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        if ((i10 & 2) != 0) {
            iVar = p127m7.j.f51198C;
        }
        p127m7.i iVar2 = iVar;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-606625098, i6, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)");
        }
        boolean zL = interfaceC1734n.l(iVar2) | interfaceC1734n.l(interfaceC1869f);
        java.lang.Object objG = interfaceC1734n.g();
        if (zL || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new V.y1.a(iVar2, interfaceC1869f, null);
            interfaceC1734n.K(objG);
        }
        V.G1 g1K = V.v1.k(obj, interfaceC1869f, iVar2, (p237x7.p) objG, interfaceC1734n, ((i6 >> 3) & 14) | ((i6 << 3) & 112) | (i6 & 896));
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1K;
    }

    public static final V.G1 c(Z8.N n6, p127m7.i iVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        if ((i10 & 1) != 0) {
            iVar = p127m7.j.f51198C;
        }
        p127m7.i iVar2 = iVar;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1439883919, i6, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        V.G1 g1A = V.v1.a(n6, n6.getValue(), iVar2, interfaceC1734n, (i6 & 14) | ((i6 << 3) & 896), 0);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(p170r.L l6, java.util.Set set) {
        java.lang.Object[] objArr = l6.f53341b;
        long[] jArr = l6.f53340a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i6 = 0;
        while (true) {
            long j6 = jArr[i6];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i6 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j6) < 128 && set.contains(objArr[(i6 << 3) + i11])) {
                        return true;
                    }
                    j6 >>= 8;
                }
                if (i10 != 8) {
                    return false;
                }
            }
            if (i6 == length) {
                return false;
            }
            i6++;
        }
    }

    public static final Z8.InterfaceC1869f e(p237x7.a aVar) {
        return Z8.AbstractC1871h.x(new V.y1.b(aVar, null));
    }
}
