.class public final LI6/p$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO6/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI6/p;->e(LO6/d;)LO6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final C:LT6/A;

.field private final D:LT6/g0;

.field private final E:LW6/b;

.field private final F:LT6/p;

.field final synthetic G:LO6/d;


# direct methods
.method constructor <init>(LO6/d;)V
    .locals 1

    iput-object p1, p0, LI6/p$h;->G:LO6/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LO6/d;->i()LT6/A;

    move-result-object v0

    iput-object v0, p0, LI6/p$h;->C:LT6/A;

    invoke-virtual {p1}, LO6/d;->j()LT6/M;

    move-result-object v0

    invoke-virtual {v0}, LT6/M;->b()LT6/g0;

    move-result-object v0

    iput-object v0, p0, LI6/p$h;->D:LT6/g0;

    invoke-virtual {p1}, LO6/d;->d()LW6/b;

    move-result-object v0

    iput-object v0, p0, LI6/p$h;->E:LW6/b;

    invoke-virtual {p1}, LO6/d;->a()LT6/q;

    move-result-object p1

    invoke-virtual {p1}, LT6/q;->q()LT6/p;

    move-result-object p1

    iput-object p1, p0, LI6/p$h;->F:LT6/p;

    return-void
.end method


# virtual methods
.method public H0()LD6/b;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call is not initialized"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a()LT6/p;
    .locals 1

    iget-object v0, p0, LI6/p$h;->F:LT6/p;

    return-object v0
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    invoke-static {p0}, LO6/b$a;->a(LO6/b;)Lm7/i;

    move-result-object v0

    return-object v0
.end method

.method public r()LT6/g0;
    .locals 1

    iget-object v0, p0, LI6/p$h;->D:LT6/g0;

    return-object v0
.end method

.method public u0()LT6/A;
    .locals 1

    iget-object v0, p0, LI6/p$h;->C:LT6/A;

    return-object v0
.end method

.method public x0()LW6/b;
    .locals 1

    iget-object v0, p0, LI6/p$h;->E:LW6/b;

    return-object v0
.end method
