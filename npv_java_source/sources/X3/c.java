package X3;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f15864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Object f15865b;

    public static class a extends java.lang.Exception {
        public a(java.lang.String str) {
            super(str);
        }

        public a(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }
    }

    protected c(java.lang.String str) {
        this.f15864a = str;
    }

    protected abstract java.lang.Object a(android.os.IBinder iBinder);

    protected final java.lang.Object b(android.content.Context context) throws X3.c.a {
        if (this.f15865b == null) {
            Q3.AbstractC1477p.l(context);
            android.content.Context contextC = N3.AbstractC1398k.c(context);
            if (contextC == null) {
                throw new X3.c.a("Could not get remote context.");
            }
            try {
                this.f15865b = a((android.os.IBinder) contextC.getClassLoader().loadClass(this.f15864a).newInstance());
            } catch (java.lang.ClassNotFoundException e6) {
                throw new X3.c.a("Could not load creator class.", e6);
            } catch (java.lang.IllegalAccessException e10) {
                throw new X3.c.a("Could not access creator.", e10);
            } catch (java.lang.InstantiationException e11) {
                throw new X3.c.a("Could not instantiate creator.", e11);
            }
        }
        return this.f15865b;
    }
}
