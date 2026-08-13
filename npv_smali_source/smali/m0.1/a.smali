.class public final enum Lm0/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Lm0/a;

.field public static final enum D:Lm0/a;

.field public static final enum E:Lm0/a;

.field public static final enum F:Lm0/a;

.field private static final synthetic G:[Lm0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm0/a;

    const-string v1, "None"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm0/a;->C:Lm0/a;

    new-instance v0, Lm0/a;

    const-string v1, "Cancelled"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lm0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm0/a;->D:Lm0/a;

    new-instance v0, Lm0/a;

    const-string v1, "Redirected"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lm0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm0/a;->E:Lm0/a;

    new-instance v0, Lm0/a;

    const-string v1, "RedirectCancelled"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lm0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm0/a;->F:Lm0/a;

    invoke-static {}, Lm0/a;->e()[Lm0/a;

    move-result-object v0

    sput-object v0, Lm0/a;->G:[Lm0/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lm0/a;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lm0/a;

    sget-object v1, Lm0/a;->C:Lm0/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lm0/a;->D:Lm0/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lm0/a;->E:Lm0/a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lm0/a;->F:Lm0/a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lm0/a;
    .locals 1

    const-class v0, Lm0/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm0/a;

    return-object p0
.end method

.method public static values()[Lm0/a;
    .locals 1

    sget-object v0, Lm0/a;->G:[Lm0/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm0/a;

    return-object v0
.end method
