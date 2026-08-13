.class public final synthetic Lcom/google/android/gms/internal/ads/lt;
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
    .locals 2

    sget p1, Lcom/google/android/gms/internal/ads/wt;->Y:I

    new-instance p1, Lcom/google/android/gms/internal/ads/G3;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/G3;-><init>()V

    new-instance p2, Lcom/google/android/gms/internal/ads/X2;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/X2;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/internal/ads/t0;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    return-object v0
.end method
