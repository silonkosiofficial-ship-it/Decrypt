.class public final Lv/b0;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E;


# instance fields
.field private P:Landroidx/compose/foundation/m;

.field private Q:Z

.field private R:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/m;ZZ)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Lv/b0;->P:Landroidx/compose/foundation/m;

    iput-boolean p2, p0, Lv/b0;->Q:Z

    iput-boolean p3, p0, Lv/b0;->R:Z

    return-void
.end method


# virtual methods
.method public C(LD0/o;LD0/n;I)I
    .locals 0

    .prologue
    iget-boolean p1, p0, Lv/b0;->R:Z

    if-eqz p1, :cond_0

    const p1, 0x7fffffff

    invoke-interface {p2, p1}, LD0/n;->S(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LD0/n;->S(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public F(LD0/o;LD0/n;I)I
    .locals 0

    .prologue
    iget-boolean p1, p0, Lv/b0;->R:Z

    if-eqz p1, :cond_0

    const p1, 0x7fffffff

    invoke-interface {p2, p1}, LD0/n;->T(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LD0/n;->T(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final T1()Landroidx/compose/foundation/m;
    .locals 1

    iget-object v0, p0, Lv/b0;->P:Landroidx/compose/foundation/m;

    return-object v0
.end method

.method public final U1()Z
    .locals 1

    iget-boolean v0, p0, Lv/b0;->Q:Z

    return v0
.end method

.method public final V1()Z
    .locals 1

    iget-boolean v0, p0, Lv/b0;->R:Z

    return v0
.end method

.method public final W1(Z)V
    .locals 0

    iput-boolean p1, p0, Lv/b0;->Q:Z

    return-void
.end method

.method public final X1(Landroidx/compose/foundation/m;)V
    .locals 0

    iput-object p1, p0, Lv/b0;->P:Landroidx/compose/foundation/m;

    return-void
.end method

.method public final Y1(Z)V
    .locals 0

    iput-boolean p1, p0, Lv/b0;->R:Z

    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 10

    .prologue
    iget-boolean v0, p0, Lv/b0;->R:Z

    if-eqz v0, :cond_0

    sget-object v0, Lx/s;->C:Lx/s;

    goto :goto_0

    :cond_0
    sget-object v0, Lx/s;->D:Lx/s;

    :goto_0
    invoke-static {p3, p4, v0}, Lv/j;->a(JLx/s;)V

    iget-boolean v0, p0, Lv/b0;->R:Z

    const v1, 0x7fffffff

    if-eqz v0, :cond_1

    move v7, v1

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result v0

    move v7, v0

    :goto_1
    iget-boolean v0, p0, Lv/b0;->R:Z

    if-eqz v0, :cond_2

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v1

    :cond_2
    move v5, v1

    const/4 v8, 0x5

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-wide v2, p3

    invoke-static/range {v2 .. v9}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v0

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v1

    invoke-static {v0, v1}, LE7/j;->g(II)I

    move-result v3

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result v0

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result p3

    invoke-static {v0, p3}, LE7/j;->g(II)I

    move-result v4

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result p3

    sub-int/2addr p3, v4

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result p4

    sub-int/2addr p4, v3

    iget-boolean v0, p0, Lv/b0;->R:Z

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move p3, p4

    :goto_2
    iget-object p4, p0, Lv/b0;->P:Landroidx/compose/foundation/m;

    invoke-virtual {p4, p3}, Landroidx/compose/foundation/m;->m(I)V

    iget-object p4, p0, Lv/b0;->P:Landroidx/compose/foundation/m;

    iget-boolean v0, p0, Lv/b0;->R:Z

    if-eqz v0, :cond_4

    move v0, v4

    goto :goto_3

    :cond_4
    move v0, v3

    :goto_3
    invoke-virtual {p4, v0}, Landroidx/compose/foundation/m;->o(I)V

    new-instance v6, Lv/b0$a;

    invoke-direct {v6, p0, p3, p2}, Lv/b0$a;-><init>(Lv/b0;ILD0/X;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public k(LD0/o;LD0/n;I)I
    .locals 0

    .prologue
    iget-boolean p1, p0, Lv/b0;->R:Z

    if-eqz p1, :cond_0

    invoke-interface {p2, p3}, LD0/n;->t(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    invoke-interface {p2, p1}, LD0/n;->t(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public t(LD0/o;LD0/n;I)I
    .locals 0

    .prologue
    iget-boolean p1, p0, Lv/b0;->R:Z

    if-eqz p1, :cond_0

    invoke-interface {p2, p3}, LD0/n;->n0(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    invoke-interface {p2, p1}, LD0/n;->n0(I)I

    move-result p1

    :goto_0
    return p1
.end method
