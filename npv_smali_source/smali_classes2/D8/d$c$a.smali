.class final LD8/d$c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/d$c;-><init>(LD8/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD8/d$c;

.field final synthetic E:LD8/d;


# direct methods
.method constructor <init>(LD8/d$c;LD8/d;)V
    .locals 0

    iput-object p1, p0, LD8/d$c$a;->D:LD8/d$c;

    iput-object p2, p0, LD8/d$c$a;->E:LD8/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln8/f;)LO7/e;
    .locals 7

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD8/d$c$a;->D:LD8/d$c;

    invoke-static {v0}, LD8/d$c;->b(LD8/d$c;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/g;

    if-eqz v0, :cond_0

    iget-object v2, p0, LD8/d$c$a;->E:LD8/d;

    iget-object v1, p0, LD8/d$c$a;->D:LD8/d$c;

    invoke-virtual {v2}, LD8/d;->i1()LB8/m;

    move-result-object v3

    invoke-virtual {v3}, LB8/m;->h()LE8/n;

    move-result-object v3

    invoke-static {v1}, LD8/d$c;->c(LD8/d$c;)LE8/i;

    move-result-object v4

    new-instance v5, LD8/a;

    invoke-virtual {v2}, LD8/d;->i1()LB8/m;

    move-result-object v1

    invoke-virtual {v1}, LB8/m;->h()LE8/n;

    move-result-object v1

    new-instance v6, LD8/d$c$a$a;

    invoke-direct {v6, v2, v0}, LD8/d$c$a$a;-><init>(LD8/d;Li8/g;)V

    invoke-direct {v5, v1, v6}, LD8/a;-><init>(LE8/n;Lx7/a;)V

    sget-object v6, LO7/a0;->a:LO7/a0;

    move-object v1, v3

    move-object v3, p1

    invoke-static/range {v1 .. v6}, LR7/n;->U0(LE8/n;LO7/e;Ln8/f;LE8/i;LP7/g;LO7/a0;)LR7/n;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/f;

    invoke-virtual {p0, p1}, LD8/d$c$a;->a(Ln8/f;)LO7/e;

    move-result-object p1

    return-object p1
.end method
