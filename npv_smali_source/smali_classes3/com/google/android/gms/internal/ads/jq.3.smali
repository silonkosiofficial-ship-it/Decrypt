.class final Lcom/google/android/gms/internal/ads/jq;
.super Lcom/google/android/gms/internal/ads/qq;
.source "SourceFile"


# instance fields
.field private final b:LV3/f;

.field private final c:Lcom/google/android/gms/internal/ads/kz0;

.field private final d:Lcom/google/android/gms/internal/ads/kz0;

.field private final e:Lcom/google/android/gms/internal/ads/kz0;

.field private final f:Lcom/google/android/gms/internal/ads/kz0;

.field private final g:Lcom/google/android/gms/internal/ads/kz0;

.field private final h:Lcom/google/android/gms/internal/ads/kz0;

.field private final i:Lcom/google/android/gms/internal/ads/kz0;

.field private final j:Lcom/google/android/gms/internal/ads/kz0;


# direct methods
.method synthetic constructor <init>(Landroid/content/Context;LV3/f;Lv3/s0;Lcom/google/android/gms/internal/ads/pq;Lcom/google/android/gms/internal/ads/kq;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qq;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/jq;->b:LV3/f;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/bz0;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/az0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jq;->c:Lcom/google/android/gms/internal/ads/kz0;

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/bz0;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/az0;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/jq;->d:Lcom/google/android/gms/internal/ads/kz0;

    new-instance p5, Lcom/google/android/gms/internal/ads/cq;

    invoke-direct {p5, p1, p3}, Lcom/google/android/gms/internal/ads/cq;-><init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V

    invoke-static {p5}, Lcom/google/android/gms/internal/ads/Zy0;->c(Lcom/google/android/gms/internal/ads/kz0;)Lcom/google/android/gms/internal/ads/kz0;

    move-result-object p5

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/jq;->e:Lcom/google/android/gms/internal/ads/kz0;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/bz0;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/az0;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/jq;->f:Lcom/google/android/gms/internal/ads/kz0;

    invoke-static {p4}, Lcom/google/android/gms/internal/ads/bz0;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/az0;

    move-result-object p4

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/jq;->g:Lcom/google/android/gms/internal/ads/kz0;

    new-instance p5, Lcom/google/android/gms/internal/ads/eq;

    invoke-direct {p5, p2, p3, p4}, Lcom/google/android/gms/internal/ads/eq;-><init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V

    invoke-static {p5}, Lcom/google/android/gms/internal/ads/Zy0;->c(Lcom/google/android/gms/internal/ads/kz0;)Lcom/google/android/gms/internal/ads/kz0;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/jq;->h:Lcom/google/android/gms/internal/ads/kz0;

    new-instance p4, Lcom/google/android/gms/internal/ads/hq;

    invoke-direct {p4, p2, p3}, Lcom/google/android/gms/internal/ads/hq;-><init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/jq;->i:Lcom/google/android/gms/internal/ads/kz0;

    new-instance p2, Lcom/google/android/gms/internal/ads/vq;

    invoke-direct {p2, p1, p4}, Lcom/google/android/gms/internal/ads/vq;-><init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Zy0;->c(Lcom/google/android/gms/internal/ads/kz0;)Lcom/google/android/gms/internal/ads/kz0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jq;->j:Lcom/google/android/gms/internal/ads/kz0;

    return-void
.end method


# virtual methods
.method final a()Lcom/google/android/gms/internal/ads/bq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jq;->e:Lcom/google/android/gms/internal/ads/kz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/bq;

    return-object v0
.end method

.method final b()Lcom/google/android/gms/internal/ads/fq;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jq;->h:Lcom/google/android/gms/internal/ads/kz0;

    new-instance v1, Lcom/google/android/gms/internal/ads/fq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/dq;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/jq;->b:LV3/f;

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/ads/fq;-><init>(LV3/f;Lcom/google/android/gms/internal/ads/dq;)V

    return-object v1
.end method

.method final c()Lcom/google/android/gms/internal/ads/uq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jq;->j:Lcom/google/android/gms/internal/ads/kz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/uq;

    return-object v0
.end method
