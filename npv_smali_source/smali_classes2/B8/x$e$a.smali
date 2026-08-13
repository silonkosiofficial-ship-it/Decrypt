.class final LB8/x$e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB8/x$e;->a()LE8/j;
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

    iput-object p1, p0, LB8/x$e$a;->D:LB8/x;

    iput-object p2, p0, LB8/x$e$a;->E:Li8/n;

    iput-object p3, p0, LB8/x$e$a;->F:LD8/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lt8/g;
    .locals 5

    iget-object v0, p0, LB8/x$e$a;->D:LB8/x;

    invoke-static {v0}, LB8/x;->b(LB8/x;)LB8/m;

    move-result-object v1

    invoke-virtual {v1}, LB8/m;->e()LO7/m;

    move-result-object v1

    invoke-static {v0, v1}, LB8/x;->a(LB8/x;LO7/m;)LB8/A;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, LB8/x$e$a;->D:LB8/x;

    invoke-static {v1}, LB8/x;->b(LB8/x;)LB8/m;

    move-result-object v1

    invoke-virtual {v1}, LB8/m;->c()LB8/k;

    move-result-object v1

    invoke-virtual {v1}, LB8/k;->d()LB8/c;

    move-result-object v1

    iget-object v2, p0, LB8/x$e$a;->E:Li8/n;

    iget-object v3, p0, LB8/x$e$a;->F:LD8/j;

    invoke-virtual {v3}, LR7/C;->l()LF8/E;

    move-result-object v3

    const-string v4, "getReturnType(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v0, v2, v3}, LB8/c;->k(LB8/A;Li8/n;LF8/E;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt8/g;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LB8/x$e$a;->a()Lt8/g;

    move-result-object v0

    return-object v0
.end method
