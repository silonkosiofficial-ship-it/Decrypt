.class public LZ4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final c:LZ4/b;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LZ4/b;

    const-string v1, "FirebaseAppCheck"

    invoke-direct {v0, v1}, LZ4/b;-><init>(Ljava/lang/String;)V

    sput-object v0, LZ4/b;->c:LZ4/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ4/b;->a:Ljava/lang/String;

    const/4 p1, 0x4

    iput p1, p0, LZ4/b;->b:I

    return-void
.end method

.method private a(I)Z
    .locals 1

    .prologue
    iget v0, p0, LZ4/b;->b:I

    if-le v0, p1, :cond_1

    iget-object v0, p0, LZ4/b;->a:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public static f()LZ4/b;
    .locals 1

    sget-object v0, LZ4/b;->c:LZ4/b;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LZ4/b;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    const/4 v0, 0x3

    invoke-direct {p0, v0}, LZ4/b;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LZ4/b;->a:Ljava/lang/String;

    nop

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LZ4/b;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    const/4 v0, 0x6

    invoke-direct {p0, v0}, LZ4/b;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LZ4/b;->a:Ljava/lang/String;

    nop

    :cond_0
    return-void
.end method
