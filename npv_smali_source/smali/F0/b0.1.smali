.class public final LF0/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF0/b0$a;,
        LF0/b0$b;
    }
.end annotation


# instance fields
.field private final a:LF0/J;

.field private final b:LF0/x;

.field private c:LF0/d0;

.field private final d:Landroidx/compose/ui/d$c;

.field private e:Landroidx/compose/ui/d$c;

.field private f:LX/b;

.field private g:LX/b;

.field private h:LF0/b0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LF0/J;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0/b0;->a:LF0/J;

    new-instance v0, LF0/x;

    invoke-direct {v0, p1}, LF0/x;-><init>(LF0/J;)V

    iput-object v0, p0, LF0/b0;->b:LF0/x;

    iput-object v0, p0, LF0/b0;->c:LF0/d0;

    invoke-virtual {v0}, LF0/x;->h3()LF0/C0;

    move-result-object p1

    iput-object p1, p0, LF0/b0;->d:Landroidx/compose/ui/d$c;

    iput-object p1, p0, LF0/b0;->e:Landroidx/compose/ui/d$c;

    return-void
.end method

.method private final A(ILX/b;LX/b;Landroidx/compose/ui/d$c;Z)V
    .locals 6

    move-object v0, p0

    move-object v1, p4

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, LF0/b0;->j(Landroidx/compose/ui/d$c;ILX/b;LX/b;Z)LF0/b0$a;

    move-result-object p4

    invoke-virtual {p2}, LX/b;->t()I

    move-result p2

    sub-int/2addr p2, p1

    invoke-virtual {p3}, LX/b;->t()I

    move-result p3

    sub-int/2addr p3, p1

    invoke-static {p2, p3, p4}, LF0/Z;->e(IILF0/p;)V

    invoke-direct {p0}, LF0/b0;->B()V

    return-void
.end method

