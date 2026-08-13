.class final LD8/h$b$j;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/h$b;-><init>(LD8/h;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD8/h$b;

.field final synthetic E:LD8/h;


# direct methods
.method constructor <init>(LD8/h$b;LD8/h;)V
    .locals 0

    iput-object p1, p0, LD8/h$b$j;->D:LD8/h$b;

    iput-object p2, p0, LD8/h$b$j;->E:LD8/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 5

    .prologue
    iget-object v0, p0, LD8/h$b$j;->D:LD8/h$b;

    invoke-static {v0}, LD8/h$b;->s(LD8/h$b;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object v0, v0, LD8/h$b;->n:LD8/h;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    invoke-virtual {v0}, LD8/h;->p()LB8/m;

    move-result-object v4

    invoke-virtual {v4}, LB8/m;->g()Lk8/c;

    move-result-object v4

    check-cast v3, Li8/n;

    invoke-virtual {v3}, Li8/n;->c0()I

    move-result v3

    invoke-static {v4, v3}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LD8/h$b$j;->E:LD8/h;

    invoke-virtual {v0}, LD8/h;->u()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lj7/Z;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD8/h$b$j;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
