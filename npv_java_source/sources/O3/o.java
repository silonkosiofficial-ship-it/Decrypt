package O3;

/* JADX INFO: loaded from: classes.dex */
final class o extends com.google.android.gms.common.api.internal.BasePendingResult {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final O3.k f8049n;

    public o(O3.f fVar, O3.k kVar) {
        super(fVar);
        this.f8049n = kVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final O3.k c(com.google.android.gms.common.api.Status status) {
        return this.f8049n;
    }
}
