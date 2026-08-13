.class final Landroidx/compose/foundation/layout/j;
.super Landroidx/compose/foundation/layout/i;
.source "SourceFile"


# instance fields
.field private P:LA/y;

.field private Q:Z


# direct methods
.method public constructor <init>(LA/y;Z)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/layout/i;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/j;->P:LA/y;

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/j;->Q:Z

    return-void
.end method


# virtual methods
.method public C(LD0/o;LD0/n;I)I
    .locals 1

    .prologue
    iget-object p1, p0, Landroidx/compose/foundation/layout/j;->P:LA/y;

    sget-object v0, LA/y;->C:LA/y;

    if-ne p1, v0, :cond_0

    invoke-interface {p2, p3}, LD0/n;->S(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LD0/n;->T(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public F(LD0/o;LD0/n;I)I
    .locals 1

    .prologue
    iget-object p1, p0, Landroidx/compose/foundation/layout/j;->P:LA/y;

    sget-object v0, LA/y;->C:LA/y;

    if-ne p1, v0, :cond_0

    invoke-interface {p2, p3}, LD0/n;->S(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LD0/n;->T(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public T1(LD0/M;LD0/G;J)J
    .locals 1

    .prologue
    iget-object p1, p0, Landroidx/compose/foundation/layout/j;->P:LA/y;

    sget-object v0, LA/y;->C:LA/y;

    if-ne p1, v0, :cond_0

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result p1

    invoke-interface {p2, p1}, LD0/n;->S(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result p1

    invoke-interface {p2, p1}, LD0/n;->T(I)I

    move-result p1

    :goto_0
    if-gez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    sget-object p2, LY0/b;->b:LY0/b$a;

    invoke-virtual {p2, p1}, LY0/b$a;->e(I)J

    move-result-wide p1

    return-wide p1
.end method

.method public U1()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/j;->Q:Z

    return v0
.end method

.method public V1(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/layout/j;->Q:Z

    return-void
.end method

.method public final W1(LA/y;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/j;->P:LA/y;

    return-void
.end method
