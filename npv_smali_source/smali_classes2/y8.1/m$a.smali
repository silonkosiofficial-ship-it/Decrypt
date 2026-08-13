.class final Ly8/m$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/m;-><init>(Ly8/h;LF8/n0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly8/m;


# direct methods
.method constructor <init>(Ly8/m;)V
    .locals 0

    iput-object p1, p0, Ly8/m$a;->D:Ly8/m;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 4

    iget-object v0, p0, Ly8/m$a;->D:Ly8/m;

    invoke-static {v0}, Ly8/m;->h(Ly8/m;)Ly8/h;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-static {v1, v2, v2, v3, v2}, Ly8/k$a;->a(Ly8/k;Ly8/d;Lx7/l;ILjava/lang/Object;)Ljava/util/Collection;

    move-result-object v1

    invoke-static {v0, v1}, Ly8/m;->i(Ly8/m;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly8/m$a;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
