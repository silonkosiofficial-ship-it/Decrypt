package p019b9;

/* JADX INFO: renamed from: b9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2117d implements W8.N {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p127m7.i f24352C;

    public C2117d(p127m7.i iVar) {
        this.f24352C = iVar;
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f24352C;
    }

    public java.lang.String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
