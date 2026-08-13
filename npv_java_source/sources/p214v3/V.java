package p214v3;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {
    public static android.os.Bundle a(org.json.JSONObject jSONObject) {
        java.lang.String strValueOf;
        java.lang.String str;
        java.lang.String strConcat;
        if (jSONObject == null) {
            return null;
        }
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        android.os.Bundle bundle = new android.os.Bundle();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof java.lang.Boolean) {
                    bundle.putBoolean(next, ((java.lang.Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof java.lang.Double) {
                    bundle.putDouble(next, ((java.lang.Double) objOpt).doubleValue());
                } else if (objOpt instanceof java.lang.Integer) {
                    bundle.putInt(next, ((java.lang.Integer) objOpt).intValue());
                } else if (objOpt instanceof java.lang.Long) {
                    bundle.putLong(next, ((java.lang.Long) objOpt).longValue());
                } else if (objOpt instanceof java.lang.String) {
                    bundle.putString(next, (java.lang.String) objOpt);
                } else if (objOpt instanceof org.json.JSONArray) {
                    org.json.JSONArray jSONArray = (org.json.JSONArray) objOpt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        java.lang.Object objOpt2 = null;
                        for (int i6 = 0; objOpt2 == null && i6 < length; i6++) {
                            objOpt2 = !jSONArray.isNull(i6) ? jSONArray.opt(i6) : null;
                        }
                        if (objOpt2 == null) {
                            strValueOf = java.lang.String.valueOf(next);
                            str = "Expected JSONArray with at least 1 non-null element for key:";
                            strConcat = str.concat(strValueOf);
                            p224w3.p.g(strConcat);
                        } else if (objOpt2 instanceof org.json.JSONObject) {
                            android.os.Bundle[] bundleArr = new android.os.Bundle[length];
                            for (int i10 = 0; i10 < length; i10++) {
                                bundleArr[i10] = !jSONArray.isNull(i10) ? a(jSONArray.optJSONObject(i10)) : null;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (objOpt2 instanceof java.lang.Number) {
                            double[] dArr = new double[jSONArray.length()];
                            for (int i11 = 0; i11 < length; i11++) {
                                dArr[i11] = jSONArray.optDouble(i11);
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (objOpt2 instanceof java.lang.CharSequence) {
                            java.lang.String[] strArr = new java.lang.String[length];
                            for (int i12 = 0; i12 < length; i12++) {
                                strArr[i12] = !jSONArray.isNull(i12) ? jSONArray.optString(i12) : null;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (objOpt2 instanceof java.lang.Boolean) {
                            boolean[] zArr = new boolean[length];
                            for (int i13 = 0; i13 < length; i13++) {
                                zArr[i13] = jSONArray.optBoolean(i13);
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            strConcat = java.lang.String.format("JSONArray with unsupported type %s for key:%s", objOpt2.getClass().getCanonicalName(), next);
                            p224w3.p.g(strConcat);
                        }
                    }
                } else if (objOpt instanceof org.json.JSONObject) {
                    bundle.putBundle(next, a((org.json.JSONObject) objOpt));
                } else {
                    strValueOf = java.lang.String.valueOf(next);
                    str = "Unsupported type for key:";
                    strConcat = str.concat(strValueOf);
                    p224w3.p.g(strConcat);
                }
            }
        }
        return bundle;
    }

    public static java.lang.String b(java.lang.String str, org.json.JSONObject jSONObject, java.lang.String... strArr) {
        org.json.JSONObject jSONObjectN = n(jSONObject, strArr);
        return jSONObjectN == null ? "" : jSONObjectN.optString(strArr[0], "");
    }

    public static java.util.List c(org.json.JSONArray jSONArray, java.util.List list) {
        if (list == null) {
            list = new java.util.ArrayList();
        }
        if (jSONArray != null) {
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                list.add(jSONArray.getString(i6));
            }
        }
        return list;
    }

    public static java.util.List d(android.util.JsonReader jsonReader) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static java.util.Map e(android.util.JsonReader jsonReader) throws java.io.IOException {
        java.util.HashMap map = new java.util.HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            java.util.HashMap map2 = new java.util.HashMap();
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                map2.put(jsonReader.nextName(), jsonReader.nextString());
            }
            jsonReader.endObject();
            map.put(strNextName, map2);
        }
        jsonReader.endObject();
        return map;
    }

    public static org.json.JSONArray f(android.util.JsonReader jsonReader) throws org.json.JSONException, java.io.IOException {
        java.lang.Object objF;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            android.util.JsonToken jsonTokenPeek = jsonReader.peek();
            if (android.util.JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                objF = f(jsonReader);
            } else if (android.util.JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                objF = i(jsonReader);
            } else if (android.util.JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (android.util.JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!android.util.JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new java.lang.IllegalStateException("unexpected json token: ".concat(java.lang.String.valueOf(jsonTokenPeek)));
                }
                objF = jsonReader.nextString();
            }
            jSONArray.put(objF);
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static org.json.JSONObject g(org.json.JSONObject jSONObject, java.lang.String str) throws org.json.JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (org.json.JSONException unused) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static org.json.JSONObject h(org.json.JSONObject jSONObject, java.lang.String... strArr) {
        org.json.JSONObject jSONObjectN = n(jSONObject, strArr);
        if (jSONObjectN == null) {
            return null;
        }
        return jSONObjectN.optJSONObject(strArr[1]);
    }

    public static org.json.JSONObject i(android.util.JsonReader jsonReader) {
        java.lang.Object objF;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            android.util.JsonToken jsonTokenPeek = jsonReader.peek();
            if (android.util.JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                objF = f(jsonReader);
            } else if (android.util.JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                objF = i(jsonReader);
            } else if (android.util.JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextBoolean());
            } else if (android.util.JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextDouble());
            } else {
                if (!android.util.JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new java.lang.IllegalStateException("unexpected json token: ".concat(java.lang.String.valueOf(jsonTokenPeek)));
                }
                objF = jsonReader.nextString();
            }
            jSONObject.put(strNextName, objF);
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void j(android.util.JsonWriter jsonWriter, org.json.JSONArray jSONArray) throws java.io.IOException {
        try {
            jsonWriter.beginArray();
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                java.lang.Object obj = jSONArray.get(i6);
                if (obj instanceof java.lang.String) {
                    jsonWriter.value((java.lang.String) obj);
                } else if (obj instanceof java.lang.Number) {
                    jsonWriter.value((java.lang.Number) obj);
                } else if (obj instanceof java.lang.Boolean) {
                    jsonWriter.value(((java.lang.Boolean) obj).booleanValue());
                } else if (obj instanceof org.json.JSONObject) {
                    k(jsonWriter, (org.json.JSONObject) obj);
                } else {
                    if (!(obj instanceof org.json.JSONArray)) {
                        throw new org.json.JSONException("unable to write field: " + java.lang.String.valueOf(obj));
                    }
                    j(jsonWriter, (org.json.JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (org.json.JSONException e6) {
            throw new java.io.IOException(e6);
        }
    }

    public static void k(android.util.JsonWriter jsonWriter, org.json.JSONObject jSONObject) throws java.io.IOException {
        try {
            jsonWriter.beginObject();
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.lang.Object obj = jSONObject.get(next);
                if (obj instanceof java.lang.String) {
                    jsonWriter.name(next).value((java.lang.String) obj);
                } else if (obj instanceof java.lang.Number) {
                    jsonWriter.name(next).value((java.lang.Number) obj);
                } else if (obj instanceof java.lang.Boolean) {
                    jsonWriter.name(next).value(((java.lang.Boolean) obj).booleanValue());
                } else if (obj instanceof org.json.JSONObject) {
                    k(jsonWriter.name(next), (org.json.JSONObject) obj);
                } else {
                    if (!(obj instanceof org.json.JSONArray)) {
                        throw new org.json.JSONException("unable to write field: " + java.lang.String.valueOf(obj));
                    }
                    j(jsonWriter.name(next), (org.json.JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (org.json.JSONException e6) {
            throw new java.io.IOException(e6);
        }
    }

    public static boolean l(boolean z6, org.json.JSONObject jSONObject, java.lang.String... strArr) {
        org.json.JSONObject jSONObjectN = n(jSONObject, strArr);
        if (jSONObjectN == null) {
            return false;
        }
        return jSONObjectN.optBoolean(strArr[strArr.length - 1], false);
    }

    public static java.lang.String m(com.google.android.gms.internal.ads.W60 w60) {
        if (w60 == null) {
            return null;
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            android.util.JsonWriter jsonWriter = new android.util.JsonWriter(stringWriter);
            o(jsonWriter, w60);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (java.io.IOException e6) {
            p224w3.p.e("Error when writing JSON.", e6);
            return null;
        }
    }

    private static org.json.JSONObject n(org.json.JSONObject jSONObject, java.lang.String[] strArr) {
        for (int i6 = 0; i6 < strArr.length - 1; i6 = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    private static void o(android.util.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof java.lang.Number) {
            jsonWriter.value((java.lang.Number) obj);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            jsonWriter.value(((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof java.lang.String) {
            jsonWriter.value((java.lang.String) obj);
            return;
        }
        if (obj instanceof com.google.android.gms.internal.ads.W60) {
            k(jsonWriter, ((com.google.android.gms.internal.ads.W60) obj).f32687d);
            return;
        }
        if (!(obj instanceof java.util.Map)) {
            if (!(obj instanceof java.util.List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                o(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
            java.lang.Object key = entry.getKey();
            if (key instanceof java.lang.String) {
                o(jsonWriter.name((java.lang.String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }
}
