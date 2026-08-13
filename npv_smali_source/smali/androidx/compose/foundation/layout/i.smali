.class abstract Landroidx/compose/foundation/layout/i;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract T1(LD0/M;LD0/G;J)J
.end method

.method public abstract U1()Z
.end method

.method public final f(LD0/M;LD0/G;J)LD0/K;
    .locals 7

    .prologue
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/layout/i;->T1(LD0/M;LD0/G;J)J

    move-result-wide v0

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/i;->U1()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p3, p4, v0, v1}, LY0/c;->g(JJ)J

    move-result-wide v0

    :cond_0
    invoke-interface {p2, v0, v1}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v1

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result v2

    new-instance v4, Landroidx/compose/foundation/layout/i$a;

    invoke-direct {v4, p2}, Landroidx/compose/foundation/layout/i$a;-><init>(LD0/X;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public k(LD0/o;LD0/n;I)I
    .locals 0

    invoke-interface {p2, p3}, LD0/n;->t(I)I

    move-result p1

    return p1
.end method

.method public t(LD0/o;LD0/n;I)I
    .locals 0

    invoke-interface {p2, p3}, LD0/n;->n0(I)I

    move-result p1

    return p1
.end method
