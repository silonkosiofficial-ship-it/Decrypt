.class final Ln5/a$b;
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
    name = "b"
.end annotation


# static fields
.field static final a:Ln5/a$b;

.field private static final b:Lz5/c;

.field private static final c:Lz5/c;

.field private static final d:Lz5/c;

.field private static final e:Lz5/c;

.field private static final f:Lz5/c;

.field private static final g:Lz5/c;

.field private static final h:Lz5/c;

.field private static final i:Lz5/c;

.field private static final j:Lz5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln5/a$b;

    invoke-direct {v0}, Ln5/a$b;-><init>()V

    sput-object v0, Ln5/a$b;->a:Ln5/a$b;

    const-string v0, "pid"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$b;->b:Lz5/c;

    const-string v0, "processName"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$b;->c:Lz5/c;

    const-string v0, "reasonCode"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$b;->d:Lz5/c;

    const-string v0, "importance"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$b;->e:Lz5/c;

    const-string v0, "pss"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$b;->f:Lz5/c;

    const-string v0, "rss"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$b;->g:Lz5/c;

    const-string v0, "timestamp"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$b;->h:Lz5/c;

    const-string v0, "traceFile"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$b;->i:Lz5/c;

    const-string v0, "buildIdMappingForArch"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$b;->j:Lz5/c;

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

    check-cast p1, Ln5/F$a;

    check-cast p2, Lz5/e;

    invoke-virtual {p0, p1, p2}, Ln5/a$b;->b(Ln5/F$a;Lz5/e;)V

    return-void
.end method

.method public b(Ln5/F$a;Lz5/e;)V
    .locals 3

    sget-object v0, Ln5/a$b;->b:Lz5/c;

    invoke-virtual {p1}, Ln5/F$a;->d()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lz5/e;->b(Lz5/c;I)Lz5/e;

    sget-object v0, Ln5/a$b;->c:Lz5/c;

    invoke-virtual {p1}, Ln5/F$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$b;->d:Lz5/c;

    invoke-virtual {p1}, Ln5/F$a;->g()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lz5/e;->b(Lz5/c;I)Lz5/e;

    sget-object v0, Ln5/a$b;->e:Lz5/c;

    invoke-virtual {p1}, Ln5/F$a;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lz5/e;->b(Lz5/c;I)Lz5/e;

    sget-object v0, Ln5/a$b;->f:Lz5/c;

    invoke-virtual {p1}, Ln5/F$a;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lz5/e;->a(Lz5/c;J)Lz5/e;

    sget-object v0, Ln5/a$b;->g:Lz5/c;

    invoke-virtual {p1}, Ln5/F$a;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lz5/e;->a(Lz5/c;J)Lz5/e;

    sget-object v0, Ln5/a$b;->h:Lz5/c;

    invoke-virtual {p1}, Ln5/F$a;->i()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lz5/e;->a(Lz5/c;J)Lz5/e;

    sget-object v0, Ln5/a$b;->i:Lz5/c;

    invoke-virtual {p1}, Ln5/F$a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$b;->j:Lz5/c;

    invoke-virtual {p1}, Ln5/F$a;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    return-void
.end method
