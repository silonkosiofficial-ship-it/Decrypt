.class final LB8/E$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB8/E;->l(Li8/q;Z)LF8/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LB8/E;

.field final synthetic E:Li8/q;


# direct methods
.method constructor <init>(LB8/E;Li8/q;)V
    .locals 0

    iput-object p1, p0, LB8/E$b;->D:LB8/E;

    iput-object p2, p0, LB8/E$b;->E:Li8/q;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LB8/E$b;->D:LB8/E;

    invoke-static {v0}, LB8/E;->c(LB8/E;)LB8/m;

    move-result-object v0

    invoke-virtual {v0}, LB8/m;->c()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->d()LB8/c;

    move-result-object v0

    iget-object v1, p0, LB8/E$b;->E:Li8/q;

    iget-object v2, p0, LB8/E$b;->D:LB8/E;

    invoke-static {v2}, LB8/E;->c(LB8/E;)LB8/m;

    move-result-object v2

    invoke-virtual {v2}, LB8/m;->g()Lk8/c;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LB8/f;->g(Li8/q;Lk8/c;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LB8/E$b;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
