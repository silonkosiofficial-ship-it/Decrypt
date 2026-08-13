.class final LI7/t$a$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/t$a;-><init>(LI7/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/t$a;

.field final synthetic E:LI7/t;


# direct methods
.method constructor <init>(LI7/t$a;LI7/t;)V
    .locals 0

    iput-object p1, p0, LI7/t$a$d;->D:LI7/t$a;

    iput-object p2, p0, LI7/t$a$d;->E:LI7/t;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 8

    .prologue
    iget-object v0, p0, LI7/t$a$d;->D:LI7/t$a;

    invoke-static {v0}, LI7/t$a;->b(LI7/t$a;)LT7/f;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LT7/f;->b()Lh8/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh8/a;->e()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, LI7/t$a$d;->E:LI7/t;

    invoke-virtual {v0}, LI7/t;->e()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/16 v3, 0x2f

    const/16 v4, 0x2e

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LS8/r;->Q(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/t$a$d;->a()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method
