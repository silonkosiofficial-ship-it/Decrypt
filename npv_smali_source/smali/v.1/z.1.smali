.class public final Lv/z;
.super LF0/m;
.source "SourceFile"

# interfaces
.implements Lm0/b;
.implements LF0/z0;
.implements LF0/u;
.implements Lm0/m;


# instance fields
.field private final R:Z

.field private S:Lm0/n;

.field private final T:Lv/y;

.field private final U:Lv/A;

.field private final V:Lv/C;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lz/l;)V
    .locals 1

    invoke-direct {p0}, LF0/m;-><init>()V

    new-instance v0, Lv/y;

    invoke-direct {v0, p1}, Lv/y;-><init>(Lz/l;)V

    invoke-virtual {p0, v0}, LF0/m;->T1(LF0/j;)LF0/j;

    move-result-object p1

    check-cast p1, Lv/y;

    iput-object p1, p0, Lv/z;->T:Lv/y;

    new-instance p1, Lv/A;

    invoke-direct {p1}, Lv/A;-><init>()V

    invoke-virtual {p0, p1}, LF0/m;->T1(LF0/j;)LF0/j;

    move-result-object p1

    check-cast p1, Lv/A;

    iput-object p1, p0, Lv/z;->U:Lv/A;

    new-instance p1, Lv/C;

    invoke-direct {p1}, Lv/C;-><init>()V

    invoke-virtual {p0, p1}, LF0/m;->T1(LF0/j;)LF0/j;

    move-result-object p1

    check-cast p1, Lv/C;

    iput-object p1, p0, Lv/z;->V:Lv/C;

    invoke-static {}, Lm0/q;->a()Lm0/p;

    move-result-object p1

    invoke-virtual {p0, p1}, LF0/m;->T1(LF0/j;)LF0/j;

    return-void
.end method


# virtual methods
.method public M0(LK0/w;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lv/z;->S:Lm0/n;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lm0/n;->g()Z

    move-result v0

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    invoke-static {p1, v1}, LK0/u;->S(LK0/w;Z)V

    new-instance v0, Lv/z$a;

    invoke-direct {v0, p0}, Lv/z$a;-><init>(Lv/z;)V

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v2, v1}, LK0/u;->F(LK0/w;Ljava/lang/String;Lx7/a;ILjava/lang/Object;)V

    return-void
.end method

.method public R0(Lm0/n;)V
    .locals 7

    .prologue
    iget-object v0, p0, Lv/z;->S:Lm0/n;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p1}, Lm0/n;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v1

    new-instance v4, Lv/z$b;

    const/4 v2, 0x0

    invoke-direct {v4, p0, v2}, Lv/z$b;-><init>(Lv/z;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p0}, LF0/A0;->b(LF0/z0;)V

    :cond_1
    iget-object v1, p0, Lv/z;->T:Lv/y;

    invoke-virtual {v1, v0}, Lv/y;->V1(Z)V

    iget-object v1, p0, Lv/z;->V:Lv/C;

    invoke-virtual {v1, v0}, Lv/C;->V1(Z)V

    iget-object v1, p0, Lv/z;->U:Lv/A;

    invoke-virtual {v1, v0}, Lv/A;->U1(Z)V

    iput-object p1, p0, Lv/z;->S:Lm0/n;

    :cond_2
    return-void
.end method

.method public final Z1(Lz/l;)V
    .locals 1

    iget-object v0, p0, Lv/z;->T:Lv/y;

    invoke-virtual {v0, p1}, Lv/y;->W1(Lz/l;)V

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

.method public s(LD0/t;)V
    .locals 1

    iget-object v0, p0, Lv/z;->V:Lv/C;

    invoke-virtual {v0, p1}, Lv/C;->s(LD0/t;)V

    return-void
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, Lv/z;->R:Z

    return v0
.end method
