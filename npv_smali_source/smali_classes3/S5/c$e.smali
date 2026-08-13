.class final LS5/c$e;
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
    name = "e"
.end annotation


# static fields
.field static final a:LS5/c$e;

.field private static final b:Lz5/c;

.field private static final c:Lz5/c;

.field private static final d:Lz5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS5/c$e;

    invoke-direct {v0}, LS5/c$e;-><init>()V

    sput-object v0, LS5/c$e;->a:LS5/c$e;

    const-string v0, "eventType"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$e;->b:Lz5/c;

    const-string v0, "sessionData"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$e;->c:Lz5/c;

    const-string v0, "applicationInfo"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$e;->d:Lz5/c;

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

    check-cast p1, LS5/z;

    check-cast p2, Lz5/e;

    invoke-virtual {p0, p1, p2}, LS5/c$e;->b(LS5/z;Lz5/e;)V

    return-void
.end method

.method public b(LS5/z;Lz5/e;)V
    .locals 2

    sget-object v0, LS5/c$e;->b:Lz5/c;

    invoke-virtual {p1}, LS5/z;->b()LS5/i;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LS5/c$e;->c:Lz5/c;

    invoke-virtual {p1}, LS5/z;->c()LS5/C;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LS5/c$e;->d:Lz5/c;

    invoke-virtual {p1}, LS5/z;->a()LS5/b;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    return-void
.end method
