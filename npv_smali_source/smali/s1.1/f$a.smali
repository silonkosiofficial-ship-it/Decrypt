.class final enum Ls1/f$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "a"
.end annotation


# static fields
.field public static final enum C:Ls1/f$a;

.field public static final enum D:Ls1/f$a;

.field public static final enum E:Ls1/f$a;

.field public static final enum F:Ls1/f$a;

.field public static final enum G:Ls1/f$a;

.field public static final enum H:Ls1/f$a;

.field public static final enum I:Ls1/f$a;

.field public static final enum J:Ls1/f$a;

.field private static final synthetic K:[Ls1/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Ls1/f$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ls1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls1/f$a;->C:Ls1/f$a;

    new-instance v1, Ls1/f$a;

    const-string v3, "HORIZONTAL_DIMENSION"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ls1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ls1/f$a;->D:Ls1/f$a;

    new-instance v3, Ls1/f$a;

    const-string v5, "VERTICAL_DIMENSION"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ls1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ls1/f$a;->E:Ls1/f$a;

    new-instance v5, Ls1/f$a;

    const-string v7, "LEFT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ls1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ls1/f$a;->F:Ls1/f$a;

    new-instance v7, Ls1/f$a;

    const-string v9, "RIGHT"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Ls1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v7, Ls1/f$a;->G:Ls1/f$a;

    new-instance v9, Ls1/f$a;

    const-string v11, "TOP"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Ls1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v9, Ls1/f$a;->H:Ls1/f$a;

    new-instance v11, Ls1/f$a;

    const-string v13, "BOTTOM"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Ls1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v11, Ls1/f$a;->I:Ls1/f$a;

    new-instance v13, Ls1/f$a;

    const-string v15, "BASELINE"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Ls1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v13, Ls1/f$a;->J:Ls1/f$a;

    const/16 v15, 0x8

    new-array v15, v15, [Ls1/f$a;

    aput-object v0, v15, v2

    aput-object v1, v15, v4

    aput-object v3, v15, v6

    aput-object v5, v15, v8

    aput-object v7, v15, v10

    aput-object v9, v15, v12

    const/4 v0, 0x6

    aput-object v11, v15, v0

    aput-object v13, v15, v14

    sput-object v15, Ls1/f$a;->K:[Ls1/f$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ls1/f$a;
    .locals 1

    const-class v0, Ls1/f$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls1/f$a;

    return-object p0
.end method

.method public static values()[Ls1/f$a;
    .locals 1

    sget-object v0, Ls1/f$a;->K:[Ls1/f$a;

    invoke-virtual {v0}, [Ls1/f$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls1/f$a;

    return-object v0
.end method
