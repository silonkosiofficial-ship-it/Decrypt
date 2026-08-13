.class final LD8/d$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/d;-><init>(LB8/m;Li8/c;Lk8/c;Lk8/a;LO7/a0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD8/d;


# direct methods
.method constructor <init>(LD8/d;)V
    .locals 0

    iput-object p1, p0, LD8/d$d;->D:LD8/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LD8/d$d;->D:LD8/d;

    invoke-virtual {v0}, LD8/d;->i1()LB8/m;

    move-result-object v0

    invoke-virtual {v0}, LB8/m;->c()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->d()LB8/c;

    move-result-object v0

    iget-object v1, p0, LD8/d$d;->D:LD8/d;

    invoke-virtual {v1}, LD8/d;->n1()LB8/A$a;

    move-result-object v1

    invoke-interface {v0, v1}, LB8/f;->h(LB8/A$a;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD8/d$d;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
