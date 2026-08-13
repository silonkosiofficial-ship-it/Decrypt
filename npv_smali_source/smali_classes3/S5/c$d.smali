.class final LS5/c$d;
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
    name = "d"
.end annotation


# static fields
.field static final a:LS5/c$d;

.field private static final b:Lz5/c;

.field private static final c:Lz5/c;

.field private static final d:Lz5/c;

.field private static final e:Lz5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS5/c$d;

    invoke-direct {v0}, LS5/c$d;-><init>()V

    sput-object v0, LS5/c$d;->a:LS5/c$d;

    const-string v0, "processName"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$d;->b:Lz5/c;

    const-string v0, "pid"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$d;->c:Lz5/c;

    const-string v0, "importance"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$d;->d:Lz5/c;

    const-string v0, "defaultProcess"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$d;->e:Lz5/c;

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

    check-cast p1, LS5/u;

    check-cast p2, Lz5/e;

    invoke-virtual {p0, p1, p2}, LS5/c$d;->b(LS5/u;Lz5/e;)V

    return-void
.end method

.method public b(LS5/u;Lz5/e;)V
    .locals 2

    sget-object v0, LS5/c$d;->b:Lz5/c;

    invoke-virtual {p1}, LS5/u;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LS5/c$d;->c:Lz5/c;

    invoke-virtual {p1}, LS5/u;->b()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lz5/e;->b(Lz5/c;I)Lz5/e;

    sget-object v0, LS5/c$d;->d:Lz5/c;

    invoke-virtual {p1}, LS5/u;->a()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lz5/e;->b(Lz5/c;I)Lz5/e;

    sget-object v0, LS5/c$d;->e:Lz5/c;

    invoke-virtual {p1}, LS5/u;->d()Z

    move-result p1

    invoke-interface {p2, v0, p1}, Lz5/e;->d(Lz5/c;Z)Lz5/e;

    return-void
.end method
