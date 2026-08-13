.class public abstract Lcom/google/android/gms/internal/ads/Qg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/internal/ads/lg;

.field public static final b:Lcom/google/android/gms/internal/ads/lg;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "gads:trustless_token_for_decagon:enabled"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/lg;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/lg;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/Qg;->a:Lcom/google/android/gms/internal/ads/lg;

    const-string v0, "gads:invalidate_token_at_refresh_start"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/lg;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/lg;

    const-string v0, "gms:expose_token_for_gma:enabled"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/lg;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/lg;

    const-string v0, "gads:referesh_rate_limit"

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/lg;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/lg;

    const-string v0, "gads:timeout_for_trustless_token:millis"

    const-wide/16 v2, 0x7d0

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/ads/lg;->b(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/lg;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/Qg;->b:Lcom/google/android/gms/internal/ads/lg;

    const-string v0, "gads:token_anonymization:enabled"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/lg;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/lg;

    const-string v0, "gads:cached_token:ttl_millis"

    const-wide/32 v1, 0xa4cb80

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/lg;->b(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/lg;

    return-void
.end method
