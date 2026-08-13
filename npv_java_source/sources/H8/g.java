package H8;

/* JADX INFO: loaded from: classes2.dex */
public enum g {
    CAPTURED_TYPE_SCOPE("No member resolution should be done on captured type, it used only during constraint system resolution"),
    INTEGER_LITERAL_TYPE_SCOPE("Scope for integer literal type (%s)"),
    ERASED_RECEIVER_TYPE_SCOPE("Error scope for erased receiver type"),
    SCOPE_FOR_ABBREVIATION_TYPE("Scope for abbreviation %s"),
    STUB_TYPE_SCOPE("Scope for stub type %s"),
    NON_CLASSIFIER_SUPER_TYPE_SCOPE("A scope for common supertype which is not a normal classifier"),
    ERROR_TYPE_SCOPE("Scope for error type %s"),
    UNSUPPORTED_TYPE_SCOPE("Scope for unsupported type %s"),
    SCOPE_FOR_ERROR_CLASS("Error scope for class %s with arguments: %s"),
    SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE("Error resolution candidate for call %s");


    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f4428O = p157p7.b.a(e());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f4429C;

    g(java.lang.String str) {
        this.f4429C = str;
    }

    public final java.lang.String g() {
        return this.f4429C;
    }
}
