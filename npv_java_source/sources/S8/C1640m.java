package S8;

/* JADX INFO: renamed from: S8.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1640m implements S8.InterfaceC1639l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.regex.Matcher f12679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.CharSequence f12680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S8.InterfaceC1638k f12681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.List f12682d;

    /* JADX INFO: renamed from: S8.m$a */
    public static final class a extends p097j7.AbstractC6862d {
        a() {
        }

        public /* bridge */ int C(java.lang.String str) {
            return super.lastIndexOf(str);
        }

        @Override // p097j7.AbstractC6860b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return g((java.lang.String) obj);
            }
            return false;
        }

        @Override // p097j7.AbstractC6860b
        public int e() {
            return S8.C1640m.this.f().groupCount() + 1;
        }

        public /* bridge */ boolean g(java.lang.String str) {
            return super.contains(str);
        }

        @Override // p097j7.AbstractC6862d, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return s((java.lang.String) obj);
            }
            return -1;
        }

        @Override // p097j7.AbstractC6862d, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return C((java.lang.String) obj);
            }
            return -1;
        }

        @Override // p097j7.AbstractC6862d, java.util.List
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public java.lang.String get(int i6) {
            java.lang.String strGroup = S8.C1640m.this.f().group(i6);
            return strGroup == null ? "" : strGroup;
        }

        public /* bridge */ int s(java.lang.String str) {
            return super.indexOf(str);
        }
    }

    /* JADX INFO: renamed from: S8.m$b */
    public static final class b extends p097j7.AbstractC6860b implements S8.InterfaceC1638k {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final S8.C1637j s(S8.C1640m.b bVar, int i6) {
            return bVar.get(i6);
        }

        @Override // p097j7.AbstractC6860b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(java.lang.Object obj) {
            if (obj == null ? true : obj instanceof S8.C1637j) {
                return o((S8.C1637j) obj);
            }
            return false;
        }

        @Override // p097j7.AbstractC6860b
        public int e() {
            return S8.C1640m.this.f().groupCount() + 1;
        }

        @Override // S8.InterfaceC1638k
        public S8.C1637j get(int i6) {
            E7.i iVarH = S8.p.h(S8.C1640m.this.f(), i6);
            if (iVarH.M().intValue() < 0) {
                return null;
            }
            java.lang.String strGroup = S8.C1640m.this.f().group(i6);
            p247y7.AbstractC7350t.e(strGroup, "group(...)");
            return new S8.C1637j(strGroup, iVarH);
        }

        @Override // p097j7.AbstractC6860b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            return R8.k.G(p097j7.AbstractC6879v.Y(p097j7.AbstractC6879v.n(this)), new p237x7.l() { // from class: S8.n
                @Override // p237x7.l
                public final java.lang.Object l(java.lang.Object obj) {
                    return S8.C1640m.b.s(this.f12685C, ((java.lang.Integer) obj).intValue());
                }
            }).iterator();
        }

        public /* bridge */ boolean o(S8.C1637j c1637j) {
            return super.contains(c1637j);
        }
    }

    public C1640m(java.util.regex.Matcher matcher, java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(matcher, "matcher");
        p247y7.AbstractC7350t.f(charSequence, "input");
        this.f12679a = matcher;
        this.f12680b = charSequence;
        this.f12681c = new S8.C1640m.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.regex.MatchResult f() {
        return this.f12679a;
    }

    @Override // S8.InterfaceC1639l
    public S8.InterfaceC1639l.b a() {
        return S8.InterfaceC1639l.a.a(this);
    }

    @Override // S8.InterfaceC1639l
    public java.util.List b() {
        if (this.f12682d == null) {
            this.f12682d = new S8.C1640m.a();
        }
        java.util.List list = this.f12682d;
        p247y7.AbstractC7350t.c(list);
        return list;
    }

    @Override // S8.InterfaceC1639l
    public S8.InterfaceC1638k c() {
        return this.f12681c;
    }

    @Override // S8.InterfaceC1639l
    public E7.i d() {
        return S8.p.g(f());
    }

    @Override // S8.InterfaceC1639l
    public S8.InterfaceC1639l next() {
        int iEnd = f().end() + (f().end() == f().start() ? 1 : 0);
        if (iEnd > this.f12680b.length()) {
            return null;
        }
        java.util.regex.Matcher matcher = this.f12679a.pattern().matcher(this.f12680b);
        p247y7.AbstractC7350t.e(matcher, "matcher(...)");
        return S8.p.e(matcher, iEnd, this.f12680b);
    }
}
