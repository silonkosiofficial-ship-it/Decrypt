.class final LY7/i$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY7/i;-><init>(Le8/a;La8/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LY7/i;


# direct methods
.method constructor <init>(LY7/i;)V
    .locals 0

    iput-object p1, p0, LY7/i$a;->D:LY7/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 3

    .prologue
    iget-object v0, p0, LY7/i$a;->D:LY7/i;

    invoke-virtual {v0}, LY7/b;->b()Le8/b;

    move-result-object v0

    instance-of v1, v0, Le8/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    sget-object v0, LY7/d;->a:LY7/d;

    iget-object v1, p0, LY7/i$a;->D:LY7/i;

    invoke-virtual {v1}, LY7/b;->b()Le8/b;

    move-result-object v1

    check-cast v1, Le8/e;

    invoke-interface {v1}, Le8/e;->e()Ljava/util/List;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, LY7/d;->c(Ljava/util/List;)Lt8/g;

    move-result-object v0

    goto :goto_1

    :cond_0
    instance-of v0, v0, Le8/m;

    if-eqz v0, :cond_1

    sget-object v0, LY7/d;->a:LY7/d;

    iget-object v1, p0, LY7/i$a;->D:LY7/i;

    invoke-virtual {v1}, LY7/b;->b()Le8/b;

    move-result-object v1

    invoke-static {v1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_2

    sget-object v1, LY7/c;->a:LY7/c;

    invoke-virtual {v1}, LY7/c;->d()Ln8/f;

    move-result-object v1

    invoke-static {v1, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    invoke-static {v0}, Lj7/S;->e(Li7/u;)Ljava/util/Map;

    move-result-object v2

    :cond_2
    if-nez v2, :cond_3

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v2

    :cond_3
    return-object v2
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LY7/i$a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
