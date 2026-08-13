package W8;

/* JADX INFO: renamed from: W8.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1789i0 implements W8.InterfaceC1814v0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f15504C;

    public C1789i0(boolean z6) {
        this.f15504C = z6;
    }

    @Override // W8.InterfaceC1814v0
    public W8.K0 a() {
        return null;
    }

    @Override // W8.InterfaceC1814v0
    public boolean f() {
        return this.f15504C;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Empty{");
        sb.append(f() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
