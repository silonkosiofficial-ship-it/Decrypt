package I2;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f4958a = new java.util.HashSet();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.net.Uri f4959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f4960b;

        a(android.net.Uri uri, boolean z6) {
            this.f4959a = uri;
            this.f4960b = z6;
        }

        public android.net.Uri a() {
            return this.f4959a;
        }

        public boolean b() {
            return this.f4960b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || I2.c.a.class != obj.getClass()) {
                return false;
            }
            I2.c.a aVar = (I2.c.a) obj;
            return this.f4960b == aVar.f4960b && this.f4959a.equals(aVar.f4959a);
        }

        public int hashCode() {
            return (this.f4959a.hashCode() * 31) + (this.f4960b ? 1 : 0);
        }
    }

    public void a(android.net.Uri uri, boolean z6) {
        this.f4958a.add(new I2.c.a(uri, z6));
    }

    public java.util.Set b() {
        return this.f4958a;
    }

    public int c() {
        return this.f4958a.size();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I2.c.class != obj.getClass()) {
            return false;
        }
        return this.f4958a.equals(((I2.c) obj).f4958a);
    }

    public int hashCode() {
        return this.f4958a.hashCode();
    }
}
