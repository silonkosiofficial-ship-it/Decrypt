.class public final LL6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO6/b;


# instance fields
.field private final synthetic C:LO6/b;

.field private final D:LD6/b;


# direct methods
.method public constructor <init>(LD6/b;LO6/b;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "origin"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LL6/c;->C:LO6/b;

    iput-object p1, p0, LL6/c;->D:LD6/b;

    return-void
.end method


# virtual methods
.method public H0()LD6/b;
    .locals 1

    iget-object v0, p0, LL6/c;->D:LD6/b;

    return-object v0
.end method

.method public a()LT6/p;
    .locals 1

    iget-object v0, p0, LL6/c;->C:LO6/b;

    invoke-interface {v0}, LT6/x;->a()LT6/p;

    move-result-object v0

    return-object v0
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, LL6/c;->C:LO6/b;

    invoke-interface {v0}, LO6/b;->getCoroutineContext()Lm7/i;

    move-result-object v0

    return-object v0
.end method

.method public r()LT6/g0;
    .locals 1

    iget-object v0, p0, LL6/c;->C:LO6/b;

    invoke-interface {v0}, LO6/b;->r()LT6/g0;

    move-result-object v0

    return-object v0
.end method

.method public u0()LT6/A;
    .locals 1

    iget-object v0, p0, LL6/c;->C:LO6/b;

    invoke-interface {v0}, LO6/b;->u0()LT6/A;

    move-result-object v0

    return-object v0
.end method

.method public x0()LW6/b;
    .locals 1

    iget-object v0, p0, LL6/c;->C:LO6/b;

    invoke-interface {v0}, LO6/b;->x0()LW6/b;

    move-result-object v0

    return-object v0
.end method
