.class public Lo2/t;
.super Lz2/e$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo2/t$a;,
        Lo2/t$b;,
        Lo2/t$c;
    }
.end annotation


# static fields
.field public static final h:Lo2/t$a;


# instance fields
.field private c:Lo2/c;

.field private final d:Ljava/util/List;

.field private final e:Lo2/t$b;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo2/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo2/t$a;-><init>(Ly7/k;)V

    sput-object v0, Lo2/t;->h:Lo2/t$a;

    return-void
.end method

.method public constructor <init>(Lo2/c;Lo2/t$b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delegate"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "identityHash"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "legacyHash"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p2, Lo2/t$b;->a:I

    invoke-direct {p0, v0}, Lz2/e$a;-><init>(I)V

    iget-object v0, p1, Lo2/c;->e:Ljava/util/List;

    iput-object v0, p0, Lo2/t;->d:Ljava/util/List;

    iput-object p1, p0, Lo2/t;->c:Lo2/c;

    iput-object p2, p0, Lo2/t;->e:Lo2/t$b;

    iput-object p3, p0, Lo2/t;->f:Ljava/lang/String;

    iput-object p4, p0, Lo2/t;->g:Ljava/lang/String;

    return-void
.end method

.method private final h(Lz2/d;)V
    .locals 3

    .prologue
    sget-object v0, Lo2/t;->h:Lo2/t$a;

    invoke-virtual {v0, p1}, Lo2/t$a;->c(Lz2/d;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lz2/a;

    const-string v1, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    invoke-direct {v0, v1}, Lz2/a;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lz2/d;->T(Lz2/g;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {p1, v1}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lo2/t;->f:Ljava/lang/String;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lo2/t;->g:Ljava/lang/String;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lo2/t;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p1, v0}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    iget-object v0, p0, Lo2/t;->e:Lo2/t$b;

    invoke-virtual {v0, p1}, Lo2/t$b;->g(Lz2/d;)Lo2/t$c;

    move-result-object v0

    iget-boolean v1, v0, Lo2/t$c;->a:Z

    if-eqz v1, :cond_4

    iget-object v0, p0, Lo2/t;->e:Lo2/t$b;

    invoke-virtual {v0, p1}, Lo2/t$b;->e(Lz2/d;)V

    invoke-direct {p0, p1}, Lo2/t;->j(Lz2/d;)V

    :cond_3
    :goto_2
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Pre-packaged database has an invalid schema: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lo2/t$c;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final i(Lz2/d;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, v0}, Lz2/d;->B(Ljava/lang/String;)V

    return-void
.end method

.method private final j(Lz2/d;)V
    .locals 1

    invoke-direct {p0, p1}, Lo2/t;->i(Lz2/d;)V

    iget-object v0, p0, Lo2/t;->f:Ljava/lang/String;

    invoke-static {v0}, Lo2/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lz2/d;->B(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(Lz2/d;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lz2/e$a;->b(Lz2/d;)V

    return-void
.end method

.method public d(Lz2/d;)V
    .locals 3

    .prologue
    const-string v0, "db"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo2/t;->h:Lo2/t$a;

    invoke-virtual {v0, p1}, Lo2/t$a;->b(Lz2/d;)Z

    move-result v0

    iget-object v1, p0, Lo2/t;->e:Lo2/t$b;

    invoke-virtual {v1, p1}, Lo2/t$b;->a(Lz2/d;)V

    if-nez v0, :cond_1

    iget-object v0, p0, Lo2/t;->e:Lo2/t$b;

    invoke-virtual {v0, p1}, Lo2/t$b;->g(Lz2/d;)Lo2/t$c;

    move-result-object v0

    iget-boolean v1, v0, Lo2/t$c;->a:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Pre-packaged database has an invalid schema: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lo2/t$c;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Lo2/t;->j(Lz2/d;)V

    iget-object v0, p0, Lo2/t;->e:Lo2/t$b;

    invoke-virtual {v0, p1}, Lo2/t$b;->c(Lz2/d;)V

    iget-object v0, p0, Lo2/t;->d:Ljava/util/List;

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo2/n$b;

    invoke-virtual {v1, p1}, Lo2/n$b;->b(Lz2/d;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public e(Lz2/d;II)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, Lo2/t;->g(Lz2/d;II)V

    return-void
.end method

.method public f(Lz2/d;)V
    .locals 2

    .prologue
    const-string v0, "db"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lz2/e$a;->f(Lz2/d;)V

    invoke-direct {p0, p1}, Lo2/t;->h(Lz2/d;)V

    iget-object v0, p0, Lo2/t;->e:Lo2/t$b;

    invoke-virtual {v0, p1}, Lo2/t$b;->d(Lz2/d;)V

    iget-object v0, p0, Lo2/t;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo2/n$b;

    invoke-virtual {v1, p1}, Lo2/n$b;->f(Lz2/d;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lo2/t;->c:Lo2/c;

    return-void
.end method

.method public g(Lz2/d;II)V
    .locals 2

    .prologue
    const-string v0, "db"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo2/t;->c:Lo2/c;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lo2/c;->d:Lo2/n$e;

    invoke-virtual {v0, p2, p3}, Lo2/n$e;->d(II)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object p2, p0, Lo2/t;->e:Lo2/t$b;

    invoke-virtual {p2, p1}, Lo2/t$b;->f(Lz2/d;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ls2/a;

    new-instance v0, Lr2/a;

    invoke-direct {v0, p1}, Lr2/a;-><init>(Lz2/d;)V

    invoke-virtual {p3, v0}, Ls2/a;->a(Ly2/b;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lo2/t;->e:Lo2/t$b;

    invoke-virtual {p2, p1}, Lo2/t$b;->g(Lz2/d;)Lo2/t$c;

    move-result-object p2

    iget-boolean p3, p2, Lo2/t$c;->a:Z

    if-eqz p3, :cond_1

    iget-object p2, p0, Lo2/t;->e:Lo2/t$b;

    invoke-virtual {p2, p1}, Lo2/t$b;->e(Lz2/d;)V

    invoke-direct {p0, p1}, Lo2/t;->j(Lz2/d;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Migration didn\'t properly handle: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Lo2/t$c;->b:Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, p0, Lo2/t;->c:Lo2/c;

    if-eqz v0, :cond_5

    invoke-virtual {v0, p2, p3}, Lo2/c;->e(II)Z

    move-result v1

    if-nez v1, :cond_5

    iget-boolean p2, v0, Lo2/c;->s:Z

    if-eqz p2, :cond_3

    sget-object p2, Lo2/t;->h:Lo2/t$a;

    invoke-virtual {p2, p1}, Lo2/t$a;->a(Lz2/d;)V

    goto :goto_1

    :cond_3
    iget-object p2, p0, Lo2/t;->e:Lo2/t$b;

    invoke-virtual {p2, p1}, Lo2/t$b;->b(Lz2/d;)V

    :goto_1
    iget-object p2, p0, Lo2/t;->d:Ljava/util/List;

    if-eqz p2, :cond_4

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lo2/n$b;

    invoke-virtual {p3, p1}, Lo2/n$b;->d(Lz2/d;)V

    goto :goto_2

    :cond_4
    iget-object p2, p0, Lo2/t;->e:Lo2/t$b;

    invoke-virtual {p2, p1}, Lo2/t$b;->a(Lz2/d;)V

    :goto_3
    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "A migration from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " to "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
