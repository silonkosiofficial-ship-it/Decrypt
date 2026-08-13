.class final LI7/s;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field final synthetic D:LI7/r;


# direct methods
.method constructor <init>(LI7/r;)V
    .locals 0

    iput-object p1, p0, LI7/s;->D:LI7/r;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LI7/r$a;
    .locals 2

    new-instance v0, LI7/r$a;

    iget-object v1, p0, LI7/s;->D:LI7/r;

    invoke-direct {v0, v1}, LI7/r$a;-><init>(LI7/r;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/s;->a()LI7/r$a;

    move-result-object v0

    return-object v0
.end method
