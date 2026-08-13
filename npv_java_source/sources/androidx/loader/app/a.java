package androidx.loader.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0431a {
        p053f2.b a(int i6, android.os.Bundle bundle);

        void b(p053f2.b bVar, java.lang.Object obj);

        void c(p053f2.b bVar);
    }

    public static androidx.loader.app.a b(androidx.lifecycle.r rVar) {
        return new androidx.loader.app.b(rVar, ((androidx.lifecycle.Y) rVar).n());
    }

    public abstract void a(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

    public abstract p053f2.b c(int i6, android.os.Bundle bundle, androidx.loader.app.a.InterfaceC0431a interfaceC0431a);

    public abstract void d();
}
