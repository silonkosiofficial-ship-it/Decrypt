.class final LD8/d$c$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/d$c$a;->a(Ln8/f;)LO7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD8/d;

.field final synthetic E:Li8/g;


# direct methods
.method constructor <init>(LD8/d;Li8/g;)V
    .locals 0

    iput-object p1, p0, LD8/d$c$a$a;->D:LD8/d;

    iput-object p2, p0, LD8/d$c$a$a;->E:Li8/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LD8/d$c$a$a;->D:LD8/d;

    invoke-virtual {v0}, LD8/d;->i1()LB8/m;

    move-result-object v0

    invoke-virtual {v0}, LB8/m;->c()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->d()LB8/c;

    move-result-object v0

    iget-object v1, p0, LD8/d$c$a$a;->D:LD8/d;

    invoke-virtual {v1}, LD8/d;->n1()LB8/A$a;

    move-result-object v1

    iget-object v2, p0, LD8/d$c$a$a;->E:Li8/g;

    invoke-interface {v0, v1, v2}, LB8/f;->c(LB8/A;Li8/g;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD8/d$c$a$a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
