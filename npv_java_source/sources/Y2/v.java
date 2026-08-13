package Y2;

/* JADX INFO: loaded from: classes.dex */
abstract class v implements java.io.Closeable {

    interface a {
        Y2.v.a a(android.content.Context context);

        Y2.v i();
    }

    v() {
    }

    abstract p064g3.InterfaceC6599d a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        a().close();
    }

    abstract Y2.u f();
}
