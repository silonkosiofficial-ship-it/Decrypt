.class final LS5/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz5/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field static final a:LS5/c$a;

.field private static final b:Lz5/c;

.field private static final c:Lz5/c;

.field private static final d:Lz5/c;

.field private static final e:Lz5/c;

.field private static final f:Lz5/c;

.field private static final g:Lz5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS5/c$a;

    invoke-direct {v0}, LS5/c$a;-><init>()V

    sput-object v0, LS5/c$a;->a:LS5/c$a;

    const-string v0, "packageName"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$a;->b:Lz5/c;

    const-string v0, "versionName"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$a;->c:Lz5/c;

    const-string v0, "appBuildVersion"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$a;->d:Lz5/c;

    const-string v0, "deviceManufacturer"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$a;->e:Lz5/c;

    const-string v0, "currentProcessDetails"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$a;->f:Lz5/c;

    const-string v0, "appProcessDetails"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$a;->g:Lz5/c;

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

    check-cast p1, LS5/a;

    check-cast p2, Lz5/e;

    invoke-virtual {p0, p1, p2}, LS5/c$a;->b(LS5/a;Lz5/e;)V

    return-void
.end method

.method public b(LS5/a;Lz5/e;)V
    .locals 2

    sget-object v0, LS5/c$a;->b:Lz5/c;

    invoke-virtual {p1}, LS5/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LS5/c$a;->c:Lz5/c;

    invoke-virtual {p1}, LS5/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LS5/c$a;->d:Lz5/c;

    invoke-virtual {p1}, LS5/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LS5/c$a;->e:Lz5/c;

    invoke-virtual {p1}, LS5/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LS5/c$a;->f:Lz5/c;

    invoke-virtual {p1}, LS5/a;->c()LS5/u;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LS5/c$a;->g:Lz5/c;

    invoke-virtual {p1}, LS5/a;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    return-void
.end method
