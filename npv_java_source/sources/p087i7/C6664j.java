package p087i7;

/* JADX INFO: renamed from: i7.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6664j implements p087i7.InterfaceC6668n, java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f46735C;

    public C6664j(java.lang.Object obj) {
        this.f46735C = obj;
    }

    @Override // p087i7.InterfaceC6668n
    public boolean d() {
        return true;
    }

    @Override // p087i7.InterfaceC6668n
    public java.lang.Object getValue() {
        return this.f46735C;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(getValue());
    }
}
