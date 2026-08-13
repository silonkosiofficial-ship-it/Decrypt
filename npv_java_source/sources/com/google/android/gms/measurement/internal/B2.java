package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f41729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.Bundle f41730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.os.Bundle f41731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 f41732d;

    public B2(com.google.android.gms.measurement.internal.C6511z2 c6511z2, java.lang.String str, android.os.Bundle bundle) {
        this.f41732d = c6511z2;
        Q3.AbstractC1477p.f(str);
        this.f41729a = str;
        this.f41730b = c6511z2.d().t(com.google.android.gms.measurement.internal.G.f41897l1) ? new android.os.Bundle() : new android.os.Bundle();
    }

    private final java.lang.String c(android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.C6442p2 c6442p2G;
        java.lang.Class<?> cls;
        java.lang.String str;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (java.lang.String str2 : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str2);
            if (obj != null) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("n", str2);
                    if (com.google.android.gms.internal.measurement.C6066l7.a() && this.f41732d.d().t(com.google.android.gms.measurement.internal.G.f41829J0)) {
                        if (obj instanceof java.lang.String) {
                            jSONObject.put("v", java.lang.String.valueOf(obj));
                            jSONObject.put("t", "s");
                        } else if (obj instanceof java.lang.Long) {
                            jSONObject.put("v", java.lang.String.valueOf(obj));
                            jSONObject.put("t", "l");
                        } else {
                            if (obj instanceof int[]) {
                                jSONObject.put("v", java.util.Arrays.toString((int[]) obj));
                                str = "ia";
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", java.util.Arrays.toString((long[]) obj));
                                str = "la";
                            } else if (obj instanceof java.lang.Double) {
                                jSONObject.put("v", java.lang.String.valueOf(obj));
                                jSONObject.put("t", "d");
                            } else {
                                c6442p2G = this.f41732d.j().G();
                                cls = obj.getClass();
                                c6442p2G.b("Cannot serialize bundle value to SharedPreferences. Type", cls);
                            }
                            jSONObject.put("t", str);
                        }
                        jSONArray.put(jSONObject);
                    } else {
                        jSONObject.put("v", java.lang.String.valueOf(obj));
                        if (obj instanceof java.lang.String) {
                            jSONObject.put("t", "s");
                            jSONArray.put(jSONObject);
                        } else if (obj instanceof java.lang.Long) {
                            jSONObject.put("t", "l");
                            jSONArray.put(jSONObject);
                        } else if (obj instanceof java.lang.Double) {
                            jSONObject.put("t", "d");
                            jSONArray.put(jSONObject);
                        } else {
                            c6442p2G = this.f41732d.j().G();
                            cls = obj.getClass();
                            c6442p2G.b("Cannot serialize bundle value to SharedPreferences. Type", cls);
                        }
                    }
                } catch (org.json.JSONException e6) {
                    this.f41732d.j().G().b("Cannot serialize bundle value to SharedPreferences", e6);
                }
            }
        }
        return jSONArray.toString();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    public final android.os.Bundle a() {
        byte b6;
        if (this.f41731c == null) {
            java.lang.String string = this.f41732d.J().getString(this.f41729a, null);
            if (string != null) {
                try {
                    android.os.Bundle bundle = new android.os.Bundle();
                    org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        try {
                            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i6);
                            java.lang.String string2 = jSONObject.getString("n");
                            java.lang.String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                b6 = 4;
                                            } else {
                                                b6 = -1;
                                            }
                                        } else if (string3.equals("ia")) {
                                            b6 = 3;
                                        } else {
                                            b6 = -1;
                                        }
                                    } else if (string3.equals("s")) {
                                        b6 = 0;
                                    } else {
                                        b6 = -1;
                                    }
                                } else if (string3.equals("l")) {
                                    b6 = 2;
                                } else {
                                    b6 = -1;
                                }
                            } else if (string3.equals("d")) {
                                b6 = 1;
                            } else {
                                b6 = -1;
                            }
                            if (b6 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b6 == 1) {
                                bundle.putDouble(string2, java.lang.Double.parseDouble(jSONObject.getString("v")));
                            } else if (b6 == 2) {
                                bundle.putLong(string2, java.lang.Long.parseLong(jSONObject.getString("v")));
                            } else if (b6 != 3) {
                                if (b6 != 4) {
                                    this.f41732d.j().G().b("Unrecognized persisted bundle type. Type", string3);
                                } else if (com.google.android.gms.internal.measurement.C6066l7.a() && this.f41732d.d().t(com.google.android.gms.measurement.internal.G.f41829J0)) {
                                    org.json.JSONArray jSONArray2 = new org.json.JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    long[] jArr = new long[length];
                                    for (int i10 = 0; i10 < length; i10++) {
                                        jArr[i10] = jSONArray2.optLong(i10);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            } else if (com.google.android.gms.internal.measurement.C6066l7.a() && this.f41732d.d().t(com.google.android.gms.measurement.internal.G.f41829J0)) {
                                org.json.JSONArray jSONArray3 = new org.json.JSONArray(jSONObject.getString("v"));
                                int length2 = jSONArray3.length();
                                int[] iArr = new int[length2];
                                for (int i11 = 0; i11 < length2; i11++) {
                                    iArr[i11] = jSONArray3.optInt(i11);
                                }
                                bundle.putIntArray(string2, iArr);
                            }
                        } catch (java.lang.NumberFormatException | org.json.JSONException unused) {
                            this.f41732d.j().G().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f41731c = bundle;
                } catch (org.json.JSONException unused2) {
                    this.f41732d.j().G().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f41731c == null) {
                this.f41731c = this.f41730b;
            }
        }
        return this.f41732d.d().t(com.google.android.gms.measurement.internal.G.f41897l1) ? new android.os.Bundle((android.os.Bundle) Q3.AbstractC1477p.l(this.f41731c)) : (android.os.Bundle) Q3.AbstractC1477p.l(this.f41731c);
    }

    public final void b(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        } else if (this.f41732d.d().t(com.google.android.gms.measurement.internal.G.f41897l1)) {
            bundle = new android.os.Bundle(bundle);
        }
        android.content.SharedPreferences.Editor editorEdit = this.f41732d.J().edit();
        if (bundle.size() == 0) {
            editorEdit.remove(this.f41729a);
        } else {
            editorEdit.putString(this.f41729a, c(bundle));
        }
        editorEdit.apply();
        this.f41731c = bundle;
    }
}
