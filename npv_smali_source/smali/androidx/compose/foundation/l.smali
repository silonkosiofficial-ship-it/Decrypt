.class final Landroidx/compose/foundation/l;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/z0;


# instance fields
.field private P:Landroidx/compose/foundation/m;

.field private Q:Z

.field private R:Lx/p;

.field private S:Z

.field private T:Z


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/m;ZLx/p;ZZ)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/l;->P:Landroidx/compose/foundation/m;

    iput-boolean p2, p0, Landroidx/compose/foundation/l;->Q:Z

    iput-object p3, p0, Landroidx/compose/foundation/l;->R:Lx/p;

    iput-boolean p4, p0, Landroidx/compose/foundation/l;->S:Z

    iput-boolean p5, p0, Landroidx/compose/foundation/l;->T:Z

    return-void
.end method


# virtual methods
.method public M0(LK0/w;)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    invoke-static {p1, v0}, LK0/u;->k0(LK0/w;Z)V

    new-instance v0, LK0/i;

    new-instance v1, Landroidx/compose/foundation/l$a;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/l$a;-><init>(Landroidx/compose/foundation/l;)V

    new-instance v2, Landroidx/compose/foundation/l$b;

    invoke-direct {v2, p0}, Landroidx/compose/foundation/l$b;-><init>(Landroidx/compose/foundation/l;)V

    iget-boolean v3, p0, Landroidx/compose/foundation/l;->Q:Z

    invoke-direct {v0, v1, v2, v3}, LK0/i;-><init>(Lx7/a;Lx7/a;Z)V

    iget-boolean v1, p0, Landroidx/compose/foundation/l;->T:Z

    if-eqz v1, :cond_0

    invoke-static {p1, v0}, LK0/u;->m0(LK0/w;LK0/i;)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, LK0/u;->T(LK0/w;LK0/i;)V

    :goto_0
    return-void
.end method

.method public final T1()Landroidx/compose/foundation/m;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/l;->P:Landroidx/compose/foundation/m;

    return-object v0
.end method

.method public final U1(Lx/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/l;->R:Lx/p;

    return-void
.end method

.method public final V1(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/l;->Q:Z

    return-void
.end method

.method public final W1(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/l;->S:Z

    return-void
.end method

.method public final X1(Landroidx/compose/foundation/m;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/l;->P:Landroidx/compose/foundation/m;

    return-void
.end method

.method public final Y1(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/l;->T:Z

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
