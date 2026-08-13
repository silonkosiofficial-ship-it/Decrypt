.class public final enum Li4/C;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum D:Li4/C;

.field public static final enum E:Li4/C;

.field public static final enum F:Li4/C;

.field private static final synthetic G:[Li4/C;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Li4/C;

    const-string v1, "GOOGLE_ANALYTICS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Li4/C;-><init>(Ljava/lang/String;II)V

    sput-object v0, Li4/C;->D:Li4/C;

    new-instance v1, Li4/C;

    const-string v3, "GOOGLE_SIGNAL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Li4/C;-><init>(Ljava/lang/String;II)V

    sput-object v1, Li4/C;->E:Li4/C;

    new-instance v3, Li4/C;

    const-string v5, "SGTM"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Li4/C;-><init>(Ljava/lang/String;II)V

    sput-object v3, Li4/C;->F:Li4/C;

    const/4 v5, 0x3

    new-array v5, v5, [Li4/C;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Li4/C;->G:[Li4/C;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Li4/C;->C:I

    return-void
.end method

.method public static values()[Li4/C;
    .locals 1

    sget-object v0, Li4/C;->G:[Li4/C;

    invoke-virtual {v0}, [Li4/C;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li4/C;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Li4/C;->C:I

    return v0
.end method
