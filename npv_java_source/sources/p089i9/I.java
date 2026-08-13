package p089i9;

/* JADX INFO: loaded from: classes2.dex */
public final class I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i9.I.a f47350b = new i9.I.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p089i9.I f47351c = new p089i9.I(p097j7.AbstractC6879v.p("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p089i9.I f47352d = new p089i9.I(p097j7.AbstractC6879v.p("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f47353a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p089i9.I a() {
            return p089i9.I.f47352d;
        }
    }

    /* synthetic */ class b extends p247y7.C7348q implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final i9.I.b f47354L = new i9.I.b();

        b() {
            super(1, java.lang.String.class, "toString", "toString()Ljava/lang/String;", 0);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.String l(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "p0");
            return str.toString();
        }
    }

    public I(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "names");
        this.f47353a = list;
        if (list.size() != 12) {
            throw new java.lang.IllegalArgumentException("Month names must contain exactly 12 elements".toString());
        }
        java.util.Iterator it = p097j7.AbstractC6879v.n(list).iterator();
        while (it.hasNext()) {
            int iB = ((p097j7.O) it).b();
            if (((java.lang.CharSequence) this.f47353a.get(iB)).length() <= 0) {
                throw new java.lang.IllegalArgumentException("A month name can not be empty".toString());
            }
            for (int i6 = 0; i6 < iB; i6++) {
                if (!(!p247y7.AbstractC7350t.b(this.f47353a.get(iB), this.f47353a.get(i6)))) {
                    throw new java.lang.IllegalArgumentException(("Month names must be unique, but '" + ((java.lang.String) this.f47353a.get(iB)) + "' was repeated").toString());
                }
            }
        }
    }

    public final java.util.List b() {
        return this.f47353a;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p089i9.I) && p247y7.AbstractC7350t.b(this.f47353a, ((p089i9.I) obj).f47353a);
    }

    public int hashCode() {
        return this.f47353a.hashCode();
    }

    public java.lang.String toString() {
        return p097j7.AbstractC6879v.r0(this.f47353a, ", ", "MonthNames(", ")", 0, null, i9.I.b.f47354L, 24, null);
    }
}
