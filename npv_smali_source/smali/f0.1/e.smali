.class public final Lf0/e;
.super Lf0/k;
.source "SourceFile"


# instance fields
.field private final g:Lx7/l;

.field private final h:Lf0/k;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILf0/n;Lx7/l;Lf0/k;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lf0/k;-><init>(ILf0/n;Ly7/k;)V

    iput-object p3, p0, Lf0/e;->g:Lx7/l;

    iput-object p4, p0, Lf0/e;->h:Lf0/k;

    invoke-virtual {p4, p0}, Lf0/k;->m(Lf0/k;)V

    return-void
.end method


# virtual methods
.method public A()Lx7/l;
    .locals 1

    iget-object v0, p0, Lf0/e;->g:Lx7/l;

    return-object v0
.end method

.method public B(Lf0/k;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Lf0/t;->a()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public C(Lf0/k;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Lf0/t;->a()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public D(Lf0/y;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Lf0/p;->r()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public E(Lx7/l;)Lf0/e;
    .locals 7

    new-instance v0, Lf0/e;

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v1

    invoke-virtual {p0}, Lf0/k;->g()Lf0/n;

    move-result-object v2

    invoke-virtual {p0}, Lf0/e;->A()Lx7/l;

    move-result-object v3

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {p1, v3, v6, v4, v5}, Lf0/p;->L(Lx7/l;Lx7/l;ZILjava/lang/Object;)Lx7/l;

    move-result-object p1

    iget-object v3, p0, Lf0/e;->h:Lf0/k;

    invoke-direct {v0, v1, v2, p1, v3}, Lf0/e;-><init>(ILf0/n;Lx7/l;Lf0/k;)V

    return-object v0
.end method

.method public d()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lf0/k;->e()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v0

    iget-object v1, p0, Lf0/e;->h:Lf0/k;

    invoke-virtual {v1}, Lf0/k;->f()I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lf0/k;->b()V

    :cond_0
    iget-object v0, p0, Lf0/e;->h:Lf0/k;

    invoke-virtual {v0, p0}, Lf0/k;->n(Lf0/k;)V

    invoke-super {p0}, Lf0/k;->d()V

    :cond_1
    return-void
.end method

.method public bridge synthetic h()Lx7/l;
    .locals 1

    invoke-virtual {p0}, Lf0/e;->A()Lx7/l;

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

.method public bridge synthetic m(Lf0/k;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf0/e;->B(Lf0/k;)Ljava/lang/Void;

    return-void
.end method

.method public bridge synthetic n(Lf0/k;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf0/e;->C(Lf0/k;)Ljava/lang/Void;

    return-void
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public bridge synthetic p(Lf0/y;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf0/e;->D(Lf0/y;)Ljava/lang/Void;

    return-void
.end method

.method public bridge synthetic x(Lx7/l;)Lf0/k;
    .locals 0

    invoke-virtual {p0, p1}, Lf0/e;->E(Lx7/l;)Lf0/e;

    move-result-object p1

    return-object p1
.end method
