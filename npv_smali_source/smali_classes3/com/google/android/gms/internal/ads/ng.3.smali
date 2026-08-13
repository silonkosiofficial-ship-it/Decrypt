.class public abstract Lcom/google/android/gms/internal/ads/ng;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/internal/ads/lg;

.field public static final b:Lcom/google/android/gms/internal/ads/lg;

.field public static final c:Lcom/google/android/gms/internal/ads/lg;

.field public static final d:Lcom/google/android/gms/internal/ads/lg;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "gads:afs:csa_send_tcf_data"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/lg;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/lg;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/ng;->a:Lcom/google/android/gms/internal/ads/lg;

    new-instance v0, Lcom/google/android/gms/internal/ads/lg;

    const-string v1, "gads:afs:csa_tcf_data_to_collect"

    const-string v2, "[{\"bk\":\"tcString\",\"sk\":\"IABTCF_TCString\",\"type\":0},{\"bk\":\"gdprApplies\",\"sk\":\"IABTCF_gdprApplies\",\"type\":1},{\"bk\":\"usPrivacy\",\"sk\":\"IABUSPrivacy_String\",\"type\":0}]"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/lg;-><init>(Ljava/lang/String;Ljava/lang/Object;I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/ng;->b:Lcom/google/android/gms/internal/ads/lg;

    new-instance v0, Lcom/google/android/gms/internal/ads/lg;

    const-string v1, "gads:afs:csa_webview_custom_domain_param_key"

    const-string v2, "csa_customDomain"

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/lg;-><init>(Ljava/lang/String;Ljava/lang/Object;I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/ng;->c:Lcom/google/android/gms/internal/ads/lg;

    new-instance v0, Lcom/google/android/gms/internal/ads/lg;

    const-string v1, "gads:afs:csa_webview_static_file_path"

    const-string v2, "/afs/ads/i/webview.html"

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/lg;-><init>(Ljava/lang/String;Ljava/lang/Object;I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/ng;->d:Lcom/google/android/gms/internal/ads/lg;

    return-void
.end method
