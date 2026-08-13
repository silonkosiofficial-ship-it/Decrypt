.class final LD8/h$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/h;-><init>(LB8/m;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD8/h;


# direct methods
.method constructor <init>(LD8/h;)V
    .locals 0

    iput-object p1, p0, LD8/h$e;->D:LD8/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 3

    .prologue
    iget-object v0, p0, LD8/h$e;->D:LD8/h;

    invoke-virtual {v0}, LD8/h;->s()Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v1, p0, LD8/h$e;->D:LD8/h;

    invoke-virtual {v1}, LD8/h;->q()Ljava/util/Set;

    move-result-object v1

    iget-object v2, p0, LD8/h$e;->D:LD8/h;

    invoke-static {v2}, LD8/h;->h(LD8/h;)LD8/h$a;

    move-result-object v2

    invoke-interface {v2}, LD8/h$a;->f()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lj7/Z;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v1, v0}, Lj7/Z;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD8/h$e;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
