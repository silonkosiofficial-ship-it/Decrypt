.class final LD8/m$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/m;-><init>(LB8/m;Li8/s;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD8/m;


# direct methods
.method constructor <init>(LD8/m;)V
    .locals 0

    iput-object p1, p0, LD8/m$a;->D:LD8/m;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LD8/m$a;->D:LD8/m;

    invoke-static {v0}, LD8/m;->V0(LD8/m;)LB8/m;

    move-result-object v0

    invoke-virtual {v0}, LB8/m;->c()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->d()LB8/c;

    move-result-object v0

    iget-object v1, p0, LD8/m$a;->D:LD8/m;

    invoke-virtual {v1}, LD8/m;->X0()Li8/s;

    move-result-object v1

    iget-object v2, p0, LD8/m$a;->D:LD8/m;

    invoke-static {v2}, LD8/m;->V0(LD8/m;)LB8/m;

    move-result-object v2

    invoke-virtual {v2}, LB8/m;->g()Lk8/c;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LB8/f;->a(Li8/s;Lk8/c;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD8/m$a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
