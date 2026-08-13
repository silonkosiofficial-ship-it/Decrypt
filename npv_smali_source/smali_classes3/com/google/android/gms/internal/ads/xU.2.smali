.class public final Lcom/google/android/gms/internal/ads/xU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/VT;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/vz;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/BM;

.field private final d:Lcom/google/android/gms/internal/ads/n70;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Lcom/google/android/gms/internal/ads/pg0;

.field private final g:Lcom/google/android/gms/internal/ads/YN;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/vz;Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/BM;Lcom/google/android/gms/internal/ads/n70;Lcom/google/android/gms/internal/ads/pg0;Lcom/google/android/gms/internal/ads/YN;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/xU;->b:Landroid/content/Context;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xU;->a:Lcom/google/android/gms/internal/ads/vz;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/xU;->e:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/xU;->c:Lcom/google/android/gms/internal/ads/BM;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/xU;->d:Lcom/google/android/gms/internal/ads/n70;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/xU;->f:Lcom/google/android/gms/internal/ads/pg0;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/xU;->g:Lcom/google/android/gms/internal/ads/YN;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)Z
    .locals 0

    .prologue
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/W60;->a:Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)LP4/d;
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/wU;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/wU;-><init>(Lcom/google/android/gms/internal/ads/xU;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/xU;->e:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/Object;)LP4/d;
    .locals 7

    .prologue
    sget-object p3, Lcom/google/android/gms/internal/ads/Af;->m2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xU;->g:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/MN;->X:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v2

    invoke-interface {v2}, LV3/f;->a()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xU;->b:Landroid/content/Context;

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/R60;->u:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/t70;->a(Landroid/content/Context;Ljava/util/List;)Ls3/c2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/xU;->c:Lcom/google/android/gms/internal/ads/BM;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    invoke-virtual {v1, v0, p2, v2}, Lcom/google/android/gms/internal/ads/BM;->a(Ls3/c2;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v1

    iget-boolean v2, p2, Lcom/google/android/gms/internal/ads/R60;->W:Z

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/Ot;->M0(Z)V

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->J7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-boolean v2, p2, Lcom/google/android/gms/internal/ads/R60;->g0:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/xU;->b:Landroid/content/Context;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v3

    invoke-static {v2, v3, p2}, Lcom/google/android/gms/internal/ads/Rz;->a(Landroid/content/Context;Landroid/view/View;Lcom/google/android/gms/internal/ads/R60;)Lcom/google/android/gms/internal/ads/Rz;

    move-result-object v2

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/xU;->b:Landroid/content/Context;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/xU;->f:Lcom/google/android/gms/internal/ads/pg0;

    new-instance v5, Lcom/google/android/gms/internal/ads/EM;

    invoke-interface {v4, p2}, Lcom/google/android/gms/internal/ads/pg0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lv3/v;

    invoke-direct {v5, v2, v3, v4}, Lcom/google/android/gms/internal/ads/EM;-><init>(Landroid/content/Context;Landroid/view/View;Lv3/v;)V

    move-object v2, v5

    :goto_0
    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, p3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/xU;->g:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/ads/MN;->Y:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v5

    invoke-interface {v5}, LV3/f;->a()J

    move-result-wide v5

    invoke-virtual {v3, v4, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_2
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/xU;->a:Lcom/google/android/gms/internal/ads/vz;

    new-instance v4, Lcom/google/android/gms/internal/ads/wA;

    const/4 v5, 0x0

    invoke-direct {v4, p1, p2, v5}, Lcom/google/android/gms/internal/ads/wA;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/Xy;

    new-instance v6, Lcom/google/android/gms/internal/ads/rU;

    invoke-direct {v6, v1}, Lcom/google/android/gms/internal/ads/rU;-><init>(Lcom/google/android/gms/internal/ads/Ot;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/t70;->b(Ls3/c2;)Lcom/google/android/gms/internal/ads/S60;

    move-result-object v0

    invoke-direct {p1, v2, v1, v6, v0}, Lcom/google/android/gms/internal/ads/Xy;-><init>(Landroid/view/View;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/dA;Lcom/google/android/gms/internal/ads/S60;)V

    invoke-virtual {v3, v4, p1}, Lcom/google/android/gms/internal/ads/vz;->a(Lcom/google/android/gms/internal/ads/wA;Lcom/google/android/gms/internal/ads/Xy;)Lcom/google/android/gms/internal/ads/Ry;

    move-result-object p1

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/xU;->g:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object p3

    sget-object v0, Lcom/google/android/gms/internal/ads/MN;->Z:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v2

    invoke-interface {v2}, LV3/f;->a()J

    move-result-wide v2

    invoke-virtual {p3, v0, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ry;->j()Lcom/google/android/gms/internal/ads/AM;

    move-result-object p3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xU;->g:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p3, v1, v2, v5, v0}, Lcom/google/android/gms/internal/ads/AM;->i(Lcom/google/android/gms/internal/ads/Ot;ZLcom/google/android/gms/internal/ads/jj;Landroid/os/Bundle;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hA;->b()Lcom/google/android/gms/internal/ads/XC;

    move-result-object p3

    new-instance v0, Lcom/google/android/gms/internal/ads/sU;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/sU;-><init>(Lcom/google/android/gms/internal/ads/Ot;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-virtual {p3, v0, v2}, Lcom/google/android/gms/internal/ads/BF;->F0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object p3, p2, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/W60;->a:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->f5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ry;->k()Lcom/google/android/gms/internal/ads/OT;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/OT;->e(Z)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Du;->a(Lcom/google/android/gms/internal/ads/R60;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/google/android/gms/internal/ads/Du;->b(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ry;->j()Lcom/google/android/gms/internal/ads/AM;

    iget-object v0, p2, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/W60;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/xU;->g:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v3

    invoke-static {v1, v0, p3, v3}, Lcom/google/android/gms/internal/ads/AM;->j(Lcom/google/android/gms/internal/ads/Ot;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)LP4/d;

    move-result-object p3

    iget-boolean p2, p2, Lcom/google/android/gms/internal/ads/R60;->M:Z

    if-eqz p2, :cond_5

    new-instance p2, Lcom/google/android/gms/internal/ads/tU;

    invoke-direct {p2, v1}, Lcom/google/android/gms/internal/ads/tU;-><init>(Lcom/google/android/gms/internal/ads/Ot;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xU;->e:Ljava/util/concurrent/Executor;

    invoke-interface {p3, p2, v0}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_5
    new-instance p2, Lcom/google/android/gms/internal/ads/uU;

    invoke-direct {p2, p0, v1}, Lcom/google/android/gms/internal/ads/uU;-><init>(Lcom/google/android/gms/internal/ads/xU;Lcom/google/android/gms/internal/ads/Ot;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xU;->e:Ljava/util/concurrent/Executor;

    invoke-interface {p3, p2, v0}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/vU;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/vU;-><init>(Lcom/google/android/gms/internal/ads/Ry;)V

    invoke-static {p3, p2, v2}, Lcom/google/android/gms/internal/ads/Nk0;->m(LP4/d;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic d(Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 2

    .prologue
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->I0()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xU;->d:Lcom/google/android/gms/internal/ads/n70;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->s()Lcom/google/android/gms/internal/ads/tu;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->a:Ls3/Q1;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/tu;->s6(Ls3/Q1;)V

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->r1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->onPause()V

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/Ot;->N0(Z)V

    :cond_1
    return-void
.end method
