.class final LO7/J$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO7/J;-><init>(LE8/n;LO7/G;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LO7/J;


# direct methods
.method constructor <init>(LO7/J;)V
    .locals 0

    iput-object p1, p0, LO7/J$c;->D:LO7/J;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/J$a;)LO7/e;
    .locals 8

    .prologue
    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LO7/J$a;->a()Ln8/b;

    move-result-object v0

    invoke-virtual {p1}, LO7/J$a;->b()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0}, Ln8/b;->k()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ln8/b;->g()Ln8/b;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, LO7/J$c;->D:LO7/J;

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lj7/v;->c0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, LO7/J;->d(Ln8/b;Ljava/util/List;)LO7/e;

    move-result-object v1

    if-eqz v1, :cond_0

    :goto_0
    move-object v4, v1

    goto :goto_1

    :cond_0
    iget-object v1, p0, LO7/J$c;->D:LO7/J;

    invoke-static {v1}, LO7/J;->b(LO7/J;)LE8/g;

    move-result-object v1

    invoke-virtual {v0}, Ln8/b;->h()Ln8/c;

    move-result-object v2

    const-string v3, "getPackageFqName(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/g;

    goto :goto_0

    :goto_1
    invoke-virtual {v0}, Ln8/b;->l()Z

    move-result v6

    new-instance v1, LO7/J$b;

    iget-object v2, p0, LO7/J$c;->D:LO7/J;

    invoke-static {v2}, LO7/J;->c(LO7/J;)LE8/n;

    move-result-object v3

    invoke-virtual {v0}, Ln8/b;->j()Ln8/f;

    move-result-object v5

    const-string v0, "getShortClassName(...)"

    invoke-static {v5, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_2
    move v7, p1

    goto :goto_3

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :goto_3
    move-object v2, v1

    invoke-direct/range {v2 .. v7}, LO7/J$b;-><init>(LE8/n;LO7/m;Ln8/f;ZI)V

    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unresolved local class: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/J$a;

    invoke-virtual {p0, p1}, LO7/J$c;->a(LO7/J$a;)LO7/e;

    move-result-object p1

    return-object p1
.end method
