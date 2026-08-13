.class final LP7/j$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP7/j;-><init>(LL7/g;Ln8/c;Ljava/util/Map;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LP7/j;


# direct methods
.method constructor <init>(LP7/j;)V
    .locals 0

    iput-object p1, p0, LP7/j$a;->D:LP7/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LF8/M;
    .locals 2

    iget-object v0, p0, LP7/j$a;->D:LP7/j;

    invoke-static {v0}, LP7/j;->b(LP7/j;)LL7/g;

    move-result-object v0

    iget-object v1, p0, LP7/j$a;->D:LP7/j;

    invoke-virtual {v1}, LP7/j;->e()Ln8/c;

    move-result-object v1

    invoke-virtual {v0, v1}, LL7/g;->o(Ln8/c;)LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/e;->w()LF8/M;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LP7/j$a;->a()LF8/M;

    move-result-object v0

    return-object v0
.end method
