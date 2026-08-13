package p129m9;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements p129m9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p129m9.a f51281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m9.u.a f51283c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f51284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f51285b;

        public a(java.util.List list, boolean z6) {
            p247y7.AbstractC7350t.f(list, "children");
            this.f51284a = list;
            this.f51285b = z6;
        }

        public /* synthetic */ a(java.util.List list, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
            this((i6 & 1) != 0 ? new java.util.ArrayList() : list, (i6 & 2) != 0 ? false : z6);
        }

        public final java.util.List a() {
            return this.f51284a;
        }

        public final boolean b() {
            return this.f51285b;
        }

        public final void c(boolean z6) {
            this.f51285b = z6;
        }
    }

    public static final class b implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d((java.lang.String) ((p087i7.u) obj).c(), (java.lang.String) ((p087i7.u) obj2).c());
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.CharSequence f51287E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f51288F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p247y7.M f51289G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(java.lang.CharSequence charSequence, int i6, p247y7.M m6) {
            super(0);
            this.f51287E = charSequence;
            this.f51288F = i6;
            this.f51289G = m6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String b() {
            return "Expected " + p129m9.u.this.f51282b + " but got " + this.f51287E.subSequence(this.f51288F, this.f51289G.f57252C).toString();
        }
    }

    public static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.Comparable f51290D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(java.lang.Comparable comparable) {
            super(1);
            this.f51290D = comparable;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer l(java.lang.Object obj) {
            return java.lang.Integer.valueOf(p117l7.a.d((java.lang.String) ((p087i7.u) obj).c(), this.f51290D));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(java.util.Collection collection, p129m9.a aVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(collection, "strings");
        p247y7.AbstractC7350t.f(aVar, "setter");
        p247y7.AbstractC7350t.f(str, "whatThisExpects");
        this.f51281a = aVar;
        this.f51282b = str;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        boolean z6 = false;
        int i6 = 3;
        this.f51283c = new m9.u.a(null, z6, i6, 0 == true ? 1 : 0);
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (str2.length() <= 0) {
                throw new java.lang.IllegalArgumentException(("Found an empty string in " + this.f51282b).toString());
            }
            m9.u.a aVar2 = this.f51283c;
            int length = str2.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str2.charAt(i10);
                java.util.List listA = aVar2.a();
                int i11 = p097j7.AbstractC6879v.i(listA, 0, listA.size(), new m9.u.d(java.lang.String.valueOf(cCharAt)));
                if (i11 < 0) {
                    m9.u.a aVar3 = new m9.u.a(objArr2 == true ? 1 : 0, z6, i6, objArr == true ? 1 : 0);
                    aVar2.a().add((-i11) - 1, p087i7.B.a(java.lang.String.valueOf(cCharAt), aVar3));
                    aVar2 = aVar3;
                } else {
                    aVar2 = (m9.u.a) ((p087i7.u) aVar2.a().get(i11)).d();
                }
            }
            if (!(!aVar2.b())) {
                throw new java.lang.IllegalArgumentException(("The string '" + str2 + "' was passed several times").toString());
            }
            aVar2.c(true);
        }
        b(this.f51283c);
    }

    private static final void b(m9.u.a aVar) {
        java.util.Iterator it = aVar.a().iterator();
        while (it.hasNext()) {
            b((m9.u.a) ((p087i7.u) it.next()).b());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p087i7.u uVar : aVar.a()) {
            java.lang.String str = (java.lang.String) uVar.a();
            m9.u.a aVar2 = (m9.u.a) uVar.b();
            if (!aVar2.b() && aVar2.a().size() == 1) {
                p087i7.u uVar2 = (p087i7.u) p097j7.AbstractC6879v.G0(aVar2.a());
                java.lang.String str2 = (java.lang.String) uVar2.a();
                aVar2 = (m9.u.a) uVar2.b();
                str = str + str2;
            }
            arrayList.add(p087i7.B.a(str, aVar2));
        }
        aVar.a().clear();
        aVar.a().addAll(p097j7.AbstractC6879v.L0(arrayList, new m9.u.b()));
    }

    @Override // p129m9.o
    public java.lang.Object a(java.lang.Object obj, java.lang.CharSequence charSequence, int i6) {
        java.lang.String str;
        m9.u.a aVar;
        p247y7.AbstractC7350t.f(charSequence, "input");
        m9.u.a aVar2 = this.f51283c;
        p247y7.M m6 = new p247y7.M();
        m6.f57252C = i6;
        java.lang.Integer numValueOf = null;
        loop0: while (m6.f57252C <= charSequence.length()) {
            if (aVar2.b()) {
                numValueOf = java.lang.Integer.valueOf(m6.f57252C);
            }
            java.util.Iterator it = aVar2.a().iterator();
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                p087i7.u uVar = (p087i7.u) it.next();
                str = (java.lang.String) uVar.a();
                aVar = (m9.u.a) uVar.b();
            } while (!S8.r.b1(charSequence, str, m6.f57252C, false, 4, null));
            m6.f57252C += str.length();
            aVar2 = aVar;
        }
        return numValueOf != null ? p129m9.p.d(this.f51281a, obj, charSequence.subSequence(i6, numValueOf.intValue()).toString(), i6, numValueOf.intValue()) : p129m9.k.f51253a.a(i6, new m9.u.c(charSequence, i6, m6));
    }
}
