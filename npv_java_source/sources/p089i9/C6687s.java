package p089i9;

/* JADX INFO: renamed from: i9.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6687s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p089i9.C6687s.a f47565b = new p089i9.C6687s.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p089i9.C6687s f47566c = new p089i9.C6687s(p097j7.AbstractC6879v.p("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p089i9.C6687s f47567d = new p089i9.C6687s(p097j7.AbstractC6879v.p("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f47568a;

    /* JADX INFO: renamed from: i9.s$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p089i9.C6687s a() {
            return p089i9.C6687s.f47567d;
        }
    }

    /* JADX INFO: renamed from: i9.s$b */
    /* synthetic */ class b extends p247y7.C7348q implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final p089i9.C6687s.b f47569L = new p089i9.C6687s.b();

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

    public C6687s(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "names");
        this.f47568a = list;
        if (list.size() != 7) {
            throw new java.lang.IllegalArgumentException("Day of week names must contain exactly 7 elements".toString());
        }
        java.util.Iterator it = p097j7.AbstractC6879v.n(list).iterator();
        while (it.hasNext()) {
            int iB = ((p097j7.O) it).b();
            if (((java.lang.CharSequence) this.f47568a.get(iB)).length() <= 0) {
                throw new java.lang.IllegalArgumentException("A day-of-week name can not be empty".toString());
            }
            for (int i6 = 0; i6 < iB; i6++) {
                if (!(!p247y7.AbstractC7350t.b(this.f47568a.get(iB), this.f47568a.get(i6)))) {
                    throw new java.lang.IllegalArgumentException(("Day-of-week names must be unique, but '" + ((java.lang.String) this.f47568a.get(iB)) + "' was repeated").toString());
                }
            }
        }
    }

    public final java.util.List b() {
        return this.f47568a;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p089i9.C6687s) && p247y7.AbstractC7350t.b(this.f47568a, ((p089i9.C6687s) obj).f47568a);
    }

    public int hashCode() {
        return this.f47568a.hashCode();
    }

    public java.lang.String toString() {
        return p097j7.AbstractC6879v.r0(this.f47568a, ", ", "DayOfWeekNames(", ")", 0, null, p089i9.C6687s.b.f47569L, 24, null);
    }
}
