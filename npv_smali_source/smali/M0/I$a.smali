.class public final LM0/I$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM0/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LM0/I$a;

.field private static final b:LM0/I;

.field private static final c:LM0/I;

.field private static final d:LM0/I;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/I$a;

    invoke-direct {v0}, LM0/I$a;-><init>()V

    sput-object v0, LM0/I$a;->a:LM0/I$a;

    new-instance v0, LM0/F;

    invoke-direct {v0}, LM0/F;-><init>()V

    sput-object v0, LM0/I$a;->b:LM0/I;

    new-instance v0, LM0/G;

    invoke-direct {v0}, LM0/G;-><init>()V

    sput-object v0, LM0/I$a;->c:LM0/I;

    new-instance v0, LM0/H;

    invoke-direct {v0}, LM0/H;-><init>()V

    sput-object v0, LM0/I$a;->d:LM0/I;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ln0/i;Ln0/i;)Z
    .locals 0

    invoke-static {p0, p1}, LM0/I$a;->e(Ln0/i;Ln0/i;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Ln0/i;Ln0/i;)Z
    .locals 0

    invoke-static {p0, p1}, LM0/I$a;->f(Ln0/i;Ln0/i;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Ln0/i;Ln0/i;)Z
    .locals 0

    invoke-static {p0, p1}, LM0/I$a;->d(Ln0/i;Ln0/i;)Z

    move-result p0

    return p0
.end method

.method private static final d(Ln0/i;Ln0/i;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ln0/i;->r(Ln0/i;)Z

    move-result p0

    return p0
.end method

.method private static final e(Ln0/i;Ln0/i;)Z
    .locals 2

    .prologue
    invoke-virtual {p1}, Ln0/i;->q()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ln0/i;->i()F

    move-result v0

    invoke-virtual {p1}, Ln0/i;->i()F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Ln0/i;->j()F

    move-result v0

    invoke-virtual {p1}, Ln0/i;->j()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Ln0/i;->l()F

    move-result v0

    invoke-virtual {p1}, Ln0/i;->l()F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Ln0/i;->e()F

    move-result p0

    invoke-virtual {p1}, Ln0/i;->e()F

    move-result p1

    cmpg-float p0, p0, p1

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final f(Ln0/i;Ln0/i;)Z
    .locals 2

    invoke-virtual {p0}, Ln0/i;->g()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ln0/i;->b(J)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final g()LM0/I;
    .locals 1

    sget-object v0, LM0/I$a;->b:LM0/I;

    return-object v0
.end method

.method public final h()LM0/I;
    .locals 1

    sget-object v0, LM0/I$a;->d:LM0/I;

    return-object v0
.end method
