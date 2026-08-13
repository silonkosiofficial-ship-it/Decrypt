.class final LI7/y$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/y;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;LO7/U;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/y;


# direct methods
.method constructor <init>(LI7/y;)V
    .locals 0

    iput-object p1, p0, LI7/y$e;->D:LI7/y;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LO7/U;
    .locals 3

    iget-object v0, p0, LI7/y$e;->D:LI7/y;

    invoke-virtual {v0}, LI7/y;->t()LI7/n;

    move-result-object v0

    iget-object v1, p0, LI7/y$e;->D:LI7/y;

    invoke-virtual {v1}, LI7/y;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LI7/y$e;->D:LI7/y;

    invoke-virtual {v2}, LI7/y;->L()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LI7/n;->o(Ljava/lang/String;Ljava/lang/String;)LO7/U;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/y$e;->a()LO7/U;

    move-result-object v0

    return-object v0
.end method
