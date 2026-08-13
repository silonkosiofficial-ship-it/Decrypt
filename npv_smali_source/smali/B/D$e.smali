.class final LB/D$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/D;-><init>(IILB/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LB/D;

.field final synthetic E:I


# direct methods
.method constructor <init>(LB/D;I)V
    .locals 0

    iput-object p1, p0, LB/D$e;->D:LB/D;

    iput p2, p0, LB/D$e;->E:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD/K;)V
    .locals 6

    .prologue
    iget-object v0, p0, LB/D$e;->D:LB/D;

    invoke-static {v0}, LB/D;->g(LB/D;)LB/x;

    move-result-object v0

    iget v1, p0, LB/D$e;->E:I

    sget-object v2, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v2}, Lf0/k$a;->d()Lf0/k;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lf0/k;->h()Lx7/l;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Lf0/k$a;->f(Lf0/k;)Lf0/k;

    move-result-object v5

    invoke-virtual {v2, v3, v5, v4}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    invoke-interface {v0, p1, v1}, LB/x;->a(LD/K;I)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD/K;

    invoke-virtual {p0, p1}, LB/D$e;->a(LD/K;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
