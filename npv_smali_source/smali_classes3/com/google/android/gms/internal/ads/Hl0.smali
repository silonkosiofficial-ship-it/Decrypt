.class public final Lcom/google/android/gms/internal/ads/Hl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Oh0;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/Oh0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Jm0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Jm0;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Hl0;->a:Landroid/content/Context;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Hl0;->b:Lcom/google/android/gms/internal/ads/Oh0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Lcom/google/android/gms/internal/ads/pi0;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/im0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Hl0;->b:Lcom/google/android/gms/internal/ads/Oh0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Hl0;->a:Landroid/content/Context;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Oh0;->a()Lcom/google/android/gms/internal/ads/pi0;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/im0;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/pi0;)V

    return-object v0
.end method
