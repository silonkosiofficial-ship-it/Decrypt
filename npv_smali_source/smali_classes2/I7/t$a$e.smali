.class final LI7/t$a$e;
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


# direct methods
.method constructor <init>(LI7/t$a;)V
    .locals 0

    iput-object p1, p0, LI7/t$a$e;->D:LI7/t$a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ly8/h;
    .locals 2

    .prologue
    iget-object v0, p0, LI7/t$a$e;->D:LI7/t$a;

    invoke-static {v0}, LI7/t$a;->b(LI7/t$a;)LT7/f;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LI7/t$a$e;->D:LI7/t$a;

    invoke-virtual {v1}, LI7/n$b;->a()LT7/k;

    move-result-object v1

    invoke-virtual {v1}, LT7/k;->c()LT7/a;

    move-result-object v1

    invoke-virtual {v1, v0}, LT7/a;->a(LT7/f;)Ly8/h;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Ly8/h$b;->b:Ly8/h$b;

    :goto_0
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/t$a$e;->a()Ly8/h;

    move-result-object v0

    return-object v0
.end method
