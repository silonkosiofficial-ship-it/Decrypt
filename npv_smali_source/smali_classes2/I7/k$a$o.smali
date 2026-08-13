.class final LI7/k$a$o;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/k$a;-><init>(LI7/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/k$a;


# direct methods
.method constructor <init>(LI7/k$a;)V
    .locals 0

    iput-object p1, p0, LI7/k$a$o;->D:LI7/k$a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 4

    .prologue
    iget-object v0, p0, LI7/k$a$o;->D:LI7/k$a;

    invoke-virtual {v0}, LI7/k$a;->k()LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/e;->O()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getSealedSubclasses(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/e;

    const-string v3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v2, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LI7/M;->q(LO7/e;)Ljava/lang/Class;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, LI7/k;

    invoke-direct {v3, v2}, LI7/k;-><init>(Ljava/lang/Class;)V

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/k$a$o;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
