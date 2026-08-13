.class public final Lcom/google/android/gms/internal/ads/uy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Nb;


# instance fields
.field private C:Lcom/google/android/gms/internal/ads/Ot;

.field private final D:Ljava/util/concurrent/Executor;

.field private final E:Lcom/google/android/gms/internal/ads/gy;

.field private final F:LV3/f;

.field private G:Z

.field private H:Z

.field private final I:Lcom/google/android/gms/internal/ads/jy;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/gy;LV3/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/uy;->G:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/uy;->H:Z

    new-instance v0, Lcom/google/android/gms/internal/ads/jy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/jy;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/uy;->I:Lcom/google/android/gms/internal/ads/jy;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uy;->D:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uy;->E:Lcom/google/android/gms/internal/ads/gy;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/uy;->F:LV3/f;

    return-void
.end method

.method private final f()V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uy;->E:Lcom/google/android/gms/internal/ads/gy;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uy;->I:Lcom/google/android/gms/internal/ads/jy;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/gy;->a(Lcom/google/android/gms/internal/ads/jy;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uy;->C:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uy;->D:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/android/gms/internal/ads/ty;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/ty;-><init>(Lcom/google/android/gms/internal/ads/uy;Lorg/json/JSONObject;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    const-string v1, "Failed to call video active view js"

    invoke-static {v1, v0}, Lv3/q0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final L(Lcom/google/android/gms/internal/ads/Mb;)V
    .locals 4

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/uy;->H:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/Mb;->j:Z

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uy;->I:Lcom/google/android/gms/internal/ads/jy;

    iput-boolean v0, v1, Lcom/google/android/gms/internal/ads/jy;->a:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uy;->F:LV3/f;

    invoke-interface {v0}, LV3/f;->c()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/google/android/gms/internal/ads/jy;->d:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uy;->I:Lcom/google/android/gms/internal/ads/jy;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/jy;->f:Lcom/google/android/gms/internal/ads/Mb;

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/uy;->G:Z

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/uy;->f()V

    :cond_1
    return-void
.end method

.method public final a()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/uy;->G:Z

    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/uy;->G:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/uy;->f()V

    return-void
.end method

.method final synthetic c(Lorg/json/JSONObject;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uy;->C:Lcom/google/android/gms/internal/ads/Ot;

    const-string v1, "AFMA_updateActiveView"

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Kk;->G0(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final d(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/uy;->H:Z

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uy;->C:Lcom/google/android/gms/internal/ads/Ot;

    return-void
.end method
