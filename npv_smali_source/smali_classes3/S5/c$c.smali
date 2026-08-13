.class final LS5/c$c;
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
    name = "c"
.end annotation


# static fields
.field static final a:LS5/c$c;

.field private static final b:Lz5/c;

.field private static final c:Lz5/c;

.field private static final d:Lz5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS5/c$c;

    invoke-direct {v0}, LS5/c$c;-><init>()V

    sput-object v0, LS5/c$c;->a:LS5/c$c;

    const-string v0, "performance"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$c;->b:Lz5/c;

    const-string v0, "crashlytics"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$c;->c:Lz5/c;

    const-string v0, "sessionSamplingRate"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LS5/c$c;->d:Lz5/c;

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

    check-cast p1, LS5/e;

    check-cast p2, Lz5/e;

    invoke-virtual {p0, p1, p2}, LS5/c$c;->b(LS5/e;Lz5/e;)V

    return-void
.end method

.method public b(LS5/e;Lz5/e;)V
    .locals 3

    sget-object v0, LS5/c$c;->b:Lz5/c;

    invoke-virtual {p1}, LS5/e;->b()LS5/d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LS5/c$c;->c:Lz5/c;

    invoke-virtual {p1}, LS5/e;->a()LS5/d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, LS5/c$c;->d:Lz5/c;

    invoke-virtual {p1}, LS5/e;->c()D

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lz5/e;->c(Lz5/c;D)Lz5/e;

    return-void
.end method
