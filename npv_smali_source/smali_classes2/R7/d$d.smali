.class public final LR7/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/d;-><init>(LE8/n;LO7/m;LP7/g;Ln8/f;LO7/a0;LO7/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LR7/d;


# direct methods
.method constructor <init>(LR7/d;)V
    .locals 0

    iput-object p1, p0, LR7/d$d;->a:LR7/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()LO7/e0;
    .locals 1

    iget-object v0, p0, LR7/d$d;->a:LR7/d;

    return-object v0
.end method

.method public t()LL7/g;
    .locals 1

    invoke-virtual {p0}, LR7/d$d;->b()LO7/e0;

    move-result-object v0

    invoke-static {v0}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[typealias "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LR7/d$d;->b()LO7/e0;

    move-result-object v1

    invoke-interface {v1}, LO7/I;->getName()Ln8/f;

    move-result-object v1

    invoke-virtual {v1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/util/Collection;
    .locals 2

    invoke-virtual {p0}, LR7/d$d;->b()LO7/e0;

    move-result-object v0

    invoke-interface {v0}, LO7/e0;->o0()LF8/M;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->u()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getSupertypes(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public v(LG8/g;)LF8/e0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public bridge synthetic w()LO7/h;
    .locals 1

    invoke-virtual {p0}, LR7/d$d;->b()LO7/e0;

    move-result-object v0

    return-object v0
.end method

.method public x()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LR7/d$d;->a:LR7/d;

    invoke-virtual {v0}, LR7/d;->V0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public y()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
