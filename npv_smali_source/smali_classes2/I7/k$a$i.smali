.class final LI7/k$a$i;
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
.field final synthetic D:LI7/k;


# direct methods
.method constructor <init>(LI7/k;)V
    .locals 0

    iput-object p1, p0, LI7/k$a$i;->D:LI7/k;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LO7/e;
    .locals 5

    .prologue
    iget-object v0, p0, LI7/k$a$i;->D:LI7/k;

    invoke-static {v0}, LI7/k;->E(LI7/k;)Ln8/b;

    move-result-object v0

    iget-object v1, p0, LI7/k$a$i;->D:LI7/k;

    invoke-virtual {v1}, LI7/k;->I()Li7/n;

    move-result-object v1

    invoke-interface {v1}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LI7/k$a;

    invoke-virtual {v1}, LI7/n$b;->a()LT7/k;

    move-result-object v1

    invoke-virtual {v1}, LT7/k;->b()LO7/G;

    move-result-object v2

    invoke-virtual {v0}, Ln8/b;->k()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, LI7/k$a$i;->D:LI7/k;

    invoke-virtual {v3}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Lkotlin/Metadata;

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, LT7/k;->a()LB8/k;

    move-result-object v2

    invoke-virtual {v2, v0}, LB8/k;->b(Ln8/b;)LO7/e;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-static {v2, v0}, LO7/x;->a(LO7/G;Ln8/b;)LO7/e;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    iget-object v2, p0, LI7/k$a$i;->D:LI7/k;

    invoke-static {v2, v0, v1}, LI7/k;->D(LI7/k;Ln8/b;LT7/k;)LO7/e;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/k$a$i;->a()LO7/e;

    move-result-object v0

    return-object v0
.end method
