package p128m8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    public static final class a extends p128m8.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f51210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.String f51211b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String str, java.lang.String str2) {
            super(null);
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(str2, "desc");
            this.f51210a = str;
            this.f51211b = str2;
        }

        @Override // p128m8.d
        public java.lang.String a() {
            return c() + ':' + b();
        }

        @Override // p128m8.d
        public java.lang.String b() {
            return this.f51211b;
        }

        @Override // p128m8.d
        public java.lang.String c() {
            return this.f51210a;
        }

        public final java.lang.String d() {
            return this.f51210a;
        }

        public final java.lang.String e() {
            return this.f51211b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m8.d.a)) {
                return false;
            }
            m8.d.a aVar = (m8.d.a) obj;
            return p247y7.AbstractC7350t.b(this.f51210a, aVar.f51210a) && p247y7.AbstractC7350t.b(this.f51211b, aVar.f51211b);
        }

        public int hashCode() {
            return (this.f51210a.hashCode() * 31) + this.f51211b.hashCode();
        }
    }

    public static final class b extends p128m8.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f51212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.String f51213b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String str, java.lang.String str2) {
            super(null);
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(str2, "desc");
            this.f51212a = str;
            this.f51213b = str2;
        }

        public static /* synthetic */ m8.d.b e(m8.d.b bVar, java.lang.String str, java.lang.String str2, int i6, java.lang.Object obj) {
            if ((i6 & 1) != 0) {
                str = bVar.f51212a;
            }
            if ((i6 & 2) != 0) {
                str2 = bVar.f51213b;
            }
            return bVar.d(str, str2);
        }

        @Override // p128m8.d
        public java.lang.String a() {
            return c() + b();
        }

        @Override // p128m8.d
        public java.lang.String b() {
            return this.f51213b;
        }

        @Override // p128m8.d
        public java.lang.String c() {
            return this.f51212a;
        }

        public final m8.d.b d(java.lang.String str, java.lang.String str2) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(str2, "desc");
            return new m8.d.b(str, str2);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m8.d.b)) {
                return false;
            }
            m8.d.b bVar = (m8.d.b) obj;
            return p247y7.AbstractC7350t.b(this.f51212a, bVar.f51212a) && p247y7.AbstractC7350t.b(this.f51213b, bVar.f51213b);
        }

        public int hashCode() {
            return (this.f51212a.hashCode() * 31) + this.f51213b.hashCode();
        }
    }

    private d() {
    }

    public /* synthetic */ d(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public abstract java.lang.String a();

    public abstract java.lang.String b();

    public abstract java.lang.String c();

    public final java.lang.String toString() {
        return a();
    }
}
