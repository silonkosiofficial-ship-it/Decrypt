.class final Landroidx/compose/foundation/layout/l;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E;


# instance fields
.field private P:Lx7/l;

.field private Q:Z


# direct methods
.method public constructor <init>(Lx7/l;Z)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/l;->P:Lx7/l;

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/l;->Q:Z

    return-void
.end method


# virtual methods
.method public synthetic C(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->d(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic F(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->b(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public final T1()Lx7/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/l;->P:Lx7/l;

    return-object v0
.end method

.method public final U1()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/l;->Q:Z

    return v0
.end method

.method public final V1(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/l;->P:Lx7/l;

    return-void
.end method

.method public final W1(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/layout/l;->Q:Z

    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 7

    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v1

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result v2

    new-instance v4, Landroidx/compose/foundation/layout/l$a;

    invoke-direct {v4, p0, p1, p2}, Landroidx/compose/foundation/layout/l$a;-><init>(Landroidx/compose/foundation/layout/l;LD0/M;LD0/X;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public synthetic k(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->a(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic t(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->c(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method
