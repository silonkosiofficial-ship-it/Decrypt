.class public final Lcom/google/android/gms/internal/ads/Py;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Py;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Py;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method

.method public static c(Ljava/util/concurrent/ScheduledExecutorService;LV3/f;)Lcom/google/android/gms/internal/ads/ZD;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/ZD;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/ZD;-><init>(Ljava/util/concurrent/ScheduledExecutorService;LV3/f;)V

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/ZD;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Py;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Py;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LV3/f;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/Py;->c(Ljava/util/concurrent/ScheduledExecutorService;LV3/f;)Lcom/google/android/gms/internal/ads/ZD;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Py;->a()Lcom/google/android/gms/internal/ads/ZD;

    move-result-object v0

    return-object v0
.end method
