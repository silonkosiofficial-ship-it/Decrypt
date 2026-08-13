package p143o2;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p143o2.q f52496a = new p143o2.q();

    private q() {
    }

    public static final java.lang.String a(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
