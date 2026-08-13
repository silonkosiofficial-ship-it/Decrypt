.class public final Lcom/google/android/gms/internal/ads/xH0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/KH0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/wH0;

.field private final b:Lcom/google/android/gms/internal/ads/q4;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/y0;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Hl0;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/Hl0;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/google/android/gms/internal/ads/k4;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/k4;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xH0;->b:Lcom/google/android/gms/internal/ads/q4;

    new-instance v1, Lcom/google/android/gms/internal/ads/wH0;

    invoke-direct {v1, p2, p1}, Lcom/google/android/gms/internal/ads/wH0;-><init>(Lcom/google/android/gms/internal/ads/y0;Lcom/google/android/gms/internal/ads/q4;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/xH0;->a:Lcom/google/android/gms/internal/ads/wH0;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/wH0;->a(Lcom/google/android/gms/internal/ads/Oh0;)V

    return-void
.end method
