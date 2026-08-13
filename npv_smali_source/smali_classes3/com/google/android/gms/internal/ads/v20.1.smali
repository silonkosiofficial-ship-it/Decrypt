.class public final Lcom/google/android/gms/internal/ads/v20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/pq;

.field private final b:Lcom/google/android/gms/internal/ads/Yk0;

.field private final c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/pq;Lcom/google/android/gms/internal/ads/Yk0;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/v20;->a:Lcom/google/android/gms/internal/ads/pq;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/v20;->b:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/v20;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x22

    return v0
.end method

.method public final b()LP4/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/u20;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/u20;-><init>(Lcom/google/android/gms/internal/ads/v20;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/v20;->b:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object v0

    return-object v0
.end method

.method final synthetic c()Lcom/google/android/gms/internal/ads/w20;
    .locals 8

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v20;->a:Lcom/google/android/gms/internal/ads/pq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/v20;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/pq;->p(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/w20;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/w20;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v20;->a:Lcom/google/android/gms/internal/ads/pq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/v20;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/pq;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_1

    move-object v3, v1

    goto :goto_0

    :cond_1
    move-object v3, v0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v20;->a:Lcom/google/android/gms/internal/ads/pq;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/v20;->c:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/pq;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    move-object v4, v1

    goto :goto_1

    :cond_2
    move-object v4, v0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v20;->a:Lcom/google/android/gms/internal/ads/pq;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/v20;->c:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/pq;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    move-object v5, v1

    goto :goto_2

    :cond_3
    move-object v5, v0

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v20;->a:Lcom/google/android/gms/internal/ads/pq;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/v20;->c:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/pq;->p(Landroid/content/Context;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v6, 0x1

    if-eq v6, v0, :cond_4

    move-object v0, v2

    goto :goto_3

    :cond_4
    const-string v0, "fa"

    :goto_3
    const-string v6, "TIME_OUT"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->t0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v6

    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    :cond_5
    move-object v7, v2

    if-nez v0, :cond_6

    move-object v6, v1

    goto :goto_4

    :cond_6
    move-object v6, v0

    :goto_4
    new-instance v0, Lcom/google/android/gms/internal/ads/w20;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/w20;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    return-object v0
.end method
