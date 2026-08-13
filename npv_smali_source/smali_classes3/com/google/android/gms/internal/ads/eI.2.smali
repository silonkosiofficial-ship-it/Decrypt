.class public final Lcom/google/android/gms/internal/ads/eI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/EC;
.implements Lcom/google/android/gms/internal/ads/qG;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/lq;

.field private final D:Landroid/content/Context;

.field private final E:Lcom/google/android/gms/internal/ads/pq;

.field private final F:Landroid/view/View;

.field private G:Ljava/lang/String;

.field private final H:Lcom/google/android/gms/internal/ads/vd;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/lq;Landroid/content/Context;Lcom/google/android/gms/internal/ads/pq;Landroid/view/View;Lcom/google/android/gms/internal/ads/vd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eI;->C:Lcom/google/android/gms/internal/ads/lq;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/eI;->D:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/eI;->E:Lcom/google/android/gms/internal/ads/pq;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/eI;->F:Landroid/view/View;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/eI;->H:Lcom/google/android/gms/internal/ads/vd;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eI;->C:Lcom/google/android/gms/internal/ads/lq;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/lq;->b(Z)V

    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final c()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eI;->F:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eI;->G:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eI;->E:Lcom/google/android/gms/internal/ads/pq;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eI;->G:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/pq;->o(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eI;->C:Lcom/google/android/gms/internal/ads/lq;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/lq;->b(Z)V

    return-void
.end method

.method public final d()V
    .locals 0

    return-void
.end method

.method public final e()V
    .locals 0

    return-void
.end method

.method public final k()V
    .locals 0

    return-void
.end method

.method public final l()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eI;->H:Lcom/google/android/gms/internal/ads/vd;

    sget-object v1, Lcom/google/android/gms/internal/ads/vd;->N:Lcom/google/android/gms/internal/ads/vd;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eI;->E:Lcom/google/android/gms/internal/ads/pq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eI;->D:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/pq;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/eI;->G:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eI;->H:Lcom/google/android/gms/internal/ads/vd;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/internal/ads/vd;->K:Lcom/google/android/gms/internal/ads/vd;

    if-ne v1, v2, :cond_1

    const-string v1, "/Rewarded"

    goto :goto_0

    :cond_1
    const-string v1, "/Interstitial"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/eI;->G:Ljava/lang/String;

    return-void
.end method

.method public final q(Lcom/google/android/gms/internal/ads/bp;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/eI;->E:Lcom/google/android/gms/internal/ads/pq;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/eI;->D:Landroid/content/Context;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/pq;->p(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eI;->E:Lcom/google/android/gms/internal/ads/pq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eI;->D:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/pq;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/eI;->C:Lcom/google/android/gms/internal/ads/lq;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/lq;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/bp;->c()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/bp;->b()I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/pq;->l(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "Remote Exception to get reward item."

    invoke-static {p2, p1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
