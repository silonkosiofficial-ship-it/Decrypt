.class final LI7/j$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/j;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/j;


# direct methods
.method constructor <init>(LI7/j;)V
    .locals 0

    iput-object p1, p0, LI7/j$d;->D:LI7/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LI7/A;
    .locals 4

    new-instance v0, LI7/A;

    iget-object v1, p0, LI7/j$d;->D:LI7/j;

    invoke-virtual {v1}, LI7/j;->A()LO7/b;

    move-result-object v1

    invoke-interface {v1}, LO7/a;->l()LF8/E;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance v2, LI7/j$d$a;

    iget-object v3, p0, LI7/j$d;->D:LI7/j;

    invoke-direct {v2, v3}, LI7/j$d$a;-><init>(LI7/j;)V

    invoke-direct {v0, v1, v2}, LI7/A;-><init>(LF8/E;Lx7/a;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/j$d;->a()LI7/A;

    move-result-object v0

    return-object v0
.end method
