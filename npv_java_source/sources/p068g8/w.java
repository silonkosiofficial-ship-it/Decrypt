package p068g8;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g8.w.a f45708b = new g8.w.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f45709a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p068g8.w a(java.lang.String str, java.lang.String str2) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(str2, "desc");
            return new p068g8.w(str + '#' + str2, null);
        }

        public final p068g8.w b(p128m8.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "signature");
            if (dVar instanceof m8.d.b) {
                return d(dVar.c(), dVar.b());
            }
            if (dVar instanceof m8.d.a) {
                return a(dVar.c(), dVar.b());
            }
            throw new p087i7.s();
        }

        public final p068g8.w c(p108k8.c cVar, l8.a.c cVar2) {
            p247y7.AbstractC7350t.f(cVar, "nameResolver");
            p247y7.AbstractC7350t.f(cVar2, "signature");
            return d(cVar.getString(cVar2.x()), cVar.getString(cVar2.w()));
        }

        public final p068g8.w d(java.lang.String str, java.lang.String str2) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(str2, "desc");
            return new p068g8.w(str + str2, null);
        }

        public final p068g8.w e(p068g8.w wVar, int i6) {
            p247y7.AbstractC7350t.f(wVar, "signature");
            return new p068g8.w(wVar.a() + '@' + i6, null);
        }
    }

    private w(java.lang.String str) {
        this.f45709a = str;
    }

    public /* synthetic */ w(java.lang.String str, p247y7.AbstractC7342k abstractC7342k) {
        this(str);
    }

    public final java.lang.String a() {
        return this.f45709a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p068g8.w) && p247y7.AbstractC7350t.b(this.f45709a, ((p068g8.w) obj).f45709a);
    }

    public int hashCode() {
        return this.f45709a.hashCode();
    }

    public java.lang.String toString() {
        return "MemberSignature(signature=" + this.f45709a + ')';
    }
}
