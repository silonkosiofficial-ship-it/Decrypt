.class LR7/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/p;->V0(LR7/p$c;)LO7/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LF8/n0;

.field final synthetic D:LR7/p;


# direct methods
.method constructor <init>(LR7/p;LF8/n0;)V
    .locals 0

    iput-object p1, p0, LR7/p$a;->D:LR7/p;

    iput-object p2, p0, LR7/p$a;->C:LF8/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 4

    .prologue
    new-instance v0, LP8/f;

    invoke-direct {v0}, LP8/f;-><init>()V

    iget-object v1, p0, LR7/p$a;->D:LR7/p;

    invoke-virtual {v1}, LR7/p;->f()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/y;

    iget-object v3, p0, LR7/p$a;->C:LF8/n0;

    invoke-interface {v2, v3}, LO7/y;->c(LF8/n0;)LO7/y;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR7/p$a;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
