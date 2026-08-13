.class public Lo/b$d;
.super Lo/b$f;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field private C:Lo/b$c;

.field private D:Z

.field final synthetic E:Lo/b;


# direct methods
.method constructor <init>(Lo/b;)V
    .locals 0

    iput-object p1, p0, Lo/b$d;->E:Lo/b;

    invoke-direct {p0}, Lo/b$f;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lo/b$d;->D:Z

    return-void
.end method


# virtual methods
.method b(Lo/b$c;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lo/b$d;->C:Lo/b$c;

    if-ne p1, v0, :cond_1

    iget-object p1, v0, Lo/b$c;->F:Lo/b$c;

    iput-object p1, p0, Lo/b$d;->C:Lo/b$c;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lo/b$d;->D:Z

    :cond_1
    return-void
.end method

.method public c()Ljava/util/Map$Entry;
    .locals 1

    .prologue
    iget-boolean v0, p0, Lo/b$d;->D:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/b$d;->D:Z

    iget-object v0, p0, Lo/b$d;->E:Lo/b;

    iget-object v0, v0, Lo/b;->C:Lo/b$c;

    :goto_0
    iput-object v0, p0, Lo/b$d;->C:Lo/b$c;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lo/b$d;->C:Lo/b$c;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lo/b$c;->E:Lo/b$c;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lo/b$d;->C:Lo/b$c;

    return-object v0
.end method

.method public hasNext()Z
    .locals 3

    .prologue
    iget-boolean v0, p0, Lo/b$d;->D:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/b$d;->E:Lo/b;

    iget-object v0, v0, Lo/b;->C:Lo/b$c;

    if-eqz v0, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Lo/b$d;->C:Lo/b$c;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lo/b$c;->E:Lo/b$c;

    if-eqz v0, :cond_2

    move v1, v2

    :cond_2
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo/b$d;->c()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
