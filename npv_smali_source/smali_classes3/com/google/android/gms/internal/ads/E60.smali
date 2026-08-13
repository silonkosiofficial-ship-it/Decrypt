.class public final Lcom/google/android/gms/internal/ads/E60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/lY;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lcom/google/android/gms/internal/ads/Su;

.field private final d:Lcom/google/android/gms/internal/ads/t60;

.field private final e:Lcom/google/android/gms/internal/ads/F50;

.field private final f:Lcom/google/android/gms/internal/ads/f70;

.field private final g:Lcom/google/android/gms/internal/ads/T90;

.field private final h:Lcom/google/android/gms/internal/ads/l70;

.field private i:LP4/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/Su;Lcom/google/android/gms/internal/ads/F50;Lcom/google/android/gms/internal/ads/t60;Lcom/google/android/gms/internal/ads/l70;Lcom/google/android/gms/internal/ads/f70;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/E60;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/E60;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/E60;->c:Lcom/google/android/gms/internal/ads/Su;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/E60;->e:Lcom/google/android/gms/internal/ads/F50;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/E60;->d:Lcom/google/android/gms/internal/ads/t60;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/E60;->h:Lcom/google/android/gms/internal/ads/l70;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/E60;->f:Lcom/google/android/gms/internal/ads/f70;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/Su;->F()Lcom/google/android/gms/internal/ads/T90;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/E60;->g:Lcom/google/android/gms/internal/ads/T90;

    return-void
.end method

.method public static synthetic c(Lcom/google/android/gms/internal/ads/E60;Lcom/google/android/gms/internal/ads/D50;)Lcom/google/android/gms/internal/ads/jM;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/E60;->k(Lcom/google/android/gms/internal/ads/D50;)Lcom/google/android/gms/internal/ads/jM;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/E60;Lcom/google/android/gms/internal/ads/D50;)Lcom/google/android/gms/internal/ads/jM;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/E60;->k(Lcom/google/android/gms/internal/ads/D50;)Lcom/google/android/gms/internal/ads/jM;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/E60;)Lcom/google/android/gms/internal/ads/F50;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/E60;->e:Lcom/google/android/gms/internal/ads/F50;

    return-object p0
.end method

.method static bridge synthetic f(Lcom/google/android/gms/internal/ads/E60;)Lcom/google/android/gms/internal/ads/t60;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/E60;->d:Lcom/google/android/gms/internal/ads/t60;

    return-object p0
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/E60;)Lcom/google/android/gms/internal/ads/T90;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/E60;->g:Lcom/google/android/gms/internal/ads/T90;

    return-object p0
.end method

