package D;

/* JADX INFO: renamed from: D.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0878o {

    /* JADX INFO: renamed from: D.o$a */
    public interface a {
        p237x7.l getKey();

        p237x7.l getType();
    }

    public final java.lang.Object e(int i6) {
        D.InterfaceC0867d.a aVar = f().get(i6);
        return ((D.AbstractC0878o.a) aVar.c()).getType().l(java.lang.Integer.valueOf(i6 - aVar.b()));
    }

    public abstract D.InterfaceC0867d f();

    public final int g() {
        return f().a();
    }

    public final java.lang.Object h(int i6) {
        java.lang.Object objL;
        D.InterfaceC0867d.a aVar = f().get(i6);
        int iB = i6 - aVar.b();
        p237x7.l key = ((D.AbstractC0878o.a) aVar.c()).getKey();
        return (key == null || (objL = key.l(java.lang.Integer.valueOf(iB))) == null) ? D.H.a(i6) : objL;
    }
}
