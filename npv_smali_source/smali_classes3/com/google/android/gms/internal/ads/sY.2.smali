.class public final Lcom/google/android/gms/internal/ads/sY;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/lY;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/l70;

.field private final b:Lcom/google/android/gms/internal/ads/Su;

.field private final c:Landroid/content/Context;

.field private final d:Lcom/google/android/gms/internal/ads/iY;

.field private final e:Lcom/google/android/gms/internal/ads/T90;

.field private f:Lcom/google/android/gms/internal/ads/vA;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Su;Landroid/content/Context;Lcom/google/android/gms/internal/ads/iY;Lcom/google/android/gms/internal/ads/l70;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sY;->b:Lcom/google/android/gms/internal/ads/Su;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/sY;->c:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/sY;->d:Lcom/google/android/gms/internal/ads/iY;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/sY;->a:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Su;->F()Lcom/google/android/gms/internal/ads/T90;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sY;->e:Lcom/google/android/gms/internal/ads/T90;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/iY;->d()Lcom/google/android/gms/internal/ads/UX;

    move-result-object p1

    invoke-virtual {p4, p1}, Lcom/google/android/gms/internal/ads/l70;->R(Lcom/google/android/gms/internal/ads/UX;)Lcom/google/android/gms/internal/ads/l70;

    return-void
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/sY;)Lcom/google/android/gms/internal/ads/Su;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/sY;->b:Lcom/google/android/gms/internal/ads/Su;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/sY;)Lcom/google/android/gms/internal/ads/iY;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/sY;->d:Lcom/google/android/gms/internal/ads/iY;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/sY;)Lcom/google/android/gms/internal/ads/T90;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/sY;->e:Lcom/google/android/gms/internal/ads/T90;

    return-object p0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sY;->f:Lcom/google/android/gms/internal/ads/vA;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/vA;->f()Z

    move-result v0

    if-eqz v0, :cond_0

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

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sY;->c:Landroid/content/Context;

    invoke-static {v1}, Lv3/E0;->i(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p1, Ls3/X1;->U:Ls3/X;

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "Failed to load the ad because app ID is missing."

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sY;->b:Lcom/google/android/gms/internal/ads/Su;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Su;->d()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/nY;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/nY;-><init>(Lcom/google/android/gms/internal/ads/sY;)V

    :goto_0
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v2

    :cond_1
    :goto_1
    if-nez p2, :cond_2

    const-string p1, "Ad unit ID should not be null for NativeAdLoader."

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sY;->b:Lcom/google/android/gms/internal/ads/Su;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Su;->d()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/oY;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/oY;-><init>(Lcom/google/android/gms/internal/ads/sY;)V

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/sY;->c:Landroid/content/Context;

    iget-boolean v1, p1, Ls3/X1;->H:Z

    invoke-static {p2, v1}, Lcom/google/android/gms/internal/ads/L70;->a(Landroid/content/Context;Z)V

    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->O8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-boolean p2, p1, Ls3/X1;->H:Z

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/sY;->b:Lcom/google/android/gms/internal/ads/Su;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Su;->s()Lcom/google/android/gms/internal/ads/KP;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/KP;->p(Z)V

    :cond_3
    check-cast p3, Lcom/google/android/gms/internal/ads/mY;

    iget p2, p3, Lcom/google/android/gms/internal/ads/mY;->a:I

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p3

    invoke-interface {p3}, LV3/f;->a()J

    move-result-wide v3

    new-instance p3, Landroid/util/Pair;

    sget-object v1, Lcom/google/android/gms/internal/ads/MN;->D:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-direct {p3, v1, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/util/Pair;

    sget-object v4, Lcom/google/android/gms/internal/ads/MN;->E:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/util/Pair;

    aput-object p3, v3, v2

    aput-object v1, v3, v0

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/ON;->a([Landroid/util/Pair;)Landroid/os/Bundle;

    move-result-object p3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sY;->a:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/l70;->h(Ls3/X1;)Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/ads/l70;->a(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/l70;->c(I)Lcom/google/android/gms/internal/ads/l70;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/sY;->c:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/l70;->j()Lcom/google/android/gms/internal/ads/n70;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/P90;->f(Lcom/google/android/gms/internal/ads/n70;)I

    move-result v1

    const/16 v2, 0x8

    invoke-static {p2, v1, v2, p1}, Lcom/google/android/gms/internal/ads/D90;->b(Landroid/content/Context;IILs3/X1;)Lcom/google/android/gms/internal/ads/E90;

    move-result-object v7

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/n70;->n:Ls3/i0;

    if-eqz p2, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sY;->d:Lcom/google/android/gms/internal/ads/iY;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/iY;->d()Lcom/google/android/gms/internal/ads/UX;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/UX;->C(Ls3/i0;)V

    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/sY;->b:Lcom/google/android/gms/internal/ads/Su;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Su;->o()Lcom/google/android/gms/internal/ads/mI;

    move-result-object p2

    new-instance v1, Lcom/google/android/gms/internal/ads/lC;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/lC;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sY;->c:Landroid/content/Context;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/lC;->f(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/lC;

    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/ads/lC;->k(Lcom/google/android/gms/internal/ads/n70;)Lcom/google/android/gms/internal/ads/lC;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lC;->l()Lcom/google/android/gms/internal/ads/nC;

    move-result-object p3

    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/mI;->p(Lcom/google/android/gms/internal/ads/nC;)Lcom/google/android/gms/internal/ads/mI;

    new-instance p3, Lcom/google/android/gms/internal/ads/CF;

    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/CF;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sY;->d:Lcom/google/android/gms/internal/ads/iY;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sY;->b:Lcom/google/android/gms/internal/ads/Su;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/iY;->d()Lcom/google/android/gms/internal/ads/UX;

    move-result-object v1

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Su;->d()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {p3, v1, v3}, Lcom/google/android/gms/internal/ads/CF;->n(Ll3/c;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/CF;->q()Lcom/google/android/gms/internal/ads/EF;

    move-result-object p3

    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/mI;->r(Lcom/google/android/gms/internal/ads/EF;)Lcom/google/android/gms/internal/ads/mI;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sY;->d:Lcom/google/android/gms/internal/ads/iY;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/iY;->c()Lcom/google/android/gms/internal/ads/iI;

    move-result-object p3

    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/mI;->c(Lcom/google/android/gms/internal/ads/iI;)Lcom/google/android/gms/internal/ads/mI;

    new-instance p3, Lcom/google/android/gms/internal/ads/Ny;

    const/4 v1, 0x0

    invoke-direct {p3, v1}, Lcom/google/android/gms/internal/ads/Ny;-><init>(Landroid/view/ViewGroup;)V

    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/mI;->f(Lcom/google/android/gms/internal/ads/Ny;)Lcom/google/android/gms/internal/ads/mI;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/mI;->i()Lcom/google/android/gms/internal/ads/nI;

    move-result-object v8

    sget-object p2, Lcom/google/android/gms/internal/ads/vg;->c:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/nI;->e()Lcom/google/android/gms/internal/ads/Q90;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/Q90;->i(I)Lcom/google/android/gms/internal/ads/Q90;

    iget-object p3, p1, Ls3/X1;->R:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/Q90;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Q90;

    iget-object p1, p1, Ls3/X1;->O:Landroid/os/Bundle;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/Q90;->f(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/Q90;

    move-object v6, p2

    goto :goto_2

    :cond_5
    move-object v6, v1

    :goto_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sY;->b:Lcom/google/android/gms/internal/ads/Su;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Su;->E()Lcom/google/android/gms/internal/ads/N70;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/N70;->c(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sY;->b:Lcom/google/android/gms/internal/ads/Su;

    new-instance p2, Lcom/google/android/gms/internal/ads/vA;

    invoke-static {}, Lcom/google/android/gms/internal/ads/O80;->c()Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object p3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Su;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/nI;->a()Lcom/google/android/gms/internal/ads/LA;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/LA;->i()LP4/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/LA;->h(LP4/d;)LP4/d;

    move-result-object v1

    invoke-direct {p2, p3, p1, v1}, Lcom/google/android/gms/internal/ads/vA;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;LP4/d;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/sY;->f:Lcom/google/android/gms/internal/ads/vA;

    new-instance p1, Lcom/google/android/gms/internal/ads/rY;

    move-object v3, p1

    move-object v4, p0

    move-object v5, p4

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/rY;-><init>(Lcom/google/android/gms/internal/ads/sY;Lcom/google/android/gms/internal/ads/kY;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;Lcom/google/android/gms/internal/ads/nI;)V

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/vA;->e(Lcom/google/android/gms/internal/ads/Jk0;)V

    return v0
.end method

.method final synthetic f()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sY;->d:Lcom/google/android/gms/internal/ads/iY;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/iY;->a()Lcom/google/android/gms/internal/ads/HC;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/HC;->u0(Ls3/W0;)V

    return-void
.end method

.method final synthetic g()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sY;->d:Lcom/google/android/gms/internal/ads/iY;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/iY;->a()Lcom/google/android/gms/internal/ads/HC;

    move-result-object v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/HC;->u0(Ls3/W0;)V

    return-void
.end method