.method static bridge synthetic h(Lcom/google/android/gms/internal/ads/E60;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/E60;->b:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method private final k(Lcom/google/android/gms/internal/ads/D50;)Lcom/google/android/gms/internal/ads/jM;
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/B60;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/E60;->c:Lcom/google/android/gms/internal/ads/Su;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Su;->p()Lcom/google/android/gms/internal/ads/jM;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/lC;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/lC;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/E60;->a:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/lC;->f(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/lC;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/B60;->a:Lcom/google/android/gms/internal/ads/n70;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/lC;->k(Lcom/google/android/gms/internal/ads/n70;)Lcom/google/android/gms/internal/ads/lC;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/E60;->f:Lcom/google/android/gms/internal/ads/f70;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/lC;->j(Lcom/google/android/gms/internal/ads/f70;)Lcom/google/android/gms/internal/ads/lC;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lC;->l()Lcom/google/android/gms/internal/ads/nC;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/jM;->a(Lcom/google/android/gms/internal/ads/nC;)Lcom/google/android/gms/internal/ads/jM;

    new-instance p1, Lcom/google/android/gms/internal/ads/CF;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/CF;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/CF;->q()Lcom/google/android/gms/internal/ads/EF;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/jM;->b(Lcom/google/android/gms/internal/ads/EF;)Lcom/google/android/gms/internal/ads/jM;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final b(Ls3/X1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/jY;Lcom/google/android/gms/internal/ads/kY;)Z
    .locals 10

    .prologue
    const/4 v0, 0x1

    new-instance v1, Lcom/google/android/gms/internal/ads/jp;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/ads/jp;-><init>(Ls3/X1;Ljava/lang/String;)V

    check-cast p3, Lcom/google/android/gms/internal/ads/v60;

    iget-object p1, v1, Lcom/google/android/gms/internal/ads/jp;->D:Ljava/lang/String;

    const/4 p2, 0x0

    if-nez p1, :cond_0

    const-string p1, "Ad unit ID should not be null for rewarded video ad."

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/E60;->b:Ljava/util/concurrent/Executor;

    new-instance p3, Lcom/google/android/gms/internal/ads/w60;

    invoke-direct {p3, p0}, Lcom/google/android/gms/internal/ads/w60;-><init>(Lcom/google/android/gms/internal/ads/E60;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    move v0, p2

    goto/16 :goto_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/E60;->i:LP4/d;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/ads/vg;->c:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 p3, 0x5

    const/4 v2, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/E60;->e:Lcom/google/android/gms/internal/ads/F50;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/F50;->f()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/F50;->f()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/kM;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/jC;->g()Lcom/google/android/gms/internal/ads/Q90;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/Q90;->i(I)Lcom/google/android/gms/internal/ads/Q90;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/jp;->C:Ls3/X1;

    iget-object v3, v3, Ls3/X1;->R:Ljava/lang/String;

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/Q90;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Q90;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/jp;->C:Ls3/X1;

    iget-object v3, v3, Ls3/X1;->O:Landroid/os/Bundle;

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/Q90;->f(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/Q90;

    move-object v7, p1

    goto :goto_1

    :cond_2
    move-object v7, v2

    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/E60;->a:Landroid/content/Context;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/jp;->C:Ls3/X1;

    iget-boolean v3, v3, Ls3/X1;->H:Z

    invoke-static {p1, v3}, Lcom/google/android/gms/internal/ads/L70;->a(Landroid/content/Context;Z)V

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->O8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, v1, Lcom/google/android/gms/internal/ads/jp;->C:Ls3/X1;

    iget-boolean p1, p1, Ls3/X1;->H:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/E60;->c:Lcom/google/android/gms/internal/ads/Su;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Su;->s()Lcom/google/android/gms/internal/ads/KP;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/KP;->p(Z)V

    :cond_3
    new-instance p1, Landroid/util/Pair;

    sget-object v3, Lcom/google/android/gms/internal/ads/MN;->D:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/jp;->C:Ls3/X1;

    iget-wide v4, v4, Ls3/X1;->b0:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-direct {p1, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

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

    aput-object p1, v4, p2

    aput-object v3, v4, v0

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/ON;->a([Landroid/util/Pair;)Landroid/os/Bundle;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/E60;->h:Lcom/google/android/gms/internal/ads/l70;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/jp;->D:Ljava/lang/String;

    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/l70;->P(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/l70;

    invoke-static {}, Ls3/c2;->w()Ls3/c2;

    move-result-object v3

    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/l70;->O(Ls3/c2;)Lcom/google/android/gms/internal/ads/l70;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/jp;->C:Ls3/X1;

    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/l70;->h(Ls3/X1;)Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/l70;->a(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/l70;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/E60;->a:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/l70;->j()Lcom/google/android/gms/internal/ads/n70;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/P90;->f(Lcom/google/android/gms/internal/ads/n70;)I

    move-result v3

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/jp;->C:Ls3/X1;

    invoke-static {p1, v3, p3, v1}, Lcom/google/android/gms/internal/ads/D90;->b(Landroid/content/Context;IILs3/X1;)Lcom/google/android/gms/internal/ads/E90;

    move-result-object v8

    new-instance v9, Lcom/google/android/gms/internal/ads/B60;

    invoke-direct {v9, v2}, Lcom/google/android/gms/internal/ads/B60;-><init>(Lcom/google/android/gms/internal/ads/D60;)V

    iput-object p2, v9, Lcom/google/android/gms/internal/ads/B60;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/E60;->e:Lcom/google/android/gms/internal/ads/F50;

    new-instance p2, Lcom/google/android/gms/internal/ads/G50;

    invoke-direct {p2, v9, v2}, Lcom/google/android/gms/internal/ads/G50;-><init>(Lcom/google/android/gms/internal/ads/D50;Lcom/google/android/gms/internal/ads/Po;)V

    new-instance p3, Lcom/google/android/gms/internal/ads/x60;

    invoke-direct {p3, p0}, Lcom/google/android/gms/internal/ads/x60;-><init>(Lcom/google/android/gms/internal/ads/E60;)V

    invoke-interface {p1, p2, p3, v2}, Lcom/google/android/gms/internal/ads/F50;->a(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Ljava/lang/Object;)LP4/d;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/E60;->i:LP4/d;

    new-instance p2, Lcom/google/android/gms/internal/ads/A60;

    move-object v4, p2

    move-object v5, p0

    move-object v6, p4

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/A60;-><init>(Lcom/google/android/gms/internal/ads/E60;Lcom/google/android/gms/internal/ads/kY;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;Lcom/google/android/gms/internal/ads/B60;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/E60;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    :goto_2
    return v0
.end method

.method final synthetic i()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/E60;->d:Lcom/google/android/gms/internal/ads/t60;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/t60;->u0(Ls3/W0;)V

    return-void
.end method

.method final j(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/E60;->h:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/l70;->L()Lcom/google/android/gms/internal/ads/X60;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/X60;->a(I)Lcom/google/android/gms/internal/ads/X60;

    return-void
.end method
