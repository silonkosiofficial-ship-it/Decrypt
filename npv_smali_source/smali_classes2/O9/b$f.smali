.class final LO9/b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX9/X;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "f"
.end annotation


# instance fields
.field private final C:LX9/n;

.field private D:Z

.field final synthetic E:LO9/b;


# direct methods
.method public constructor <init>(LO9/b;)V
    .locals 1

    iput-object p1, p0, LO9/b$f;->E:LO9/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LX9/n;

    invoke-static {p1}, LO9/b;->l(LO9/b;)LX9/e;

    move-result-object p1

    invoke-interface {p1}, LX9/X;->k()LX9/a0;

    move-result-object p1

    invoke-direct {v0, p1}, LX9/n;-><init>(LX9/a0;)V

    iput-object v0, p0, LO9/b$f;->C:LX9/n;

    return-void
.end method


# virtual methods
.method public F0(LX9/d;J)V
    .locals 7

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LO9/b$f;->D:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LX9/d;->d1()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, LI9/d;->l(JJJ)V

    iget-object v0, p0, LO9/b$f;->E:LO9/b;

    invoke-static {v0}, LO9/b;->l(LO9/b;)LX9/e;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LX9/X;->F0(LX9/d;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 2

    .prologue
    iget-boolean v0, p0, LO9/b$f;->D:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LO9/b$f;->D:Z

    iget-object v0, p0, LO9/b$f;->E:LO9/b;

    iget-object v1, p0, LO9/b$f;->C:LX9/n;

    invoke-static {v0, v1}, LO9/b;->i(LO9/b;LX9/n;)V

    iget-object v0, p0, LO9/b$f;->E:LO9/b;

    const/4 v1, 0x3

    invoke-static {v0, v1}, LO9/b;->p(LO9/b;I)V

    return-void
.end method

.method public flush()V
    .locals 1

    .prologue
    iget-boolean v0, p0, LO9/b$f;->D:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LO9/b$f;->E:LO9/b;

    invoke-static {v0}, LO9/b;->l(LO9/b;)LX9/e;

    move-result-object v0

    invoke-interface {v0}, LX9/e;->flush()V

    return-void
.end method

.method public k()LX9/a0;
    .locals 1

    iget-object v0, p0, LO9/b$f;->C:LX9/n;

    return-object v0
.end method
