.class final LI7/k$a$n;
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


# direct methods
.method constructor <init>(LI7/k;)V
    .locals 0

    iput-object p1, p0, LI7/k$a$n;->D:LI7/k;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 3

    .prologue
    iget-object v0, p0, LI7/k$a$n;->D:LI7/k;

    invoke-virtual {v0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, LI7/k$a$n;->D:LI7/k;

    invoke-static {v0}, LI7/k;->E(LI7/k;)Ln8/b;

    move-result-object v0

    invoke-virtual {v0}, Ln8/b;->k()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ln8/b;->b()Ln8/c;

    move-result-object v0

    invoke-virtual {v0}, Ln8/c;->b()Ljava/lang/String;

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/k$a$n;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
