.class public final enum LS5/t;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LB5/f;


# static fields
.field public static final enum D:LS5/t;

.field public static final enum E:LS5/t;

.field public static final enum F:LS5/t;

.field public static final enum G:LS5/t;

.field private static final synthetic H:[LS5/t;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS5/t;

    const-string v1, "LOG_ENVIRONMENT_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LS5/t;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS5/t;->D:LS5/t;

    new-instance v0, LS5/t;

    const-string v1, "LOG_ENVIRONMENT_AUTOPUSH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, LS5/t;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS5/t;->E:LS5/t;

    new-instance v0, LS5/t;

    const-string v1, "LOG_ENVIRONMENT_STAGING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, LS5/t;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS5/t;->F:LS5/t;

    new-instance v0, LS5/t;

    const-string v1, "LOG_ENVIRONMENT_PROD"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, LS5/t;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS5/t;->G:LS5/t;

    invoke-static {}, LS5/t;->e()[LS5/t;

    move-result-object v0

    sput-object v0, LS5/t;->H:[LS5/t;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LS5/t;->C:I

    return-void
.end method

.method private static final synthetic e()[LS5/t;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LS5/t;

    sget-object v1, LS5/t;->D:LS5/t;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LS5/t;->E:LS5/t;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LS5/t;->F:LS5/t;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LS5/t;->G:LS5/t;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LS5/t;
    .locals 1

    const-class v0, LS5/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LS5/t;

    return-object p0
.end method

.method public static values()[LS5/t;
    .locals 1

    sget-object v0, LS5/t;->H:[LS5/t;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LS5/t;

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, LS5/t;->C:I

    return v0
.end method
