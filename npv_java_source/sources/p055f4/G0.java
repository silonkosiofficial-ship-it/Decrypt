package p055f4;

/* JADX INFO: loaded from: classes3.dex */
final class G0 extends p055f4.C0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p055f4.I0 f45041E;

    G0(p055f4.I0 i6, int i10) {
        super(i6.size(), i10);
        this.f45041E = i6;
    }

    @Override // p055f4.C0
    protected final java.lang.Object b(int i6) {
        return this.f45041E.get(i6);
    }
}
