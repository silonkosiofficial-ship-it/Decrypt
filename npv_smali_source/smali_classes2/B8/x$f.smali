.class final LB8/x$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB8/x;->o(Ljava/util/List;Lp8/p;LB8/b;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LB8/x;

.field final synthetic E:LB8/A;

.field final synthetic F:Lp8/p;

.field final synthetic G:LB8/b;

.field final synthetic H:I

.field final synthetic I:Li8/u;


# direct methods
.method constructor <init>(LB8/x;LB8/A;Lp8/p;LB8/b;ILi8/u;)V
    .locals 0

    iput-object p1, p0, LB8/x$f;->D:LB8/x;

    iput-object p2, p0, LB8/x$f;->E:LB8/A;

    iput-object p3, p0, LB8/x$f;->F:Lp8/p;

    iput-object p4, p0, LB8/x$f;->G:LB8/b;

    iput p5, p0, LB8/x$f;->H:I

    iput-object p6, p0, LB8/x$f;->I:Li8/u;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 7

    iget-object v0, p0, LB8/x$f;->D:LB8/x;

    invoke-static {v0}, LB8/x;->b(LB8/x;)LB8/m;

    move-result-object v0

    invoke-virtual {v0}, LB8/m;->c()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->d()LB8/c;

    move-result-object v1

    iget-object v2, p0, LB8/x$f;->E:LB8/A;

    iget-object v3, p0, LB8/x$f;->F:Lp8/p;

    iget-object v4, p0, LB8/x$f;->G:LB8/b;

    iget v5, p0, LB8/x$f;->H:I

    iget-object v6, p0, LB8/x$f;->I:Li8/u;

    invoke-interface/range {v1 .. v6}, LB8/f;->b(LB8/A;Lp8/p;LB8/b;ILi8/u;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LB8/x$f;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
