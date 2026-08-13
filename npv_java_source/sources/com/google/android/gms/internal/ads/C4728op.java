package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.op, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4728op extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C4728op> CREATOR = new com.google.android.gms.internal.ads.C4838pp();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f37873C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f37874D;

    public C4728op(java.lang.String str, int i6) {
        this.f37873C = str;
        this.f37874D = i6;
    }

    public static com.google.android.gms.internal.ads.C4728op e(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new com.google.android.gms.internal.ads.C4728op(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.google.android.gms.internal.ads.C4728op)) {
            com.google.android.gms.internal.ads.C4728op c4728op = (com.google.android.gms.internal.ads.C4728op) obj;
            if (Q3.AbstractC1475n.a(this.f37873C, c4728op.f37873C)) {
                if (Q3.AbstractC1475n.a(java.lang.Integer.valueOf(this.f37874D), java.lang.Integer.valueOf(c4728op.f37874D))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Q3.AbstractC1475n.b(this.f37873C, java.lang.Integer.valueOf(this.f37874D));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f37873C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 2, str, false);
        R3.c.k(parcel, 3, this.f37874D);
        R3.c.b(parcel, iA);
    }
}
