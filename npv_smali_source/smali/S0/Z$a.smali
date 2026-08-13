.class final enum LS0/Z$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS0/Z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field public static final enum C:LS0/Z$a;

.field public static final enum D:LS0/Z$a;

.field public static final enum E:LS0/Z$a;

.field public static final enum F:LS0/Z$a;

.field private static final synthetic G:[LS0/Z$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS0/Z$a;

    const-string v1, "StartInput"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LS0/Z$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS0/Z$a;->C:LS0/Z$a;

    new-instance v0, LS0/Z$a;

    const-string v1, "StopInput"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LS0/Z$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS0/Z$a;->D:LS0/Z$a;

    new-instance v0, LS0/Z$a;

    const-string v1, "ShowKeyboard"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LS0/Z$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS0/Z$a;->E:LS0/Z$a;

    new-instance v0, LS0/Z$a;

    const-string v1, "HideKeyboard"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LS0/Z$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS0/Z$a;->F:LS0/Z$a;

    invoke-static {}, LS0/Z$a;->e()[LS0/Z$a;

    move-result-object v0

    sput-object v0, LS0/Z$a;->G:[LS0/Z$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LS0/Z$a;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LS0/Z$a;

    sget-object v1, LS0/Z$a;->C:LS0/Z$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LS0/Z$a;->D:LS0/Z$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LS0/Z$a;->E:LS0/Z$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LS0/Z$a;->F:LS0/Z$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LS0/Z$a;
    .locals 1

    const-class v0, LS0/Z$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LS0/Z$a;

    return-object p0
.end method

.method public static values()[LS0/Z$a;
    .locals 1

    sget-object v0, LS0/Z$a;->G:[LS0/Z$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LS0/Z$a;

    return-object v0
.end method
