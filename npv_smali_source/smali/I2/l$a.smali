.class public final LI2/l$a;
.super LI2/u$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI2/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    invoke-direct {p0, p1}, LI2/u$a;-><init>(Ljava/lang/Class;)V

    iget-object p1, p0, LI2/u$a;->c:LQ2/p;

    const-class v0, Landroidx/work/OverwritingInputMerger;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, LQ2/p;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method bridge synthetic c()LI2/u;
    .locals 1

    invoke-virtual {p0}, LI2/l$a;->g()LI2/l;

    move-result-object v0

    return-object v0
.end method

.method bridge synthetic d()LI2/u$a;
    .locals 1

    invoke-virtual {p0}, LI2/l$a;->h()LI2/l$a;

    move-result-object v0

    return-object v0
.end method

.method g()LI2/l;
    .locals 2

    .prologue
    iget-boolean v0, p0, LI2/u$a;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LI2/u$a;->c:LQ2/p;

    iget-object v0, v0, LQ2/p;->j:LI2/b;

    invoke-virtual {v0}, LI2/b;->h()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set backoff criteria on an idle mode job"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v0, LI2/l;

    invoke-direct {v0, p0}, LI2/l;-><init>(LI2/l$a;)V

    return-object v0
.end method

.method h()LI2/l$a;
    .locals 0

    return-object p0
.end method
