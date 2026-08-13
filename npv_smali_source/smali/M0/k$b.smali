.class final LM0/k$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM0/k;-><init>(LM0/d;LM0/P;Ljava/util/List;LY0/e;LR0/h$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LM0/k;


# direct methods
.method constructor <init>(LM0/k;)V
    .locals 0

    iput-object p1, p0, LM0/k$b;->D:LM0/k;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 8

    .prologue
    iget-object v0, p0, LM0/k$b;->D:LM0/k;

    invoke-virtual {v0}, LM0/k;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LM0/r;

    invoke-virtual {v2}, LM0/r;->b()LM0/s;

    move-result-object v2

    invoke-interface {v2}, LM0/s;->a()F

    move-result v2

    invoke-static {v0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v3

    const/4 v4, 0x1

    if-gt v4, v3, :cond_2

    :goto_0
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, LM0/r;

    invoke-virtual {v6}, LM0/r;->b()LM0/s;

    move-result-object v6

    invoke-interface {v6}, LM0/s;->a()F

    move-result v6

    invoke-static {v2, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v7

    if-gez v7, :cond_1

    move-object v1, v5

    move v2, v6

    :cond_1
    if-eq v4, v3, :cond_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, LM0/r;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LM0/r;->b()LM0/s;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, LM0/s;->a()F

    move-result v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM0/k$b;->a()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
