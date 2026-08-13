.class final enum Lha/j$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lha/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field public static final enum D:Lha/j$a;

.field public static final enum E:Lha/j$a;

.field public static final enum F:Lha/j$a;

.field public static final enum G:Lha/j$a;

.field private static final synthetic H:[Lha/j$a;


# instance fields
.field C:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lha/j$a;

    const-string v1, "DEBUG"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lha/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lha/j$a;->D:Lha/j$a;

    new-instance v0, Lha/j$a;

    const-string v1, "INFO"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lha/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lha/j$a;->E:Lha/j$a;

    new-instance v0, Lha/j$a;

    const-string v1, "WARN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lha/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lha/j$a;->F:Lha/j$a;

    new-instance v0, Lha/j$a;

    const-string v1, "ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lha/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lha/j$a;->G:Lha/j$a;

    invoke-static {}, Lha/j$a;->e()[Lha/j$a;

    move-result-object v0

    sput-object v0, Lha/j$a;->H:[Lha/j$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lha/j$a;->C:I

    return-void
.end method

.method private static synthetic e()[Lha/j$a;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lha/j$a;

    sget-object v1, Lha/j$a;->D:Lha/j$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lha/j$a;->E:Lha/j$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lha/j$a;->F:Lha/j$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lha/j$a;->G:Lha/j$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lha/j$a;
    .locals 1

    const-class v0, Lha/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lha/j$a;

    return-object p0
.end method

.method public static values()[Lha/j$a;
    .locals 1

    sget-object v0, Lha/j$a;->H:[Lha/j$a;

    invoke-virtual {v0}, [Lha/j$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lha/j$a;

    return-object v0
.end method
