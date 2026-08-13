.class final LD8/h$c$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/h$c;-><init>(LD8/h;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD8/h$c;

.field final synthetic E:LD8/h;


# direct methods
.method constructor <init>(LD8/h$c;LD8/h;)V
    .locals 0

    iput-object p1, p0, LD8/h$c$b;->D:LD8/h$c;

    iput-object p2, p0, LD8/h$c$b;->E:LD8/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 2

    iget-object v0, p0, LD8/h$c$b;->D:LD8/h$c;

    invoke-static {v0}, LD8/h$c;->k(LD8/h$c;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, LD8/h$c$b;->E:LD8/h;

    invoke-virtual {v1}, LD8/h;->t()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lj7/Z;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD8/h$c$b;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
