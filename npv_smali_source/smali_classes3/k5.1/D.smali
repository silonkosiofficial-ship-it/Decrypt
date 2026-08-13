.class public final enum Lk5/D;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum D:Lk5/D;

.field public static final enum E:Lk5/D;

.field public static final enum F:Lk5/D;

.field public static final enum G:Lk5/D;

.field private static final synthetic H:[Lk5/D;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk5/D;

    const-string v1, "DEVELOPER"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lk5/D;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk5/D;->D:Lk5/D;

    new-instance v0, Lk5/D;

    const-string v1, "USER_SIDELOAD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lk5/D;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk5/D;->E:Lk5/D;

    new-instance v0, Lk5/D;

    const-string v1, "TEST_DISTRIBUTION"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lk5/D;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk5/D;->F:Lk5/D;

    new-instance v0, Lk5/D;

    const-string v1, "APP_STORE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v3, v2}, Lk5/D;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk5/D;->G:Lk5/D;

    invoke-static {}, Lk5/D;->e()[Lk5/D;

    move-result-object v0

    sput-object v0, Lk5/D;->H:[Lk5/D;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lk5/D;->C:I

    return-void
.end method

.method private static synthetic e()[Lk5/D;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lk5/D;

    sget-object v1, Lk5/D;->D:Lk5/D;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lk5/D;->E:Lk5/D;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lk5/D;->F:Lk5/D;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lk5/D;->G:Lk5/D;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static g(Ljava/lang/String;)Lk5/D;
    .locals 0

    .prologue
    if-eqz p0, :cond_0

    sget-object p0, Lk5/D;->G:Lk5/D;

    goto :goto_0

    :cond_0
    sget-object p0, Lk5/D;->D:Lk5/D;

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lk5/D;
    .locals 1

    const-class v0, Lk5/D;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk5/D;

    return-object p0
.end method

.method public static values()[Lk5/D;
    .locals 1

    sget-object v0, Lk5/D;->H:[Lk5/D;

    invoke-virtual {v0}, [Lk5/D;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk5/D;

    return-object v0
.end method


# virtual methods
.method public i()I
    .locals 1

    iget v0, p0, Lk5/D;->C:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lk5/D;->C:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
