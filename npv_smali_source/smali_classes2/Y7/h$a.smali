.class final LY7/h$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY7/h;-><init>(Le8/a;La8/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LY7/h;


# direct methods
.method constructor <init>(LY7/h;)V
    .locals 0

    iput-object p1, p0, LY7/h$a;->D:LY7/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 2

    .prologue
    sget-object v0, LY7/d;->a:LY7/d;

    iget-object v1, p0, LY7/h$a;->D:LY7/h;

    invoke-virtual {v1}, LY7/b;->b()Le8/b;

    move-result-object v1

    invoke-virtual {v0, v1}, LY7/d;->a(Le8/b;)Lt8/g;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, LY7/c;->a:LY7/c;

    invoke-virtual {v1}, LY7/c;->c()Ln8/f;

    move-result-object v1

    invoke-static {v1, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    invoke-static {v0}, Lj7/S;->e(Li7/u;)Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LY7/h$a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
