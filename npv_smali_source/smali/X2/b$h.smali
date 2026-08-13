.class final LX2/b$h;
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
    name = "h"
.end annotation


# static fields
.field static final a:LX2/b$h;

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

    new-instance v0, LX2/b$h;

    invoke-direct {v0}, LX2/b$h;-><init>()V

    sput-object v0, LX2/b$h;->a:LX2/b$h;

    const-string v0, "eventTimeMs"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$h;->b:Lz5/c;

    const-string v0, "eventCode"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$h;->c:Lz5/c;

    const-string v0, "complianceData"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$h;->d:Lz5/c;

    const-string v0, "eventUptimeMs"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$h;->e:Lz5/c;

    const-string v0, "sourceExtension"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$h;->f:Lz5/c;

    const-string v0, "sourceExtensionJsonProto3"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$h;->g:Lz5/c;

    const-string v0, "timezoneOffsetSeconds"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$h;->h:Lz5/c;

    const-string v0, "networkConnectionInfo"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$h;->i:Lz5/c;

    const-string v0, "experimentIds"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$h;->j:Lz5/c;

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

    check-cast p1, LX2/t;

    check-cast p2, Lz5/e;

    invoke-virtual {p0, p1, p2}, LX2/b$h;->b(LX2/t;Lz5/e;)V

    return-void
.end method

.method public b(LX2/t;Lz5/e;)V
    .locals 3

    sget-object v0, LX2/b$h;->b:Lz5/c;

    invoke-virtual {p1}, LX2/t;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lz5/e;->a(Lz5/c;J)Lz5/e;

    sget-object v0, LX2/b$h;->c:Lz5/c;

    invoke-virtual {p1}, LX2/t;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LX2/b$h;->d:Lz5/c;

    invoke-virtual {p1}, LX2/t;->b()LX2/p;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LX2/b$h;->e:Lz5/c;

    invoke-virtual {p1}, LX2/t;->e()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lz5/e;->a(Lz5/c;J)Lz5/e;

    sget-object v0, LX2/b$h;->f:Lz5/c;

    invoke-virtual {p1}, LX2/t;->h()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LX2/b$h;->g:Lz5/c;

    invoke-virtual {p1}, LX2/t;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LX2/b$h;->h:Lz5/c;

    invoke-virtual {p1}, LX2/t;->j()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lz5/e;->a(Lz5/c;J)Lz5/e;

    sget-object v0, LX2/b$h;->i:Lz5/c;

    invoke-virtual {p1}, LX2/t;->g()LX2/w;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LX2/b$h;->j:Lz5/c;

    invoke-virtual {p1}, LX2/t;->f()LX2/q;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    return-void
.end method
