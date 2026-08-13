.class final Landroidx/compose/foundation/lazy/layout/g;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/z0;


# instance fields
.field private P:Lx7/a;

.field private Q:LD/E;

.field private R:Lx/s;

.field private S:Z

.field private T:Z

.field private U:LK0/i;

.field private final V:Lx7/l;

.field private W:Lx7/l;


# direct methods
.method public constructor <init>(Lx7/a;LD/E;Lx/s;ZZ)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/g;->P:Lx7/a;

    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/g;->Q:LD/E;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/g;->R:Lx/s;

    iput-boolean p4, p0, Landroidx/compose/foundation/lazy/layout/g;->S:Z

    iput-boolean p5, p0, Landroidx/compose/foundation/lazy/layout/g;->T:Z

    new-instance p1, Landroidx/compose/foundation/lazy/layout/g$b;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/lazy/layout/g$b;-><init>(Landroidx/compose/foundation/lazy/layout/g;)V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/g;->V:Lx7/l;

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/g;->Y1()V

    return-void
.end method

.method public static final synthetic T1(Landroidx/compose/foundation/lazy/layout/g;)Lx7/a;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/g;->P:Lx7/a;

    return-object p0
.end method

.method public static final synthetic U1(Landroidx/compose/foundation/lazy/layout/g;)LD/E;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/g;->Q:LD/E;

    return-object p0
.end method

.method private final V1()LK0/b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/g;->Q:LD/E;

    invoke-interface {v0}, LD/E;->e()LK0/b;

    move-result-object v0

    return-object v0
.end method

.method private final W1()Z
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/g;->R:Lx/s;

    sget-object v1, Lx/s;->C:Lx/s;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final Y1()V
    .locals 4

    .prologue
    new-instance v0, LK0/i;

    new-instance v1, Landroidx/compose/foundation/lazy/layout/g$c;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/lazy/layout/g$c;-><init>(Landroidx/compose/foundation/lazy/layout/g;)V

    new-instance v2, Landroidx/compose/foundation/lazy/layout/g$d;

    invoke-direct {v2, p0}, Landroidx/compose/foundation/lazy/layout/g$d;-><init>(Landroidx/compose/foundation/lazy/layout/g;)V

    iget-boolean v3, p0, Landroidx/compose/foundation/lazy/layout/g;->T:Z

    invoke-direct {v0, v1, v2, v3}, LK0/i;-><init>(Lx7/a;Lx7/a;Z)V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/g;->U:LK0/i;

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/g;->S:Z

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/compose/foundation/lazy/layout/g$e;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/lazy/layout/g$e;-><init>(Landroidx/compose/foundation/lazy/layout/g;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/g;->W:Lx7/l;

    return-void
.end method


# virtual methods
.method public M0(LK0/w;)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    invoke-static {p1, v0}, LK0/u;->k0(LK0/w;Z)V

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/g;->V:Lx7/l;

    invoke-static {p1, v1}, LK0/u;->r(LK0/w;Lx7/l;)V

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/g;->W1()Z

    move-result v1

    const-string v2, "scrollAxisRange"

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/g;->U:LK0/i;

    if-nez v1, :cond_0

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v1, v3

    :cond_0
    invoke-static {p1, v1}, LK0/u;->m0(LK0/w;LK0/i;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/g;->U:LK0/i;

    if-nez v1, :cond_2

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v1, v3

    :cond_2
    invoke-static {p1, v1}, LK0/u;->T(LK0/w;LK0/i;)V

    :goto_0
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/g;->W:Lx7/l;

    if-eqz v1, :cond_3

    invoke-static {p1, v3, v1, v0, v3}, LK0/u;->K(LK0/w;Ljava/lang/String;Lx7/l;ILjava/lang/Object;)V

    :cond_3
    new-instance v1, Landroidx/compose/foundation/lazy/layout/g$a;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/lazy/layout/g$a;-><init>(Landroidx/compose/foundation/lazy/layout/g;)V

    invoke-static {p1, v3, v1, v0, v3}, LK0/u;->o(LK0/w;Ljava/lang/String;Lx7/a;ILjava/lang/Object;)V

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/g;->V1()LK0/b;

    move-result-object v0

    invoke-static {p1, v0}, LK0/u;->M(LK0/w;LK0/b;)V

    return-void
.end method

.method public final X1(Lx7/a;LD/E;Lx/s;ZZ)V
    .locals 0

    .prologue
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/g;->P:Lx7/a;

    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/g;->Q:LD/E;

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/g;->R:Lx/s;

    if-eq p1, p3, :cond_0

    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/g;->R:Lx/s;

    invoke-static {p0}, LF0/A0;->b(LF0/z0;)V

    :cond_0
    iget-boolean p1, p0, Landroidx/compose/foundation/lazy/layout/g;->S:Z

    if-ne p1, p4, :cond_1

    iget-boolean p1, p0, Landroidx/compose/foundation/lazy/layout/g;->T:Z

    if-eq p1, p5, :cond_2

    :cond_1
    iput-boolean p4, p0, Landroidx/compose/foundation/lazy/layout/g;->S:Z

    iput-boolean p5, p0, Landroidx/compose/foundation/lazy/layout/g;->T:Z

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/g;->Y1()V

    invoke-static {p0}, LF0/A0;->b(LF0/z0;)V

    :cond_2
    return-void
.end method

.method public synthetic h0()Z
    .locals 1

    invoke-static {p0}, LF0/y0;->a(LF0/z0;)Z

    move-result v0

    return v0
.end method

.method public synthetic k1()Z
    .locals 1

    invoke-static {p0}, LF0/y0;->b(LF0/z0;)Z

    move-result v0

    return v0
.end method

.method public y1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
