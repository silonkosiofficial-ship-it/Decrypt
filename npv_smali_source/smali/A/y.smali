.class public final enum LA/y;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LA/y;

.field public static final enum D:LA/y;

.field private static final synthetic E:[LA/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LA/y;

    const-string v1, "Min"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LA/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA/y;->C:LA/y;

    new-instance v0, LA/y;

    const-string v1, "Max"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LA/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA/y;->D:LA/y;

    invoke-static {}, LA/y;->e()[LA/y;

    move-result-object v0

    sput-object v0, LA/y;->E:[LA/y;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LA/y;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LA/y;

    sget-object v1, LA/y;->C:LA/y;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LA/y;->D:LA/y;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LA/y;
    .locals 1

    const-class v0, LA/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LA/y;

    return-object p0
.end method

.method public static values()[LA/y;
    .locals 1

    sget-object v0, LA/y;->E:[LA/y;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LA/y;

    return-object v0
.end method
