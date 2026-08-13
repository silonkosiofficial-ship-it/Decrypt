.class public Lh5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final c:Lh5/g;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh5/g;

    const-string v1, "FirebaseCrashlytics"

    invoke-direct {v0, v1}, Lh5/g;-><init>(Ljava/lang/String;)V

    sput-object v0, Lh5/g;->c:Lh5/g;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh5/g;->a:Ljava/lang/String;

    const/4 p1, 0x4

    iput p1, p0, Lh5/g;->b:I

    return-void
.end method

.method private a(I)Z
    .locals 1

    .prologue
    iget v0, p0, Lh5/g;->b:I

    if-le v0, p1, :cond_1

    iget-object v0, p0, Lh5/g;->a:Ljava/lang/String;

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

.method public static f()Lh5/g;
    .locals 1

    sget-object v0, Lh5/g;->c:Lh5/g;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lh5/g;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lh5/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh5/g;->a:Ljava/lang/String;

    nop

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lh5/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lh5/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh5/g;->a:Ljava/lang/String;

    nop

    :cond_0
    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lh5/g;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public h(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lh5/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh5/g;->a:Ljava/lang/String;

    nop

    :cond_0
    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lh5/g;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public j(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lh5/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh5/g;->a:Ljava/lang/String;

    nop

    :cond_0
    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lh5/g;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public l(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lh5/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh5/g;->a:Ljava/lang/String;

    nop

    :cond_0
    return-void
.end method
