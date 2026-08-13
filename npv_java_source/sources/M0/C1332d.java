package M0;

/* JADX INFO: renamed from: M0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1332d implements java.lang.CharSequence {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final M0.C1332d.b f6686G = new M0.C1332d.b(null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final p041e0.j f6687H = M0.B.h();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f6688C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.List f6689D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.List f6690E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.List f6691F;

    /* JADX INFO: renamed from: M0.d$a */
    public static final class a implements java.lang.Appendable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.lang.StringBuilder f6692C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final java.util.List f6693D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final java.util.List f6694E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final java.util.List f6695F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private final java.util.List f6696G;

        /* JADX INFO: renamed from: M0.d$a$a, reason: collision with other inner class name */
        private static final class C0160a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final java.lang.Object f6697a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f6698b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f6699c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final java.lang.String f6700d;

            public C0160a(java.lang.Object obj, int i6, int i10, java.lang.String str) {
                this.f6697a = obj;
                this.f6698b = i6;
                this.f6699c = i10;
                this.f6700d = str;
            }

            public /* synthetic */ C0160a(java.lang.Object obj, int i6, int i10, java.lang.String str, int i11, p247y7.AbstractC7342k abstractC7342k) {
                this(obj, i6, (i11 & 4) != 0 ? Integer.MIN_VALUE : i10, (i11 & 8) != 0 ? "" : str);
            }

            public final M0.C1332d.c a(int i6) {
                int i10 = this.f6699c;
                if (i10 != Integer.MIN_VALUE) {
                    i6 = i10;
                }
                if (i6 != Integer.MIN_VALUE) {
                    return new M0.C1332d.c(this.f6697a, this.f6698b, i6, this.f6700d);
                }
                throw new java.lang.IllegalStateException("Item.end should be set first".toString());
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof M0.C1332d.a.C0160a)) {
                    return false;
                }
                M0.C1332d.a.C0160a c0160a = (M0.C1332d.a.C0160a) obj;
                return p247y7.AbstractC7350t.b(this.f6697a, c0160a.f6697a) && this.f6698b == c0160a.f6698b && this.f6699c == c0160a.f6699c && p247y7.AbstractC7350t.b(this.f6700d, c0160a.f6700d);
            }

            public int hashCode() {
                java.lang.Object obj = this.f6697a;
                return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f6698b) * 31) + this.f6699c) * 31) + this.f6700d.hashCode();
            }

            public java.lang.String toString() {
                return "MutableRange(item=" + this.f6697a + ", start=" + this.f6698b + ", end=" + this.f6699c + ", tag=" + this.f6700d + ')';
            }
        }

        public a(int i6) {
            this.f6692C = new java.lang.StringBuilder(i6);
            this.f6693D = new java.util.ArrayList();
            this.f6694E = new java.util.ArrayList();
            this.f6695F = new java.util.ArrayList();
            this.f6696G = new java.util.ArrayList();
        }

        public /* synthetic */ a(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
            this((i10 & 1) != 0 ? 16 : i6);
        }

        public a(M0.C1332d c1332d) {
            this(0, 1, null);
            f(c1332d);
        }

        public final void a(M0.v vVar, int i6, int i10) {
            this.f6694E.add(new M0.C1332d.a.C0160a(vVar, i6, i10, null, 8, null));
        }

        public final void b(M0.C c6, int i6, int i10) {
            this.f6693D.add(new M0.C1332d.a.C0160a(c6, i6, i10, null, 8, null));
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public M0.C1332d.a append(char c6) {
            this.f6692C.append(c6);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public M0.C1332d.a append(java.lang.CharSequence charSequence) {
            if (charSequence instanceof M0.C1332d) {
                f((M0.C1332d) charSequence);
            } else {
                this.f6692C.append(charSequence);
            }
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public M0.C1332d.a append(java.lang.CharSequence charSequence, int i6, int i10) {
            if (charSequence instanceof M0.C1332d) {
                g((M0.C1332d) charSequence, i6, i10);
            } else {
                this.f6692C.append(charSequence, i6, i10);
            }
            return this;
        }

        public final void f(M0.C1332d c1332d) {
            int length = this.f6692C.length();
            this.f6692C.append(c1332d.i());
            java.util.List listH = c1332d.h();
            if (listH != null) {
                int size = listH.size();
                for (int i6 = 0; i6 < size; i6++) {
                    M0.C1332d.c cVar = (M0.C1332d.c) listH.get(i6);
                    b((M0.C) cVar.e(), cVar.f() + length, cVar.d() + length);
                }
            }
            java.util.List listF = c1332d.f();
            if (listF != null) {
                int size2 = listF.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    M0.C1332d.c cVar2 = (M0.C1332d.c) listF.get(i10);
                    a((M0.v) cVar2.e(), cVar2.f() + length, cVar2.d() + length);
                }
            }
            java.util.List listB = c1332d.b();
            if (listB != null) {
                int size3 = listB.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    M0.C1332d.c cVar3 = (M0.C1332d.c) listB.get(i11);
                    this.f6695F.add(new M0.C1332d.a.C0160a(cVar3.e(), cVar3.f() + length, cVar3.d() + length, cVar3.g()));
                }
            }
        }

        public final void g(M0.C1332d c1332d, int i6, int i10) {
            int length = this.f6692C.length();
            this.f6692C.append((java.lang.CharSequence) c1332d.i(), i6, i10);
            java.util.List listK = M0.AbstractC1333e.k(c1332d, i6, i10);
            if (listK != null) {
                int size = listK.size();
                for (int i11 = 0; i11 < size; i11++) {
                    M0.C1332d.c cVar = (M0.C1332d.c) listK.get(i11);
                    b((M0.C) cVar.e(), cVar.f() + length, cVar.d() + length);
                }
            }
            java.util.List listJ = M0.AbstractC1333e.j(c1332d, i6, i10);
            if (listJ != null) {
                int size2 = listJ.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    M0.C1332d.c cVar2 = (M0.C1332d.c) listJ.get(i12);
                    a((M0.v) cVar2.e(), cVar2.f() + length, cVar2.d() + length);
                }
            }
            java.util.List listI = M0.AbstractC1333e.i(c1332d, i6, i10);
            if (listI != null) {
                int size3 = listI.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    M0.C1332d.c cVar3 = (M0.C1332d.c) listI.get(i13);
                    this.f6695F.add(new M0.C1332d.a.C0160a(cVar3.e(), cVar3.f() + length, cVar3.d() + length, cVar3.g()));
                }
            }
        }

        public final void h(java.lang.String str) {
            this.f6692C.append(str);
        }

        public final M0.C1332d i() {
            java.lang.String string = this.f6692C.toString();
            java.util.List list = this.f6693D;
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add(((M0.C1332d.a.C0160a) list.get(i6)).a(this.f6692C.length()));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            java.util.List list2 = this.f6694E;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
            int size2 = list2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                arrayList2.add(((M0.C1332d.a.C0160a) list2.get(i10)).a(this.f6692C.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            java.util.List list3 = this.f6695F;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(list3.size());
            int size3 = list3.size();
            for (int i11 = 0; i11 < size3; i11++) {
                arrayList3.add(((M0.C1332d.a.C0160a) list3.get(i11)).a(this.f6692C.length()));
            }
            return new M0.C1332d(string, arrayList, arrayList2, arrayList3.isEmpty() ? null : arrayList3);
        }
    }

    /* JADX INFO: renamed from: M0.d$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: M0.d$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f6701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.lang.String f6704d;

        public c(java.lang.Object obj, int i6, int i10) {
            this(obj, i6, i10, "");
        }

        public c(java.lang.Object obj, int i6, int i10, java.lang.String str) {
            this.f6701a = obj;
            this.f6702b = i6;
            this.f6703c = i10;
            this.f6704d = str;
            if (i6 > i10) {
                throw new java.lang.IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final java.lang.Object a() {
            return this.f6701a;
        }

        public final int b() {
            return this.f6702b;
        }

        public final int c() {
            return this.f6703c;
        }

        public final int d() {
            return this.f6703c;
        }

        public final java.lang.Object e() {
            return this.f6701a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof M0.C1332d.c)) {
                return false;
            }
            M0.C1332d.c cVar = (M0.C1332d.c) obj;
            return p247y7.AbstractC7350t.b(this.f6701a, cVar.f6701a) && this.f6702b == cVar.f6702b && this.f6703c == cVar.f6703c && p247y7.AbstractC7350t.b(this.f6704d, cVar.f6704d);
        }

        public final int f() {
            return this.f6702b;
        }

        public final java.lang.String g() {
            return this.f6704d;
        }

        public int hashCode() {
            java.lang.Object obj = this.f6701a;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f6702b) * 31) + this.f6703c) * 31) + this.f6704d.hashCode();
        }

        public java.lang.String toString() {
            return "Range(item=" + this.f6701a + ", start=" + this.f6702b + ", end=" + this.f6703c + ", tag=" + this.f6704d + ')';
        }
    }

    /* JADX INFO: renamed from: M0.d$d, reason: collision with other inner class name */
    public static final class C0161d implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d(java.lang.Integer.valueOf(((M0.C1332d.c) obj).f()), java.lang.Integer.valueOf(((M0.C1332d.c) obj2).f()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1332d(java.lang.String str, java.util.List list, java.util.List list2) {
        java.util.List list3 = list;
        java.util.List list4 = list2;
        this(str, list3.isEmpty() ? null : list3, list4.isEmpty() ? null : list4, null);
    }

    public /* synthetic */ C1332d(java.lang.String str, java.util.List list, java.util.List list2, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(str, (i6 & 2) != 0 ? p097j7.AbstractC6879v.m() : list, (i6 & 4) != 0 ? p097j7.AbstractC6879v.m() : list2);
    }

    public C1332d(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3) {
        java.util.List listL0;
        this.f6688C = str;
        this.f6689D = list;
        this.f6690E = list2;
        this.f6691F = list3;
        if (list2 == null || (listL0 = p097j7.AbstractC6879v.L0(list2, new M0.C1332d.C0161d())) == null) {
            return;
        }
        int size = listL0.size();
        int iD = -1;
        for (int i6 = 0; i6 < size; i6++) {
            M0.C1332d.c cVar = (M0.C1332d.c) listL0.get(i6);
            if (cVar.f() < iD) {
                throw new java.lang.IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
            if (cVar.d() > this.f6688C.length()) {
                throw new java.lang.IllegalArgumentException(("ParagraphStyle range [" + cVar.f() + ", " + cVar.d() + ") is out of boundary").toString());
            }
            iD = cVar.d();
        }
    }

    public /* synthetic */ C1332d(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(str, (i6 & 2) != 0 ? null : list, (i6 & 4) != 0 ? null : list2, (i6 & 8) != 0 ? null : list3);
    }

    public char a(int i6) {
        return this.f6688C.charAt(i6);
    }

    public final java.util.List b() {
        return this.f6691F;
    }

    public int c() {
        return this.f6688C.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i6) {
        return a(i6);
    }

    public final java.util.List d(int i6, int i10) {
        java.util.List listM;
        java.util.List list = this.f6691F;
        if (list != null) {
            listM = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                java.lang.Object obj = list.get(i11);
                M0.C1332d.c cVar = (M0.C1332d.c) obj;
                if ((cVar.e() instanceof M0.AbstractC1336h) && M0.AbstractC1333e.l(i6, i10, cVar.f(), cVar.d())) {
                    listM.add(obj);
                }
            }
        } else {
            listM = p097j7.AbstractC6879v.m();
        }
        p247y7.AbstractC7350t.d(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listM;
    }

    public final java.util.List e() {
        java.util.List list = this.f6690E;
        return list == null ? p097j7.AbstractC6879v.m() : list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0.C1332d)) {
            return false;
        }
        M0.C1332d c1332d = (M0.C1332d) obj;
        return p247y7.AbstractC7350t.b(this.f6688C, c1332d.f6688C) && p247y7.AbstractC7350t.b(this.f6689D, c1332d.f6689D) && p247y7.AbstractC7350t.b(this.f6690E, c1332d.f6690E) && p247y7.AbstractC7350t.b(this.f6691F, c1332d.f6691F);
    }

    public final java.util.List f() {
        return this.f6690E;
    }

    public final java.util.List g() {
        java.util.List list = this.f6689D;
        return list == null ? p097j7.AbstractC6879v.m() : list;
    }

    public final java.util.List h() {
        return this.f6689D;
    }

    public int hashCode() {
        int iHashCode = this.f6688C.hashCode() * 31;
        java.util.List list = this.f6689D;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        java.util.List list2 = this.f6690E;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        java.util.List list3 = this.f6691F;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final java.lang.String i() {
        return this.f6688C;
    }

    public final java.util.List j(int i6, int i10) {
        java.util.List listM;
        java.util.List list = this.f6691F;
        if (list != null) {
            listM = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                java.lang.Object obj = list.get(i11);
                M0.C1332d.c cVar = (M0.C1332d.c) obj;
                if ((cVar.e() instanceof M0.S) && M0.AbstractC1333e.l(i6, i10, cVar.f(), cVar.d())) {
                    listM.add(obj);
                }
            }
        } else {
            listM = p097j7.AbstractC6879v.m();
        }
        p247y7.AbstractC7350t.d(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listM;
    }

    public final java.util.List k(int i6, int i10) {
        java.util.List listM;
        java.util.List list = this.f6691F;
        if (list != null) {
            listM = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                java.lang.Object obj = list.get(i11);
                M0.C1332d.c cVar = (M0.C1332d.c) obj;
                if ((cVar.e() instanceof M0.T) && M0.AbstractC1333e.l(i6, i10, cVar.f(), cVar.d())) {
                    listM.add(obj);
                }
            }
        } else {
            listM = p097j7.AbstractC6879v.m();
        }
        p247y7.AbstractC7350t.d(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listM;
    }

    public final boolean l(M0.C1332d c1332d) {
        return p247y7.AbstractC7350t.b(this.f6691F, c1332d.f6691F);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    public final boolean m(int i6, int i10) {
        java.util.List list = this.f6691F;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            M0.C1332d.c cVar = (M0.C1332d.c) list.get(i11);
            if ((cVar.e() instanceof M0.AbstractC1336h) && M0.AbstractC1333e.l(i6, i10, cVar.f(), cVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final M0.C1332d n(M0.C1332d c1332d) {
        M0.C1332d.a aVar = new M0.C1332d.a(this);
        aVar.f(c1332d);
        return aVar.i();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public M0.C1332d subSequence(int i6, int i10) {
        if (i6 <= i10) {
            if (i6 == 0 && i10 == this.f6688C.length()) {
                return this;
            }
            java.lang.String strSubstring = this.f6688C.substring(i6, i10);
            p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new M0.C1332d(strSubstring, M0.AbstractC1333e.h(this.f6689D, i6, i10), M0.AbstractC1333e.h(this.f6690E, i6, i10), M0.AbstractC1333e.h(this.f6691F, i6, i10));
        }
        throw new java.lang.IllegalArgumentException(("start (" + i6 + ") should be less or equal to end (" + i10 + ')').toString());
    }

    public final M0.C1332d p(long j6) {
        return subSequence(M0.N.l(j6), M0.N.k(j6));
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
        return this.f6688C;
    }
}