.method private final B()V
    .locals 3

    .prologue
    iget-object v0, p0, LF0/b0;->d:Landroidx/compose/ui/d$c;

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_0

    invoke-static {}, LF0/c0;->b()LF0/c0$a;

    move-result-object v2

    if-eq v0, v2, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroidx/compose/ui/d$c;->J1(I)V

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final D(Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;
    .locals 5

    .prologue
    invoke-static {}, LF0/c0;->b()LF0/c0$a;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-nez p1, :cond_1

    const-string p1, "trimChain called on already trimmed chain"

    invoke-static {p1}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    invoke-static {}, LF0/c0;->b()LF0/c0$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p1

    if-nez p1, :cond_2

    iget-object p1, p0, LF0/b0;->d:Landroidx/compose/ui/d$c;

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/compose/ui/d$c;->P1(Landroidx/compose/ui/d$c;)V

    invoke-static {}, LF0/c0;->b()LF0/c0$a;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroidx/compose/ui/d$c;->L1(Landroidx/compose/ui/d$c;)V

    invoke-static {}, LF0/c0;->b()LF0/c0$a;

    move-result-object v3

    const/4 v4, -0x1

    invoke-virtual {v3, v4}, Landroidx/compose/ui/d$c;->J1(I)V

    invoke-static {}, LF0/c0;->b()LF0/c0$a;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroidx/compose/ui/d$c;->S1(LF0/d0;)V

    invoke-static {}, LF0/c0;->b()LF0/c0$a;

    move-result-object v0

    if-eq p1, v0, :cond_3

    move v1, v2

    :cond_3
    if-nez v1, :cond_4

    const-string v0, "trimChain did not update the head"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_4
    return-object p1
.end method

.method private final F(Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$c;)V
    .locals 1

    .prologue
    instance-of p1, p1, LF0/W;

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    instance-of p1, p2, LF0/W;

    if-eqz p1, :cond_1

    check-cast p2, LF0/W;

    invoke-static {p2, p3}, LF0/c0;->c(LF0/W;Landroidx/compose/ui/d$c;)V

    invoke-virtual {p3}, Landroidx/compose/ui/d$c;->A1()Z

    move-result p1

    if-eqz p1, :cond_0

    :goto_0
    invoke-static {p3}, LF0/g0;->e(Landroidx/compose/ui/d$c;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p3, v0}, Landroidx/compose/ui/d$c;->Q1(Z)V

    goto :goto_1

    :cond_1
    instance-of p1, p3, LF0/c;

    if-eqz p1, :cond_2

    move-object p1, p3

    check-cast p1, LF0/c;

    invoke-virtual {p1, p2}, LF0/c;->X1(Landroidx/compose/ui/d$b;)V

    invoke-virtual {p3}, Landroidx/compose/ui/d$c;->A1()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :goto_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown Modifier.Node type"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic a(LF0/b0;Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;
    .locals 0

    invoke-direct {p0, p1, p2}, LF0/b0;->g(Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LF0/b0;Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;
    .locals 0

    invoke-direct {p0, p1}, LF0/b0;->h(Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LF0/b0;)I
    .locals 0

    invoke-direct {p0}, LF0/b0;->i()I

    move-result p0

    return p0
.end method

.method public static final synthetic d(LF0/b0;)LF0/b0$b;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static final synthetic e(LF0/b0;Landroidx/compose/ui/d$c;LF0/d0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LF0/b0;->v(Landroidx/compose/ui/d$c;LF0/d0;)V

    return-void
.end method

.method public static final synthetic f(LF0/b0;Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$c;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LF0/b0;->F(Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$c;)V

    return-void
.end method

.method private final g(Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;
    .locals 2

    .prologue
    instance-of v0, p1, LF0/W;

    if-eqz v0, :cond_0

    check-cast p1, LF0/W;

    invoke-virtual {p1}, LF0/W;->g()Landroidx/compose/ui/d$c;

    move-result-object p1

    invoke-static {p1}, LF0/g0;->h(Landroidx/compose/ui/d$c;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/compose/ui/d$c;->N1(I)V

    goto :goto_0

    :cond_0
    new-instance v0, LF0/c;

    invoke-direct {v0, p1}, LF0/c;-><init>(Landroidx/compose/ui/d$b;)V

    move-object p1, v0

    :goto_0
    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-nez v0, :cond_1

    const-string v0, "A ModifierNodeElement cannot return an already attached node from create() "

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1, v1}, Landroidx/compose/ui/d$c;->M1(Z)V

    invoke-direct {p0, p1, p2}, LF0/b0;->r(Landroidx/compose/ui/d$c;Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;

    move-result-object p1

    return-object p1
.end method

.method private final h(Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;
    .locals 1

    .prologue
    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, LF0/g0;->d(Landroidx/compose/ui/d$c;)V

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->I1()V

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->C1()V

    :cond_0
    invoke-direct {p0, p1}, LF0/b0;->w(Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;

    move-result-object p1

    return-object p1
.end method

.method private final i()I
    .locals 1

    iget-object v0, p0, LF0/b0;->e:Landroidx/compose/ui/d$c;

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->q1()I

    move-result v0

    return v0
.end method

.method private final j(Landroidx/compose/ui/d$c;ILX/b;LX/b;Z)LF0/b0$a;
    .locals 8

    .prologue
    iget-object v0, p0, LF0/b0;->h:LF0/b0$a;

    if-nez v0, :cond_0

    new-instance v0, LF0/b0$a;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v7}, LF0/b0$a;-><init>(LF0/b0;Landroidx/compose/ui/d$c;ILX/b;LX/b;Z)V

    iput-object v0, p0, LF0/b0;->h:LF0/b0$a;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LF0/b0$a;->g(Landroidx/compose/ui/d$c;)V

    invoke-virtual {v0, p2}, LF0/b0$a;->h(I)V

    invoke-virtual {v0, p3}, LF0/b0$a;->f(LX/b;)V

    invoke-virtual {v0, p4}, LF0/b0$a;->e(LX/b;)V

    invoke-virtual {v0, p5}, LF0/b0$a;->i(Z)V

    :goto_0
    return-object v0
.end method

.method private final r(Landroidx/compose/ui/d$c;Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;
    .locals 1

    .prologue
    invoke-virtual {p2}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/compose/ui/d$c;->P1(Landroidx/compose/ui/d$c;)V

    invoke-virtual {p1, v0}, Landroidx/compose/ui/d$c;->L1(Landroidx/compose/ui/d$c;)V

    :cond_0
    invoke-virtual {p2, p1}, Landroidx/compose/ui/d$c;->L1(Landroidx/compose/ui/d$c;)V

    invoke-virtual {p1, p2}, Landroidx/compose/ui/d$c;->P1(Landroidx/compose/ui/d$c;)V

    return-object p1
.end method

.method private final u()Landroidx/compose/ui/d$c;
    .locals 2

    .prologue
    iget-object v0, p0, LF0/b0;->e:Landroidx/compose/ui/d$c;

    invoke-static {}, LF0/c0;->b()LF0/c0$a;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "padChain called on already padded chain"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, LF0/b0;->e:Landroidx/compose/ui/d$c;

    invoke-static {}, LF0/c0;->b()LF0/c0$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/d$c;->P1(Landroidx/compose/ui/d$c;)V

    invoke-static {}, LF0/c0;->b()LF0/c0$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/compose/ui/d$c;->L1(Landroidx/compose/ui/d$c;)V

    invoke-static {}, LF0/c0;->b()LF0/c0$a;

    move-result-object v0

    return-object v0
.end method

.method private final v(Landroidx/compose/ui/d$c;LF0/d0;)V
    .locals 2

    .prologue
    :goto_0
    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {}, LF0/c0;->b()LF0/c0$a;

    move-result-object v0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, LF0/b0;->a:LF0/J;

    invoke-virtual {p1}, LF0/J;->o0()LF0/J;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LF0/J;->P()LF0/d0;

    move-result-object p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_1
    invoke-virtual {p2, p1}, LF0/d0;->T2(LF0/d0;)V

    iput-object p2, p0, LF0/b0;->c:LF0/d0;

    goto :goto_2

    :cond_1
    const/4 v0, 0x2

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1, p2}, Landroidx/compose/ui/d$c;->S1(LF0/d0;)V

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method private final w(Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;
    .locals 3

    .prologue
    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroidx/compose/ui/d$c;->P1(Landroidx/compose/ui/d$c;)V

    invoke-virtual {p1, v2}, Landroidx/compose/ui/d$c;->L1(Landroidx/compose/ui/d$c;)V

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Landroidx/compose/ui/d$c;->L1(Landroidx/compose/ui/d$c;)V

    invoke-virtual {p1, v2}, Landroidx/compose/ui/d$c;->P1(Landroidx/compose/ui/d$c;)V

    :cond_1
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v1
.end method


# virtual methods
.method public final C()V
    .locals 5

    .prologue
    iget-object v0, p0, LF0/b0;->b:LF0/x;

    iget-object v1, p0, LF0/b0;->d:Landroidx/compose/ui/d$c;

    :goto_0
    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, LF0/k;->d(Landroidx/compose/ui/d$c;)LF0/E;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->s1()LF0/d0;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->s1()LF0/d0;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    invoke-static {v3, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, LF0/F;

    invoke-virtual {v3}, LF0/F;->i3()LF0/E;

    move-result-object v4

    invoke-virtual {v3, v2}, LF0/F;->l3(LF0/E;)V

    if-eq v4, v1, :cond_1

    invoke-virtual {v3}, LF0/d0;->D2()V

    goto :goto_1

    :cond_0
    new-instance v3, LF0/F;

    iget-object v4, p0, LF0/b0;->a:LF0/J;

    invoke-direct {v3, v4, v2}, LF0/F;-><init>(LF0/J;LF0/E;)V

    invoke-virtual {v1, v3}, Landroidx/compose/ui/d$c;->S1(LF0/d0;)V

    :cond_1
    :goto_1
    invoke-virtual {v0, v3}, LF0/d0;->T2(LF0/d0;)V

    invoke-virtual {v3, v0}, LF0/d0;->S2(LF0/d0;)V

    move-object v0, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v0}, Landroidx/compose/ui/d$c;->S1(LF0/d0;)V

    goto :goto_0

    :cond_3
    iget-object v1, p0, LF0/b0;->a:LF0/J;

    invoke-virtual {v1}, LF0/J;->o0()LF0/J;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LF0/J;->P()LF0/d0;

    move-result-object v1

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v0, v1}, LF0/d0;->T2(LF0/d0;)V

    iput-object v0, p0, LF0/b0;->c:LF0/d0;

    return-void
.end method

.method public final E(Landroidx/compose/ui/d;)V
    .locals 12

    .prologue
    invoke-direct {p0}, LF0/b0;->u()Landroidx/compose/ui/d$c;

    move-result-object v6

    iget-object v7, p0, LF0/b0;->f:LX/b;

    const/4 v0, 0x0

    if-eqz v7, :cond_0

    invoke-virtual {v7}, LX/b;->t()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, LF0/b0;->g:LX/b;

    const/16 v3, 0x10

    if-nez v2, :cond_1

    new-instance v2, LX/b;

    new-array v4, v3, [Landroidx/compose/ui/d$b;

    invoke-direct {v2, v4, v0}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_1
    invoke-static {p1, v2}, LF0/c0;->a(Landroidx/compose/ui/d;LX/b;)LX/b;

    move-result-object p1

    invoke-virtual {p1}, LX/b;->t()I

    move-result v2

    const/4 v8, 0x0

    const-string v4, "expected prior modifier list to be non-empty"

    const/4 v9, 0x1

    if-ne v2, v1, :cond_8

    invoke-virtual {v6}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v2

    move-object v3, v2

    move v2, v0

    :goto_1
    if-eqz v3, :cond_4

    if-ge v2, v1, :cond_4

    if-eqz v7, :cond_5

    invoke-virtual {v7}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v5

    aget-object v5, v5, v2

    check-cast v5, Landroidx/compose/ui/d$b;

    invoke-virtual {p1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v10

    aget-object v10, v10, v2

    check-cast v10, Landroidx/compose/ui/d$b;

    invoke-static {v5, v10}, LF0/c0;->d(Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$b;)I

    move-result v11

    if-eqz v11, :cond_3

    if-eq v11, v9, :cond_2

    goto :goto_2

    :cond_2
    invoke-direct {p0, v5, v10, v3}, LF0/b0;->F(Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$c;)V

    :goto_2
    invoke-virtual {v3}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v3

    :cond_4
    move-object v5, v3

    goto :goto_3

    :cond_5
    invoke-static {v4}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :goto_3
    if-ge v2, v1, :cond_10

    if-eqz v7, :cond_7

    if-eqz v5, :cond_6

    iget-object v0, p0, LF0/b0;->a:LF0/J;

    invoke-virtual {v0}, LF0/J;->D()Z

    move-result v0

    xor-int/lit8 v10, v0, 0x1

    move-object v0, p0

    move v1, v2

    move-object v2, v7

    move-object v3, p1

    move-object v4, v5

    move v5, v10

    :goto_4
    invoke-direct/range {v0 .. v5}, LF0/b0;->A(ILX/b;LX/b;Landroidx/compose/ui/d$c;Z)V

    :goto_5
    move v0, v9

    goto/16 :goto_9

    :cond_6
    const-string p1, "structuralUpdate requires a non-null tail"

    invoke-static {p1}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_7
    invoke-static {v4}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_8
    iget-object v2, p0, LF0/b0;->a:LF0/J;

    invoke-virtual {v2}, LF0/J;->D()Z

    move-result v2

    if-eqz v2, :cond_a

    if-nez v1, :cond_a

    move-object v1, v6

    :goto_6
    invoke-virtual {p1}, LX/b;->t()I

    move-result v2

    if-ge v0, v2, :cond_9

    invoke-virtual {p1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v2

    aget-object v2, v2, v0

    check-cast v2, Landroidx/compose/ui/d$b;

    invoke-direct {p0, v2, v1}, LF0/b0;->g(Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_9
    invoke-direct {p0}, LF0/b0;->B()V

    goto :goto_5

    :cond_a
    invoke-virtual {p1}, LX/b;->t()I

    move-result v1

    if-nez v1, :cond_e

    if-eqz v7, :cond_d

    invoke-virtual {v6}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v1

    move v2, v0

    :goto_7
    if-eqz v1, :cond_b

    invoke-virtual {v7}, LX/b;->t()I

    move-result v3

    if-ge v2, v3, :cond_b

    invoke-direct {p0, v1}, LF0/b0;->h(Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_b
    iget-object v1, p0, LF0/b0;->b:LF0/x;

    iget-object v2, p0, LF0/b0;->a:LF0/J;

    invoke-virtual {v2}, LF0/J;->o0()LF0/J;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual {v2}, LF0/J;->P()LF0/d0;

    move-result-object v2

    goto :goto_8

    :cond_c
    move-object v2, v8

    :goto_8
    invoke-virtual {v1, v2}, LF0/d0;->T2(LF0/d0;)V

    iget-object v1, p0, LF0/b0;->b:LF0/x;

    iput-object v1, p0, LF0/b0;->c:LF0/d0;

    goto :goto_9

    :cond_d
    invoke-static {v4}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_e
    if-nez v7, :cond_f

    new-instance v7, LX/b;

    new-array v1, v3, [Landroidx/compose/ui/d$b;

    invoke-direct {v7, v1, v0}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_f
    iget-object v0, p0, LF0/b0;->a:LF0/J;

    invoke-virtual {v0}, LF0/J;->D()Z

    move-result v0

    xor-int/lit8 v5, v0, 0x1

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, v7

    move-object v3, p1

    move-object v4, v6

    goto/16 :goto_4

    :cond_10
    :goto_9
    iput-object p1, p0, LF0/b0;->f:LX/b;

    if-eqz v7, :cond_11

    invoke-virtual {v7}, LX/b;->j()V

    move-object v8, v7

    :cond_11
    iput-object v8, p0, LF0/b0;->g:LX/b;

    invoke-direct {p0, v6}, LF0/b0;->D(Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;

    move-result-object p1

    iput-object p1, p0, LF0/b0;->e:Landroidx/compose/ui/d$c;

    if-eqz v0, :cond_12

    invoke-virtual {p0}, LF0/b0;->C()V

    :cond_12
    return-void
.end method

.method public final k()Landroidx/compose/ui/d$c;
    .locals 1

    iget-object v0, p0, LF0/b0;->e:Landroidx/compose/ui/d$c;

    return-object v0
.end method

.method public final l()LF0/x;
    .locals 1

    iget-object v0, p0, LF0/b0;->b:LF0/x;

    return-object v0
.end method

.method public final m()LF0/J;
    .locals 1

    iget-object v0, p0, LF0/b0;->a:LF0/J;

    return-object v0
.end method

.method public final n()LF0/d0;
    .locals 1

    iget-object v0, p0, LF0/b0;->c:LF0/d0;

    return-object v0
.end method

.method public final o()Landroidx/compose/ui/d$c;
    .locals 1

    iget-object v0, p0, LF0/b0;->d:Landroidx/compose/ui/d$c;

    return-object v0
.end method

.method public final p(I)Z
    .locals 1

    .prologue
    invoke-direct {p0}, LF0/b0;->i()I

    move-result v0

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final q(I)Z
    .locals 1

    .prologue
    invoke-direct {p0}, LF0/b0;->i()I

    move-result v0

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final s()V
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->B1()V

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final t()V
    .locals 2

    .prologue
    invoke-virtual {p0}, LF0/b0;->o()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->C1()V

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LF0/b0;->e:Landroidx/compose/ui/d$c;

    iget-object v2, p0, LF0/b0;->d:Landroidx/compose/ui/d$c;

    const-string v3, "]"

    if-ne v1, v2, :cond_0

    :goto_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {p0}, LF0/b0;->o()Landroidx/compose/ui/d$c;

    move-result-object v2

    if-eq v1, v2, :cond_2

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v2

    iget-object v4, p0, LF0/b0;->d:Landroidx/compose/ui/d$c;

    if-ne v2, v4, :cond_1

    goto :goto_0

    :cond_1
    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v1

    goto :goto_1

    :cond_2
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final x()V
    .locals 2

    .prologue
    invoke-virtual {p0}, LF0/b0;->o()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->G1()V

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LF0/b0;->z()V

    invoke-virtual {p0}, LF0/b0;->t()V

    return-void
.end method

.method public final y()V
    .locals 2

    .prologue
    invoke-virtual {p0}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->H1()V

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->u1()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LF0/g0;->a(Landroidx/compose/ui/d$c;)V

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->z1()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, LF0/g0;->e(Landroidx/compose/ui/d$c;)V

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/compose/ui/d$c;->M1(Z)V

    invoke-virtual {v0, v1}, Landroidx/compose/ui/d$c;->Q1(Z)V

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final z()V
    .locals 2

    .prologue
    invoke-virtual {p0}, LF0/b0;->o()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->I1()V

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-void
.end method
