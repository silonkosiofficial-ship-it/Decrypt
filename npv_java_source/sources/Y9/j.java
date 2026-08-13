package Y9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    public static final class a implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d(((Y9.i) obj).b(), ((Y9.i) obj2).b());
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.K f16611D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f16612E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p247y7.N f16613F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ X9.InterfaceC1838f f16614G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p247y7.N f16615H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p247y7.N f16616I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p247y7.O f16617J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p247y7.O f16618K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p247y7.O f16619L;

        static final class a extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p247y7.O f16620D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ X9.InterfaceC1838f f16621E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ p247y7.O f16622F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ p247y7.O f16623G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p247y7.O o6, X9.InterfaceC1838f interfaceC1838f, p247y7.O o10, p247y7.O o11) {
                super(2);
                this.f16620D = o6;
                this.f16621E = interfaceC1838f;
                this.f16622F = o10;
                this.f16623G = o11;
            }

            public final void a(int i6, long j6) throws java.io.IOException {
                if (i6 == 1) {
                    p247y7.O o6 = this.f16620D;
                    if (o6.f57254C != null) {
                        throw new java.io.IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (j6 != 24) {
                        throw new java.io.IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    o6.f57254C = java.lang.Long.valueOf(this.f16621E.b1());
                    this.f16622F.f57254C = java.lang.Long.valueOf(this.f16621E.b1());
                    this.f16623G.f57254C = java.lang.Long.valueOf(this.f16621E.b1());
                }
            }

            @Override // p237x7.p
            public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) throws java.io.IOException {
                a(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).longValue());
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p247y7.K k6, long j6, p247y7.N n6, X9.InterfaceC1838f interfaceC1838f, p247y7.N n10, p247y7.N n11, p247y7.O o6, p247y7.O o10, p247y7.O o11) {
            super(2);
            this.f16611D = k6;
            this.f16612E = j6;
            this.f16613F = n6;
            this.f16614G = interfaceC1838f;
            this.f16615H = n10;
            this.f16616I = n11;
            this.f16617J = o6;
            this.f16618K = o10;
            this.f16619L = o11;
        }

        public final void a(int i6, long j6) throws java.io.IOException {
            if (i6 != 1) {
                if (i6 != 10) {
                    return;
                }
                if (j6 < 4) {
                    throw new java.io.IOException("bad zip: NTFS extra too short");
                }
                this.f16614G.skip(4L);
                X9.InterfaceC1838f interfaceC1838f = this.f16614G;
                Y9.j.i(interfaceC1838f, (int) (j6 - 4), new Y9.j.b.a(this.f16617J, interfaceC1838f, this.f16618K, this.f16619L));
                return;
            }
            p247y7.K k6 = this.f16611D;
            if (k6.f57250C) {
                throw new java.io.IOException("bad zip: zip64 extra repeated");
            }
            k6.f57250C = true;
            if (j6 < this.f16612E) {
                throw new java.io.IOException("bad zip: zip64 extra too short");
            }
            p247y7.N n6 = this.f16613F;
            long jB1 = n6.f57253C;
            if (jB1 == 4294967295L) {
                jB1 = this.f16614G.b1();
            }
            n6.f57253C = jB1;
            p247y7.N n10 = this.f16615H;
            n10.f57253C = n10.f57253C == 4294967295L ? this.f16614G.b1() : 0L;
            p247y7.N n11 = this.f16616I;
            n11.f57253C = n11.f57253C == 4294967295L ? this.f16614G.b1() : 0L;
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) throws java.io.IOException {
            a(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).longValue());
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ X9.InterfaceC1838f f16624D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p247y7.O f16625E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p247y7.O f16626F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p247y7.O f16627G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(X9.InterfaceC1838f interfaceC1838f, p247y7.O o6, p247y7.O o10, p247y7.O o11) {
            super(2);
            this.f16624D = interfaceC1838f;
            this.f16625E = o6;
            this.f16626F = o10;
            this.f16627G = o11;
        }

        public final void a(int i6, long j6) throws java.io.IOException {
            if (i6 == 21589) {
                if (j6 < 1) {
                    throw new java.io.IOException("bad zip: extended timestamp extra too short");
                }
                byte bM = this.f16624D.m();
                boolean z6 = (bM & 1) == 1;
                boolean z10 = (bM & 2) == 2;
                boolean z11 = (bM & 4) == 4;
                X9.InterfaceC1838f interfaceC1838f = this.f16624D;
                long j10 = z6 ? 5L : 1L;
                if (z10) {
                    j10 += 4;
                }
                if (z11) {
                    j10 += 4;
                }
                if (j6 < j10) {
                    throw new java.io.IOException("bad zip: extended timestamp extra too short");
                }
                if (z6) {
                    this.f16625E.f57254C = java.lang.Integer.valueOf(interfaceC1838f.O0());
                }
                if (z10) {
                    this.f16626F.f57254C = java.lang.Integer.valueOf(this.f16624D.O0());
                }
                if (z11) {
                    this.f16627G.f57254C = java.lang.Integer.valueOf(this.f16624D.O0());
                }
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) throws java.io.IOException {
            a(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).longValue());
            return p087i7.M.f46721a;
        }
    }

    private static final java.util.Map b(java.util.List list) {
        X9.Q qE = X9.Q.a.e(X9.Q.f16083D, "/", false, 1, null);
        java.util.Map mapL = p097j7.S.l(p087i7.B.a(qE, new Y9.i(qE, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        java.util.Iterator it = p097j7.AbstractC6879v.L0(list, new Y9.j.a()).iterator();
        while (it.hasNext()) {
            Y9.i iVar = (Y9.i) it.next();
            if (((Y9.i) mapL.put(iVar.b(), iVar)) == null) {
                while (true) {
                    X9.Q qS = iVar.b().s();
                    if (qS == null) {
                        break;
                    }
                    Y9.i iVar2 = (Y9.i) mapL.get(qS);
                    if (iVar2 != null) {
                        iVar2.c().add(iVar.b());
                        break;
                    }
                    Y9.i iVar3 = new Y9.i(qS, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                    mapL.put(qS, iVar3);
                    iVar3.c().add(iVar.b());
                    iVar = iVar3;
                    it = it;
                }
            }
        }
        return mapL;
    }

    public static final java.lang.Long c(int i6, int i10) {
        if (i10 == -1) {
            return null;
        }
        return java.lang.Long.valueOf(Y9.k.a(((i6 >> 9) & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) + 1980, (i6 >> 5) & 15, i6 & 31, (i10 >> 11) & 31, (i10 >> 5) & 63, (i10 & 31) << 1));
    }

    public static final long d(long j6) {
        return (j6 / ((long) 10000)) - 11644473600000L;
    }

    private static final java.lang.String e(int i6) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("0x");
        java.lang.String string = java.lang.Integer.toString(i6, S8.AbstractC1628a.a(16));
        p247y7.AbstractC7350t.e(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }

    public static final X9.c0 f(X9.Q q6, X9.AbstractC1843k abstractC1843k, p237x7.l lVar) {
        java.lang.Throwable th;
        java.lang.Throwable th2;
        java.lang.Throwable th3;
        p247y7.AbstractC7350t.f(q6, "zipPath");
        p247y7.AbstractC7350t.f(abstractC1843k, "fileSystem");
        p247y7.AbstractC7350t.f(lVar, "predicate");
        X9.AbstractC1841i abstractC1841iI = abstractC1843k.i(q6);
        try {
            long jN0 = abstractC1841iI.n0() - ((long) 22);
            if (jN0 < 0) {
                throw new java.io.IOException("not a zip: size=" + abstractC1841iI.n0());
            }
            long jMax = java.lang.Math.max(jN0 - 65536, 0L);
            do {
                X9.InterfaceC1838f interfaceC1838fB = X9.K.b(abstractC1841iI.o0(jN0));
                try {
                    if (interfaceC1838fB.O0() == 101010256) {
                        Y9.f fVarH = h(interfaceC1838fB);
                        java.lang.String strW = interfaceC1838fB.w(fVarH.b());
                        interfaceC1838fB.close();
                        long j6 = jN0 - ((long) 20);
                        java.lang.Throwable th4 = null;
                        if (j6 > 0) {
                            X9.InterfaceC1838f interfaceC1838fB2 = X9.K.b(abstractC1841iI.o0(j6));
                            try {
                                if (interfaceC1838fB2.O0() == 117853008) {
                                    int iO0 = interfaceC1838fB2.O0();
                                    long jB1 = interfaceC1838fB2.b1();
                                    if (interfaceC1838fB2.O0() != 1 || iO0 != 0) {
                                        throw new java.io.IOException("unsupported zip: spanned");
                                    }
                                    X9.InterfaceC1838f interfaceC1838fB3 = X9.K.b(abstractC1841iI.o0(jB1));
                                    try {
                                        int iO1 = interfaceC1838fB3.O0();
                                        if (iO1 != 101075792) {
                                            throw new java.io.IOException("bad zip: expected " + e(101075792) + " but was " + e(iO1));
                                        }
                                        fVarH = l(interfaceC1838fB3, fVarH);
                                        p087i7.M m6 = p087i7.M.f46721a;
                                        if (interfaceC1838fB3 != null) {
                                            try {
                                                interfaceC1838fB3.close();
                                            } catch (java.lang.Throwable th5) {
                                                th3 = th5;
                                            }
                                        }
                                        th3 = null;
                                        if (th3 != null) {
                                            throw th3;
                                        }
                                    } catch (java.lang.Throwable th6) {
                                        if (interfaceC1838fB3 != null) {
                                            try {
                                                interfaceC1838fB3.close();
                                            } catch (java.lang.Throwable th7) {
                                                try {
                                                    p087i7.AbstractC6661g.a(th6, th7);
                                                } catch (java.lang.Throwable th8) {
                                                    th = th8;
                                                    fVarH = fVarH;
                                                    if (interfaceC1838fB2 != null) {
                                                        try {
                                                            interfaceC1838fB2.close();
                                                        } catch (java.lang.Throwable th9) {
                                                            p087i7.AbstractC6661g.a(th, th9);
                                                        }
                                                    }
                                                    th2 = th;
                                                }
                                            }
                                        }
                                        th3 = th6;
                                        fVarH = fVarH;
                                    }
                                }
                                p087i7.M m10 = p087i7.M.f46721a;
                                if (interfaceC1838fB2 != null) {
                                    try {
                                        interfaceC1838fB2.close();
                                    } catch (java.lang.Throwable th10) {
                                        th2 = th10;
                                    }
                                }
                                th2 = null;
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        X9.InterfaceC1838f interfaceC1838fB4 = X9.K.b(abstractC1841iI.o0(fVarH.a()));
                        try {
                            long jC = fVarH.c();
                            for (long j10 = 0; j10 < jC; j10++) {
                                Y9.i iVarG = g(interfaceC1838fB4);
                                if (iVarG.i() >= fVarH.a()) {
                                    throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((java.lang.Boolean) lVar.l(iVarG)).booleanValue()) {
                                    arrayList.add(iVarG);
                                }
                            }
                            p087i7.M m11 = p087i7.M.f46721a;
                            if (interfaceC1838fB4 != null) {
                                try {
                                    interfaceC1838fB4.close();
                                } catch (java.lang.Throwable th12) {
                                    th4 = th12;
                                }
                            }
                        } catch (java.lang.Throwable th13) {
                            th4 = th13;
                            if (interfaceC1838fB4 != null) {
                                try {
                                    interfaceC1838fB4.close();
                                } catch (java.lang.Throwable th14) {
                                    p087i7.AbstractC6661g.a(th4, th14);
                                }
                            }
                        }
                        if (th4 != null) {
                            throw th4;
                        }
                        X9.c0 c0Var = new X9.c0(q6, abstractC1843k, b(arrayList), strW);
                        if (abstractC1841iI != null) {
                            try {
                                abstractC1841iI.close();
                            } catch (java.lang.Throwable unused) {
                            }
                        }
                        return c0Var;
                    }
                    interfaceC1838fB.close();
                    jN0--;
                } catch (java.lang.Throwable th15) {
                    interfaceC1838fB.close();
                    throw th15;
                }
            } while (jN0 >= jMax);
            throw new java.io.IOException("not a zip: end of central directory signature not found");
        } catch (java.lang.Throwable th16) {
            if (abstractC1841iI == null) {
                throw th16;
            }
            try {
                abstractC1841iI.close();
                throw th16;
            } catch (java.lang.Throwable th17) {
                p087i7.AbstractC6661g.a(th16, th17);
                throw th16;
            }
        }
    }

    public static final Y9.i g(X9.InterfaceC1838f interfaceC1838f) throws java.io.IOException {
        p247y7.AbstractC7350t.f(interfaceC1838f, "<this>");
        int iO0 = interfaceC1838f.O0();
        if (iO0 != 33639248) {
            throw new java.io.IOException("bad zip: expected " + e(33639248) + " but was " + e(iO0));
        }
        interfaceC1838f.skip(4L);
        short sZ0 = interfaceC1838f.Z0();
        int i6 = sZ0 & 65535;
        if ((sZ0 & 1) != 0) {
            throw new java.io.IOException("unsupported zip: general purpose bit flag=" + e(i6));
        }
        int iZ0 = interfaceC1838f.Z0() & 65535;
        int iZ1 = interfaceC1838f.Z0() & 65535;
        int iZ2 = interfaceC1838f.Z0() & 65535;
        long jO0 = ((long) interfaceC1838f.O0()) & 4294967295L;
        p247y7.N n6 = new p247y7.N();
        n6.f57253C = ((long) interfaceC1838f.O0()) & 4294967295L;
        p247y7.N n10 = new p247y7.N();
        n10.f57253C = ((long) interfaceC1838f.O0()) & 4294967295L;
        int iZ3 = interfaceC1838f.Z0() & 65535;
        int iZ4 = interfaceC1838f.Z0() & 65535;
        int iZ5 = interfaceC1838f.Z0() & 65535;
        interfaceC1838f.skip(8L);
        p247y7.N n11 = new p247y7.N();
        n11.f57253C = ((long) interfaceC1838f.O0()) & 4294967295L;
        java.lang.String strW = interfaceC1838f.w(iZ3);
        if (S8.r.b0(strW, (char) 0, false, 2, null)) {
            throw new java.io.IOException("bad zip: filename contains 0x00");
        }
        long j6 = n10.f57253C == 4294967295L ? 8 : 0L;
        if (n6.f57253C == 4294967295L) {
            j6 += (long) 8;
        }
        if (n11.f57253C == 4294967295L) {
            j6 += (long) 8;
        }
        long j10 = j6;
        p247y7.O o6 = new p247y7.O();
        p247y7.O o10 = new p247y7.O();
        p247y7.O o11 = new p247y7.O();
        p247y7.K k6 = new p247y7.K();
        i(interfaceC1838f, iZ4, new Y9.j.b(k6, j10, n10, interfaceC1838f, n6, n11, o6, o10, o11));
        if (j10 <= 0 || k6.f57250C) {
            return new Y9.i(X9.Q.a.e(X9.Q.f16083D, "/", false, 1, null).v(strW), S8.r.J(strW, "/", false, 2, null), interfaceC1838f.w(iZ5), jO0, n6.f57253C, n10.f57253C, iZ0, n11.f57253C, iZ2, iZ1, (java.lang.Long) o6.f57254C, (java.lang.Long) o10.f57254C, (java.lang.Long) o11.f57254C, null, null, null, 57344, null);
        }
        throw new java.io.IOException("bad zip: zip64 extra required but absent");
    }

    private static final Y9.f h(X9.InterfaceC1838f interfaceC1838f) throws java.io.IOException {
        int iZ0 = interfaceC1838f.Z0() & 65535;
        int iZ1 = interfaceC1838f.Z0() & 65535;
        long jZ0 = interfaceC1838f.Z0() & 65535;
        if (jZ0 != (interfaceC1838f.Z0() & 65535) || iZ0 != 0 || iZ1 != 0) {
            throw new java.io.IOException("unsupported zip: spanned");
        }
        interfaceC1838f.skip(4L);
        return new Y9.f(jZ0, 4294967295L & ((long) interfaceC1838f.O0()), interfaceC1838f.Z0() & 65535);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(X9.InterfaceC1838f interfaceC1838f, int i6, p237x7.p pVar) throws java.io.IOException {
        long j6 = i6;
        while (j6 != 0) {
            if (j6 < 4) {
                throw new java.io.IOException("bad zip: truncated header in extra field");
            }
            int iZ0 = interfaceC1838f.Z0() & 65535;
            long jZ0 = ((long) interfaceC1838f.Z0()) & 65535;
            long j10 = j6 - ((long) 4);
            if (j10 < jZ0) {
                throw new java.io.IOException("bad zip: truncated value in extra field");
            }
            interfaceC1838f.q(jZ0);
            long jD1 = interfaceC1838f.d().d1();
            pVar.u(java.lang.Integer.valueOf(iZ0), java.lang.Long.valueOf(jZ0));
            long jD2 = (interfaceC1838f.d().d1() + jZ0) - jD1;
            if (jD2 < 0) {
                throw new java.io.IOException("unsupported zip: too many bytes processed for " + iZ0);
            }
            if (jD2 > 0) {
                interfaceC1838f.d().skip(jD2);
            }
            j6 = j10 - jZ0;
        }
    }

    public static final Y9.i j(X9.InterfaceC1838f interfaceC1838f, Y9.i iVar) throws java.io.IOException {
        p247y7.AbstractC7350t.f(interfaceC1838f, "<this>");
        p247y7.AbstractC7350t.f(iVar, "centralDirectoryZipEntry");
        Y9.i iVarK = k(interfaceC1838f, iVar);
        p247y7.AbstractC7350t.c(iVarK);
        return iVarK;
    }

    private static final Y9.i k(X9.InterfaceC1838f interfaceC1838f, Y9.i iVar) throws java.io.IOException {
        int iO0 = interfaceC1838f.O0();
        if (iO0 != 67324752) {
            throw new java.io.IOException("bad zip: expected " + e(67324752) + " but was " + e(iO0));
        }
        interfaceC1838f.skip(2L);
        short sZ0 = interfaceC1838f.Z0();
        int i6 = sZ0 & 65535;
        if ((sZ0 & 1) != 0) {
            throw new java.io.IOException("unsupported zip: general purpose bit flag=" + e(i6));
        }
        interfaceC1838f.skip(18L);
        long jZ0 = ((long) interfaceC1838f.Z0()) & 65535;
        int iZ0 = interfaceC1838f.Z0() & 65535;
        interfaceC1838f.skip(jZ0);
        if (iVar == null) {
            interfaceC1838f.skip(iZ0);
            return null;
        }
        p247y7.O o6 = new p247y7.O();
        p247y7.O o10 = new p247y7.O();
        p247y7.O o11 = new p247y7.O();
        i(interfaceC1838f, iZ0, new Y9.j.c(interfaceC1838f, o6, o10, o11));
        return iVar.a((java.lang.Integer) o6.f57254C, (java.lang.Integer) o10.f57254C, (java.lang.Integer) o11.f57254C);
    }

    private static final Y9.f l(X9.InterfaceC1838f interfaceC1838f, Y9.f fVar) throws java.io.IOException {
        interfaceC1838f.skip(12L);
        int iO0 = interfaceC1838f.O0();
        int iO1 = interfaceC1838f.O0();
        long jB1 = interfaceC1838f.b1();
        if (jB1 != interfaceC1838f.b1() || iO0 != 0 || iO1 != 0) {
            throw new java.io.IOException("unsupported zip: spanned");
        }
        interfaceC1838f.skip(8L);
        return new Y9.f(jB1, interfaceC1838f.b1(), fVar.b());
    }

    public static final void m(X9.InterfaceC1838f interfaceC1838f) {
        p247y7.AbstractC7350t.f(interfaceC1838f, "<this>");
        k(interfaceC1838f, null);
    }
}
