.class final Ln5/a$t;
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
    name = "t"
.end annotation


# static fields
.field static final a:Ln5/a$t;

.field private static final b:Lz5/c;

.field private static final c:Lz5/c;

.field private static final d:Lz5/c;

.field private static final e:Lz5/c;

.field private static final f:Lz5/c;

.field private static final g:Lz5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln5/a$t;

    invoke-direct {v0}, Ln5/a$t;-><init>()V

    sput-object v0, Ln5/a$t;->a:Ln5/a$t;

    const-string v0, "timestamp"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$t;->b:Lz5/c;

    const-string v0, "type"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$t;->c:Lz5/c;

    const-string v0, "app"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$t;->d:Lz5/c;

    const-string v0, "device"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$t;->e:Lz5/c;

    const-string v0, "log"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$t;->f:Lz5/c;

    const-string v0, "rollouts"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$t;->g:Lz5/c;

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

    check-cast p1, Ln5/F$e$d;

    check-cast p2, Lz5/e;

    invoke-virtual {p0, p1, p2}, Ln5/a$t;->b(Ln5/F$e$d;Lz5/e;)V

    return-void
.end method

.method public b(Ln5/F$e$d;Lz5/e;)V
    .locals 3

    sget-object v0, Ln5/a$t;->b:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$d;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lz5/e;->a(Lz5/c;J)Lz5/e;

    sget-object v0, Ln5/a$t;->c:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$t;->d:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$d;->b()Ln5/F$e$d$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$t;->e:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$d;->c()Ln5/F$e$d$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$t;->f:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$d;->d()Ln5/F$e$d$d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$t;->g:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$d;->e()Ln5/F$e$d$f;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    return-void
.end method
