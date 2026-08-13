.class public final Lcom/google/android/gms/internal/ads/Am;
.super Lcom/google/android/gms/internal/ads/jm;
.source "SourceFile"


# instance fields
.field private final C:Ly3/r;


# direct methods
.method public constructor <init>(Ly3/r;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/jm;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    return-void
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->p()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final C()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->s()V

    return-void
.end method

.method public final D5(LX3/a;)V
    .locals 1

    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0, p1}, Ly3/r;->F(Landroid/view/View;)V

    return-void
.end method

.method public final P1(LX3/a;)V
    .locals 1

    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0, p1}, Ly3/r;->q(Landroid/view/View;)V

    return-void
.end method

.method public final Y()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->m()Z

    move-result v0

    return v0
.end method

.method public final d()D
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->o()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->o()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    return-wide v0
.end method

.method public final e()F
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->k()F

    move-result v0

    return v0
.end method

.method public final g()F
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->f()F

    move-result v0

    return v0
.end method

.method public final h()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->g()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final h0()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->l()Z

    move-result v0

    return v0
.end method

.method public final i()F
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->e()F

    move-result v0

    return v0
.end method

.method public final j()Ls3/Y0;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->H()Lk3/w;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->H()Lk3/w;

    move-result-object v0

    invoke-virtual {v0}, Lk3/w;->b()Ls3/Y0;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final k()Lcom/google/android/gms/internal/ads/hh;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final l()Lcom/google/android/gms/internal/ads/oh;
    .locals 9

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->i()Ln3/d;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v8, Lcom/google/android/gms/internal/ads/bh;

    invoke-virtual {v0}, Ln3/d;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0}, Ln3/d;->c()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v0}, Ln3/d;->b()D

    move-result-wide v4

    invoke-virtual {v0}, Ln3/d;->e()I

    move-result v6

    invoke-virtual {v0}, Ln3/d;->d()I

    move-result v7

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/bh;-><init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;DII)V

    return-object v8

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final m()LX3/a;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->a()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    return-object v0
.end method

.method public final n()LX3/a;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->G()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    return-object v0
.end method

.method public final p()LX3/a;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->I()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    return-object v0
.end method

.method public final p3(LX3/a;LX3/a;LX3/a;)V
    .locals 1

    invoke-static {p2}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/HashMap;

    invoke-static {p3}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/HashMap;

    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0, p1, p2, p3}, Ly3/r;->E(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public final q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v()Ljava/util/List;
    .locals 11

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->j()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln3/d;

    new-instance v10, Lcom/google/android/gms/internal/ads/bh;

    invoke-virtual {v2}, Ln3/d;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v2}, Ln3/d;->c()Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v2}, Ln3/d;->b()D

    move-result-wide v6

    invoke-virtual {v2}, Ln3/d;->e()I

    move-result v8

    invoke-virtual {v2}, Ln3/d;->d()I

    move-result v9

    move-object v3, v10

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/bh;-><init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;DII)V

    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    :goto_1
    return-object v1
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Am;->C:Ly3/r;

    invoke-virtual {v0}, Ly3/r;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
