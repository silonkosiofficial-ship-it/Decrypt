.class final LD0/P$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/G;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD0/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final C:LD0/n;

.field private final D:LD0/P$c;

.field private final E:LD0/P$d;


# direct methods
.method public constructor <init>(LD0/n;LD0/P$c;LD0/P$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD0/P$a;->C:LD0/n;

    iput-object p2, p0, LD0/P$a;->D:LD0/P$c;

    iput-object p3, p0, LD0/P$a;->E:LD0/P$d;

    return-void
.end method


# virtual methods
.method public S(I)I
    .locals 1

    iget-object v0, p0, LD0/P$a;->C:LD0/n;

    invoke-interface {v0, p1}, LD0/n;->S(I)I

    move-result p1

    return p1
.end method

.method public T(I)I
    .locals 1

    iget-object v0, p0, LD0/P$a;->C:LD0/n;

    invoke-interface {v0, p1}, LD0/n;->T(I)I

    move-result p1

    return p1
.end method

.method public U(J)LD0/X;
    .locals 3

    .prologue
    iget-object v0, p0, LD0/P$a;->E:LD0/P$d;

    sget-object v1, LD0/P$d;->C:LD0/P$d;

    const/16 v2, 0x7fff

    if-ne v0, v1, :cond_2

    iget-object v0, p0, LD0/P$a;->D:LD0/P$c;

    sget-object v1, LD0/P$c;->D:LD0/P$c;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LD0/P$a;->C:LD0/n;

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result v1

    invoke-interface {v0, v1}, LD0/n;->T(I)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LD0/P$a;->C:LD0/n;

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result v1

    invoke-interface {v0, v1}, LD0/n;->S(I)I

    move-result v0

    :goto_0
    invoke-static {p1, p2}, LY0/b;->g(J)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result v2

    :cond_1
    new-instance p1, LD0/P$b;

    invoke-direct {p1, v0, v2}, LD0/P$b;-><init>(II)V

    return-object p1

    :cond_2
    iget-object v0, p0, LD0/P$a;->D:LD0/P$c;

    sget-object v1, LD0/P$c;->D:LD0/P$c;

    if-ne v0, v1, :cond_3

    iget-object v0, p0, LD0/P$a;->C:LD0/n;

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v1

    invoke-interface {v0, v1}, LD0/n;->t(I)I

    move-result v0

    goto :goto_1

    :cond_3
    iget-object v0, p0, LD0/P$a;->C:LD0/n;

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v1

    invoke-interface {v0, v1}, LD0/n;->n0(I)I

    move-result v0

    :goto_1
    invoke-static {p1, p2}, LY0/b;->h(J)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v2

    :cond_4
    new-instance p1, LD0/P$b;

    invoke-direct {p1, v2, v0}, LD0/P$b;-><init>(II)V

    return-object p1
.end method

.method public Z()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD0/P$a;->C:LD0/n;

    invoke-interface {v0}, LD0/n;->Z()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public n0(I)I
    .locals 1

    iget-object v0, p0, LD0/P$a;->C:LD0/n;

    invoke-interface {v0, p1}, LD0/n;->n0(I)I

    move-result p1

    return p1
.end method

.method public t(I)I
    .locals 1

    iget-object v0, p0, LD0/P$a;->C:LD0/n;

    invoke-interface {v0, p1}, LD0/n;->t(I)I

    move-result p1

    return p1
.end method
