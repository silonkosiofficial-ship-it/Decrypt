.class final LN/r$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/r;->l(LN/w;LN/j;LN/k$a;)LN/k$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN/j;

.field final synthetic E:I

.field final synthetic F:I

.field final synthetic G:LN/w;

.field final synthetic H:Li7/n;


# direct methods
.method constructor <init>(LN/j;IILN/w;Li7/n;)V
    .locals 0

    iput-object p1, p0, LN/r$a;->D:LN/j;

    iput p2, p0, LN/r$a;->E:I

    iput p3, p0, LN/r$a;->F:I

    iput-object p4, p0, LN/r$a;->G:LN/w;

    iput-object p5, p0, LN/r$a;->H:Li7/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LN/k$a;
    .locals 7

    .prologue
    iget-object v0, p0, LN/r$a;->D:LN/j;

    iget-object v1, p0, LN/r$a;->H:Li7/n;

    invoke-static {v1}, LN/r;->d(Li7/n;)I

    move-result v1

    iget v2, p0, LN/r$a;->E:I

    iget v3, p0, LN/r$a;->F:I

    iget-object v4, p0, LN/r$a;->G:LN/w;

    invoke-interface {v4}, LN/w;->b()Z

    move-result v4

    iget-object v5, p0, LN/r$a;->G:LN/w;

    invoke-interface {v5}, LN/w;->i()LN/e;

    move-result-object v5

    sget-object v6, LN/e;->C:LN/e;

    if-ne v5, v6, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    invoke-static/range {v0 .. v5}, LN/r;->b(LN/j;IIIZZ)LN/k$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/r$a;->a()LN/k$a;

    move-result-object v0

    return-object v0
.end method
