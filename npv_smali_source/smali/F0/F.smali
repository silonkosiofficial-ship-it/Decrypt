.class public final LF0/F;
.super LF0/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF0/F$a;,
        LF0/F$b;
    }
.end annotation


# static fields
.field private static final A0:Lo0/N1;

.field public static final z0:LF0/F$a;


# instance fields
.field private v0:LF0/E;

.field private w0:LY0/b;

.field private x0:LF0/U;

.field private y0:LD0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LF0/F$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF0/F$a;-><init>(Ly7/k;)V

    sput-object v0, LF0/F;->z0:LF0/F$a;

    invoke-static {}, Lo0/U;->a()Lo0/N1;

    move-result-object v0

    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v1}, Lo0/y0$a;->b()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lo0/N1;->G(J)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-interface {v0, v1}, Lo0/N1;->I(F)V

    sget-object v1, Lo0/O1;->a:Lo0/O1$a;

    invoke-virtual {v1}, Lo0/O1$a;->b()I

    move-result v1

    invoke-interface {v0, v1}, Lo0/N1;->F(I)V

    sput-object v0, LF0/F;->A0:Lo0/N1;

    return-void
.end method

.method public constructor <init>(LF0/J;LF0/E;)V
    .locals 2

    .prologue
    invoke-direct {p0, p1}, LF0/d0;-><init>(LF0/J;)V

    iput-object p2, p0, LF0/F;->v0:LF0/E;

    invoke-virtual {p1}, LF0/J;->b0()LF0/J;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    new-instance p1, LF0/F$b;

    invoke-direct {p1, p0}, LF0/F$b;-><init>(LF0/F;)V

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iput-object p1, p0, LF0/F;->x0:LF0/U;

    invoke-interface {p2}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object p1

    const/16 v1, 0x200

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->v1()I

    move-result p1

    and-int/2addr p1, v1

    if-eqz p1, :cond_1

    new-instance p1, LD0/d;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode"

    invoke-static {p2, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-direct {p1, p0, v0}, LD0/d;-><init>(LF0/F;LD0/c;)V

    move-object v0, p1

    :cond_1
    iput-object v0, p0, LF0/F;->y0:LD0/d;

    return-void
.end method

.method public static final synthetic h3(LF0/F;)LD0/d;
    .locals 0

    iget-object p0, p0, LF0/F;->y0:LD0/d;

    return-object p0
.end method

.method private final k3()V
    .locals 2

    .prologue
    invoke-virtual {p0}, LF0/T;->z1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LF0/d0;->H2()V

    iget-object v0, p0, LF0/F;->y0:LD0/d;

    if-nez v0, :cond_1

    invoke-virtual {p0}, LF0/d0;->q1()LD0/K;

    move-result-object v0

    invoke-interface {v0}, LD0/K;->k()V

    invoke-virtual {p0}, LF0/F;->j3()LF0/d0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LF0/d0;->P2(Z)V

    return-void

    :cond_1
    invoke-virtual {v0}, LD0/d;->f()LD0/c;

    invoke-virtual {p0}, LF0/T;->s1()LD0/X$a;

    invoke-virtual {p0}, LF0/F;->j2()LF0/U;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LF0/U;->L1()LD0/E;

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public J2(Lo0/q0;Lr0/c;)V
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/F;->j3()LF0/d0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LF0/d0;->W1(Lo0/q0;Lr0/c;)V

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object p2

    invoke-static {p2}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object p2

    invoke-interface {p2}, LF0/o0;->getShowLayoutBounds()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, LF0/F;->A0:Lo0/N1;

    invoke-virtual {p0, p1, p2}, LF0/d0;->X1(Lo0/q0;Lo0/N1;)V

    :cond_0
    return-void
.end method

.method protected M0(JFLr0/c;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, LF0/d0;->M0(JFLr0/c;)V

    invoke-direct {p0}, LF0/F;->k3()V

    return-void
.end method

.method protected R0(JFLx7/l;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, LF0/d0;->R0(JFLx7/l;)V

    invoke-direct {p0}, LF0/F;->k3()V

    return-void
.end method

.method public S(I)I
    .locals 2

    .prologue
    iget-object v0, p0, LF0/F;->y0:LD0/d;

    if-nez v0, :cond_0

    iget-object v0, p0, LF0/F;->v0:LF0/E;

    invoke-virtual {p0}, LF0/F;->j3()LF0/d0;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1}, LF0/E;->C(LD0/o;LD0/n;I)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {v0}, LD0/d;->f()LD0/c;

    invoke-virtual {p0}, LF0/F;->j3()LF0/d0;

    const/4 p1, 0x0

    throw p1
.end method

.method public T(I)I
    .locals 2

    .prologue
    iget-object v0, p0, LF0/F;->y0:LD0/d;

    if-nez v0, :cond_0

    iget-object v0, p0, LF0/F;->v0:LF0/E;

    invoke-virtual {p0}, LF0/F;->j3()LF0/d0;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1}, LF0/E;->F(LD0/o;LD0/n;I)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {v0}, LD0/d;->f()LD0/c;

    invoke-virtual {p0}, LF0/F;->j3()LF0/d0;

    const/4 p1, 0x0

    throw p1
.end method

.method public U(J)LD0/X;
    .locals 2

    .prologue
    invoke-virtual {p0}, LF0/d0;->f2()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, LF0/F;->w0:LY0/b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LY0/b;->r()J

    move-result-wide p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Lookahead constraints cannot be null in approach pass."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p0, p1, p2}, LF0/d0;->Q1(LF0/d0;J)V

    invoke-static {p0}, LF0/F;->h3(LF0/F;)LD0/d;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, LF0/F;->i3()LF0/E;

    move-result-object v0

    invoke-virtual {p0}, LF0/F;->j3()LF0/d0;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1, p2}, LF0/E;->f(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    invoke-virtual {p0, p1}, LF0/d0;->Q2(LD0/K;)V

    invoke-virtual {p0}, LF0/d0;->G2()V

    return-object p0

    :cond_2
    invoke-virtual {v0}, LD0/d;->f()LD0/c;

    invoke-virtual {v0}, LD0/d;->s()J

    const/4 p1, 0x0

    throw p1
.end method

.method public Z1()V
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/F;->j2()LF0/U;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LF0/F$b;

    invoke-direct {v0, p0}, LF0/F$b;-><init>(LF0/F;)V

    invoke-virtual {p0, v0}, LF0/F;->n3(LF0/U;)V

    :cond_0
    return-void
.end method

.method public f1(LD0/a;)I
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/F;->j2()LF0/U;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LF0/U;->H1(LD0/a;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LF0/G;->a(LF0/T;LD0/a;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final i3()LF0/E;
    .locals 1

    iget-object v0, p0, LF0/F;->v0:LF0/E;

    return-object v0
.end method

.method public j2()LF0/U;
    .locals 1

    iget-object v0, p0, LF0/F;->x0:LF0/U;

    return-object v0
.end method

.method public final j3()LF0/d0;
    .locals 1

    invoke-virtual {p0}, LF0/d0;->o2()LF0/d0;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final l3(LF0/E;)V
    .locals 2

    .prologue
    iget-object v0, p0, LF0/F;->v0:LF0/E;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p1}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    const/16 v1, 0x200

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v0

    and-int/2addr v0, v1

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    iget-object v0, p0, LF0/F;->y0:LD0/d;

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LD0/d;->t(LD0/c;)V

    goto :goto_0

    :cond_0
    new-instance v0, LD0/d;

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-direct {v0, p0, v1}, LD0/d;-><init>(LF0/F;LD0/c;)V

    :goto_0
    iput-object v0, p0, LF0/F;->y0:LD0/d;

    goto :goto_1

    :cond_1
    iput-object v1, p0, LF0/F;->y0:LD0/d;

    :cond_2
    :goto_1
    iput-object p1, p0, LF0/F;->v0:LF0/E;

    return-void
.end method

.method public final m3(LY0/b;)V
    .locals 0

    iput-object p1, p0, LF0/F;->w0:LY0/b;

    return-void
.end method

.method public n0(I)I
    .locals 2

    .prologue
    iget-object v0, p0, LF0/F;->y0:LD0/d;

    if-nez v0, :cond_0

    iget-object v0, p0, LF0/F;->v0:LF0/E;

    invoke-virtual {p0}, LF0/F;->j3()LF0/d0;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1}, LF0/E;->t(LD0/o;LD0/n;I)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {v0}, LD0/d;->f()LD0/c;

    invoke-virtual {p0}, LF0/F;->j3()LF0/d0;

    const/4 p1, 0x0

    throw p1
.end method

.method public n2()Landroidx/compose/ui/d$c;
    .locals 1

    iget-object v0, p0, LF0/F;->v0:LF0/E;

    invoke-interface {v0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    return-object v0
.end method

.method protected n3(LF0/U;)V
    .locals 0

    iput-object p1, p0, LF0/F;->x0:LF0/U;

    return-void
.end method

.method public t(I)I
    .locals 2

    .prologue
    iget-object v0, p0, LF0/F;->y0:LD0/d;

    if-nez v0, :cond_0

    iget-object v0, p0, LF0/F;->v0:LF0/E;

    invoke-virtual {p0}, LF0/F;->j3()LF0/d0;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1}, LF0/E;->k(LD0/o;LD0/n;I)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {v0}, LD0/d;->f()LD0/c;

    invoke-virtual {p0}, LF0/F;->j3()LF0/d0;

    const/4 p1, 0x0

    throw p1
.end method
