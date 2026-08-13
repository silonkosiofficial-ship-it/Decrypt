.class final Lcom/google/android/gms/internal/ads/x70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/Ot;

.field final synthetic b:Lcom/google/android/gms/internal/ads/Lx;

.field final synthetic c:Lcom/google/android/gms/internal/ads/La0;

.field final synthetic d:Lcom/google/android/gms/internal/ads/iT;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/Lx;Lcom/google/android/gms/internal/ads/La0;Lcom/google/android/gms/internal/ads/iT;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/x70;->a:Lcom/google/android/gms/internal/ads/Ot;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/x70;->b:Lcom/google/android/gms/internal/ads/Lx;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/x70;->c:Lcom/google/android/gms/internal/ads/La0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/x70;->d:Lcom/google/android/gms/internal/ads/iT;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 9

    .prologue
    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/x70;->a:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->Q()Lcom/google/android/gms/internal/ads/R60;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/R60;->i0:Z

    if-nez v0, :cond_1

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/R60;->x0:Lw3/w;

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->U9:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x70;->b:Lcom/google/android/gms/internal/ads/Lx;

    if-eqz v0, :cond_0

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/Lx;->j(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x70;->b:Lcom/google/android/gms/internal/ads/Lx;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/x70;->c:Lcom/google/android/gms/internal/ads/La0;

    invoke-static {}, Ls3/y;->e()Ljava/util/Random;

    move-result-object v2

    invoke-virtual {v0, v4, v1, v2, p1}, Lcom/google/android/gms/internal/ads/Lx;->i(Ljava/lang/String;Lcom/google/android/gms/internal/ads/La0;Ljava/util/Random;Lw3/w;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x70;->c:Lcom/google/android/gms/internal/ads/La0;

    const/4 v1, 0x0

    invoke-virtual {v0, v4, p1, v1}, Lcom/google/android/gms/internal/ads/La0;->d(Ljava/lang/String;Lw3/w;Lcom/google/android/gms/internal/ads/Q90;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x70;->a:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->h0()Lcom/google/android/gms/internal/ads/U60;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Common configuration cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const-string v0, "BufferingGmsgHandlers.getBufferingClickGmsgHandler"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void

    :cond_2
    new-instance v6, Lcom/google/android/gms/internal/ads/kT;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v1

    invoke-interface {v1}, LV3/f;->a()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/x70;->a:Lcom/google/android/gms/internal/ads/Ot;

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v5

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/Ot;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/Uq;->a(Landroid/content/Context;)Z

    move-result v3

    sget-object v5, Lcom/google/android/gms/internal/ads/Af;->d6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v7

    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v5, :cond_3

    if-eqz p1, :cond_3

    iget-boolean v5, p1, Lcom/google/android/gms/internal/ads/R60;->S:Z

    if-eqz v5, :cond_3

    move v5, v7

    goto :goto_0

    :cond_3
    move v5, v8

    :goto_0
    if-eqz p1, :cond_4

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/R60;->d0:Lcom/google/android/gms/internal/ads/Sn;

    if-eqz p1, :cond_4

    move v8, v7

    :cond_4
    const/4 p1, 0x2

    if-nez v3, :cond_5

    if-nez v5, :cond_5

    if-eqz v8, :cond_6

    :cond_5
    move v5, p1

    goto :goto_1

    :cond_6
    move v5, v7

    :goto_1
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/U60;->b:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/kT;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/x70;->d:Lcom/google/android/gms/internal/ads/iT;

    invoke-virtual {p1, v6}, Lcom/google/android/gms/internal/ads/iT;->i(Lcom/google/android/gms/internal/ads/kT;)V

    return-void
.end method
