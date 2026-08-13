package G1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends G1.a {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f3024K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f3025L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private android.view.LayoutInflater f3026M;

    public c(android.content.Context context, int i6, android.database.Cursor cursor, boolean z6) {
        super(context, cursor, z6);
        this.f3025L = i6;
        this.f3024K = i6;
        this.f3026M = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // G1.a
    public android.view.View o(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup) {
        return this.f3026M.inflate(this.f3025L, viewGroup, false);
    }

    @Override // G1.a
    public android.view.View r(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup) {
        return this.f3026M.inflate(this.f3024K, viewGroup, false);
    }
}
