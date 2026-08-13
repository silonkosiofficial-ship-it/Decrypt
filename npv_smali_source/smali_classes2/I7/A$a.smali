.class final LI7/A$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/A;-><init>(LF8/E;Lx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/A$a$b;
    }
.end annotation


# instance fields
.field final synthetic D:LI7/A;

.field final synthetic E:Lx7/a;


# direct methods
.method constructor <init>(LI7/A;Lx7/a;)V
    .locals 0

    iput-object p1, p0, LI7/A$a;->D:LI7/A;

    iput-object p2, p0, LI7/A$a;->E:Lx7/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method

.method public static final synthetic a(Li7/n;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, LI7/A$a;->f(Li7/n;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Li7/n;)Ljava/util/List;
    .locals 0

    invoke-interface {p0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/A$a;->e()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/util/List;
    .locals 11

    .prologue
    iget-object v0, p0, LI7/A$a;->D:LI7/A;

    invoke-virtual {v0}, LI7/A;->f()LF8/E;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v1, Li7/r;->D:Li7/r;

    new-instance v2, LI7/A$a$c;

    iget-object v3, p0, LI7/A$a;->D:LI7/A;

    invoke-direct {v2, v3}, LI7/A$a$c;-><init>(LI7/A;)V

    invoke-static {v1, v2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v1

    check-cast v0, Ljava/lang/Iterable;

    iget-object v2, p0, LI7/A$a;->E:Lx7/a;

    iget-object v3, p0, LI7/A$a;->D:LI7/A;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v5, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-gez v5, :cond_1

    invoke-static {}, Lj7/v;->w()V

    :cond_1
    check-cast v6, LF8/i0;

    invoke-interface {v6}, LF8/i0;->b()Z

    move-result v8

    if-eqz v8, :cond_2

    sget-object v5, LF7/q;->c:LF7/q$a;

    invoke-virtual {v5}, LF7/q$a;->c()LF7/q;

    move-result-object v5

    goto :goto_2

    :cond_2
    new-instance v8, LI7/A;

    invoke-interface {v6}, LF8/i0;->getType()LF8/E;

    move-result-object v9

    const-string v10, "getType(...)"

    invoke-static {v9, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v2, :cond_3

    const/4 v5, 0x0

    goto :goto_1

    :cond_3
    new-instance v10, LI7/A$a$a;

    invoke-direct {v10, v3, v5, v1}, LI7/A$a$a;-><init>(LI7/A;ILi7/n;)V

    move-object v5, v10

    :goto_1
    invoke-direct {v8, v9, v5}, LI7/A;-><init>(LF8/E;Lx7/a;)V

    invoke-interface {v6}, LF8/i0;->a()LF8/u0;

    move-result-object v5

    sget-object v6, LI7/A$a$b;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_6

    const/4 v6, 0x2

    if-eq v5, v6, :cond_5

    const/4 v6, 0x3

    if-ne v5, v6, :cond_4

    sget-object v5, LF7/q;->c:LF7/q$a;

    invoke-virtual {v5, v8}, LF7/q$a;->b(LF7/o;)LF7/q;

    move-result-object v5

    goto :goto_2

    :cond_4
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_5
    sget-object v5, LF7/q;->c:LF7/q$a;

    invoke-virtual {v5, v8}, LF7/q$a;->a(LF7/o;)LF7/q;

    move-result-object v5

    goto :goto_2

    :cond_6
    sget-object v5, LF7/q;->c:LF7/q$a;

    invoke-virtual {v5, v8}, LF7/q$a;->d(LF7/o;)LF7/q;

    move-result-object v5

    :goto_2
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v5, v7

    goto :goto_0

    :cond_7
    return-object v4
.end method
