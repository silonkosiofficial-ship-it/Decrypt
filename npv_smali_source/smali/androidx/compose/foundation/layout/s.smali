.class final Landroidx/compose/foundation/layout/s;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E;


# instance fields
.field private P:LA/o;

.field private Q:Z

.field private R:Lx7/p;


# direct methods
.method public constructor <init>(LA/o;ZLx7/p;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/s;->P:LA/o;

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/s;->Q:Z

    iput-object p3, p0, Landroidx/compose/foundation/layout/s;->R:Lx7/p;

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

.method public final T1()Lx7/p;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/s;->R:Lx7/p;

    return-object v0
.end method

.method public final U1(Lx7/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/s;->R:Lx7/p;

    return-void
.end method

.method public final V1(LA/o;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/s;->P:LA/o;

    return-void
.end method

.method public final W1(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/layout/s;->Q:Z

    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 14

    .prologue
    move-object v6, p0

    iget-object v0, v6, Landroidx/compose/foundation/layout/s;->P:LA/o;

    sget-object v1, LA/o;->C:LA/o;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v0

    :goto_0
    iget-object v3, v6, Landroidx/compose/foundation/layout/s;->P:LA/o;

    sget-object v4, LA/o;->D:LA/o;

    if-eq v3, v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-static/range {p3 .. p4}, LY0/b;->m(J)I

    move-result v2

    :goto_1
    iget-object v3, v6, Landroidx/compose/foundation/layout/s;->P:LA/o;

    const v5, 0x7fffffff

    if-eq v3, v1, :cond_2

    iget-boolean v1, v6, Landroidx/compose/foundation/layout/s;->Q:Z

    if-eqz v1, :cond_2

    move v1, v5

    goto :goto_2

    :cond_2
    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v1

    :goto_2
    iget-object v3, v6, Landroidx/compose/foundation/layout/s;->P:LA/o;

    if-eq v3, v4, :cond_3

    iget-boolean v3, v6, Landroidx/compose/foundation/layout/s;->Q:Z

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-static/range {p3 .. p4}, LY0/b;->k(J)I

    move-result v5

    :goto_3
    invoke-static {v0, v1, v2, v5}, LY0/c;->a(IIII)J

    move-result-wide v0

    move-object/from16 v2, p2

    invoke-interface {v2, v0, v1}, LD0/G;->U(J)LD0/X;

    move-result-object v3

    invoke-virtual {v3}, LD0/X;->I0()I

    move-result v0

    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v1

    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v2

    invoke-static {v0, v1, v2}, LE7/j;->k(III)I

    move-result v8

    invoke-virtual {v3}, LD0/X;->w0()I

    move-result v0

    invoke-static/range {p3 .. p4}, LY0/b;->m(J)I

    move-result v1

    invoke-static/range {p3 .. p4}, LY0/b;->k(J)I

    move-result v2

    invoke-static {v0, v1, v2}, LE7/j;->k(III)I

    move-result v9

    new-instance v11, Landroidx/compose/foundation/layout/s$a;

    move-object v0, v11

    move-object v1, p0

    move v2, v8

    move v4, v9

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/layout/s$a;-><init>(Landroidx/compose/foundation/layout/s;ILD0/X;ILD0/M;)V

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v10, 0x0

    move-object v7, p1

    invoke-static/range {v7 .. v13}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v0

    return-object v0
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
