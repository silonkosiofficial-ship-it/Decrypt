.class public final Le0/e$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Z

.field private final c:Le0/g;

.field final synthetic d:Le0/e;


# direct methods
.method public constructor <init>(Le0/e;Ljava/lang/Object;)V
    .locals 1

    iput-object p1, p0, Le0/e$d;->d:Le0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Le0/e$d;->a:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, Le0/e$d;->b:Z

    invoke-static {p1}, Le0/e;->b(Le0/e;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    new-instance v0, Le0/e$d$a;

    invoke-direct {v0, p1}, Le0/e$d$a;-><init>(Le0/e;)V

    invoke-static {p2, v0}, Le0/i;->a(Ljava/util/Map;Lx7/l;)Le0/g;

    move-result-object p1

    iput-object p1, p0, Le0/e$d;->c:Le0/g;

    return-void
.end method


# virtual methods
.method public final a()Le0/g;
    .locals 1

    iget-object v0, p0, Le0/e$d;->c:Le0/g;

    return-object v0
.end method

.method public final b(Ljava/util/Map;)V
    .locals 2

    .prologue
    iget-boolean v0, p0, Le0/e$d;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Le0/e$d;->c:Le0/g;

    invoke-interface {v0}, Le0/g;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Le0/e$d;->a:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Le0/e$d;->a:Ljava/lang/Object;

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method public final c(Z)V
    .locals 0

    iput-boolean p1, p0, Le0/e$d;->b:Z

    return-void
.end method
