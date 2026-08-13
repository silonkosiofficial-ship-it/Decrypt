.class public final Lf0/h;
.super Lf0/k;
.source "SourceFile"


# instance fields
.field private final g:Lx7/l;

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILf0/n;Lx7/l;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lf0/k;-><init>(ILf0/n;Ly7/k;)V

    iput-object p3, p0, Lf0/h;->g:Lx7/l;

    const/4 p1, 0x1

    iput p1, p0, Lf0/h;->h:I

    return-void
.end method


# virtual methods
.method public A()Lx7/l;
    .locals 1

    iget-object v0, p0, Lf0/h;->g:Lx7/l;

    return-object v0
.end method

.method public d()V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lf0/k;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p0}, Lf0/h;->n(Lf0/k;)V

    invoke-super {p0}, Lf0/k;->d()V

    :cond_0
    return-void
.end method

.method public bridge synthetic h()Lx7/l;
    .locals 1

    invoke-virtual {p0}, Lf0/h;->A()Lx7/l;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public k()Lx7/l;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public m(Lf0/k;)V
    .locals 0

    iget p1, p0, Lf0/h;->h:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lf0/h;->h:I

    return-void
.end method

.method public n(Lf0/k;)V
    .locals 0

    .prologue
    iget p1, p0, Lf0/h;->h:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lf0/h;->h:I

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lf0/k;->b()V

    :cond_0
    return-void
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public p(Lf0/y;)V
    .locals 0

    invoke-static {}, Lf0/p;->r()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public x(Lx7/l;)Lf0/k;
    .locals 7

    invoke-static {p0}, Lf0/p;->y(Lf0/k;)V

    new-instance v0, Lf0/e;

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v1

    invoke-virtual {p0}, Lf0/k;->g()Lf0/n;

    move-result-object v2

    invoke-virtual {p0}, Lf0/h;->A()Lx7/l;

    move-result-object v3

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {p1, v3, v6, v4, v5}, Lf0/p;->L(Lx7/l;Lx7/l;ZILjava/lang/Object;)Lx7/l;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1, p0}, Lf0/e;-><init>(ILf0/n;Lx7/l;Lf0/k;)V

    return-object v0
.end method
