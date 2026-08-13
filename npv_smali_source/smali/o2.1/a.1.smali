.class public abstract Lo2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo2/a$a;,
        Lo2/a$b;,
        Lo2/a$c;
    }
.end annotation


# static fields
.field public static final c:Lo2/a$a;


# instance fields
.field private a:Z

.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo2/a$a;-><init>(Ly7/k;)V

    sput-object v0, Lo2/a;->c:Lo2/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final A(Ly2/b;)V
    .locals 1

    invoke-direct {p0, p1}, Lo2/a;->l(Ly2/b;)V

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object v0

    invoke-virtual {v0}, Lo2/r;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo2/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic a(Lo2/a;Ly2/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lo2/a;->g(Ly2/b;)V

    return-void
.end method

.method public static final synthetic b(Lo2/a;Ly2/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lo2/a;->i(Ly2/b;)V

    return-void
.end method

.method public static final synthetic c(Lo2/a;)Z
    .locals 0

    iget-boolean p0, p0, Lo2/a;->a:Z

    return p0
.end method

.method public static final synthetic d(Lo2/a;)Z
    .locals 0

    iget-boolean p0, p0, Lo2/a;->b:Z

    return p0
.end method

.method public static final synthetic e(Lo2/a;Z)V
    .locals 0

    iput-boolean p1, p0, Lo2/a;->b:Z

    return-void
.end method

.method private final f(Ly2/b;)V
    .locals 4

    .prologue
    invoke-direct {p0, p1}, Lo2/a;->t(Ly2/b;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    invoke-interface {p1, v0}, Ly2/b;->e(Ljava/lang/String;)Ly2/e;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ly2/e;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ly2/e;->o(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ly2/e;->close()V

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object p1

    invoke-virtual {p1}, Lo2/r;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object p1

    invoke-virtual {p1}, Lo2/r;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object v2

    invoke-virtual {v2}, Lo2/r;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    invoke-interface {p1}, Ly2/e;->close()V

    throw v0

    :cond_2
    const-string v0, "BEGIN EXCLUSIVE TRANSACTION"

    invoke-static {p1, v0}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    :try_start_1
    sget-object v0, Li7/w;->D:Li7/w$a;

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo2/r;->j(Ly2/b;)Lo2/r$a;

    move-result-object v0

    iget-boolean v1, v0, Lo2/r$a;->a:Z

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo2/r;->h(Ly2/b;)V

    invoke-direct {p0, p1}, Lo2/a;->A(Ly2/b;)V

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Pre-packaged database has an invalid schema: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lo2/r$a;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_2
    sget-object v1, Li7/w;->D:Li7/w$a;

    invoke-static {v0}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Li7/w;->h(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Li7/M;

    const-string v1, "END TRANSACTION"

    invoke-static {p1, v1}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    :cond_4
    invoke-static {v0}, Li7/w;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_6

    :cond_5
    :goto_4
    return-void

    :cond_6
    const-string v1, "ROLLBACK TRANSACTION"

    invoke-static {p1, v1}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    throw v0
.end method

.method private final g(Ly2/b;)V
    .locals 1

    invoke-direct {p0, p1}, Lo2/a;->k(Ly2/b;)V

    invoke-direct {p0, p1}, Lo2/a;->h(Ly2/b;)V

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo2/r;->g(Ly2/b;)V

    return-void
.end method

.method private final h(Ly2/b;)V
    .locals 5

    .prologue
    const-string v0, "PRAGMA busy_timeout"

    invoke-interface {p1, v0}, Ly2/b;->e(Ljava/lang/String;)Ly2/e;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Ly2/e;->p()Z

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ly2/e;->getLong(I)J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ly2/e;->close()V

    const-wide/16 v3, 0xbb8

    cmp-long v0, v1, v3

    if-gez v0, :cond_0

    const-string v0, "PRAGMA busy_timeout = 3000"

    invoke-static {p1, v0}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ly2/e;->close()V

    throw p1
.end method

.method private final i(Ly2/b;)V
    .locals 3

    .prologue
    invoke-direct {p0, p1}, Lo2/a;->j(Ly2/b;)V

    invoke-direct {p0, p1}, Lo2/a;->k(Ly2/b;)V

    const-string v0, "PRAGMA user_version"

    invoke-interface {p1, v0}, Ly2/b;->e(Ljava/lang/String;)Ly2/e;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Ly2/e;->p()Z

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ly2/e;->getLong(I)J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    long-to-int v1, v1

    invoke-interface {v0}, Ly2/e;->close()V

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object v0

    invoke-virtual {v0}, Lo2/r;->e()I

    move-result v0

    if-eq v1, v0, :cond_3

    const-string v0, "BEGIN EXCLUSIVE TRANSACTION"

    invoke-static {p1, v0}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    :try_start_1
    sget-object v0, Li7/w;->D:Li7/w$a;

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Lo2/a;->x(Ly2/b;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object v0

    invoke-virtual {v0}, Lo2/r;->e()I

    move-result v0

    invoke-virtual {p0, p1, v1, v0}, Lo2/a;->y(Ly2/b;II)V

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PRAGMA user_version = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object v1

    invoke-virtual {v1}, Lo2/r;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    sget-object v1, Li7/w;->D:Li7/w$a;

    invoke-static {v0}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Li7/w;->h(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Li7/M;

    const-string v1, "END TRANSACTION"

    invoke-static {p1, v1}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    :cond_1
    invoke-static {v0}, Li7/w;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    const-string v1, "ROLLBACK TRANSACTION"

    invoke-static {p1, v1}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_3
    invoke-virtual {p0, p1}, Lo2/a;->z(Ly2/b;)V

    return-void

    :catchall_1
    move-exception p1

    invoke-interface {v0}, Ly2/e;->close()V

    throw p1
.end method

.method private final j(Ly2/b;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lo2/a;->o()Lo2/c;

    move-result-object v0

    iget-object v0, v0, Lo2/c;->g:Lo2/n$d;

    sget-object v1, Lo2/n$d;->E:Lo2/n$d;

    if-ne v0, v1, :cond_0

    const-string v0, "PRAGMA journal_mode = WAL"

    :goto_0
    invoke-static {p1, v0}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const-string v0, "PRAGMA journal_mode = TRUNCATE"

    goto :goto_0

    :goto_1
    return-void
.end method

.method private final k(Ly2/b;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lo2/a;->o()Lo2/c;

    move-result-object v0

    iget-object v0, v0, Lo2/c;->g:Lo2/n$d;

    sget-object v1, Lo2/n$d;->E:Lo2/n$d;

    if-ne v0, v1, :cond_0

    const-string v0, "PRAGMA synchronous = NORMAL"

    :goto_0
    invoke-static {p1, v0}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const-string v0, "PRAGMA synchronous = FULL"

    goto :goto_0

    :goto_1
    return-void
.end method

.method private final l(Ly2/b;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-static {p1, v0}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    return-void
.end method

.method private final m(Ly2/b;)V
    .locals 7

    .prologue
    invoke-virtual {p0}, Lo2/a;->o()Lo2/c;

    move-result-object v0

    iget-boolean v0, v0, Lo2/c;->s:Z

    if-eqz v0, :cond_4

    const-string v0, "SELECT name, type FROM sqlite_master WHERE type = \'table\' OR type = \'view\'"

    invoke-interface {p1, v0}, Ly2/b;->e(Ljava/lang/String;)Ly2/e;

    move-result-object v0

    :try_start_0
    invoke-static {}, Lj7/v;->c()Ljava/util/List;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ly2/e;->p()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ly2/e;->o(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "sqlite_"

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v2, v5, v6}, LS8/r;->V(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "android_metadata"

    invoke-static {v3, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    invoke-interface {v0, v2}, Ly2/e;->o(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "view"

    invoke-static {v2, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v3, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    invoke-static {v1}, Lj7/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ly2/e;->close()V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li7/u;

    invoke-virtual {v1}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DROP VIEW IF EXISTS "

    :goto_2
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DROP TABLE IF EXISTS "

    goto :goto_2

    :goto_3
    invoke-interface {v0}, Ly2/e;->close()V

    throw p1

    :cond_4
    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo2/r;->b(Ly2/b;)V

    :cond_5
    return-void
.end method

.method private final s(Ly2/b;)Z
    .locals 6

    .prologue
    const-string v0, "SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'"

    invoke-interface {p1, v0}, Ly2/b;->e(Ljava/lang/String;)Ly2/e;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ly2/e;->p()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p1, v1}, Ly2/e;->getLong(I)J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ly2/e;->close()V

    return v1

    :goto_1
    invoke-interface {p1}, Ly2/e;->close()V

    throw v0
.end method

.method private final t(Ly2/b;)Z
    .locals 6

    .prologue
    const-string v0, "SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name = \'room_master_table\'"

    invoke-interface {p1, v0}, Ly2/b;->e(Ljava/lang/String;)Ly2/e;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ly2/e;->p()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p1, v1}, Ly2/e;->getLong(I)J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ly2/e;->close()V

    return v1

    :goto_1
    invoke-interface {p1}, Ly2/e;->close()V

    throw v0
.end method

.method private final u(Ly2/b;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lo2/a;->n()Ljava/util/List;

    move-result-object v0

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

    invoke-virtual {v1, p1}, Lo2/n$b;->a(Ly2/b;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final v(Ly2/b;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lo2/a;->n()Ljava/util/List;

    move-result-object v0

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

    invoke-virtual {v1, p1}, Lo2/n$b;->c(Ly2/b;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final w(Ly2/b;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lo2/a;->n()Ljava/util/List;

    move-result-object v0

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

    invoke-virtual {v1, p1}, Lo2/n$b;->e(Ly2/b;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method protected abstract n()Ljava/util/List;
.end method

.method protected abstract o()Lo2/c;
.end method

.method protected final p(Lo2/n$d;)I
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo2/a$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t get max number of reader for journal mode \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x27

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return v1
.end method

.method protected final q(Lo2/n$d;)I
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo2/a$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t get max number of writers for journal mode \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x27

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return v1
.end method

.method protected abstract r()Lo2/r;
.end method

.method protected final x(Ly2/b;)V
    .locals 3

    .prologue
    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lo2/a;->s(Ly2/b;)Z

    move-result v0

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object v1

    invoke-virtual {v1, p1}, Lo2/r;->a(Ly2/b;)V

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo2/r;->j(Ly2/b;)Lo2/r$a;

    move-result-object v0

    iget-boolean v1, v0, Lo2/r$a;->a:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Pre-packaged database has an invalid schema: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lo2/r$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Lo2/a;->A(Ly2/b;)V

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo2/r;->f(Ly2/b;)V

    invoke-direct {p0, p1}, Lo2/a;->u(Ly2/b;)V

    return-void
.end method

.method protected final y(Ly2/b;II)V
    .locals 2

    .prologue
    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo2/a;->o()Lo2/c;

    move-result-object v0

    iget-object v0, v0, Lo2/c;->d:Lo2/n$e;

    invoke-virtual {v0, p2, p3}, Lo2/n$e;->d(II)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object p2

    invoke-virtual {p2, p1}, Lo2/r;->i(Ly2/b;)V

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

    invoke-virtual {p3, p1}, Ls2/a;->a(Ly2/b;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object p2

    invoke-virtual {p2, p1}, Lo2/r;->j(Ly2/b;)Lo2/r$a;

    move-result-object p2

    iget-boolean p3, p2, Lo2/r$a;->a:Z

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object p2

    invoke-virtual {p2, p1}, Lo2/r;->h(Ly2/b;)V

    invoke-direct {p0, p1}, Lo2/a;->A(Ly2/b;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Migration didn\'t properly handle: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Lo2/r$a;->b:Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p0}, Lo2/a;->o()Lo2/c;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo2/c;->e(II)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0, p1}, Lo2/a;->m(Ly2/b;)V

    invoke-direct {p0, p1}, Lo2/a;->v(Ly2/b;)V

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object p2

    invoke-virtual {p2, p1}, Lo2/r;->a(Ly2/b;)V

    :goto_1
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "A migration from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " to "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected final z(Ly2/b;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lo2/a;->f(Ly2/b;)V

    invoke-virtual {p0}, Lo2/a;->r()Lo2/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo2/r;->g(Ly2/b;)V

    invoke-direct {p0, p1}, Lo2/a;->w(Ly2/b;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lo2/a;->a:Z

    return-void
.end method
