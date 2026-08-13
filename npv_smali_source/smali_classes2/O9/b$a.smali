.class abstract LO9/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX9/Z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "a"
.end annotation


# instance fields
.field private final C:LX9/n;

.field private D:Z

.field final synthetic E:LO9/b;


# direct methods
.method public constructor <init>(LO9/b;)V
    .locals 1

    iput-object p1, p0, LO9/b$a;->E:LO9/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LX9/n;

    invoke-static {p1}, LO9/b;->m(LO9/b;)LX9/f;

    move-result-object p1

    invoke-interface {p1}, LX9/Z;->k()LX9/a0;

    move-result-object p1

    invoke-direct {v0, p1}, LX9/n;-><init>(LX9/a0;)V

    iput-object v0, p0, LO9/b$a;->C:LX9/n;

    return-void
.end method


# virtual methods
.method protected final a()Z
    .locals 1

    iget-boolean v0, p0, LO9/b$a;->D:Z

    return v0
.end method

.method public b0(LX9/d;J)J
    .locals 1

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, LO9/b$a;->E:LO9/b;

    invoke-static {v0}, LO9/b;->m(LO9/b;)LX9/f;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LX9/Z;->b0(LX9/d;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, p0, LO9/b$a;->E:LO9/b;

    invoke-virtual {p2}, LO9/b;->e()LM9/f;

    move-result-object p2

    invoke-virtual {p2}, LM9/f;->z()V

    invoke-virtual {p0}, LO9/b$a;->f()V

    throw p1
.end method

.method public final f()V
    .locals 3

    .prologue
    iget-object v0, p0, LO9/b$a;->E:LO9/b;

    invoke-static {v0}, LO9/b;->n(LO9/b;)I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LO9/b$a;->E:LO9/b;

    invoke-static {v0}, LO9/b;->n(LO9/b;)I

    move-result v0

    const/4 v2, 0x5

    if-ne v0, v2, :cond_1

    iget-object v0, p0, LO9/b$a;->E:LO9/b;

    iget-object v2, p0, LO9/b$a;->C:LX9/n;

    invoke-static {v0, v2}, LO9/b;->i(LO9/b;LX9/n;)V

    iget-object v0, p0, LO9/b$a;->E:LO9/b;

    invoke-static {v0, v1}, LO9/b;->p(LO9/b;I)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LO9/b$a;->E:LO9/b;

    invoke-static {v2}, LO9/b;->n(LO9/b;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final g(Z)V
    .locals 0

    iput-boolean p1, p0, LO9/b$a;->D:Z

    return-void
.end method

.method public k()LX9/a0;
    .locals 1

    iget-object v0, p0, LO9/b$a;->C:LX9/n;

    return-object v0
.end method
