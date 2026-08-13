.class public final enum Lb1/v;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Lb1/v;

.field public static final enum D:Lb1/v;

.field private static final synthetic E:[Lb1/v;

.field private static final synthetic F:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lb1/v;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb1/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb1/v;->C:Lb1/v;

    new-instance v0, Lb1/v;

    const-string v1, "BOUNDS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lb1/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb1/v;->D:Lb1/v;

    invoke-static {}, Lb1/v;->e()[Lb1/v;

    move-result-object v0

    sput-object v0, Lb1/v;->E:[Lb1/v;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lb1/v;->F:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lb1/v;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lb1/v;

    sget-object v1, Lb1/v;->C:Lb1/v;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lb1/v;->D:Lb1/v;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lb1/v;
    .locals 1

    const-class v0, Lb1/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb1/v;

    return-object p0
.end method

.method public static values()[Lb1/v;
    .locals 1

    sget-object v0, Lb1/v;->E:[Lb1/v;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb1/v;

    return-object v0
.end method
