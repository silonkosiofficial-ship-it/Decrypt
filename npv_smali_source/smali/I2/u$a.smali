.class public abstract LI2/u$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI2/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:Ljava/util/UUID;

.field c:LQ2/p;

.field d:Ljava/util/Set;

.field e:Ljava/lang/Class;


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LI2/u$a;->a:Z

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LI2/u$a;->d:Ljava/util/Set;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, LI2/u$a;->b:Ljava/util/UUID;

    iput-object p1, p0, LI2/u$a;->e:Ljava/lang/Class;

    new-instance v0, LQ2/p;

    iget-object v1, p0, LI2/u$a;->b:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LQ2/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, LI2/u$a;->c:LQ2/p;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LI2/u$a;->a(Ljava/lang/String;)LI2/u$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LI2/u$a;
    .locals 1

    iget-object v0, p0, LI2/u$a;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LI2/u$a;->d()LI2/u$a;

    move-result-object p1

    return-object p1
.end method

.method public final b()LI2/u;
    .locals 4

    .prologue
    invoke-virtual {p0}, LI2/u$a;->c()LI2/u;

    move-result-object v0

    iget-object v1, p0, LI2/u$a;->c:LQ2/p;

    iget-object v1, v1, LQ2/p;->j:LI2/b;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_0

    invoke-virtual {v1}, LI2/b;->e()Z

    move-result v2

    if-nez v2, :cond_2

    :cond_0
    invoke-virtual {v1}, LI2/b;->f()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, LI2/b;->g()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, LI2/b;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iget-object v2, p0, LI2/u$a;->c:LQ2/p;

    iget-boolean v2, v2, LQ2/p;->q:Z

    if-eqz v2, :cond_4

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Expedited jobs only support network and storage constraints"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    iput-object v1, p0, LI2/u$a;->b:Ljava/util/UUID;

    new-instance v1, LQ2/p;

    iget-object v2, p0, LI2/u$a;->c:LQ2/p;

    invoke-direct {v1, v2}, LQ2/p;-><init>(LQ2/p;)V

    iput-object v1, p0, LI2/u$a;->c:LQ2/p;

    iget-object v2, p0, LI2/u$a;->b:Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, LQ2/p;->a:Ljava/lang/String;

    return-object v0
.end method

.method abstract c()LI2/u;
.end method

.method abstract d()LI2/u$a;
.end method

.method public final e(LI2/b;)LI2/u$a;
    .locals 1

    iget-object v0, p0, LI2/u$a;->c:LQ2/p;

    iput-object p1, v0, LQ2/p;->j:LI2/b;

    invoke-virtual {p0}, LI2/u$a;->d()LI2/u$a;

    move-result-object p1

    return-object p1
.end method

.method public final f(Landroidx/work/b;)LI2/u$a;
    .locals 1

    iget-object v0, p0, LI2/u$a;->c:LQ2/p;

    iput-object p1, v0, LQ2/p;->e:Landroidx/work/b;

    invoke-virtual {p0}, LI2/u$a;->d()LI2/u$a;

    move-result-object p1

    return-object p1
.end method
