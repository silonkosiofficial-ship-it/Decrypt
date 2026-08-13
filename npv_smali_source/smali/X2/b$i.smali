.class final LX2/b$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz5/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "i"
.end annotation


# static fields
.field static final a:LX2/b$i;

.field private static final b:Lz5/c;

.field private static final c:Lz5/c;

.field private static final d:Lz5/c;

.field private static final e:Lz5/c;

.field private static final f:Lz5/c;

.field private static final g:Lz5/c;

.field private static final h:Lz5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LX2/b$i;

    invoke-direct {v0}, LX2/b$i;-><init>()V

    sput-object v0, LX2/b$i;->a:LX2/b$i;

    const-string v0, "requestTimeMs"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$i;->b:Lz5/c;

    const-string v0, "requestUptimeMs"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$i;->c:Lz5/c;

    const-string v0, "clientInfo"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$i;->d:Lz5/c;

    const-string v0, "logSource"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$i;->e:Lz5/c;

    const-string v0, "logSourceName"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$i;->f:Lz5/c;

    const-string v0, "logEvent"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$i;->g:Lz5/c;

    const-string v0, "qosTier"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$i;->h:Lz5/c;

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

    check-cast p1, LX2/u;

    check-cast p2, Lz5/e;

    invoke-virtual {p0, p1, p2}, LX2/b$i;->b(LX2/u;Lz5/e;)V

    return-void
.end method

.method public b(LX2/u;Lz5/e;)V
    .locals 3

    sget-object v0, LX2/b$i;->b:Lz5/c;

    invoke-virtual {p1}, LX2/u;->g()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lz5/e;->a(Lz5/c;J)Lz5/e;

    sget-object v0, LX2/b$i;->c:Lz5/c;

    invoke-virtual {p1}, LX2/u;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lz5/e;->a(Lz5/c;J)Lz5/e;

    sget-object v0, LX2/b$i;->d:Lz5/c;

    invoke-virtual {p1}, LX2/u;->b()LX2/o;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LX2/b$i;->e:Lz5/c;

    invoke-virtual {p1}, LX2/u;->d()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LX2/b$i;->f:Lz5/c;

    invoke-virtual {p1}, LX2/u;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LX2/b$i;->g:Lz5/c;

    invoke-virtual {p1}, LX2/u;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LX2/b$i;->h:Lz5/c;

    invoke-virtual {p1}, LX2/u;->f()LX2/x;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    return-void
.end method
