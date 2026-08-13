package p089i9;

/* JADX INFO: loaded from: classes2.dex */
public interface S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i9.S.a f47388a = i9.S.a.f47389a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ i9.S.a f47389a = new i9.S.a();

        private a() {
        }

        public final p089i9.S a(java.lang.String str) {
            java.util.List list;
            java.util.List list2;
            java.lang.StringBuilder sb;
            p247y7.AbstractC7350t.f(str, "pattern");
            java.util.List listS = p097j7.AbstractC6879v.s(new java.util.ArrayList());
            int length = str.length();
            int i6 = 0;
            boolean z6 = false;
            java.lang.String string = "";
            java.lang.Character chValueOf = null;
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (chValueOf != null && cCharAt == chValueOf.charValue()) {
                    i6++;
                } else if (!z6) {
                    if (i6 > 0) {
                        java.util.List list3 = (java.util.List) p097j7.AbstractC6879v.t0(listS);
                        if (list3 != null) {
                            p247y7.AbstractC7350t.c(chValueOf);
                            list3.add(p089i9.T.l(chValueOf.charValue(), i6));
                        }
                        i6 = 0;
                        chValueOf = null;
                    }
                    if (p089i9.T.f47463a.contains(java.lang.Character.valueOf(cCharAt))) {
                        if (!p247y7.AbstractC7350t.b(string, "")) {
                            java.util.List list4 = (java.util.List) p097j7.AbstractC6879v.t0(listS);
                            if (list4 != null) {
                                list4.add(new i9.S.e(string));
                            }
                            string = "";
                        }
                        if (cCharAt == '\'') {
                            z6 = true;
                            string = "";
                        } else if (cCharAt == '[') {
                            listS.add(new java.util.ArrayList());
                        } else if (cCharAt == ']') {
                            java.util.List list5 = (java.util.List) p097j7.AbstractC6879v.L(listS);
                            if (list5 == null) {
                                throw new java.lang.IllegalArgumentException("Unmatched closing bracket");
                            }
                            java.util.List list6 = (java.util.List) p097j7.AbstractC6879v.t0(listS);
                            if (list6 != null) {
                                list6.add(new i9.S.c(new i9.S.d(list5)));
                            }
                        } else {
                            chValueOf = java.lang.Character.valueOf(cCharAt);
                            i6 = 1;
                        }
                    } else {
                        sb = new java.lang.StringBuilder();
                        sb.append(string);
                        sb.append(cCharAt);
                        string = sb.toString();
                    }
                } else if (cCharAt == '\'') {
                    java.util.List list7 = (java.util.List) p097j7.AbstractC6879v.t0(listS);
                    if (list7 != null) {
                        if (string.length() == 0) {
                            string = "'";
                        }
                        list7.add(new i9.S.e(string));
                    }
                    z6 = false;
                    string = "";
                } else {
                    sb = new java.lang.StringBuilder();
                    sb.append(string);
                    sb.append(cCharAt);
                    string = sb.toString();
                }
            }
            if (i6 > 0 && (list2 = (java.util.List) p097j7.AbstractC6879v.t0(listS)) != null) {
                p247y7.AbstractC7350t.c(chValueOf);
                list2.add(p089i9.T.l(chValueOf.charValue(), i6));
            }
            if (!p247y7.AbstractC7350t.b(string, "") && (list = (java.util.List) p097j7.AbstractC6879v.t0(listS)) != null) {
                list.add(new i9.S.e(string));
            }
            java.util.List list8 = (java.util.List) p097j7.AbstractC6879v.L(listS);
            if (list8 != null) {
                return new i9.S.d(list8);
            }
            throw new java.lang.IllegalArgumentException("Unmatched opening bracket");
        }
    }

    public static abstract class b implements p089i9.S {

        public static abstract class a extends i9.S.b {

            /* JADX INFO: renamed from: i9.S$b$a$a, reason: collision with other inner class name */
            public static final class C0581a extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47390b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47391c;

                public C0581a(int i6) {
                    super(null);
                    this.f47390b = i6;
                    this.f47391c = 'U';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47390b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47391c;
                }

                @Override // i9.S.b.a
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.a aVar) {
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    p089i9.T.o("cyclic-year", null, 2, null);
                    throw new p087i7.C6665k();
                }
            }

            /* JADX INFO: renamed from: i9.S$b$a$b, reason: collision with other inner class name */
            public static final class C0582b extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47392b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47393c;

                public C0582b(int i6) {
                    super(null);
                    this.f47392b = i6;
                    this.f47393c = 'd';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47392b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47393c;
                }

                @Override // i9.S.b.a
                public void c(p089i9.InterfaceC6684o.a aVar) {
                    p089i9.K k6;
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    int iA = a();
                    if (iA == 1) {
                        k6 = p089i9.K.NONE;
                    } else {
                        if (iA != 2) {
                            p089i9.T.m(this);
                            throw new p087i7.C6665k();
                        }
                        k6 = p089i9.K.ZERO;
                    }
                    aVar.o(k6);
                }
            }

            public static final class c extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47394b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47395c;

                public c(int i6) {
                    super(null);
                    this.f47394b = i6;
                    this.f47395c = 'E';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47394b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47395c;
                }

                @Override // i9.S.b.a
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.a aVar) {
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    p089i9.T.k(this, null, 1, null);
                    throw new p087i7.C6665k();
                }
            }

            public static final class d extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47396b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47397c;

                public d(int i6) {
                    super(null);
                    this.f47396b = i6;
                    this.f47397c = 'F';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47396b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47397c;
                }

                @Override // i9.S.b.a
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.a aVar) {
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    p089i9.T.o("day-of-week-in-month", null, 2, null);
                    throw new p087i7.C6665k();
                }
            }

            public static final class e extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47398b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47399c;

                public e(int i6) {
                    super(null);
                    this.f47398b = i6;
                    this.f47399c = 'D';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47398b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47399c;
                }

                @Override // i9.S.b.a
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.a aVar) {
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    p089i9.T.o("day-of-year", null, 2, null);
                    throw new p087i7.C6665k();
                }
            }

            public static final class f extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47400b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47401c;

                public f(int i6) {
                    super(null);
                    this.f47400b = i6;
                    this.f47401c = 'G';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47400b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47401c;
                }

                @Override // i9.S.b.a
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.a aVar) {
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    p089i9.T.k(this, null, 1, null);
                    throw new p087i7.C6665k();
                }
            }

            public static final class g extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47402b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47403c;

                public g(int i6) {
                    super(null);
                    this.f47402b = i6;
                    this.f47403c = 'e';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47402b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47403c;
                }

                @Override // i9.S.b.a
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.a aVar) {
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    p089i9.T.k(this, null, 1, null);
                    throw new p087i7.C6665k();
                }
            }

            public static final class h extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47404b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47405c;

                public h(int i6) {
                    super(null);
                    this.f47404b = i6;
                    this.f47405c = 'g';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47404b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47405c;
                }

                @Override // i9.S.b.a
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.a aVar) {
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    p089i9.T.o("modified-julian-day", null, 2, null);
                    throw new p087i7.C6665k();
                }
            }

            public static final class i extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47406b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47407c;

                public i(int i6) {
                    super(null);
                    this.f47406b = i6;
                    this.f47407c = 'M';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47406b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47407c;
                }

                @Override // i9.S.b.a
                public void c(p089i9.InterfaceC6684o.a aVar) {
                    p089i9.K k6;
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    int iA = a();
                    if (iA == 1) {
                        k6 = p089i9.K.NONE;
                    } else {
                        if (iA != 2) {
                            if (iA == 3 || iA == 4 || iA == 5) {
                                p089i9.T.k(this, null, 1, null);
                                throw new p087i7.C6665k();
                            }
                            p089i9.T.m(this);
                            throw new p087i7.C6665k();
                        }
                        k6 = p089i9.K.ZERO;
                    }
                    aVar.d(k6);
                }
            }

            public static final class j extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47408b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47409c;

                public j(int i6) {
                    super(null);
                    this.f47408b = i6;
                    this.f47409c = 'Q';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47408b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47409c;
                }

                @Override // i9.S.b.a
                public void c(p089i9.InterfaceC6684o.a aVar) {
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    int iA = a();
                    if (iA == 1 || iA == 2) {
                        p089i9.T.o("quarter-of-year", null, 2, null);
                        throw new p087i7.C6665k();
                    }
                    if (iA == 3 || iA == 4 || iA == 5) {
                        p089i9.T.k(this, null, 1, null);
                        throw new p087i7.C6665k();
                    }
                    p089i9.T.m(this);
                    throw new p087i7.C6665k();
                }
            }

            public static final class k extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47410b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47411c;

                public k(int i6) {
                    super(null);
                    this.f47410b = i6;
                    this.f47411c = 'r';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47410b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47411c;
                }

                @Override // i9.S.b.a
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.a aVar) {
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    p089i9.T.o("related-gregorian-year", null, 2, null);
                    throw new p087i7.C6665k();
                }
            }

            public static final class l extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47412b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47413c;

                public l(int i6) {
                    super(null);
                    this.f47412b = i6;
                    this.f47413c = 'c';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47412b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47413c;
                }

                @Override // i9.S.b.a
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.a aVar) {
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    p089i9.T.k(this, null, 1, null);
                    throw new p087i7.C6665k();
                }
            }

            public static final class m extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47414b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47415c;

                public m(int i6) {
                    super(null);
                    this.f47414b = i6;
                    this.f47415c = 'L';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47414b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47415c;
                }

                @Override // i9.S.b.a
                public void c(p089i9.InterfaceC6684o.a aVar) {
                    p089i9.K k6;
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    int iA = a();
                    if (iA == 1) {
                        k6 = p089i9.K.NONE;
                    } else {
                        if (iA != 2) {
                            if (iA == 3 || iA == 4 || iA == 5) {
                                p089i9.T.k(this, null, 1, null);
                                throw new p087i7.C6665k();
                            }
                            p089i9.T.m(this);
                            throw new p087i7.C6665k();
                        }
                        k6 = p089i9.K.ZERO;
                    }
                    aVar.d(k6);
                }
            }

            public static final class n extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47416b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47417c;

                public n(int i6) {
                    super(null);
                    this.f47416b = i6;
                    this.f47417c = 'q';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47416b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47417c;
                }

                @Override // i9.S.b.a
                public void c(p089i9.InterfaceC6684o.a aVar) {
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    int iA = a();
                    if (iA == 1 || iA == 2) {
                        p089i9.T.o("standalone-quarter-of-year", null, 2, null);
                        throw new p087i7.C6665k();
                    }
                    if (iA == 3 || iA == 4 || iA == 5) {
                        p089i9.T.k(this, null, 1, null);
                        throw new p087i7.C6665k();
                    }
                    p089i9.T.m(this);
                    throw new p087i7.C6665k();
                }
            }

            public static final class o extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47418b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47419c;

                public o(int i6) {
                    super(null);
                    this.f47418b = i6;
                    this.f47419c = 'Y';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47418b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47419c;
                }

                @Override // i9.S.b.a
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.a aVar) {
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    p089i9.T.o("week-based-year", null, 2, null);
                    throw new p087i7.C6665k();
                }
            }

            public static final class p extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47420b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47421c;

                public p(int i6) {
                    super(null);
                    this.f47420b = i6;
                    this.f47421c = 'W';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47420b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47421c;
                }

                @Override // i9.S.b.a
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.a aVar) {
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    p089i9.T.o("week-of-month", null, 2, null);
                    throw new p087i7.C6665k();
                }
            }

            public static final class q extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47422b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47423c;

                public q(int i6) {
                    super(null);
                    this.f47422b = i6;
                    this.f47423c = 'w';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47422b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47423c;
                }

                @Override // i9.S.b.a
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.a aVar) {
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    p089i9.T.o("week-of-week-based-year", null, 2, null);
                    throw new p087i7.C6665k();
                }
            }

            public static final class r extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47424b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47425c;

                public r(int i6) {
                    super(null);
                    this.f47424b = i6;
                    this.f47425c = 'u';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47424b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47425c;
                }

                @Override // i9.S.b.a
                public void c(p089i9.InterfaceC6684o.a aVar) {
                    p089i9.K k6;
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    int iA = a();
                    if (iA == 1) {
                        k6 = p089i9.K.NONE;
                    } else if (iA == 2) {
                        aVar.q(2000);
                        return;
                    } else {
                        if (iA == 3) {
                            p089i9.T.p(this, a());
                            throw new p087i7.C6665k();
                        }
                        if (iA != 4) {
                            p089i9.T.p(this, a());
                            throw new p087i7.C6665k();
                        }
                        k6 = p089i9.K.ZERO;
                    }
                    aVar.b(k6);
                }
            }

            public static final class s extends i9.S.b.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47426b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47427c;

                public s(int i6) {
                    super(null);
                    this.f47426b = i6;
                    this.f47427c = 'y';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47426b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47427c;
                }

                @Override // i9.S.b.a
                public void c(p089i9.InterfaceC6684o.a aVar) {
                    p089i9.K k6;
                    p247y7.AbstractC7350t.f(aVar, "builder");
                    int iA = a();
                    if (iA == 1) {
                        k6 = p089i9.K.NONE;
                    } else if (iA == 2) {
                        p089i9.A.f(aVar, 2000);
                        return;
                    } else {
                        if (iA == 3) {
                            p089i9.T.p(this, a());
                            throw new p087i7.C6665k();
                        }
                        if (iA != 4) {
                            p089i9.T.p(this, a());
                            throw new p087i7.C6665k();
                        }
                        k6 = p089i9.K.ZERO;
                    }
                    p089i9.A.e(aVar, k6);
                }
            }

            private a() {
                super(null);
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public abstract void c(p089i9.InterfaceC6684o.a aVar);
        }

        /* JADX INFO: renamed from: i9.S$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC0583b extends i9.S.b {

            /* JADX INFO: renamed from: i9.S$b$b$a */
            public static final class a extends i9.S.b.AbstractC0583b {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47428b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47429c;

                public a(int i6) {
                    super(null);
                    this.f47428b = i6;
                    this.f47429c = 'O';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47428b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47429c;
                }

                @Override // i9.S.b.AbstractC0583b
                public p089i9.b0 e() {
                    p089i9.T.k(this, null, 1, null);
                    throw new p087i7.C6665k();
                }

                @Override // i9.S.b.AbstractC0583b
                public p089i9.b0 f() {
                    p089i9.T.k(this, null, 1, null);
                    throw new p087i7.C6665k();
                }

                @Override // i9.S.b.AbstractC0583b
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.e eVar) {
                    p247y7.AbstractC7350t.f(eVar, "builder");
                    p089i9.T.k(this, null, 1, null);
                    throw new p087i7.C6665k();
                }
            }

            /* JADX INFO: renamed from: i9.S$b$b$b, reason: collision with other inner class name */
            public static final class C0584b extends i9.S.b.AbstractC0583b {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47430b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47431c;

                public C0584b(int i6) {
                    super(null);
                    this.f47430b = i6;
                    this.f47431c = 'X';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47430b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47431c;
                }

                @Override // i9.S.b.AbstractC0583b
                public void c(p089i9.InterfaceC6684o.e eVar) {
                    p247y7.AbstractC7350t.f(eVar, "builder");
                    int iA = a();
                    if (iA != 1 && iA != 2) {
                        if (iA != 3) {
                            if (iA != 4) {
                                if (iA != 5) {
                                    p089i9.T.m(this);
                                    throw new p087i7.C6665k();
                                }
                            }
                        }
                        d(eVar, true, true);
                        return;
                    }
                    d(eVar, true, false);
                }

                @Override // i9.S.b.AbstractC0583b
                public p089i9.b0 e() {
                    return a() == 1 ? p089i9.b0.IF_NONZERO : p089i9.b0.ALWAYS;
                }

                @Override // i9.S.b.AbstractC0583b
                public p089i9.b0 f() {
                    return a() <= 3 ? p089i9.b0.NEVER : p089i9.b0.IF_NONZERO;
                }
            }

            /* JADX INFO: renamed from: i9.S$b$b$c */
            public static final class c extends i9.S.b.AbstractC0583b {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47432b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47433c;

                public c(int i6) {
                    super(null);
                    this.f47432b = i6;
                    this.f47433c = 'x';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47432b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47433c;
                }

                @Override // i9.S.b.AbstractC0583b
                public void c(p089i9.InterfaceC6684o.e eVar) {
                    p247y7.AbstractC7350t.f(eVar, "builder");
                    int iA = a();
                    if (iA != 1 && iA != 2) {
                        if (iA != 3) {
                            if (iA != 4) {
                                if (iA != 5) {
                                    p089i9.T.m(this);
                                    throw new p087i7.C6665k();
                                }
                            }
                        }
                        d(eVar, false, true);
                        return;
                    }
                    d(eVar, false, false);
                }

                @Override // i9.S.b.AbstractC0583b
                public p089i9.b0 e() {
                    return a() == 1 ? p089i9.b0.IF_NONZERO : p089i9.b0.ALWAYS;
                }

                @Override // i9.S.b.AbstractC0583b
                public p089i9.b0 f() {
                    return a() <= 3 ? p089i9.b0.NEVER : p089i9.b0.IF_NONZERO;
                }
            }

            /* JADX INFO: renamed from: i9.S$b$b$d */
            public static final class d extends i9.S.b.AbstractC0583b {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47434b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47435c;

                public d(int i6) {
                    super(null);
                    this.f47434b = i6;
                    this.f47435c = 'Z';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47434b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47435c;
                }

                @Override // i9.S.b.AbstractC0583b
                public void c(p089i9.InterfaceC6684o.e eVar) {
                    p247y7.AbstractC7350t.f(eVar, "builder");
                    int iA = a();
                    if (iA == 1 || iA == 2 || iA == 3) {
                        d(eVar, false, false);
                        return;
                    }
                    if (iA == 4) {
                        new i9.S.b.AbstractC0583b.a(4).c(eVar);
                        throw new p087i7.C6665k();
                    }
                    if (iA == 5) {
                        d(eVar, false, true);
                    } else {
                        p089i9.T.m(this);
                        throw new p087i7.C6665k();
                    }
                }

                @Override // i9.S.b.AbstractC0583b
                public p089i9.b0 e() {
                    return p089i9.b0.ALWAYS;
                }

                @Override // i9.S.b.AbstractC0583b
                public p089i9.b0 f() {
                    return a() <= 3 ? p089i9.b0.NEVER : p089i9.b0.IF_NONZERO;
                }
            }

            private AbstractC0583b() {
                super(null);
            }

            public /* synthetic */ AbstractC0583b(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public abstract void c(p089i9.InterfaceC6684o.e eVar);

            public final void d(p089i9.InterfaceC6684o.e eVar, boolean z6, boolean z10) {
                p247y7.AbstractC7350t.f(eVar, "<this>");
                p089i9.X.f(eVar, z6, z10, e(), f());
            }

            public abstract p089i9.b0 e();

            public abstract p089i9.b0 f();
        }

        public static abstract class c extends i9.S.b {

            public static final class a extends i9.S.b.c {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47436b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47437c;

                public a(int i6) {
                    super(null);
                    this.f47436b = i6;
                    this.f47437c = 'h';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47436b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47437c;
                }

                @Override // i9.S.b.c
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.d dVar) {
                    p247y7.AbstractC7350t.f(dVar, "builder");
                    p089i9.T.k(this, null, 1, null);
                    throw new p087i7.C6665k();
                }
            }

            /* JADX INFO: renamed from: i9.S$b$c$b, reason: collision with other inner class name */
            public static final class C0585b extends i9.S.b.c {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47438b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47439c;

                public C0585b(int i6) {
                    super(null);
                    this.f47438b = i6;
                    this.f47439c = 'a';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47438b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47439c;
                }

                @Override // i9.S.b.c
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.d dVar) {
                    p247y7.AbstractC7350t.f(dVar, "builder");
                    p089i9.T.k(this, null, 1, null);
                    throw new p087i7.C6665k();
                }
            }

            /* JADX INFO: renamed from: i9.S$b$c$c, reason: collision with other inner class name */
            public static final class C0586c extends i9.S.b.c {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47440b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47441c;

                public C0586c(int i6) {
                    super(null);
                    this.f47440b = i6;
                    this.f47441c = 'H';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47440b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47441c;
                }

                @Override // i9.S.b.c
                public void c(p089i9.InterfaceC6684o.d dVar) {
                    p089i9.K k6;
                    p247y7.AbstractC7350t.f(dVar, "builder");
                    int iA = a();
                    if (iA == 1) {
                        k6 = p089i9.K.NONE;
                    } else {
                        if (iA != 2) {
                            p089i9.T.m(this);
                            throw new p087i7.C6665k();
                        }
                        k6 = p089i9.K.ZERO;
                    }
                    dVar.y(k6);
                }
            }

            public static final class d extends i9.S.b.c {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47442b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47443c;

                public d(int i6) {
                    super(null);
                    this.f47442b = i6;
                    this.f47443c = 'm';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47442b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47443c;
                }

                @Override // i9.S.b.c
                public void c(p089i9.InterfaceC6684o.d dVar) {
                    p089i9.K k6;
                    p247y7.AbstractC7350t.f(dVar, "builder");
                    int iA = a();
                    if (iA == 1) {
                        k6 = p089i9.K.NONE;
                    } else {
                        if (iA != 2) {
                            p089i9.T.m(this);
                            throw new p087i7.C6665k();
                        }
                        k6 = p089i9.K.ZERO;
                    }
                    dVar.m(k6);
                }
            }

            public static abstract class e extends i9.S.b.c {

                public static final class a extends i9.S.b.c.e {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final int f47444b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final char f47445c;

                    public a(int i6) {
                        super(null);
                        this.f47444b = i6;
                        this.f47445c = 's';
                    }

                    @Override // i9.S.b
                    public int a() {
                        return this.f47444b;
                    }

                    @Override // i9.S.b
                    public char b() {
                        return this.f47445c;
                    }

                    @Override // i9.S.b.c
                    public void c(p089i9.InterfaceC6684o.d dVar) {
                        p089i9.K k6;
                        p247y7.AbstractC7350t.f(dVar, "builder");
                        int iA = a();
                        if (iA == 1) {
                            k6 = p089i9.K.NONE;
                        } else {
                            if (iA != 2) {
                                p089i9.T.m(this);
                                throw new p087i7.C6665k();
                            }
                            k6 = p089i9.K.ZERO;
                        }
                        dVar.z(k6);
                    }
                }

                private e() {
                    super(null);
                }

                public /* synthetic */ e(p247y7.AbstractC7342k abstractC7342k) {
                    this();
                }
            }

            public static abstract class f extends i9.S.b.c.e {

                public static final class a extends i9.S.b.c.f {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final int f47446b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final char f47447c;

                    public a(int i6) {
                        super(null);
                        this.f47446b = i6;
                        this.f47447c = 'S';
                    }

                    @Override // i9.S.b
                    public int a() {
                        return this.f47446b;
                    }

                    @Override // i9.S.b
                    public char b() {
                        return this.f47447c;
                    }

                    @Override // i9.S.b.c
                    public void c(p089i9.InterfaceC6684o.d dVar) {
                        p247y7.AbstractC7350t.f(dVar, "builder");
                        dVar.x(a());
                    }
                }

                /* JADX INFO: renamed from: i9.S$b$c$f$b, reason: collision with other inner class name */
                public static final class C0587b extends i9.S.b.c.f {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final int f47448b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final char f47449c;

                    public C0587b(int i6) {
                        super(null);
                        this.f47448b = i6;
                        this.f47449c = 'A';
                    }

                    @Override // i9.S.b
                    public int a() {
                        return this.f47448b;
                    }

                    @Override // i9.S.b
                    public char b() {
                        return this.f47449c;
                    }

                    @Override // i9.S.b.c
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public java.lang.Void c(p089i9.InterfaceC6684o.d dVar) {
                        p247y7.AbstractC7350t.f(dVar, "builder");
                        p089i9.T.o("millisecond-of-day", null, 2, null);
                        throw new p087i7.C6665k();
                    }
                }

                /* JADX INFO: renamed from: i9.S$b$c$f$c, reason: collision with other inner class name */
                public static final class C0588c extends i9.S.b.c.f {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final int f47450b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final char f47451c;

                    public C0588c(int i6) {
                        super(null);
                        this.f47450b = i6;
                        this.f47451c = 'N';
                    }

                    @Override // i9.S.b
                    public int a() {
                        return this.f47450b;
                    }

                    @Override // i9.S.b
                    public char b() {
                        return this.f47451c;
                    }

                    @Override // i9.S.b.c
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public java.lang.Void c(p089i9.InterfaceC6684o.d dVar) {
                        p247y7.AbstractC7350t.f(dVar, "builder");
                        p089i9.T.o("nanosecond-of-day", null, 2, null);
                        throw new p087i7.C6665k();
                    }
                }

                public static final class d extends i9.S.b.c.f {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final int f47452b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final char f47453c;

                    public d(int i6) {
                        super(null);
                        this.f47452b = i6;
                        this.f47453c = 'n';
                    }

                    @Override // i9.S.b
                    public int a() {
                        return this.f47452b;
                    }

                    @Override // i9.S.b
                    public char b() {
                        return this.f47453c;
                    }

                    @Override // i9.S.b.c
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public java.lang.Void c(p089i9.InterfaceC6684o.d dVar) {
                        p247y7.AbstractC7350t.f(dVar, "builder");
                        p089i9.T.n("nano-of-second", "Maybe you meant 'S' instead of 'n'?");
                        throw new p087i7.C6665k();
                    }
                }

                private f() {
                    super(null);
                }

                public /* synthetic */ f(p247y7.AbstractC7342k abstractC7342k) {
                    this();
                }
            }

            private c() {
                super(null);
            }

            public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public abstract void c(p089i9.InterfaceC6684o.d dVar);
        }

        public static abstract class d extends i9.S.b {

            public static final class a extends i9.S.b.d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47454b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47455c;

                public a(int i6) {
                    super(null);
                    this.f47454b = i6;
                    this.f47455c = 'v';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47454b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47455c;
                }

                @Override // i9.S.b.d
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.c cVar) {
                    p247y7.AbstractC7350t.f(cVar, "builder");
                    p089i9.T.k(this, null, 1, null);
                    throw new p087i7.C6665k();
                }
            }

            /* JADX INFO: renamed from: i9.S$b$d$b, reason: collision with other inner class name */
            public static final class C0589b extends i9.S.b.d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47456b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47457c;

                public C0589b(int i6) {
                    super(null);
                    this.f47456b = i6;
                    this.f47457c = 'V';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47456b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47457c;
                }

                @Override // i9.S.b.d
                public void c(p089i9.InterfaceC6684o.c cVar) {
                    p247y7.AbstractC7350t.f(cVar, "builder");
                    if (a() == 2) {
                        cVar.g();
                    } else {
                        p089i9.T.m(this);
                        throw new p087i7.C6665k();
                    }
                }
            }

            public static final class c extends i9.S.b.d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f47458b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final char f47459c;

                public c(int i6) {
                    super(null);
                    this.f47458b = i6;
                    this.f47459c = 'z';
                }

                @Override // i9.S.b
                public int a() {
                    return this.f47458b;
                }

                @Override // i9.S.b
                public char b() {
                    return this.f47459c;
                }

                @Override // i9.S.b.d
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public java.lang.Void c(p089i9.InterfaceC6684o.c cVar) {
                    p247y7.AbstractC7350t.f(cVar, "builder");
                    p089i9.T.j(this, "Format 'V' can be used to format time zone IDs in a locale-invariant manner.");
                    throw new p087i7.C6665k();
                }
            }

            private d() {
                super(null);
            }

            public /* synthetic */ d(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public abstract void c(p089i9.InterfaceC6684o.c cVar);
        }

        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public abstract int a();

        public abstract char b();

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof i9.S.b) {
                i9.S.b bVar = (i9.S.b) obj;
                if (b() == bVar.b() && a() == bVar.a()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (b() * 31) + a();
        }

        public java.lang.String toString() {
            return S8.r.N(java.lang.String.valueOf(b()), a());
        }
    }

    public static final class c implements p089i9.S {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p089i9.S f47460b;

        public c(p089i9.S s6) {
            p247y7.AbstractC7350t.f(s6, "format");
            this.f47460b = s6;
        }

        public final p089i9.S a() {
            return this.f47460b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i9.S.c) && p247y7.AbstractC7350t.b(this.f47460b, ((i9.S.c) obj).f47460b);
        }

        public int hashCode() {
            return this.f47460b.hashCode();
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('[');
            sb.append(this.f47460b);
            sb.append(']');
            return sb.toString();
        }
    }

    public static final class d implements p089i9.S {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.List f47461b;

        public d(java.util.List list) {
            p247y7.AbstractC7350t.f(list, "formats");
            this.f47461b = list;
        }

        public final java.util.List a() {
            return this.f47461b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i9.S.d) && p247y7.AbstractC7350t.b(this.f47461b, ((i9.S.d) obj).f47461b);
        }

        public int hashCode() {
            return this.f47461b.hashCode();
        }

        public java.lang.String toString() {
            return p097j7.AbstractC6879v.r0(this.f47461b, "", null, null, 0, null, null, 62, null);
        }
    }

    public static final class e implements p089i9.S {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.String f47462b;

        public e(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "literal");
            this.f47462b = str;
        }

        public final java.lang.String a() {
            return this.f47462b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i9.S.e) && p247y7.AbstractC7350t.b(this.f47462b, ((i9.S.e) obj).f47462b);
        }

        public int hashCode() {
            return this.f47462b.hashCode();
        }

        public java.lang.String toString() {
            if (p247y7.AbstractC7350t.b(this.f47462b, "'")) {
                return "''";
            }
            java.lang.String str = this.f47462b;
            for (int i6 = 0; i6 < str.length(); i6++) {
                if (java.lang.Character.isLetter(str.charAt(i6))) {
                    return '\'' + this.f47462b + '\'';
                }
            }
            return this.f47462b.length() == 0 ? "" : this.f47462b;
        }
    }
}
