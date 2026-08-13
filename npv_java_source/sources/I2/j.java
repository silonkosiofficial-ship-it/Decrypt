package I2;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static I2.j f4970a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f4971b = 20;

    public static class a extends I2.j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4972c;

        public a(int i6) {
            super(i6);
            this.f4972c = i6;
        }

        @Override // I2.j
        public void a(java.lang.String str, java.lang.String str2, java.lang.Throwable... thArr) {
            if (this.f4972c > 3 || thArr == null || thArr.length < 1) {
                return;
            }
            java.lang.Throwable th = thArr[0];
        }

        @Override // I2.j
        public void b(java.lang.String str, java.lang.String str2, java.lang.Throwable... thArr) {
            if (this.f4972c > 6 || thArr == null || thArr.length < 1) {
                return;
            }
            java.lang.Throwable th = thArr[0];
        }

        @Override // I2.j
        public void d(java.lang.String str, java.lang.String str2, java.lang.Throwable... thArr) {
            if (this.f4972c > 4 || thArr == null || thArr.length < 1) {
                return;
            }
            java.lang.Throwable th = thArr[0];
        }

        @Override // I2.j
        public void g(java.lang.String str, java.lang.String str2, java.lang.Throwable... thArr) {
            if (this.f4972c > 2 || thArr == null || thArr.length < 1) {
                return;
            }
            java.lang.Throwable th = thArr[0];
        }

        @Override // I2.j
        public void h(java.lang.String str, java.lang.String str2, java.lang.Throwable... thArr) {
            if (this.f4972c > 5 || thArr == null || thArr.length < 1) {
                return;
            }
            java.lang.Throwable th = thArr[0];
        }
    }

    public j(int i6) {
    }

    public static synchronized I2.j c() {
        try {
            if (f4970a == null) {
                f4970a = new I2.j.a(3);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return f4970a;
    }

    public static synchronized void e(I2.j jVar) {
        f4970a = jVar;
    }

    public static java.lang.String f(java.lang.String str) {
        int length = str.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(23);
        sb.append("WM-");
        int i6 = f4971b;
        if (length >= i6) {
            str = str.substring(0, i6);
        }
        sb.append(str);
        return sb.toString();
    }

    public abstract void a(java.lang.String str, java.lang.String str2, java.lang.Throwable... thArr);

    public abstract void b(java.lang.String str, java.lang.String str2, java.lang.Throwable... thArr);

    public abstract void d(java.lang.String str, java.lang.String str2, java.lang.Throwable... thArr);

    public abstract void g(java.lang.String str, java.lang.String str2, java.lang.Throwable... thArr);

    public abstract void h(java.lang.String str, java.lang.String str2, java.lang.Throwable... thArr);
}
