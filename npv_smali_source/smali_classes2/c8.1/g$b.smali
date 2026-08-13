.class final Lc8/g$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc8/g;->j(LF8/M;LO7/e;Lc8/a;)Li7/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LO7/e;

.field final synthetic E:Lc8/g;

.field final synthetic F:LF8/M;

.field final synthetic G:Lc8/a;


# direct methods
.method constructor <init>(LO7/e;Lc8/g;LF8/M;Lc8/a;)V
    .locals 0

    iput-object p1, p0, Lc8/g$b;->D:LO7/e;

    iput-object p2, p0, Lc8/g$b;->E:Lc8/g;

    iput-object p3, p0, Lc8/g$b;->F:LF8/M;

    iput-object p4, p0, Lc8/g$b;->G:Lc8/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LG8/g;)LF8/M;
    .locals 3

    .prologue
    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc8/g$b;->D:LO7/e;

    instance-of v1, v0, LO7/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_4

    invoke-static {v0}, Lv8/c;->k(LO7/h;)Ln8/b;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, LG8/g;->b(Ln8/b;)LO7/e;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v2

    :cond_2
    iget-object v0, p0, Lc8/g$b;->D:LO7/e;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-object v2

    :cond_3
    iget-object v0, p0, Lc8/g$b;->E:Lc8/g;

    iget-object v1, p0, Lc8/g$b;->F:LF8/M;

    iget-object v2, p0, Lc8/g$b;->G:Lc8/a;

    invoke-static {v0, v1, p1, v2}, Lc8/g;->i(Lc8/g;LF8/M;LO7/e;Lc8/a;)Li7/u;

    move-result-object p1

    invoke-virtual {p1}, Li7/u;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF8/M;

    return-object p1

    :cond_4
    :goto_1
    return-object v2
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG8/g;

    invoke-virtual {p0, p1}, Lc8/g$b;->a(LG8/g;)LF8/M;

    move-result-object p1

    return-object p1
.end method
