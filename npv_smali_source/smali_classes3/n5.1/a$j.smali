.class final Ln5/a$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz5/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "j"
.end annotation


# static fields
.field static final a:Ln5/a$j;

.field private static final b:Lz5/c;

.field private static final c:Lz5/c;

.field private static final d:Lz5/c;

.field private static final e:Lz5/c;

.field private static final f:Lz5/c;

.field private static final g:Lz5/c;

.field private static final h:Lz5/c;

.field private static final i:Lz5/c;

.field private static final j:Lz5/c;

.field private static final k:Lz5/c;

.field private static final l:Lz5/c;

.field private static final m:Lz5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln5/a$j;

    invoke-direct {v0}, Ln5/a$j;-><init>()V

    sput-object v0, Ln5/a$j;->a:Ln5/a$j;

    const-string v0, "generator"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$j;->b:Lz5/c;

    const-string v0, "identifier"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$j;->c:Lz5/c;

    const-string v0, "appQualitySessionId"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$j;->d:Lz5/c;

    const-string v0, "startedAt"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$j;->e:Lz5/c;

    const-string v0, "endedAt"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$j;->f:Lz5/c;

    const-string v0, "crashed"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$j;->g:Lz5/c;

    const-string v0, "app"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$j;->h:Lz5/c;

    const-string v0, "user"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$j;->i:Lz5/c;

    const-string v0, "os"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$j;->j:Lz5/c;

    const-string v0, "device"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$j;->k:Lz5/c;

    const-string v0, "events"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$j;->l:Lz5/c;

    const-string v0, "generatorType"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$j;->m:Lz5/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ln5/F$e;

    check-cast p2, Lz5/e;

    invoke-virtual {p0, p1, p2}, Ln5/a$j;->b(Ln5/F$e;Lz5/e;)V

    return-void
.end method

.method public b(Ln5/F$e;Lz5/e;)V
    .locals 3

    sget-object v0, Ln5/a$j;->b:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$j;->c:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e;->j()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$j;->d:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$j;->e:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e;->l()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lz5/e;->a(Lz5/c;J)Lz5/e;

    sget-object v0, Ln5/a$j;->f:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e;->e()Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$j;->g:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e;->n()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Lz5/e;->d(Lz5/c;Z)Lz5/e;

    sget-object v0, Ln5/a$j;->h:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e;->b()Ln5/F$e$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$j;->i:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e;->m()Ln5/F$e$f;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$j;->j:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e;->k()Ln5/F$e$e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$j;->k:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e;->d()Ln5/F$e$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$j;->l:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$j;->m:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e;->h()I

    move-result p1

    invoke-interface {p2, v0, p1}, Lz5/e;->b(Lz5/c;I)Lz5/e;

    return-void
.end method
