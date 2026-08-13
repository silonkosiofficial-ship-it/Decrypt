.class final LI7/k$a$p;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/k$a;-><init>(LI7/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/k;

.field final synthetic E:LI7/k$a;


# direct methods
.method constructor <init>(LI7/k;LI7/k$a;)V
    .locals 0

    iput-object p1, p0, LI7/k$a$p;->D:LI7/k;

    iput-object p2, p0, LI7/k$a$p;->E:LI7/k$a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .prologue
    iget-object v0, p0, LI7/k$a$p;->D:LI7/k;

    invoke-virtual {v0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, LI7/k$a$p;->D:LI7/k;

    invoke-static {v0}, LI7/k;->E(LI7/k;)Ln8/b;

    move-result-object v0

    invoke-virtual {v0}, Ln8/b;->k()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, LI7/k$a$p;->E:LI7/k$a;

    iget-object v1, p0, LI7/k$a$p;->D:LI7/k;

    invoke-virtual {v1}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, LI7/k$a;->b(LI7/k$a;Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ln8/b;->j()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/k$a$p;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
