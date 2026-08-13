package F0;

/* JADX INFO: renamed from: F0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0926l {
    public static final android.view.View a(F0.InterfaceC0924j interfaceC0924j) {
        if (!interfaceC0924j.E0().A1()) {
            C0.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        java.lang.Object objB = F0.N.b(F0.AbstractC0925k.m(interfaceC0924j));
        p247y7.AbstractC7350t.d(objB, "null cannot be cast to non-null type android.view.View");
        return (android.view.View) objB;
    }
}
