package p055f4;

/* JADX INFO: renamed from: f4.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6572o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f45208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f45209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f45210c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45213f = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.List f45211d = java.util.Collections.emptyList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.util.List f45212e = java.util.Collections.emptyList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45214g = 1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:74:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x014a  */
    public static p055f4.C6572o0 a(android.util.JsonReader jsonReader) throws java.io.IOException {
        byte b6;
        byte b10;
        int i6;
        p055f4.C6572o0 c6572o0 = new p055f4.C6572o0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int i10 = 6;
            int i11 = 3;
            switch (jsonReader.nextName()) {
                case "consent_signal":
                    java.lang.String strNextString = jsonReader.nextString();
                    switch (strNextString) {
                        case "CONSENT_SIGNAL_UNKNOWN":
                            i10 = 1;
                            c6572o0.f45213f = i10;
                            continue;
                            break;
                        case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                            i10 = 2;
                            c6572o0.f45213f = i10;
                            continue;
                            break;
                        case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                            i10 = 3;
                            c6572o0.f45213f = i10;
                            continue;
                            break;
                        case "CONSENT_SIGNAL_SUFFICIENT":
                            i10 = 4;
                            c6572o0.f45213f = i10;
                            continue;
                            break;
                        case "CONSENT_SIGNAL_COLLECT_CONSENT":
                            i10 = 5;
                            c6572o0.f45213f = i10;
                            continue;
                            break;
                        case "CONSENT_SIGNAL_NOT_REQUIRED":
                            c6572o0.f45213f = i10;
                            continue;
                            break;
                        case "CONSENT_SIGNAL_ERROR":
                            i10 = 7;
                            c6572o0.f45213f = i10;
                            continue;
                            break;
                        case "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION":
                            i10 = 8;
                            c6572o0.f45213f = i10;
                            continue;
                            break;
                        default:
                            throw new java.io.IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                    }
                    break;
                case "consent_form_payload":
                    c6572o0.f45208a = jsonReader.nextString();
                    continue;
                    break;
                case "consent_form_base_url":
                    c6572o0.f45209b = jsonReader.nextString();
                    continue;
                    break;
                case "error_message":
                    c6572o0.f45210c = jsonReader.nextString();
                    continue;
                    break;
                case "request_info_keys":
                    c6572o0.f45211d = new java.util.ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c6572o0.f45211d.add(jsonReader.nextString());
                    }
                    break;
                case "actions":
                    c6572o0.f45212e = new java.util.ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        p055f4.C6570n0 c6570n0 = new p055f4.C6570n0();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            java.lang.String strNextName = jsonReader.nextName();
                            int iHashCode = strNextName.hashCode();
                            if (iHashCode != -2105551094) {
                                if (iHashCode == 1583758243 && strNextName.equals("action_type")) {
                                    b6 = 0;
                                } else {
                                    b6 = -1;
                                }
                            } else if (strNextName.equals("args_json")) {
                                b6 = 1;
                            } else {
                                b6 = -1;
                            }
                            if (b6 == 0) {
                                java.lang.String strNextString2 = jsonReader.nextString();
                                int iHashCode2 = strNextString2.hashCode();
                                if (iHashCode2 != 64208429) {
                                    if (iHashCode2 != 82862015) {
                                        if (iHashCode2 == 1856333582 && strNextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                            b10 = 0;
                                        } else {
                                            b10 = -1;
                                        }
                                    } else if (strNextString2.equals("WRITE")) {
                                        b10 = 1;
                                    } else {
                                        b10 = -1;
                                    }
                                } else if (strNextString2.equals("CLEAR")) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                                if (b10 == 0) {
                                    i6 = 1;
                                } else if (b10 == 1) {
                                    i6 = 2;
                                } else {
                                    if (b10 != 2) {
                                        throw new java.io.IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString2));
                                    }
                                    i6 = 3;
                                }
                                c6570n0.f45202b = i6;
                            } else if (b6 != 1) {
                                jsonReader.skipValue();
                            } else {
                                c6570n0.f45201a = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        c6572o0.f45212e.add(c6570n0);
                    }
                    break;
                case "privacy_options_required":
                    java.lang.String strNextString3 = jsonReader.nextString();
                    int iHashCode3 = strNextString3.hashCode();
                    if (iHashCode3 != -1888946261) {
                        if (iHashCode3 != 389487519) {
                            if (iHashCode3 == 433141802 && strNextString3.equals("UNKNOWN")) {
                            }
                        } else if (strNextString3.equals("REQUIRED")) {
                        }
                    } else if (strNextString3.equals("NOT_REQUIRED")) {
                    }
                    if (r6 == 0) {
                        i11 = 1;
                    } else if (r6 == 1) {
                        i11 = 2;
                    } else if (r6 != 2) {
                        throw new java.io.IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString3));
                    }
                    c6572o0.f45214g = i11;
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
                    break;
            }
            jsonReader.endArray();
        }
        jsonReader.endObject();
        return c6572o0;
    }
}
