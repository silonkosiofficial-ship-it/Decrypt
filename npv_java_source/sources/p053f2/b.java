package p053f2;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f2.b.a f44919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.content.Context f44920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f44921d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f44922e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f44923f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f44924g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f44925h = false;

    public interface a {
        void a(p053f2.b bVar, java.lang.Object obj);
    }

    public b(android.content.Context context) {
        this.f44920c = context.getApplicationContext();
    }

    public void a() {
        this.f44922e = true;
        k();
    }

    public boolean b() {
        return l();
    }

    public void c() {
        this.f44925h = false;
    }

    public java.lang.String d(java.lang.Object obj) {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        if (obj == null) {
            str = "null";
        } else {
            java.lang.Class<?> cls = obj.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(cls)));
            str = "}";
        }
        sb.append(str);
        return sb.toString();
    }

    public void e() {
    }

    public void f(java.lang.Object obj) {
        f2.b.a aVar = this.f44919b;
        if (aVar != null) {
            aVar.a(this, obj);
        }
    }

    public void g(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f44918a);
        printWriter.print(" mListener=");
        printWriter.println(this.f44919b);
        if (this.f44921d || this.f44924g || this.f44925h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f44921d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f44924g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f44925h);
        }
        if (this.f44922e || this.f44923f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f44922e);
            printWriter.print(" mReset=");
            printWriter.println(this.f44923f);
        }
    }

    public void h() {
        n();
    }

    public boolean i() {
        return this.f44922e;
    }

    public boolean j() {
        return this.f44921d;
    }

    protected void k() {
    }

    protected abstract boolean l();

    public void m() {
        if (this.f44921d) {
            h();
        } else {
            this.f44924g = true;
        }
    }

    protected void n() {
    }

    protected void o() {
    }

    protected abstract void p();

    protected void q() {
    }

    public void r(int i6, f2.b.a aVar) {
        if (this.f44919b != null) {
            throw new java.lang.IllegalStateException("There is already a listener registered");
        }
        this.f44919b = aVar;
        this.f44918a = i6;
    }

    public void s() {
        o();
        this.f44923f = true;
        this.f44921d = false;
        this.f44922e = false;
        this.f44924g = false;
        this.f44925h = false;
    }

    public void t() {
        if (this.f44925h) {
            m();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        java.lang.Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(cls)));
        sb.append(" id=");
        sb.append(this.f44918a);
        sb.append("}");
        return sb.toString();
    }

    public final void u() {
        this.f44921d = true;
        this.f44923f = false;
        this.f44922e = false;
        p();
    }

    public void v() {
        this.f44921d = false;
        q();
    }

    public void w(f2.b.a aVar) {
        f2.b.a aVar2 = this.f44919b;
        if (aVar2 == null) {
            throw new java.lang.IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new java.lang.IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f44919b = null;
    }
}
