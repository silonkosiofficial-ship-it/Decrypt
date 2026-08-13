.class public final LB3/o0;
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

    iput-object p1, p0, LB3/o0;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, LB3/o0;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LB3/o0;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/av;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, LB3/o0;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/kO;

    invoke-static {}, Lcom/google/android/gms/internal/ads/O80;->c()Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v2

    new-instance v3, LB3/l0;

    invoke-direct {v3, v0, v1, v2}, LB3/l0;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/kO;Ljava/util/concurrent/ExecutorService;)V

    return-object v3
.end method
