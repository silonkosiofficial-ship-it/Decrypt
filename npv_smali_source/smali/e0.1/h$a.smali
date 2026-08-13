.class public final Le0/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le0/h;->e(Ljava/lang/String;Lx7/a;)Le0/g$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Le0/h;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lx7/a;


# direct methods
.method constructor <init>(Le0/h;Ljava/lang/String;Lx7/a;)V
    .locals 0

    iput-object p1, p0, Le0/h$a;->a:Le0/h;

    iput-object p2, p0, Le0/h$a;->b:Ljava/lang/String;

    iput-object p3, p0, Le0/h$a;->c:Lx7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    iget-object v0, p0, Le0/h$a;->a:Le0/h;

    invoke-static {v0}, Le0/h;->d(Le0/h;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Le0/h$a;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v1, p0, Le0/h$a;->c:Lx7/a;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    if-eqz v0, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, Le0/h$a;->a:Le0/h;

    invoke-static {v1}, Le0/h;->d(Le0/h;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Le0/h$a;->b:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
