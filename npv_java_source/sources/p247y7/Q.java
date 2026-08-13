package p247y7;

/* JADX INFO: loaded from: classes3.dex */
public class Q {
    public F7.f a(p247y7.AbstractC7347p abstractC7347p) {
        return abstractC7347p;
    }

    public F7.c b(java.lang.Class cls) {
        return new p247y7.C7340i(cls);
    }

    public F7.e c(java.lang.Class cls, java.lang.String str) {
        return new p247y7.C(cls, str);
    }

    public F7.o d(F7.o oVar) {
        p247y7.Z z6 = (p247y7.Z) oVar;
        return new p247y7.Z(oVar.b(), oVar.a(), z6.j(), z6.i() | 2);
    }

    public F7.h e(p247y7.AbstractC7354x abstractC7354x) {
        return abstractC7354x;
    }

    public F7.i f(p247y7.AbstractC7356z abstractC7356z) {
        return abstractC7356z;
    }

    public F7.l g(p247y7.D d6) {
        return d6;
    }

    public F7.m h(p247y7.F f6) {
        return f6;
    }

    public F7.n i(p247y7.H h6) {
        return h6;
    }

    public java.lang.String j(p247y7.InterfaceC7346o interfaceC7346o) {
        java.lang.String string = interfaceC7346o.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public java.lang.String k(p247y7.AbstractC7352v abstractC7352v) {
        return j(abstractC7352v);
    }

    public void l(F7.p pVar, java.util.List list) {
        ((p247y7.X) pVar).a(list);
    }

    public F7.o m(F7.d dVar, java.util.List list, boolean z6) {
        return new p247y7.Z(dVar, list, z6);
    }

    public F7.p n(java.lang.Object obj, java.lang.String str, F7.r rVar, boolean z6) {
        return new p247y7.X(obj, str, rVar, z6);
    }
}
