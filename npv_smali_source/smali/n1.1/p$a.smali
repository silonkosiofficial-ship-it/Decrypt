.class public final enum Ln1/p$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum C:Ln1/p$a;

.field public static final enum D:Ln1/p$a;

.field public static final enum E:Ln1/p$a;

.field public static final enum F:Ln1/p$a;

.field private static final synthetic G:[Ln1/p$a;

.field private static final synthetic H:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln1/p$a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln1/p$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln1/p$a;->C:Ln1/p$a;

    new-instance v0, Ln1/p$a;

    const-string v1, "START"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln1/p$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln1/p$a;->D:Ln1/p$a;

    new-instance v0, Ln1/p$a;

    const-string v1, "END"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln1/p$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln1/p$a;->E:Ln1/p$a;

    new-instance v0, Ln1/p$a;

    const-string v1, "CENTER"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln1/p$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln1/p$a;->F:Ln1/p$a;

    invoke-static {}, Ln1/p$a;->e()[Ln1/p$a;

    move-result-object v0

    sput-object v0, Ln1/p$a;->G:[Ln1/p$a;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Ln1/p$a;->H:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Ln1/p$a;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ln1/p$a;

    sget-object v1, Ln1/p$a;->C:Ln1/p$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ln1/p$a;->D:Ln1/p$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ln1/p$a;->E:Ln1/p$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ln1/p$a;->F:Ln1/p$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln1/p$a;
    .locals 1

    const-class v0, Ln1/p$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln1/p$a;

    return-object p0
.end method

.method public static values()[Ln1/p$a;
    .locals 1

    sget-object v0, Ln1/p$a;->G:[Ln1/p$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln1/p$a;

    return-object v0
.end method
