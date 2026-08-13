.class public final Lcom/google/android/gms/internal/ads/SQ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;

.field private final c:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/SQ;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/SQ;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/SQ;->c:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/QQ;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SQ;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {}, Lcom/google/android/gms/internal/ads/O80;->c()Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/ads/U80;->c()Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SQ;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/nR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nR;->a()Lcom/google/android/gms/internal/ads/mR;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SQ;->c:Lcom/google/android/gms/internal/ads/rz0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mz0;->a(Lcom/google/android/gms/internal/ads/rz0;)Lcom/google/android/gms/internal/ads/kz0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Zy0;->a(Lcom/google/android/gms/internal/ads/kz0;)Lcom/google/android/gms/internal/ads/Uy0;

    move-result-object v6

    new-instance v0, Lcom/google/android/gms/internal/ads/QQ;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/QQ;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/mR;Lcom/google/android/gms/internal/ads/Uy0;)V

    return-object v0
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/SQ;->a()Lcom/google/android/gms/internal/ads/QQ;

    move-result-object v0

    return-object v0
.end method
