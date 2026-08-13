.class final LD8/h$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/h$b;-><init>(LD8/h;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD8/h$b;


# direct methods
.method constructor <init>(LD8/h$b;)V
    .locals 0

    iput-object p1, p0, LD8/h$b$a;->D:LD8/h$b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LD8/h$b$a;->D:LD8/h$b;

    invoke-static {v0}, LD8/h$b;->p(LD8/h$b;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iget-object v1, p0, LD8/h$b$a;->D:LD8/h$b;

    invoke-static {v1}, LD8/h$b;->h(LD8/h$b;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD8/h$b$a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
