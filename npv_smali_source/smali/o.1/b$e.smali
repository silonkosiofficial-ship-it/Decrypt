.class abstract Lo/b$e;
.super Lo/b$f;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "e"
.end annotation


# instance fields
.field C:Lo/b$c;

.field D:Lo/b$c;


# direct methods
.method constructor <init>(Lo/b$c;Lo/b$c;)V
    .locals 0

    invoke-direct {p0}, Lo/b$f;-><init>()V

    iput-object p2, p0, Lo/b$e;->C:Lo/b$c;

    iput-object p1, p0, Lo/b$e;->D:Lo/b$c;

    return-void
.end method

.method private f()Lo/b$c;
    .locals 2

    .prologue
    iget-object v0, p0, Lo/b$e;->D:Lo/b$c;

    iget-object v1, p0, Lo/b$e;->C:Lo/b$c;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lo/b$e;->d(Lo/b$c;)Lo/b$c;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public b(Lo/b$c;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lo/b$e;->C:Lo/b$c;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lo/b$e;->D:Lo/b$c;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lo/b$e;->D:Lo/b$c;

    iput-object v0, p0, Lo/b$e;->C:Lo/b$c;

    :cond_0
    iget-object v0, p0, Lo/b$e;->C:Lo/b$c;

    if-ne v0, p1, :cond_1

    invoke-virtual {p0, v0}, Lo/b$e;->c(Lo/b$c;)Lo/b$c;

    move-result-object v0

    iput-object v0, p0, Lo/b$e;->C:Lo/b$c;

    :cond_1
    iget-object v0, p0, Lo/b$e;->D:Lo/b$c;

    if-ne v0, p1, :cond_2

    invoke-direct {p0}, Lo/b$e;->f()Lo/b$c;

    move-result-object p1

    iput-object p1, p0, Lo/b$e;->D:Lo/b$c;

    :cond_2
    return-void
.end method

.method abstract c(Lo/b$c;)Lo/b$c;
.end method

.method abstract d(Lo/b$c;)Lo/b$c;
.end method

.method public e()Ljava/util/Map$Entry;
    .locals 2

    iget-object v0, p0, Lo/b$e;->D:Lo/b$c;

    invoke-direct {p0}, Lo/b$e;->f()Lo/b$c;

    move-result-object v1

    iput-object v1, p0, Lo/b$e;->D:Lo/b$c;

    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lo/b$e;->D:Lo/b$c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo/b$e;->e()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
