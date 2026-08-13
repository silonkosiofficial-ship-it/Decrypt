package p126m5;

/* JADX INFO: loaded from: classes3.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.nio.charset.Charset f51142b = java.nio.charset.Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p166q5.g f51143a;

    class a extends org.json.JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f51144a;

        a(java.lang.String str) throws org.json.JSONException {
            this.f51144a = str;
            put("userId", str);
        }
    }

    public f(p166q5.g gVar) {
        this.f51143a = gVar;
    }

    private static java.util.Map e(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            map.put(next, p(jSONObject, next));
        }
        return map;
    }

    private static java.util.List f(java.lang.String str) throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("rolloutsState");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            java.lang.String string = jSONArray.getString(i6);
            try {
                arrayList.add(p126m5.i.a(string));
            } catch (java.lang.Exception e6) {
                p076h5.g.f().l("Failed de-serializing rollouts state. " + string, e6);
            }
        }
        return arrayList;
    }

    private java.lang.String g(java.lang.String str) {
        return p(new org.json.JSONObject(str), "userId");
    }

    private static java.lang.String h(java.util.Map map) {
        return new org.json.JSONObject(map).toString();
    }

    private static java.lang.String l(java.util.List list) {
        java.util.HashMap map = new java.util.HashMap();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i6 = 0; i6 < list.size(); i6++) {
            try {
                jSONArray.put(new org.json.JSONObject(p126m5.i.f51170a.b(list.get(i6))));
            } catch (org.json.JSONException e6) {
                p076h5.g.f().l("Exception parsing rollout assignment!", e6);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new org.json.JSONObject(map).toString();
    }

    private static void m(java.io.File file) {
        if (file.exists() && file.delete()) {
            p076h5.g.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static void n(java.io.File file, java.lang.String str) {
        if (file.exists() && file.delete()) {
            p076h5.g.f().g(java.lang.String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    private static java.lang.String o(java.lang.String str) {
        return new m5.f.a(str).toString();
    }

    private static java.lang.String p(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public java.io.File a(java.lang.String str) {
        return this.f51143a.q(str, "internal-keys");
    }

    public java.io.File b(java.lang.String str) {
        return this.f51143a.q(str, "keys");
    }

    public java.io.File c(java.lang.String str) {
        return this.f51143a.q(str, "rollouts-state");
    }

    public java.io.File d(java.lang.String str) {
        return this.f51143a.q(str, "user-data");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    java.util.Map i(java.lang.String str, boolean z6) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.FileInputStream fileInputStream;
        java.lang.Exception e6;
        java.io.File fileA = z6 ? a(str) : b(str);
        if (!fileA.exists() || fileA.length() == 0) {
            n(fileA, "The file has a length of zero for session: " + str);
            return java.util.Collections.emptyMap();
        }
        try {
            try {
                fileInputStream = new java.io.FileInputStream(fileA);
                try {
                    java.util.Map mapE = e(p106k5.AbstractC6898i.A(fileInputStream));
                    p106k5.AbstractC6898i.f(fileInputStream, "Failed to close user metadata file.");
                    return mapE;
                } catch (java.lang.Exception e10) {
                    e6 = e10;
                    p076h5.g.f().l("Error deserializing user metadata.", e6);
                    m(fileA);
                    p106k5.AbstractC6898i.f(fileInputStream, "Failed to close user metadata file.");
                    return java.util.Collections.emptyMap();
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                p106k5.AbstractC6898i.f(, "Failed to close user metadata file.");
                throw th;
            }
        } catch (java.lang.Exception e11) {
            fileInputStream = null;
            e6 = e11;
        } catch (java.lang.Throwable th3) {
            ?? r6 = 0;
            th = th3;
            p106k5.AbstractC6898i.f(r6, "Failed to close user metadata file.");
            throw th;
        }
    }

    public java.util.List j(java.lang.String str) throws java.lang.Throwable {
        java.io.File fileC = c(str);
        if (!fileC.exists() || fileC.length() == 0) {
            n(fileC, "The file has a length of zero for session: " + str);
            return java.util.Collections.emptyList();
        }
        java.io.FileInputStream fileInputStream = null;
        try {
            try {
                java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(fileC);
                try {
                    java.util.List listF = f(p106k5.AbstractC6898i.A(fileInputStream2));
                    p076h5.g.f().b("Loaded rollouts state:\n" + listF + "\nfor session " + str);
                    p106k5.AbstractC6898i.f(fileInputStream2, "Failed to close rollouts state file.");
                    return listF;
                } catch (java.lang.Exception e6) {
                    e = e6;
                    fileInputStream = fileInputStream2;
                    p076h5.g.f().l("Error deserializing rollouts state.", e);
                    m(fileC);
                    p106k5.AbstractC6898i.f(fileInputStream, "Failed to close rollouts state file.");
                    return java.util.Collections.emptyList();
                } catch (java.lang.Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    p106k5.AbstractC6898i.f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (java.lang.Exception e10) {
                e = e10;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public java.lang.String k(java.lang.String str) throws java.lang.Throwable {
        java.io.FileInputStream fileInputStream;
        java.io.File fileD = d(str);
        java.io.FileInputStream fileInputStream2 = null;
        if (!fileD.exists() || fileD.length() == 0) {
            p076h5.g.f().b("No userId set for session " + str);
            m(fileD);
            return null;
        }
        try {
            fileInputStream = new java.io.FileInputStream(fileD);
            try {
                try {
                    java.lang.String strG = g(p106k5.AbstractC6898i.A(fileInputStream));
                    p076h5.g.f().b("Loaded userId " + strG + " for session " + str);
                    p106k5.AbstractC6898i.f(fileInputStream, "Failed to close user metadata file.");
                    return strG;
                } catch (java.lang.Exception e6) {
                    e = e6;
                    p076h5.g.f().l("Error deserializing user metadata.", e);
                    m(fileD);
                    p106k5.AbstractC6898i.f(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                p106k5.AbstractC6898i.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (java.lang.Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            p106k5.AbstractC6898i.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void q(java.lang.String str, java.util.Map map) throws java.lang.Throwable {
        r(str, map, false);
    }

    public void r(java.lang.String str, java.util.Map map, boolean z6) throws java.lang.Throwable {
        java.io.File fileA = z6 ? a(str) : b(str);
        java.io.BufferedWriter bufferedWriter = null;
        try {
            try {
                java.lang.String strH = h(map);
                java.io.BufferedWriter bufferedWriter2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(fileA), f51142b));
                try {
                    bufferedWriter2.write(strH);
                    bufferedWriter2.flush();
                    p106k5.AbstractC6898i.f(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (java.lang.Exception e6) {
                    e = e6;
                    bufferedWriter = bufferedWriter2;
                    p076h5.g.f().l("Error serializing key/value metadata.", e);
                    m(fileA);
                    p106k5.AbstractC6898i.f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (java.lang.Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    p106k5.AbstractC6898i.f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Exception e10) {
            e = e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public void s(java.lang.String str, java.util.List list) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.BufferedWriter bufferedWriter;
        java.lang.Exception e6;
        java.io.File fileC = c(str);
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            n(fileC, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                java.lang.String strL = l(list);
                bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(fileC), f51142b));
                try {
                    bufferedWriter.write(strL);
                    bufferedWriter.flush();
                    IsEmpty = bufferedWriter;
                } catch (java.lang.Exception e10) {
                    e6 = e10;
                    p076h5.g.f().l("Error serializing rollouts state.", e6);
                    m(fileC);
                    IsEmpty = bufferedWriter;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                p106k5.AbstractC6898i.f(IsEmpty, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (java.lang.Exception e11) {
            bufferedWriter = null;
            e6 = e11;
        } catch (java.lang.Throwable th3) {
            IsEmpty = 0;
            th = th3;
            p106k5.AbstractC6898i.f(IsEmpty, "Failed to close rollouts state file.");
            throw th;
        }
        p106k5.AbstractC6898i.f(IsEmpty, "Failed to close rollouts state file.");
    }

    public void t(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        java.io.File fileD = d(str);
        java.io.BufferedWriter bufferedWriter = null;
        try {
            try {
                java.lang.String strO = o(str2);
                java.io.BufferedWriter bufferedWriter2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(fileD), f51142b));
                try {
                    bufferedWriter2.write(strO);
                    bufferedWriter2.flush();
                    p106k5.AbstractC6898i.f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (java.lang.Exception e6) {
                    e = e6;
                    bufferedWriter = bufferedWriter2;
                    p076h5.g.f().l("Error serializing user metadata.", e);
                    p106k5.AbstractC6898i.f(bufferedWriter, "Failed to close user metadata file.");
                } catch (java.lang.Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    p106k5.AbstractC6898i.f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (java.lang.Exception e10) {
                e = e10;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
