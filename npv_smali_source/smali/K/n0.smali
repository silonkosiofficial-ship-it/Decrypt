.class public final LK/n0;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/R0;
.implements LF0/h;
.implements LF0/u;
.implements LK/q0$a;


# instance fields
.field private P:LK/q0;

.field private Q:LH/w;

.field private R:LN/F;

.field private final S:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LK/q0;LH/w;LN/F;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, LK/n0;->P:LK/q0;

    iput-object p2, p0, LK/n0;->Q:LH/w;

    iput-object p3, p0, LK/n0;->R:LN/F;

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p1, p1, p2, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LK/n0;->S:LV/w0;

    return-void
.end method

.method private T1(LD0/t;)V
    .locals 1

    iget-object v0, p0, LK/n0;->S:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public D1()V
    .locals 1

    iget-object v0, p0, LK/n0;->P:LK/q0;

    invoke-virtual {v0, p0}, LK/q0;->j(LK/q0$a;)V

    return-void
.end method

.method public E1()V
    .locals 1

    iget-object v0, p0, LK/n0;->P:LK/q0;

    invoke-virtual {v0, p0}, LK/q0;->l(LK/q0$a;)V

    return-void
.end method

.method public I0()LD0/t;
    .locals 1

    iget-object v0, p0, LK/n0;->S:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD0/t;

    return-object v0
.end method

.method public U1(LH/w;)V
    .locals 0

    iput-object p1, p0, LK/n0;->Q:LH/w;

    return-void
.end method

.method public final V1(LK/q0;)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK/n0;->P:LK/q0;

    invoke-interface {v0}, LS0/P;->e()V

    iget-object v0, p0, LK/n0;->P:LK/q0;

    invoke-virtual {v0, p0}, LK/q0;->l(LK/q0$a;)V

    :cond_0
    iput-object p1, p0, LK/n0;->P:LK/q0;

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LK/n0;->P:LK/q0;

    invoke-virtual {p1, p0}, LK/q0;->j(LK/q0$a;)V

    :cond_1
    return-void
.end method

.method public W1(LN/F;)V
    .locals 0

    iput-object p1, p0, LK/n0;->R:LN/F;

    return-void
.end method

.method public d0()LN/F;
    .locals 1

    iget-object v0, p0, LK/n0;->R:LN/F;

    return-object v0
.end method

.method public getSoftwareKeyboardController()Landroidx/compose/ui/platform/s1;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/platform/p0;->o()LV/O0;

    move-result-object v0

    invoke-static {p0, v0}, LF0/i;->a(LF0/h;LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/s1;

    return-object v0
.end method

.method public getViewConfiguration()Landroidx/compose/ui/platform/A1;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/platform/p0;->r()LV/O0;

    move-result-object v0

    invoke-static {p0, v0}, LF0/i;->a(LF0/h;LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/A1;

    return-object v0
.end method

.method public i1()LH/w;
    .locals 1

    iget-object v0, p0, LK/n0;->Q:LH/w;

    return-object v0
.end method

.method public s(LD0/t;)V
    .locals 0

    invoke-direct {p0, p1}, LK/n0;->T1(LD0/t;)V

    return-void
.end method

.method public z0(Lx7/p;)LW8/z0;
    .locals 8

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v2

    sget-object v4, LW8/P;->F:LW8/P;

    new-instance v5, LK/n0$a;

    invoke-direct {v5, p0, p1, v1}, LK/n0$a;-><init>(LK/n0;Lx7/p;Lm7/e;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    invoke-static/range {v2 .. v7}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object p1

    return-object p1
.end method
