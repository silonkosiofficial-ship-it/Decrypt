package p073h2;

/* JADX INFO: renamed from: h2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6646x {

    /* JADX INFO: renamed from: h2.x$a */
    public static final class a extends p073h2.AbstractC6646x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p073h2.EnumC6642t f46272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f46273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f46274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f46275d;

        /* JADX INFO: renamed from: h2.x$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0551a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f46276a;

            static {
                int[] iArr = new int[p073h2.EnumC6642t.values().length];
                try {
                    iArr[p073h2.EnumC6642t.APPEND.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[p073h2.EnumC6642t.PREPEND.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                f46276a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p073h2.EnumC6642t enumC6642t, int i6, int i10, int i11) {
            super(null);
            p247y7.AbstractC7350t.f(enumC6642t, "loadType");
            this.f46272a = enumC6642t;
            this.f46273b = i6;
            this.f46274c = i10;
            this.f46275d = i11;
            if (enumC6642t == p073h2.EnumC6642t.REFRESH) {
                throw new java.lang.IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
            }
            if (f() <= 0) {
                throw new java.lang.IllegalArgumentException(("Drop count must be > 0, but was " + f()).toString());
            }
            if (i11 >= 0) {
                return;
            }
            throw new java.lang.IllegalArgumentException(("Invalid placeholdersRemaining " + i11).toString());
        }

        public final p073h2.EnumC6642t c() {
            return this.f46272a;
        }

        public final int d() {
            return this.f46274c;
        }

        public final int e() {
            return this.f46273b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p073h2.AbstractC6646x.a)) {
                return false;
            }
            p073h2.AbstractC6646x.a aVar = (p073h2.AbstractC6646x.a) obj;
            return this.f46272a == aVar.f46272a && this.f46273b == aVar.f46273b && this.f46274c == aVar.f46274c && this.f46275d == aVar.f46275d;
        }

        public final int f() {
            return (this.f46274c - this.f46273b) + 1;
        }

        public final int g() {
            return this.f46275d;
        }

        public int hashCode() {
            return (((((this.f46272a.hashCode() * 31) + this.f46273b) * 31) + this.f46274c) * 31) + this.f46275d;
        }

        public java.lang.String toString() {
            java.lang.String str;
            int i6 = p073h2.AbstractC6646x.a.C0551a.f46276a[this.f46272a.ordinal()];
            if (i6 == 1) {
                str = "end";
            } else {
                if (i6 != 2) {
                    throw new java.lang.IllegalArgumentException("Drop load type must be PREPEND or APPEND");
                }
                str = "front";
            }
            return S8.r.q("PageEvent.Drop from the " + str + " (\n                    |   minPageOffset: " + this.f46273b + "\n                    |   maxPageOffset: " + this.f46274c + "\n                    |   placeholdersRemaining: " + this.f46275d + "\n                    |)", null, 1, null);
        }
    }

    /* JADX INFO: renamed from: h2.x$b */
    public static final class b extends p073h2.AbstractC6646x {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final p073h2.AbstractC6646x.b.a f46277g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final p073h2.AbstractC6646x.b f46278h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p073h2.EnumC6642t f46279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.List f46280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f46281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f46282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final p073h2.C6641s f46283e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final p073h2.C6641s f46284f;

        /* JADX INFO: renamed from: h2.x$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public static /* synthetic */ p073h2.AbstractC6646x.b d(p073h2.AbstractC6646x.b.a aVar, java.util.List list, int i6, int i10, p073h2.C6641s c6641s, p073h2.C6641s c6641s2, int i11, java.lang.Object obj) {
                if ((i11 & 16) != 0) {
                    c6641s2 = null;
                }
                return aVar.c(list, i6, i10, c6641s, c6641s2);
            }

            public final p073h2.AbstractC6646x.b a(java.util.List list, int i6, p073h2.C6641s c6641s, p073h2.C6641s c6641s2) {
                p247y7.AbstractC7350t.f(list, "pages");
                p247y7.AbstractC7350t.f(c6641s, "sourceLoadStates");
                return new p073h2.AbstractC6646x.b(p073h2.EnumC6642t.APPEND, list, -1, i6, c6641s, c6641s2, null);
            }

            public final p073h2.AbstractC6646x.b b(java.util.List list, int i6, p073h2.C6641s c6641s, p073h2.C6641s c6641s2) {
                p247y7.AbstractC7350t.f(list, "pages");
                p247y7.AbstractC7350t.f(c6641s, "sourceLoadStates");
                return new p073h2.AbstractC6646x.b(p073h2.EnumC6642t.PREPEND, list, i6, -1, c6641s, c6641s2, null);
            }

            public final p073h2.AbstractC6646x.b c(java.util.List list, int i6, int i10, p073h2.C6641s c6641s, p073h2.C6641s c6641s2) {
                p247y7.AbstractC7350t.f(list, "pages");
                p247y7.AbstractC7350t.f(c6641s, "sourceLoadStates");
                return new p073h2.AbstractC6646x.b(p073h2.EnumC6642t.REFRESH, list, i6, i10, c6641s, c6641s2, null);
            }

            public final p073h2.AbstractC6646x.b e() {
                return p073h2.AbstractC6646x.b.f46278h;
            }
        }

        /* JADX INFO: renamed from: h2.x$b$b, reason: collision with other inner class name */
        static final class C0552b extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            java.lang.Object f46285F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            java.lang.Object f46286G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            java.lang.Object f46287H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            java.lang.Object f46288I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            java.lang.Object f46289J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            java.lang.Object f46290K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            java.lang.Object f46291L;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            java.lang.Object f46292M;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            java.lang.Object f46293N;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            java.lang.Object f46294O;

            /* JADX INFO: renamed from: P, reason: collision with root package name */
            java.lang.Object f46295P;

            /* JADX INFO: renamed from: Q, reason: collision with root package name */
            /* synthetic */ java.lang.Object f46296Q;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            int f46298S;

            C0552b(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f46296Q = obj;
                this.f46298S |= Integer.MIN_VALUE;
                return p073h2.AbstractC6646x.b.this.a(null, this);
            }
        }

        static {
            p073h2.AbstractC6646x.b.a aVar = new p073h2.AbstractC6646x.b.a(null);
            f46277g = aVar;
            java.util.List listE = p097j7.AbstractC6879v.e(p073h2.W.f46059e.a());
            h2.r.c.a aVar2 = h2.r.c.f46235b;
            f46278h = p073h2.AbstractC6646x.b.a.d(aVar, listE, 0, 0, new p073h2.C6641s(aVar2.b(), aVar2.a(), aVar2.a()), null, 16, null);
        }

        private b(p073h2.EnumC6642t enumC6642t, java.util.List list, int i6, int i10, p073h2.C6641s c6641s, p073h2.C6641s c6641s2) {
            super(null);
            this.f46279a = enumC6642t;
            this.f46280b = list;
            this.f46281c = i6;
            this.f46282d = i10;
            this.f46283e = c6641s;
            this.f46284f = c6641s2;
            if (enumC6642t != p073h2.EnumC6642t.APPEND && i6 < 0) {
                throw new java.lang.IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was " + i6).toString());
            }
            if (enumC6642t == p073h2.EnumC6642t.PREPEND || i10 >= 0) {
                if (enumC6642t == p073h2.EnumC6642t.REFRESH && !(!list.isEmpty())) {
                    throw new java.lang.IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
                }
            } else {
                throw new java.lang.IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + i10).toString());
            }
        }

        public /* synthetic */ b(p073h2.EnumC6642t enumC6642t, java.util.List list, int i6, int i10, p073h2.C6641s c6641s, p073h2.C6641s c6641s2, p247y7.AbstractC7342k abstractC7342k) {
            this(enumC6642t, list, i6, i10, c6641s, c6641s2);
        }

        public static /* synthetic */ p073h2.AbstractC6646x.b e(p073h2.AbstractC6646x.b bVar, p073h2.EnumC6642t enumC6642t, java.util.List list, int i6, int i10, p073h2.C6641s c6641s, p073h2.C6641s c6641s2, int i11, java.lang.Object obj) {
            if ((i11 & 1) != 0) {
                enumC6642t = bVar.f46279a;
            }
            if ((i11 & 2) != 0) {
                list = bVar.f46280b;
            }
            java.util.List list2 = list;
            if ((i11 & 4) != 0) {
                i6 = bVar.f46281c;
            }
            int i12 = i6;
            if ((i11 & 8) != 0) {
                i10 = bVar.f46282d;
            }
            int i13 = i10;
            if ((i11 & 16) != 0) {
                c6641s = bVar.f46283e;
            }
            p073h2.C6641s c6641s3 = c6641s;
            if ((i11 & 32) != 0) {
                c6641s2 = bVar.f46284f;
            }
            return bVar.d(enumC6642t, list2, i12, i13, c6641s3, c6641s2);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0091  */
        /* JADX WARN: Code duplicated, block: B:20:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:22:0x00dd A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00de  */
        /* JADX WARN: Code duplicated, block: B:25:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0091 -> B:18:0x00b4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00de -> B:24:0x00e6). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p073h2.AbstractC6646x
        public java.lang.Object a(p237x7.p r18, p127m7.e r19) {
            /*
                Method dump skipped, instruction units count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p073h2.AbstractC6646x.b.a(x7.p, m7.e):java.lang.Object");
        }

        public final p073h2.AbstractC6646x.b d(p073h2.EnumC6642t enumC6642t, java.util.List list, int i6, int i10, p073h2.C6641s c6641s, p073h2.C6641s c6641s2) {
            p247y7.AbstractC7350t.f(enumC6642t, "loadType");
            p247y7.AbstractC7350t.f(list, "pages");
            p247y7.AbstractC7350t.f(c6641s, "sourceLoadStates");
            return new p073h2.AbstractC6646x.b(enumC6642t, list, i6, i10, c6641s, c6641s2);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p073h2.AbstractC6646x.b)) {
                return false;
            }
            p073h2.AbstractC6646x.b bVar = (p073h2.AbstractC6646x.b) obj;
            return this.f46279a == bVar.f46279a && p247y7.AbstractC7350t.b(this.f46280b, bVar.f46280b) && this.f46281c == bVar.f46281c && this.f46282d == bVar.f46282d && p247y7.AbstractC7350t.b(this.f46283e, bVar.f46283e) && p247y7.AbstractC7350t.b(this.f46284f, bVar.f46284f);
        }

        public final p073h2.EnumC6642t f() {
            return this.f46279a;
        }

        public final p073h2.C6641s g() {
            return this.f46284f;
        }

        public final java.util.List h() {
            return this.f46280b;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.f46279a.hashCode() * 31) + this.f46280b.hashCode()) * 31) + this.f46281c) * 31) + this.f46282d) * 31) + this.f46283e.hashCode()) * 31;
            p073h2.C6641s c6641s = this.f46284f;
            return iHashCode + (c6641s == null ? 0 : c6641s.hashCode());
        }

        public final int i() {
            return this.f46282d;
        }

        public final int j() {
            return this.f46281c;
        }

        public final p073h2.C6641s k() {
            return this.f46283e;
        }

        public java.lang.String toString() {
            java.util.List listB;
            java.util.List listB2;
            java.util.Iterator it = this.f46280b.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((p073h2.W) it.next()).b().size();
            }
            int i6 = this.f46281c;
            java.lang.String strValueOf = i6 != -1 ? java.lang.String.valueOf(i6) : "none";
            int i10 = this.f46282d;
            java.lang.String strValueOf2 = i10 != -1 ? java.lang.String.valueOf(i10) : "none";
            p073h2.C6641s c6641s = this.f46284f;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("PageEvent.Insert for ");
            sb.append(this.f46279a);
            sb.append(", with ");
            sb.append(size);
            sb.append(" items (\n                    |   first item: ");
            p073h2.W w6 = (p073h2.W) p097j7.AbstractC6879v.k0(this.f46280b);
            sb.append((w6 == null || (listB2 = w6.b()) == null) ? null : p097j7.AbstractC6879v.k0(listB2));
            sb.append("\n                    |   last item: ");
            p073h2.W w10 = (p073h2.W) p097j7.AbstractC6879v.v0(this.f46280b);
            sb.append((w10 == null || (listB = w10.b()) == null) ? null : p097j7.AbstractC6879v.v0(listB));
            sb.append("\n                    |   placeholdersBefore: ");
            sb.append(strValueOf);
            sb.append("\n                    |   placeholdersAfter: ");
            sb.append(strValueOf2);
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.f46283e);
            sb.append("\n                    ");
            java.lang.String string = sb.toString();
            if (c6641s != null) {
                string = string + "|   mediatorLoadStates: " + c6641s + '\n';
            }
            return S8.r.q(string + "|)", null, 1, null);
        }
    }

    /* JADX INFO: renamed from: h2.x$c */
    public static final class c extends p073h2.AbstractC6646x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p073h2.C6641s f46299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p073h2.C6641s f46300b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p073h2.C6641s c6641s, p073h2.C6641s c6641s2) {
            super(null);
            p247y7.AbstractC7350t.f(c6641s, "source");
            this.f46299a = c6641s;
            this.f46300b = c6641s2;
        }

        public /* synthetic */ c(p073h2.C6641s c6641s, p073h2.C6641s c6641s2, int i6, p247y7.AbstractC7342k abstractC7342k) {
            this(c6641s, (i6 & 2) != 0 ? null : c6641s2);
        }

        public final p073h2.C6641s c() {
            return this.f46300b;
        }

        public final p073h2.C6641s d() {
            return this.f46299a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p073h2.AbstractC6646x.c)) {
                return false;
            }
            p073h2.AbstractC6646x.c cVar = (p073h2.AbstractC6646x.c) obj;
            return p247y7.AbstractC7350t.b(this.f46299a, cVar.f46299a) && p247y7.AbstractC7350t.b(this.f46300b, cVar.f46300b);
        }

        public int hashCode() {
            int iHashCode = this.f46299a.hashCode() * 31;
            p073h2.C6641s c6641s = this.f46300b;
            return iHashCode + (c6641s == null ? 0 : c6641s.hashCode());
        }

        public java.lang.String toString() {
            p073h2.C6641s c6641s = this.f46300b;
            java.lang.String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f46299a + "\n                    ";
            if (c6641s != null) {
                str = str + "|   mediatorLoadStates: " + c6641s + '\n';
            }
            return S8.r.q(str + "|)", null, 1, null);
        }
    }

    private AbstractC6646x() {
    }

    public /* synthetic */ AbstractC6646x(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    static /* synthetic */ java.lang.Object b(p073h2.AbstractC6646x abstractC6646x, p237x7.p pVar, p127m7.e eVar) {
        p247y7.AbstractC7350t.d(abstractC6646x, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.map>");
        return abstractC6646x;
    }

    public java.lang.Object a(p237x7.p pVar, p127m7.e eVar) {
        return b(this, pVar, eVar);
    }
}
