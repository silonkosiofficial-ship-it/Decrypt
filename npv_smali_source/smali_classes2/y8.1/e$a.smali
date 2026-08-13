.class final Ly8/e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/e;-><init>(LE8/n;LO7/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly8/e;


# direct methods
.method constructor <init>(Ly8/e;)V
    .locals 0

    iput-object p1, p0, Ly8/e$a;->D:Ly8/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Ly8/e$a;->D:Ly8/e;

    invoke-virtual {v0}, Ly8/e;->i()Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    iget-object v2, p0, Ly8/e$a;->D:Ly8/e;

    invoke-static {v2, v0}, Ly8/e;->h(Ly8/e;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v1, v0}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly8/e$a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
