package N9;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements H9.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f7911a;

    public b(boolean z6) {
        this.f7911a = z6;
    }

    private final boolean b(int i6) {
        if (i6 == 100) {
            return true;
        }
        return 102 <= i6 && i6 < 200;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[Catch: IOException -> 0x006a, TRY_LEAVE, TryCatch #0 {IOException -> 0x006a, blocks: (B:17:0x0055, B:19:0x005b, B:30:0x0093, B:32:0x0099, B:22:0x006c, B:23:0x007b, B:25:0x0088), top: B:84:0x002c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [H9.B$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v4, types: [H9.B$a] */
    @Override // H9.v
    public H9.B a(H9.v.a aVar) throws java.io.IOException {
        boolean z6;
        ?? r10;
        ?? R10;
        H9.B.a aVar2;
        p247y7.AbstractC7350t.f(aVar, "chain");
        N9.g gVar = (N9.g) aVar;
        M9.c cVarG = gVar.g();
        p247y7.AbstractC7350t.c(cVarG);
        H9.z zVarI = gVar.i();
        H9.A a6 = zVarI.a();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            cVarG.w(zVarI);
            ?? A6 = N9.f.a(zVarI.g());
            try {
                if (A6 == 0 || a6 == null) {
                    cVarG.p();
                    z6 = true;
                    A6 = 0;
                } else {
                    if (S8.r.K("100-continue", zVarI.d("Expect"), true)) {
                        cVarG.f();
                        H9.B.a aVarR = cVarG.r(true);
                        try {
                            cVarG.t();
                            z6 = false;
                            aVar2 = aVarR;
                        } catch (java.io.IOException e6) {
                            e = e6;
                            z6 = true;
                            r10 = aVarR;
                            if (e instanceof P9.a) {
                                throw e;
                            }
                            if (!cVarG.k()) {
                                R10 = r10;
                                throw e;
                            }
                        }
                    } else {
                        z6 = true;
                        aVar2 = null;
                    }
                    if (aVar2 != null) {
                        cVarG.p();
                        if (!cVarG.h().v()) {
                            A6 = aVar2;
                            cVarG.o();
                            A6 = aVar2;
                        }
                    } else if (a6.c()) {
                        cVarG.f();
                        a6.e(X9.K.a(cVarG.c(zVarI, true)));
                    } else {
                        X9.InterfaceC1837e interfaceC1837eA = X9.K.a(cVarG.c(zVarI, false));
                        a6.e(interfaceC1837eA);
                        interfaceC1837eA.close();
                    }
                }
                if (a6 != null) {
                    A6 = aVar2;
                    if (!a6.c()) {
                        A6 = aVar2;
                        A6 = aVar2;
                        A6 = aVar2;
                        cVarG.e();
                    }
                } else {
                    A6 = aVar2;
                    A6 = aVar2;
                    A6 = aVar2;
                    cVarG.e();
                }
                A6 = aVar2;
                e = null;
                R10 = A6;
            } catch (java.io.IOException e10) {
                e = e10;
                r10 = A6;
            }
        } catch (java.io.IOException e11) {
            e = e11;
            z6 = true;
            r10 = 0;
        }
        if (R10 == 0) {
            try {
                R10 = cVarG.r(false);
                p247y7.AbstractC7350t.c(R10);
                if (z6) {
                    cVarG.t();
                    z6 = false;
                }
            } catch (java.io.IOException e12) {
                if (e == null) {
                    throw e12;
                }
                p087i7.AbstractC6661g.a(e, e12);
                throw e;
            }
        }
        H9.B bC = R10.r(zVarI).i(cVarG.h().r()).s(jCurrentTimeMillis).q(java.lang.System.currentTimeMillis()).c();
        int iO = bC.o();
        if (b(iO)) {
            H9.B.a aVarR2 = cVarG.r(false);
            p247y7.AbstractC7350t.c(aVarR2);
            if (z6) {
                cVarG.t();
            }
            bC = aVarR2.r(zVarI).i(cVarG.h().r()).s(jCurrentTimeMillis).q(java.lang.System.currentTimeMillis()).c();
            iO = bC.o();
        }
        cVarG.s(bC);
        H9.B bC2 = ((this.f7911a && iO == 101) ? bC.g0().b(I9.d.f5549c) : bC.g0().b(cVarG.q(bC))).c();
        if (S8.r.K("close", bC2.r0().d("Connection"), true) || S8.r.K("close", H9.B.D(bC2, "Connection", null, 2, null), true)) {
            cVarG.o();
        }
        if (iO == 204 || iO == 205) {
            H9.C cA = bC2.a();
            if ((cA != null ? cA.a() : -1L) > 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("HTTP ");
                sb.append(iO);
                sb.append(" had non-zero Content-Length: ");
                H9.C cA2 = bC2.a();
                sb.append(cA2 != null ? java.lang.Long.valueOf(cA2.a()) : null);
                throw new java.net.ProtocolException(sb.toString());
            }
        }
        return bC2;
    }
}
