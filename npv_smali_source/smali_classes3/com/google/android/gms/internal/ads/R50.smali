.class public final Lcom/google/android/gms/internal/ads/R50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/lY;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lcom/google/android/gms/internal/ads/Su;

.field private final d:Lcom/google/android/gms/internal/ads/UX;

.field private final e:Lcom/google/android/gms/internal/ads/t60;

.field private f:Lcom/google/android/gms/internal/ads/Wf;

.field private final g:Lcom/google/android/gms/internal/ads/T90;

.field private final h:Lcom/google/android/gms/internal/ads/l70;

.field private i:LP4/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/Su;Lcom/google/android/gms/internal/ads/UX;Lcom/google/android/gms/internal/ads/t60;Lcom/google/android/gms/internal/ads/l70;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/R50;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/R50;->c:Lcom/google/android/gms/internal/ads/Su;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/R50;->d:Lcom/google/android/gms/internal/ads/UX;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/R50;->h:Lcom/google/android/gms/internal/ads/l70;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/R50;->e:Lcom/google/android/gms/internal/ads/t60;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/Su;->F()Lcom/google/android/gms/internal/ads/T90;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/R50;->g:Lcom/google/android/gms/internal/ads/T90;

    return-void
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/R50;)Lcom/google/android/gms/internal/ads/UX;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/R50;->d:Lcom/google/android/gms/internal/ads/UX;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/R50;)Lcom/google/android/gms/internal/ads/t60;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/R50;->e:Lcom/google/android/gms/internal/ads/t60;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/R50;)Lcom/google/android/gms/internal/ads/T90;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/R50;->g:Lcom/google/android/gms/internal/ads/T90;

    return-object p0
.end method

