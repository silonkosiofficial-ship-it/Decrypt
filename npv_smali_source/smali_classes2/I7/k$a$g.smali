.class final LI7/k$a$g;
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

    iput-object p1, p0, LI7/k$a$g;->D:LI7/k;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 3

    iget-object v0, p0, LI7/k$a$g;->D:LI7/k;

    invoke-virtual {v0}, LI7/k;->K()Ly8/h;

    move-result-object v1

    sget-object v2, LI7/n$c;->C:LI7/n$c;

    invoke-virtual {v0, v1, v2}, LI7/n;->u(Ly8/h;LI7/n$c;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/k$a$g;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
