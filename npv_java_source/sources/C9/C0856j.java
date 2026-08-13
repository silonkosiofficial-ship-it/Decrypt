package C9;

/* JADX INFO: renamed from: C9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0856j implements C9.P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p041e0.d f1483a;

    public C0856j(p041e0.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "composeSaveableStateHolder");
        this.f1483a = dVar;
    }

    @Override // C9.P
    public void a(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "stateId");
        this.f1483a.f(str);
    }

    public final p041e0.d b() {
        return this.f1483a;
    }
}
