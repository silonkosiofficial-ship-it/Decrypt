.class final Lb8/e$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/e;-><init>(La8/g;Le8/a;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb8/e;


# direct methods
.method constructor <init>(Lb8/e;)V
    .locals 0

    iput-object p1, p0, Lb8/e$c;->D:Lb8/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LF8/M;
    .locals 7

    .prologue
    iget-object v0, p0, Lb8/e$c;->D:Lb8/e;

    invoke-virtual {v0}, Lb8/e;->e()Ln8/c;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LH8/j;->h1:LH8/j;

    iget-object v1, p0, Lb8/e$c;->D:Lb8/e;

    invoke-static {v1}, Lb8/e;->f(Lb8/e;)Le8/a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v1, LN7/d;->a:LN7/d;

    iget-object v2, p0, Lb8/e$c;->D:Lb8/e;

    invoke-static {v2}, Lb8/e;->c(Lb8/e;)La8/g;

    move-result-object v2

    invoke-virtual {v2}, La8/g;->d()LO7/G;

    move-result-object v2

    invoke-interface {v2}, LO7/G;->t()LL7/g;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, LN7/d;->f(LN7/d;Ln8/c;LL7/g;Ljava/lang/Integer;ILjava/lang/Object;)LO7/e;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lb8/e$c;->D:Lb8/e;

    invoke-static {v1}, Lb8/e;->f(Lb8/e;)Le8/a;

    move-result-object v1

    invoke-interface {v1}, Le8/a;->D()Le8/g;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Lb8/e$c;->D:Lb8/e;

    invoke-static {v2}, Lb8/e;->c(Lb8/e;)La8/g;

    move-result-object v2

    invoke-virtual {v2}, La8/g;->a()La8/b;

    move-result-object v2

    invoke-virtual {v2}, La8/b;->n()La8/i;

    move-result-object v2

    invoke-interface {v2, v1}, La8/i;->a(Le8/g;)LO7/e;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    iget-object v1, p0, Lb8/e$c;->D:Lb8/e;

    invoke-static {v1, v0}, Lb8/e;->b(Lb8/e;Ln8/c;)LO7/e;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, LO7/e;->w()LF8/M;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/e$c;->a()LF8/M;

    move-result-object v0

    return-object v0
.end method
