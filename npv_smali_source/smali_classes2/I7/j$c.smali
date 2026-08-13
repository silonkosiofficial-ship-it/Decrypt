.class final LI7/j$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/j;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/j;


# direct methods
.method constructor <init>(LI7/j;)V
    .locals 0

    iput-object p1, p0, LI7/j$c;->D:LI7/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 11

    .prologue
    iget-object v0, p0, LI7/j$c;->D:LI7/j;

    invoke-virtual {v0}, LI7/j;->A()LO7/b;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, LI7/j$c;->D:LI7/j;

    invoke-virtual {v2}, LI7/j;->E()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_1

    invoke-static {v0}, LI7/M;->i(LO7/a;)LO7/X;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v5, LI7/u;

    iget-object v6, p0, LI7/j$c;->D:LI7/j;

    sget-object v7, LF7/j$a;->C:LF7/j$a;

    new-instance v8, LI7/j$c$a;

    invoke-direct {v8, v2}, LI7/j$c$a;-><init>(LO7/X;)V

    invoke-direct {v5, v6, v4, v7, v8}, LI7/u;-><init>(LI7/j;ILF7/j$a;Lx7/a;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    invoke-interface {v0}, LO7/a;->v0()LO7/X;

    move-result-object v5

    if-eqz v5, :cond_2

    new-instance v6, LI7/u;

    iget-object v7, p0, LI7/j$c;->D:LI7/j;

    add-int/lit8 v8, v2, 0x1

    sget-object v9, LF7/j$a;->D:LF7/j$a;

    new-instance v10, LI7/j$c$b;

    invoke-direct {v10, v5}, LI7/j$c$b;-><init>(LO7/X;)V

    invoke-direct {v6, v7, v2, v9, v10}, LI7/u;-><init>(LI7/j;ILF7/j$a;Lx7/a;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v8

    goto :goto_1

    :cond_1
    move v2, v4

    :cond_2
    :goto_1
    invoke-interface {v0}, LO7/a;->n()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    :goto_2
    if-ge v4, v5, :cond_3

    new-instance v6, LI7/u;

    iget-object v7, p0, LI7/j$c;->D:LI7/j;

    add-int/lit8 v8, v2, 0x1

    sget-object v9, LF7/j$a;->E:LF7/j$a;

    new-instance v10, LI7/j$c$c;

    invoke-direct {v10, v0, v4}, LI7/j$c$c;-><init>(LO7/b;I)V

    invoke-direct {v6, v7, v2, v9, v10}, LI7/u;-><init>(LI7/j;ILF7/j$a;Lx7/a;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    move v2, v8

    goto :goto_2

    :cond_3
    iget-object v2, p0, LI7/j$c;->D:LI7/j;

    invoke-virtual {v2}, LI7/j;->D()Z

    move-result v2

    if-eqz v2, :cond_4

    instance-of v0, v0, LZ7/a;

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v3, :cond_4

    new-instance v0, LI7/j$c$d;

    invoke-direct {v0}, LI7/j$c$d;-><init>()V

    invoke-static {v1, v0}, Lj7/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->trimToSize()V

    return-object v1
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/j$c;->a()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
