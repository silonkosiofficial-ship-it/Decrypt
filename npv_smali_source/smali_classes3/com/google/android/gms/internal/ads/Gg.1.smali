.class public abstract Lcom/google/android/gms/internal/ads/Gg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/internal/ads/lg;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "gads:parallel_rendering:max_renderers"

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/lg;->b(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/lg;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/Gg;->a:Lcom/google/android/gms/internal/ads/lg;

    return-void
.end method
