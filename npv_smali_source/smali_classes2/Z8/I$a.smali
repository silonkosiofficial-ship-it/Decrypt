.class public final LZ8/I$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ8/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LZ8/I$a;

.field private static final b:LZ8/I;

.field private static final c:LZ8/I;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZ8/I$a;

    invoke-direct {v0}, LZ8/I$a;-><init>()V

    sput-object v0, LZ8/I$a;->a:LZ8/I$a;

    new-instance v0, LZ8/K;

    invoke-direct {v0}, LZ8/K;-><init>()V

    sput-object v0, LZ8/I$a;->b:LZ8/I;

    new-instance v0, LZ8/L;

    invoke-direct {v0}, LZ8/L;-><init>()V

    sput-object v0, LZ8/I$a;->c:LZ8/I;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(LZ8/I$a;JJILjava/lang/Object;)LZ8/I;
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    const-wide p3, 0x7fffffffffffffffL

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, LZ8/I$a;->a(JJ)LZ8/I;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(JJ)LZ8/I;
    .locals 1

    new-instance v0, LZ8/M;

    invoke-direct {v0, p1, p2, p3, p4}, LZ8/M;-><init>(JJ)V

    return-object v0
.end method

.method public final c()LZ8/I;
    .locals 1

    sget-object v0, LZ8/I$a;->b:LZ8/I;

    return-object v0
.end method

.method public final d()LZ8/I;
    .locals 1

    sget-object v0, LZ8/I$a;->c:LZ8/I;

    return-object v0
.end method
