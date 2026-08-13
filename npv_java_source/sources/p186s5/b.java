package p186s5;

/* JADX INFO: loaded from: classes3.dex */
class b implements p186s5.i {
    b() {
    }

    static p186s5.d b(p106k5.B b6) {
        return new p186s5.d(b6.a() + ((long) 3600000), new s5.d.b(8, 4), new s5.d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // p186s5.i
    public p186s5.d a(p106k5.B b6, org.json.JSONObject jSONObject) {
        return b(b6);
    }
}
