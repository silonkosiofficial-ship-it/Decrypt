.class public final LR6/b;
.super LU6/b$b;
.source "SourceFile"


# static fields
.field public static final a:LR6/b;

.field private static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LR6/b;

    invoke-direct {v0}, LR6/b;-><init>()V

    sput-object v0, LR6/b;->a:LR6/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LU6/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Long;
    .locals 2

    sget-wide v0, LR6/b;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LR6/b;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x567a5f12

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptyContent"

    return-object v0
.end method
