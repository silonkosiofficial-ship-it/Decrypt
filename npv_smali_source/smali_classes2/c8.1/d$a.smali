.class final Lc8/d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc8/d;->d(Le8/j;Ljava/util/List;LF8/e0;Lc8/a;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lc8/d;

.field final synthetic E:LO7/f0;

.field final synthetic F:Lc8/a;

.field final synthetic G:LF8/e0;

.field final synthetic H:Le8/j;


# direct methods
.method constructor <init>(Lc8/d;LO7/f0;Lc8/a;LF8/e0;Le8/j;)V
    .locals 0

    iput-object p1, p0, Lc8/d$a;->D:Lc8/d;

    iput-object p2, p0, Lc8/d$a;->E:LO7/f0;

    iput-object p3, p0, Lc8/d$a;->F:Lc8/a;

    iput-object p4, p0, Lc8/d$a;->G:LF8/e0;

    iput-object p5, p0, Lc8/d$a;->H:Le8/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LF8/E;
    .locals 4

    .prologue
    iget-object v0, p0, Lc8/d$a;->D:Lc8/d;

    invoke-static {v0}, Lc8/d;->a(Lc8/d;)LF8/h0;

    move-result-object v0

    iget-object v1, p0, Lc8/d$a;->E:LO7/f0;

    iget-object v2, p0, Lc8/d$a;->F:Lc8/a;

    iget-object v3, p0, Lc8/d$a;->G:LF8/e0;

    invoke-interface {v3}, LF8/e0;->w()LO7/h;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v3}, LO7/h;->w()LF8/M;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Lc8/a;->k(LF8/M;)Lc8/a;

    move-result-object v2

    iget-object v3, p0, Lc8/d$a;->H:Le8/j;

    invoke-interface {v3}, Le8/j;->B()Z

    move-result v3

    invoke-virtual {v2, v3}, Lc8/a;->j(Z)Lc8/a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LF8/h0;->c(LO7/f0;LF8/w;)LF8/E;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lc8/d$a;->a()LF8/E;

    move-result-object v0

    return-object v0
.end method
