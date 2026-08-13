.class final Ly8/l$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/l;-><init>(LE8/n;LO7/e;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly8/l;


# direct methods
.method constructor <init>(Ly8/l;)V
    .locals 0

    iput-object p1, p0, Ly8/l$a;->D:Ly8/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 4

    iget-object v0, p0, Ly8/l$a;->D:Ly8/l;

    invoke-static {v0}, Ly8/l;->h(Ly8/l;)LO7/e;

    move-result-object v0

    invoke-static {v0}, Lr8/e;->g(LO7/e;)LO7/Z;

    move-result-object v0

    iget-object v1, p0, Ly8/l$a;->D:Ly8/l;

    invoke-static {v1}, Ly8/l;->h(Ly8/l;)LO7/e;

    move-result-object v1

    invoke-static {v1}, Lr8/e;->h(LO7/e;)LO7/Z;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [LO7/Z;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly8/l$a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
