.class public final synthetic Lcom/google/android/gms/internal/ads/vt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/y0;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/net/Uri;Ljava/util/Map;)[Lcom/google/android/gms/internal/ads/t0;
    .locals 8

    sget p1, Lcom/google/android/gms/internal/ads/wt;->Y:I

    new-instance p1, Lcom/google/android/gms/internal/ads/G3;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/G3;-><init>()V

    new-instance p2, Lcom/google/android/gms/internal/ads/X2;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/X2;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/ads/B3;

    sget-object v1, Lcom/google/android/gms/internal/ads/q4;->a:Lcom/google/android/gms/internal/ads/q4;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v2, 0x20

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/B3;-><init>(Lcom/google/android/gms/internal/ads/q4;ILcom/google/android/gms/internal/ads/bV;Lcom/google/android/gms/internal/ads/N3;Ljava/util/List;Lcom/google/android/gms/internal/ads/a1;)V

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/google/android/gms/internal/ads/t0;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    const/4 p1, 0x2

    aput-object v7, v0, p1

    return-object v0
.end method
