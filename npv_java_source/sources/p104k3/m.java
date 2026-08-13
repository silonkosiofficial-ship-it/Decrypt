package p104k3;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p104k3.C6885b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p104k3.u f49489e;

    public m(int i6, java.lang.String str, java.lang.String str2, p104k3.C6885b c6885b, p104k3.u uVar) {
        super(i6, str, str2, c6885b);
        this.f49489e = uVar;
    }

    @Override // p104k3.C6885b
    public final org.json.JSONObject e() throws org.json.JSONException {
        org.json.JSONObject jSONObjectE = super.e();
        p104k3.u uVarF = f();
        jSONObjectE.put("Response Info", uVarF == null ? "null" : uVarF.g());
        return jSONObjectE;
    }

    public p104k3.u f() {
        return this.f49489e;
    }

    @Override // p104k3.C6885b
    public java.lang.String toString() {
        try {
            return e().toString(2);
        } catch (org.json.JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
