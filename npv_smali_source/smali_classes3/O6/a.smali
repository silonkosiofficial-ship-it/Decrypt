.class public LO6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO6/b;


# instance fields
.field private final C:LD6/b;

.field private final D:LT6/A;

.field private final E:LT6/g0;

.field private final F:LU6/b;

.field private final G:LT6/p;

.field private final H:LW6/b;


# direct methods
.method public constructor <init>(LD6/b;LO6/e;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO6/a;->C:LD6/b;

    invoke-virtual {p2}, LO6/e;->f()LT6/A;

    move-result-object p1

    iput-object p1, p0, LO6/a;->D:LT6/A;

    invoke-virtual {p2}, LO6/e;->h()LT6/g0;

    move-result-object p1

    iput-object p1, p0, LO6/a;->E:LT6/g0;

    invoke-virtual {p2}, LO6/e;->b()LU6/b;

    move-result-object p1

    iput-object p1, p0, LO6/a;->F:LU6/b;

    invoke-virtual {p2}, LO6/e;->e()LT6/p;

    move-result-object p1

    iput-object p1, p0, LO6/a;->G:LT6/p;

    invoke-virtual {p2}, LO6/e;->a()LW6/b;

    move-result-object p1

    iput-object p1, p0, LO6/a;->H:LW6/b;

    return-void
.end method


# virtual methods
.method public H0()LD6/b;
    .locals 1

    iget-object v0, p0, LO6/a;->C:LD6/b;

    return-object v0
.end method

.method public a()LT6/p;
    .locals 1

    iget-object v0, p0, LO6/a;->G:LT6/p;

    return-object v0
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    invoke-virtual {p0}, LO6/a;->H0()LD6/b;

    move-result-object v0

    invoke-virtual {v0}, LD6/b;->getCoroutineContext()Lm7/i;

    move-result-object v0

    return-object v0
.end method

.method public r()LT6/g0;
    .locals 1

    iget-object v0, p0, LO6/a;->E:LT6/g0;

    return-object v0
.end method

.method public u0()LT6/A;
    .locals 1

    iget-object v0, p0, LO6/a;->D:LT6/A;

    return-object v0
.end method

.method public x0()LW6/b;
    .locals 1

    iget-object v0, p0, LO6/a;->H:LW6/b;

    return-object v0
.end method
