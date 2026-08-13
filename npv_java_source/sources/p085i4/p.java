package p085i4;

/* JADX INFO: loaded from: classes3.dex */
public enum p {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f46677C;

    p(java.lang.String str) {
        this.f46677C = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f46677C;
    }
}
