.class public final Lcom/google/android/gms/internal/ads/S30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/S30;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/S30;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lcom/google/android/gms/internal/ads/Qw;->a()Lcom/google/android/gms/internal/ads/Qn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/S30;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/S30;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v2, Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/av;->a()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/Q30;

    invoke-direct {v3, v0, v1, v2}, Lcom/google/android/gms/internal/ads/Q30;-><init>(Lcom/google/android/gms/internal/ads/Qn;Ljava/util/concurrent/ScheduledExecutorService;Landroid/content/Context;)V

    return-object v3
.end method
