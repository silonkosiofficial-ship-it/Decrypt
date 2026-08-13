.class final LN7/i$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN7/i;->l(LE8/n;)LF8/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN7/i;


# direct methods
.method constructor <init>(LN7/i;)V
    .locals 0

    iput-object p1, p0, LN7/i$e;->D:LN7/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LF8/E;
    .locals 2

    iget-object v0, p0, LN7/i$e;->D:LN7/i;

    invoke-static {v0}, LN7/i;->g(LN7/i;)LO7/G;

    move-result-object v0

    invoke-interface {v0}, LO7/G;->t()LL7/g;

    move-result-object v0

    invoke-virtual {v0}, LL7/g;->i()LF8/M;

    move-result-object v0

    const-string v1, "getAnyType(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN7/i$e;->a()LF8/E;

    move-result-object v0

    return-object v0
.end method
