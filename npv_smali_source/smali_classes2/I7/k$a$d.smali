.class final LI7/k$a$d;
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
.field final synthetic D:LI7/k$a;


# direct methods
.method constructor <init>(LI7/k$a;)V
    .locals 0

    iput-object p1, p0, LI7/k$a$d;->D:LI7/k$a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LI7/k$a$d;->D:LI7/k$a;

    invoke-virtual {v0}, LI7/k$a;->k()LO7/e;

    move-result-object v0

    invoke-static {v0}, LI7/M;->e(LP7/a;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/k$a$d;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
