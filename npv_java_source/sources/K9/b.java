package K9;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K9.b.a f6160c = new K9.b.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H9.z f6161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H9.B f6162b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:24:0x003b  */
        public final boolean a(H9.B b6, H9.z zVar) {
            p247y7.AbstractC7350t.f(b6, "response");
            p247y7.AbstractC7350t.f(zVar, "request");
            int iO = b6.o();
            if (iO != 200 && iO != 410 && iO != 414 && iO != 501 && iO != 203 && iO != 204) {
                if (iO == 307) {
                    if (H9.B.D(b6, "Expires", null, 2, null) == null && b6.f().c() == -1 && !b6.f().b() && !b6.f().a()) {
                        return false;
                    }
                } else if (iO != 308 && iO != 404 && iO != 405) {
                    switch (iO) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            if (H9.B.D(b6, "Expires", null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (b6.f().h() || zVar.b().h()) ? false : true;
        }
    }

    /* JADX INFO: renamed from: K9.b$b, reason: collision with other inner class name */
    public static final class C0151b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f6163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final H9.z f6164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final H9.B f6165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.util.Date f6166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.lang.String f6167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private java.util.Date f6168f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private java.lang.String f6169g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private java.util.Date f6170h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f6171i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f6172j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private java.lang.String f6173k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f6174l;

        public C0151b(long j6, H9.z zVar, H9.B b6) {
            p247y7.AbstractC7350t.f(zVar, "request");
            this.f6163a = j6;
            this.f6164b = zVar;
            this.f6165c = b6;
            this.f6174l = -1;
            if (b6 != null) {
                this.f6171i = b6.s0();
                this.f6172j = b6.q0();
                H9.t tVarH = b6.H();
                int size = tVarH.size();
                for (int i6 = 0; i6 < size; i6++) {
                    java.lang.String strE = tVarH.e(i6);
                    java.lang.String strS = tVarH.s(i6);
                    if (S8.r.K(strE, "Date", true)) {
                        this.f6166d = N9.c.a(strS);
                        this.f6167e = strS;
                    } else if (S8.r.K(strE, "Expires", true)) {
                        this.f6170h = N9.c.a(strS);
                    } else if (S8.r.K(strE, "Last-Modified", true)) {
                        this.f6168f = N9.c.a(strS);
                        this.f6169g = strS;
                    } else if (S8.r.K(strE, "ETag", true)) {
                        this.f6173k = strS;
                    } else if (S8.r.K(strE, "Age", true)) {
                        this.f6174l = I9.d.W(strS, -1);
                    }
                }
            }
        }

        private final long a() {
            java.util.Date date = this.f6166d;
            long jMax = date != null ? java.lang.Math.max(0L, this.f6172j - date.getTime()) : 0L;
            int i6 = this.f6174l;
            if (i6 != -1) {
                jMax = java.lang.Math.max(jMax, java.util.concurrent.TimeUnit.SECONDS.toMillis(i6));
            }
            long j6 = this.f6172j;
            return jMax + (j6 - this.f6171i) + (this.f6163a - j6);
        }

        private final K9.b c() {
            java.lang.String str;
            if (this.f6165c == null) {
                return new K9.b(this.f6164b, null);
            }
            if ((!this.f6164b.f() || this.f6165c.s() != null) && K9.b.f6160c.a(this.f6165c, this.f6164b)) {
                H9.C1238d c1238dB = this.f6164b.b();
                if (c1238dB.g() || e(this.f6164b)) {
                    return new K9.b(this.f6164b, null);
                }
                H9.C1238d c1238dF = this.f6165c.f();
                long jA = a();
                long jD = d();
                if (c1238dB.c() != -1) {
                    jD = java.lang.Math.min(jD, java.util.concurrent.TimeUnit.SECONDS.toMillis(c1238dB.c()));
                }
                long millis = 0;
                long millis2 = c1238dB.e() != -1 ? java.util.concurrent.TimeUnit.SECONDS.toMillis(c1238dB.e()) : 0L;
                if (!c1238dF.f() && c1238dB.d() != -1) {
                    millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(c1238dB.d());
                }
                if (!c1238dF.g()) {
                    long j6 = millis2 + jA;
                    if (j6 < millis + jD) {
                        H9.B.a aVarG0 = this.f6165c.g0();
                        if (j6 >= jD) {
                            aVarG0.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jA > 86400000 && f()) {
                            aVarG0.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new K9.b(null, aVarG0.c());
                    }
                }
                java.lang.String str2 = this.f6173k;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.f6168f != null) {
                        str2 = this.f6169g;
                    } else {
                        if (this.f6166d == null) {
                            return new K9.b(this.f6164b, null);
                        }
                        str2 = this.f6167e;
                    }
                    str = "If-Modified-Since";
                }
                H9.t.a aVarG = this.f6164b.e().g();
                p247y7.AbstractC7350t.c(str2);
                aVarG.c(str, str2);
                return new K9.b(this.f6164b.h().d(aVarG.d()).b(), this.f6165c);
            }
            return new K9.b(this.f6164b, null);
        }

        private final long d() {
            H9.B b6 = this.f6165c;
            p247y7.AbstractC7350t.c(b6);
            H9.C1238d c1238dF = b6.f();
            if (c1238dF.c() != -1) {
                return java.util.concurrent.TimeUnit.SECONDS.toMillis(c1238dF.c());
            }
            java.util.Date date = this.f6170h;
            if (date != null) {
                java.util.Date date2 = this.f6166d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f6172j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f6168f == null || this.f6165c.r0().i().m() != null) {
                return 0L;
            }
            java.util.Date date3 = this.f6166d;
            long time2 = date3 != null ? date3.getTime() : this.f6171i;
            java.util.Date date4 = this.f6168f;
            p247y7.AbstractC7350t.c(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / ((long) 10);
            }
            return 0L;
        }

        private final boolean e(H9.z zVar) {
            return (zVar.d("If-Modified-Since") == null && zVar.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            H9.B b6 = this.f6165c;
            p247y7.AbstractC7350t.c(b6);
            return b6.f().c() == -1 && this.f6170h == null;
        }

        public final K9.b b() {
            K9.b bVarC = c();
            return (bVarC.b() == null || !this.f6164b.b().i()) ? bVarC : new K9.b(null, null);
        }
    }

    public b(H9.z zVar, H9.B b6) {
        this.f6161a = zVar;
        this.f6162b = b6;
    }

    public final H9.B a() {
        return this.f6162b;
    }

    public final H9.z b() {
        return this.f6161a;
    }
}
