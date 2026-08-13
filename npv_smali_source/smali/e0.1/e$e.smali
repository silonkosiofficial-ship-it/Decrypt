.class final Le0/e$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le0/e;->d(Ljava/lang/Object;Lx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Le0/e;

.field final synthetic E:Ljava/lang/Object;

.field final synthetic F:Le0/e$d;


# direct methods
.method constructor <init>(Le0/e;Ljava/lang/Object;Le0/e$d;)V
    .locals 0

    iput-object p1, p0, Le0/e$e;->D:Le0/e;

    iput-object p2, p0, Le0/e$e;->E:Ljava/lang/Object;

    iput-object p3, p0, Le0/e$e;->F:Le0/e$d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 3

    .prologue
    iget-object p1, p0, Le0/e$e;->D:Le0/e;

    invoke-static {p1}, Le0/e;->a(Le0/e;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Le0/e$e;->E:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Le0/e$e;->E:Ljava/lang/Object;

    if-eqz p1, :cond_0

    iget-object p1, p0, Le0/e$e;->D:Le0/e;

    invoke-static {p1}, Le0/e;->b(Le0/e;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Le0/e$e;->E:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Le0/e$e;->D:Le0/e;

    invoke-static {p1}, Le0/e;->a(Le0/e;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Le0/e$e;->E:Ljava/lang/Object;

    iget-object v1, p0, Le0/e$e;->F:Le0/e$d;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Le0/e$e;->F:Le0/e$d;

    iget-object v0, p0, Le0/e$e;->D:Le0/e;

    iget-object v1, p0, Le0/e$e;->E:Ljava/lang/Object;

    new-instance v2, Le0/e$e$a;

    invoke-direct {v2, p1, v0, v1}, Le0/e$e$a;-><init>(Le0/e$d;Le0/e;Ljava/lang/Object;)V

    return-object v2

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Key "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " was used multiple times "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, Le0/e$e;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
