package N9;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements H9.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N9.j.a f7931b = new N9.j.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H9.x f7932a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public j(H9.x xVar) {
        p247y7.AbstractC7350t.f(xVar, "client");
        this.f7932a = xVar;
    }

    private final H9.z b(H9.B b6, java.lang.String str) {
        java.lang.String strD;
        H9.u uVarO;
        H9.A a6 = null;
        if (!this.f7932a.v() || (strD = H9.B.D(b6, "Location", null, 2, null)) == null || (uVarO = b6.r0().i().o(strD)) == null) {
            return null;
        }
        if (!p247y7.AbstractC7350t.b(uVarO.p(), b6.r0().i().p()) && !this.f7932a.w()) {
            return null;
        }
        H9.z.a aVarH = b6.r0().h();
        if (N9.f.a(str)) {
            int iO = b6.o();
            N9.f fVar = N9.f.f7917a;
            boolean z6 = fVar.c(str) || iO == 308 || iO == 307;
            if (fVar.b(str) && iO != 308 && iO != 307) {
                str = "GET";
            } else if (z6) {
                a6 = b6.r0().a();
            }
            aVarH.e(str, a6);
            if (!z6) {
                aVarH.f("Transfer-Encoding");
                aVarH.f("Content-Length");
                aVarH.f("Content-Type");
            }
        }
        if (!I9.d.j(b6.r0().i(), uVarO)) {
            aVarH.f("Authorization");
        }
        return aVarH.g(uVarO).b();
    }

    private final H9.z c(H9.B b6, M9.c cVar) throws java.net.ProtocolException {
        M9.f fVarH;
        H9.D dA = (cVar == null || (fVarH = cVar.h()) == null) ? null : fVarH.A();
        int iO = b6.o();
        java.lang.String strG = b6.r0().g();
        if (iO != 307 && iO != 308) {
            if (iO == 401) {
                return this.f7932a.e().a(dA, b6);
            }
            if (iO == 421) {
                H9.A a6 = b6.r0().a();
                if ((a6 != null && a6.d()) || cVar == null || !cVar.l()) {
                    return null;
                }
                cVar.h().y();
                return b6.r0();
            }
            if (iO == 503) {
                H9.B bN0 = b6.n0();
                if ((bN0 == null || bN0.o() != 503) && g(b6, Integer.MAX_VALUE) == 0) {
                    return b6.r0();
                }
                return null;
            }
            if (iO == 407) {
                p247y7.AbstractC7350t.c(dA);
                if (dA.b().type() == java.net.Proxy.Type.HTTP) {
                    return this.f7932a.I().a(dA, b6);
                }
                throw new java.net.ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iO == 408) {
                if (!this.f7932a.L()) {
                    return null;
                }
                H9.A a10 = b6.r0().a();
                if (a10 != null && a10.d()) {
                    return null;
                }
                H9.B bN1 = b6.n0();
                if ((bN1 == null || bN1.o() != 408) && g(b6, 0) <= 0) {
                    return b6.r0();
                }
                return null;
            }
            switch (iO) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(b6, strG);
    }

    private final boolean d(java.io.IOException iOException, boolean z6) {
        if (iOException instanceof java.net.ProtocolException) {
            return false;
        }
        if (iOException instanceof java.io.InterruptedIOException) {
            return (iOException instanceof java.net.SocketTimeoutException) && !z6;
        }
        return (((iOException instanceof javax.net.ssl.SSLHandshakeException) && (iOException.getCause() instanceof java.security.cert.CertificateException)) || (iOException instanceof javax.net.ssl.SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean e(java.io.IOException iOException, M9.e eVar, H9.z zVar, boolean z6) {
        if (this.f7932a.L()) {
            return !(z6 && f(iOException, zVar)) && d(iOException, z6) && eVar.A();
        }
        return false;
    }

    private final boolean f(java.io.IOException iOException, H9.z zVar) {
        H9.A a6 = zVar.a();
        return (a6 != null && a6.d()) || (iOException instanceof java.io.FileNotFoundException);
    }

    private final int g(H9.B b6, int i6) {
        java.lang.String strD = H9.B.D(b6, "Retry-After", null, 2, null);
        if (strD == null) {
            return i6;
        }
        if (!new S8.o("\\d+").d(strD)) {
            return Integer.MAX_VALUE;
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(strD);
        p247y7.AbstractC7350t.e(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // H9.v
    public H9.B a(H9.v.a aVar) {
        java.util.List list;
        H9.B bA;
        p247y7.AbstractC7350t.f(aVar, "chain");
        N9.g gVar = (N9.g) aVar;
        H9.z zVarI = gVar.i();
        M9.e eVarE = gVar.e();
        java.util.List listM = p097j7.AbstractC6879v.m();
        int i6 = 0;
        H9.B b6 = null;
        while (true) {
            boolean z6 = true;
            while (true) {
                eVarE.k(zVarI, z6);
                try {
                    if (eVarE.D()) {
                        throw new java.io.IOException("Canceled");
                    }
                    try {
                        bA = gVar.a(zVarI);
                    } catch (M9.i e6) {
                        if (!e(e6.c(), eVarE, zVarI, false)) {
                            throw I9.d.Z(e6.b(), listM);
                        }
                        list = listM;
                        e = e6.b();
                        listM = p097j7.AbstractC6879v.D0(list, e);
                        eVarE.l(true);
                        z6 = false;
                    } catch (java.io.IOException e10) {
                        e = e10;
                        if (!e(e, eVarE, zVarI, !(e instanceof P9.a))) {
                            throw I9.d.Z(e, listM);
                        }
                        list = listM;
                        listM = p097j7.AbstractC6879v.D0(list, e);
                        eVarE.l(true);
                        z6 = false;
                    }
                    eVarE.l(true);
                    z6 = false;
                } catch (java.lang.Throwable th) {
                    eVarE.l(true);
                    throw th;
                }
            }
            if (b6 != null) {
                bA = bA.g0().o(b6.g0().b(null).c()).c();
            }
            b6 = bA;
            M9.c cVarR = eVarE.r();
            H9.z zVarC = c(b6, cVarR);
            if (zVarC == null) {
                if (cVarR != null && cVarR.m()) {
                    eVarE.C();
                }
                eVarE.l(false);
                return b6;
            }
            H9.A a6 = zVarC.a();
            if (a6 != null && a6.d()) {
                eVarE.l(false);
                return b6;
            }
            H9.C cA = b6.a();
            if (cA != null) {
                I9.d.m(cA);
            }
            i6++;
            if (i6 > 20) {
                throw new java.net.ProtocolException("Too many follow-up requests: " + i6);
            }
            eVarE.l(true);
            zVarI = zVarC;
        }
    }
}
