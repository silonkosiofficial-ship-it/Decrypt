.class final LI7/t$a$c;
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

    iput-object p1, p0, LI7/t$a$c;->D:LI7/t$a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Li7/A;
    .locals 4

    .prologue
    iget-object v0, p0, LI7/t$a$c;->D:LI7/t$a;

    invoke-static {v0}, LI7/t$a;->b(LI7/t$a;)LT7/f;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LT7/f;->b()Lh8/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh8/a;->a()[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lh8/a;->g()[Ljava/lang/String;

    move-result-object v3

    if-eqz v2, :cond_0

    if-eqz v3, :cond_0

    invoke-static {v2, v3}, Lm8/i;->m([Ljava/lang/String;[Ljava/lang/String;)Li7/u;

    move-result-object v1

    invoke-virtual {v1}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm8/f;

    invoke-virtual {v1}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/l;

    new-instance v3, Li7/A;

    invoke-virtual {v0}, Lh8/a;->d()Lm8/e;

    move-result-object v0

    invoke-direct {v3, v2, v1, v0}, Li7/A;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v1, v3

    :cond_0
    return-object v1
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/t$a$c;->a()Li7/A;

    move-result-object v0

    return-object v0
.end method
