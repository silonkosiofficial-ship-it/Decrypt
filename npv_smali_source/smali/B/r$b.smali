.class final LB/r$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/r;->e(ILB/u;IIIIIIFJZLjava/util/List;LA/b$m;LA/b$e;ZLY0/e;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLB/q;LW8/N;LV/w0;Lo0/C1;Lx7/q;)LB/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/util/List;

.field final synthetic E:LB/t;

.field final synthetic F:Z

.field final synthetic G:LV/w0;


# direct methods
.method constructor <init>(Ljava/util/List;LB/t;ZLV/w0;)V
    .locals 0

    iput-object p1, p0, LB/r$b;->D:Ljava/util/List;

    iput-object p2, p0, LB/r$b;->E:LB/t;

    iput-boolean p3, p0, LB/r$b;->F:Z

    iput-object p4, p0, LB/r$b;->G:LV/w0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 6

    .prologue
    iget-object v0, p0, LB/r$b;->D:Ljava/util/List;

    iget-object v1, p0, LB/r$b;->E:LB/t;

    iget-boolean v2, p0, LB/r$b;->F:Z

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LB/t;

    if-eq v5, v1, :cond_0

    invoke-virtual {v5, p1, v2}, LB/t;->r(LD0/X$a;Z)V

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LB/r$b;->E:LB/t;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, LB/r$b;->F:Z

    invoke-virtual {v0, p1, v1}, LB/t;->r(LD0/X$a;Z)V

    :cond_2
    iget-object p1, p0, LB/r$b;->G:LV/w0;

    invoke-static {p1}, LD/L;->a(LV/w0;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LB/r$b;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
