.class LN3/L;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:LN3/L;


# instance fields
.field final a:Z

.field final b:Ljava/lang/String;

.field final c:Ljava/lang/Throwable;

.field final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, LN3/L;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x3

    const/4 v3, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LN3/L;-><init>(ZIILjava/lang/String;Ljava/lang/Throwable;)V

    sput-object v6, LN3/L;->e:LN3/L;

    return-void
.end method

.method private constructor <init>(ZIILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LN3/L;->a:Z

    iput p2, p0, LN3/L;->d:I

    iput-object p4, p0, LN3/L;->b:Ljava/lang/String;

    iput-object p5, p0, LN3/L;->c:Ljava/lang/Throwable;

    return-void
.end method

.method synthetic constructor <init>(ZIILjava/lang/String;Ljava/lang/Throwable;LN3/K;)V
    .locals 0

    const/4 p5, 0x0

    const/4 p6, 0x0

    const/4 p2, 0x0

    const/4 p3, 0x1

    const/4 p4, 0x5

    move-object p1, p0

    invoke-direct/range {p1 .. p6}, LN3/L;-><init>(ZIILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method static b()LN3/L;
    .locals 1

    sget-object v0, LN3/L;->e:LN3/L;

    return-object v0
.end method

.method static c(Ljava/lang/String;)LN3/L;
    .locals 7

    new-instance v6, LN3/L;

    const/4 v3, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move-object v0, v6

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, LN3/L;-><init>(ZIILjava/lang/String;Ljava/lang/Throwable;)V

    return-object v6
.end method

.method static d(Ljava/lang/String;Ljava/lang/Throwable;)LN3/L;
    .locals 7

    new-instance v6, LN3/L;

    const/4 v2, 0x1

    const/4 v3, 0x5

    const/4 v1, 0x0

    move-object v0, v6

    move-object v4, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, LN3/L;-><init>(ZIILjava/lang/String;Ljava/lang/Throwable;)V

    return-object v6
.end method

.method static f(I)LN3/L;
    .locals 7

    new-instance v6, LN3/L;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v3, 0x1

    move-object v0, v6

    move v2, p0

    invoke-direct/range {v0 .. v5}, LN3/L;-><init>(ZIILjava/lang/String;Ljava/lang/Throwable;)V

    return-object v6
.end method

.method static g(IILjava/lang/String;Ljava/lang/Throwable;)LN3/L;
    .locals 7

    new-instance v6, LN3/L;

    const/4 v1, 0x0

    move-object v0, v6

    move v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, LN3/L;-><init>(ZIILjava/lang/String;Ljava/lang/Throwable;)V

    return-object v6
.end method


# virtual methods
.method a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LN3/L;->b:Ljava/lang/String;

    return-object v0
.end method

.method final e()V
    .locals 3

    .prologue
    iget-boolean v0, p0, LN3/L;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x3

    const-string v1, "GoogleCertificatesRslt"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LN3/L;->c:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LN3/L;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, LN3/L;->c:Ljava/lang/Throwable;

    nop

    return-void

    :cond_0
    invoke-virtual {p0}, LN3/L;->a()Ljava/lang/String;

    move-result-object v0

    nop

    :cond_1
    return-void
.end method
