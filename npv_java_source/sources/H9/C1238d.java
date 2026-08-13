package H9;

/* JADX INFO: renamed from: H9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1238d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final H9.C1238d.b f4597n = new H9.C1238d.b(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final H9.C1238d f4598o = new H9.C1238d.a().d().a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final H9.C1238d f4599p = new H9.C1238d.a().e().c(Integer.MAX_VALUE, java.util.concurrent.TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f4600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f4604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f4605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f4606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f4607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f4608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f4609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f4610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f4611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private java.lang.String f4612m;

    /* JADX INFO: renamed from: H9.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f4613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f4614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4615c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f4616d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f4617e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f4618f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f4619g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f4620h;

        private final int b(long j6) {
            if (j6 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j6;
        }

        public final H9.C1238d a() {
            return new H9.C1238d(this.f4613a, this.f4614b, this.f4615c, -1, false, false, false, this.f4616d, this.f4617e, this.f4618f, this.f4619g, this.f4620h, null, null);
        }

        public final H9.C1238d.a c(int i6, java.util.concurrent.TimeUnit timeUnit) {
            p247y7.AbstractC7350t.f(timeUnit, "timeUnit");
            if (i6 >= 0) {
                this.f4616d = b(timeUnit.toSeconds(i6));
                return this;
            }
            throw new java.lang.IllegalArgumentException(("maxStale < 0: " + i6).toString());
        }

        public final H9.C1238d.a d() {
            this.f4613a = true;
            return this;
        }

        public final H9.C1238d.a e() {
            this.f4618f = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: H9.d$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final int a(java.lang.String str, java.lang.String str2, int i6) {
            int length = str.length();
            while (i6 < length) {
                if (S8.r.b0(str2, str.charAt(i6), false, 2, null)) {
                    return i6;
                }
                i6++;
            }
            return str.length();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004b  */
        /* JADX WARN: Code duplicated, block: B:17:0x0068  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:36:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:43:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:44:0x0104  */
        /* JADX WARN: Code duplicated, block: B:46:0x010c  */
        /* JADX WARN: Code duplicated, block: B:47:0x0111  */
        /* JADX WARN: Code duplicated, block: B:49:0x0119  */
        /* JADX WARN: Code duplicated, block: B:50:0x011e  */
        /* JADX WARN: Code duplicated, block: B:52:0x0126  */
        /* JADX WARN: Code duplicated, block: B:53:0x012c  */
        /* JADX WARN: Code duplicated, block: B:55:0x0134  */
        /* JADX WARN: Code duplicated, block: B:56:0x013c  */
        /* JADX WARN: Code duplicated, block: B:58:0x0144  */
        /* JADX WARN: Code duplicated, block: B:59:0x014a  */
        /* JADX WARN: Code duplicated, block: B:61:0x0153  */
        /* JADX WARN: Code duplicated, block: B:62:0x015a  */
        /* JADX WARN: Code duplicated, block: B:64:0x0162  */
        /* JADX WARN: Code duplicated, block: B:65:0x0169  */
        /* JADX WARN: Code duplicated, block: B:67:0x0171  */
        public final H9.C1238d b(H9.t tVar) {
            int iA;
            int iA2;
            java.lang.String string;
            int i6;
            java.lang.String string2;
            H9.t tVar2 = tVar;
            p247y7.AbstractC7350t.f(tVar2, "headers");
            int size = tVar.size();
            boolean z6 = true;
            boolean z10 = true;
            int i10 = 0;
            java.lang.String str = null;
            boolean z11 = false;
            boolean z12 = false;
            int iW = -1;
            int iW2 = -1;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            int iW3 = -1;
            int iW4 = -1;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            while (i10 < size) {
                java.lang.String strE = tVar2.e(i10);
                java.lang.String strS = tVar2.s(i10);
                if (S8.r.K(strE, "Cache-Control", z6)) {
                    if (str == null) {
                        str = strS;
                    }
                    iA = 0;
                    while (iA < strS.length()) {
                        iA2 = a(strS, "=,;", iA);
                        java.lang.String strSubstring = strS.substring(iA, iA2);
                        p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = S8.r.u1(strSubstring).toString();
                        if (iA2 != strS.length()) {
                            i6 = size;
                            if (strS.charAt(iA2) == ',' && strS.charAt(iA2) != ';') {
                                int iD = I9.d.D(strS, iA2 + 1);
                                if (iD >= strS.length() || strS.charAt(iD) != '\"') {
                                    iA = a(strS, ",;", iD);
                                    java.lang.String strSubstring2 = strS.substring(iD, iA);
                                    p247y7.AbstractC7350t.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    string2 = S8.r.u1(strSubstring2).toString();
                                } else {
                                    int i11 = iD + 1;
                                    int iO0 = S8.r.o0(strS, '\"', i11, false, 4, null);
                                    string2 = strS.substring(i11, iO0);
                                    p247y7.AbstractC7350t.e(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    iA = iO0 + 1;
                                }
                            }
                            z6 = true;
                            if (S8.r.K("no-cache", string, true)) {
                                z11 = true;
                            } else if (S8.r.K("no-store", string, true)) {
                                z12 = true;
                            } else if (S8.r.K("max-age", string, true)) {
                                iW = I9.d.W(string2, -1);
                            } else if (S8.r.K("s-maxage", string, true)) {
                                iW2 = I9.d.W(string2, -1);
                            } else if (S8.r.K("private", string, true)) {
                                z13 = true;
                            } else if (S8.r.K("public", string, true)) {
                                z14 = true;
                            } else if (S8.r.K("must-revalidate", string, true)) {
                                z15 = true;
                            } else if (S8.r.K("max-stale", string, true)) {
                                iW3 = I9.d.W(string2, Integer.MAX_VALUE);
                            } else if (S8.r.K("min-fresh", string, true)) {
                                iW4 = I9.d.W(string2, -1);
                            } else if (S8.r.K("only-if-cached", string, true)) {
                                z16 = true;
                            } else if (S8.r.K("no-transform", string, true)) {
                                z17 = true;
                            } else if (S8.r.K("immutable", string, true)) {
                                z18 = true;
                            }
                            size = i6;
                        } else {
                            i6 = size;
                        }
                        iA = iA2 + 1;
                        string2 = null;
                        z6 = true;
                        if (S8.r.K("no-cache", string, true)) {
                            z11 = true;
                        } else if (S8.r.K("no-store", string, true)) {
                            z12 = true;
                        } else if (S8.r.K("max-age", string, true)) {
                            iW = I9.d.W(string2, -1);
                        } else if (S8.r.K("s-maxage", string, true)) {
                            iW2 = I9.d.W(string2, -1);
                        } else if (S8.r.K("private", string, true)) {
                            z13 = true;
                        } else if (S8.r.K("public", string, true)) {
                            z14 = true;
                        } else if (S8.r.K("must-revalidate", string, true)) {
                            z15 = true;
                        } else if (S8.r.K("max-stale", string, true)) {
                            iW3 = I9.d.W(string2, Integer.MAX_VALUE);
                        } else if (S8.r.K("min-fresh", string, true)) {
                            iW4 = I9.d.W(string2, -1);
                        } else if (S8.r.K("only-if-cached", string, true)) {
                            z16 = true;
                        } else if (S8.r.K("no-transform", string, true)) {
                            z17 = true;
                        } else if (S8.r.K("immutable", string, true)) {
                            z18 = true;
                        }
                        size = i6;
                    }
                    i10++;
                    tVar2 = tVar;
                    size = size;
                } else {
                    if (S8.r.K(strE, "Pragma", z6)) {
                    }
                    i10++;
                    tVar2 = tVar;
                    size = size;
                }
                z10 = false;
                iA = 0;
                while (iA < strS.length()) {
                    iA2 = a(strS, "=,;", iA);
                    java.lang.String strSubstring3 = strS.substring(iA, iA2);
                    p247y7.AbstractC7350t.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = S8.r.u1(strSubstring3).toString();
                    if (iA2 != strS.length()) {
                        i6 = size;
                        if (strS.charAt(iA2) == ',') {
                        }
                        z6 = true;
                        if (S8.r.K("no-cache", string, true)) {
                            z11 = true;
                        } else if (S8.r.K("no-store", string, true)) {
                            z12 = true;
                        } else if (S8.r.K("max-age", string, true)) {
                            iW = I9.d.W(string2, -1);
                        } else if (S8.r.K("s-maxage", string, true)) {
                            iW2 = I9.d.W(string2, -1);
                        } else if (S8.r.K("private", string, true)) {
                            z13 = true;
                        } else if (S8.r.K("public", string, true)) {
                            z14 = true;
                        } else if (S8.r.K("must-revalidate", string, true)) {
                            z15 = true;
                        } else if (S8.r.K("max-stale", string, true)) {
                            iW3 = I9.d.W(string2, Integer.MAX_VALUE);
                        } else if (S8.r.K("min-fresh", string, true)) {
                            iW4 = I9.d.W(string2, -1);
                        } else if (S8.r.K("only-if-cached", string, true)) {
                            z16 = true;
                        } else if (S8.r.K("no-transform", string, true)) {
                            z17 = true;
                        } else if (S8.r.K("immutable", string, true)) {
                            z18 = true;
                        }
                        size = i6;
                    } else {
                        i6 = size;
                    }
                    iA = iA2 + 1;
                    string2 = null;
                    z6 = true;
                    if (S8.r.K("no-cache", string, true)) {
                        z11 = true;
                    } else if (S8.r.K("no-store", string, true)) {
                        z12 = true;
                    } else if (S8.r.K("max-age", string, true)) {
                        iW = I9.d.W(string2, -1);
                    } else if (S8.r.K("s-maxage", string, true)) {
                        iW2 = I9.d.W(string2, -1);
                    } else if (S8.r.K("private", string, true)) {
                        z13 = true;
                    } else if (S8.r.K("public", string, true)) {
                        z14 = true;
                    } else if (S8.r.K("must-revalidate", string, true)) {
                        z15 = true;
                    } else if (S8.r.K("max-stale", string, true)) {
                        iW3 = I9.d.W(string2, Integer.MAX_VALUE);
                    } else if (S8.r.K("min-fresh", string, true)) {
                        iW4 = I9.d.W(string2, -1);
                    } else if (S8.r.K("only-if-cached", string, true)) {
                        z16 = true;
                    } else if (S8.r.K("no-transform", string, true)) {
                        z17 = true;
                    } else if (S8.r.K("immutable", string, true)) {
                        z18 = true;
                    }
                    size = i6;
                }
                i10++;
                tVar2 = tVar;
                size = size;
            }
            return new H9.C1238d(z11, z12, iW, iW2, z13, z14, z15, iW3, iW4, z16, z17, z18, !z10 ? null : str, null);
        }
    }

    private C1238d(boolean z6, boolean z10, int i6, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, boolean z14, boolean z15, boolean z16, java.lang.String str) {
        this.f4600a = z6;
        this.f4601b = z10;
        this.f4602c = i6;
        this.f4603d = i10;
        this.f4604e = z11;
        this.f4605f = z12;
        this.f4606g = z13;
        this.f4607h = i11;
        this.f4608i = i12;
        this.f4609j = z14;
        this.f4610k = z15;
        this.f4611l = z16;
        this.f4612m = str;
    }

    public /* synthetic */ C1238d(boolean z6, boolean z10, int i6, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, boolean z14, boolean z15, boolean z16, java.lang.String str, p247y7.AbstractC7342k abstractC7342k) {
        this(z6, z10, i6, i10, z11, z12, z13, i11, i12, z14, z15, z16, str);
    }

    public final boolean a() {
        return this.f4604e;
    }

    public final boolean b() {
        return this.f4605f;
    }

    public final int c() {
        return this.f4602c;
    }

    public final int d() {
        return this.f4607h;
    }

    public final int e() {
        return this.f4608i;
    }

    public final boolean f() {
        return this.f4606g;
    }

    public final boolean g() {
        return this.f4600a;
    }

    public final boolean h() {
        return this.f4601b;
    }

    public final boolean i() {
        return this.f4609j;
    }

    public java.lang.String toString() {
        java.lang.String str = this.f4612m;
        if (str != null) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.f4600a) {
            sb.append("no-cache, ");
        }
        if (this.f4601b) {
            sb.append("no-store, ");
        }
        if (this.f4602c != -1) {
            sb.append("max-age=");
            sb.append(this.f4602c);
            sb.append(", ");
        }
        if (this.f4603d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f4603d);
            sb.append(", ");
        }
        if (this.f4604e) {
            sb.append("private, ");
        }
        if (this.f4605f) {
            sb.append("public, ");
        }
        if (this.f4606g) {
            sb.append("must-revalidate, ");
        }
        if (this.f4607h != -1) {
            sb.append("max-stale=");
            sb.append(this.f4607h);
            sb.append(", ");
        }
        if (this.f4608i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f4608i);
            sb.append(", ");
        }
        if (this.f4609j) {
            sb.append("only-if-cached, ");
        }
        if (this.f4610k) {
            sb.append("no-transform, ");
        }
        if (this.f4611l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        this.f4612m = string;
        return string;
    }
}