.method static bridge synthetic f(Lcom/google/android/gms/internal/ads/R50;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/R50;LP4/d;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/R50;->i:LP4/d;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/R50;->i:LP4/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b(Ls3/X1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/jY;Lcom/google/android/gms/internal/ads/kY;)Z
    .locals 9

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    const-string p1, "Ad unit ID should not be null for interstitial ad."

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    new-instance p2, Lcom/google/android/gms/internal/ads/L50;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/L50;-><init>(Lcom/google/android/gms/internal/ads/R50;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/R50;->a()Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_1
    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->O8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v2, p1, Ls3/X1;->H:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/R50;->c:Lcom/google/android/gms/internal/ads/Su;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Su;->s()Lcom/google/android/gms/internal/ads/KP;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/KP;->p(Z)V

    :cond_2
    check-cast p3, Lcom/google/android/gms/internal/ads/K50;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/K50;->a:Ls3/c2;

    new-instance v2, Landroid/util/Pair;

    sget-object v3, Lcom/google/android/gms/internal/ads/MN;->D:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v3

    iget-wide v4, p1, Ls3/X1;->b0:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/util/Pair;

    sget-object v4, Lcom/google/android/gms/internal/ads/MN;->E:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v5

    invoke-interface {v5}, LV3/f;->a()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v4, 0x2

    new-array v4, v4, [Landroid/util/Pair;

    aput-object v2, v4, v1

    aput-object v3, v4, v0

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/ON;->a([Landroid/util/Pair;)Landroid/os/Bundle;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/R50;->h:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/l70;->P(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v2, p3}, Lcom/google/android/gms/internal/ads/l70;->O(Ls3/c2;)Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/l70;->h(Ls3/X1;)Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/l70;->a(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/l70;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/R50;->a:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/l70;->j()Lcom/google/android/gms/internal/ads/n70;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/P90;->f(Lcom/google/android/gms/internal/ads/n70;)I

    move-result v1

    const/4 v2, 0x4

    invoke-static {p2, v1, v2, p1}, Lcom/google/android/gms/internal/ads/D90;->b(Landroid/content/Context;IILs3/X1;)Lcom/google/android/gms/internal/ads/E90;

    move-result-object v7

    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->c8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/R50;->c:Lcom/google/android/gms/internal/ads/Su;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Su;->n()Lcom/google/android/gms/internal/ads/PH;

    move-result-object p2

    new-instance v1, Lcom/google/android/gms/internal/ads/lC;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/lC;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/R50;->a:Landroid/content/Context;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/lC;->f(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/lC;

    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/ads/lC;->k(Lcom/google/android/gms/internal/ads/n70;)Lcom/google/android/gms/internal/ads/lC;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lC;->l()Lcom/google/android/gms/internal/ads/nC;

    move-result-object p3

    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/PH;->s(Lcom/google/android/gms/internal/ads/nC;)Lcom/google/android/gms/internal/ads/PH;

    new-instance p3, Lcom/google/android/gms/internal/ads/CF;

    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/CF;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/R50;->d:Lcom/google/android/gms/internal/ads/UX;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p3, v1, v3}, Lcom/google/android/gms/internal/ads/CF;->m(Lcom/google/android/gms/internal/ads/eE;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/R50;->d:Lcom/google/android/gms/internal/ads/UX;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p3, v1, v3}, Lcom/google/android/gms/internal/ads/CF;->n(Ll3/c;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/CF;->q()Lcom/google/android/gms/internal/ads/EF;

    move-result-object p3

    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/PH;->t(Lcom/google/android/gms/internal/ads/EF;)Lcom/google/android/gms/internal/ads/PH;

    new-instance p3, Lcom/google/android/gms/internal/ads/bX;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/R50;->f:Lcom/google/android/gms/internal/ads/Wf;

    invoke-direct {p3, v1}, Lcom/google/android/gms/internal/ads/bX;-><init>(Lcom/google/android/gms/internal/ads/Wf;)V

    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/PH;->o(Lcom/google/android/gms/internal/ads/bX;)Lcom/google/android/gms/internal/ads/PH;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/PH;->e()Lcom/google/android/gms/internal/ads/QH;

    move-result-object p2

    :goto_0
    move-object v8, p2

    goto/16 :goto_1

    :cond_3
    new-instance p2, Lcom/google/android/gms/internal/ads/CF;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/CF;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/R50;->e:Lcom/google/android/gms/internal/ads/t60;

    if-eqz v1, :cond_4

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v1, v3}, Lcom/google/android/gms/internal/ads/CF;->h(Lcom/google/android/gms/internal/ads/EC;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/R50;->e:Lcom/google/android/gms/internal/ads/t60;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v1, v3}, Lcom/google/android/gms/internal/ads/CF;->i(Lcom/google/android/gms/internal/ads/uD;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/R50;->e:Lcom/google/android/gms/internal/ads/t60;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v1, v3}, Lcom/google/android/gms/internal/ads/CF;->e(Lcom/google/android/gms/internal/ads/HC;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/R50;->c:Lcom/google/android/gms/internal/ads/Su;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Su;->n()Lcom/google/android/gms/internal/ads/PH;

    move-result-object v1

    new-instance v3, Lcom/google/android/gms/internal/ads/lC;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/lC;-><init>()V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/R50;->a:Landroid/content/Context;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/lC;->f(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/lC;

    invoke-virtual {v3, p3}, Lcom/google/android/gms/internal/ads/lC;->k(Lcom/google/android/gms/internal/ads/n70;)Lcom/google/android/gms/internal/ads/lC;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/lC;->l()Lcom/google/android/gms/internal/ads/nC;

    move-result-object p3

    invoke-interface {v1, p3}, Lcom/google/android/gms/internal/ads/PH;->s(Lcom/google/android/gms/internal/ads/nC;)Lcom/google/android/gms/internal/ads/PH;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/R50;->d:Lcom/google/android/gms/internal/ads/UX;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, p3, v3}, Lcom/google/android/gms/internal/ads/CF;->m(Lcom/google/android/gms/internal/ads/eE;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/R50;->d:Lcom/google/android/gms/internal/ads/UX;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, p3, v3}, Lcom/google/android/gms/internal/ads/CF;->h(Lcom/google/android/gms/internal/ads/EC;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/R50;->d:Lcom/google/android/gms/internal/ads/UX;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, p3, v3}, Lcom/google/android/gms/internal/ads/CF;->i(Lcom/google/android/gms/internal/ads/uD;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/R50;->d:Lcom/google/android/gms/internal/ads/UX;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, p3, v3}, Lcom/google/android/gms/internal/ads/CF;->e(Lcom/google/android/gms/internal/ads/HC;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/R50;->d:Lcom/google/android/gms/internal/ads/UX;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, p3, v3}, Lcom/google/android/gms/internal/ads/CF;->d(Ls3/a;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/R50;->d:Lcom/google/android/gms/internal/ads/UX;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, p3, v3}, Lcom/google/android/gms/internal/ads/CF;->o(Lcom/google/android/gms/internal/ads/MG;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/R50;->d:Lcom/google/android/gms/internal/ads/UX;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, p3, v3}, Lcom/google/android/gms/internal/ads/CF;->n(Ll3/c;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/R50;->d:Lcom/google/android/gms/internal/ads/UX;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, p3, v3}, Lcom/google/android/gms/internal/ads/CF;->l(Lcom/google/android/gms/internal/ads/SD;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/R50;->d:Lcom/google/android/gms/internal/ads/UX;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, p3, v3}, Lcom/google/android/gms/internal/ads/CF;->f(Lcom/google/android/gms/internal/ads/VC;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/CF;->q()Lcom/google/android/gms/internal/ads/EF;

    move-result-object p2

    invoke-interface {v1, p2}, Lcom/google/android/gms/internal/ads/PH;->t(Lcom/google/android/gms/internal/ads/EF;)Lcom/google/android/gms/internal/ads/PH;

    new-instance p2, Lcom/google/android/gms/internal/ads/bX;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/R50;->f:Lcom/google/android/gms/internal/ads/Wf;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/bX;-><init>(Lcom/google/android/gms/internal/ads/Wf;)V

    invoke-interface {v1, p2}, Lcom/google/android/gms/internal/ads/PH;->o(Lcom/google/android/gms/internal/ads/bX;)Lcom/google/android/gms/internal/ads/PH;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/PH;->e()Lcom/google/android/gms/internal/ads/QH;

    move-result-object p2

    goto/16 :goto_0

    :goto_1
    sget-object p2, Lcom/google/android/gms/internal/ads/vg;->c:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/QH;->d()Lcom/google/android/gms/internal/ads/Q90;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/Q90;->i(I)Lcom/google/android/gms/internal/ads/Q90;

    iget-object p3, p1, Ls3/X1;->R:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/Q90;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Q90;

    iget-object p1, p1, Ls3/X1;->O:Landroid/os/Bundle;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/Q90;->f(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/Q90;

    move-object v6, p2

    goto :goto_2

    :cond_5
    const/4 p1, 0x0

    move-object v6, p1

    :goto_2
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/QH;->a()Lcom/google/android/gms/internal/ads/LA;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/LA;->i()LP4/d;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/LA;->h(LP4/d;)LP4/d;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/R50;->i:LP4/d;

    new-instance p2, Lcom/google/android/gms/internal/ads/Q50;

    move-object v3, p2

    move-object v4, p0

    move-object v5, p4

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/Q50;-><init>(Lcom/google/android/gms/internal/ads/R50;Lcom/google/android/gms/internal/ads/kY;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;Lcom/google/android/gms/internal/ads/QH;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/R50;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return v0
.end method

.method final synthetic h()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/R50;->d:Lcom/google/android/gms/internal/ads/UX;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/UX;->u0(Ls3/W0;)V

    return-void
.end method

.method public final i(Lcom/google/android/gms/internal/ads/Wf;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/R50;->f:Lcom/google/android/gms/internal/ads/Wf;

    return-void
.end method
