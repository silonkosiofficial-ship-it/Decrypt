package p097j7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 {
    public static java.util.Set a(java.util.Set set) {
        p247y7.AbstractC7350t.f(set, "builder");
        return ((p107k7.h) set).e();
    }

    public static java.util.Set b() {
        return new p107k7.h();
    }

    public static java.util.Set c(java.lang.Object obj) {
        java.util.Set setSingleton = java.util.Collections.singleton(obj);
        p247y7.AbstractC7350t.e(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
