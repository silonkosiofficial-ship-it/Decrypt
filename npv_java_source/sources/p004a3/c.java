package p004a3;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p004a3.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p004a3.c f17038b = new p004a3.c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f17039a;

    private c(java.lang.Object obj) {
        this.f17039a = obj;
    }

    public static p004a3.b a(java.lang.Object obj) {
        return new p004a3.c(p004a3.d.c(obj, "instance cannot be null"));
    }

    @Override // p077h7.a
    public java.lang.Object get() {
        return this.f17039a;
    }
}
