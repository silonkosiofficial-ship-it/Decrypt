.class final LB8/x$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB8/x;->l(Li8/n;)LO7/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LB8/x;

.field final synthetic E:Li8/n;

.field final synthetic F:LD8/j;


# direct methods
.method constructor <init>(LB8/x;Li8/n;LD8/j;)V
    .locals 0

    iput-object p1, p0, LB8/x$d;->D:LB8/x;

    iput-object p2, p0, LB8/x$d;->E:Li8/n;

    iput-object p3, p0, LB8/x$d;->F:LD8/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LE8/j;
    .locals 5

    iget-object v0, p0, LB8/x$d;->D:LB8/x;

    invoke-static {v0}, LB8/x;->b(LB8/x;)LB8/m;

    move-result-object v0

    invoke-virtual {v0}, LB8/m;->h()LE8/n;

    move-result-object v0

    new-instance v1, LB8/x$d$a;

    iget-object v2, p0, LB8/x$d;->D:LB8/x;

    iget-object v3, p0, LB8/x$d;->E:Li8/n;

    iget-object v4, p0, LB8/x$d;->F:LD8/j;

    invoke-direct {v1, v2, v3, v4}, LB8/x$d$a;-><init>(LB8/x;Li8/n;LD8/j;)V

    invoke-interface {v0, v1}, LE8/n;->f(Lx7/a;)LE8/j;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LB8/x$d;->a()LE8/j;

    move-result-object v0

    return-object v0
.end method
